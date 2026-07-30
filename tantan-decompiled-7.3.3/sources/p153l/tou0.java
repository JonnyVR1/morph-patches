package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class tou0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f175439a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f175440b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f175441c;

    public tou0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f175439a = kqx0Var;
        this.f175440b = kqx0Var2;
        this.f175441c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        bts0 bts0Var = (bts0) this.f175439a.zzb();
        Clock clock = (Clock) this.f175440b.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new sou0(bts0Var, clock, xvw0Var);
    }
}
