package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import p149l.bjj0;
import p149l.bq0;
import p149l.cfm;
import p149l.cx3;
import p149l.da5;
import p149l.eq0;
import p149l.fq0;
import p149l.gq0;
import p149l.hq0;
import p149l.i5e;
import p149l.jze;
import p149l.kld;
import p149l.mnb0;
import p149l.nbe;
import p149l.pq0;
import p149l.qie0;
import p149l.qq0;
import p149l.qqd;
import p149l.r480;
import p149l.sq0;
import p149l.syg0;
import p149l.tqb;
import p149l.vyg0;
import p149l.x5f;
import p149l.zem;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class AnimatedFactoryV2Impl implements hq0 {

    /* JADX INFO: renamed from: a */
    public final r480 f6398a;

    /* JADX INFO: renamed from: b */
    public final x5f f6399b;

    /* JADX INFO: renamed from: c */
    public final tqb<cx3, da5> f6400c;

    /* JADX INFO: renamed from: d */
    public final boolean f6401d;

    /* JADX INFO: renamed from: e */
    public pq0 f6402e;

    /* JADX INFO: renamed from: f */
    public fq0 f6403f;

    /* JADX INFO: renamed from: g */
    public gq0 f6404g;

    /* JADX INFO: renamed from: h */
    public nbe f6405h;

    /* JADX INFO: renamed from: i */
    public qie0 f6406i;

    /* JADX INFO: renamed from: j */
    public int f6407j;

    /* JADX INFO: renamed from: k */
    public final boolean f6408k;

    /* JADX INFO: renamed from: l */
    public int f6409l;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    public class C1605a implements cfm {
        public C1605a() {
        }

        @Override // p149l.cfm
        /* JADX INFO: renamed from: a */
        public da5 mo8377a(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
            return AnimatedFactoryV2Impl.this.m8376n().mo170873b(jzeVar, zemVar, zemVar.f202846i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    public class C1606b implements fq0 {
        public C1606b() {
        }

        @Override // p149l.fq0
        /* JADX INFO: renamed from: a */
        public bq0 mo8378a(sq0 sq0Var, Rect rect) {
            return new eq0(AnimatedFactoryV2Impl.this.m8375m(), sq0Var, rect, AnimatedFactoryV2Impl.this.f6401d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    public class C1607c implements fq0 {
        public C1607c() {
        }

        @Override // p149l.fq0
        /* JADX INFO: renamed from: a */
        public bq0 mo8378a(sq0 sq0Var, Rect rect) {
            return new eq0(AnimatedFactoryV2Impl.this.m8375m(), sq0Var, rect, AnimatedFactoryV2Impl.this.f6401d);
        }
    }

    @i5e
    public AnimatedFactoryV2Impl(r480 r480Var, x5f x5fVar, tqb<cx3, da5> tqbVar, boolean z, boolean z2, int i, int i2, qie0 qie0Var) {
        this.f6398a = r480Var;
        this.f6399b = x5fVar;
        this.f6400c = tqbVar;
        this.f6407j = i;
        this.f6408k = z2;
        this.f6401d = z;
        this.f6406i = qie0Var;
        this.f6409l = i2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Integer m8364e() {
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Integer m8365f() {
        return 3;
    }

    @Override // p149l.hq0
    /* JADX INFO: renamed from: a */
    public nbe mo8369a(Context context) {
        if (this.f6405h == null) {
            this.f6405h = m8373k();
        }
        return this.f6405h;
    }

    @Override // p149l.hq0
    /* JADX INFO: renamed from: b */
    public cfm mo8370b() {
        return new cfm() { // from class: l.jq0
            @Override // p149l.cfm
            /* JADX INFO: renamed from: a */
            public final da5 mo8377a(jze jzeVar, int i, mnb0 mnb0Var, zem zemVar) {
                return this.f119246a.m8376n().mo170872a(jzeVar, zemVar, zemVar.f202846i);
            }
        };
    }

    @Override // p149l.hq0
    /* JADX INFO: renamed from: c */
    public cfm mo8371c() {
        return new C1605a();
    }

    /* JADX INFO: renamed from: j */
    public final pq0 m8372j() {
        return new qq0(new C1607c(), this.f6398a, this.f6408k);
    }

    /* JADX INFO: renamed from: k */
    public final kld m8373k() {
        syg0 syg0Var = new syg0() { // from class: l.kq0
            @Override // p149l.syg0
            public final Object get() {
                return AnimatedFactoryV2Impl.m8364e();
            }
        };
        ExecutorService qqdVar = this.f6406i;
        if (qqdVar == null) {
            qqdVar = new qqd(this.f6399b.getDecodeExecutor());
        }
        syg0 syg0Var2 = new syg0() { // from class: l.lq0
            @Override // p149l.syg0
            public final Object get() {
                return AnimatedFactoryV2Impl.m8365f();
            }
        };
        syg0<Boolean> syg0Var3 = vyg0.f183524b;
        return new kld(m8374l(), bjj0.m102185v(), qqdVar, RealtimeSinceBootClock.get(), this.f6398a, this.f6400c, syg0Var, syg0Var2, syg0Var3, vyg0.m200647a(Boolean.valueOf(this.f6408k)), vyg0.m200647a(Boolean.valueOf(this.f6401d)), vyg0.m200647a(Integer.valueOf(this.f6407j)), vyg0.m200647a(Integer.valueOf(this.f6409l)));
    }

    /* JADX INFO: renamed from: l */
    public final fq0 m8374l() {
        if (this.f6403f == null) {
            this.f6403f = new C1606b();
        }
        return this.f6403f;
    }

    /* JADX INFO: renamed from: m */
    public final gq0 m8375m() {
        if (this.f6404g == null) {
            this.f6404g = new gq0();
        }
        return this.f6404g;
    }

    /* JADX INFO: renamed from: n */
    public final pq0 m8376n() {
        if (this.f6402e == null) {
            this.f6402e = m8372j();
        }
        return this.f6402e;
    }
}
