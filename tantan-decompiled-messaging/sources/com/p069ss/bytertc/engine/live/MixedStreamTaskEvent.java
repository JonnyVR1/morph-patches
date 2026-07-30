package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum MixedStreamTaskEvent {
    BASE(0),
    START_SUCCESS(1),
    START_FAILED(2),
    UPDATE_SUCCESS(3),
    UPDATE_FAILED(4),
    STOP_SUCCESS(5),
    STOP_FAILED(6),
    WARNING(7);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.MixedStreamTaskEvent$1 */
    public static /* synthetic */ class C134451 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent;

        static {
            int[] iArr = new int[MixedStreamTaskEvent.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent = iArr;
            try {
                iArr[MixedStreamTaskEvent.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.START_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.START_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.UPDATE_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.UPDATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.STOP_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.STOP_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[MixedStreamTaskEvent.WARNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    MixedStreamTaskEvent(int i) {
        this.value = i;
    }

    @CalledByNative
    public static MixedStreamTaskEvent fromId(int i) {
        for (MixedStreamTaskEvent mixedStreamTaskEvent : values()) {
            if (mixedStreamTaskEvent.value() == i) {
                return mixedStreamTaskEvent;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C134451.$SwitchMap$com$ss$bytertc$engine$live$MixedStreamTaskEvent[ordinal()]) {
            case 1:
                return "BASE";
            case 2:
                return "START_SUCCESS";
            case 3:
                return "START_FAILED";
            case 4:
                return "UPDATE_SUCCESS";
            case 5:
                return "UPDATE_FAILED";
            case 6:
                return "STREAM_MIXING_STOP_SUCCESS";
            case 7:
                return "STREAM_MIXING_STOP_FAILED";
            case 8:
                return "WARNING";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
