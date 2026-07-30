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
public class uxm {

    /* JADX INFO: renamed from: a */
    public VText f181478a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f181479b;

    /* JADX INFO: renamed from: c */
    public Act f181480c;

    /* JADX INFO: renamed from: d */
    public jic0 f181481d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f181482e;

    public uxm(Act act, PurchaseType purchaseType) {
        this.f181480c = act;
        this.f181482e = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public final void m198503a(View view) {
        vxm.m203864a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public View m198504b(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f181480c.inflater().inflate(rec0.f162556h, viewGroup, false);
        m198503a(viewInflate);
        this.f181478a.setText(this.f181480c.getString(R$string.f28002F8));
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m198506d(List<C8928d> list, z20<C8928d, Boolean> z20Var, y20<Integer> y20Var) {
        m198507e(list, z20Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m198507e(List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f181480c, 2);
        this.f181481d = new xxm(this.f181480c, list, z20Var);
        this.f181479b.setLayoutManager(gridLayoutManager);
        this.f181479b.setAdapter(this.f181481d);
    }

    /* JADX INFO: renamed from: c */
    public void m198505c() {
    }
}
