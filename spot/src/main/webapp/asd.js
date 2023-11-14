 $('.modal').on('click',function(e){
    
                $("#background").fadeIn(200);  //배경 레이어
                $("#front").fadeIn(200);  //이미지 레이어
                $("#post").fadeIn(200); //텍스트 레이어

                 /*    
                let img = "<img src='" + src +"'/>"; //이미지 태그 구성 
                $('#front').html(img);
                */
            });
    
            //화면에 표시된 배경 레이어를 클릭한 경우
           $('#background').click(function(){
            $("#background").fadeOut(200);
            $("#front").fadeOut(200);
            $("#post").fadeOut(200);

           }); 

           $()
