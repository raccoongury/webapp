<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <script type="text/javascript">
     	//스마트 기기에서 접속했을 때 와 그렇지 않을 때
     	//다른 웹 애플리케이션 실행
     	//naver 나 google의 형식
     	
     	//스마트 기기의 운영체제 배열을 생성
     	//안드로이드는 태블릿과 스마트폰을 구분하지 않음
     	//iOS는 ipad 와 다른 기기를 구분합니다.
     	var smarts = ["iphone", "ipod",
     		"android"]
     	//배열을 순회
     	var s = false
     	for(i in smarts){
     		if(
     			navigator.userAgent.toLowerCase()
     			.indexOf(smarts[i]) > -1){
     			s = true;
     			break;
     		}
     	}
     	if(s == true){
     		location.href="https://www.apple.com"
     	}else{
     		location.href="https://www.google.com"
     	}
     
  		 		
    </script>
</body>
</html>