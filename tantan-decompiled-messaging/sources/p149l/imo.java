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
public class imo implements wol {

    /* JADX INFO: renamed from: a */
    public VText f113947a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f113948b;

    /* JADX INFO: renamed from: c */
    public Act f113949c;

    /* JADX INFO: renamed from: d */
    public dac0 f113950d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f113951e;

    public imo(Act act, PurchaseType purchaseType) {
        this.f113949c = act;
        this.f113951e = purchaseType;
    }

    /* JADX INFO: renamed from: d */
    private void m137080d(List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f113949c, 3);
        this.f113950d = rc5.m178786a(this.f113949c, list, f30Var);
        this.f113948b.setLayoutManager(gridLayoutManager);
        this.f113948b.setAdapter(this.f113950d);
    }

    @Override // p149l.wol
    /* JADX INFO: renamed from: a */
    public View mo137081a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f113949c.inflater().inflate(m6c0.f131625o, viewGroup, false);
        m137083c(viewInflate);
        this.f113947a.setText(this.f113949c.getString(R$string.f27154F8));
        return viewInflate;
    }

    @Override // p149l.wol
    /* JADX INFO: renamed from: b */
    public void mo137082b(List<C8765d> list, f30<C8765d, Boolean> f30Var, e30<Integer> e30Var) {
        m137080d(list, f30Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m137083c(View view) {
        jmo.m142217a(this, view);
    }

    @Override // p149l.wol
    public void release() {
    }
}
