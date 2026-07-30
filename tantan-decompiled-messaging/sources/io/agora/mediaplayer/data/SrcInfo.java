package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class SrcInfo {
    private int bitrateInKbps;
    private String name;

    @CalledByNative
    public SrcInfo(int i, String str) {
        this.bitrateInKbps = i;
        this.name = str;
    }

    @CalledByNative
    public int getBitrateInKbps() {
        return this.bitrateInKbps;
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    public void setBitrateInKbps(int i) {
        this.bitrateInKbps = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "SrcInfo{bitrateInKbps=" + this.bitrateInKbps + ", name=" + this.name + '}';
    }

    public SrcInfo() {
    }
}
