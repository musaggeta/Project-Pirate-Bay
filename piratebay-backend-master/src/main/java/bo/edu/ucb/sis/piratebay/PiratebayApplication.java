package bo.edu.ucb.sis.piratebay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class PiratebayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiratebayApplication.class, args);
	}
/*
	@Bean
	simpleCorsFilter(): FilterRegistrationBean<CorsFilter> {
		val source = UrlBasedCorsConfigurationSource();
		val config = CorsConfiguration();
		config.allowCredentials = true
		config.allowedOrigins = listOf("http://localhost:4200")
		config.allowedMethods = listOf("*");
		config.allowedHeaders = listOf("*")
		source.registerCorsConfiguration("/**", config)
		val bean = FilterRegistrationBean(CorsFilter(source))
		bean.order = Ordered.HIGHEST_PRECEDENCE
		return bean
	}
*/

}
