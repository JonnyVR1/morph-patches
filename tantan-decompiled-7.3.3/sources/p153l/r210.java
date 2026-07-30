package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;

/* JADX INFO: loaded from: classes4.dex */
public class r210 implements c0m {

    /* JADX INFO: renamed from: a */
    public u1f f160871a;

    public r210(Context context) {
        if (wft.m206159b(1) && zrv.m221193k().m203661k7()) {
            ac1.m96797b();
        }
        u1f u1fVar = new u1f(context);
        this.f160871a = u1fVar;
        u1fVar.m193961a(new b210(u1fVar));
        u1f u1fVar2 = this.f160871a;
        u1fVar2.m193965e(new p410(u1fVar2));
        u1f u1fVar3 = this.f160871a;
        u1fVar3.m193962b(new MomoEffectEngine(u1fVar3));
        u1f u1fVar4 = this.f160871a;
        u1fVar4.m193963c(new n210(u1fVar4));
        this.f160871a.m193964d(new r610(this.f160871a));
        u1f u1fVar5 = this.f160871a;
        u1fVar5.m193966f(new r510(context, u1fVar5));
        this.f160871a.m193967g();
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: a */
    public uzl mo107430a() {
        return this.f160871a.f176996e;
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: b */
    public wsl mo107431b() {
        return this.f160871a.f176997f;
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: c */
    public d0m mo107432c() {
        return this.f160871a.f176999h;
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: d */
    public h0m mo107433d() {
        return this.f160871a.f176998g;
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: e */
    public xzl mo107434e() {
        return this.f160871a.f176995d;
    }

    @Override // p153l.c0m
    /* JADX INFO: renamed from: f */
    public szl mo107435f() {
        return this.f160871a.f176994c;
    }

    @Override // p153l.c0m
    public void onPause() {
        u1f u1fVar = this.f160871a;
        if (u1fVar == null) {
            return;
        }
        u1fVar.f176994c.m101592i1();
        this.f160871a.f176999h.m179843j();
        this.f160871a.f176998g.m179988l();
    }

    @Override // p153l.c0m
    public void onResume() {
        u1f u1fVar = this.f160871a;
        if (u1fVar == null) {
            return;
        }
        u1fVar.f176999h.m179844k();
        this.f160871a.f176998g.onResume();
    }

    @Override // p153l.c0m
    public void release() {
        u1f u1fVar = this.f160871a;
        if (u1fVar == null) {
            return;
        }
        u1fVar.m193968h();
    }
}
