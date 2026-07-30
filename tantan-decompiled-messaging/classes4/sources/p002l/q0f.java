package p002l;

import android.content.Context;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;
import com.p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher;
import l.f4m;
import l.w8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q0f {

    /* JADX INFO: renamed from: a */
    public final Context f17742a;

    /* JADX INFO: renamed from: b */
    public final f4m f17743b;

    /* JADX INFO: renamed from: c */
    public st00 f17744c;

    /* JADX INFO: renamed from: d */
    public hw00 f17745d;

    /* JADX INFO: renamed from: e */
    public MomoEffectEngine f17746e;

    /* JADX INFO: renamed from: f */
    public eu00 f17747f;

    /* JADX INFO: renamed from: g */
    public hy00 f17748g;

    /* JADX INFO: renamed from: h */
    public hx00 f17749h;

    public q0f(Context context) {
        this.f17742a = context;
        TTLivePusher.b bVar = new TTLivePusher.b();
        bVar.e(ypv.k().O4());
        bVar.g(w8u.y(ypv.a.V()));
        bVar.f(ypv.a.p().e5());
        this.f17743b = new TTLivePusher(context.getApplicationContext(), bVar, TTLivePusher.LivePusherType.NEW_MOMO);
    }

    /* JADX INFO: renamed from: a */
    public void m20776a(st00 st00Var) {
        this.f17744c = st00Var;
    }

    /* JADX INFO: renamed from: b */
    public void m20777b(MomoEffectEngine momoEffectEngine) {
        this.f17746e = momoEffectEngine;
    }

    /* JADX INFO: renamed from: c */
    public void m20778c(eu00 eu00Var) {
        this.f17747f = eu00Var;
    }

    /* JADX INFO: renamed from: d */
    public void m20779d(hy00 hy00Var) {
        this.f17748g = hy00Var;
    }

    /* JADX INFO: renamed from: e */
    public void m20780e(hw00 hw00Var) {
        this.f17745d = hw00Var;
    }

    /* JADX INFO: renamed from: f */
    public void m20781f(hx00 hx00Var) {
        this.f17749h = hx00Var;
    }

    /* JADX INFO: renamed from: g */
    public void m20782g() {
        this.f17744c.m22651b1();
        this.f17745d.m14863V0();
        this.f17746e.m5242Y0();
        this.f17747f.m12702c();
        this.f17748g.m14930g();
        this.f17749h.m14897i();
    }

    /* JADX INFO: renamed from: h */
    public void m20783h() {
        if (this.f17743b != null) {
            this.f17748g.m14936m();
            this.f17749h.m14900l();
            this.f17747f.m12703d();
            this.f17746e.m5250e1();
            this.f17746e.stopSurroundMusic();
            this.f17743b.release();
            this.f17744c.m22664m1();
            this.f17744c.m22661k1();
            this.f17745d.m14868a1();
            this.f17746e.m5246b1();
        }
    }
}
