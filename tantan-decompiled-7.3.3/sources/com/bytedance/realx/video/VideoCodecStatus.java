package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.core.glcore.util.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public enum VideoCodecStatus {
    OK(0),
    ERR_PARAMETER(3001),
    ERR_SIZE(3001),
    LEVEL_EXCEEDED(3001),
    UNINITIALIZED(4002),
    MEMORY(4003),
    ERROR(4003),
    TIMEOUT(ErrorCode.CAMEAR_GET_STATUS_FAILED),
    NO_OUTPUT(2002),
    FALLBACK_SOFTWARE(ErrorCode.CAMERA_TAKE_PHOTO_FAILED),
    MEDIACODEC_EXCEPTION(2006),
    USING_INTERNAL_SURFACE(2007),
    OVERLOAD(4005),
    MEDIACODEC_OUT_OF_RESOLUTION(2008),
    DROP_DECODED_FRAME(2002);

    private final int number;

    VideoCodecStatus(int i) {
        this.number = i;
    }

    @CalledByNative
    public int getNumber() {
        return this.number;
    }
}
