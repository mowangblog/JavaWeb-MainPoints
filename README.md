# JavaWeb
## ✨Java Web 知识点

1. [XML](#Xml)
   - [xml 的主要作用](#xml 的主要作用)
   - [xml 的语法](#xml 的主要作用)
2. [Servlet](#Servlet)
   - [什么是 Servlet](#什么是 Servlet )
   - [ServletConfig](#ServletConfig) 
   - [ServletContext](#ServletContext)
3. Filter
4. Listener
5. JSP
6. JSTL
7. Cookie
8. Session
9. JSON

## Xml

### xml 的主要作用

- 用来保存数据，而且这些数据具有自我描述性 
- 它还可以做为项目或者模块的配置文件 
- 还可以做为网络传输数据的格式（现在一般使用JSON)

### xml 的语法

- 文档声明。 
- 元素（标签） 
- xml 属性 
- xml 注释 
- 文本区域（CDATA 区）

## Servlet

### 什么是 Servlet 

- Servlet 是 JavaEE 规范之一。规范就是接口 
- Servlet 就 JavaWeb 三大组件之一。三大组件分别是：Servlet 程序、Filter 过滤器、Listener 监听器。 
- Servlet 是运行在服务器上的一个 java 小程序，它可以接收客户端发送过来的请求，并响应数据给客户端。

### ServletConfig

- 可以获取 Servlet 程序的别名 servlet-name 的值 
- 获取初始化参数 init-param 
- 获取 ServletContext

### ServletContext

- 获取 web.xml 中配置的上下文参数 context-param
- 获取当前的工程路径，格式: /工程路径
- 获取工程部署后在服务器硬盘上的绝对路径 
- 像 Map 一样存取数据

