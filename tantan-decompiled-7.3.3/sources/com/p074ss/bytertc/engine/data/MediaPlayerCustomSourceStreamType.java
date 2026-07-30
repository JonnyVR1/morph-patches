package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum MediaPlayerCustomSourceStreamType {
    RAW(0),
    ENCODED(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceStreamType$1 */
    public static /* synthetic */ class C135901 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType */
        static final /* synthetic */ int[] f56464xed7a1387;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceStreamType.values().length];
            f56464xed7a1387 = iArr;
            try {
                iArr[MediaPlayerCustomSourceStreamType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56464xed7a1387[MediaPlayerCustomSourceStreamType.ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MediaPlayerCustomSourceStreamType(int i) {
        this.value = i;
    }

    public static MediaPlayerCustomSourceStreamType fromId(int i) {
        for (MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType : values()) {
            if (mediaPlayerCustomSourceStreamType.value() == i) {
                return mediaPlayerCustomSourceStreamType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135901.f56464xed7a1387[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "ENCODED";
        }
        return "RAW";
    }

    public int value() {
        return this.value;
    }
}
