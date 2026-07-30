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
import l.m6c0;
import l.uvm;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvm {

    /* JADX INFO: renamed from: a */
    public VText f20400a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f20401b;

    /* JADX INFO: renamed from: c */
    public Act f20402c;

    /* JADX INFO: renamed from: d */
    public dac0 f20403d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f20404e;

    public tvm(Act act, PurchaseType purchaseType) {
        this.f20402c = act;
        this.f20404e = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public final void m23186a(View view) {
        uvm.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m23187b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f20402c.inflater().inflate(m6c0.h, viewGroup, false);
        m23186a(viewInflate);
        this.f20400a.setText(this.f20402c.getString(R.string.F8));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m23189d(List<C0190d> list, f30<C0190d, Boolean> f30Var, e30<Integer> e30Var) {
        m23190e(list, f30Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m23190e(List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f20402c, 2);
        this.f20403d = new wvm(this.f20402c, list, f30Var);
        this.f20401b.setLayoutManager(gridLayoutManager);
        this.f20401b.setAdapter(this.f20403d);
    }

    /* JADX INFO: renamed from: c */
    public void m23188c() {
    }
}
