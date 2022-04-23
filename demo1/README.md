### 參數化設置:

#### 設置 root path:

1. 修改 application.properties

`
server.servlet.context-path=/demo1
`

2. 環境變數

`
SERVER_SERVLET_CONTEXT_PATH=/demo3
`

3. 透過 Jvm argument

```
java -jar -Dserver.servlet.context-path=/demo2 build/libs/demo1-0.0.1-SNAPSHOT.jar 
```

4. 透過 command line parameter

`
java -jar build/libs/demo1-0.0.1-SNAPSHOT.jar --server.servlet.context-path=/demo2
`


#### 設置 port:

1. 修改 application.properties

`
server.port=8888
`

2. 環境變數

`
SERVER_PORT=6666
`

3. 透過 Jvm argument

```
java -jar -Dserver.port=7777 build/libs/demo1-0.0.1-SNAPSHOT.jar 
```

4. 透過 command line parameter

```
java -jar build/libs/demo1-0.0.1-SNAPSHOT.jar --server.port=7777
```

透過 Jvm argument 調整 heap size

`
java -jar -Dserver.port=6666 -Xmx4096m -Xms2048m build\libs\demo1-0.0.1-SNAPSHOT.jar
`
