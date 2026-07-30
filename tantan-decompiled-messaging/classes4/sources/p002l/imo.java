package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.jmo;
import l.m6c0;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class imo implements wol {

    /* JADX INFO: renamed from: a */
    public VText f13309a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f13310b;

    /* JADX INFO: renamed from: c */
    public Act f13311c;

    /* JADX INFO: renamed from: d */
    public dac0 f13312d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f13313e;

    public imo(Act act, PurchaseType purchaseType) {
        this.f13311c = act;
        this.f13313e = purchaseType;
    }

    /* JADX INFO: renamed from: d */
    private void m15239d(List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f13311c, 3);
        this.f13312d = rc5.m21898a(this.f13311c, list, f30Var);
        this.f13310b.setLayoutManager(gridLayoutManager);
        this.f13310b.setAdapter(this.f13312d);
    }

    @Override // p002l.wol
    /* JADX INFO: renamed from: a */
    public View mo15240a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f13311c.inflater().inflate(m6c0.o, viewGroup, false);
        m15242c(viewInflate);
        this.f13309a.setText(this.f13311c.getString(R.string.F8));
        return viewInflate;
    }

    @Override // p002l.wol
    /* JADX INFO: renamed from: b */
    public void mo15241b(List<C0190d> list, f30<C0190d, Boolean> f30Var, e30<Integer> e30Var) {
        m15239d(list, f30Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m15242c(View view) {
        jmo.a(this, view);
    }

    @Override // p002l.wol
    public void release() {
    }
}
