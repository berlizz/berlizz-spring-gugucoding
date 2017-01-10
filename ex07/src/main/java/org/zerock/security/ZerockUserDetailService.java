package org.zerock.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ZerockUserDetailService implements UserDetailsService {

	private static final Logger logger = LoggerFactory.getLogger(ZerockUserDetailService.class);
	
	@Override
	public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {
		logger.info("find......" + userid);
		
		return null;
	}
}
