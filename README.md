# SpringWebsite
## 라이브러리
- spring-boot-starter-web
- spring-boot-starter-thymeleaf
- spring-boot-starter-test

## 웹브라우저에 표시되는 과정
- 웹프라우저에서 내장 tomcat 서버로 요청 -> 스프링에 전달 -> 스프링은 맵핑된 메소드를 호출(return : 템플릿 이름) -> viewResolver(View를 찾아주고 Thymeleaf 템플릿 엔진을 연결시켜줌) -> viewResolver가 전달받은 템플릿이름.html을 찾아서 템플릿엔진에 변환요청 -> 템플릿엔진이 렌더링 후 변환한 html을 웹브라우저에 넘김




## 인텔리제이 생산성 향상 단축키
- shift + f6 (rename 할때 유용)
- cmd + shif + t (Test 생성시 편리, Test class에서 진행)
- 
