package com.immomo.momoenc.exception;

import java.util.Date;
import p149l.gze;

/* JADX INFO: loaded from: classes7.dex */
public class BaseHttpRepostException extends Exception {
    protected static int RepostExceptionCount = 0;
    protected static boolean reported = false;
    protected static Date startRecordTime;

    public BaseHttpRepostException() {
        countExctionTimes();
    }

    public static boolean isPostTimesIllegal() {
        return RepostExceptionCount > 50;
    }

    public static void resetIllegalStatus() {
        RepostExceptionCount = 0;
        reported = false;
    }

    public void countExctionTimes() {
        RepostExceptionCount++;
        if (startRecordTime == null) {
            startRecordTime = new Date();
        }
        if (!isPostTimesIllegal() || reported) {
            return;
        }
        reported = true;
        Date date = new Date();
        gze.m128845b(new Exception("(BaseHttpRepostException so muchtimes - starttime: " + startRecordTime.getTime() + "  reportTime:" + date.getTime() + ")" + getMessage() + "totle:" + (date.getTime() - startRecordTime.getTime())));
    }
}
