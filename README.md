# 小喔 - 用户中心项目

> 作者：[小喔](https://github.com/Lucrativewu)


## 项目简介

一个企业中最最最常用的系统 —— `用户中心` ，说白了，就是一个简单的 “用户管理系统” ，实现了用户注册、登录、查询等基础功能。如图：

虽然系统逻辑和功能并不复杂，代码量也不多，但是正因如此，大家才不需要关注特定的、复杂的业务流程，可以更轻松地学习到 **通用的技术和做项目的经验** 。

## 技术选型

### 前端

主要运用阿里 Ant Design 生态：

- HTML + CSS + JavaScript 三件套
- React 开发框架
- Ant Design Pro 项目模板
- Ant Design 端组件库
- Umi 开发框架
- Umi Request 请求库



### 后端

- Java 编程语言
- Spring + SpringMVC + SpringBoot 框架
- MyBatis + MyBatis Plus 数据访问框架
- MySQL 数据库
- jUnit 单元测试库



### 部署

- 单机部署
- Nginx
- 容器
## 项目大纲
1. 项目简介和计划
2. 企业做项目完整流程介绍
3. 需求分析
4. 技术选型（各技术作用讲解）
5. 前端项目初始化
    1. 框架及项目目录介绍
    2. 组件引入
    3. 框架瘦身
6. 后端项目初始化
    1. 3 种初始化 Java 项目的方式
    2. 环境搭建（比如 MySQL 安装）
    3. SpringBoot 整合 SSM、MyBatis 框架
    4. 项目分层介绍
7. 数据库表设计
8. 注册功能
    1. 详细设计
    2. 前端开发
        1. 快速页面开发
        2. 表单组件使用
    3. 后端开发
        1. 代码生成器的使用
        2. 接口、业务逻辑开发
        3. 单元测试
        4. API 接口测试
9. 登录功能
    1. 详细设计
    2. 前端开发
        1. 登录态管理
        2. 请求库的使用
        3. 页面开发及验证
    3. 后端开发
        1. 登录态管理（Cookie 和 Session）
        2. 接口开发及测试
    4. 前后端交互
    5. 代理知识讲解
        1. 正向代理
        2. 反向代理
        3. 如何开启本地代理
10. 用户管理
    1. 前端开发
    2. 后端开发
11. 用户注销功能
    1. 前端开发
    2. 后端开发
12. 前端代码优化
    1. 全局请求响应拦截器的封装
    2. 友好提示
13. 后端代码优化
    1. 通用返回对象
    2. 自定义异常及错误码
    3. 全局异常处理器
    4. 补充用户校验
14. 项目部署
    1. 多环境理论及实战
    2. 四种部署方式实战
        1. 原始前端 Nginx / 后端 SpringBoot 部署
        2. 宝塔 Linux
        3. Docker 容器（常用命令全部演示）
        4. 容器平台
15. 项目上线
    1. 域名解析
    2. 跨域问题解决（3 种思路）