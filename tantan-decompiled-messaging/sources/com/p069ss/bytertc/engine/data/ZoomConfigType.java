package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum ZoomConfigType {
    ZOOM_FOCUS_OFFSET(0),
    ZOOM_MOVE_OFFSET(1);

    private int value;

    ZoomConfigType(int i) {
        this.value = i;
    }

    public static ZoomConfigType fromId(int i) {
        for (ZoomConfigType zoomConfigType : values()) {
            if (zoomConfigType.value() == i) {
                return zoomConfigType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
