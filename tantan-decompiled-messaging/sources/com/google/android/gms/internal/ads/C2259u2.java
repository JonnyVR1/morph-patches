package com.google.android.gms.internal.ads;

import java.util.Map;
import p149l.efw0;
import p149l.jgw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2259u2 extends jgw0 {

    /* JADX INFO: renamed from: a */
    public final Object f10072a;

    /* JADX INFO: renamed from: b */
    public int f10073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfzj f10074c;

    public C2259u2(zzfzj zzfzjVar, int i) {
        this.f10074c = zzfzjVar;
        this.f10072a = zzfzj.zzg(zzfzjVar, i);
        this.f10073b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m13339a() {
        int i = this.f10073b;
        if (i == -1 || i >= this.f10074c.size() || !efw0.m116096a(this.f10072a, zzfzj.zzg(this.f10074c, this.f10073b))) {
            this.f10073b = this.f10074c.zzw(this.f10072a);
        }
    }

    @Override // p149l.jgw0, java.util.Map.Entry
    public final Object getKey() {
        return this.f10072a;
    }

    @Override // p149l.jgw0, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.f10074c.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.f10072a);
        }
        m13339a();
        int i = this.f10073b;
        if (i == -1) {
            return null;
        }
        return zzfzj.zzj(this.f10074c, i);
    }

    @Override // p149l.jgw0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.f10074c.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.f10072a, obj);
        }
        m13339a();
        int i = this.f10073b;
        zzfzj zzfzjVar = this.f10074c;
        if (i == -1) {
            zzfzjVar.put(this.f10072a, obj);
            return null;
        }
        Object objZzj = zzfzj.zzj(zzfzjVar, i);
        zzfzj.zzn(zzfzjVar, this.f10073b, obj);
        return objZzj;
    }
}
