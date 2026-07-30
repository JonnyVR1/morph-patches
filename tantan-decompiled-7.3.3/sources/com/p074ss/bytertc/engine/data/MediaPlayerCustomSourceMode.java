package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum MediaPlayerCustomSourceMode {
    PUSH(0),
    PULL(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceMode$1 */
    public static /* synthetic */ class C135881 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode */
        static final /* synthetic */ int[] f56462x20c90010;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceMode.values().length];
            f56462x20c90010 = iArr;
            try {
                iArr[MediaPlayerCustomSourceMode.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56462x20c90010[MediaPlayerCustomSourceMode.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MediaPlayerCustomSourceMode(int i) {
        this.value = i;
    }

    public static MediaPlayerCustomSourceMode fromId(int i) {
        for (MediaPlayerCustomSourceMode mediaPlayerCustomSourceMode : values()) {
            if (mediaPlayerCustomSourceMode.value() == i) {
                return mediaPlayerCustomSourceMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135881.f56462x20c90010[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "PULL";
        }
        return "PUSH";
    }

    public int value() {
        return this.value;
    }
}
