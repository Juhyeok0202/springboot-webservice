package com.cotato.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 각 사용자의 권한을 관리할 Enum클래스 Role
 */
@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
