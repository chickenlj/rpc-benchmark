# RPC性能报告
> 生成时间: 2019-05-31T14:39:06.176666<br>
> 运行环境: Linux, Java HotSpot(TM) 64-Bit Server VM 11.0.3+12-LTS<br>
> 启动参数: java -server -Xmx1g -Xms1g -XX:MaxDirectMemorySize=1g -XX:+UseG1GC<br>


## existUser
| framework | thrpt (ops/ms) | avgt (ms) | p90 (ms) | p99 (ms) | p999 (ms) |
|:--- |:---:|:---:|:---:|:---:|:---:|
|dubbo|41.213|0.8|1.011|1.384|3.431|


## createUser
| framework | thrpt (ops/ms) | avgt (ms) | p90 (ms) | p99 (ms) | p999 (ms) |
|:--- |:---:|:---:|:---:|:---:|:---:|
|dubbo|19.296|1.644|2.232|3.293|6.942|


## getUser
| framework | thrpt (ops/ms) | avgt (ms) | p90 (ms) | p99 (ms) | p999 (ms) |
|:--- |:---:|:---:|:---:|:---:|:---:|
|dubbo|20.693|1.563|2.384|3.412|6.373|


## listUser
| framework | thrpt (ops/ms) | avgt (ms) | p90 (ms) | p99 (ms) | p999 (ms) |
|:--- |:---:|:---:|:---:|:---:|:---:|
|dubbo|3.268|9.006|15.303|23.888|36.831|

