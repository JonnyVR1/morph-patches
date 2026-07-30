package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum DownloadFileType {
    MUSIC(1),
    KRC(2),
    LRC(3),
    MIDI(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.DownloadFileType$1 */
    public static /* synthetic */ class C134661 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType;

        static {
            int[] iArr = new int[DownloadFileType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType = iArr;
            try {
                iArr[DownloadFileType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.KRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.LRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[DownloadFileType.MIDI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    DownloadFileType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static DownloadFileType fromId(int i) {
        for (DownloadFileType downloadFileType : values()) {
            if (downloadFileType.value() == i) {
                return downloadFileType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134661.$SwitchMap$com$ss$bytertc$ktv$data$DownloadFileType[ordinal()];
        if (i == 1) {
            return "DOWNLOAD_FILE_TYPE_MUSIC";
        }
        if (i == 2) {
            return "DOWNLOAD_FILE_TYPE_KRC";
        }
        if (i != 3) {
            return i != 4 ? "" : "DOWNLOAD_FILE_TYPE_MIDI";
        }
        return "DOWNLOAD_FILE_TYPE_LRC";
    }

    public int value() {
        return this.value;
    }
}
