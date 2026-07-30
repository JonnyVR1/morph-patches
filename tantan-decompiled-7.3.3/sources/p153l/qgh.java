package p153l;

import android.graphics.Rect;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class qgh implements d0r {

    /* JADX INFO: renamed from: a */
    public int f157408a;

    /* JADX INFO: renamed from: b */
    public f0r f157409b;

    /* JADX INFO: renamed from: c */
    public int f157410c;

    /* JADX INFO: renamed from: d */
    public View f157411d;

    /* JADX INFO: renamed from: e */
    public View f157412e;

    /* JADX INFO: renamed from: f */
    public Act f157413f;

    /* JADX INFO: renamed from: g */
    public boolean f157414g;

    public qgh(View view, View view2, int i) {
        this.f157410c = i;
        this.f157411d = view;
        this.f157412e = view2;
    }

    /* JADX INFO: renamed from: a */
    public void m176472a() {
        if (NullChecker.m82486a(this.f157409b)) {
            if (NullChecker.m82486a(this.f157413f) && (this.f157413f.isDestroyed() || this.f157413f.isDestroyed())) {
                return;
            }
            this.f157409b.m123504b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m176473b() {
        int[] iArr = new int[2];
        this.f157411d.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m176474c() {
        Rect rect = new Rect();
        this.f157413f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: renamed from: d */
    public final void m176475d(Rect rect, int[] iArr) {
        int i = this.f157408a - rect.bottom;
        int i2 = iArr[1];
        int iM105590x0 = (bnl0.m105590x0(this.f157413f) - i) - this.f157410c;
        if (i2 > iM105590x0) {
            this.f157412e.setY(iM105590x0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m176476e(Act act) {
        this.f157413f = act;
        this.f157408a = bnl0.m105590x0(act);
        f0r f0rVar = new f0r(act);
        this.f157409b = f0rVar;
        f0rVar.m123509g(this);
        this.f157409b.m123510h();
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (this.f157414g) {
            return;
        }
        int[] iArrM176473b = m176473b();
        Rect rectM176474c = m176474c();
        if (rectM176474c.bottom < this.f157408a) {
            m176475d(rectM176474c, iArrM176473b);
        }
    }
}
