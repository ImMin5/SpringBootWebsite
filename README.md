# SpringWebsite
## 라이브러리
- spring-boot-starter-web
- spring-boot-starter-thymeleaf
- spring-boot-starter-test

## 웹브라우저에 표시되는 과정
- 웹프라우저에서 내장 tomcat 서버로 요청 -> 스프링에 전달 -> 스프링은 맵핑된 메소드를 호출(return : 템플릿 이름) -> viewResolver(View를 찾아주고 Thymeleaf 템플릿 엔진을 연결시켜줌) -> viewResolver가 전달받은 템플릿이름.html을 찾아서 템플릿엔진에 변환요청 -> 템플릿엔진이 렌더링 후 변환한 html을 웹브라우저에 넘김


## 스프링 빈을 등록하는 방법
- 컴포넌트 스캔과 자동 의존관계 설정 (ex @Component...)
- 자바 코드로 직접 스프링 빈 등록하기




## 인텔리제이 생산성 향상 단축키
- shift + f6 (rename 할때 유용)
- cmd + shift + t (Test 생성시 편리, Test class에서 진행)
- cmd + shift + / (블럭단위 주석처리)
- cmd + option + v (변수 추출하기)
- cmd + r
- cmd + 좌클릭 (클래소 혹은 메소드 정의로 이동)

