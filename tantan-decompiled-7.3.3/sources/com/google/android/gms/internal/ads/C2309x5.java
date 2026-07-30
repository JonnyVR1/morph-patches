package com.google.android.gms.internal.ads;

import java.io.IOException;
import p153l.fhx0;
import p153l.olx0;
import p153l.plx0;
import p153l.qkx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2309x5 extends olx0 {
    @Override // p153l.olx0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo13515a(Object obj) {
        return ((plx0) obj).m172892a();
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo13516b(Object obj) {
        return ((plx0) obj).m172893b();
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo13517c(Object obj) {
        AbstractC2245p5 abstractC2245p5 = (AbstractC2245p5) obj;
        plx0 plx0Var = abstractC2245p5.zzc;
        if (plx0Var != plx0.m172889c()) {
            return plx0Var;
        }
        plx0 plx0VarM172891f = plx0.m172891f();
        abstractC2245p5.zzc = plx0VarM172891f;
        return plx0VarM172891f;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo13518d(Object obj) {
        return ((AbstractC2245p5) obj).zzc;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo13519e(Object obj, Object obj2) {
        if (!plx0.m172889c().equals(obj2)) {
            if (plx0.m172889c().equals(obj)) {
                return plx0.m172890e((plx0) obj, (plx0) obj2);
            }
            ((plx0) obj).m172894d((plx0) obj2);
        }
        return obj;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo13520f() {
        return plx0.m172891f();
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object mo13521g(Object obj) {
        ((plx0) obj).m172896h();
        return obj;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13522h(Object obj, int i, int i2) {
        ((plx0) obj).m172898j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13523i(Object obj, int i, long j) {
        ((plx0) obj).m172898j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void mo13524j(Object obj, int i, Object obj2) {
        ((plx0) obj).m172898j((i << 3) | 3, obj2);
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13525k(Object obj, int i, zzgyl zzgylVar) {
        ((plx0) obj).m172898j((i << 3) | 2, zzgylVar);
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13526l(Object obj, int i, long j) {
        ((plx0) obj).m172898j(i << 3, Long.valueOf(j));
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: m */
    public final void mo13527m(Object obj) {
        ((AbstractC2245p5) obj).zzc.m172896h();
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo13528n(Object obj, Object obj2) {
        ((AbstractC2245p5) obj).zzc = (plx0) obj2;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo13529o(Object obj, Object obj2) {
        ((AbstractC2245p5) obj).zzc = (plx0) obj2;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: q */
    public final boolean mo13530q(qkx0 qkx0Var) {
        return false;
    }

    @Override // p153l.olx0
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo13531r(Object obj, fhx0 fhx0Var) throws IOException {
        ((plx0) obj).m172899k(fhx0Var);
    }
}
