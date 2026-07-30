package p002l;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import l.e30;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bhd0 extends ex00 {

    /* JADX INFO: renamed from: b */
    public boolean f8131b;

    /* JADX INFO: renamed from: d */
    public String f8133d;

    /* JADX INFO: renamed from: c */
    public final HashMap<Long, SurfaceView> f8132c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public dhd0 f8134e = new dhd0();

    public bhd0(String str) {
        this.f8133d = str;
    }

    /* JADX INFO: renamed from: j */
    private boolean m10324j() {
        hx00.C0612a c0612a = this.f10037a;
        return (c0612a == null || c0612a.f12330c == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m10325l(Long l2) {
        FrameLayout.LayoutParams layoutParamsM11887a;
        SurfaceView surfaceView = this.f8132c.get(l2);
        if (surfaceView == null) {
            return;
        }
        if (this.f8131b) {
            this.f8134e.m11888b(1);
            boolean zM10332k = m10332k(String.valueOf(l2));
            dhd0 dhd0Var = this.f8134e;
            layoutParamsM11887a = zM10332k ? dhd0Var.m11887a(1) : dhd0Var.m11887a(2);
        } else {
            if (!m10332k(String.valueOf(l2))) {
                return;
            }
            this.f8134e.m11888b(0);
            layoutParamsM11887a = this.f8134e.m11887a(1);
        }
        if (layoutParamsM11887a == null) {
            return;
        }
        xdl0.M(surfaceView, true);
        surfaceView.setLayoutParams(layoutParamsM11887a);
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        vwb.z(this.f8132c.keySet(), new e30() { // from class: l.ahd0
            public final void call(Object obj) {
                this.f7616a.m10325l((Long) obj);
            }
        });
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
        if (m10324j()) {
            this.f10037a.f12330c.removeAllViews();
            xdl0.M(this.f10037a.f12330c, false);
        }
        this.f8132c.clear();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
        ViewGroup viewGroup = c0612a.f12330c;
        if (viewGroup != null) {
            xdl0.M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10329g(long j, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f8132c.put(Long.valueOf(j), surfaceView);
        xdl0.M(surfaceView, false);
        if (m10324j()) {
            this.f10037a.f12330c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10330h(int i) {
        this.f8131b = i == 1;
        mo10326b();
    }

    /* JADX INFO: renamed from: i */
    public void m10331i() {
        if (m10324j()) {
            this.f10037a.f12330c.removeAllViews();
        }
        this.f8132c.clear();
        this.f8131b = false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10332k(String str) {
        return !TextUtils.isEmpty(str) && str.equals(this.f8133d);
    }

    /* JADX INFO: renamed from: m */
    public void m10333m(long j) {
        SurfaceView surfaceViewRemove = this.f8132c.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m10324j()) {
            return;
        }
        this.f10037a.f12330c.removeView(surfaceViewRemove);
        fgd0.m13158a("setLayoutParams,removeRemote");
    }
}
