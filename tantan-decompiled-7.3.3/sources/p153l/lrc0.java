package p153l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;

/* JADX INFO: loaded from: classes3.dex */
public class lrc0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f133313a;

    /* JADX INFO: renamed from: b */
    public final y20<Integer> f133314b;

    /* JADX INFO: renamed from: c */
    public final int f133315c;

    /* JADX INFO: renamed from: d */
    public ner f133316d;

    /* JADX INFO: renamed from: e */
    public boolean f133317e = true;

    /* JADX INFO: renamed from: f */
    public boolean f133318f = false;

    public lrc0(ner nerVar, RecyclerView recyclerView, y20<Integer> y20Var, int i) {
        this.f133316d = nerVar;
        this.f133313a = recyclerView;
        this.f133314b = y20Var;
        this.f133315c = i;
        u11.m193894h(recyclerView.getLayoutManager() instanceof LinearLayoutManager);
    }

    /* JADX INFO: renamed from: c */
    public final int m155606c() {
        return ((LinearLayoutManager) this.f133313a.getLayoutManager()).findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: d */
    public final int m155607d() {
        return this.f133313a.getAdapter().getItemCount();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m155608e() {
        this.f133317e = false;
        int iM155606c = m155606c();
        int iM155612i = m155612i();
        for (int iMax = Math.max(0, iM155606c - this.f133315c); iMax < iM155606c; iMax++) {
            this.f133314b.call(Integer.valueOf(iMax));
        }
        int i = iM155606c + iM155612i;
        for (int i2 = i + 1; i2 < Math.min(this.f133315c + i + 1, m155607d()); i2++) {
            this.f133314b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m155609f() {
        this.f133317e = false;
        int iM155606c = m155606c();
        int iM155612i = m155612i();
        for (int iMax = Math.max(0, iM155606c - this.f133315c); iMax < iM155606c; iMax++) {
            this.f133314b.call(Integer.valueOf(iMax));
        }
        int i = iM155606c + iM155612i;
        for (int i2 = i + 1; i2 < Math.min(this.f133315c + i + 1, m155607d()); i2++) {
            this.f133314b.call(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m155610g(int i) {
        if (this.f133317e) {
            if (this.f133318f) {
                return;
            }
            this.f133318f = true;
            ner nerVar = this.f133316d;
            if (nerVar instanceof Act) {
                l51.m152888H((Act) nerVar, new Runnable() { // from class: l.jrc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f122323a.m155608e();
                    }
                }, 250L);
                return;
            } else {
                if (nerVar instanceof Frag) {
                    l51.m152889I((Frag) nerVar, new Runnable() { // from class: l.krc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f128435a.m155609f();
                        }
                    }, 250L);
                    return;
                }
                return;
            }
        }
        int iM155606c = m155606c();
        int iAbs = Math.abs((m155612i() + iM155606c) - i);
        int iAbs2 = Math.abs(iM155606c - i);
        int i2 = this.f133315c;
        if (iAbs < iAbs2) {
            if (i2 + i < m155607d()) {
                this.f133314b.call(Integer.valueOf(i + this.f133315c));
            }
        } else if (i - i2 >= 0) {
            this.f133314b.call(Integer.valueOf(i - i2));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m155611h() {
        this.f133317e = true;
        this.f133318f = false;
    }

    /* JADX INFO: renamed from: i */
    public final int m155612i() {
        return this.f133313a.getChildCount();
    }
}
