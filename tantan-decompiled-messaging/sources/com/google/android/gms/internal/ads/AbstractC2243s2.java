package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p149l.ggf0;
import p149l.lmr;
import p149l.nfw0;
import p149l.vgw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s2 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2243s2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f10031a;

    /* JADX INFO: renamed from: b */
    public int f10032b;

    /* JADX INFO: renamed from: c */
    public int f10033c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfzj f10034d;

    public /* synthetic */ AbstractC2243s2(zzfzj zzfzjVar, vgw0 vgw0Var) {
        this.f10034d = zzfzjVar;
        this.f10031a = zzfzjVar.zzf;
        this.f10032b = zzfzjVar.zze();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13074a(int i);

    /* JADX INFO: renamed from: b */
    public final void m13253b() {
        if (this.f10034d.zzf == this.f10031a) {
            return;
        }
        ggf0.m125962a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10032b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m13253b();
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f10032b;
        this.f10033c = i;
        Object objMo13074a = mo13074a(i);
        this.f10032b = this.f10034d.zzf(this.f10032b);
        return objMo13074a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m13253b();
        nfw0.m159288j(this.f10033c >= 0, "no calls to next() since the last call to remove()");
        this.f10031a += 32;
        int i = this.f10033c;
        zzfzj zzfzjVar = this.f10034d;
        zzfzjVar.remove(zzfzj.zzg(zzfzjVar, i));
        this.f10032b--;
        this.f10033c = -1;
    }
}
