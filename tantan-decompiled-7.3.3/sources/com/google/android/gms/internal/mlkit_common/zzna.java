package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes6.dex */
public enum zzna {
    UNKNOWN_STATUS(0),
    EXPLICITLY_REQUESTED(1),
    IMPLICITLY_REQUESTED(2),
    MODEL_INFO_RETRIEVAL_SUCCEEDED(3),
    MODEL_INFO_RETRIEVAL_FAILED(4),
    SCHEDULED(5),
    DOWNLOADING(6),
    SUCCEEDED(7),
    FAILED(8),
    LIVE(9),
    UPDATE_AVAILABLE(10),
    DOWNLOADED(11),
    STARTED(12);

    private final int zzo;

    zzna(int i) {
        this.zzo = i;
    }

    public final int zza() {
        return this.zzo;
    }
}
