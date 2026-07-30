package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p153l.cqw0;
import p153l.kow0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2258r2 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfzj f10066a;

    public C2258r2(zzfzj zzfzjVar) {
        this.f10066a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10066a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapZzl = this.f10066a.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = this.f10066a.zzw(entry.getKey());
            if (iZzw != -1 && kow0.m150688a(zzfzj.zzj(this.f10066a, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.f10066a;
        Map mapZzl = zzfzjVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new C2242p2(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapZzl = this.f10066a.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfzj zzfzjVar = this.f10066a;
        if (zzfzjVar.zzr()) {
            return false;
        }
        int iZzv = zzfzjVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfzj zzfzjVar2 = this.f10066a;
        int iM111994b = cqw0.m111994b(key, value, iZzv, zzfzj.zzi(zzfzjVar2), zzfzjVar2.zzA(), zzfzjVar2.zzB(), zzfzjVar2.zzC());
        if (iM111994b == -1) {
            return false;
        }
        this.f10066a.zzq(iM111994b, iZzv);
        this.f10066a.zzg--;
        this.f10066a.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10066a.size();
    }
}
