package org.example.fsinternship.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())   // disable CSRF for Postman
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/students/**").permitAll()  // allow /students
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()); // ✅ updated for Spring Security 6

        return http.build();
    }
}