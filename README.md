# Max-Threads-Handle
Max Threads in Java Springboot (Xử lý luồng đồng thời trong Java Springboot)

1. Apache Tomcat:
Loại máy chủ: Servlet container (và cả JSP container). Tạo ra bởi Apache Foundation. 
Mục đích sử dụng: Tomcat thích hợp cho các ứng dụng web Java thông thường, đặc biệt là những ứng dụng được phát triển bằng các công nghệ như Servlet và JSP. Nó là một lựa chọn phổ biến và được sử dụng rộng rãi trong cộng đồng Java.
2. Eclipse Jetty:
Loại máy chủ: Servlet container (cũng là HTTP server). Tạo ra bởi Eclipse Foundation. 
Mục đích sử dụng: Jetty thích hợp cho các ứng dụng nhẹ, tương tự như Tomcat, nhưng nó có thể được tích hợp vào các ứng dụng nhỏ hoặc những hệ thống có yêu cầu về tài nguyên thấp. Jetty cũng có thể được sử dụng như một máy chủ nhúng trong ứng dụng Java.
3. Netty:
Một thư viện I/O (không phải là server servlet container). Do một nhóm tình nguyện viên viết.
Mục đích sử dụng: Netty thích hợp cho các ứng dụng có yêu cầu về xử lý I/O mạnh mẽ và hiệu suất cao. Không giống như Tomcat và Jetty, Netty không phải là một servlet container, mà là một thư viện tập trung vào việc xử lý sự kiện I/O không đồng bộ, thích hợp cho các ứng dụng mạng có hiệu suất cao như máy chủ game, máy chủ chat, hay ứng dụng phân tán.
Khi Nào Sử Dụng:
Chọn Tomcat hoặc Jetty nếu:
Bạn đang phát triển ứng dụng web Java truyền thống sử dụng Servlet và JSP.
Bạn cần một servlet container đơn giản và dễ triển khai.
Chọn Netty nếu:
Bạn có yêu cầu về hiệu suất cao, đặc biệt là trong các ứng dụng mạng không đồng bộ.
Bạn muốn tận dụng sức mạnh của thư viện I/O linh hoạt và mạnh mẽ của Netty.
Lưu ý rằng quyết định chọn máy chủ còn phụ thuộc vào yêu cầu cụ thể của ứng dụng, và nó có thể thay đổi dựa trên các tính năng, hiệu suất, và khả năng tích hợp khác nhau của mỗi máy chủ.

Tomcat và Jetty là hai máy chủ web và servlet container phổ biến trong cộng đồng Java, và cả hai đều cung cấp cách triển khai ứng dụng Java EE. Dưới đây là một so sánh về cách triển khai ứng dụng trên Tomcat và Jetty:
Triển Khai Ứng Dụng Trên Tomcat:
War File:
Phổ biến nhất, ứng dụng Java EE thường được đóng gói thành một file WAR (Web Application Archive).
Tomcat hỗ trợ triển khai ứng dụng từ file WAR. Bạn có thể đặt file WAR trong thư mục webapps của Tomcat hoặc triển khai từ giao diện quản lý Tomcat.
Context Configuration:
Bạn có thể cấu hình context thông qua tệp context.xml hoặc thông qua các thiết lập trong tệp server.xml của Tomcat.
Các tùy chọn cấu hình cung cấp quyền kiểm soát lớn về cách ứng dụng được triển khai và cấu hình.
Triển Khai Ứng Dụng Trên Jetty:
Embedded Deployment:
Jetty thường được sử dụng trong môi trường nhúng, nơi bạn tích hợp Jetty trực tiếp vào ứng dụng của mình.
Bạn có thể nhúng Jetty trong mã nguồn của ứng dụng Java và cấu hình nó để phục vụ ứng dụng của bạn.
Jetty Maven Plugin:
Jetty cung cấp một plugin Maven, giúp triển khai ứng dụng một cách dễ dàng trong quá trình phát triển.
Bạn có thể sử dụng Maven để chạy một phiên bản nhúng của Jetty để phục vụ ứng dụng của bạn trong khi bạn đang phát triển.
Jetty XML Configuration:
Bạn có thể sử dụng các tệp cấu hình XML của Jetty để tùy chỉnh việc triển khai ứng dụng, tương tự như cách bạn sử dụng tệp web.xml trong ứng dụng của mình.
Tổng Quan:
Tomcat:
Hỗ trợ triển khai từ file WAR và có thể cấu hình thông qua các tệp cấu hình.
Phổ biến trong triển khai trên môi trường sản xuất.
Jetty:
Thường được sử dụng trong môi trường nhúng và hỗ trợ triển khai nhúng trong mã nguồn của ứng dụng.
Thích hợp cho môi trường phát triển và các kịch bản nhúng.

