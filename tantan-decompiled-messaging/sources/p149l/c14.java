package p149l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class c14 extends ex00 {

    /* JADX INFO: renamed from: b */
    public HashMap<Long, C16036a> f78198b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public int f78199c;

    /* JADX INFO: renamed from: d */
    public long f78200d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f78201e;

    /* JADX INFO: renamed from: l.c14$a */
    public static class C16036a {

        /* JADX INFO: renamed from: a */
        public long f78202a;

        /* JADX INFO: renamed from: b */
        public boolean f78203b;

        /* JADX INFO: renamed from: c */
        public SurfaceView f78204c;

        /* JADX INFO: renamed from: d */
        public boolean f78205d = true;

        public C16036a(long j, boolean z, SurfaceView surfaceView) {
            this.f78202a = j;
            this.f78203b = z;
            this.f78204c = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public void m104808a(boolean z) {
            this.f78205d = z;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m104794j() {
        if (this.f78201e == null) {
            FrameLayout frameLayout = new FrameLayout(this.f93563a.f109820a);
            this.f78201e = frameLayout;
            frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        if (this.f93563a.f109822c == null || this.f78201e.getParent() != null) {
            return;
        }
        this.f93563a.f109822c.addView(this.f78201e);
        xdl0.m208344M(this.f93563a.f109822c, true);
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        m104806u(this.f78199c);
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
        ViewGroup viewGroup = this.f93563a.f109822c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f93563a.f109821b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        FrameLayout frameLayout = this.f78201e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f78201e = null;
        }
        this.f78198b.clear();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
    }

    /* JADX INFO: renamed from: i */
    public void m104795i(long j, SurfaceView surfaceView, boolean z, boolean z2) {
        if (surfaceView == null) {
            return;
        }
        if (z && this.f78200d == 0) {
            this.f78200d = j;
        }
        C16036a c16036a = new C16036a(j, z, surfaceView);
        c16036a.m104808a(z2);
        this.f78198b.put(Long.valueOf(j), c16036a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m104796k(int i, C16036a c16036a) {
        SurfaceView surfaceView = c16036a.f78204c;
        this.f78201e.addView(surfaceView);
        if (c16036a.f78203b) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uep0.m193329p() / 2, i);
            layoutParams.leftMargin = 0;
            surfaceView.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(uep0.m193329p() / 2, i);
            layoutParams2.leftMargin = uep0.m193329p() / 2;
            surfaceView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m104797l(long j) {
        if (this.f78200d == j) {
            this.f78200d = 0L;
        }
        this.f78198b.remove(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: m */
    public final void m104798m() {
        h54.m129377d("setAudioModeLayout userSurfaceInfoMap:" + this.f78198b.toString());
        m104794j();
        ArrayList arrayListM200339n = vwb.m200339n(this.f78198b.values(), new w9j() { // from class: l.a14
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((c14.C16036a) obj).f78205d);
            }
        });
        if (arrayListM200339n.size() >= 2 && this.f78200d != 0) {
            m104799n(arrayListM200339n);
        } else {
            if (arrayListM200339n.size() != 1 || this.f78200d == 0) {
                return;
            }
            m104803r();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m104799n(List<C16036a> list) {
        if (this.f93563a.f109822c == null) {
            return;
        }
        final int iM193329p = (int) ((uep0.m193329p() / 2) * 1.488f);
        int iM115436a = eat.m115436a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uep0.m193329p(), iM193329p);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iM115436a;
        this.f78201e.setLayoutParams(layoutParams);
        this.f78201e.removeAllViews();
        vwb.m200354z(list, new e30() { // from class: l.b14
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72487a.m104796k(iM193329p, (c14.C16036a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m104800o(boolean z) {
        h54.m129377d("setLocalVisible:" + z);
        ViewGroup viewGroup = this.f93563a.f109821b;
        if (viewGroup != null) {
            xdl0.m208344M(viewGroup, z);
        }
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            xdl0.m208344M(surfaceView, z);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m104801p(int i) {
        this.f78199c = i;
        if (this.f93563a != null) {
            mo101817b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m104802q() {
        m104798m();
    }

    /* JADX INFO: renamed from: r */
    public final void m104803r() {
        C16036a c16036a = this.f78198b.get(Long.valueOf(this.f78200d));
        if (this.f78200d == 0 || c16036a == null || this.f93563a.f109822c == null) {
            return;
        }
        SurfaceView surfaceView = c16036a.f78204c;
        int i = xdl0.f192403e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        FrameLayout frameLayout = this.f78201e;
        int i2 = xdl0.f192403e;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        if (this.f78201e.getChildCount() == 1 && surfaceView.getParent() == this.f78201e) {
            return;
        }
        this.f78201e.removeAllViews();
        this.f78201e.addView(surfaceView);
    }

    /* JADX INFO: renamed from: s */
    public boolean m104804s(long j, boolean z) {
        C16036a c16036a = this.f78198b.get(Long.valueOf(j));
        if (c16036a == null || c16036a.f78205d == z) {
            return false;
        }
        c16036a.m104808a(z);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m104805t() {
        h54.m129377d("setVideoModeLayout userSurfaceInfoMap:" + this.f78198b.toString());
        C16036a c16036a = (C16036a) vwb.m200346r(this.f78198b.values(), new w9j() { // from class: l.z04
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((c14.C16036a) obj).f78203b);
            }
        });
        if (this.f93563a.f109823d == null || c16036a == null) {
            return;
        }
        m104794j();
        this.f78201e.removeAllViews();
        int iM193329p = uep0.m193329p() / 2;
        int i = (int) (iM193329p * 1.488f);
        int iM115436a = eat.m115436a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM193329p, i);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iM115436a;
        this.f78201e.setLayoutParams(layoutParams);
        SurfaceView surfaceView = c16036a.f78204c;
        int i2 = xdl0.f192403e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        this.f78201e.addView(c16036a.f78204c);
        FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(this.f93563a.f109823d);
        layoutParamsM118529a.leftMargin = iM193329p;
        layoutParamsM118529a.topMargin = iM115436a;
        layoutParamsM118529a.width = iM193329p;
        layoutParamsM118529a.height = i;
        this.f93563a.f109823d.setLayoutParams(layoutParamsM118529a);
    }

    /* JADX INFO: renamed from: u */
    public final void m104806u(int i) {
        h54.m129377d("updateLayout mode:" + i);
        if (i == 1) {
            m104800o(true);
            m104802q();
        } else if (i == 2) {
            m104800o(false);
            m104798m();
        } else {
            if (i != 3) {
                return;
            }
            m104800o(true);
            m104805t();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m104807v(Long l2, boolean z) {
        C16036a c16036a = this.f78198b.get(l2);
        if (c16036a != null) {
            boolean z2 = c16036a.f78205d;
            c16036a.m104808a(z);
            if (z2 != z) {
                mo101817b();
            }
        }
    }
}
