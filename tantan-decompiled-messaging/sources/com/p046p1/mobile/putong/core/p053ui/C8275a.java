package com.p046p1.mobile.putong.core.p053ui;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import p149l.cr2;
import p149l.jqf0;
import p149l.lqf0;
import p149l.ohf0;
import p149l.zqf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a */
/* JADX INFO: loaded from: classes8.dex */
public class C8275a {

    /* JADX INFO: renamed from: a */
    public View f28187a;

    /* JADX INFO: renamed from: b */
    public float f28188b;

    /* JADX INFO: renamed from: c */
    public float f28189c;

    /* JADX INFO: renamed from: d */
    public float f28190d;

    /* JADX INFO: renamed from: e */
    public float f28191e;

    /* JADX INFO: renamed from: f */
    public boolean f28192f;

    /* JADX INFO: renamed from: g */
    public jqf0 f28193g;

    /* JADX INFO: renamed from: h */
    public jqf0 f28194h;

    /* JADX INFO: renamed from: j */
    public boolean f28196j;

    /* JADX INFO: renamed from: k */
    public Runnable f28197k;

    /* JADX INFO: renamed from: l */
    public d f28198l;

    /* JADX INFO: renamed from: m */
    public zqf0 f28199m;

    /* JADX INFO: renamed from: i */
    public boolean f28195i = true;

    /* JADX INFO: renamed from: n */
    public lqf0 f28200n = new lqf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$a */
    public class a extends ohf0 {
        public a() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            C8275a c8275a = C8275a.this;
            float f = c8275a.f28189c;
            c8275a.f28188b = (float) (((double) (f / 2.0f)) + (((double) ((c8275a.f28190d - f) / 2.0f)) * jqf0Var.m142793d()));
            C8275a.this.f28187a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$b */
    public class b extends ohf0 {
        public b() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            C8275a c8275a = C8275a.this;
            float f = c8275a.f28190d;
            c8275a.f28188b = (float) (((double) (f / 2.0f)) - (((double) ((f - c8275a.f28189c) / 2.0f)) * jqf0Var.m142793d()));
            C8275a.this.f28187a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$c */
    public class c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f28203a;

        public c(float f) {
            this.f28203a = f;
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = (float) jqf0Var.m142793d();
            C8275a c8275a = C8275a.this;
            if (fM142793d < 0.5f) {
                float f = this.f28203a;
                c8275a.f28188b = f - (((f - (c8275a.f28191e / 2.0f)) * fM142793d) * 2.0f);
            } else {
                float f2 = c8275a.f28191e / 2.0f;
                C8275a c8275a2 = C8275a.this;
                c8275a.f28188b = f2 + (((c8275a2.f28189c - c8275a2.f28191e) / 2.0f) * (fM142793d - 0.5f) * 2.0f);
            }
            C8275a.this.f28187a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo37398a();

        void release();
    }

    public C8275a(View view) {
        this.f28187a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m44089f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public jqf0 m44090e() {
        if (!this.f28195i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m44099o().m108322c();
        jqf0VarM108322c.m142805p(this.f28200n);
        jqf0VarM108322c.m142790a(new c(this.f28188b));
        jqf0VarM108322c.m142804o(1.0d);
        this.f28194h = jqf0VarM108322c;
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: g */
    public final jqf0 m44091g() {
        if (NullChecker.m81303a(this.f28198l)) {
            this.f28196j = false;
            this.f28198l.release();
            this.f28187a.removeCallbacks(this.f28197k);
        }
        if (!this.f28195i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m44099o().m108322c();
        jqf0VarM108322c.m142805p(this.f28200n);
        jqf0VarM108322c.m142790a(new b());
        jqf0VarM108322c.m142804o(1.0d);
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: h */
    public final jqf0 m44092h(jqf0 jqf0Var) {
        if (!NullChecker.m81303a(jqf0Var)) {
            return null;
        }
        jqf0Var.m142800k();
        jqf0Var.m142792c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m44093i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f28196j = false;
            this.f28187a.postDelayed(this.f28197k, ViewConfiguration.getLongPressTimeout());
            this.f28192f = true;
            m44098n();
        } else if (action == 1) {
            if (this.f28192f) {
                boolean z3 = this.f28196j;
                jqf0 jqf0Var = this.f28193g;
                if (z3) {
                    this.f28193g = m44092h(jqf0Var);
                    m44091g();
                    z = true;
                } else {
                    this.f28193g = m44092h(jqf0Var);
                    this.f28194h = m44092h(this.f28194h);
                    m44090e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f28192f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m44089f(this.f28187a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f28192f) {
                this.f28193g = m44092h(this.f28193g);
                m44091g();
                this.f28192f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f28193g = m44092h(this.f28193g);
            m44091g();
            this.f28192f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m44094j() {
        float f = this.f28188b;
        float f2 = this.f28190d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m44095k(float f) {
        m44096l(f, false);
    }

    /* JADX INFO: renamed from: l */
    public void m44096l(float f, boolean z) {
        this.f28190d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f28190d = f;
        if (!z) {
            f *= 0.9f;
        }
        this.f28189c = f;
        this.f28191e = 0.8f * f;
        this.f28188b = f / 2.0f;
        this.f28197k = new Runnable() { // from class: l.eih0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91605a.m44097m();
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m44097m() {
        if (this.f28192f && NullChecker.m81303a(this.f28198l)) {
            this.f28196j = true;
            this.f28198l.mo37398a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final jqf0 m44098n() {
        if (!this.f28195i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m44099o().m108322c();
        jqf0VarM108322c.m142805p(new lqf0(100.0d, 10.0d));
        jqf0VarM108322c.m142790a(new a());
        jqf0VarM108322c.m142804o(1.0d);
        this.f28193g = jqf0VarM108322c;
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: o */
    public final cr2 m44099o() {
        zqf0 zqf0Var = this.f28199m;
        if (zqf0Var != null) {
            return zqf0Var;
        }
        zqf0 zqf0VarM219852h = zqf0.m219852h();
        this.f28199m = zqf0VarM219852h;
        return zqf0VarM219852h;
    }
}
