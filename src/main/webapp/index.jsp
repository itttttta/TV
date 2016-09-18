
<%@ include file="WEB-INF/Common/taglibs.jsp" %>
<html>
<head>
    <meta charset="utf-8">

    <script>


            $(document).ready(function(){
                $("button").click(function(){
                    $("p").hide();
                });
            });

            function textAjax(){
                document.getElementById("demo").innerHTML="textAjax btnClick";

                console.log("textAjax btnClick");
                window.println("textAjax btnClick")
                $.ajax({
                    type: "GET",
                    url: "http://www.baidu.com",
                    dataType: "json",
                    success: function(data){
                        document.getElementById("demo").innerHTML=data;
                    }
                });
            }


        function displayDate(){
            document.getElementById("demo").innerHTML=Date();
        }



    </script>
</head>

<script src="${ctx}/static/manage/js/common/jquery-2.2.2.js"></script>

<body>
<h2>Hello World!</h2>

<p id="demo">这是一个段落</p>


<button type="button" onclick="textAjax()">textAjaxffdsfsd</button>

<button type="button" onclick="displayDate()">显示日期</button>


<p>enheng</p>
</body>
</html>

