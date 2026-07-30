package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum LyricStatus {
    NONE(0),
    KRC(1),
    LRC(2),
    KRC_AND_LRC(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.LyricStatus$1 */
    public static /* synthetic */ class C134701 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus;

        static {
            int[] iArr = new int[LyricStatus.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus = iArr;
            try {
                iArr[LyricStatus.KRC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.LRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.KRC_AND_LRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    LyricStatus(int i) {
        this.value = i;
    }

    @CalledByNative
    public static LyricStatus fromId(int i) {
        for (LyricStatus lyricStatus : values()) {
            if (lyricStatus.value() == i) {
                return lyricStatus;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134701.$SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[ordinal()];
        if (i == 1) {
            return "LYRIC_STATUS_KRC";
        }
        if (i == 2) {
            return "LYRIC_STATUS_LRC";
        }
        if (i != 3) {
            return i != 4 ? "" : "LYRIC_STATUS_NONE";
        }
        return "LYRIC_STATUS_KRC_AND_LRC";
    }

    public int value() {
        return this.value;
    }
}
