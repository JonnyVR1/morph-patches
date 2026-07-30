package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;

/* JADX INFO: loaded from: classes4.dex */
public class u1f {

    /* JADX INFO: renamed from: a */
    public final Context f176992a;

    /* JADX INFO: renamed from: b */
    public final v6m f176993b;

    /* JADX INFO: renamed from: c */
    public b210 f176994c;

    /* JADX INFO: renamed from: d */
    public p410 f176995d;

    /* JADX INFO: renamed from: e */
    public MomoEffectEngine f176996e;

    /* JADX INFO: renamed from: f */
    public n210 f176997f;

    /* JADX INFO: renamed from: g */
    public r610 f176998g;

    /* JADX INFO: renamed from: h */
    public r510 f176999h;

    public u1f(Context context) {
        this.f176992a = context;
        TTLivePusher.C12624b c12624b = new TTLivePusher.C12624b();
        c12624b.m69777e(zrv.m221193k().m203483O4());
        c12624b.m69779g(xau.m209915y(zrv.f205799a.m207651V()));
        c12624b.m69778f(zrv.f205799a.m207686p().m203611e5());
        this.f176993b = new TTLivePusher(context.getApplicationContext(), c12624b, TTLivePusher.LivePusherType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: a */
    public void m193961a(b210 b210Var) {
        this.f176994c = b210Var;
    }

    /* JADX INFO: renamed from: b */
    public void m193962b(MomoEffectEngine momoEffectEngine) {
        this.f176996e = momoEffectEngine;
    }

    /* JADX INFO: renamed from: c */
    public void m193963c(n210 n210Var) {
        this.f176997f = n210Var;
    }

    /* JADX INFO: renamed from: d */
    public void m193964d(r610 r610Var) {
        this.f176998g = r610Var;
    }

    /* JADX INFO: renamed from: e */
    public void m193965e(p410 p410Var) {
        this.f176995d = p410Var;
    }

    /* JADX INFO: renamed from: f */
    public void m193966f(r510 r510Var) {
        this.f176999h = r510Var;
    }

    /* JADX INFO: renamed from: g */
    public void m193967g() {
        this.f176994c.m101584b1();
        this.f176995d.m170515V0();
        this.f176996e.m73047Y0();
        this.f176997f.m161150c();
        this.f176998g.m179983g();
        this.f176999h.m179842i();
    }

    /* JADX INFO: renamed from: h */
    public void m193968h() {
        if (this.f176993b != null) {
            this.f176998g.m179989m();
            this.f176999h.m179845l();
            this.f176997f.m161151d();
            this.f176996e.m73055e1();
            this.f176996e.stopSurroundMusic();
            this.f176993b.release();
            this.f176994c.m101597m1();
            this.f176994c.m101594k1();
            this.f176995d.m170521a1();
            this.f176996e.m73051b1();
        }
    }
}
