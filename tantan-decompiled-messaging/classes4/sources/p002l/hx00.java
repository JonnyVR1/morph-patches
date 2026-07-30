package p002l;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.h54;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hx00 implements kxl {

    /* JADX INFO: renamed from: a */
    public final q0f f12321a;

    /* JADX INFO: renamed from: b */
    public final Context f12322b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f12323c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f12324d;

    /* JADX INFO: renamed from: e */
    public SurfaceView f12325e;

    /* JADX INFO: renamed from: f */
    public ex00 f12326f;

    /* JADX INFO: renamed from: g */
    public boolean f12327g;

    /* JADX INFO: renamed from: l.hx00$a */
    public static class C0612a {

        /* JADX INFO: renamed from: a */
        public Context f12328a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f12329b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f12330c;

        /* JADX INFO: renamed from: d */
        public SurfaceView f12331d;

        public C0612a(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, SurfaceView surfaceView) {
            this.f12328a = context;
            this.f12329b = viewGroup;
            this.f12330c = viewGroup2;
            this.f12331d = surfaceView;
        }
    }

    public hx00(Context context, q0f q0fVar) {
        this.f12321a = q0fVar;
        this.f12322b = context;
    }

    @Override // p002l.kxl
    /* JADX INFO: renamed from: a */
    public void mo14889a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f12323c;
        if (viewGroup2 == null || (viewGroup = this.f12324d) == null || (viewGroup2.findViewById(viewGroup.getId()) == null && this.f12324d.findViewById(this.f12323c.getId()) == null)) {
            ViewGroup viewGroup3 = this.f12323c;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                xdl0.M(this.f12323c, true);
                m14893e();
            }
            ex00 ex00Var = this.f12326f;
            if (ex00Var != null) {
                ex00Var.mo10328e(new C0612a(this.f12322b, this.f12323c, this.f12324d, this.f12325e));
                this.f12326f.mo10326b();
            }
        }
    }

    @Override // p002l.kxl
    /* JADX INFO: renamed from: b */
    public void mo14890b(FrameLayout frameLayout) {
        m14894f();
        this.f12323c = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f12323c.setId(View.generateViewId());
    }

    @Override // p002l.kxl
    /* JADX INFO: renamed from: c */
    public void mo14891c(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f12324d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f12324d = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f12324d.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: d */
    public void m14892d(ex00 ex00Var) {
        m14895g();
        this.f12326f = ex00Var;
        ex00Var.mo10328e(new C0612a(this.f12322b, this.f12323c, this.f12324d, this.f12325e));
    }

    /* JADX INFO: renamed from: e */
    public final void m14893e() {
        if (this.f12323c == null) {
            return;
        }
        h54.d("checkSurface and add surface to localContainer");
        SurfaceView surfaceView = new SurfaceView(this.f12322b);
        this.f12325e = surfaceView;
        this.f12323c.addView(surfaceView);
        SurfaceView surfaceView2 = this.f12325e;
        int i = xdl0.e;
        surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        this.f12321a.f17744c.m22668q1(this.f12325e);
    }

    /* JADX INFO: renamed from: f */
    public final void m14894f() {
        if (this.f12325e != null) {
            this.f12325e = null;
        }
        ViewGroup viewGroup = this.f12323c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f12323c = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14895g() {
        ex00 ex00Var = this.f12326f;
        if (ex00Var != null) {
            ex00Var.mo10327c();
            this.f12326f.m12798d();
            this.f12326f = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public SurfaceView m14896h() {
        return this.f12325e;
    }

    /* JADX INFO: renamed from: j */
    public void m14898j() {
        SurfaceView surfaceView;
        ViewGroup viewGroup = this.f12323c;
        if (viewGroup == null || (surfaceView = this.f12325e) == null || this.f12327g) {
            return;
        }
        this.f12327g = true;
        viewGroup.removeView(surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m14899k() {
        SurfaceView surfaceView;
        if (this.f12323c == null || (surfaceView = this.f12325e) == null || !this.f12327g) {
            return;
        }
        this.f12327g = false;
        if (surfaceView.getParent() == null) {
            this.f12323c.addView(this.f12325e, 0);
        }
        ex00 ex00Var = this.f12326f;
        if (ex00Var != null) {
            ex00Var.mo10326b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m14900l() {
        this.f12325e = null;
    }

    /* JADX INFO: renamed from: i */
    public void m14897i() {
    }
}
