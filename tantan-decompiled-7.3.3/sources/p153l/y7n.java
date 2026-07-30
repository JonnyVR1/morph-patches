package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.IntlCoinPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y7n extends jic0<C8928d> {

    /* JADX INFO: renamed from: c */
    public C8928d f197793c;

    /* JADX INFO: renamed from: e */
    public final Act f197795e;

    /* JADX INFO: renamed from: f */
    public final z20<C8928d, Boolean> f197796f;

    /* JADX INFO: renamed from: d */
    public final List<C8928d> f197794d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f197797g = -1;

    public y7n(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        m214562I(list);
        this.f197795e = act;
        this.f197796f = z20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m214559H(C8928d c8928d) {
        if (NullChecker.m82486a(this.f197793c)) {
            this.f197793c.m54723v(false);
        }
        this.f197793c = c8928d;
        c8928d.m54723v(true);
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f197794d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f197795e.inflater().inflate(rec0.f162593q, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, C8928d c8928d, int i, int i2) {
        if (c8928d.m54713l()) {
            this.f197793c = c8928d;
            if (this.f197797g == -1) {
                this.f197797g = i2;
            }
        }
        ((IntlCoinPurchaseSheetItemView) view).m54286c(c8928d, i2, new y20() { // from class: l.x7n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192735a.m214559H((C8928d) obj);
            }
        }, this.f197797g);
        if (NullChecker.m82486a(this.f197793c)) {
            this.f197796f.call(this.f197793c, Boolean.TRUE);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8928d getItem(int i) {
        return this.f197794d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m214562I(List<C8928d> list) {
        this.f197794d.clear();
        this.f197794d.addAll(list);
        notifyDataSetChanged();
    }
}
