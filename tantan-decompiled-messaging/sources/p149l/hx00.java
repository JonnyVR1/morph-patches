package p149l;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class hx00 implements kxl {

    /* JADX INFO: renamed from: a */
    public final q0f f109813a;

    /* JADX INFO: renamed from: b */
    public final Context f109814b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f109815c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f109816d;

    /* JADX INFO: renamed from: e */
    public SurfaceView f109817e;

    /* JADX INFO: renamed from: f */
    public ex00 f109818f;

    /* JADX INFO: renamed from: g */
    public boolean f109819g;

    /* JADX INFO: renamed from: l.hx00$a */
    public static class C17423a {

        /* JADX INFO: renamed from: a */
        public Context f109820a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f109821b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f109822c;

        /* JADX INFO: renamed from: d */
        public SurfaceView f109823d;

        public C17423a(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, SurfaceView surfaceView) {
            this.f109820a = context;
            this.f109821b = viewGroup;
            this.f109822c = viewGroup2;
            this.f109823d = surfaceView;
        }
    }

    public hx00(Context context, q0f q0fVar) {
        this.f109813a = q0fVar;
        this.f109814b = context;
    }

    @Override // p149l.kxl
    /* JADX INFO: renamed from: a */
    public void mo133282a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f109815c;
        if (viewGroup2 == null || (viewGroup = this.f109816d) == null || (viewGroup2.findViewById(viewGroup.getId()) == null && this.f109816d.findViewById(this.f109815c.getId()) == null)) {
            ViewGroup viewGroup3 = this.f109815c;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                xdl0.m208344M(this.f109815c, true);
                m133286e();
            }
            ex00 ex00Var = this.f109818f;
            if (ex00Var != null) {
                ex00Var.mo101819e(new C17423a(this.f109814b, this.f109815c, this.f109816d, this.f109817e));
                this.f109818f.mo101817b();
            }
        }
    }

    @Override // p149l.kxl
    /* JADX INFO: renamed from: b */
    public void mo133283b(FrameLayout frameLayout) {
        m133287f();
        this.f109815c = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f109815c.setId(View.generateViewId());
    }

    @Override // p149l.kxl
    /* JADX INFO: renamed from: c */
    public void mo133284c(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f109816d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f109816d = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f109816d.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: d */
    public void m133285d(ex00 ex00Var) {
        m133288g();
        this.f109818f = ex00Var;
        ex00Var.mo101819e(new C17423a(this.f109814b, this.f109815c, this.f109816d, this.f109817e));
    }

    /* JADX INFO: renamed from: e */
    public final void m133286e() {
        if (this.f109815c == null) {
            return;
        }
        h54.m129377d("checkSurface and add surface to localContainer");
        SurfaceView surfaceView = new SurfaceView(this.f109814b);
        this.f109817e = surfaceView;
        this.f109815c.addView(surfaceView);
        SurfaceView surfaceView2 = this.f109817e;
        int i = xdl0.f192403e;
        surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        this.f109813a.f152051c.m185838q1(this.f109817e);
    }

    /* JADX INFO: renamed from: f */
    public final void m133287f() {
        if (this.f109817e != null) {
            this.f109817e = null;
        }
        ViewGroup viewGroup = this.f109815c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f109815c = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m133288g() {
        ex00 ex00Var = this.f109818f;
        if (ex00Var != null) {
            ex00Var.mo101818c();
            this.f109818f.m118530d();
            this.f109818f = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public SurfaceView m133289h() {
        return this.f109817e;
    }

    /* JADX INFO: renamed from: j */
    public void m133291j() {
        SurfaceView surfaceView;
        ViewGroup viewGroup = this.f109815c;
        if (viewGroup == null || (surfaceView = this.f109817e) == null || this.f109819g) {
            return;
        }
        this.f109819g = true;
        viewGroup.removeView(surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m133292k() {
        SurfaceView surfaceView;
        if (this.f109815c == null || (surfaceView = this.f109817e) == null || !this.f109819g) {
            return;
        }
        this.f109819g = false;
        if (surfaceView.getParent() == null) {
            this.f109815c.addView(this.f109817e, 0);
        }
        ex00 ex00Var = this.f109818f;
        if (ex00Var != null) {
            ex00Var.mo101817b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m133293l() {
        this.f109817e = null;
    }

    /* JADX INFO: renamed from: i */
    public void m133290i() {
    }
}
