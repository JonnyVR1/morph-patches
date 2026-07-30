package com.google.android.gms.internal.ads;

import java.io.IOException;
import p149l.icx0;
import p149l.jcx0;
import p149l.kbx0;
import p149l.z7x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2286x5 extends icx0 {
    @Override // p149l.icx0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo13461a(Object obj) {
        return ((jcx0) obj).m141000a();
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo13462b(Object obj) {
        return ((jcx0) obj).m141001b();
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo13463c(Object obj) {
        AbstractC2222p5 abstractC2222p5 = (AbstractC2222p5) obj;
        jcx0 jcx0Var = abstractC2222p5.zzc;
        if (jcx0Var != jcx0.m140997c()) {
            return jcx0Var;
        }
        jcx0 jcx0VarM140999f = jcx0.m140999f();
        abstractC2222p5.zzc = jcx0VarM140999f;
        return jcx0VarM140999f;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo13464d(Object obj) {
        return ((AbstractC2222p5) obj).zzc;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo13465e(Object obj, Object obj2) {
        if (!jcx0.m140997c().equals(obj2)) {
            if (jcx0.m140997c().equals(obj)) {
                return jcx0.m140998e((jcx0) obj, (jcx0) obj2);
            }
            ((jcx0) obj).m141002d((jcx0) obj2);
        }
        return obj;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo13466f() {
        return jcx0.m140999f();
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object mo13467g(Object obj) {
        ((jcx0) obj).m141004h();
        return obj;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13468h(Object obj, int i, int i2) {
        ((jcx0) obj).m141006j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13469i(Object obj, int i, long j) {
        ((jcx0) obj).m141006j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void mo13470j(Object obj, int i, Object obj2) {
        ((jcx0) obj).m141006j((i << 3) | 3, obj2);
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13471k(Object obj, int i, zzgyl zzgylVar) {
        ((jcx0) obj).m141006j((i << 3) | 2, zzgylVar);
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13472l(Object obj, int i, long j) {
        ((jcx0) obj).m141006j(i << 3, Long.valueOf(j));
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: m */
    public final void mo13473m(Object obj) {
        ((AbstractC2222p5) obj).zzc.m141004h();
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo13474n(Object obj, Object obj2) {
        ((AbstractC2222p5) obj).zzc = (jcx0) obj2;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo13475o(Object obj, Object obj2) {
        ((AbstractC2222p5) obj).zzc = (jcx0) obj2;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: q */
    public final boolean mo13476q(kbx0 kbx0Var) {
        return false;
    }

    @Override // p149l.icx0
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo13477r(Object obj, z7x0 z7x0Var) throws IOException {
        ((jcx0) obj).m141007k(z7x0Var);
    }
}
