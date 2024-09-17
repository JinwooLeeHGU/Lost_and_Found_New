<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<
link href ="https: //cdn.jsdelivr.net /npm /bootstrap @5.0.0-beta1 /dist
	/css /bootstrap.min.css " rel ="stylesheet " integrity ="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1
	" crossorigin ="anonymous "> <link rel ="stylesheet "
	href ="https: //maxcdn.bootstrapcdn.com /bootstrap /3.4.1 /css /bootstrap.min.css
	"> <script
	src ="https: //maxcdn.bootstrapcdn.com /bootstrap /3.4.1 /js /bootstrap.min.js
	"> </script>body {
	background-color: white;
	text-align: center;
}

#headername {
	color: navy;
}

#header {
	text-align: left;
}

#Lost {
	color: orange;
}

#Found {
	color: skyblue;
}

.header-searchForm {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	left: 0;
	right: 0;
	right: 0;
}
</style>
</head>

<body>
	<div id="logo_banner"
		style="clear: both; width: 970px; height: 71px; margin: 0px auto; overflow: hidden; padding-top: 5px;">
		<div
			style="float: right; overflow: hidden; width: 700px; /* 이게 원흉이다... position: relative; */ margin-top: 9px">
			<form name="fsearchbox_main" id="fsearchbox_main"
				action="${path}/board/list" method=get
				style='display: inline;'>

				<select name="searchType" id="searchType" style="overflow: hidden; float:left; margin: 13px 10px 0px 0px; height:35px;">
					<option value="all">전체</option>
					<option value="title">제목</option>
					<option value="content">내용</option>
					<option value="writer">작성자</option>
				</select>


				<div
					style="overflow: hidden; width: 350px; margin: 0px auto; margin: 13px 0px 0px 0px; border: 2px solid #8AD1E8;">

					<div
						style="float: left; overflow: hidden; width: 300px; margin: 0px auto; /* padding: 5px 10px 3px 10px; */ background-color: #FFF">

						<div
							style="float: left; overflow: hidden; width: 100%; margin-left: 10px; background-color: #FFF;">
							<input type="text" name="keyword" id="keyword"
								style="width: 100%; height: 100%; border: 0px; outline-width: 0; font-size: 17px; margin-top: 9px; margin-left: 5px;"
								placeholder='검색어를 입력하세요'>
						</div>

						<div style="position: absolute; float: left; z-index: 10000;">


							<!--
                  function SchSug_setcoor(id, url, width) {
                    document
                        .write("<div id=TSchSugBox1 style=\"position:absolute;z-index:1;\">");
                    document
                        .write("<iframe id=ThFrameBox2 name=ThFrameBox2 src='"
                            + url
                            + "?id="
                            + id
                            + "&cat=1|2|3|10|11|12|13|31&hFrame=ThFrameBox2&sform=fsearchbox_main&keytype=review&search_type=&service=&q=&self=/index.php' style='width:"
                            + width
                            + "px;height:550px;display:none;' frameborder=0 scrolling=no></iframe>");
                    document.write("</div>");
                  }

                  SchSug_setcoor('keyword', '/_system/module/ajax_suggest.php',
                      420);
                  document.getElementById("keyword").focus();
                //-->


						</div>
						<a href="my_page"
							style="position: absolute; float: left; margin-left: 70px; margin-top: 10px;">마이페이지</a>
						<a href="add"
							style="position: absolute; float: left; margin-left: 160px; margin-top: 10px;">글쓰기</a>
						<a href="chat_page"
							style="position: absolute; float: left; margin-left: 220px; margin-top: 10px;">채팅하기</a>
						<a href="log_out"
							style="position: absolute; float: left; margin-left: 290px; margin-top: 10px;">로그아웃</a>
					</div>
					<div
						style="float: left; overflow: hidden; background-color: #8AD1E8; height: 39px; width: 46px; padding: 3px 0px 0px 0px">
						<input type=image src="/resources/images/search_icon.png"
							width="44" height="35" align=absmiddle style="">
					</div>
				</div>


			</form>


		</div>

		<div style="float: left; overflow: hidden; margin-top: 20px;"
			OnClick="location.href ='http://localhost:8080/winter/board/list'">
			<!-- <a href="https://www.cetizen.com"><img
				src="https://image2.cetizen.com/CDN/webimage/2007_cetizen/community/topmenu_logo_n.png"
				alt="세티즌 로고 클릭시 홈으로 이동" title="세티즌 로고"
				onerror='document.getElementById("notice_layer").style.display="block"'></a> -->

			<h1 id=headername style="font-size: 35px;">
				<span id="Lost" style="font-size: 35px;">Lost</span> & <span
					id="Found" style="font-size: 35px;">Found</span>
			</h1>
		</div>

	</div>
</body>
</html>