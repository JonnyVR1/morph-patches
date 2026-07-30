package p149l;

import android.widget.ListView;

/* JADX INFO: loaded from: classes3.dex */
public class cnr {

    /* JADX INFO: renamed from: a */
    public final ListView f81680a;

    /* JADX INFO: renamed from: b */
    public final e30<Integer> f81681b;

    /* JADX INFO: renamed from: c */
    public final int f81682c;

    /* JADX INFO: renamed from: d */
    public boolean f81683d = true;

    /* JADX INFO: renamed from: e */
    public boolean f81684e = false;

    public cnr(ListView listView, e30<Integer> e30Var, int i) {
        this.f81680a = listView;
        this.f81681b = e30Var;
        this.f81682c = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m107826b() {
        return this.f81680a.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: c */
    public final int m107827c() {
        return (this.f81680a.getCount() - this.f81680a.getHeaderViewsCount()) - this.f81680a.getFooterViewsCount();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m107828d() {
        this.f81683d = false;
        int iM107826b = m107826b();
        int iM107831g = m107831g();
        for (int iMax = Math.max(0, iM107826b - this.f81682c); iMax < iM107826b; iMax++) {
            this.f81681b.call(Integer.valueOf(iMax));
        }
        int i = iM107826b + iM107831g;
        for (int i2 = i + 1; i2 < Math.min(this.f81682c + i + 1, m107827c()); i2++) {
            this.f81681b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m107829e(int i) {
        if (this.f81683d) {
            if (this.f81684e) {
                return;
            }
            this.f81684e = true;
            this.f81680a.postDelayed(new Runnable() { // from class: l.bnr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76434a.m107828d();
                }
            }, 250L);
            return;
        }
        int iM107826b = m107826b();
        int iAbs = Math.abs((m107831g() + iM107826b) - i);
        int iAbs2 = Math.abs(iM107826b - i);
        int i2 = this.f81682c;
        if (iAbs < iAbs2) {
            if (i2 + i < m107827c()) {
                this.f81681b.call(Integer.valueOf(i + this.f81682c));
            }
        } else if (i - i2 >= 0) {
            this.f81681b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m107830f() {
        this.f81683d = true;
        this.f81684e = false;
    }

    /* JADX INFO: renamed from: g */
    public final int m107831g() {
        return (this.f81680a.getChildCount() - this.f81680a.getHeaderViewsCount()) - this.f81680a.getFooterViewsCount();
    }
}
