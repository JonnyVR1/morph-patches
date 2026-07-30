package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p153l.bqw0;
import p153l.mor;
import p153l.nof0;
import p153l.tow0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s2 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2266s2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f10068a;

    /* JADX INFO: renamed from: b */
    public int f10069b;

    /* JADX INFO: renamed from: c */
    public int f10070c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfzj f10071d;

    public /* synthetic */ AbstractC2266s2(zzfzj zzfzjVar, bqw0 bqw0Var) {
        this.f10071d = zzfzjVar;
        this.f10068a = zzfzjVar.zzf;
        this.f10069b = zzfzjVar.zze();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13128a(int i);

    /* JADX INFO: renamed from: b */
    public final void m13307b() {
        if (this.f10071d.zzf == this.f10068a) {
            return;
        }
        nof0.m164126a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10069b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m13307b();
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f10069b;
        this.f10070c = i;
        Object objMo13128a = mo13128a(i);
        this.f10069b = this.f10071d.zzf(this.f10069b);
        return objMo13128a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m13307b();
        tow0.m192095j(this.f10070c >= 0, "no calls to next() since the last call to remove()");
        this.f10068a += 32;
        int i = this.f10070c;
        zzfzj zzfzjVar = this.f10071d;
        zzfzjVar.remove(zzfzj.zzg(zzfzjVar, i));
        this.f10069b--;
        this.f10070c = -1;
    }
}
