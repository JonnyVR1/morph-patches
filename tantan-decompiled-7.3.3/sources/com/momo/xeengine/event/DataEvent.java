package com.momo.xeengine.event;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class DataEvent implements XEvent {
    private String content;
    private String name;

    public String getContent() {
        return this.content;
    }

    public String getName() {
        return this.name;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
