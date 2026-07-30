package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p153l.tow0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2146d2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Map.Entry f9915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f9916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2154e2 f9917c;

    public C2146d2(C2154e2 c2154e2, Iterator it) {
        this.f9916b = it;
        this.f9917c = c2154e2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9916b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f9916b.next();
        this.f9915a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        tow0.m192095j(this.f9915a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f9915a.getValue();
        this.f9916b.remove();
        this.f9917c.f9918b.zzb -= collection.size();
        collection.clear();
        this.f9915a = null;
    }
}
