package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p153l.tow0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2120a2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9862a;

    /* JADX INFO: renamed from: b */
    public Collection f9863b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2129b2 f9864c;

    public C2120a2(C2129b2 c2129b2) {
        this.f9864c = c2129b2;
        this.f9862a = c2129b2.f9867c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9862a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f9862a.next();
        this.f9863b = (Collection) entry.getValue();
        return this.f9864c.m12586b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        tow0.m192095j(this.f9863b != null, "no calls to next() since the last call to remove()");
        this.f9862a.remove();
        this.f9864c.f9868d.zzb -= this.f9863b.size();
        this.f9863b.clear();
        this.f9863b = null;
    }
}
