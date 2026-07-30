package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoSuperResolutionModeChangedReason {
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_ON(1),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_RESOLUTION_EXCEED(2),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OVER_USE(3),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DEVICE_NOT_SUPPORT(4),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DYNAMIC_CLOSE(5),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_DISABLED(6),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_ENABLED(7),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_NO_COMPONENT(8),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_STREAM_NOT_EXIST(9);

    private int value;

    VideoSuperResolutionModeChangedReason(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoSuperResolutionModeChangedReason fromId(int i) {
        for (VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason : values()) {
            if (videoSuperResolutionModeChangedReason.value() == i) {
                return videoSuperResolutionModeChangedReason;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i == 0) {
            return "kVideoSuperResolutionModeChangedReasonAPIOff";
        }
        if (i == 1) {
            return "kVideoSuperResolutionModeChangedReasonAPIOn";
        }
        if (i == 2) {
            return "kVideoSuperResolutionModeChangedReasonResolutionExceed";
        }
        if (i == 3) {
            return "kVideoSuperResolutionModeChangedReasonOverUse";
        }
        if (i == 4) {
            return "kVideoSuperResolutionModeChangedReasonDeviceNotSupport";
        }
        if (i == 5) {
            return "kVideoSuperResolutionModeChangedReasonDynamicClose";
        }
        if (i == 100) {
            return "kVideoSuperResolutionModeChangedReasonNoComponent";
        }
        if (i != 101) {
            return i != 200 ? "" : "kVideoSuperResolutionModeChangedReasonOther";
        }
        return "kVideoSuperResolutionModeChangedReasonStreamNotExist";
    }

    public int value() {
        return this.value;
    }
}
