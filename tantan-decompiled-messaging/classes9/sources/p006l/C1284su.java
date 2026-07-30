package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.R$string;
import com.p1.mobile.android.app.Act;
import l.eb2;
import l.nqh0;

/* JADX INFO: renamed from: l.su */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1284su extends eb2 {

    /* JADX INFO: renamed from: e */
    public boolean f21653e;

    /* JADX INFO: renamed from: f */
    public int f21654f;

    /* JADX INFO: renamed from: g */
    public nqh0 f21655g;

    /* JADX INFO: renamed from: h */
    public nqh0 f21656h;

    /* JADX INFO: renamed from: i */
    public Act f21657i;

    public C1284su(boolean z, int i, nqh0 nqh0Var, nqh0 nqh0Var2, Act act) {
        this.f21653e = z;
        this.f21654f = i;
        this.f21655g = nqh0Var;
        this.f21656h = nqh0Var2;
        this.f21657i = act;
    }

    public int getCount() {
        return (!this.f21653e || this.f21654f <= 0) ? 1 : 2;
    }

    public CharSequence getPageTitle(int i) {
        Act act = this.f21657i;
        int i2 = (i != 0 || this.f21654f <= 0) ? R$string.f294x2 : R$string.f289w2;
        return act.string(i2);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m24197o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m24198p(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView = ((i != 0 || this.f21654f <= 0) ? this.f21656h : this.f21655g).e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
