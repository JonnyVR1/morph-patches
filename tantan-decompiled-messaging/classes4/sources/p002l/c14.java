package p002l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.eat;
import l.h54;
import l.uep0;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c14 extends ex00 {

    /* JADX INFO: renamed from: b */
    public HashMap<Long, C0507a> f8444b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public int f8445c;

    /* JADX INFO: renamed from: d */
    public long f8446d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f8447e;

    /* JADX INFO: renamed from: l.c14$a */
    public static class C0507a {

        /* JADX INFO: renamed from: a */
        public long f8448a;

        /* JADX INFO: renamed from: b */
        public boolean f8449b;

        /* JADX INFO: renamed from: c */
        public SurfaceView f8450c;

        /* JADX INFO: renamed from: d */
        public boolean f8451d = true;

        public C0507a(long j, boolean z, SurfaceView surfaceView) {
            this.f8448a = j;
            this.f8449b = z;
            this.f8450c = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public void m10723a(boolean z) {
            this.f8451d = z;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10709j() {
        if (this.f8447e == null) {
            FrameLayout frameLayout = new FrameLayout(this.f10037a.f12328a);
            this.f8447e = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
        }
        if (this.f10037a.f12330c == null || this.f8447e.getParent() != null) {
            return;
        }
        this.f10037a.f12330c.addView(this.f8447e);
        xdl0.M(this.f10037a.f12330c, true);
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        m10721u(this.f8445c);
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
        ViewGroup viewGroup = this.f10037a.f12330c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f10037a.f12329b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        FrameLayout frameLayout = this.f8447e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f8447e = null;
        }
        this.f8444b.clear();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
    }

    /* JADX INFO: renamed from: i */
    public void m10710i(long j, SurfaceView surfaceView, boolean z, boolean z2) {
        if (surfaceView == null) {
            return;
        }
        if (z && this.f8446d == 0) {
            this.f8446d = j;
        }
        C0507a c0507a = new C0507a(j, z, surfaceView);
        c0507a.m10723a(z2);
        this.f8444b.put(Long.valueOf(j), c0507a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10711k(int i, C0507a c0507a) {
        SurfaceView surfaceView = c0507a.f8450c;
        this.f8447e.addView(surfaceView);
        if (c0507a.f8449b) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uep0.p() / 2, i);
            layoutParams.leftMargin = 0;
            surfaceView.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(uep0.p() / 2, i);
            layoutParams2.leftMargin = uep0.p() / 2;
            surfaceView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10712l(long j) {
        if (this.f8446d == j) {
            this.f8446d = 0L;
        }
        this.f8444b.remove(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: m */
    public final void m10713m() {
        h54.d("setAudioModeLayout userSurfaceInfoMap:" + this.f8444b.toString());
        m10709j();
        ArrayList arrayListN = vwb.n(this.f8444b.values(), new w9j() { // from class: l.a14
            public final Object call(Object obj) {
                return Boolean.valueOf(((c14.C0507a) obj).f8451d);
            }
        });
        if (arrayListN.size() >= 2 && this.f8446d != 0) {
            m10714n(arrayListN);
        } else {
            if (arrayListN.size() != 1 || this.f8446d == 0) {
                return;
            }
            m10718r();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10714n(List<C0507a> list) {
        if (this.f10037a.f12330c == null) {
            return;
        }
        final int iP = (int) ((uep0.p() / 2) * 1.488f);
        int iA = eat.a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uep0.p(), iP);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iA;
        this.f8447e.setLayoutParams(layoutParams);
        this.f8447e.removeAllViews();
        vwb.z(list, new e30() { // from class: l.b14
            public final void call(Object obj) {
                this.f7948a.m10711k(iP, (c14.C0507a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m10715o(boolean z) {
        h54.d("setLocalVisible:" + z);
        ViewGroup viewGroup = this.f10037a.f12329b;
        if (viewGroup != null) {
            xdl0.M(viewGroup, z);
        }
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            xdl0.M(surfaceView, z);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m10716p(int i) {
        this.f8445c = i;
        if (this.f10037a != null) {
            mo10326b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10717q() {
        m10713m();
    }

    /* JADX INFO: renamed from: r */
    public final void m10718r() {
        C0507a c0507a = this.f8444b.get(Long.valueOf(this.f8446d));
        if (this.f8446d == 0 || c0507a == null || this.f10037a.f12330c == null) {
            return;
        }
        SurfaceView surfaceView = c0507a.f8450c;
        int i = xdl0.e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        FrameLayout frameLayout = this.f8447e;
        int i2 = xdl0.e;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        if (this.f8447e.getChildCount() == 1 && surfaceView.getParent() == this.f8447e) {
            return;
        }
        this.f8447e.removeAllViews();
        this.f8447e.addView(surfaceView);
    }

    /* JADX INFO: renamed from: s */
    public boolean m10719s(long j, boolean z) {
        C0507a c0507a = this.f8444b.get(Long.valueOf(j));
        if (c0507a == null || c0507a.f8451d == z) {
            return false;
        }
        c0507a.m10723a(z);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m10720t() {
        h54.d("setVideoModeLayout userSurfaceInfoMap:" + this.f8444b.toString());
        C0507a c0507a = (C0507a) vwb.r(this.f8444b.values(), new w9j() { // from class: l.z04
            public final Object call(Object obj) {
                return Boolean.valueOf(((c14.C0507a) obj).f8449b);
            }
        });
        if (this.f10037a.f12331d == null || c0507a == null) {
            return;
        }
        m10709j();
        this.f8447e.removeAllViews();
        int iP = uep0.p() / 2;
        int i = (int) (iP * 1.488f);
        int iA = eat.a(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iP, i);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = iA;
        this.f8447e.setLayoutParams(layoutParams);
        SurfaceView surfaceView = c0507a.f8450c;
        int i2 = xdl0.e;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        this.f8447e.addView(c0507a.f8450c);
        FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(this.f10037a.f12331d);
        layoutParamsM12797a.leftMargin = iP;
        layoutParamsM12797a.topMargin = iA;
        layoutParamsM12797a.width = iP;
        layoutParamsM12797a.height = i;
        this.f10037a.f12331d.setLayoutParams(layoutParamsM12797a);
    }

    /* JADX INFO: renamed from: u */
    public final void m10721u(int i) {
        h54.d("updateLayout mode:" + i);
        if (i == 1) {
            m10715o(true);
            m10717q();
        } else if (i == 2) {
            m10715o(false);
            m10713m();
        } else {
            if (i != 3) {
                return;
            }
            m10715o(true);
            m10720t();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m10722v(Long l2, boolean z) {
        C0507a c0507a = this.f8444b.get(l2);
        if (c0507a != null) {
            boolean z2 = c0507a.f8451d;
            c0507a.m10723a(z);
            if (z2 != z) {
                mo10326b();
            }
        }
    }
}
