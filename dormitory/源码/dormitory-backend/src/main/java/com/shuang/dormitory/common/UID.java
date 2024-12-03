package com.shuang.dormitory.common;

import java.util.UUID;

/**
 * uuid
 *
 */
public class UID {
    public String produceUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
