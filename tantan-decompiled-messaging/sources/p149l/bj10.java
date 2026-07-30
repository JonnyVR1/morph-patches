package p149l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bj10 extends ex00 {

    /* JADX INFO: renamed from: b */
    public final Boolean f75857b;

    /* JADX INFO: renamed from: c */
    public final w9j<Long, Integer> f75858c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Long, SurfaceView> f75859d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public je10 f75860e;

    public bj10(boolean z, je10 je10Var, w9j<Long, Integer> w9jVar) {
        this.f75857b = Boolean.valueOf(z);
        this.f75858c = w9jVar;
        this.f75860e = je10Var;
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        vwb.m200354z(this.f75859d.keySet(), new e30() { // from class: l.aj10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70080a.m102147i((Long) obj);
            }
        });
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
        this.f75859d.clear();
        if (m102146h()) {
            this.f93563a.f109822c.removeAllViews();
            xdl0.m208344M(this.f93563a.f109822c, false);
        }
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
        if (c17423a.f109823d != null) {
            this.f75859d.put(Long.valueOf(Long.parseLong(ypv.f199493a.m199309D0())), c17423a.f109823d);
        }
        ViewGroup viewGroup = c17423a.f109822c;
        if (viewGroup != null) {
            xdl0.m208344M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m102145g(Long l2, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f75859d.put(l2, surfaceView);
        xdl0.m208344M(surfaceView, false);
        if (m102146h()) {
            this.f93563a.f109822c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m102146h() {
        hx00.C17423a c17423a = this.f93563a;
        return (c17423a == null || c17423a.f109822c == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m102147i(Long l2) {
        int iIntValue = this.f75858c.call(l2).intValue();
        SurfaceView surfaceView = this.f75859d.get(l2);
        FrameLayout.LayoutParams layoutParamsM141093b = this.f75860e.m141093b(iIntValue, 0, s410.f162236b);
        if (layoutParamsM141093b == null || surfaceView == null) {
            return;
        }
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (!this.f75857b.booleanValue() || Long.parseLong(strM199309D0) != l2.longValue()) {
            xdl0.m208344M(surfaceView, r610.m177990Y(iIntValue, this.f75860e.f117456a));
        }
        surfaceView.setLayoutParams(layoutParamsM141093b);
        yi10.m214879a("render video view,height:" + surfaceView.getHeight() + ",with:" + surfaceView.getWidth() + ",X:" + surfaceView.getX() + ",Y:" + surfaceView.getY());
    }

    /* JADX INFO: renamed from: j */
    public void m102148j() {
        ViewGroup viewGroup;
        hx00.C17423a c17423a = this.f93563a;
        if (c17423a == null || (viewGroup = c17423a.f109821b) == null) {
            return;
        }
        viewGroup.removeAllViews();
        xdl0.m208344M(this.f93563a.f109821b, false);
    }

    /* JADX INFO: renamed from: k */
    public void m102149k(long j) {
        SurfaceView surfaceViewRemove = this.f75859d.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m102146h()) {
            return;
        }
        this.f93563a.f109822c.removeView(surfaceViewRemove);
    }

    /* JADX INFO: renamed from: l */
    public void m102150l(je10 je10Var) {
        this.f75860e = je10Var;
    }
}
