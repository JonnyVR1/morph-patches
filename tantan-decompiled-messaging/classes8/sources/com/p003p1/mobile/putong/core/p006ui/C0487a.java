package com.p003p1.mobile.putong.core.p006ui;

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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0487a {

    /* JADX INFO: renamed from: a */
    public View f1758a;

    /* JADX INFO: renamed from: b */
    public float f1759b;

    /* JADX INFO: renamed from: c */
    public float f1760c;

    /* JADX INFO: renamed from: d */
    public float f1761d;

    /* JADX INFO: renamed from: e */
    public float f1762e;

    /* JADX INFO: renamed from: f */
    public boolean f1763f;

    /* JADX INFO: renamed from: g */
    public jqf0 f1764g;

    /* JADX INFO: renamed from: h */
    public jqf0 f1765h;

    /* JADX INFO: renamed from: j */
    public boolean f1767j;

    /* JADX INFO: renamed from: k */
    public Runnable f1768k;

    /* JADX INFO: renamed from: l */
    public d f1769l;

    /* JADX INFO: renamed from: m */
    public zqf0 f1770m;

    /* JADX INFO: renamed from: i */
    public boolean f1766i = true;

    /* JADX INFO: renamed from: n */
    public lqf0 f1771n = new lqf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$a */
    public class a extends ohf0 {
        public a() {
        }

        /* JADX INFO: renamed from: c */
        public void m8429c(jqf0 jqf0Var) {
            C0487a c0487a = C0487a.this;
            float f = c0487a.f1760c;
            c0487a.f1759b = (float) (((double) (f / 2.0f)) + (((double) ((c0487a.f1761d - f) / 2.0f)) * jqf0Var.d()));
            C0487a.this.f1758a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m8430d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$b */
    public class b extends ohf0 {
        public b() {
        }

        /* JADX INFO: renamed from: c */
        public void m8431c(jqf0 jqf0Var) {
            C0487a c0487a = C0487a.this;
            float f = c0487a.f1761d;
            c0487a.f1759b = (float) (((double) (f / 2.0f)) - (((double) ((f - c0487a.f1760c) / 2.0f)) * jqf0Var.d()));
            C0487a.this.f1758a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m8432d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$c */
    public class c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1774a;

        public c(float f) {
            this.f1774a = f;
        }

        /* JADX INFO: renamed from: c */
        public void m8433c(jqf0 jqf0Var) {
            float fD = (float) jqf0Var.d();
            C0487a c0487a = C0487a.this;
            if (fD < 0.5f) {
                float f = this.f1774a;
                c0487a.f1759b = f - (((f - (c0487a.f1762e / 2.0f)) * fD) * 2.0f);
            } else {
                float f2 = c0487a.f1762e / 2.0f;
                C0487a c0487a2 = C0487a.this;
                c0487a.f1759b = f2 + (((c0487a2.f1760c - c0487a2.f1762e) / 2.0f) * (fD - 0.5f) * 2.0f);
            }
            C0487a.this.f1758a.invalidate();
        }

        /* JADX INFO: renamed from: d */
        public void m8434d(jqf0 jqf0Var) {
            jqf0Var.c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m8435a();

        void release();
    }

    public C0487a(View view) {
        this.f1758a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m8418f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public jqf0 m8419e() {
        if (!this.f1766i) {
            return null;
        }
        jqf0 jqf0VarC = m8428o().c();
        jqf0VarC.p(this.f1771n);
        jqf0VarC.a(new c(this.f1759b));
        jqf0VarC.o(1.0d);
        this.f1765h = jqf0VarC;
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: g */
    public final jqf0 m8420g() {
        if (NullChecker.a(this.f1769l)) {
            this.f1767j = false;
            this.f1769l.release();
            this.f1758a.removeCallbacks(this.f1768k);
        }
        if (!this.f1766i) {
            return null;
        }
        jqf0 jqf0VarC = m8428o().c();
        jqf0VarC.p(this.f1771n);
        jqf0VarC.a(new b());
        jqf0VarC.o(1.0d);
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: h */
    public final jqf0 m8421h(jqf0 jqf0Var) {
        if (!NullChecker.a(jqf0Var)) {
            return null;
        }
        jqf0Var.k();
        jqf0Var.c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m8422i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f1767j = false;
            this.f1758a.postDelayed(this.f1768k, ViewConfiguration.getLongPressTimeout());
            this.f1763f = true;
            m8427n();
        } else if (action == 1) {
            if (this.f1763f) {
                boolean z3 = this.f1767j;
                jqf0 jqf0Var = this.f1764g;
                if (z3) {
                    this.f1764g = m8421h(jqf0Var);
                    m8420g();
                    z = true;
                } else {
                    this.f1764g = m8421h(jqf0Var);
                    this.f1765h = m8421h(this.f1765h);
                    m8419e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f1763f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m8418f(this.f1758a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f1763f) {
                this.f1764g = m8421h(this.f1764g);
                m8420g();
                this.f1763f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f1764g = m8421h(this.f1764g);
            m8420g();
            this.f1763f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m8423j() {
        float f = this.f1759b;
        float f2 = this.f1761d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m8424k(float f) {
        m8425l(f, false);
    }

    /* JADX INFO: renamed from: l */
    public void m8425l(float f, boolean z) {
        this.f1761d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f1761d = f;
        if (!z) {
            f *= 0.9f;
        }
        this.f1760c = f;
        this.f1762e = 0.8f * f;
        this.f1759b = f / 2.0f;
        this.f1768k = new Runnable() { // from class: l.eih0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2624a.m8426m();
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8426m() {
        if (this.f1763f && NullChecker.a(this.f1769l)) {
            this.f1767j = true;
            this.f1769l.m8435a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final jqf0 m8427n() {
        if (!this.f1766i) {
            return null;
        }
        jqf0 jqf0VarC = m8428o().c();
        jqf0VarC.p(new lqf0(100.0d, 10.0d));
        jqf0VarC.a(new a());
        jqf0VarC.o(1.0d);
        this.f1764g = jqf0VarC;
        return jqf0VarC;
    }

    /* JADX INFO: renamed from: o */
    public final cr2 m8428o() {
        zqf0 zqf0Var = this.f1770m;
        if (zqf0Var != null) {
            return zqf0Var;
        }
        zqf0 zqf0VarH = zqf0.h();
        this.f1770m = zqf0VarH;
        return zqf0VarH;
    }
}
