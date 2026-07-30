package com.p069ss.bytertc.engine.type;

import com.p069ss.bytertc.engine.InternalSourceWantedData;

/* JADX INFO: loaded from: classes13.dex */
public class SourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
        this.width = internalSourceWantedData.width;
        this.height = internalSourceWantedData.height;
        this.frameRate = internalSourceWantedData.frameRate;
    }

    public String toString() {
        return "SourceWantedData{width='" + this.width + "', height='" + this.height + "', frameRate='" + this.frameRate + "'}";
    }

    public SourceWantedData() {
    }
}
