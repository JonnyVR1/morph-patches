package com.tantanapp.beatles.p072v2.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public final class MonitorThread {
    private Boolean crashed;
    private Boolean current;

    /* JADX INFO: renamed from: id */
    private Long f56007id;
    private String name;
    private MonitorStackTrace stacktrace;
    private String state;

    public Long getId() {
        return this.f56007id;
    }

    public String getName() {
        return this.name;
    }

    public MonitorStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public String getState() {
        return this.state;
    }

    public Boolean isCrashed() {
        return this.crashed;
    }

    public Boolean isCurrent() {
        return this.current;
    }

    public void setCrashed(Boolean bool) {
        this.crashed = bool;
    }

    public void setCurrent(Boolean bool) {
        this.current = bool;
    }

    public void setId(Long l2) {
        this.f56007id = l2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStacktrace(MonitorStackTrace monitorStackTrace) {
        this.stacktrace = monitorStackTrace;
    }

    public void setState(String str) {
        this.state = str;
    }
}
