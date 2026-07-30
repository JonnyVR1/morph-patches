package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes3.dex */
public class unw extends lb2 {

    /* JADX INFO: renamed from: e */
    public boolean f179991e;

    /* JADX INFO: renamed from: f */
    public int f179992f;

    /* JADX INFO: renamed from: g */
    public uyh0 f179993g;

    /* JADX INFO: renamed from: h */
    public uyh0 f179994h;

    /* JADX INFO: renamed from: i */
    public Act f179995i;

    public unw(boolean z, int i, uyh0 uyh0Var, uyh0 uyh0Var2, Act act) {
        this.f179991e = z;
        this.f179992f = i;
        this.f179993g = uyh0Var;
        this.f179994h = uyh0Var2;
        this.f179995i = act;
    }

    @Override // p153l.cf60
    public int getCount() {
        return (!this.f179991e || this.f179992f <= 0) ? 1 : 2;
    }

    @Override // p153l.cf60
    public CharSequence getPageTitle(int i) {
        Act act = this.f179995i;
        int i2 = (i != 0 || this.f179992f <= 0) ? R$string.f19526oi : R$string.f19495ni;
        return act.string(i2);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView = ((i != 0 || this.f179992f <= 0) ? this.f179994h : this.f179993g).f181621e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
