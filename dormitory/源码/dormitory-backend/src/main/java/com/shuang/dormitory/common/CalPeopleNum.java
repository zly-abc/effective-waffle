package com.shuang.dormitory.common;

import com.shuang.dormitory.entity.DormRoom;

/**
 * 人数统计
 *
 */
public class CalPeopleNum {

    public static int calNum(DormRoom dormRoom) {
        int count = 0;

        if (dormRoom.getFirstBed() != null) {
            count++;
        }
        if (dormRoom.getSecondBed() != null) {
            count++;
        }
        if (dormRoom.getThirdBed() != null) {
            count++;
        }
        if (dormRoom.getFourthBed() != null) {
            count++;
        }
        return count;
    }
}
