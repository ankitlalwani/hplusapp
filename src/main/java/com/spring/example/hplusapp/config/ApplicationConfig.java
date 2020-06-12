package com.spring.example.hplusapp.config;

import com.spring.example.hplusapp.converters.StringToEnumConverter;
import com.spring.example.hplusapp.interceptors.LoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.format.FormatterRegistry;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@ComponentScan(basePackages = "com.spring.example.hplusapp")
public class ApplicationConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("css/**","images/**")
                .addResourceLocations("classpath:/static/css/","classpath:/static/images/");
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    protected void addFormatters(FormatterRegistry registry) {
            registry.addConverter(new StringToEnumConverter());
    }

    @Override
    protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(5000);
        configurer.setTaskExecutor(mvctaskExecuter());
    }

    @Bean
    public AsyncTaskExecutor mvctaskExecuter(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setThreadNamePrefix("hplusapp-thread-");
        return threadPoolTaskExecutor;
    }

    @Bean
    public ResourceBundleViewResolver resourceBundleViewResolver(){
        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
        viewResolver.setBasename("views");
        viewResolver.setOrder(1);
        return viewResolver;
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/*");
    }
}
