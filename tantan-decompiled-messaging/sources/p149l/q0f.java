package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;

/* JADX INFO: loaded from: classes4.dex */
public class q0f {

    /* JADX INFO: renamed from: a */
    public final Context f152049a;

    /* JADX INFO: renamed from: b */
    public final f4m f152050b;

    /* JADX INFO: renamed from: c */
    public st00 f152051c;

    /* JADX INFO: renamed from: d */
    public hw00 f152052d;

    /* JADX INFO: renamed from: e */
    public MomoEffectEngine f152053e;

    /* JADX INFO: renamed from: f */
    public eu00 f152054f;

    /* JADX INFO: renamed from: g */
    public hy00 f152055g;

    /* JADX INFO: renamed from: h */
    public hx00 f152056h;

    public q0f(Context context) {
        this.f152049a = context;
        TTLivePusher.C12461b c12461b = new TTLivePusher.C12461b();
        c12461b.m68594e(ypv.m215672k().m195696O4());
        c12461b.m68596g(w8u.m202222y(ypv.f199493a.m199329V()));
        c12461b.m68595f(ypv.f199493a.m199364p().m195824e5());
        this.f152050b = new TTLivePusher(context.getApplicationContext(), c12461b, TTLivePusher.LivePusherType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: a */
    public void m172321a(st00 st00Var) {
        this.f152051c = st00Var;
    }

    /* JADX INFO: renamed from: b */
    public void m172322b(MomoEffectEngine momoEffectEngine) {
        this.f152053e = momoEffectEngine;
    }

    /* JADX INFO: renamed from: c */
    public void m172323c(eu00 eu00Var) {
        this.f152054f = eu00Var;
    }

    /* JADX INFO: renamed from: d */
    public void m172324d(hy00 hy00Var) {
        this.f152055g = hy00Var;
    }

    /* JADX INFO: renamed from: e */
    public void m172325e(hw00 hw00Var) {
        this.f152052d = hw00Var;
    }

    /* JADX INFO: renamed from: f */
    public void m172326f(hx00 hx00Var) {
        this.f152056h = hx00Var;
    }

    /* JADX INFO: renamed from: g */
    public void m172327g() {
        this.f152051c.m185821b1();
        this.f152052d.m133212V0();
        this.f152053e.m71864Y0();
        this.f152054f.m118145c();
        this.f152055g.m133477g();
        this.f152056h.m133290i();
    }

    /* JADX INFO: renamed from: h */
    public void m172328h() {
        if (this.f152050b != null) {
            this.f152055g.m133483m();
            this.f152056h.m133293l();
            this.f152054f.m118146d();
            this.f152053e.m71872e1();
            this.f152053e.stopSurroundMusic();
            this.f152050b.release();
            this.f152051c.m185834m1();
            this.f152051c.m185831k1();
            this.f152052d.m133217a1();
            this.f152053e.m71868b1();
        }
    }
}
