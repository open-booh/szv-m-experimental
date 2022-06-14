package org.openbooh.exprerimental.szvm.domain.pfr;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PfrRegistration {

    /**
     * Регистрационный номер ПФР в формате {@code 065-006-118598}
     */
    private final String registrationNumber;

    /**
     * Код территориального органа ПФР (Управление ПФР) в формате {@code 065-006}
     * <p>
     * Почти всегда совпадает с первой частью регистрационного номером в ПФР, но может отличаться.
     * <p>
     * Иногда используется сокращённый вариант, без дефиса - {@code 065-006}
     */
    private final String upfrCode;


    private final String upfrName;
}
