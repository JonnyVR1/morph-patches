package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher;

/* JADX INFO: loaded from: classes13.dex */
public class r0f {

    /* JADX INFO: renamed from: a */
    public final Context f157166a;

    /* JADX INFO: renamed from: b */
    public final f4m f157167b;

    /* JADX INFO: renamed from: c */
    public rt00 f157168c;

    /* JADX INFO: renamed from: d */
    public iw00 f157169d;

    /* JADX INFO: renamed from: e */
    public au00 f157170e;

    /* JADX INFO: renamed from: f */
    public fu00 f157171f;

    /* JADX INFO: renamed from: g */
    public iy00 f157172g;

    /* JADX INFO: renamed from: h */
    public gx00 f157173h;

    public r0f(Context context) {
        this.f157166a = context;
        TTLivePusher.C12461b c12461b = new TTLivePusher.C12461b();
        c12461b.m68594e(ypv.m215672k().m195696O4());
        c12461b.m68596g(w8u.m202222y(ypv.f199493a.m199329V()));
        c12461b.m68595f(ypv.f199493a.m199364p().m195824e5());
        this.f157167b = new TTLivePusher(context.getApplicationContext(), c12461b, TTLivePusher.LivePusherType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: a */
    public void m177389a(rt00 rt00Var) {
        this.f157168c = rt00Var;
    }

    /* JADX INFO: renamed from: b */
    public void m177390b(au00 au00Var) {
        this.f157170e = au00Var;
    }

    /* JADX INFO: renamed from: c */
    public void m177391c(fu00 fu00Var) {
        this.f157171f = fu00Var;
    }

    /* JADX INFO: renamed from: d */
    public void m177392d(iy00 iy00Var) {
        this.f157172g = iy00Var;
    }

    /* JADX INFO: renamed from: e */
    public void m177393e(iw00 iw00Var) {
        this.f157169d = iw00Var;
    }

    /* JADX INFO: renamed from: f */
    public void m177394f(gx00 gx00Var) {
        this.f157173h = gx00Var;
    }

    /* JADX INFO: renamed from: g */
    public void m177395g() {
        this.f157168c.m180759X0();
        this.f157169d.m138706T0();
        this.f157170e.m98897Y0();
        this.f157171f.m123130a();
        this.f157172g.m138918f();
        this.f157173h.m128523g();
    }

    /* JADX INFO: renamed from: h */
    public void m177396h() {
        if (this.f157167b != null) {
            this.f157172g.m138925m();
            this.f157173h.m128526j();
            this.f157171f.m123132c();
            this.f157167b.release();
            this.f157168c.m180766e1();
            this.f157168c.m180764c1();
            this.f157169d.m138710X0();
            this.f157170e.m98900b1();
        }
    }
}
