package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum CameraId {
    CAMERA_ID_FRONT(0),
    CAMERA_ID_BACK(1),
    CAMERA_ID_EXTERNAL(2),
    CAMERA_ID_INVALID(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.CameraId$1 */
    public static /* synthetic */ class C135841 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$CameraId;

        static {
            int[] iArr = new int[CameraId.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$CameraId = iArr;
            try {
                iArr[CameraId.CAMERA_ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$CameraId[CameraId.CAMERA_ID_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    CameraId(int i) {
        this.value = i;
    }

    @CalledByNative
    public static CameraId fromId(int i) {
        for (CameraId cameraId : values()) {
            if (cameraId.value() == i) {
                return cameraId;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135841.$SwitchMap$com$ss$bytertc$engine$data$CameraId[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "kCameraIDBack";
        }
        return "kCameraIDFront";
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
