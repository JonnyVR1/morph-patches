package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class epd0 extends o510 {

    /* JADX INFO: renamed from: b */
    public boolean f95221b;

    /* JADX INFO: renamed from: d */
    public String f95223d;

    /* JADX INFO: renamed from: c */
    public final HashMap<Long, SurfaceView> f95222c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public gpd0 f95224e = new gpd0();

    public epd0(String str) {
        this.f95223d = str;
    }

    /* JADX INFO: renamed from: j */
    private boolean m121851j() {
        r510.C19765a c19765a = this.f145026a;
        return (c19765a == null || c19765a.f161278c == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m121852l(Long l2) {
        FrameLayout.LayoutParams layoutParamsM131254a;
        SurfaceView surfaceView = this.f95222c.get(l2);
        if (surfaceView == null) {
            return;
        }
        if (this.f95221b) {
            this.f95224e.m131255b(1);
            boolean zM121856k = m121856k(String.valueOf(l2));
            gpd0 gpd0Var = this.f95224e;
            layoutParamsM131254a = zM121856k ? gpd0Var.m131254a(1) : gpd0Var.m131254a(2);
        } else {
            if (!m121856k(String.valueOf(l2))) {
                return;
            }
            this.f95224e.m131255b(0);
            layoutParamsM131254a = this.f95224e.m131254a(1);
        }
        if (layoutParamsM131254a == null) {
            return;
        }
        bnl0.m105524M(surfaceView, true);
        surfaceView.setLayoutParams(layoutParamsM131254a);
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        jyb.m147537z(this.f95222c.keySet(), new y20() { // from class: l.dpd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90044a.m121852l((Long) obj);
            }
        });
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
        if (m121851j()) {
            this.f145026a.f161278c.removeAllViews();
            bnl0.m105524M(this.f145026a.f161278c, false);
        }
        this.f95222c.clear();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
        ViewGroup viewGroup = c19765a.f161278c;
        if (viewGroup != null) {
            bnl0.m105524M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m121853g(long j, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f95222c.put(Long.valueOf(j), surfaceView);
        bnl0.m105524M(surfaceView, false);
        if (m121851j()) {
            this.f145026a.f161278c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m121854h(int i) {
        this.f95221b = i == 1;
        mo100754b();
    }

    /* JADX INFO: renamed from: i */
    public void m121855i() {
        if (m121851j()) {
            this.f145026a.f161278c.removeAllViews();
        }
        this.f95222c.clear();
        this.f95221b = false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m121856k(String str) {
        return !TextUtils.isEmpty(str) && str.equals(this.f95223d);
    }

    /* JADX INFO: renamed from: m */
    public void m121857m(long j) {
        SurfaceView surfaceViewRemove = this.f95222c.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m121851j()) {
            return;
        }
        this.f145026a.f161278c.removeView(surfaceViewRemove);
        iod0.m141294a("setLayoutParams,removeRemote");
    }
}
