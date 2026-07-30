package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bhd0 extends ex00 {

    /* JADX INFO: renamed from: b */
    public boolean f75596b;

    /* JADX INFO: renamed from: d */
    public String f75598d;

    /* JADX INFO: renamed from: c */
    public final HashMap<Long, SurfaceView> f75597c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public dhd0 f75599e = new dhd0();

    public bhd0(String str) {
        this.f75598d = str;
    }

    /* JADX INFO: renamed from: j */
    private boolean m101815j() {
        hx00.C17423a c17423a = this.f93563a;
        return (c17423a == null || c17423a.f109822c == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m101816l(Long l2) {
        FrameLayout.LayoutParams layoutParamsM111818a;
        SurfaceView surfaceView = this.f75597c.get(l2);
        if (surfaceView == null) {
            return;
        }
        if (this.f75596b) {
            this.f75599e.m111819b(1);
            boolean zM101823k = m101823k(String.valueOf(l2));
            dhd0 dhd0Var = this.f75599e;
            layoutParamsM111818a = zM101823k ? dhd0Var.m111818a(1) : dhd0Var.m111818a(2);
        } else {
            if (!m101823k(String.valueOf(l2))) {
                return;
            }
            this.f75599e.m111819b(0);
            layoutParamsM111818a = this.f75599e.m111818a(1);
        }
        if (layoutParamsM111818a == null) {
            return;
        }
        xdl0.m208344M(surfaceView, true);
        surfaceView.setLayoutParams(layoutParamsM111818a);
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        vwb.m200354z(this.f75597c.keySet(), new e30() { // from class: l.ahd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69594a.m101816l((Long) obj);
            }
        });
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
        if (m101815j()) {
            this.f93563a.f109822c.removeAllViews();
            xdl0.m208344M(this.f93563a.f109822c, false);
        }
        this.f75597c.clear();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
        ViewGroup viewGroup = c17423a.f109822c;
        if (viewGroup != null) {
            xdl0.m208344M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m101820g(long j, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f75597c.put(Long.valueOf(j), surfaceView);
        xdl0.m208344M(surfaceView, false);
        if (m101815j()) {
            this.f93563a.f109822c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m101821h(int i) {
        this.f75596b = i == 1;
        mo101817b();
    }

    /* JADX INFO: renamed from: i */
    public void m101822i() {
        if (m101815j()) {
            this.f93563a.f109822c.removeAllViews();
        }
        this.f75597c.clear();
        this.f75596b = false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m101823k(String str) {
        return !TextUtils.isEmpty(str) && str.equals(this.f75598d);
    }

    /* JADX INFO: renamed from: m */
    public void m101824m(long j) {
        SurfaceView surfaceViewRemove = this.f75597c.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m101815j()) {
            return;
        }
        this.f93563a.f109822c.removeView(surfaceViewRemove);
        fgd0.m121206a("setLayoutParams,removeRemote");
    }
}
