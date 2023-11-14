 $('.modal').on('click',function(e){
    
                $("#background").fadeIn(200);  
                $("#front").fadeIn(200);  
                $("#post").fadeIn(200); 

               
            });
    
          
           $('#background').click(function(){
            $("#background").fadeOut(200);
            $("#front").fadeOut(200);
            $("#post").fadeOut(200);

           }); 

           $()
