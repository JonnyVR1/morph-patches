package com.tantanapp.beatles.monitor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class CrashInfo implements Serializable {
    private String crashMessage;
    private String crashName;
    private String crashStackTrace;
    private Thread crashThread;
    private List<StackInfo> stackInfos = new ArrayList();

    public String getCrashMessage() {
        return this.crashMessage;
    }

    public String getCrashName() {
        return this.crashName;
    }

    public String getCrashStackTrace() {
        return this.crashStackTrace;
    }

    public Thread getCrashThread() {
        return this.crashThread;
    }

    public List<StackInfo> getStackInfos() {
        return this.stackInfos;
    }

    public void setCrashMessage(String str) {
        this.crashMessage = str;
    }

    public void setCrashName(String str) {
        this.crashName = str;
    }

    public void setCrashStackTrace(String str) {
        this.crashStackTrace = str;
    }

    public void setCrashThread(Thread thread) {
        this.crashThread = thread;
    }

    public void setStackInfos(List<StackInfo> list) {
        this.stackInfos = list;
    }
}
