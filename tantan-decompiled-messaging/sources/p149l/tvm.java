package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tvm {

    /* JADX INFO: renamed from: a */
    public VText f172321a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f172322b;

    /* JADX INFO: renamed from: c */
    public Act f172323c;

    /* JADX INFO: renamed from: d */
    public dac0 f172324d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f172325e;

    public tvm(Act act, PurchaseType purchaseType) {
        this.f172323c = act;
        this.f172325e = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public final void m190755a(View view) {
        uvm.m196084a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m190756b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f172323c.inflater().inflate(m6c0.f131596h, viewGroup, false);
        m190755a(viewInflate);
        this.f172321a.setText(this.f172323c.getString(R$string.f27154F8));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m190758d(List<C8765d> list, f30<C8765d, Boolean> f30Var, e30<Integer> e30Var) {
        m190759e(list, f30Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m190759e(List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f172323c, 2);
        this.f172324d = new wvm(this.f172323c, list, f30Var);
        this.f172322b.setLayoutManager(gridLayoutManager);
        this.f172322b.setAdapter(this.f172324d);
    }

    /* JADX INFO: renamed from: c */
    public void m190757c() {
    }
}
