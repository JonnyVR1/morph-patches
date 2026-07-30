package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import l.nqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vkw extends eb2 {

    /* JADX INFO: renamed from: e */
    public boolean f8347e;

    /* JADX INFO: renamed from: f */
    public int f8348f;

    /* JADX INFO: renamed from: g */
    public nqh0 f8349g;

    /* JADX INFO: renamed from: h */
    public nqh0 f8350h;

    /* JADX INFO: renamed from: i */
    public Act f8351i;

    public vkw(boolean z, int i, nqh0 nqh0Var, nqh0 nqh0Var2, Act act) {
        this.f8347e = z;
        this.f8348f = i;
        this.f8349g = nqh0Var;
        this.f8350h = nqh0Var2;
        this.f8351i = act;
    }

    public int getCount() {
        return (!this.f8347e || this.f8348f <= 0) ? 1 : 2;
    }

    public CharSequence getPageTitle(int i) {
        Act act = this.f8351i;
        int i2 = (i != 0 || this.f8348f <= 0) ? R.string.Th : R.string.Sh;
        return act.string(i2);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView = ((i != 0 || this.f8348f <= 0) ? this.f8350h : this.f8349g).e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
