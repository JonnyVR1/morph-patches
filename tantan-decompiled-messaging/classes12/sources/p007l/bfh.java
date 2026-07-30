package p007l;

import android.graphics.Rect;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.dyq;
import l.fyq;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bfh implements dyq {

    /* JADX INFO: renamed from: a */
    public int f6278a;

    /* JADX INFO: renamed from: b */
    public fyq f6279b;

    /* JADX INFO: renamed from: c */
    public int f6280c;

    /* JADX INFO: renamed from: d */
    public View f6281d;

    /* JADX INFO: renamed from: e */
    public View f6282e;

    /* JADX INFO: renamed from: f */
    public Act f6283f;

    /* JADX INFO: renamed from: g */
    public boolean f6284g;

    public bfh(View view, View view2, int i) {
        this.f6280c = i;
        this.f6281d = view;
        this.f6282e = view2;
    }

    /* JADX INFO: renamed from: a */
    public void m8813a() {
        if (NullChecker.a(this.f6279b)) {
            if (NullChecker.a(this.f6283f) && (this.f6283f.isDestroyed() || this.f6283f.isDestroyed())) {
                return;
            }
            this.f6279b.b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m8814b() {
        int[] iArr = new int[2];
        this.f6281d.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m8815c() {
        Rect rect = new Rect();
        this.f6283f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public final void m8816d(Rect rect, int[] iArr) {
        int i = this.f6278a - rect.bottom;
        int i2 = iArr[1];
        int iX0 = (xdl0.x0(this.f6283f) - i) - this.f6280c;
        if (i2 > iX0) {
            this.f6282e.setY(iX0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8817e(Act act) {
        this.f6283f = act;
        this.f6278a = xdl0.x0(act);
        fyq fyqVar = new fyq(act);
        this.f6279b = fyqVar;
        fyqVar.g(this);
        this.f6279b.h();
    }

    /* JADX INFO: renamed from: h */
    public void m8818h(int i, int i2) {
        if (this.f6284g) {
            return;
        }
        int[] iArrM8814b = m8814b();
        Rect rectM8815c = m8815c();
        if (rectM8815c.bottom < this.f6278a) {
            m8816d(rectM8815c, iArrM8814b);
        }
    }
}
