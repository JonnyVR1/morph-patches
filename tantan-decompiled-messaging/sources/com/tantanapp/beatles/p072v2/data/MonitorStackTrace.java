package com.tantanapp.beatles.p072v2.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class MonitorStackTrace {

    @Nullable
    private List<MonitorStackFrame> frames;

    public MonitorStackTrace(@Nullable List<MonitorStackFrame> list) {
        this.frames = list;
    }

    @Nullable
    public List<MonitorStackFrame> getFrames() {
        return this.frames;
    }

    public void setFrames(@Nullable List<MonitorStackFrame> list) {
        this.frames = list;
    }

    public MonitorStackTrace() {
    }
}
