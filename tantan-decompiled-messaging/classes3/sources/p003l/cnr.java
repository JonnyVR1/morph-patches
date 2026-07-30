package p003l;

import android.widget.ListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cnr {

    /* JADX INFO: renamed from: a */
    public final ListView f2731a;

    /* JADX INFO: renamed from: b */
    public final e30<Integer> f2732b;

    /* JADX INFO: renamed from: c */
    public final int f2733c;

    /* JADX INFO: renamed from: d */
    public boolean f2734d = true;

    /* JADX INFO: renamed from: e */
    public boolean f2735e = false;

    public cnr(ListView listView, e30<Integer> e30Var, int i) {
        this.f2731a = listView;
        this.f2732b = e30Var;
        this.f2733c = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m3408b() {
        return this.f2731a.getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: c */
    public final int m3409c() {
        return (this.f2731a.getCount() - this.f2731a.getHeaderViewsCount()) - this.f2731a.getFooterViewsCount();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m3410d() {
        this.f2734d = false;
        int iM3408b = m3408b();
        int iM3413g = m3413g();
        for (int iMax = Math.max(0, iM3408b - this.f2733c); iMax < iM3408b; iMax++) {
            this.f2732b.call(Integer.valueOf(iMax));
        }
        int i = iM3408b + iM3413g;
        for (int i2 = i + 1; i2 < Math.min(this.f2733c + i + 1, m3409c()); i2++) {
            this.f2732b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3411e(int i) {
        if (this.f2734d) {
            if (this.f2735e) {
                return;
            }
            this.f2735e = true;
            this.f2731a.postDelayed(new Runnable() { // from class: l.bnr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2409a.m3410d();
                }
            }, 250L);
            return;
        }
        int iM3408b = m3408b();
        int iAbs = Math.abs((m3413g() + iM3408b) - i);
        int iAbs2 = Math.abs(iM3408b - i);
        int i2 = this.f2733c;
        if (iAbs < iAbs2) {
            if (i2 + i < m3409c()) {
                this.f2732b.call(Integer.valueOf(i + this.f2733c));
            }
        } else if (i - i2 >= 0) {
            this.f2732b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3412f() {
        this.f2734d = true;
        this.f2735e = false;
    }

    /* JADX INFO: renamed from: g */
    public final int m3413g() {
        return (this.f2731a.getChildCount() - this.f2731a.getHeaderViewsCount()) - this.f2731a.getFooterViewsCount();
    }
}
