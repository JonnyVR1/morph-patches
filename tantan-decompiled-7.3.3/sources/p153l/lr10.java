package p153l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class lr10 extends o510 {

    /* JADX INFO: renamed from: b */
    public final Boolean f133257b;

    /* JADX INFO: renamed from: c */
    public final qcj<Long, Integer> f133258c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Long, SurfaceView> f133259d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public tm10 f133260e;

    public lr10(boolean z, tm10 tm10Var, qcj<Long, Integer> qcjVar) {
        this.f133257b = Boolean.valueOf(z);
        this.f133258c = qcjVar;
        this.f133260e = tm10Var;
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        jyb.m147537z(this.f133259d.keySet(), new y20() { // from class: l.kr10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128410a.m155518i((Long) obj);
            }
        });
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
        this.f133259d.clear();
        if (m155517h()) {
            this.f145026a.f161278c.removeAllViews();
            bnl0.m105524M(this.f145026a.f161278c, false);
        }
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
        if (c19765a.f161279d != null) {
            this.f133259d.put(Long.valueOf(Long.parseLong(zrv.f205799a.m207631D0())), c19765a.f161279d);
        }
        ViewGroup viewGroup = c19765a.f161278c;
        if (viewGroup != null) {
            bnl0.m105524M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m155516g(Long l2, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f133259d.put(l2, surfaceView);
        bnl0.m105524M(surfaceView, false);
        if (m155517h()) {
            this.f145026a.f161278c.addView(surfaceView);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m155517h() {
        r510.C19765a c19765a = this.f145026a;
        return (c19765a == null || c19765a.f161278c == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m155518i(Long l2) {
        int iIntValue = this.f133258c.call(l2).intValue();
        SurfaceView surfaceView = this.f133259d.get(l2);
        FrameLayout.LayoutParams layoutParamsM191716b = this.f133260e.m191716b(iIntValue, 0, cd10.f81074b);
        if (layoutParamsM191716b == null || surfaceView == null) {
            return;
        }
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (!this.f133257b.booleanValue() || Long.parseLong(strM207631D0) != l2.longValue()) {
            bnl0.m105524M(surfaceView, bf10.m103819Y(iIntValue, this.f133260e.f174877a));
        }
        surfaceView.setLayoutParams(layoutParamsM191716b);
        ir10.m141746a("render video view,height:" + surfaceView.getHeight() + ",with:" + surfaceView.getWidth() + ",X:" + surfaceView.getX() + ",Y:" + surfaceView.getY());
    }

    /* JADX INFO: renamed from: j */
    public void m155519j() {
        ViewGroup viewGroup;
        r510.C19765a c19765a = this.f145026a;
        if (c19765a == null || (viewGroup = c19765a.f161277b) == null) {
            return;
        }
        viewGroup.removeAllViews();
        bnl0.m105524M(this.f145026a.f161277b, false);
    }

    /* JADX INFO: renamed from: k */
    public void m155520k(long j) {
        SurfaceView surfaceViewRemove = this.f133259d.remove(Long.valueOf(j));
        if (surfaceViewRemove == null || !m155517h()) {
            return;
        }
        this.f145026a.f161278c.removeView(surfaceViewRemove);
    }

    /* JADX INFO: renamed from: l */
    public void m155521l(tm10 tm10Var) {
        this.f133260e = tm10Var;
    }
}
