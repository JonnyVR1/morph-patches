package com.jiechic.library.android.snappy;

/* JADX INFO: loaded from: classes7.dex */
public enum SnappyErrorCode {
    UNKNOWN(0),
    FAILED_TO_LOAD_NATIVE_LIBRARY(1),
    PARSING_ERROR(2),
    NOT_A_DIRECT_BUFFER(3),
    OUT_OF_MEMORY(4),
    FAILED_TO_UNCOMPRESS(5),
    EMPTY_INPUT(6),
    INCOMPATIBLE_VERSION(7),
    INVALID_CHUNK_SIZE(8);


    /* JADX INFO: renamed from: id */
    public final int f14219id;

    SnappyErrorCode(int i) {
        this.f14219id = i;
    }

    public static SnappyErrorCode getErrorCode(int i) {
        for (SnappyErrorCode snappyErrorCode : values()) {
            if (snappyErrorCode.f14219id == i) {
                return snappyErrorCode;
            }
        }
        return UNKNOWN;
    }

    public static String getErrorMessage(int i) {
        return getErrorCode(i).name();
    }
}
