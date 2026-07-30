package p149l;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class t920 {

    /* JADX INFO: renamed from: a */
    public ViewParent f168980a;

    /* JADX INFO: renamed from: b */
    public ViewParent f168981b;

    /* JADX INFO: renamed from: c */
    public final View f168982c;

    /* JADX INFO: renamed from: d */
    public boolean f168983d;

    /* JADX INFO: renamed from: e */
    public int[] f168984e;

    public t920(@NonNull View view) {
        this.f168982c = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m187581a(float f, float f2, boolean z) {
        ViewParent viewParentM187589i;
        if (!m187593m() || (viewParentM187589i = m187589i(0)) == null) {
            return false;
        }
        return bdl0.m101185a(viewParentM187589i, this.f168982c, f, f2, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m187582b(float f, float f2) {
        ViewParent viewParentM187589i;
        if (!m187593m() || (viewParentM187589i = m187589i(0)) == null) {
            return false;
        }
        return bdl0.m101186b(viewParentM187589i, this.f168982c, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public boolean m187583c(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return m187584d(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m187584d(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent viewParentM187589i;
        int i4;
        int i5;
        if (!m187593m() || (viewParentM187589i = m187589i(i3)) == null) {
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
            this.f168982c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m187590j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        bdl0.m101187c(viewParentM187589i, this.f168982c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.f168982c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m187585e(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        m187588h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m187586f(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return m187588h(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public boolean m187587g(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        return m187588h(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m187588h(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent viewParentM187589i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m187593m() || (viewParentM187589i = m187589i(i5)) == null) {
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
            this.f168982c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM187590j = m187590j();
            iArrM187590j[0] = 0;
            iArrM187590j[1] = 0;
            iArr3 = iArrM187590j;
        } else {
            iArr3 = iArr2;
        }
        bdl0.m101188d(viewParentM187589i, this.f168982c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f168982c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final ViewParent m187589i(int i) {
        if (i == 0) {
            return this.f168980a;
        }
        if (i != 1) {
            return null;
        }
        return this.f168981b;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m187590j() {
        if (this.f168984e == null) {
            this.f168984e = new int[2];
        }
        return this.f168984e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m187591k() {
        return m187592l(0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m187592l(int i) {
        return m187589i(i) != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m187593m() {
        return this.f168983d;
    }

    /* JADX INFO: renamed from: n */
    public void m187594n(boolean z) {
        if (this.f168983d) {
            gbl0.m125162H0(this.f168982c);
        }
        this.f168983d = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m187595o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f168980a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f168981b = viewParent;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m187596p(int i) {
        return m187597q(i, 0);
    }

    /* JADX INFO: renamed from: q */
    public boolean m187597q(int i, int i2) {
        if (m187592l(i2)) {
            return true;
        }
        if (!m187593m()) {
            return false;
        }
        View view = this.f168982c;
        for (ViewParent parent = this.f168982c.getParent(); parent != null; parent = parent.getParent()) {
            if (bdl0.m101190f(parent, view, this.f168982c, i, i2)) {
                m187595o(i2, parent);
                bdl0.m101189e(parent, view, this.f168982c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m187598r() {
        m187599s(0);
    }

    /* JADX INFO: renamed from: s */
    public void m187599s(int i) {
        ViewParent viewParentM187589i = m187589i(i);
        if (viewParentM187589i != null) {
            bdl0.m101191g(viewParentM187589i, this.f168982c, i);
            m187595o(i, null);
        }
    }
}
