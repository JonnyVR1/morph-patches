package com.tantanapp.beatles.p077v2.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class MonitorStackFrame {
    private String filename;
    private String function;
    private Integer lineno;
    private String module;

    public String getFilename() {
        return this.filename;
    }

    public String getFunction() {
        return this.function;
    }

    public Integer getLineno() {
        return this.lineno;
    }

    public String getModule() {
        return this.module;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public void setLineno(Integer num) {
        this.lineno = num;
    }

    public void setModule(String str) {
        this.module = str;
    }
}
