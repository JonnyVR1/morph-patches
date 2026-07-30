package p003l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import l.e51;
import l.mcr;
import l.n11;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ejc0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f3287a;

    /* JADX INFO: renamed from: b */
    public final e30<Integer> f3288b;

    /* JADX INFO: renamed from: c */
    public final int f3289c;

    /* JADX INFO: renamed from: d */
    public mcr f3290d;

    /* JADX INFO: renamed from: e */
    public boolean f3291e = true;

    /* JADX INFO: renamed from: f */
    public boolean f3292f = false;

    public ejc0(mcr mcrVar, RecyclerView recyclerView, e30<Integer> e30Var, int i) {
        this.f3290d = mcrVar;
        this.f3287a = recyclerView;
        this.f3288b = e30Var;
        this.f3289c = i;
        n11.h(recyclerView.getLayoutManager() instanceof LinearLayoutManager);
    }

    /* JADX INFO: renamed from: c */
    public final int m3848c() {
        return this.f3287a.getLayoutManager().findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: d */
    public final int m3849d() {
        return this.f3287a.getAdapter().getItemCount();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m3850e() {
        this.f3291e = false;
        int iM3848c = m3848c();
        int iM3854i = m3854i();
        for (int iMax = Math.max(0, iM3848c - this.f3289c); iMax < iM3848c; iMax++) {
            this.f3288b.call(Integer.valueOf(iMax));
        }
        int i = iM3848c + iM3854i;
        for (int i2 = i + 1; i2 < Math.min(this.f3289c + i + 1, m3849d()); i2++) {
            this.f3288b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3851f() {
        this.f3291e = false;
        int iM3848c = m3848c();
        int iM3854i = m3854i();
        for (int iMax = Math.max(0, iM3848c - this.f3289c); iMax < iM3848c; iMax++) {
            this.f3288b.call(Integer.valueOf(iMax));
        }
        int i = iM3848c + iM3854i;
        for (int i2 = i + 1; i2 < Math.min(this.f3289c + i + 1, m3849d()); i2++) {
            this.f3288b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3852g(int i) {
        if (this.f3291e) {
            if (this.f3292f) {
                return;
            }
            this.f3292f = true;
            Act act = this.f3290d;
            if (act instanceof Act) {
                e51.H(act, new Runnable() { // from class: l.cjc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2695a.m3850e();
                    }
                }, 250L);
                return;
            } else {
                if (act instanceof Frag) {
                    e51.I((Frag) act, new Runnable() { // from class: l.djc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3009a.m3851f();
                        }
                    }, 250L);
                    return;
                }
                return;
            }
        }
        int iM3848c = m3848c();
        int iAbs = Math.abs((m3854i() + iM3848c) - i);
        int iAbs2 = Math.abs(iM3848c - i);
        int i2 = this.f3289c;
        if (iAbs < iAbs2) {
            if (i2 + i < m3849d()) {
                this.f3288b.call(Integer.valueOf(i + this.f3289c));
            }
        } else if (i - i2 >= 0) {
            this.f3288b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3853h() {
        this.f3291e = true;
        this.f3292f = false;
    }

    /* JADX INFO: renamed from: i */
    public final int m3854i() {
        return this.f3287a.getChildCount();
    }
}
