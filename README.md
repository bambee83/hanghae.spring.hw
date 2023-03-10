# hanghae.spring.hw

스프링 주특기 주차 과제  //* src폴더는 주석처리된 복습 폴더입니다 *//

2. 전체 게시글 목록 조회 API
    - 제목, 작성자명, 작성 내용, 작성 날짜를 조회하기
    - 작성 날짜 기준 내림차순으로 정렬하기
3. 게시글 작성 API 
**`월요일 17:00 까지 완료`**
    - 제목, 작성자명, 비밀번호, 작성 내용을 저장하고
    - 저장된 게시글을 Client 로 반환하기
4. 선택한 게시글 조회 API 
    - 선택한 게시글의 제목, 작성자명, 작성 날짜, 작성 내용을 조회하기 
    (검색 기능이 아닙니다. 간단한 게시글 조회만 구현해주세요.)
5. 선택한 게시글 수정 API
**`화요일 17:00까지 완료`**
    - 수정을 요청할 때 수정할 데이터와 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 제목, 작성자명, 작성 내용을 수정하고 수정된 게시글을 Client 로 반환하기
6. 선택한 게시글 삭제 API
**`수요일 17:00까지 완료`**
    - 삭제를 요청할 때 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 선택한 게시글을 삭제하고 Client 로 성공했다는 표시 반환하기
(순차적으로 업로드 예정입니다.)


![image](https://user-images.githubusercontent.com/124007041/221544359-33e6b6e1-b12f-44bd-b3cd-880388b507ad.png)

![image](https://user-images.githubusercontent.com/124007041/221544598-a8ae201a-4544-4c23-b062-110ddffe40d0.png)

![image](https://user-images.githubusercontent.com/124007041/221684069-beecbd2f-8a36-458f-ae7e-e06fea070d12.png)



1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)
2. 어떤 상황에 어떤 방식의 request를 써야하나요?
3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?
4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)
5. API 명세서 작성 가이드라인을 검색하여 직접 작성한 API 명세서와 비교해보세요!
