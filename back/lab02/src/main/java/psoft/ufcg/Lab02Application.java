package psoft.ufcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import psoft.ufcg.filters.TokenFilter;

@SpringBootApplication
public class Lab02Application {

	@Bean
	public FilterRegistrationBean<TokenFilter> filterJwt() {
		FilterRegistrationBean<TokenFilter> filterRB = new FilterRegistrationBean<TokenFilter>();
		filterRB.setFilter(new TokenFilter());
		filterRB.addUrlPatterns("/api/disciplinas/likes/*", "/api/disciplinas/nota/*", "/api/disciplinas/comentarios/*",
				"/auth/usuarios");
		return filterRB;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Lab02Application.class, args);
	}

}
