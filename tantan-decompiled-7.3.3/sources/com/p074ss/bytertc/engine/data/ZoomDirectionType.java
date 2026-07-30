package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum ZoomDirectionType {
    CAMERA_MOVE_LEFT(0),
    CAMERA_MOVE_RIGHT(1),
    CAMERA_MOVE_UP(2),
    CAMERA_MOVE_DOWN(3),
    CAMERA_ZOOM_OUT(4),
    CAMERA_ZOOM_IN(5),
    CAMERA_RESET(6);

    private int value;

    ZoomDirectionType(int i) {
        this.value = i;
    }

    public static ZoomDirectionType fromId(int i) {
        for (ZoomDirectionType zoomDirectionType : values()) {
            if (zoomDirectionType.value() == i) {
                return zoomDirectionType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
