package p153l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class n9t0 extends t9t0 {

    /* JADX INFO: renamed from: b */
    public final Clock f140942b;

    /* JADX INFO: renamed from: c */
    public final n9t0 f140943c = this;

    /* JADX INFO: renamed from: d */
    public final dqx0 f140944d;

    /* JADX INFO: renamed from: e */
    public final dqx0 f140945e;

    /* JADX INFO: renamed from: f */
    public final dqx0 f140946f;

    /* JADX INFO: renamed from: g */
    public final dqx0 f140947g;

    /* JADX INFO: renamed from: h */
    public final dqx0 f140948h;

    /* JADX INFO: renamed from: i */
    public final dqx0 f140949i;

    /* JADX INFO: renamed from: j */
    public final dqx0 f140950j;

    /* JADX INFO: renamed from: k */
    public final dqx0 f140951k;

    public /* synthetic */ n9t0(Context context, Clock clock, grw0 grw0Var, s9t0 s9t0Var, m9t0 m9t0Var) {
        this.f140942b = clock;
        upx0 upx0VarM202347a = vpx0.m202347a(context);
        this.f140944d = upx0VarM202347a;
        upx0 upx0VarM202347a2 = vpx0.m202347a(grw0Var);
        this.f140945e = upx0VarM202347a2;
        upx0 upx0VarM202347a3 = vpx0.m202347a(s9t0Var);
        this.f140946f = upx0VarM202347a3;
        this.f140947g = tpx0.m192218b(new y8t0(upx0VarM202347a, upx0VarM202347a2, upx0VarM202347a3));
        upx0 upx0VarM202347a4 = vpx0.m202347a(clock);
        this.f140948h = upx0VarM202347a4;
        dqx0 dqx0VarM192218b = tpx0.m192218b(new a9t0(upx0VarM202347a4, upx0VarM202347a2, upx0VarM202347a3));
        this.f140949i = dqx0VarM192218b;
        c9t0 c9t0Var = new c9t0(upx0VarM202347a4, dqx0VarM192218b);
        this.f140950j = c9t0Var;
        this.f140951k = tpx0.m192218b(new y9t0(upx0VarM202347a, c9t0Var));
    }

    @Override // p153l.t9t0
    /* JADX INFO: renamed from: a */
    public final x8t0 mo162047a() {
        return (x8t0) this.f140947g.zzb();
    }

    @Override // p153l.t9t0
    /* JADX INFO: renamed from: b */
    public final b9t0 mo162048b() {
        return new b9t0(this.f140942b, (z8t0) this.f140949i.zzb());
    }

    @Override // p153l.t9t0
    /* JADX INFO: renamed from: c */
    public final x9t0 mo162049c() {
        return (x9t0) this.f140951k.zzb();
    }
}
