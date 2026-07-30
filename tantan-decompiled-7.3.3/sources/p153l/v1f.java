package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher;

/* JADX INFO: loaded from: classes9.dex */
public class v1f {

    /* JADX INFO: renamed from: a */
    public final Context f181961a;

    /* JADX INFO: renamed from: b */
    public final v6m f181962b;

    /* JADX INFO: renamed from: c */
    public a210 f181963c;

    /* JADX INFO: renamed from: d */
    public q410 f181964d;

    /* JADX INFO: renamed from: e */
    public j210 f181965e;

    /* JADX INFO: renamed from: f */
    public o210 f181966f;

    /* JADX INFO: renamed from: g */
    public s610 f181967g;

    /* JADX INFO: renamed from: h */
    public q510 f181968h;

    public v1f(Context context) {
        this.f181961a = context;
        TTLivePusher.C12624b c12624b = new TTLivePusher.C12624b();
        c12624b.m69777e(zrv.m221193k().m203483O4());
        c12624b.m69779g(xau.m209915y(zrv.f205799a.m207651V()));
        c12624b.m69778f(zrv.f205799a.m207686p().m203611e5());
        this.f181962b = new TTLivePusher(context.getApplicationContext(), c12624b, TTLivePusher.LivePusherType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: a */
    public void m199009a(a210 a210Var) {
        this.f181963c = a210Var;
    }

    /* JADX INFO: renamed from: b */
    public void m199010b(j210 j210Var) {
        this.f181965e = j210Var;
    }

    /* JADX INFO: renamed from: c */
    public void m199011c(o210 o210Var) {
        this.f181966f = o210Var;
    }

    /* JADX INFO: renamed from: d */
    public void m199012d(s610 s610Var) {
        this.f181967g = s610Var;
    }

    /* JADX INFO: renamed from: e */
    public void m199013e(q410 q410Var) {
        this.f181964d = q410Var;
    }

    /* JADX INFO: renamed from: f */
    public void m199014f(q510 q510Var) {
        this.f181968h = q510Var;
    }

    /* JADX INFO: renamed from: g */
    public void m199015g() {
        this.f181963c.m95598X0();
        this.f181964d.m175180T0();
        this.f181965e.m143174Y0();
        this.f181966f.m165686a();
        this.f181967g.m184837f();
        this.f181968h.m175283g();
    }

    /* JADX INFO: renamed from: h */
    public void m199016h() {
        if (this.f181962b != null) {
            this.f181967g.m184844m();
            this.f181968h.m175286j();
            this.f181966f.m165688c();
            this.f181962b.release();
            this.f181963c.m95606e1();
            this.f181963c.m95604c1();
            this.f181964d.m175184X0();
            this.f181965e.m143177b1();
        }
    }
}
