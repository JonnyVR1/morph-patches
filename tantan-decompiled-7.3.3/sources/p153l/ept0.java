package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class ept0 implements nyu0 {

    /* JADX INFO: renamed from: a */
    public final Context f95267a;

    /* JADX INFO: renamed from: b */
    public final grs0 f95268b;

    /* JADX INFO: renamed from: c */
    public final ont0 f95269c;

    /* JADX INFO: renamed from: d */
    public final ept0 f95270d = this;

    /* JADX INFO: renamed from: e */
    public final dqx0 f95271e;

    /* JADX INFO: renamed from: f */
    public final dqx0 f95272f;

    /* JADX INFO: renamed from: g */
    public final dqx0 f95273g;

    /* JADX INFO: renamed from: h */
    public final dqx0 f95274h;

    public /* synthetic */ ept0(ont0 ont0Var, Context context, grs0 grs0Var, dpt0 dpt0Var) {
        this.f95269c = ont0Var;
        this.f95267a = context;
        this.f95268b = grs0Var;
        upx0 upx0VarM202347a = vpx0.m202347a(this);
        this.f95271e = upx0VarM202347a;
        upx0 upx0VarM202347a2 = vpx0.m202347a(grs0Var);
        this.f95272f = upx0VarM202347a2;
        jyu0 jyu0Var = new jyu0(upx0VarM202347a2);
        this.f95273g = jyu0Var;
        this.f95274h = tpx0.m192218b(new lyu0(upx0VarM202347a, jyu0Var));
    }

    @Override // p153l.nyu0
    public final eyu0 zzb() {
        return new yot0(this.f95269c, this.f95270d, null);
    }

    @Override // p153l.nyu0
    public final kyu0 zzd() {
        return (kyu0) this.f95274h.zzb();
    }
}
