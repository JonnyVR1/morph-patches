package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p149l.nfw0;

/* JADX INFO: loaded from: classes6.dex */
enum zzgai implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        nfw0.m159288j(false, "no calls to next() since the last call to remove()");
    }
}
