package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;

/* JADX INFO: loaded from: classes13.dex */
public enum StreamIndex {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_SCREEN(1),
    STREAM_INDEX_3RD(2),
    STREAM_INDEX_4TH(3),
    STREAM_INDEX_5TH(4),
    STREAM_INDEX_6TH(5),
    STREAM_INDEX_7TH(6),
    STREAM_INDEX_MAX(7);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.StreamIndex$1 */
    public static /* synthetic */ class C134361 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$StreamIndex;

        static {
            int[] iArr = new int[StreamIndex.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$StreamIndex = iArr;
            try {
                iArr[StreamIndex.STREAM_INDEX_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_3RD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_4TH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_5TH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_6TH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_7TH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    StreamIndex(int i) {
        this.value = i;
    }

    @CalledByNative
    public static StreamIndex fromId(int i) {
        for (StreamIndex streamIndex : values()) {
            if (streamIndex.value() == i) {
                return streamIndex;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C134361.$SwitchMap$com$ss$bytertc$engine$data$StreamIndex[ordinal()]) {
            case 1:
                return "kStreamIndexMain";
            case 2:
                return "kStreamIndexScreen";
            case 3:
                return "kStreamIndex3rd";
            case 4:
                return "kStreamIndex4th";
            case 5:
                return "kStreamIndex5th";
            case 6:
                return "kStreamIndex6th";
            case 7:
                return "kStreamIndex7th";
            default:
                return BLiveRightItem.PERIOD_VALID;
        }
    }

    public int value() {
        return this.value;
    }
}
