### 參數化設置:

設置 root path:

1. 修改 application.properties

`
server.servlet.context-path=/demo1
`

2. 透過 command line parameter

`
java -jar build/libs/demo1-0.0.1-SNAPSHOT.jar --server.servlet.context-path=/demo2
`

3. 環境變數

`
環境變數 SERVER_SERVLET_CONTEXT_PATH=/demo3
`