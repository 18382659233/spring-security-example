package com.sfq;

import org.springframework.security.core.GrantedAuthority;

public class MGrantedAuthority implements GrantedAuthority {

	// Ȩ����Ϣ
	private String authority;

	/**
	 * ���캯��
	 * 
	 * @param authority
	 */
	public MGrantedAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * ��ȡȨ����Ϣ
	 */
	public String getAuthority() {
		return authority;
	}
}
