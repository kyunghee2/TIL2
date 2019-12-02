## Redis(Remote Directory System)

- 키밸류(KeyValue) 데이터베이스로 분류되는 NoSQL이며, 2009년 Salvatore Sanfilippo가 처음 개발

  2005년 부터 RedisLabs co.에 의해 상용 SW가 개발되어 지원되고 있다

- 키밸류 DB이면서 In Memory 기반의 데이터 처리 및 저장 기술을 제공하기 때문에 상대적으로 빠른 Read/Write가 가능

- String, Set, Sorted Set, Hash, List, HyperLog유형의 데이터를 저장가능

- Master/Slave Replication 기능을 통해 데이터 분산, 복제 기능을 제공하며 Query Off Loading기능을 통해 Master는 Read/Write를 수행하고 Slave는 Read만 수행할 수 있다

- 파티셔닝을 통해 동적인 스케일 아웃(Scale Out)인 수평 확장이 가능하다

- Expriation기능은 일정 시간이 지났을 때 메모리 상의 데이터를 자동 삭제 할 수 있다



### Redis 설치(Linux)

Download, extract and compile Redis with:

```
$ wget http://download.redis.io/releases/redis-5.0.7.tar.gz
$ tar xzf redis-5.0.7.tar.gz
$ cd redis-5.0.7
$ make
```

The binaries that are now compiled are available in the `src` directory. Run Redis with:

```
$ src/redis-server
```

You can interact with Redis using the built-in client:

```
$ src/redis-cli
redis> set foo bar
OK
redis> get foo
"bar"
```

## Redis 설치(Window)

- https://github.com/microsoftarchive/redis/releases 사이트에서 
- Redis-x64-3.2.100.msi Window용 다운로드 및 설치

![1575206453304](./md_img/1575206453304.png)

- Next 

![1575206533066](./md_img/1575206533066.png)

- 시스템 Path에 설정 체크박스 체크

![1575206560216](./md_img/1575206560216.png)

- 기본포트 6379, 윈도우즈 방화벽에 예외처리체크박스 체크

![1575206579880](./md_img/1575206579880.png)

- Redis 서버가 사용할 수 있는 최대 메모리 크기 설정

![1575206621038](./md_img/1575206621038.png)

- 설치가 완료되면 아래와 같은 파일을 확인 할 수 있다
  - redis.windows.conf 파라메터 파일
  - redis-server.exe 인스턴스 시작 실행 파일

![1575207046803](./md_img/1575207046803.png)

## Redis 시작과 종료(Linux)

- Redis Server 시작

```bash
$ cd /home/redis/src
$ ./redis-server redis_5000.conf
```

- Redis Client 실행 및 종료

```bash
$ cd /home/redis/src
$ ./redis-cli -p 5000 #port 5000으로 redis 서버 접속

#종료
120.0.0.1:5000 > shutdown
```



## Redis 시작과 종료(Window)

#### redis 서버 서비스로 등록

- 관리자 권한으로 Redis 폴더내에서 명령프롬프트(cmd.exe) 실행

```bash
#파일명변경
\path\to\Redis> move redis.windows-service.conf redis.conf
#Redis 서버를 시작하는 작업이 윈도우 서버가 시작될때 마다 자동으로 실행되도록 등록
\path\to\Redis> redis-server --service-install redis.conf --service-name redis6379
```

- 작업관리자 - 서비스텝에서 확인가능

![1575285205883](md_img/1575285205883.png)

- 제어판 - 서비스 에서 확인가능

![1575285249180](md_img/1575285249180.png)

#### redis-cli를 통해 Redis 서버 접속

```
\path\to\Redis> redis-cli -p 6379
```

![1575285920669](md_img/1575285920669.png)

- 명령어 목록 https://redis.io/commands 참고

## Redis 명령어

- 데이터 입력/수정/삭제/조회
  - set : 데이터를 저장할 때(key, value)
  - get : 저장된 데이터를 검색할 때
  - rename : 저장된 데이터 값을 변경할 때
  - rendomkey : 저장된 key 중에 하나의 key를 랜덤하게 검색할 때
  - keys : 저장된 모든 key를 검색할 때
  - exits : 검색 대상 key가 존재하는지 여부를 확인 할 때
  - mset/ mget : 여러개의 key와 value를 한 번 저장하고 검색할 때

