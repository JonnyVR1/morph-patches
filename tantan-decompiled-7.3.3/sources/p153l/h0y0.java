package p153l;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class h0y0 {

    /* JADX INFO: renamed from: a */
    public final Context f107340a;

    /* JADX INFO: renamed from: b */
    public mfv0 f107341b;

    /* JADX INFO: renamed from: c */
    public fpw0 f107342c;

    /* JADX INFO: renamed from: d */
    public fpw0 f107343d;

    /* JADX INFO: renamed from: e */
    public fpw0 f107344e;

    /* JADX INFO: renamed from: f */
    public fpw0 f107345f;

    /* JADX INFO: renamed from: g */
    public fpw0 f107346g;

    /* JADX INFO: renamed from: h */
    public eow0 f107347h;

    /* JADX INFO: renamed from: i */
    public Looper f107348i;

    /* JADX INFO: renamed from: j */
    public w3y0 f107349j;

    /* JADX INFO: renamed from: k */
    public int f107350k;

    /* JADX INFO: renamed from: l */
    public boolean f107351l;

    /* JADX INFO: renamed from: m */
    public gfy0 f107352m;

    /* JADX INFO: renamed from: n */
    public long f107353n;

    /* JADX INFO: renamed from: o */
    public long f107354o;

    /* JADX INFO: renamed from: p */
    public boolean f107355p;

    /* JADX INFO: renamed from: q */
    public boolean f107356q;

    /* JADX INFO: renamed from: r */
    public ixx0 f107357r;

    public h0y0(final Context context, cit0 cit0Var) {
        ezx0 ezx0Var = new ezx0(cit0Var);
        izx0 izx0Var = new izx0(context);
        fpw0 fpw0Var = new fpw0() { // from class: l.nzx0
            @Override // p153l.fpw0
            public final Object zza() {
                return new l5z0(context);
            }
        };
        rzx0 rzx0Var = new fpw0() { // from class: l.rzx0
            @Override // p153l.fpw0
            public final Object zza() {
                return new mxx0();
            }
        };
        wzx0 wzx0Var = new wzx0(context);
        zzx0 zzx0Var = new eow0() { // from class: l.zzx0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return new iny0((mfv0) obj);
            }
        };
        context.getClass();
        this.f107340a = context;
        this.f107342c = ezx0Var;
        this.f107343d = izx0Var;
        this.f107344e = fpw0Var;
        this.f107345f = rzx0Var;
        this.f107346g = wzx0Var;
        this.f107347h = zzx0Var;
        this.f107348i = mpw0.m159400M();
        this.f107349j = w3y0.f187185b;
        this.f107350k = 1;
        this.f107351l = true;
        this.f107352m = gfy0.f103970g;
        this.f107357r = new ixx0(0.97f, 1.03f, 1000L, 1.0E-7f, mpw0.m159393F(20L), mpw0.m159393F(500L), 0.999f, null);
        this.f107341b = mfv0.f136676a;
        this.f107353n = 500L;
        this.f107354o = 2000L;
        this.f107355p = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ jzy0 m133201a(Context context) {
        return new xyy0(context, new ker0());
    }
}
