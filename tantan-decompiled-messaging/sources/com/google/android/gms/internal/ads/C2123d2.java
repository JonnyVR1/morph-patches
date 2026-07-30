package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p149l.nfw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2123d2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Map.Entry f9878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f9879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2131e2 f9880c;

    public C2123d2(C2131e2 c2131e2, Iterator it) {
        this.f9879b = it;
        this.f9880c = c2131e2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9879b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f9879b.next();
        this.f9878a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        nfw0.m159288j(this.f9878a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f9878a.getValue();
        this.f9879b.remove();
        this.f9880c.f9881b.zzb -= collection.size();
        collection.clear();
        this.f9878a = null;
    }
}
