package p149l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class kz3 extends ex00 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f125351b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f125352c;

    /* JADX INFO: renamed from: d */
    public HashMap<Long, SurfaceView> f125353d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public Map.Entry<Long, Integer> f125354e;

    /* JADX INFO: renamed from: g */
    private void m147928g() {
        if (this.f125351b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f93563a.f109820a);
            this.f125351b = frameLayout;
            frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        if (this.f93563a.f109822c != null && this.f125351b.getParent() == null) {
            this.f93563a.f109822c.addView(this.f125351b);
            xdl0.m208344M(this.f93563a.f109822c, true);
        }
        m147936n();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        h54.m129377d("refreshLayout");
        Map.Entry<Long, Integer> entry = this.f125354e;
        if (entry == null) {
            m147933k();
            return;
        }
        Long key = entry.getKey();
        key.longValue();
        SurfaceView surfaceView = this.f125353d.get(key);
        if (surfaceView == null) {
            return;
        }
        this.f125352c = surfaceView;
        m147934l();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
        m147930h();
        this.f125354e = null;
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
    }

    /* JADX INFO: renamed from: f */
    public void m147929f(SurfaceView surfaceView, long j) {
        if (surfaceView == null) {
            return;
        }
        h54.m129377d("addRemoteView uid:" + j);
        this.f125353d.put(Long.valueOf(j), surfaceView);
    }

    /* JADX INFO: renamed from: h */
    public void m147930h() {
        h54.m129377d("cleanRemote");
        m147931i();
        this.f125353d.clear();
        this.f125352c = null;
    }

    /* JADX INFO: renamed from: i */
    public void m147931i() {
        FrameLayout frameLayout = this.f125351b;
        if (frameLayout == null || this.f93563a.f109822c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f93563a.f109822c.removeView(this.f125351b);
        this.f125351b = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m147932j(long j) {
        return this.f125353d.get(Long.valueOf(j)) != null;
    }

    /* JADX INFO: renamed from: k */
    public void m147933k() {
        ViewGroup viewGroup;
        h54.m129377d("setLocalFull");
        m147931i();
        hx00.C17423a c17423a = this.f93563a;
        if (c17423a.f109823d == null || (viewGroup = c17423a.f109821b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f93563a.f109821b.getHeight();
        FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(this.f93563a.f109823d);
        layoutParamsM118529a.topMargin = 0;
        layoutParamsM118529a.width = width;
        layoutParamsM118529a.height = height;
        this.f93563a.f109823d.setLayoutParams(layoutParamsM118529a);
        xdl0.m208344M(this.f93563a.f109823d, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m147934l() {
        h54.m129377d("refreshLayout");
        int iM193329p = uep0.m193329p() / 2;
        int i = (int) (iM193329p * 1.488f);
        int iM115436a = eat.m115436a(true);
        m147928g();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM193329p, i);
        layoutParams.leftMargin = iM193329p;
        layoutParams.topMargin = iM115436a;
        this.f125351b.setLayoutParams(layoutParams);
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(surfaceView);
            layoutParamsM118529a.topMargin = iM115436a;
            layoutParamsM118529a.width = iM193329p;
            layoutParamsM118529a.height = i;
            this.f93563a.f109823d.setLayoutParams(layoutParamsM118529a);
            xdl0.m208344M(this.f93563a.f109823d, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m147935m(Map.Entry<Long, Integer> entry) {
        this.f125354e = entry;
    }

    /* JADX INFO: renamed from: n */
    public final void m147936n() {
        FrameLayout frameLayout = this.f125351b;
        if (frameLayout != null) {
            xdl0.m208344M(frameLayout, true);
            SurfaceView surfaceView = this.f125352c;
            if (surfaceView == null || surfaceView.getParent() != null) {
                return;
            }
            this.f125351b.addView(this.f125352c);
        }
    }
}
