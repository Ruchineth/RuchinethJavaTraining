package com.example.NewProjectAuth.Controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableOAuth2Sso
public class UIController extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();
        http.authorizeRequests().anyRequest().authenticated();
    }

    @RequestMapping(value = "/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping(value = "/report")
    public String loadReport(){
        return "report";
    }
}
