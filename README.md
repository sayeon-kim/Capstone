# 욕설 필터링 웹 서비스

## Crawler

네이버, 롤 인벤, 디씨인사이드 댓글을 수집하기 위한 크롤러입니다.

## DeepLearning

욕설 데이터를 학습하고 글이 욕설인지 판별하기 위한 딥 러닝 모델입니다.

## SpringBoot

Spring과 딥 러닝 모델을 연동한 웹 서비스입니다.

 

- 사용자가 댓글을 입력하면 서버가 딥 러닝 모델을 실행하여 판별합니다.
- 욕설이면 댓글을 Blur처리 합니다.
- 사용자에게 신고를 받을수 있습니다. 신고를 받을 때 사용자에게 어떤 단어가 모욕적인지 입력받습니다.
- 관리자는 신고를 확인하거나 거절할 수 있습니다.
- 관리자가 확인하면 해당 댓글은 Blur처리되고 keyword에 등록됩니다.
- keyword에 등록되면 해당 댓글은 욕설 댓글로 판별되어 blur처리 됩니다.
- 이후 관리자는 신고된 댓글들 수집하여 다시 학습 데이터에 추가시켜 모델을 개선할 수 있습니다.