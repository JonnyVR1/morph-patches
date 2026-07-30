package com.google.android.libraries.places.internal;

import p153l.mor;

/* JADX INFO: loaded from: classes7.dex */
final class zzoc extends zzox {
    private Object zza;

    public zzoc(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.zza;
        this.zza = this;
        if (obj != this) {
            return obj;
        }
        mor.m159308a();
        return null;
    }
}
