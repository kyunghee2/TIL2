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

![1575206453304](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575206453304.png)
- Next
![1575206533066](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575206533066.png)
- 시스템 Path에 설정 체크박스 체크
![1575206560216](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575206560216.png)
- 기본포트 6379, 윈도우즈 방화벽에 예외처리체크박스 체크
![1575206579880](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575206579880.png)
- Redis 서버가 사용할 수 있는 최대 메모리 크기 설정
![1575206621038](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575206621038.png)

- 설치가 완료되면 아래와 같은 파일을 확인 할 수 있다
  - redis.windows.conf 파라메터 파일
  - redis-server.exe 인스턴스 시작 실행 파일

![1575207046803](C:\Users\kyung\AppData\Roaming\Typora\typora-user-images\1575207046803.png)