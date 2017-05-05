package com.sfq;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MUserDetailsService implements UserDetailsService {

	/**
	 * �����û��������û������Ȩ����Ϣ
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO ���ݿ��ѯ�û���Ϣ�����ݿ���Ϣ

		// ģ�⹹�����룬�˴�Ӧ�����ݿ��ѯ
		String password = username;
		// ģ�⹹��Ȩ�ޣ��˴�Ӧ�����ݿ��ѯ
		Set<MGrantedAuthority> authorities = new HashSet<MGrantedAuthority>();
		authorities.add(new MGrantedAuthority("ROLE_USER"));
		authorities.add(new MGrantedAuthority("ROLE_ADMIN"));
		// �����û���Ϣ
		MUserDetails userDetails = new MUserDetails(username, password, authorities);
		// �����û���Ϣ
		return userDetails;
	}
}
