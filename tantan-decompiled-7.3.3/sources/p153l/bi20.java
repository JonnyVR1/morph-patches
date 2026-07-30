package p153l;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class bi20 {

    /* JADX INFO: renamed from: a */
    public ViewParent f76832a;

    /* JADX INFO: renamed from: b */
    public ViewParent f76833b;

    /* JADX INFO: renamed from: c */
    public final View f76834c;

    /* JADX INFO: renamed from: d */
    public boolean f76835d;

    /* JADX INFO: renamed from: e */
    public int[] f76836e;

    public bi20(@NonNull View view) {
        this.f76834c = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m104391a(float f, float f2, boolean z) {
        ViewParent viewParentM104399i;
        if (!m104403m() || (viewParentM104399i = m104399i(0)) == null) {
            return false;
        }
        return fml0.m126258a(viewParentM104399i, this.f76834c, f, f2, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m104392b(float f, float f2) {
        ViewParent viewParentM104399i;
        if (!m104403m() || (viewParentM104399i = m104399i(0)) == null) {
            return false;
        }
        return fml0.m126259b(viewParentM104399i, this.f76834c, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public boolean m104393c(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return m104394d(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m104394d(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent viewParentM104399i;
        int i4;
        int i5;
        if (!m104403m() || (viewParentM104399i = m104399i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f76834c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m104400j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        fml0.m126260c(viewParentM104399i, this.f76834c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.f76834c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m104395e(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        m104398h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m104396f(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return m104398h(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public boolean m104397g(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        return m104398h(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m104398h(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent viewParentM104399i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m104403m() || (viewParentM104399i = m104399i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f76834c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM104400j = m104400j();
            iArrM104400j[0] = 0;
            iArrM104400j[1] = 0;
            iArr3 = iArrM104400j;
        } else {
            iArr3 = iArr2;
        }
        fml0.m126261d(viewParentM104399i, this.f76834c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f76834c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final ViewParent m104399i(int i) {
        if (i == 0) {
            return this.f76832a;
        }
        if (i != 1) {
            return null;
        }
        return this.f76833b;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m104400j() {
        if (this.f76836e == null) {
            this.f76836e = new int[2];
        }
        return this.f76836e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m104401k() {
        return m104402l(0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m104402l(int i) {
        return m104399i(i) != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m104403m() {
        return this.f76835d;
    }

    /* JADX INFO: renamed from: n */
    public void m104404n(boolean z) {
        if (this.f76835d) {
            kkl0.m150125H0(this.f76834c);
        }
        this.f76835d = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m104405o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f76832a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f76833b = viewParent;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m104406p(int i) {
        return m104407q(i, 0);
    }

    /* JADX INFO: renamed from: q */
    public boolean m104407q(int i, int i2) {
        if (m104402l(i2)) {
            return true;
        }
        if (!m104403m()) {
            return false;
        }
        View view = this.f76834c;
        for (ViewParent parent = this.f76834c.getParent(); parent != null; parent = parent.getParent()) {
            if (fml0.m126263f(parent, view, this.f76834c, i, i2)) {
                m104405o(i2, parent);
                fml0.m126262e(parent, view, this.f76834c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m104408r() {
        m104409s(0);
    }

    /* JADX INFO: renamed from: s */
    public void m104409s(int i) {
        ViewParent viewParentM104399i = m104399i(i);
        if (viewParentM104399i != null) {
            fml0.m126264g(viewParentM104399i, this.f76834c, i);
            m104405o(i, null);
        }
    }
}
