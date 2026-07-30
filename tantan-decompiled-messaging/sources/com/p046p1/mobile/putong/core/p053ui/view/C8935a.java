package com.p046p1.mobile.putong.core.p053ui.view;

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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8935a {

    /* JADX INFO: renamed from: a */
    public View f36903a;

    /* JADX INFO: renamed from: b */
    public float f36904b;

    /* JADX INFO: renamed from: c */
    public float f36905c;

    /* JADX INFO: renamed from: d */
    public float f36906d;

    /* JADX INFO: renamed from: e */
    public float f36907e;

    /* JADX INFO: renamed from: f */
    public boolean f36908f;

    /* JADX INFO: renamed from: g */
    public jqf0 f36909g;

    /* JADX INFO: renamed from: h */
    public jqf0 f36910h;

    /* JADX INFO: renamed from: j */
    public boolean f36912j;

    /* JADX INFO: renamed from: k */
    public Runnable f36913k;

    /* JADX INFO: renamed from: l */
    public zqf0 f36914l;

    /* JADX INFO: renamed from: i */
    public boolean f36911i = true;

    /* JADX INFO: renamed from: m */
    public lqf0 f36915m = new lqf0(125.0d, 12.0d);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$a */
    public class a extends ohf0 {
        public a() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            C8935a c8935a = C8935a.this;
            float f = c8935a.f36905c;
            c8935a.f36904b = (float) (((double) (f / 2.0f)) + (((double) ((c8935a.f36906d - f) / 2.0f)) * jqf0Var.m142793d()));
            C8935a.this.f36903a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$b */
    public class b extends ohf0 {
        public b() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            C8935a c8935a = C8935a.this;
            float f = c8935a.f36906d;
            c8935a.f36904b = (float) (((double) (f / 2.0f)) - (((double) ((f - c8935a.f36905c) / 2.0f)) * jqf0Var.m142793d()));
            C8935a.this.f36903a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$c */
    public class c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f36918a;

        public c(float f) {
            this.f36918a = f;
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = (float) jqf0Var.m142793d();
            C8935a c8935a = C8935a.this;
            if (fM142793d < 0.5f) {
                float f = this.f36918a;
                c8935a.f36904b = f - (((f - (c8935a.f36907e / 2.0f)) * fM142793d) * 2.0f);
            } else {
                float f2 = c8935a.f36907e / 2.0f;
                C8935a c8935a2 = C8935a.this;
                c8935a.f36904b = f2 + (((c8935a2.f36905c - c8935a2.f36907e) / 2.0f) * (fM142793d - 0.5f) * 2.0f);
            }
            C8935a.this.f36903a.invalidate();
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
            jqf0Var.m142792c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.a$d */
    public interface d {
    }

    public C8935a(View view) {
        this.f36903a = view;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m56188f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public jqf0 m56189e() {
        if (!this.f36911i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m56197n().m108322c();
        jqf0VarM108322c.m142805p(this.f36915m);
        jqf0VarM108322c.m142790a(new c(this.f36904b));
        jqf0VarM108322c.m142804o(1.0d);
        this.f36910h = jqf0VarM108322c;
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: g */
    public final jqf0 m56190g() {
        if (NullChecker.m81303a(null)) {
            this.f36912j = false;
            throw null;
        }
        if (!this.f36911i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m56197n().m108322c();
        jqf0VarM108322c.m142805p(this.f36915m);
        jqf0VarM108322c.m142790a(new b());
        jqf0VarM108322c.m142804o(1.0d);
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: h */
    public final jqf0 m56191h(jqf0 jqf0Var) {
        if (!NullChecker.m81303a(jqf0Var)) {
            return null;
        }
        jqf0Var.m142800k();
        jqf0Var.m142792c();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m56192i(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.f36912j = false;
            this.f36903a.postDelayed(this.f36913k, ViewConfiguration.getLongPressTimeout());
            this.f36908f = true;
            m56196m();
        } else if (action == 1) {
            if (this.f36908f) {
                boolean z3 = this.f36912j;
                jqf0 jqf0Var = this.f36909g;
                if (z3) {
                    this.f36909g = m56191h(jqf0Var);
                    m56190g();
                    z = true;
                } else {
                    this.f36909g = m56191h(jqf0Var);
                    this.f36910h = m56191h(this.f36910h);
                    m56189e();
                    z = false;
                }
            } else {
                z = true;
            }
            this.f36908f = false;
            z2 = z;
        } else if (action == 2) {
            if (!m56188f(this.f36903a).contains(motionEvent.getRawX(), motionEvent.getRawY()) && this.f36908f) {
                this.f36909g = m56191h(this.f36909g);
                m56190g();
                this.f36908f = false;
                z2 = true;
            }
        } else if (action == 3) {
            this.f36909g = m56191h(this.f36909g);
            m56190g();
            this.f36908f = false;
            z2 = true;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: j */
    public float m56193j() {
        float f = this.f36904b;
        float f2 = this.f36906d;
        return f > f2 / 2.0f ? f2 / 2.0f : f;
    }

    /* JADX INFO: renamed from: k */
    public void m56194k(float f) {
        this.f36906d = f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f36906d = f;
        float f2 = f * 0.9f;
        this.f36905c = f2;
        this.f36907e = 0.8f * f2;
        this.f36904b = f2 / 2.0f;
        this.f36913k = new Runnable() { // from class: l.dih0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86390a.m56195l();
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m56195l() {
        if (this.f36908f && NullChecker.m81303a(null)) {
            this.f36912j = true;
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final jqf0 m56196m() {
        if (!this.f36911i) {
            return null;
        }
        jqf0 jqf0VarM108322c = m56197n().m108322c();
        jqf0VarM108322c.m142805p(new lqf0(100.0d, 10.0d));
        jqf0VarM108322c.m142790a(new a());
        jqf0VarM108322c.m142804o(1.0d);
        this.f36909g = jqf0VarM108322c;
        return jqf0VarM108322c;
    }

    /* JADX INFO: renamed from: n */
    public final cr2 m56197n() {
        zqf0 zqf0Var = this.f36914l;
        if (zqf0Var != null) {
            return zqf0Var;
        }
        zqf0 zqf0VarM219852h = zqf0.m219852h();
        this.f36914l = zqf0VarM219852h;
        return zqf0VarM219852h;
    }
}
