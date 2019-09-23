package assignment.ruchineth.sms.service;

import assignment.ruchineth.sms.model.AuthUserDetail;
import assignment.ruchineth.sms.model.User;
import assignment.ruchineth.sms.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser=userDetailsRepository.findByUsername(name);
        optionalUser.orElseThrow(()->new UsernameNotFoundException("Username or Password wrong"));

        UserDetails userDetails=new AuthUserDetail(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
