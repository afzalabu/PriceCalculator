package com.cts.demo;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		
		lci.setParamName("lang");
		
		return lci;
		
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		
		SessionLocaleResolver slr = new SessionLocaleResolver();
		
		slr.setDefaultLocale(Locale.US);
		
		return slr;
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(localeChangeInterceptor());
		
	}
	
	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean(MessageSource messageSource) {
		
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		
		bean.setValidationMessageSource(messageSource);
		
		return bean;
		
	}
	
}
