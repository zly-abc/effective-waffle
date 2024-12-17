package com.example.common.enums;

public enum SegmentEnum {

    FIRST("第一大节（08:00 ~ 09:45）"),
    SECOND("第二大节（10:15 ~ 12:00）"),
    THIRD("第三大节（14:00 ~ 15:45）"),
    FORTH("第四大节（16:15 ~ 18:00）"),
    FIFTH("第五大节（19:00 ~ 20:45）"),
    ;
    public String segment;

    SegmentEnum(String segment) {
        this.segment = segment;
    }
}
