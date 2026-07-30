package p149l;

import android.graphics.Rect;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class bfh implements dyq {

    /* JADX INFO: renamed from: a */
    public int f75312a;

    /* JADX INFO: renamed from: b */
    public fyq f75313b;

    /* JADX INFO: renamed from: c */
    public int f75314c;

    /* JADX INFO: renamed from: d */
    public View f75315d;

    /* JADX INFO: renamed from: e */
    public View f75316e;

    /* JADX INFO: renamed from: f */
    public Act f75317f;

    /* JADX INFO: renamed from: g */
    public boolean f75318g;

    public bfh(View view, View view2, int i) {
        this.f75314c = i;
        this.f75315d = view;
        this.f75316e = view2;
    }

    /* JADX INFO: renamed from: a */
    public void m101531a() {
        if (NullChecker.m81303a(this.f75313b)) {
            if (NullChecker.m81303a(this.f75317f) && (this.f75317f.isDestroyed() || this.f75317f.isDestroyed())) {
                return;
            }
            this.f75313b.m123789b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m101532b() {
        int[] iArr = new int[2];
        this.f75315d.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m101533c() {
        Rect rect = new Rect();
        this.f75317f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public final void m101534d(Rect rect, int[] iArr) {
        int i = this.f75312a - rect.bottom;
        int i2 = iArr[1];
        int iM208410x0 = (xdl0.m208410x0(this.f75317f) - i) - this.f75314c;
        if (i2 > iM208410x0) {
            this.f75316e.setY(iM208410x0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m101535e(Act act) {
        this.f75317f = act;
        this.f75312a = xdl0.m208410x0(act);
        fyq fyqVar = new fyq(act);
        this.f75313b = fyqVar;
        fyqVar.m123794g(this);
        this.f75313b.m123795h();
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (this.f75318g) {
            return;
        }
        int[] iArrM101532b = m101532b();
        Rect rectM101533c = m101533c();
        if (rectM101533c.bottom < this.f75312a) {
            m101534d(rectM101533c, iArrM101532b);
        }
    }
}
