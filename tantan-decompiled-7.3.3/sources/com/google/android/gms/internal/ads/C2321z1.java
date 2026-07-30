package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p153l.vpw0;
import p153l.zrw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2321z1 extends zrw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2129b2 f10146a;

    public C2321z1(C2129b2 c2129b2) {
        this.f10146a = c2129b2;
    }

    @Override // p153l.zrw0
    /* JADX INFO: renamed from: a */
    public final Map mo13566a() {
        return this.f10146a;
    }

    @Override // p153l.zrw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return vpw0.m202346a(this.f10146a.f9867c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2120a2(this.f10146a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C2129b2 c2129b2 = this.f10146a;
        zzfyt.zzo(c2129b2.f9868d, entry.getKey());
        return true;
    }
}
