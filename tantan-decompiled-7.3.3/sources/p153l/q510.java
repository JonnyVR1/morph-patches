package p153l;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public class q510 implements e0m {

    /* JADX INFO: renamed from: a */
    public final v1f f155645a;

    /* JADX INFO: renamed from: b */
    public final Context f155646b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f155647c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f155648d;

    /* JADX INFO: renamed from: e */
    public SurfaceView f155649e;

    /* JADX INFO: renamed from: f */
    public p510 f155650f;

    /* JADX INFO: renamed from: g */
    public boolean f155651g;

    /* JADX INFO: renamed from: l.q510$a */
    public static class C19522a {

        /* JADX INFO: renamed from: a */
        public Context f155652a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f155653b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f155654c;

        /* JADX INFO: renamed from: d */
        public SurfaceView f155655d;

        public C19522a(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, SurfaceView surfaceView) {
            this.f155652a = context;
            this.f155653b = viewGroup;
            this.f155654c = viewGroup2;
            this.f155655d = surfaceView;
        }
    }

    public q510(Context context, v1f v1fVar) {
        this.f155645a = v1fVar;
        this.f155646b = context;
    }

    @Override // p153l.e0m
    /* JADX INFO: renamed from: a */
    public void mo118890a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f155647c;
        if (viewGroup2 == null || (viewGroup = this.f155648d) == null || (viewGroup2.findViewById(viewGroup.getId()) == null && this.f155648d.findViewById(this.f155647c.getId()) == null)) {
            ViewGroup viewGroup3 = this.f155647c;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                bnl0.m105524M(this.f155647c, true);
                m175281e();
            }
            p510 p510Var = this.f155650f;
            if (p510Var != null) {
                p510Var.m170590d(new C19522a(this.f155646b, this.f155647c, this.f155648d, this.f155649e));
            }
        }
    }

    @Override // p153l.e0m
    /* JADX INFO: renamed from: b */
    public void mo118891b(FrameLayout frameLayout) {
        mo118892c();
        this.f155647c = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f155647c.setId(View.generateViewId());
    }

    @Override // p153l.e0m
    /* JADX INFO: renamed from: c */
    public void mo118892c() {
        if (this.f155649e != null) {
            this.f155649e = null;
        }
        ViewGroup viewGroup = this.f155647c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f155647c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m175280d(p510 p510Var) {
        m175282f();
        this.f155650f = p510Var;
        p510Var.m170590d(new C19522a(this.f155646b, this.f155647c, this.f155648d, this.f155649e));
    }

    /* JADX INFO: renamed from: e */
    public final void m175281e() {
        if (this.f155647c == null) {
            return;
        }
        SurfaceView surfaceView = new SurfaceView(this.f155646b);
        this.f155649e = surfaceView;
        this.f155647c.addView(surfaceView);
        SurfaceView surfaceView2 = this.f155649e;
        int i = bnl0.f77544e;
        surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        this.f155645a.f181963c.m95609h1(this.f155649e);
    }

    /* JADX INFO: renamed from: f */
    public void m175282f() {
        p510 p510Var = this.f155650f;
        if (p510Var != null) {
            p510Var.mo162562b();
            this.f155650f.m170589c();
            this.f155650f = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m175284h() {
        SurfaceView surfaceView;
        ViewGroup viewGroup = this.f155647c;
        if (viewGroup == null || (surfaceView = this.f155649e) == null || this.f155651g) {
            return;
        }
        this.f155651g = true;
        viewGroup.removeView(surfaceView);
    }

    /* JADX INFO: renamed from: i */
    public void m175285i() {
        SurfaceView surfaceView;
        if (this.f155647c == null || (surfaceView = this.f155649e) == null || !this.f155651g) {
            return;
        }
        this.f155651g = false;
        if (surfaceView.getParent() == null) {
            this.f155647c.addView(this.f155649e, 0);
        }
        p510 p510Var = this.f155650f;
        if (p510Var != null) {
            p510Var.mo162561a();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m175286j() {
        this.f155649e = null;
    }

    /* JADX INFO: renamed from: k */
    public void m175287k(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f155648d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f155648d = frameLayout;
        if (frameLayout == null || frameLayout.getId() != -1) {
            return;
        }
        this.f155648d.setId(View.generateViewId());
    }

    /* JADX INFO: renamed from: g */
    public void m175283g() {
    }
}
