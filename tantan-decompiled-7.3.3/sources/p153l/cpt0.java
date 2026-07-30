package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class cpt0 implements myu0 {

    /* JADX INFO: renamed from: a */
    public final ont0 f83025a;

    /* JADX INFO: renamed from: b */
    public Context f83026b;

    /* JADX INFO: renamed from: c */
    public grs0 f83027c;

    public /* synthetic */ cpt0(ont0 ont0Var, bpt0 bpt0Var) {
        this.f83025a = ont0Var;
    }

    @Override // p153l.myu0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ myu0 mo111830a(Context context) {
        context.getClass();
        this.f83026b = context;
        return this;
    }

    @Override // p153l.myu0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ myu0 mo111831b(grs0 grs0Var) {
        grs0Var.getClass();
        this.f83027c = grs0Var;
        return this;
    }

    @Override // p153l.myu0
    public final nyu0 zzc() {
        cqx0.m112000c(this.f83026b, Context.class);
        cqx0.m112000c(this.f83027c, grs0.class);
        return new ept0(this.f83025a, this.f83026b, this.f83027c, null);
    }
}
