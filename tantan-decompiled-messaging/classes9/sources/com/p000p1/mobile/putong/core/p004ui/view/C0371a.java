package com.p000p1.mobile.putong.core.p004ui.view;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import l.cr2;
import l.jqf0;
import l.lqf0;
import l.ohf0;
import l.zqf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0371a {

    /* JADX INFO: renamed from: a */
    public View f6684a;

    /* JADX INFO: renamed from: b */
    public float f6685b;

    /* JADX INFO: renamed from: c */
    public float f6686c;

    /* JADX INFO: renamed from: d */
    public float f6687d;

    /* JADX INFO: renamed from: e */
    public float f6688e;

    /* JADX INFO: renamed from: f */
    public boolean f6689f;

    /* JADX INFO: renamed from: g */
    public jqf0 f6690g;

    /* JADX INFO: renamed from: h */
    public jqf0 f6691h;

    /* JADX INFO: renamed from: j */
    public boolean f6693j;

    /* JADX INFO: renamed from: k */
    public Runnable f6694k;

    /* JADX INFO: renamed from: l */
    public zqf0 f6695l;

    /* JADX INFO: renamed from: i */
    public boolean f6692i = true;

    /* JADX INFO: renamed from: m */
    public lqf0 f6696m = new lqf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$a */
    public class a extends ohf0 {
        public a() {
        }

        /* JADX INFO: renamed from: c */
        public void m9625c(jqf0 jqf0Var) {
            C0371a c0371a = C0371a.this;
            float f = c0371a.f6686c;
            c0371a.f6685b = (float) (((double) (f / 2.0f)) + (((double) ((c0371a.f6687d - f) / 2.0f)) * jqf0Var.d()));
            C0371a.this.f6684a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m9626d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$b */
    public class b extends ohf0 {
        public b() {
        }

        /* JADX INFO: renamed from: c */
        public void m9627c(jqf0 jqf0Var) {
            C0371a c0371a = C0371a.this;
            float f = c0371a.f6687d;
            c0371a.f6685b = (float) (((double) (f / 2.0f)) - (((double) ((f - c0371a.f6686c) / 2.0f)) * jqf0Var.d()));
            C0371a.this.f6684a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m9628d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$c */
    public class c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f6699a;

        public c(float f) {
            this.f6699a = f;
        }

        /* JADX INFO: renamed from: c */
        public void m9629c(jqf0 jqf0Var) {
            float fD = (float) jqf0Var.d();
            C0371a c0371a = C0371a.this;
            if (fD < 0.5f) {
                float f = this.f6699a;
                c0371a.f6685b = f - (((f - (c0371a.f6688e / 2.0f)) * fD) * 2.0f);
            } else {
                float f2 = c0371a.f6688e / 2.0f;
                C0371a c0371a2 = C0371a.this;
                c0371a.f6685b = f2 + (((c0371a2.f6686c - c0371a2.f6688e) / 2.0f) * (fD - 0.5f) * 2.0f);
            }
            C0371a.this.f6684a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m9630d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$d */
    public interface d {
    }

    public C0371a(View view) {
        this.f6684a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m9615f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public jqf0 m9616e() {
        if (!this.f6692i) {
            return null;
        }
        jqf0 jqf0VarC = m9624n().c();
        jqf0VarC.p(this.f6696m);
        jqf0VarC.a(new c(this.f6685b));
        jqf0VarC.o(1.0d);
        this.f6691h = jqf0VarC;
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: g */
    public final jqf0 m9617g() {
        if (NullChecker.a((Object) null)) {
            this.f6693j = false;
            throw null;
        }
        if (!this.f6692i) {
            return null;
        }
        jqf0 jqf0VarC = m9624n().c();
        jqf0VarC.p(this.f6696m);
        jqf0VarC.a(new b());
        jqf0VarC.o(1.0d);
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: h */
    public final jqf0 m9618h(jqf0 jqf0Var) {
        if (!NullChecker.a(jqf0Var)) {
            return null;
        }
        jqf0Var.k();
        jqf0Var.c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m9619i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f6693j = false;
            this.f6684a.postDelayed(this.f6694k, ViewConfiguration.getLongPressTimeout());
            this.f6689f = true;
            m9623m();
        } else if (action == 1) {
            if (this.f6689f) {
                boolean z3 = this.f6693j;
                jqf0 jqf0Var = this.f6690g;
                if (z3) {
                    this.f6690g = m9618h(jqf0Var);
                    m9617g();
                    z = true;
                } else {
                    this.f6690g = m9618h(jqf0Var);
                    this.f6691h = m9618h(this.f6691h);
                    m9616e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f6689f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m9615f(this.f6684a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f6689f) {
                this.f6690g = m9618h(this.f6690g);
                m9617g();
                this.f6689f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f6690g = m9618h(this.f6690g);
            m9617g();
            this.f6689f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m9620j() {
        float f = this.f6685b;
        float f2 = this.f6687d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m9621k(float f) {
        this.f6687d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f6687d = f;
        float f2 = f * 0.9f;
        this.f6686c = f2;
        this.f6688e = 0.8f * f2;
        this.f6685b = f2 / 2.0f;
        this.f6694k = new Runnable() { // from class: l.dih0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10416a.m9622l();
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9622l() {
        if (this.f6689f && NullChecker.a((Object) null)) {
            this.f6693j = true;
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final jqf0 m9623m() {
        if (!this.f6692i) {
            return null;
        }
        jqf0 jqf0VarC = m9624n().c();
        jqf0VarC.p(new lqf0(100.0d, 10.0d));
        jqf0VarC.a(new a());
        jqf0VarC.o(1.0d);
        this.f6690g = jqf0VarC;
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: n */
    public final cr2 m9624n() {
        zqf0 zqf0Var = this.f6695l;
        if (zqf0Var != null) {
            return zqf0Var;
        }
        zqf0 zqf0VarH = zqf0.h();
        this.f6695l = zqf0VarH;
        return zqf0VarH;
    }
}
