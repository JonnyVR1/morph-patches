package com.tantanapp.beatles.p077v2.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class OperatingSystem {
    private String build;
    private Boolean isEmulator;
    private String name;
    private Boolean rooted;
    private String version;

    public String getBuild() {
        return this.build;
    }

    public Boolean getEmulator() {
        return this.isEmulator;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getRooted() {
        return this.rooted;
    }

    public String getVersion() {
        return this.version;
    }

    public void setBuild(String str) {
        this.build = str;
    }

    public void setEmulator(Boolean bool) {
        this.isEmulator = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRooted(Boolean bool) {
        this.rooted = bool;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
