package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p149l.nfw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2097a2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9825a;

    /* JADX INFO: renamed from: b */
    public Collection f9826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2106b2 f9827c;

    public C2097a2(C2106b2 c2106b2) {
        this.f9827c = c2106b2;
        this.f9825a = c2106b2.f9830c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9825a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f9825a.next();
        this.f9826b = (Collection) entry.getValue();
        return this.f9827c.m12532b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        nfw0.m159288j(this.f9826b != null, "no calls to next() since the last call to remove()");
        this.f9825a.remove();
        this.f9827c.f9831d.zzb -= this.f9826b.size();
        this.f9826b.clear();
        this.f9826b = null;
    }
}
