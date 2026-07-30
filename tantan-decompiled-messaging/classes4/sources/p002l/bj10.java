package p002l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import l.e30;
import l.r610;
import l.s410;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yi10;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bj10 extends ex00 {

    /* JADX INFO: renamed from: b */
    public final Boolean f8172b;

    /* JADX INFO: renamed from: c */
    public final w9j<Long, Integer> f8173c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Long, SurfaceView> f8174d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public je10 f8175e;

    public bj10(boolean z, je10 je10Var, w9j<Long, Integer> w9jVar) {
        this.f8172b = Boolean.valueOf(z);
        this.f8173c = w9jVar;
        this.f8175e = je10Var;
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        vwb.z(this.f8174d.keySet(), new e30() { // from class: l.aj10
            public final void call(Object obj) {
                this.f7656a.m10381i((Long) obj);
            }
        });
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
        this.f8174d.clear();
        if (m10380h()) {
            this.f10037a.f12330c.removeAllViews();
            xdl0.M(this.f10037a.f12330c, false);
        }
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
        if (c0612a.f12331d != null) {
            this.f8174d.put(Long.valueOf(Long.parseLong(ypv.a.D0())), c0612a.f12331d);
        }
        ViewGroup viewGroup = c0612a.f12330c;
        if (viewGroup != null) {
            xdl0.M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10379g(Long l2, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f8174d.put(l2, surfaceView);
        xdl0.M(surfaceView, false);
        if (m10380h()) {
            this.f10037a.f12330c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10380h() {
        hx00.C0612a c0612a = this.f10037a;
        return (c0612a == null || c0612a.f12330c == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m10381i(Long l2) {
        int iIntValue = ((Integer) this.f8173c.call(l2)).intValue();
        SurfaceView surfaceView = this.f8174d.get(l2);
        FrameLayout.LayoutParams layoutParamsM15873b = this.f8175e.m15873b(iIntValue, 0, s410.b);
        if (layoutParamsM15873b == null || surfaceView == null) {
            return;
        }
        String strD0 = ypv.a.D0();
        if (!this.f8172b.booleanValue() || Long.parseLong(strD0) != l2.longValue()) {
            xdl0.M(surfaceView, r610.Y(iIntValue, this.f8175e.f13705a));
        }
        surfaceView.setLayoutParams(layoutParamsM15873b);
        yi10.a("render video view,height:" + surfaceView.getHeight() + ",with:" + surfaceView.getWidth() + ",X:" + surfaceView.getX() + ",Y:" + surfaceView.getY());
    }

    /* JADX INFO: renamed from: j */
    public void m10382j() {
        ViewGroup viewGroup;
        hx00.C0612a c0612a = this.f10037a;
        if (c0612a == null || (viewGroup = c0612a.f12329b) == null) {
            return;
        }
        viewGroup.removeAllViews();
        xdl0.M(this.f10037a.f12329b, false);
    }

    /* JADX INFO: renamed from: k */
    public void m10383k(long j) {
        SurfaceView surfaceViewRemove = this.f8174d.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m10380h()) {
            return;
        }
        this.f10037a.f12330c.removeView(surfaceViewRemove);
    }

    /* JADX INFO: renamed from: l */
    public void m10384l(je10 je10Var) {
        this.f8175e = je10Var;
    }
}
