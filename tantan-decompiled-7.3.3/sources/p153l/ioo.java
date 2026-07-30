package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ioo implements hrl {

    /* JADX INFO: renamed from: a */
    public VText f116185a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f116186b;

    /* JADX INFO: renamed from: c */
    public Act f116187c;

    /* JADX INFO: renamed from: d */
    public jic0 f116188d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f116189e;

    public ioo(Act act, PurchaseType purchaseType) {
        this.f116187c = act;
        this.f116189e = purchaseType;
    }

    /* JADX INFO: renamed from: d */
    private void m141348d(List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f116187c, 3);
        this.f116188d = rd5.m180838a(this.f116187c, list, z20Var);
        this.f116186b.setLayoutManager(gridLayoutManager);
        this.f116186b.setAdapter(this.f116188d);
    }

    @Override // p153l.hrl
    /* JADX INFO: renamed from: a */
    public View mo136895a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f116187c.inflater().inflate(rec0.f162585o, viewGroup, false);
        m141349c(viewInflate);
        this.f116185a.setText(this.f116187c.getString(R$string.f28002F8));
        return viewInflate;
    }

    @Override // p153l.hrl
    /* JADX INFO: renamed from: b */
    public void mo136896b(List<C8928d> list, z20<C8928d, Boolean> z20Var, y20<Integer> y20Var) {
        m141348d(list, z20Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m141349c(View view) {
        joo.m146476a(this, view);
    }

    @Override // p153l.hrl
    public void release() {
    }
}
