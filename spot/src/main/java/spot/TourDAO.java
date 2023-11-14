package spot;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TourDAO {
    private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String jdbcUsername = "project1";
    private static final String jdbcPassword = "123456";

    public TourDAO() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Tour> getAllTours() {
        List<Tour> tours = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            String sql = "SELECT * FROM tour";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int tour_id = resultSet.getInt("tour_id");
                String user_id = resultSet.getString("user_id");
                int city_id = resultSet.getInt("city_id");
                String tour_name = resultSet.getString("tour_name");
                String tour_location = resultSet.getString("tour_location");
                String tour_phone = resultSet.getString("tour_phone");
                String tour_time = resultSet.getString("tour_time");
                String tour_date = resultSet.getString("tour_date");
                int tour_like = resultSet.getInt("tour_like");
                String tour_comment = resultSet.getString("tour_comment");
                Blob blob = resultSet.getBlob("tour_img");
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                Tour tour = new Tour(tour_id, user_id, city_id, tour_name, tour_location, tour_phone, tour_time,
                        tour_date, tour_like, tour_comment, blob);

                tours.add(tour);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tours;
    }

    public void insertTour(Tour tour) {
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            String sql = "INSERT INTO TOUR(TOUR_ID, USER_ID, CITY_ID, TOUR_NAME, TOUR_LOCATION, TOUR_PHONE, TOUR_TIME, TOUR_DATE, TOUR_COMMENT, TOUR_IMG)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, tour.getTour_id());
            ps.setString(2, tour.getUser_id());
            ps.setInt(3, tour.getCity_id());
            ps.setString(4, tour.getTour_name());
            ps.setString(5, tour.getTour_location());
            ps.setString(6, tour.getTour_phone());
            ps.setString(7, tour.getTour_time());
            ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
            ps.setString(9, tour.getTour_comment());
            ps.setBlob(10, tour.getTour_img().getBinaryStream(), tour.getTour_img().length());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
