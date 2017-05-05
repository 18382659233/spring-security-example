package com.sfq;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MUserDetails implements UserDetails {
	// �û���
	private String username;
	// ����
	private String password;
	// Ȩ�޼���
	private Set<MGrantedAuthority> authorities;

	/**
	 * ���캯��
	 * 
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public MUserDetails(String username, String password, Set<MGrantedAuthority> authorities) {

		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	// �˻��Ƿ�û�й���
	public boolean isAccountNonExpired() {
		return true;
	}

	// �˻��Ƿ�û�б���
	public boolean isAccountNonLocked() {
		return true;
	}

	// �ʸ��Ƿ�û�й���
	public boolean isCredentialsNonExpired() {
		return true;
	}

	// ���û���Ϣ�Ƿ����
	public boolean isEnabled() {
		return true;
	}
}
