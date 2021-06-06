package kr.co.velnova.cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 URI 경로 허용
                .allowedOrigins("http://localhost:9090") // 해당 주소에서 들어오는 출처만 허용. 모든 출처 혀용할 시 "*"
                .allowedHeaders("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS") // 해당 Method 허용
                .allowedHeaders("Content-Type") // Content-Type 전체 허용
                .maxAge(3600); // 설정을 하지 않을 경우 cache 되는 기본 시간은 30분, 지금은 1시간 설정
    }
}
