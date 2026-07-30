package p149l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;

/* JADX INFO: loaded from: classes3.dex */
public class ejc0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f91683a;

    /* JADX INFO: renamed from: b */
    public final e30<Integer> f91684b;

    /* JADX INFO: renamed from: c */
    public final int f91685c;

    /* JADX INFO: renamed from: d */
    public mcr f91686d;

    /* JADX INFO: renamed from: e */
    public boolean f91687e = true;

    /* JADX INFO: renamed from: f */
    public boolean f91688f = false;

    public ejc0(mcr mcrVar, RecyclerView recyclerView, e30<Integer> e30Var, int i) {
        this.f91686d = mcrVar;
        this.f91683a = recyclerView;
        this.f91684b = e30Var;
        this.f91685c = i;
        n11.m157335h(recyclerView.getLayoutManager() instanceof LinearLayoutManager);
    }

    /* JADX INFO: renamed from: c */
    public final int m116777c() {
        return ((LinearLayoutManager) this.f91683a.getLayoutManager()).findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: d */
    public final int m116778d() {
        return this.f91683a.getAdapter().getItemCount();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m116779e() {
        this.f91687e = false;
        int iM116777c = m116777c();
        int iM116783i = m116783i();
        for (int iMax = Math.max(0, iM116777c - this.f91685c); iMax < iM116777c; iMax++) {
            this.f91684b.call(Integer.valueOf(iMax));
        }
        int i = iM116777c + iM116783i;
        for (int i2 = i + 1; i2 < Math.min(this.f91685c + i + 1, m116778d()); i2++) {
            this.f91684b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m116780f() {
        this.f91687e = false;
        int iM116777c = m116777c();
        int iM116783i = m116783i();
        for (int iMax = Math.max(0, iM116777c - this.f91685c); iMax < iM116777c; iMax++) {
            this.f91684b.call(Integer.valueOf(iMax));
        }
        int i = iM116777c + iM116783i;
        for (int i2 = i + 1; i2 < Math.min(this.f91685c + i + 1, m116778d()); i2++) {
            this.f91684b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m116781g(int i) {
        if (this.f91687e) {
            if (this.f91688f) {
                return;
            }
            this.f91688f = true;
            mcr mcrVar = this.f91686d;
            if (mcrVar instanceof Act) {
                e51.m114743H((Act) mcrVar, new Runnable() { // from class: l.cjc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81160a.m116779e();
                    }
                }, 250L);
                return;
            } else {
                if (mcrVar instanceof Frag) {
                    e51.m114744I((Frag) mcrVar, new Runnable() { // from class: l.djc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f86516a.m116780f();
                        }
                    }, 250L);
                    return;
                }
                return;
            }
        }
        int iM116777c = m116777c();
        int iAbs = Math.abs((m116783i() + iM116777c) - i);
        int iAbs2 = Math.abs(iM116777c - i);
        int i2 = this.f91685c;
        if (iAbs < iAbs2) {
            if (i2 + i < m116778d()) {
                this.f91684b.call(Integer.valueOf(i + this.f91685c));
            }
        } else if (i - i2 >= 0) {
            this.f91684b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m116782h() {
        this.f91687e = true;
        this.f91688f = false;
    }

    /* JADX INFO: renamed from: i */
    public final int m116783i() {
        return this.f91683a.getChildCount();
    }
}
