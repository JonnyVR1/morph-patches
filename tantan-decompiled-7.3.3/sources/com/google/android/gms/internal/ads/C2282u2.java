package com.google.android.gms.internal.ads;

import java.util.Map;
import p153l.kow0;
import p153l.ppw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2282u2 extends ppw0 {

    /* JADX INFO: renamed from: a */
    public final Object f10109a;

    /* JADX INFO: renamed from: b */
    public int f10110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfzj f10111c;

    public C2282u2(zzfzj zzfzjVar, int i) {
        this.f10111c = zzfzjVar;
        this.f10109a = zzfzj.zzg(zzfzjVar, i);
        this.f10110b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m13393a() {
        int i = this.f10110b;
        if (i == -1 || i >= this.f10111c.size() || !kow0.m150688a(this.f10109a, zzfzj.zzg(this.f10111c, this.f10110b))) {
            this.f10110b = this.f10111c.zzw(this.f10109a);
        }
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object getKey() {
        return this.f10109a;
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.f10111c.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.f10109a);
        }
        m13393a();
        int i = this.f10110b;
        if (i == -1) {
            return null;
        }
        return zzfzj.zzj(this.f10111c, i);
    }

    @Override // p153l.ppw0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.f10111c.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.f10109a, obj);
        }
        m13393a();
        int i = this.f10110b;
        zzfzj zzfzjVar = this.f10111c;
        if (i == -1) {
            zzfzjVar.put(this.f10109a, obj);
            return null;
        }
        Object objZzj = zzfzj.zzj(zzfzjVar, i);
        zzfzj.zzn(zzfzjVar, this.f10110b, obj);
        return objZzj;
    }
}
