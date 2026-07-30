package p149l;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class brx0 {

    /* JADX INFO: renamed from: a */
    public final Context f76946a;

    /* JADX INFO: renamed from: b */
    public g6v0 f76947b;

    /* JADX INFO: renamed from: c */
    public zfw0 f76948c;

    /* JADX INFO: renamed from: d */
    public zfw0 f76949d;

    /* JADX INFO: renamed from: e */
    public zfw0 f76950e;

    /* JADX INFO: renamed from: f */
    public zfw0 f76951f;

    /* JADX INFO: renamed from: g */
    public zfw0 f76952g;

    /* JADX INFO: renamed from: h */
    public yew0 f76953h;

    /* JADX INFO: renamed from: i */
    public Looper f76954i;

    /* JADX INFO: renamed from: j */
    public qux0 f76955j;

    /* JADX INFO: renamed from: k */
    public int f76956k;

    /* JADX INFO: renamed from: l */
    public boolean f76957l;

    /* JADX INFO: renamed from: m */
    public a6y0 f76958m;

    /* JADX INFO: renamed from: n */
    public long f76959n;

    /* JADX INFO: renamed from: o */
    public long f76960o;

    /* JADX INFO: renamed from: p */
    public boolean f76961p;

    /* JADX INFO: renamed from: q */
    public boolean f76962q;

    /* JADX INFO: renamed from: r */
    public cox0 f76963r;

    public brx0(final Context context, w8t0 w8t0Var) {
        ypx0 ypx0Var = new ypx0(w8t0Var);
        cqx0 cqx0Var = new cqx0(context);
        zfw0 zfw0Var = new zfw0() { // from class: l.hqx0
            @Override // p149l.zfw0
            public final Object zza() {
                return new fwy0(context);
            }
        };
        lqx0 lqx0Var = new zfw0() { // from class: l.lqx0
            @Override // p149l.zfw0
            public final Object zza() {
                return new gox0();
            }
        };
        qqx0 qqx0Var = new qqx0(context);
        tqx0 tqx0Var = new yew0() { // from class: l.tqx0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return new cey0((g6v0) obj);
            }
        };
        context.getClass();
        this.f76946a = context;
        this.f76948c = ypx0Var;
        this.f76949d = cqx0Var;
        this.f76950e = zfw0Var;
        this.f76951f = lqx0Var;
        this.f76952g = qqx0Var;
        this.f76953h = tqx0Var;
        this.f76954i = ggw0.m126056M();
        this.f76955j = qux0.f156553b;
        this.f76956k = 1;
        this.f76957l = true;
        this.f76958m = a6y0.f67816g;
        this.f76963r = new cox0(0.97f, 1.03f, 1000L, 1.0E-7f, ggw0.m126049F(20L), ggw0.m126049F(500L), 0.999f, null);
        this.f76947b = g6v0.f101315a;
        this.f76959n = 500L;
        this.f76960o = 2000L;
        this.f76961p = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ dqy0 m103603a(Context context) {
        return new rpy0(context, new e5r0());
    }
}
