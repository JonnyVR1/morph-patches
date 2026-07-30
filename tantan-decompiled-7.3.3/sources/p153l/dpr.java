package p153l;

import android.widget.ListView;

/* JADX INFO: loaded from: classes3.dex */
public class dpr {

    /* JADX INFO: renamed from: a */
    public final ListView f90078a;

    /* JADX INFO: renamed from: b */
    public final y20<Integer> f90079b;

    /* JADX INFO: renamed from: c */
    public final int f90080c;

    /* JADX INFO: renamed from: d */
    public boolean f90081d = true;

    /* JADX INFO: renamed from: e */
    public boolean f90082e = false;

    public dpr(ListView listView, y20<Integer> y20Var, int i) {
        this.f90078a = listView;
        this.f90079b = y20Var;
        this.f90080c = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m117419b() {
        return this.f90078a.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: c */
    public final int m117420c() {
        return (this.f90078a.getCount() - this.f90078a.getHeaderViewsCount()) - this.f90078a.getFooterViewsCount();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m117421d() {
        this.f90081d = false;
        int iM117419b = m117419b();
        int iM117424g = m117424g();
        for (int iMax = Math.max(0, iM117419b - this.f90080c); iMax < iM117419b; iMax++) {
            this.f90079b.call(Integer.valueOf(iMax));
        }
        int i = iM117419b + iM117424g;
        for (int i2 = i + 1; i2 < Math.min(this.f90080c + i + 1, m117420c()); i2++) {
            this.f90079b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m117422e(int i) {
        if (this.f90081d) {
            if (this.f90082e) {
                return;
            }
            this.f90082e = true;
            this.f90078a.postDelayed(new Runnable() { // from class: l.cpr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83016a.m117421d();
                }
            }, 250L);
            return;
        }
        int iM117419b = m117419b();
        int iAbs = Math.abs((m117424g() + iM117419b) - i);
        int iAbs2 = Math.abs(iM117419b - i);
        int i2 = this.f90080c;
        if (iAbs < iAbs2) {
            if (i2 + i < m117420c()) {
                this.f90079b.call(Integer.valueOf(i + this.f90080c));
            }
        } else if (i - i2 >= 0) {
            this.f90079b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m117423f() {
        this.f90081d = true;
        this.f90082e = false;
    }

    /* JADX INFO: renamed from: g */
    public final int m117424g() {
        return (this.f90078a.getChildCount() - this.f90078a.getHeaderViewsCount()) - this.f90078a.getFooterViewsCount();
    }
}
