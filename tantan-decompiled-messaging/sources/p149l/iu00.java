package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.MomoEffectEngine;

/* JADX INFO: loaded from: classes4.dex */
public class iu00 implements jxl {

    /* JADX INFO: renamed from: a */
    public q0f f114963a;

    public iu00(Context context) {
        if (vdt.m198092b(1) && ypv.m215672k().m195874k7()) {
            tb1.m187789b();
        }
        q0f q0fVar = new q0f(context);
        this.f114963a = q0fVar;
        q0fVar.m172321a(new st00(q0fVar));
        q0f q0fVar2 = this.f114963a;
        q0fVar2.m172325e(new hw00(q0fVar2));
        q0f q0fVar3 = this.f114963a;
        q0fVar3.m172322b(new MomoEffectEngine(q0fVar3));
        q0f q0fVar4 = this.f114963a;
        q0fVar4.m172323c(new eu00(q0fVar4));
        this.f114963a.m172324d(new hy00(this.f114963a));
        q0f q0fVar5 = this.f114963a;
        q0fVar5.m172326f(new hx00(context, q0fVar5));
        this.f114963a.m172327g();
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: a */
    public bxl mo138335a() {
        return this.f114963a.f152053e;
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: b */
    public kql mo138336b() {
        return this.f114963a.f152054f;
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: c */
    public kxl mo138337c() {
        return this.f114963a.f152056h;
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: d */
    public oxl mo138338d() {
        return this.f114963a.f152055g;
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: e */
    public exl mo138339e() {
        return this.f114963a.f152052d;
    }

    @Override // p149l.jxl
    /* JADX INFO: renamed from: f */
    public zwl mo138340f() {
        return this.f114963a.f152051c;
    }

    @Override // p149l.jxl
    public void onPause() {
        q0f q0fVar = this.f114963a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.f152051c.m185829i1();
        this.f114963a.f152056h.m133291j();
        this.f114963a.f152055g.m133482l();
    }

    @Override // p149l.jxl
    public void onResume() {
        q0f q0fVar = this.f114963a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.f152056h.m133292k();
        this.f114963a.f152055g.onResume();
    }

    @Override // p149l.jxl
    public void release() {
        q0f q0fVar = this.f114963a;
        if (q0fVar == null) {
            return;
        }
        q0fVar.m172328h();
    }
}
