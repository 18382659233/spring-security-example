package com.sfq;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MPasswordEncoder implements PasswordEncoder {

	/**
	 * ��������м��ܲ�����
	 */
	public String encode(CharSequence rawPassword) {

		String encPassword = rawPassword.toString();
		return encPassword;
	}

	/**
	 * ��֤�����Ƿ���ȷ
	 */
	public boolean matches(CharSequence rawPassword, String encodedPassword) {

		return encode(rawPassword).equals(encodedPassword);
	}
}
