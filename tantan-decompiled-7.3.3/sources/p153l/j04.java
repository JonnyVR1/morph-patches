package p153l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class j04 extends o510 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f117777b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f117778c;

    /* JADX INFO: renamed from: d */
    public HashMap<Long, SurfaceView> f117779d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public Map.Entry<Long, Integer> f117780e;

    /* JADX INFO: renamed from: g */
    private void m142897g() {
        if (this.f117777b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f145026a.f161276a);
            this.f117777b = frameLayout;
            frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        if (this.f145026a.f161278c != null && this.f117777b.getParent() == null) {
            this.f145026a.f161278c.addView(this.f117777b);
            bnl0.m105524M(this.f145026a.f161278c, true);
        }
        m142905n();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        g64.m129083d("refreshLayout");
        Map.Entry<Long, Integer> entry = this.f117780e;
        if (entry == null) {
            m142902k();
            return;
        }
        Long key = entry.getKey();
        key.longValue();
        SurfaceView surfaceView = this.f117779d.get(key);
        if (surfaceView == null) {
            return;
        }
        this.f117778c = surfaceView;
        m142903l();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
        m142899h();
        this.f117780e = null;
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
    }

    /* JADX INFO: renamed from: f */
    public void m142898f(SurfaceView surfaceView, long j) {
        if (surfaceView == null) {
            return;
        }
        g64.m129083d("addRemoteView uid:" + j);
        this.f117779d.put(Long.valueOf(j), surfaceView);
    }

    /* JADX INFO: renamed from: h */
    public void m142899h() {
        g64.m129083d("cleanRemote");
        m142900i();
        this.f117779d.clear();
        this.f117778c = null;
    }

    /* JADX INFO: renamed from: i */
    public void m142900i() {
        FrameLayout frameLayout = this.f117777b;
        if (frameLayout == null || this.f145026a.f161278c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f145026a.f161278c.removeView(this.f117777b);
        this.f117777b = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m142901j(long j) {
        return this.f117779d.get(Long.valueOf(j)) != null;
    }

    /* JADX INFO: renamed from: k */
    public void m142902k() {
        ViewGroup viewGroup;
        g64.m129083d("setLocalFull");
        m142900i();
        r510.C19765a c19765a = this.f145026a;
        if (c19765a.f161279d == null || (viewGroup = c19765a.f161277b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f145026a.f161277b.getHeight();
        FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(this.f145026a.f161279d);
        layoutParamsM166083a.topMargin = 0;
        layoutParamsM166083a.width = width;
        layoutParamsM166083a.height = height;
        this.f145026a.f161279d.setLayoutParams(layoutParamsM166083a);
        bnl0.m105524M(this.f145026a.f161279d, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m142903l() {
        g64.m129083d("refreshLayout");
        int iM216939p = ynp0.m216939p() / 2;
        int i = (int) (iM216939p * 1.488f);
        int iM125051a = fct.m125051a(true);
        m142897g();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM216939p, i);
        layoutParams.leftMargin = iM216939p;
        layoutParams.topMargin = iM125051a;
        this.f117777b.setLayoutParams(layoutParams);
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(surfaceView);
            layoutParamsM166083a.topMargin = iM125051a;
            layoutParamsM166083a.width = iM216939p;
            layoutParamsM166083a.height = i;
            this.f145026a.f161279d.setLayoutParams(layoutParamsM166083a);
            bnl0.m105524M(this.f145026a.f161279d, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m142904m(Map.Entry<Long, Integer> entry) {
        this.f117780e = entry;
    }

    /* JADX INFO: renamed from: n */
    public final void m142905n() {
        FrameLayout frameLayout = this.f117777b;
        if (frameLayout != null) {
            bnl0.m105524M(frameLayout, true);
            SurfaceView surfaceView = this.f117778c;
            if (surfaceView == null || surfaceView.getParent() != null) {
                return;
            }
            this.f117777b.addView(this.f117778c);
        }
    }
}
