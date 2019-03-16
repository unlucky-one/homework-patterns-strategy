SpringMVC中DispatcherServlet使用了委派模式。<br>
用户将请求发送给DispatcherServlet，再由DispatcherServlet去委派相关操作到各各实现类中。<br>
![](DispatcherServlet关系图.png)