package p149l;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes13.dex */
public class gx00 implements lxl {

    /* JADX INFO: renamed from: a */
    public final r0f f104806a;

    /* JADX INFO: renamed from: b */
    public final Context f104807b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f104808c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f104809d;

    /* JADX INFO: renamed from: e */
    public SurfaceView f104810e;

    /* JADX INFO: renamed from: f */
    public fx00 f104811f;

    /* JADX INFO: renamed from: g */
    public boolean f104812g;

    /* JADX INFO: renamed from: l.gx00$a */
    public static class C17185a {

        /* JADX INFO: renamed from: a */
        public Context f104813a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f104814b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f104815c;

        /* JADX INFO: renamed from: d */
        public SurfaceView f104816d;

        public C17185a(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, SurfaceView surfaceView) {
            this.f104813a = context;
            this.f104814b = viewGroup;
            this.f104815c = viewGroup2;
            this.f104816d = surfaceView;
        }
    }

    public gx00(Context context, r0f r0fVar) {
        this.f104806a = r0fVar;
        this.f104807b = context;
    }

    @Override // p149l.lxl
    /* JADX INFO: renamed from: a */
    public void mo128517a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f104808c;
        if (viewGroup2 == null || (viewGroup = this.f104809d) == null || (viewGroup2.findViewById(viewGroup.getId()) == null && this.f104809d.findViewById(this.f104808c.getId()) == null)) {
            ViewGroup viewGroup3 = this.f104808c;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                xdl0.m208344M(this.f104808c, true);
                m128521e();
            }
            fx00 fx00Var = this.f104811f;
            if (fx00Var != null) {
                fx00Var.m123615d(new C17185a(this.f104807b, this.f104808c, this.f104809d, this.f104810e));
            }
        }
    }

    @Override // p149l.lxl
    /* JADX INFO: renamed from: b */
    public void mo128518b(FrameLayout frameLayout) {
        mo128519c();
        this.f104808c = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f104808c.setId(View.generateViewId());
    }

    @Override // p149l.lxl
    /* JADX INFO: renamed from: c */
    public void mo128519c() {
        if (this.f104810e != null) {
            this.f104810e = null;
        }
        ViewGroup viewGroup = this.f104808c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f104808c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m128520d(fx00 fx00Var) {
        m128522f();
        this.f104811f = fx00Var;
        fx00Var.m123615d(new C17185a(this.f104807b, this.f104808c, this.f104809d, this.f104810e));
    }

    /* JADX INFO: renamed from: e */
    public final void m128521e() {
        if (this.f104808c == null) {
            return;
        }
        SurfaceView surfaceView = new SurfaceView(this.f104807b);
        this.f104810e = surfaceView;
        this.f104808c.addView(surfaceView);
        SurfaceView surfaceView2 = this.f104810e;
        int i = xdl0.f192403e;
        surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        this.f104806a.f157168c.m180769h1(this.f104810e);
    }

    /* JADX INFO: renamed from: f */
    public void m128522f() {
        fx00 fx00Var = this.f104811f;
        if (fx00Var != null) {
            fx00Var.mo123613b();
            this.f104811f.m123614c();
            this.f104811f = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m128524h() {
        SurfaceView surfaceView;
        ViewGroup viewGroup = this.f104808c;
        if (viewGroup == null || (surfaceView = this.f104810e) == null || this.f104812g) {
            return;
        }
        this.f104812g = true;
        viewGroup.removeView(surfaceView);
    }

    /* JADX INFO: renamed from: i */
    public void m128525i() {
        SurfaceView surfaceView;
        if (this.f104808c == null || (surfaceView = this.f104810e) == null || !this.f104812g) {
            return;
        }
        this.f104812g = false;
        if (surfaceView.getParent() == null) {
            this.f104808c.addView(this.f104810e, 0);
        }
        fx00 fx00Var = this.f104811f;
        if (fx00Var != null) {
            fx00Var.mo123612a();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m128526j() {
        this.f104810e = null;
    }

    /* JADX INFO: renamed from: k */
    public void m128527k(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f104809d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f104809d = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f104809d.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: g */
    public void m128523g() {
    }
}
