package com.p074ss.bytertc.engine.device;

import com.google.android.exoplayer2.PlaybackException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public enum DeviceError {
    DEVICE_NO_ERROR(0),
    NO_VIDEO_DEVICE(1),
    NO_AUDIO_DEVICE(2),
    AUDIO_DEVICE_REMOVED(3),
    VIDEO_DEVICE_REMOVED(4),
    AUDIO_PARAM_NOSUPPORT(5),
    VIDEO_DEVICE_PERMISSION(6),
    AUDIO_DEVICE_PERMISSION(7),
    VIDEO_DEVICE_OCCUPIED(8),
    AUDIO_DEVICE_OCCUPIED(9),
    VIDEO_DEVICE_UNKNOWN_ERROR(10),
    AUDIO_DEVICE_UNKNOWN_ERROR(11),
    DEVICE_UNKNOWN(PlaybackException.CUSTOM_ERROR_CODE_BASE);

    static Map<Integer, DeviceError> hash = new HashMap();
    int errorCode;

    DeviceError(int i) {
        this.errorCode = i;
    }

    public static DeviceError get(int i) {
        if (hash.size() == 0) {
            for (DeviceError deviceError : values()) {
                hash.put(Integer.valueOf(deviceError.errorCode), deviceError);
            }
        }
        return hash.containsKey(Integer.valueOf(i)) ? hash.get(Integer.valueOf(i)) : DEVICE_UNKNOWN;
    }

    public int getId() {
        return this.errorCode;
    }
}
