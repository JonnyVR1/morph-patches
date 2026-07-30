package com.p051p1.mobile.putong.core.p058ui;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import p153l.izf0;
import p153l.sr2;
import p153l.syf0;
import p153l.uyf0;
import p153l.wpf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a */
/* JADX INFO: loaded from: classes6.dex */
public class C8438a {

    /* JADX INFO: renamed from: a */
    public View f29035a;

    /* JADX INFO: renamed from: b */
    public float f29036b;

    /* JADX INFO: renamed from: c */
    public float f29037c;

    /* JADX INFO: renamed from: d */
    public float f29038d;

    /* JADX INFO: renamed from: e */
    public float f29039e;

    /* JADX INFO: renamed from: f */
    public boolean f29040f;

    /* JADX INFO: renamed from: g */
    public syf0 f29041g;

    /* JADX INFO: renamed from: h */
    public syf0 f29042h;

    /* JADX INFO: renamed from: j */
    public boolean f29044j;

    /* JADX INFO: renamed from: k */
    public Runnable f29045k;

    /* JADX INFO: renamed from: l */
    public d f29046l;

    /* JADX INFO: renamed from: m */
    public izf0 f29047m;

    /* JADX INFO: renamed from: i */
    public boolean f29043i = true;

    /* JADX INFO: renamed from: n */
    public uyf0 f29048n = new uyf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$a */
    public class a extends wpf0 {
        public a() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            C8438a c8438a = C8438a.this;
            float f = c8438a.f29037c;
            c8438a.f29036b = (float) (((double) (f / 2.0f)) + (((double) ((c8438a.f29038d - f) / 2.0f)) * syf0Var.m188550d()));
            C8438a.this.f29035a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$b */
    public class b extends wpf0 {
        public b() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            C8438a c8438a = C8438a.this;
            float f = c8438a.f29038d;
            c8438a.f29036b = (float) (((double) (f / 2.0f)) - (((double) ((f - c8438a.f29037c) / 2.0f)) * syf0Var.m188550d()));
            C8438a.this.f29035a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$c */
    public class c extends wpf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f29051a;

        public c(float f) {
            this.f29051a = f;
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = (float) syf0Var.m188550d();
            C8438a c8438a = C8438a.this;
            if (fM188550d < 0.5f) {
                float f = this.f29051a;
                c8438a.f29036b = f - (((f - (c8438a.f29039e / 2.0f)) * fM188550d) * 2.0f);
            } else {
                float f2 = c8438a.f29039e / 2.0f;
                C8438a c8438a2 = C8438a.this;
                c8438a.f29036b = f2 + (((c8438a2.f29037c - c8438a2.f29039e) / 2.0f) * (fM188550d - 0.5f) * 2.0f);
            }
            C8438a.this.f29035a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo38401a();

        void release();
    }

    public C8438a(View view) {
        this.f29035a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m45272f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public syf0 m45273e() {
        if (!this.f29043i) {
            return null;
        }
        syf0 syf0VarM187585c = m45282o().m187585c();
        syf0VarM187585c.m188562p(this.f29048n);
        syf0VarM187585c.m188547a(new c(this.f29036b));
        syf0VarM187585c.m188561o(1.0d);
        this.f29042h = syf0VarM187585c;
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: g */
    public final syf0 m45274g() {
        if (NullChecker.m82486a(this.f29046l)) {
            this.f29044j = false;
            this.f29046l.release();
            this.f29035a.removeCallbacks(this.f29045k);
        }
        if (!this.f29043i) {
            return null;
        }
        syf0 syf0VarM187585c = m45282o().m187585c();
        syf0VarM187585c.m188562p(this.f29048n);
        syf0VarM187585c.m188547a(new b());
        syf0VarM187585c.m188561o(1.0d);
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: h */
    public final syf0 m45275h(syf0 syf0Var) {
        if (!NullChecker.m82486a(syf0Var)) {
            return null;
        }
        syf0Var.m188557k();
        syf0Var.m188549c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m45276i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f29044j = false;
            this.f29035a.postDelayed(this.f29045k, ViewConfiguration.getLongPressTimeout());
            this.f29040f = true;
            m45281n();
        } else if (action == 1) {
            if (this.f29040f) {
                boolean z3 = this.f29044j;
                syf0 syf0Var = this.f29041g;
                if (z3) {
                    this.f29041g = m45275h(syf0Var);
                    m45274g();
                    z = true;
                } else {
                    this.f29041g = m45275h(syf0Var);
                    this.f29042h = m45275h(this.f29042h);
                    m45273e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f29040f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m45272f(this.f29035a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f29040f) {
                this.f29041g = m45275h(this.f29041g);
                m45274g();
                this.f29040f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f29041g = m45275h(this.f29041g);
            m45274g();
            this.f29040f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m45277j() {
        float f = this.f29036b;
        float f2 = this.f29038d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m45278k(float f) {
        m45279l(f, false);
    }

    /* JADX INFO: renamed from: l */
    public void m45279l(float f, boolean z) {
        this.f29038d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f29038d = f;
        if (!z) {
            f *= 0.9f;
        }
        this.f29037c = f;
        this.f29039e = 0.8f * f;
        this.f29036b = f / 2.0f;
        this.f29045k = new Runnable() { // from class: l.lqh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133215a.m45280m();
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m45280m() {
        if (this.f29040f && NullChecker.m82486a(this.f29046l)) {
            this.f29044j = true;
            this.f29046l.mo38401a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final syf0 m45281n() {
        if (!this.f29043i) {
            return null;
        }
        syf0 syf0VarM187585c = m45282o().m187585c();
        syf0VarM187585c.m188562p(new uyf0(100.0d, 10.0d));
        syf0VarM187585c.m188547a(new a());
        syf0VarM187585c.m188561o(1.0d);
        this.f29041g = syf0VarM187585c;
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: o */
    public final sr2 m45282o() {
        izf0 izf0Var = this.f29047m;
        if (izf0Var != null) {
            return izf0Var;
        }
        izf0 izf0VarM142800h = izf0.m142800h();
        this.f29047m = izf0VarM142800h;
        return izf0VarM142800h;
    }
}
