package com.google.android.gms.internal.mlkit_language_id_bundled;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p149l.nzq0;

/* JADX INFO: loaded from: classes6.dex */
final class zbj extends zbi {
    static final zbi zba = new zbj(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    public zbj(Object[] objArr, int i) {
        this.zbb = objArr;
        this.zbc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nzq0.m162080a(i, this.zbc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zbb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbi, com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final int zba(Object[] objArr, int i) {
        System.arraycopy(this.zbb, 0, objArr, 0, this.zbc);
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final int zbb() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    public final Object[] zbe() {
        return this.zbb;
    }
}
