package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p153l.nof0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2202k2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9990a;

    /* JADX INFO: renamed from: b */
    public final Collection f9991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2210l2 f9992c;

    public C2202k2(C2210l2 c2210l2) {
        this.f9992c = c2210l2;
        Collection collection = c2210l2.f10006b;
        this.f9991b = collection;
        this.f9990a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m12873a() {
        this.f9992c.zzb();
        if (this.f9992c.f10006b == this.f9991b) {
            return;
        }
        nof0.m164126a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m12873a();
        return this.f9990a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m12873a();
        return this.f9990a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9990a.remove();
        this.f9992c.f10009e.zzb--;
        this.f9992c.m12919c();
    }

    public C2202k2(C2210l2 c2210l2, Iterator it) {
        this.f9992c = c2210l2;
        this.f9991b = c2210l2.f10006b;
        this.f9990a = it;
    }
}
