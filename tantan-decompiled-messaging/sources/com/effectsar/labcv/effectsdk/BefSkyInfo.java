package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefSkyInfo {
    public boolean hasSky;
    private SkySegment.SkyMask skyMask;

    public boolean getHasSky() {
        return this.hasSky;
    }

    public SkySegment.SkyMask getSkyMask() {
        return this.skyMask;
    }

    public void setHasSky(boolean z) {
        this.hasSky = z;
    }

    public void setSkyMask(SkySegment.SkyMask skyMask) {
        this.skyMask = skyMask;
    }

    public String toString() {
        return "BefSkyInfo{hasSky=" + this.hasSky + '}';
    }
}
