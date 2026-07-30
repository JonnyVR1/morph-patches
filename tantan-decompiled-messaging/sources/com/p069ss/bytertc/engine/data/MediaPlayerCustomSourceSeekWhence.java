package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum MediaPlayerCustomSourceSeekWhence {
    SET(0),
    CUR(1),
    END(2),
    SIZE(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence$1 */
    public static /* synthetic */ class C134261 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence */
        static final /* synthetic */ int[] f55615x231e5261;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceSeekWhence.values().length];
            f55615x231e5261 = iArr;
            try {
                iArr[MediaPlayerCustomSourceSeekWhence.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55615x231e5261[MediaPlayerCustomSourceSeekWhence.CUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55615x231e5261[MediaPlayerCustomSourceSeekWhence.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55615x231e5261[MediaPlayerCustomSourceSeekWhence.SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    MediaPlayerCustomSourceSeekWhence(int i) {
        this.value = i;
    }

    public static MediaPlayerCustomSourceSeekWhence fromId(int i) {
        for (MediaPlayerCustomSourceSeekWhence mediaPlayerCustomSourceSeekWhence : values()) {
            if (mediaPlayerCustomSourceSeekWhence.value() == i) {
                return mediaPlayerCustomSourceSeekWhence;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134261.f55615x231e5261[ordinal()];
        if (i == 1) {
            return "SET";
        }
        if (i == 2) {
            return "CUR";
        }
        if (i != 3) {
            return i != 4 ? "" : "SIZE";
        }
        return "END";
    }

    public int value() {
        return this.value;
    }
}
