package com.tantanapp.beatles.p077v2.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class MonitorException {
    private String module;
    private MonitorStackTrace stacktrace;
    private Long threadId;
    private String threadName;
    private String type;
    private String value;

    public String getModule() {
        return this.module;
    }

    public MonitorStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public Long getThreadId() {
        return this.threadId;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setStacktrace(MonitorStackTrace monitorStackTrace) {
        this.stacktrace = monitorStackTrace;
    }

    public void setThreadId(Long l2) {
        this.threadId = l2;
    }

    public void setThreadName(String str) {
        this.threadName = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
