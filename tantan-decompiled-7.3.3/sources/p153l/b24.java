package p153l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class b24 extends o510 {

    /* JADX INFO: renamed from: b */
    public HashMap<Long, C15896a> f74476b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public int f74477c;

    /* JADX INFO: renamed from: d */
    public long f74478d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f74479e;

    /* JADX INFO: renamed from: l.b24$a */
    public static class C15896a {

        /* JADX INFO: renamed from: a */
        public long f74480a;

        /* JADX INFO: renamed from: b */
        public boolean f74481b;

        /* JADX INFO: renamed from: c */
        public SurfaceView f74482c;

        /* JADX INFO: renamed from: d */
        public boolean f74483d = true;

        public C15896a(long j, boolean z, SurfaceView surfaceView) {
            this.f74480a = j;
            this.f74481b = z;
            this.f74482c = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public void m101638a(boolean z) {
            this.f74483d = z;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m101624j() {
        if (this.f74479e == null) {
            FrameLayout frameLayout = new FrameLayout(this.f145026a.f161276a);
            this.f74479e = frameLayout;
            frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        if (this.f145026a.f161278c == null || this.f74479e.getParent() != null) {
            return;
        }
        this.f145026a.f161278c.addView(this.f74479e);
        bnl0.m105524M(this.f145026a.f161278c, true);
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        m101636u(this.f74477c);
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
        ViewGroup viewGroup = this.f145026a.f161278c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f145026a.f161277b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        FrameLayout frameLayout = this.f74479e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f74479e = null;
        }
        this.f74476b.clear();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
    }

    /* JADX INFO: renamed from: i */
    public void m101625i(long j, SurfaceView surfaceView, boolean z, boolean z2) {
        if (surfaceView == null) {
            return;
        }
        if (z && this.f74478d == 0) {
            this.f74478d = j;
        }
        C15896a c15896a = new C15896a(j, z, surfaceView);
        c15896a.m101638a(z2);
        this.f74476b.put(Long.valueOf(j), c15896a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m101626k(int i, C15896a c15896a) {
        SurfaceView surfaceView = c15896a.f74482c;
        this.f74479e.addView(surfaceView);
        if (c15896a.f74481b) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ynp0.m216939p() / 2, i);
            layoutParams.leftMargin = 0;
            surfaceView.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ynp0.m216939p() / 2, i);
            layoutParams2.leftMargin = ynp0.m216939p() / 2;
            surfaceView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m101627l(long j) {
        if (this.f74478d == j) {
            this.f74478d = 0L;
        }
        this.f74476b.remove(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: m */
    public final void m101628m() {
        g64.m129083d("setAudioModeLayout userSurfaceInfoMap:" + this.f74476b.toString());
        m101624j();
        ArrayList arrayListM147522n = jyb.m147522n(this.f74476b.values(), new qcj() { // from class: l.z14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((b24.C15896a) obj).f74483d);
            }
        });
        if (arrayListM147522n.size() >= 2 && this.f74478d != 0) {
            m101629n(arrayListM147522n);
        } else {
            if (arrayListM147522n.size() != 1 || this.f74478d == 0) {
                return;
            }
            m101633r();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m101629n(List<C15896a> list) {
        if (this.f145026a.f161278c == null) {
            return;
        }
        final int iM216939p = (int) ((ynp0.m216939p() / 2) * 1.488f);
        int iM125051a = fct.m125051a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ynp0.m216939p(), iM216939p);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iM125051a;
        this.f74479e.setLayoutParams(layoutParams);
        this.f74479e.removeAllViews();
        jyb.m147537z(list, new y20() { // from class: l.a24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67932a.m101626k(iM216939p, (b24.C15896a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m101630o(boolean z) {
        g64.m129083d("setLocalVisible:" + z);
        ViewGroup viewGroup = this.f145026a.f161277b;
        if (viewGroup != null) {
            bnl0.m105524M(viewGroup, z);
        }
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            bnl0.m105524M(surfaceView, z);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m101631p(int i) {
        this.f74477c = i;
        if (this.f145026a != null) {
            mo100754b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m101632q() {
        m101628m();
    }

    /* JADX INFO: renamed from: r */
    public final void m101633r() {
        C15896a c15896a = this.f74476b.get(Long.valueOf(this.f74478d));
        if (this.f74478d == 0 || c15896a == null || this.f145026a.f161278c == null) {
            return;
        }
        SurfaceView surfaceView = c15896a.f74482c;
        int i = bnl0.f77544e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        FrameLayout frameLayout = this.f74479e;
        int i2 = bnl0.f77544e;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        if (this.f74479e.getChildCount() == 1 && surfaceView.getParent() == this.f74479e) {
            return;
        }
        this.f74479e.removeAllViews();
        this.f74479e.addView(surfaceView);
    }

    /* JADX INFO: renamed from: s */
    public boolean m101634s(long j, boolean z) {
        C15896a c15896a = this.f74476b.get(Long.valueOf(j));
        if (c15896a == null || c15896a.f74483d == z) {
            return false;
        }
        c15896a.m101638a(z);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m101635t() {
        g64.m129083d("setVideoModeLayout userSurfaceInfoMap:" + this.f74476b.toString());
        C15896a c15896a = (C15896a) jyb.m147529r(this.f74476b.values(), new qcj() { // from class: l.y14
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((b24.C15896a) obj).f74481b);
            }
        });
        if (this.f145026a.f161279d == null || c15896a == null) {
            return;
        }
        m101624j();
        this.f74479e.removeAllViews();
        int iM216939p = ynp0.m216939p() / 2;
        int i = (int) (iM216939p * 1.488f);
        int iM125051a = fct.m125051a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM216939p, i);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iM125051a;
        this.f74479e.setLayoutParams(layoutParams);
        SurfaceView surfaceView = c15896a.f74482c;
        int i2 = bnl0.f77544e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        this.f74479e.addView(c15896a.f74482c);
        FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(this.f145026a.f161279d);
        layoutParamsM166083a.leftMargin = iM216939p;
        layoutParamsM166083a.topMargin = iM125051a;
        layoutParamsM166083a.width = iM216939p;
        layoutParamsM166083a.height = i;
        this.f145026a.f161279d.setLayoutParams(layoutParamsM166083a);
    }

    /* JADX INFO: renamed from: u */
    public final void m101636u(int i) {
        g64.m129083d("updateLayout mode:" + i);
        if (i == 1) {
            m101630o(true);
            m101632q();
        } else if (i == 2) {
            m101630o(false);
            m101628m();
        } else {
            if (i != 3) {
                return;
            }
            m101630o(true);
            m101635t();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m101637v(Long l2, boolean z) {
        C15896a c15896a = this.f74476b.get(l2);
        if (c15896a != null) {
            boolean z2 = c15896a.f74483d;
            c15896a.m101638a(z);
            if (z2 != z) {
                mo100754b();
            }
        }
    }
}
