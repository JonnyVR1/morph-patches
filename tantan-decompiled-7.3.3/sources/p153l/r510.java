package p153l;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class r510 implements d0m {

    /* JADX INFO: renamed from: a */
    public final u1f f161269a;

    /* JADX INFO: renamed from: b */
    public final Context f161270b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f161271c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f161272d;

    /* JADX INFO: renamed from: e */
    public SurfaceView f161273e;

    /* JADX INFO: renamed from: f */
    public o510 f161274f;

    /* JADX INFO: renamed from: g */
    public boolean f161275g;

    /* JADX INFO: renamed from: l.r510$a */
    public static class C19765a {

        /* JADX INFO: renamed from: a */
        public Context f161276a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f161277b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f161278c;

        /* JADX INFO: renamed from: d */
        public SurfaceView f161279d;

        public C19765a(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, SurfaceView surfaceView) {
            this.f161276a = context;
            this.f161277b = viewGroup;
            this.f161278c = viewGroup2;
            this.f161279d = surfaceView;
        }
    }

    public r510(Context context, u1f u1fVar) {
        this.f161269a = u1fVar;
        this.f161270b = context;
    }

    @Override // p153l.d0m
    /* JADX INFO: renamed from: a */
    public void mo113411a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f161271c;
        if (viewGroup2 == null || (viewGroup = this.f161272d) == null || (viewGroup2.findViewById(viewGroup.getId()) == null && this.f161272d.findViewById(this.f161271c.getId()) == null)) {
            ViewGroup viewGroup3 = this.f161271c;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                bnl0.m105524M(this.f161271c, true);
                m179838e();
            }
            o510 o510Var = this.f161274f;
            if (o510Var != null) {
                o510Var.mo100756e(new C19765a(this.f161270b, this.f161271c, this.f161272d, this.f161273e));
                this.f161274f.mo100754b();
            }
        }
    }

    @Override // p153l.d0m
    /* JADX INFO: renamed from: b */
    public void mo113412b(FrameLayout frameLayout) {
        m179839f();
        this.f161271c = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f161271c.setId(View.generateViewId());
    }

    @Override // p153l.d0m
    /* JADX INFO: renamed from: c */
    public void mo113413c(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f161272d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f161272d = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f161272d.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: d */
    public void m179837d(o510 o510Var) {
        m179840g();
        this.f161274f = o510Var;
        o510Var.mo100756e(new C19765a(this.f161270b, this.f161271c, this.f161272d, this.f161273e));
    }

    /* JADX INFO: renamed from: e */
    public final void m179838e() {
        if (this.f161271c == null) {
            return;
        }
        g64.m129083d("checkSurface and add surface to localContainer");
        SurfaceView surfaceView = new SurfaceView(this.f161270b);
        this.f161273e = surfaceView;
        this.f161271c.addView(surfaceView);
        SurfaceView surfaceView2 = this.f161273e;
        int i = bnl0.f77544e;
        surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        this.f161269a.f176994c.m101601q1(this.f161273e);
    }

    /* JADX INFO: renamed from: f */
    public final void m179839f() {
        if (this.f161273e != null) {
            this.f161273e = null;
        }
        ViewGroup viewGroup = this.f161271c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f161271c = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m179840g() {
        o510 o510Var = this.f161274f;
        if (o510Var != null) {
            o510Var.mo100755c();
            this.f161274f.m166084d();
            this.f161274f = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public SurfaceView m179841h() {
        return this.f161273e;
    }

    /* JADX INFO: renamed from: j */
    public void m179843j() {
        SurfaceView surfaceView;
        ViewGroup viewGroup = this.f161271c;
        if (viewGroup == null || (surfaceView = this.f161273e) == null || this.f161275g) {
            return;
        }
        this.f161275g = true;
        viewGroup.removeView(surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m179844k() {
        SurfaceView surfaceView;
        if (this.f161271c == null || (surfaceView = this.f161273e) == null || !this.f161275g) {
            return;
        }
        this.f161275g = false;
        if (surfaceView.getParent() == null) {
            this.f161271c.addView(this.f161273e, 0);
        }
        o510 o510Var = this.f161274f;
        if (o510Var != null) {
            o510Var.mo100754b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m179845l() {
        this.f161273e = null;
    }

    /* JADX INFO: renamed from: i */
    public void m179842i() {
    }
}
