package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;

/* JADX INFO: loaded from: classes13.dex */
public enum SimulcastStreamType {
    SIMULCAST_STREAM_TYPE_WEAK(0),
    SIMULCAST_STREAM_TYPE_LOW(1),
    SIMULCAST_STREAM_TYPE_MID(2),
    SIMULCAST_STREAM_TYPE_HIGH(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.SimulcastStreamType$1 */
    public static /* synthetic */ class C134351 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType;

        static {
            int[] iArr = new int[SimulcastStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType = iArr;
            try {
                iArr[SimulcastStreamType.SIMULCAST_STREAM_TYPE_WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType[SimulcastStreamType.SIMULCAST_STREAM_TYPE_LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType[SimulcastStreamType.SIMULCAST_STREAM_TYPE_MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType[SimulcastStreamType.SIMULCAST_STREAM_TYPE_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    SimulcastStreamType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SimulcastStreamType fromId(int i) {
        for (SimulcastStreamType simulcastStreamType : values()) {
            if (simulcastStreamType.value() == i) {
                return simulcastStreamType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134351.$SwitchMap$com$ss$bytertc$engine$data$SimulcastStreamType[ordinal()];
        if (i == 1) {
            return "kSimulcastStreamTypeWeak";
        }
        if (i == 2) {
            return "kSimulcastStreamTypeLow";
        }
        if (i != 3) {
            return i != 4 ? BLiveRightItem.PERIOD_VALID : "kSimulcastStreamTypeHigh";
        }
        return "kSimulcastStreamTypeMid";
    }

    public int value() {
        return this.value;
    }
}
