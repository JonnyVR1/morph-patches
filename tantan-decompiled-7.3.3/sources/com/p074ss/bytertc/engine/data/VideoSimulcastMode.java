package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoSimulcastMode {
    VIDEO_SIMULCAST_MODE_ONLY_ONE(0),
    VIDEO_SIMULCAST_MODE_ON_DEMAND(1),
    VIDEO_SIMULCAST_MODE_ALWAYS_SIMULCAST(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.VideoSimulcastMode$1 */
    public static /* synthetic */ class C136031 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoSimulcastMode;

        static {
            int[] iArr = new int[VideoSimulcastMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoSimulcastMode = iArr;
            try {
                iArr[VideoSimulcastMode.VIDEO_SIMULCAST_MODE_ONLY_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoSimulcastMode[VideoSimulcastMode.VIDEO_SIMULCAST_MODE_ON_DEMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoSimulcastMode[VideoSimulcastMode.VIDEO_SIMULCAST_MODE_ALWAYS_SIMULCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    VideoSimulcastMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static VideoSimulcastMode fromId(int i) {
        for (VideoSimulcastMode videoSimulcastMode : values()) {
            if (videoSimulcastMode.value() == i) {
                return videoSimulcastMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C136031.$SwitchMap$com$ss$bytertc$engine$data$VideoSimulcastMode[ordinal()];
        if (i == 1) {
            return "kVideoSimulcastModeOnlyOne";
        }
        if (i != 2) {
            return i != 3 ? BLiveRightItem.PERIOD_VALID : "kVideoSimulcastModeAlwaysSimulcast";
        }
        return "kVideoSimulcastModeOnDemand";
    }

    public int value() {
        return this.value;
    }
}
