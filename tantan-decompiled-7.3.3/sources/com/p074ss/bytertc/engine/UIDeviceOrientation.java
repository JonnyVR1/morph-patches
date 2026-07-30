package com.p074ss.bytertc.engine;

/* JADX INFO: loaded from: classes11.dex */
public enum UIDeviceOrientation {
    Portrait(0),
    LandscapeLeft(90),
    PortraitUpsidedown(180),
    LandscapeRight(270);

    private int value;

    UIDeviceOrientation() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    UIDeviceOrientation(int i) {
        this.value = i;
    }
}
