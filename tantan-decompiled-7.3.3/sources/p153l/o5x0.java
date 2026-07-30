package p153l;

import com.google.android.gms.internal.ads.C2276t4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class o5x0 implements yww0 {

    /* JADX INFO: renamed from: a */
    public final String f145121a;

    /* JADX INFO: renamed from: b */
    public final Class f145122b;

    /* JADX INFO: renamed from: c */
    public final zzgus f145123c;

    /* JADX INFO: renamed from: d */
    public final lkx0 f145124d;

    public o5x0(String str, Class cls, zzgus zzgusVar, lkx0 lkx0Var) {
        this.f145124d = lkx0Var;
        this.f145121a = str;
        this.f145122b = cls;
        this.f145123c = zzgusVar;
    }

    /* JADX INFO: renamed from: c */
    public static yww0 m166180c(String str, Class cls, zzgus zzgusVar, lkx0 lkx0Var) {
        return new o5x0(str, cls, zzgusVar, lkx0Var);
    }

    @Override // p153l.yww0
    /* JADX INFO: renamed from: a */
    public final Object mo166181a(zzgyl zzgylVar) throws GeneralSecurityException {
        return g6x0.m129300a().m129302c(j6x0.m143725d().m143726a(c7x0.m108336a(this.f145121a, zzgylVar, this.f145123c, zzgvz.RAW, null), www0.m208321a()), this.f145122b);
    }

    @Override // p153l.yww0
    /* JADX INFO: renamed from: b */
    public final C2276t4 mo166182b(zzgyl zzgylVar) throws GeneralSecurityException {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r(this.f145121a);
        edx0VarM13397L.m120527s(zzgylVar);
        edx0VarM13397L.m120525q(zzgvz.RAW);
        l7x0 l7x0VarM143729e = j6x0.m143725d().m143729e(w5x0.m204996b().m204997a(j6x0.m143725d().m143728c(d7x0.m114761a((C2284u4) edx0VarM13397L.m185950m())), null), c7x0.class, www0.m208321a());
        zcx0 zcx0VarM13373L = C2276t4.m13373L();
        c7x0 c7x0Var = (c7x0) l7x0VarM143729e;
        zcx0VarM13373L.m219268r(c7x0Var.m108341f());
        zcx0VarM13373L.m219269s(c7x0Var.m108339d());
        zcx0VarM13373L.m219267q(c7x0Var.m108337b());
        return (C2276t4) zcx0VarM13373L.m185950m();
    }

    @Override // p153l.yww0
    public final Class zzb() {
        return this.f145122b;
    }
}
