package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p149l.efw0;
import p149l.wgw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2235r2 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfzj f10029a;

    public C2235r2(zzfzj zzfzjVar) {
        this.f10029a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10029a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapZzl = this.f10029a.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = this.f10029a.zzw(entry.getKey());
            if (iZzw != -1 && efw0.m116096a(zzfzj.zzj(this.f10029a, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.f10029a;
        Map mapZzl = zzfzjVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new C2219p2(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapZzl = this.f10029a.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfzj zzfzjVar = this.f10029a;
        if (zzfzjVar.zzr()) {
            return false;
        }
        int iZzv = zzfzjVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfzj zzfzjVar2 = this.f10029a;
        int iM203082b = wgw0.m203082b(key, value, iZzv, zzfzj.zzi(zzfzjVar2), zzfzjVar2.zzA(), zzfzjVar2.zzB(), zzfzjVar2.zzC());
        if (iM203082b == -1) {
            return false;
        }
        this.f10029a.zzq(iM203082b, iZzv);
        this.f10029a.zzg--;
        this.f10029a.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10029a.size();
    }
}
