# Setuid-Release

1: 프로그램 실행 하기 위해서는 자바가 설치가 되있어야 함.
2: 프로그램에서 Setuid.class가 주 실행 파일 main함수가 존재함.
java Setuid setuid [디렉터리], java -classpath [클래스 파일이 있는 곳] Setuid setuid [디렉터리]
#setuid는 setuid를 찾는 옵션을 지정 한다는 말임.
3:Initialize.class는 프로그램 설정들을 자동 초기화
4:Hit.class 프로그램으로부터 한 작업을 모두 표준 출력(파일 디스크립터 1)

==> Hit.class,Initialize는 사용자가 실행하고 싶을 때 실행하면 됨.

초기환경 설정은 Setuid.class를 실행하면 모든 환경을 구성해 줌.
환경설정 걱정은 안해도 됨. [linux,mac]에서만 호환이 가능.
윈도우는 파일 권한이 존재하지 않기 때문임.

사용자의 홈디렉터리 권한은 777로 설정해주삼.
chmod 777 ~, chmod +r,+w,+x ~

직렬화를 이용해서 객체를 모두 저장 함으로서 프로그램이 실행 중일 때 모든 정보를 저장한다. [로그라는 전혀 다른 개념]
직렬화를 이용하였기 때문에 전에 setuid파일을 찾았다면 setuid파일이 존재하는 디렉터리를 미리 보여 줌.

프로그램은 static이 아니라 dynamic이기 때문에 사용자가 어떻게 입력 하느라 따라서 출력 결과가 달라 짐.

프로그램 약 300줄 짧은 편이라고 생각하지만 비객체지향적으로 하면 약 530줄이 될 것을 객체지향적으로 해서 약 300줄이 된 거임.
만든 목적 : 사실 할 꺼 없어서 함. 
물론 linux/mac find 명령어를 이용하면 금방 찾지만 그런 것 같은 경우에는 명령어에 대한 지식이 있어야 하지만 이 프로그램은 그런 지식이 없이 앞에 있던 사용 방법데로 
실행하면 되기때문에 초보자들이 사용하기 쉽고 또 눈에 들어오게 표준출력에 색깔을 입혀 한 눈에 알아 볼 수 있도록 함.

마지막으로 프로그램이 환경구성을 할 때 만들어지는 디렉터리랑 파일은 직렬화를 이용하기 때문에 그럼.

Initialize.class는 자바 어플리케이션이 사용하고 있는 디렉터리에 문제가 생겼거나 예외가 발생 할 때 실해아면 됨.
또는 프로그램이 사용하는 디렉터리를 지우거나 아니면 외부 파일이 존재해 프로그램의 정상 작동을 하지 않으면 실행 하면 됨.
