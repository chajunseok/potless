# ⚠️POTLESS(포트리스)⚠️

![weblogo__1_](/readme_image/weblogo__1_.png)

# 💡서비스 소개

### 도로 위 포트홀, 이제는 포트리스로 간편하게 해결하세요!

> 기존의 포트홀 신고 방식은 복잡하고 시간이 많이 소요되며, 시민들과 공무원 모두에게 큰 부담이 되었습니다. 포트리스는 이러한 문제를 해결하기 위해 만들어진 자동 포트홀 신고 및 관리 서비스 입니다.

# 🔎기획배경

- 도로 위 포트홀은 운전자와 보행자의 안전에 큰 위협이 됩니다. 최근 포트홀로 일어나는 사건사고가 많은 반면 포트홀 신고 및 관리 시스템은 미흡하다는 문제점을 안고 있습니다.
- ”포트리스”는 AI기술과 데이터 분석을 통해 포트홀 신고부터 관리까지 한 곳에서 효율적으로 관리하고 신속하게 처리하고자 기획했습니다..

# 📋프로젝트 진행 기간

### ▪️2024.04.08 ~ 2024.05.20

# 🖥️아키텍처

![image__3___1_](/readme_image/image__3___1_.png)

# ⚙️기술스택

### Infra

- Nginx
- Jenkins
- Sonarqube
- Docker
- Docker-Compose
- EC2
- AWS
- Gerrit

### BackEnd

- JAVA 17
- SpringBoot 3.2.3
- MySQL 8.3
- Python 3.9.13
- FastAPI
- YOLO v8

### FrontEnd

- Vue 3.4.21
- Node.js 20.13.1
- Flutter 3.19.5
- Dart 3.3.3

# 🛠️협업 툴

- Git
- Jira
- Notion
- Figma
- ERDcloud
- Webex
- Mattermost

# 📋ERD

![Untitled__4_](/readme_image/Untitled__4_.png)

# 📕주요기능 및 데모영상

### 1. 포트홀 자동 신고 / 수동 신고

- 차량에 비치되어 있는 휴대폰 카메라로 이동하면서 포트홀이 발견되면 자동으로 탐지된다.
- 전화로 포트홀 신고가 들어오는 경우 정보 입력만 하면 자동으로 서버에 등록된다.

![AI](/readme_image/AI.gif)
![image72](/readme_image/image72.gif)

### 2. 보고서 작업지시서 자동 작성

- 작업자들이 작업 중 핸드폰이 보기 어려운 점을 해결하기 위해 포트홀 정보를 PDF로 변환해 프린트가 가능하다.
- 작업완료한 포트홀 보고서를 자동으로 만들 수 있다.

![image68](/readme_image/image68.gif)
![image71](/readme_image/image71.gif)

### 3. 네비게이션 이동경로 포트홀 안내

- 출발지부터 도착지까지 경로에 포트홀이 몇개가 있는지 알 수 있다.

![image67](/readme_image/image67.gif)

### 4. 포트홀 위험도 측정

- 너비를 비율로 측정해 포트홀의 위험도를 측정할 수 있다.

![danger](/readme_image/danger.png)

### 5. 중복신고 방지 및 중복신고 누적

- H3라이브러리를 이용해 중복신고를 방지할 수 있다.
- 똑같은 포트홀에 신고가 누적으로 들어오면 카운트를 통해 공사가 시급한 포트홀이라고 알려준다.

![h3](/readme_image/h3.png)

### 6. 도로파손 데이터 확인 및 통계

- 도로파손 데이터 자세한 정보 및 사진을 확인할 수 있다.
- 도로파손 데이터 시간적/공간적 정보를 그래프 및 차트로 확인해 볼 수 있다.

![image69](/readme_image/image69.gif)
![image70](/readme_image/image70.gif)

# 📚산출물 자료들

- [기능명세서](https://www.notion.so/a4197f6c6e154dfebca83bb7e3aca9f8)
- [API 명세서](https://www.notion.so/204f029c154c46f99567796c1f0051e0?v=9df395477c07459b9d9179bb339b49ed)
- [피그마](https://www.figma.com/design/TyZycvFgMqPHkKx7HOMUej/%ED%95%B4%EB%A6%AC%ED%8F%AC%ED%8A%B8%EC%99%80-%ED%8F%AC%ED%8A%B8%ED%99%80-%EA%B8%B0%EC%82%AC%EB%8B%A8?node-id=0-1&t=9P9iGjyZDkA20edF-1)

# 👨‍👩‍👧‍👧팀 구성

<img src="/readme_image/KakaoTalk_20250316_211645933.jpg" width="80%">
정휘원, 차준석, 이채은, 권준구, 김민건, 최소영, 이희병
