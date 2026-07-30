package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;

/* JADX INFO: renamed from: l.su */
/* JADX INFO: loaded from: classes9.dex */
public class C20029su extends eb2 {

    /* JADX INFO: renamed from: e */
    public boolean f166402e;

    /* JADX INFO: renamed from: f */
    public int f166403f;

    /* JADX INFO: renamed from: g */
    public nqh0 f166404g;

    /* JADX INFO: renamed from: h */
    public nqh0 f166405h;

    /* JADX INFO: renamed from: i */
    public Act f166406i;

    public C20029su(boolean z, int i, nqh0 nqh0Var, nqh0 nqh0Var2, Act act) {
        this.f166402e = z;
        this.f166403f = i;
        this.f166404g = nqh0Var;
        this.f166405h = nqh0Var2;
        this.f166406i = act;
    }

    @Override // p149l.w660
    public int getCount() {
        return (!this.f166402e || this.f166403f <= 0) ? 1 : 2;
    }

    @Override // p149l.w660
    public CharSequence getPageTitle(int i) {
        Act act = this.f166406i;
        int i2 = (i != 0 || this.f166403f <= 0) ? R$string.f16305x2 : R$string.f16300w2;
        return act.string(i2);
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView = ((i != 0 || this.f166403f <= 0) ? this.f166405h : this.f166404g).f140070e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
