# AOP
관점 지향 프로그래밍

특정 로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어 보고 관점을 기준으로 모듈화

특정 부분을 모듈화하여 비즈니스 로직에서 분리하고 재사용

- Aspect: 관심사를 모듈화. 부가기능 모듈. 핵심기능에 부가되어 의미를 갖는 모듈
- Target: Aspect를 적용. 부가기능을 부여할 대상
- Advice: 실직적으로 어떤일을 해야하는지 부가기능을 담은 구현체
애스팩트가 ‘무엇’을 ‘언제’할 지 정의
- JointPoint: Advice가 적용될 위치, 끼어드는 지점 등등에 적용 가능
- PointCut: JoinPoint의 상세한 스펙 정의

### 참고할 개념
프록시 패턴 기반의 AOP 구현체
빈에만 AOP 적용 가능
Weaving: 지정된 객체에 애스팩트를 적용하여 새로운 프록시 객체를 생성하는 과정.

### 의존성 추가
maven
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```
gradle
```
implementation 'org.springframework.boot:spring-boot-starter-validation'
```
## [어노테이션](https://klyhyeon.tistory.com/74)

#### Aspect

공통 메서드가 있는 클래스의 위치를 스프링에 알림

#### After(”execution…”)

핵심 메소드 종료 후 동작

#### Joinpoint

핵심 메서드가 무엇인지 스프링에게 알려주는 역할을 수행

#### Before

핵심 메서드 실행 전 동작

#### Pointcut

Before 내에 일일이 작성했던 핵심 메서드를 공통 메서드 명을 통해 경로를 한번에 지정할 수 있다

#### Around

핵심 메서드와 공통 메서드의 실행 시점을 자유롭게 설정

ProceedingJoinPoint를 사용하여 .proceed()메서드를 호출

#### AfterReturning

핵심 메서드의 호출이 성공했을 때 반환하는 메서

#### AfterThrowing

핵심 메서드가 호출된 후 예외가 발생했을 때만 실행되는 공통 메서드
예외 syntax가 출력되기 전에 실행됨
