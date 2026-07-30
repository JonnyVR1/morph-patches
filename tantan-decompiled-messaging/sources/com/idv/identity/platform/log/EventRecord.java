package com.idv.identity.platform.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class EventRecord extends RecordBase {
    private SimpleDateFormat simpleDateFormat;

    public EventRecord() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        this.simpleDateFormat = simpleDateFormat;
        setLogTime(simpleDateFormat.format(new Date()));
        setClientId(RecordConst.getClientId());
        setClientVersion(RecordConst.getClientVersion());
        setLogVersion(RecordConst.getLogVersion());
        setDeviceId(RecordConst.getDeviceId());
        setSessionId(RecordConst.getSessionId());
        setPhonePrint(RecordConst.getPhonePrint());
        setOsVersion(RecordConst.getOsVersion());
        setNetType(RecordConst.getNetType());
        setScreenMetrix(RecordConst.getScreenMetrics());
        setPackageName(RecordConst.getPackageName());
    }
}
