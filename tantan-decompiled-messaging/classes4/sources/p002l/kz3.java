package p002l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import l.eat;
import l.h54;
import l.uep0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kz3 extends ex00 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f14594b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f14595c;

    /* JADX INFO: renamed from: d */
    public HashMap<Long, SurfaceView> f14596d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public Map.Entry<Long, Integer> f14597e;

    /* JADX INFO: renamed from: g */
    private void m16883g() {
        if (this.f14594b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f10037a.f12328a);
            this.f14594b = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
        }
        if (this.f10037a.f12330c != null && this.f14594b.getParent() == null) {
            this.f10037a.f12330c.addView(this.f14594b);
            xdl0.M(this.f10037a.f12330c, true);
        }
        m16891n();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        h54.d("refreshLayout");
        Map.Entry<Long, Integer> entry = this.f14597e;
        if (entry == null) {
            m16888k();
            return;
        }
        Long key = entry.getKey();
        key.longValue();
        SurfaceView surfaceView = this.f14596d.get(key);
        if (surfaceView == null) {
            return;
        }
        this.f14595c = surfaceView;
        m16889l();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
        m16885h();
        this.f14597e = null;
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
    }

    /* JADX INFO: renamed from: f */
    public void m16884f(SurfaceView surfaceView, long j) {
        if (surfaceView == null) {
            return;
        }
        h54.d("addRemoteView uid:" + j);
        this.f14596d.put(Long.valueOf(j), surfaceView);
    }

    /* JADX INFO: renamed from: h */
    public void m16885h() {
        h54.d("cleanRemote");
        m16886i();
        this.f14596d.clear();
        this.f14595c = null;
    }

    /* JADX INFO: renamed from: i */
    public void m16886i() {
        FrameLayout frameLayout = this.f14594b;
        if (frameLayout == null || this.f10037a.f12330c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f10037a.f12330c.removeView(this.f14594b);
        this.f14594b = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16887j(long j) {
        return this.f14596d.get(Long.valueOf(j)) != null;
    }

    /* JADX INFO: renamed from: k */
    public void m16888k() {
        ViewGroup viewGroup;
        h54.d("setLocalFull");
        m16886i();
        hx00.C0612a c0612a = this.f10037a;
        if (c0612a.f12331d == null || (viewGroup = c0612a.f12329b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f10037a.f12329b.getHeight();
        FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(this.f10037a.f12331d);
        layoutParamsM12797a.topMargin = 0;
        layoutParamsM12797a.width = width;
        layoutParamsM12797a.height = height;
        this.f10037a.f12331d.setLayoutParams(layoutParamsM12797a);
        xdl0.M(this.f10037a.f12331d, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m16889l() {
        h54.d("refreshLayout");
        int iP = uep0.p() / 2;
        int i = (int) (iP * 1.488f);
        int iA = eat.a(true);
        m16883g();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iP, i);
        layoutParams.leftMargin = iP;
        layoutParams.topMargin = iA;
        this.f14594b.setLayoutParams(layoutParams);
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(surfaceView);
            layoutParamsM12797a.topMargin = iA;
            layoutParamsM12797a.width = iP;
            layoutParamsM12797a.height = i;
            this.f10037a.f12331d.setLayoutParams(layoutParamsM12797a);
            xdl0.M(this.f10037a.f12331d, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m16890m(Map.Entry<Long, Integer> entry) {
        this.f14597e = entry;
    }

    /* JADX INFO: renamed from: n */
    public final void m16891n() {
        FrameLayout frameLayout = this.f14594b;
        if (frameLayout != null) {
            xdl0.M(frameLayout, true);
            SurfaceView surfaceView = this.f14595c;
            if (surfaceView == null || surfaceView.getParent() != null) {
                return;
            }
            this.f14594b.addView(this.f14595c);
        }
    }
}
