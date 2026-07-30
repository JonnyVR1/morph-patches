package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p149l.pgw0;
import p149l.tiw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2298z1 extends tiw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2106b2 f10109a;

    public C2298z1(C2106b2 c2106b2) {
        this.f10109a = c2106b2;
    }

    @Override // p149l.tiw0
    /* JADX INFO: renamed from: a */
    public final Map mo13512a() {
        return this.f10109a;
    }

    @Override // p149l.tiw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return pgw0.m168924a(this.f10109a.f9830c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2097a2(this.f10109a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C2106b2 c2106b2 = this.f10109a;
        zzfyt.zzo(c2106b2.f9831d, entry.getKey());
        return true;
    }
}
