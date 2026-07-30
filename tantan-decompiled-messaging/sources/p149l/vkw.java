package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes3.dex */
public class vkw extends eb2 {

    /* JADX INFO: renamed from: e */
    public boolean f181849e;

    /* JADX INFO: renamed from: f */
    public int f181850f;

    /* JADX INFO: renamed from: g */
    public nqh0 f181851g;

    /* JADX INFO: renamed from: h */
    public nqh0 f181852h;

    /* JADX INFO: renamed from: i */
    public Act f181853i;

    public vkw(boolean z, int i, nqh0 nqh0Var, nqh0 nqh0Var2, Act act) {
        this.f181849e = z;
        this.f181850f = i;
        this.f181851g = nqh0Var;
        this.f181852h = nqh0Var2;
        this.f181853i = act;
    }

    @Override // p149l.w660
    public int getCount() {
        return (!this.f181849e || this.f181850f <= 0) ? 1 : 2;
    }

    @Override // p149l.w660
    public CharSequence getPageTitle(int i) {
        Act act = this.f181853i;
        int i2 = (i != 0 || this.f181850f <= 0) ? R$string.f18154Th : R$string.f18124Sh;
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
        RecyclerView recyclerView = ((i != 0 || this.f181850f <= 0) ? this.f181852h : this.f181851g).f140070e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
