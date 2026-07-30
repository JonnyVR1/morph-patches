package com.p074ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum MusicFilterType {
    NONE(0),
    WITHOUT_LYRIC(1),
    UNSUPPORTED_SCORE(2),
    UNSUPPORTED_ACCOMPANY(4),
    UNSUPPORTED_CLIMAX(8);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.MusicFilterType$1 */
    public static /* synthetic */ class C136341 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType;

        static {
            int[] iArr = new int[MusicFilterType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType = iArr;
            try {
                iArr[MusicFilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.WITHOUT_LYRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_ACCOMPANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_CLIMAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    MusicFilterType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static MusicFilterType fromId(int i) {
        for (MusicFilterType musicFilterType : values()) {
            if (musicFilterType.value() == i) {
                return musicFilterType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C136341.$SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[ordinal()];
        if (i == 1) {
            return "MUSIC_FILTER_TYPE_NONE";
        }
        if (i == 2) {
            return "MUSIC_FILTER_TYPE_WITHOUT_LYRIC";
        }
        if (i == 3) {
            return "MUSIC_FILTER_TYPE_UNSUPPORTED_SCORE";
        }
        if (i != 4) {
            return i != 5 ? "" : "MUSIC_FILTER_TYPE_UNSUPPORTED_CLIMAX";
        }
        return "MUSIC_FILTER_TYPE_UNSUPPORTED_ACCOMPANY";
    }

    public int value() {
        return this.value;
    }
}
