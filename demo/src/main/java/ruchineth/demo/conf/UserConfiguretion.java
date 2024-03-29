package ruchineth.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguretion extends GlobalAuthenticationConfigurerAdapter {
    PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Dinushan").password(passwordEncoder.encode("dinushan")).roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and().withUser("Kusal").password(passwordEncoder.encode("kusal")).roles("USER").authorities("CAN_READ").and().withUser("Manitha").password(passwordEncoder.encode("manitha")).roles("USER").authorities("CAN_READ").and().withUser("Lasitha").password(passwordEncoder.encode("lasitha")).roles("USER").authorities("CAN_WRITE").and().withUser("Sadun").password(passwordEncoder.encode("sadun")).roles("USER").authorities("CAN_WRITE");
    }
}
