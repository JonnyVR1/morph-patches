package com.tencent.wcdb.extension.fts;

import com.tencent.wcdb.extension.SQLiteExtension;

/* JADX INFO: loaded from: classes2.dex */
public final class MMFtsTokenizer implements SQLiteExtension {
    public static final SQLiteExtension EXTENSION = new MMFtsTokenizer();

    private MMFtsTokenizer() {
    }

    private static native void nativeInitialize(long j, long j2);

    @Override // com.tencent.wcdb.extension.SQLiteExtension
    public void initialize(long j, long j2) {
        nativeInitialize(j, j2);
    }
}
