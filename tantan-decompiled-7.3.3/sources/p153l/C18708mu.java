package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;

/* JADX INFO: renamed from: l.mu */
/* JADX INFO: loaded from: classes9.dex */
public class C18708mu extends lb2 {

    /* JADX INFO: renamed from: e */
    public boolean f138702e;

    /* JADX INFO: renamed from: f */
    public int f138703f;

    /* JADX INFO: renamed from: g */
    public uyh0 f138704g;

    /* JADX INFO: renamed from: h */
    public uyh0 f138705h;

    /* JADX INFO: renamed from: i */
    public Act f138706i;

    public C18708mu(boolean z, int i, uyh0 uyh0Var, uyh0 uyh0Var2, Act act) {
        this.f138702e = z;
        this.f138703f = i;
        this.f138704g = uyh0Var;
        this.f138705h = uyh0Var2;
        this.f138706i = act;
    }

    @Override // p153l.cf60
    public int getCount() {
        return (!this.f138702e || this.f138703f <= 0) ? 1 : 2;
    }

    @Override // p153l.cf60
    public CharSequence getPageTitle(int i) {
        Act act = this.f138706i;
        int i2 = (i != 0 || this.f138703f <= 0) ? R$string.f17024x2 : R$string.f17019w2;
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
        RecyclerView recyclerView = ((i != 0 || this.f138703f <= 0) ? this.f138705h : this.f138704g).f181621e;
        viewGroup.addView(recyclerView);
        return recyclerView;
    }
}
