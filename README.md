# 🤌介绍
**一个以丰富学生生活的校园购物项目**。
总体分为前台购物模块和后台数据管理模块。基于SpringBoot + Mybatis + SpringCloud + SpringCloudAlibaba + MySQL + Redis + RabbitMQ + Nginx +ES等实现，Nginx实现反向代理和动静分离，采用Docker容器化部署。 
前台系统包括：用户登录、注册、商品搜索、商品详情、购物车、下订单流程、抢购活动等模块。 
后台管理系统包括：商品系统、优惠营销、库存系统、订单系统等模块。
# 👏项目亮点
*使用Nginx搭建域名环境，实现动静分离、负载均衡，优化了首页数据获取，网页的响应速度提高 50%。 
*使用Redis实现了高频信息缓存，加快了请求响应速度，降低了90%以上的数据库压力，解决了缓存雪 崩、击穿、穿透、数据不一致问题。 
*抢购商品模块采用 Redis 存储数据信息，通过使用 Redis 来提升用户请求抢购商品的速度和解决幂等性 问题，将 QPS 从 180 提升到 1200。 
*使用RabbitMQ的队列机制进行削峰，缓解了高并发情况下的资源短缺，也解决了分布式事务，保证事 务达到最终一致性。 
*使用线程池、CompletableFuture异步编排技术异步执行任务，将任务执行速度提高了50%。 
*使用Redisson实现分布式锁，和限流操作，更好的保护系统。 使用Elasticsearch 实现商品内容搜索，相比 MySQL搜索效率提升80%以上。 
*使用SpringSession的解决了分布式Session共享的问题。
# ✍️配置
*Nginx、switchHost配置、Sql语句在config文件夹下。
*本地使用支付模块需要配置内网穿透。
*Redis、Nacos、MySql、
