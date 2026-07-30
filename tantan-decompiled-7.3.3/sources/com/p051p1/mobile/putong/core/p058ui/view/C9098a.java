package com.p051p1.mobile.putong.core.p058ui.view;

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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9098a {

    /* JADX INFO: renamed from: a */
    public View f37751a;

    /* JADX INFO: renamed from: b */
    public float f37752b;

    /* JADX INFO: renamed from: c */
    public float f37753c;

    /* JADX INFO: renamed from: d */
    public float f37754d;

    /* JADX INFO: renamed from: e */
    public float f37755e;

    /* JADX INFO: renamed from: f */
    public boolean f37756f;

    /* JADX INFO: renamed from: g */
    public syf0 f37757g;

    /* JADX INFO: renamed from: h */
    public syf0 f37758h;

    /* JADX INFO: renamed from: j */
    public boolean f37760j;

    /* JADX INFO: renamed from: k */
    public Runnable f37761k;

    /* JADX INFO: renamed from: l */
    public izf0 f37762l;

    /* JADX INFO: renamed from: i */
    public boolean f37759i = true;

    /* JADX INFO: renamed from: m */
    public uyf0 f37763m = new uyf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$a */
    public class a extends wpf0 {
        public a() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            C9098a c9098a = C9098a.this;
            float f = c9098a.f37753c;
            c9098a.f37752b = (float) (((double) (f / 2.0f)) + (((double) ((c9098a.f37754d - f) / 2.0f)) * syf0Var.m188550d()));
            C9098a.this.f37751a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$b */
    public class b extends wpf0 {
        public b() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            C9098a c9098a = C9098a.this;
            float f = c9098a.f37754d;
            c9098a.f37752b = (float) (((double) (f / 2.0f)) - (((double) ((f - c9098a.f37753c) / 2.0f)) * syf0Var.m188550d()));
            C9098a.this.f37751a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$c */
    public class c extends wpf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f37766a;

        public c(float f) {
            this.f37766a = f;
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = (float) syf0Var.m188550d();
            C9098a c9098a = C9098a.this;
            if (fM188550d < 0.5f) {
                float f = this.f37766a;
                c9098a.f37752b = f - (((f - (c9098a.f37755e / 2.0f)) * fM188550d) * 2.0f);
            } else {
                float f2 = c9098a.f37755e / 2.0f;
                C9098a c9098a2 = C9098a.this;
                c9098a.f37752b = f2 + (((c9098a2.f37753c - c9098a2.f37755e) / 2.0f) * (fM188550d - 0.5f) * 2.0f);
            }
            C9098a.this.f37751a.invalidate();
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
            syf0Var.m188549c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$d */
    public interface d {
    }

    public C9098a(View view) {
        this.f37751a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m57371f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public syf0 m57372e() {
        if (!this.f37759i) {
            return null;
        }
        syf0 syf0VarM187585c = m57380n().m187585c();
        syf0VarM187585c.m188562p(this.f37763m);
        syf0VarM187585c.m188547a(new c(this.f37752b));
        syf0VarM187585c.m188561o(1.0d);
        this.f37758h = syf0VarM187585c;
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: g */
    public final syf0 m57373g() {
        if (NullChecker.m82486a(null)) {
            this.f37760j = false;
            throw null;
        }
        if (!this.f37759i) {
            return null;
        }
        syf0 syf0VarM187585c = m57380n().m187585c();
        syf0VarM187585c.m188562p(this.f37763m);
        syf0VarM187585c.m188547a(new b());
        syf0VarM187585c.m188561o(1.0d);
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: h */
    public final syf0 m57374h(syf0 syf0Var) {
        if (!NullChecker.m82486a(syf0Var)) {
            return null;
        }
        syf0Var.m188557k();
        syf0Var.m188549c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m57375i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f37760j = false;
            this.f37751a.postDelayed(this.f37761k, ViewConfiguration.getLongPressTimeout());
            this.f37756f = true;
            m57379m();
        } else if (action == 1) {
            if (this.f37756f) {
                boolean z3 = this.f37760j;
                syf0 syf0Var = this.f37757g;
                if (z3) {
                    this.f37757g = m57374h(syf0Var);
                    m57373g();
                    z = true;
                } else {
                    this.f37757g = m57374h(syf0Var);
                    this.f37758h = m57374h(this.f37758h);
                    m57372e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f37756f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m57371f(this.f37751a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f37756f) {
                this.f37757g = m57374h(this.f37757g);
                m57373g();
                this.f37756f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f37757g = m57374h(this.f37757g);
            m57373g();
            this.f37756f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m57376j() {
        float f = this.f37752b;
        float f2 = this.f37754d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m57377k(float f) {
        this.f37754d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f37754d = f;
        float f2 = f * 0.9f;
        this.f37753c = f2;
        this.f37755e = 0.8f * f2;
        this.f37752b = f2 / 2.0f;
        this.f37761k = new Runnable() { // from class: l.kqh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128228a.m57378l();
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m57378l() {
        if (this.f37756f && NullChecker.m82486a(null)) {
            this.f37760j = true;
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final syf0 m57379m() {
        if (!this.f37759i) {
            return null;
        }
        syf0 syf0VarM187585c = m57380n().m187585c();
        syf0VarM187585c.m188562p(new uyf0(100.0d, 10.0d));
        syf0VarM187585c.m188547a(new a());
        syf0VarM187585c.m188561o(1.0d);
        this.f37757g = syf0VarM187585c;
        return syf0VarM187585c;
    }

    /* JADX INFO: renamed from: n */
    public final sr2 m57380n() {
        izf0 izf0Var = this.f37762l;
        if (izf0Var != null) {
            return izf0Var;
        }
        izf0 izf0VarM142800h = izf0.m142800h();
        this.f37762l = izf0VarM142800h;
        return izf0VarM142800h;
    }
}
