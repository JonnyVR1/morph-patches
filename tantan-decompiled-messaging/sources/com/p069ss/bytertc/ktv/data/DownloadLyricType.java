package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum DownloadLyricType {
    KRC(0),
    LRC(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.DownloadLyricType$1 */
    public static /* synthetic */ class C134671 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType;

        static {
            int[] iArr = new int[DownloadLyricType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType = iArr;
            try {
                iArr[DownloadLyricType.KRC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType[DownloadLyricType.LRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    DownloadLyricType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static DownloadLyricType fromId(int i) {
        for (DownloadLyricType downloadLyricType : values()) {
            if (downloadLyricType.value() == i) {
                return downloadLyricType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134671.$SwitchMap$com$ss$bytertc$ktv$data$DownloadLyricType[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "DOWNLOAD_LYRIC_TYPE_LRC";
        }
        return "DOWNLOAD_LYRIC_TYPE_KRC";
    }

    public int value() {
        return this.value;
    }
}
