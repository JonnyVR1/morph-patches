package p002l;

import android.content.Context;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;
import l.tb1;
import l.vdt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iu00 implements jxl {

    /* JADX INFO: renamed from: a */
    public q0f f13408a;

    public iu00(Context context) {
        if (vdt.b(1) && ypv.k().k7()) {
            tb1.b();
        }
        q0f q0fVar = new q0f(context);
        this.f13408a = q0fVar;
        q0fVar.m20776a(new st00(q0fVar));
        q0f q0fVar2 = this.f13408a;
        q0fVar2.m20780e(new hw00(q0fVar2));
        q0f q0fVar3 = this.f13408a;
        q0fVar3.m20777b(new MomoEffectEngine(q0fVar3));
        q0f q0fVar4 = this.f13408a;
        q0fVar4.m20778c(new eu00(q0fVar4));
        this.f13408a.m20779d(new hy00(this.f13408a));
        q0f q0fVar5 = this.f13408a;
        q0fVar5.m20781f(new hx00(context, q0fVar5));
        this.f13408a.m20782g();
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: a */
    public bxl mo15379a() {
        return this.f13408a.f17746e;
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: b */
    public kql mo15380b() {
        return this.f13408a.f17747f;
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: c */
    public kxl mo15381c() {
        return this.f13408a.f17749h;
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: d */
    public oxl mo15382d() {
        return this.f13408a.f17748g;
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: e */
    public exl mo15383e() {
        return this.f13408a.f17745d;
    }

    @Override // p002l.jxl
    /* JADX INFO: renamed from: f */
    public zwl mo15384f() {
        return this.f13408a.f17744c;
    }

    @Override // p002l.jxl
    public void onPause() {
        q0f q0fVar = this.f13408a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.f17744c.m22659i1();
        this.f13408a.f17749h.m14898j();
        this.f13408a.f17748g.m14935l();
    }

    @Override // p002l.jxl
    public void onResume() {
        q0f q0fVar = this.f13408a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.f17749h.m14899k();
        this.f13408a.f17748g.onResume();
    }

    @Override // p002l.jxl
    public void release() {
        q0f q0fVar = this.f13408a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.m20783h();
    }
}
