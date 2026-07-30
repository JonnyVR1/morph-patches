package com.p069ss.bytertc.engine.device;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class MediaDeviceInfo {
    public DeviceError error;
    public String message;
    public DeviceState state;
    public DeviceType type;

    public MediaDeviceInfo(DeviceType deviceType, DeviceState deviceState, DeviceError deviceError, String str) {
        this.type = deviceType;
        this.state = deviceState;
        this.error = deviceError;
        this.message = str;
    }

    public String toString() {
        return "[type=" + this.type + ", state=" + this.state + ", error=" + this.error + ", msg=" + this.message + Constants.AES_SUFFIX;
    }
}
