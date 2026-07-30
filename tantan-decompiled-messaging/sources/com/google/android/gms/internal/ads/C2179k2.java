package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p149l.ggf0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2179k2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9953a;

    /* JADX INFO: renamed from: b */
    public final Collection f9954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2187l2 f9955c;

    public C2179k2(C2187l2 c2187l2) {
        this.f9955c = c2187l2;
        Collection collection = c2187l2.f9969b;
        this.f9954b = collection;
        this.f9953a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m12819a() {
        this.f9955c.zzb();
        if (this.f9955c.f9969b == this.f9954b) {
            return;
        }
        ggf0.m125962a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m12819a();
        return this.f9953a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m12819a();
        return this.f9953a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9953a.remove();
        this.f9955c.f9972e.zzb--;
        this.f9955c.m12865c();
    }

    public C2179k2(C2187l2 c2187l2, Iterator it) {
        this.f9955c = c2187l2;
        this.f9954b = c2187l2.f9969b;
        this.f9953a = it;
    }
}
