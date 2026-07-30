package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import p153l.a7h0;
import p153l.aq0;
import p153l.bq0;
import p153l.by3;
import p153l.cq0;
import p153l.d7f;
import p153l.d7h0;
import p153l.db5;
import p153l.dq0;
import p153l.esj0;
import p153l.fsd;
import p153l.hsb;
import p153l.lq0;
import p153l.mq0;
import p153l.n0f;
import p153l.oq0;
import p153l.phm;
import p153l.qmd;
import p153l.qvb0;
import p153l.rce;
import p153l.shm;
import p153l.vqe0;
import p153l.w6e;
import p153l.xc80;
import p153l.xp0;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class AnimatedFactoryV2Impl implements dq0 {

    /* JADX INFO: renamed from: a */
    public final xc80 f6435a;

    /* JADX INFO: renamed from: b */
    public final d7f f6436b;

    /* JADX INFO: renamed from: c */
    public final hsb<by3, db5> f6437c;

    /* JADX INFO: renamed from: d */
    public final boolean f6438d;

    /* JADX INFO: renamed from: e */
    public lq0 f6439e;

    /* JADX INFO: renamed from: f */
    public bq0 f6440f;

    /* JADX INFO: renamed from: g */
    public cq0 f6441g;

    /* JADX INFO: renamed from: h */
    public rce f6442h;

    /* JADX INFO: renamed from: i */
    public vqe0 f6443i;

    /* JADX INFO: renamed from: j */
    public int f6444j;

    /* JADX INFO: renamed from: k */
    public final boolean f6445k;

    /* JADX INFO: renamed from: l */
    public int f6446l;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    public class C1628a implements shm {
        public C1628a() {
        }

        @Override // p153l.shm
        /* JADX INFO: renamed from: a */
        public db5 mo8431a(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
            return AnimatedFactoryV2Impl.this.m8430n().mo155301b(n0fVar, phmVar, phmVar.f152456i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    public class C1629b implements bq0 {
        public C1629b() {
        }

        @Override // p153l.bq0
        /* JADX INFO: renamed from: a */
        public xp0 mo8432a(oq0 oq0Var, Rect rect) {
            return new aq0(AnimatedFactoryV2Impl.this.m8429m(), oq0Var, rect, AnimatedFactoryV2Impl.this.f6438d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    public class C1630c implements bq0 {
        public C1630c() {
        }

        @Override // p153l.bq0
        /* JADX INFO: renamed from: a */
        public xp0 mo8432a(oq0 oq0Var, Rect rect) {
            return new aq0(AnimatedFactoryV2Impl.this.m8429m(), oq0Var, rect, AnimatedFactoryV2Impl.this.f6438d);
        }
    }

    @w6e
    public AnimatedFactoryV2Impl(xc80 xc80Var, d7f d7fVar, hsb<by3, db5> hsbVar, boolean z, boolean z2, int i, int i2, vqe0 vqe0Var) {
        this.f6435a = xc80Var;
        this.f6436b = d7fVar;
        this.f6437c = hsbVar;
        this.f6444j = i;
        this.f6445k = z2;
        this.f6438d = z;
        this.f6443i = vqe0Var;
        this.f6446l = i2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Integer m8418e() {
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Integer m8419f() {
        return 3;
    }

    @Override // p153l.dq0
    /* JADX INFO: renamed from: a */
    public rce mo8423a(Context context) {
        if (this.f6442h == null) {
            this.f6442h = m8427k();
        }
        return this.f6442h;
    }

    @Override // p153l.dq0
    /* JADX INFO: renamed from: b */
    public shm mo8424b() {
        return new shm() { // from class: l.fq0
            @Override // p153l.shm
            /* JADX INFO: renamed from: a */
            public final db5 mo8431a(n0f n0fVar, int i, qvb0 qvb0Var, phm phmVar) {
                return this.f100236a.m8430n().mo155300a(n0fVar, phmVar, phmVar.f152456i);
            }
        };
    }

    @Override // p153l.dq0
    /* JADX INFO: renamed from: c */
    public shm mo8425c() {
        return new C1628a();
    }

    /* JADX INFO: renamed from: j */
    public final lq0 m8426j() {
        return new mq0(new C1630c(), this.f6435a, this.f6445k);
    }

    /* JADX INFO: renamed from: k */
    public final qmd m8427k() {
        a7h0 a7h0Var = new a7h0() { // from class: l.gq0
            @Override // p153l.a7h0
            public final Object get() {
                return AnimatedFactoryV2Impl.m8418e();
            }
        };
        ExecutorService fsdVar = this.f6443i;
        if (fsdVar == null) {
            fsdVar = new fsd(this.f6436b.getDecodeExecutor());
        }
        a7h0 a7h0Var2 = new a7h0() { // from class: l.hq0
            @Override // p153l.a7h0
            public final Object get() {
                return AnimatedFactoryV2Impl.m8419f();
            }
        };
        a7h0<Boolean> a7h0Var3 = d7h0.f85513b;
        return new qmd(m8428l(), esj0.m122371v(), fsdVar, RealtimeSinceBootClock.get(), this.f6435a, this.f6437c, a7h0Var, a7h0Var2, a7h0Var3, d7h0.m114734a(Boolean.valueOf(this.f6445k)), d7h0.m114734a(Boolean.valueOf(this.f6438d)), d7h0.m114734a(Integer.valueOf(this.f6444j)), d7h0.m114734a(Integer.valueOf(this.f6446l)));
    }

    /* JADX INFO: renamed from: l */
    public final bq0 m8428l() {
        if (this.f6440f == null) {
            this.f6440f = new C1629b();
        }
        return this.f6440f;
    }

    /* JADX INFO: renamed from: m */
    public final cq0 m8429m() {
        if (this.f6441g == null) {
            this.f6441g = new cq0();
        }
        return this.f6441g;
    }

    /* JADX INFO: renamed from: n */
    public final lq0 m8430n() {
        if (this.f6439e == null) {
            this.f6439e = m8426j();
        }
        return this.f6439e;
    }
}
