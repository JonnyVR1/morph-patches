package com.tantanapp.beatles.monitor;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class StackInfo implements Serializable {
    private String stackTrace;
    private long threadId;
    private String threadName;

    public String getStackTrace() {
        return this.stackTrace;
    }

    public long getThreadId() {
        return this.threadId;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public void setStackTrace(String str) {
        this.stackTrace = str;
    }

    public void setThreadId(long j) {
        this.threadId = j;
    }

    public void setThreadName(String str) {
        this.threadName = str;
    }
}
