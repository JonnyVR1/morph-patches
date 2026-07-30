package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.IntlCoinPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y5n extends dac0<C8765d> {

    /* JADX INFO: renamed from: c */
    public C8765d f196461c;

    /* JADX INFO: renamed from: e */
    public final Act f196463e;

    /* JADX INFO: renamed from: f */
    public final f30<C8765d, Boolean> f196464f;

    /* JADX INFO: renamed from: d */
    public final List<C8765d> f196462d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f196465g = -1;

    public y5n(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        m213008I(list);
        this.f196463e = act;
        this.f196464f = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m213005H(C8765d c8765d) {
        if (NullChecker.m81303a(this.f196461c)) {
            this.f196461c.m53540v(false);
        }
        this.f196461c = c8765d;
        c8765d.m53540v(true);
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f196462d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f196463e.inflater().inflate(m6c0.f131633q, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, C8765d c8765d, int i, int i2) {
        if (c8765d.m53530l()) {
            this.f196461c = c8765d;
            if (this.f196465g == -1) {
                this.f196465g = i2;
            }
        }
        ((IntlCoinPurchaseSheetItemView) view).m53103c(c8765d, i2, new e30() { // from class: l.x5n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191174a.m213005H((C8765d) obj);
            }
        }, this.f196465g);
        if (NullChecker.m81303a(this.f196461c)) {
            this.f196464f.call(this.f196461c, Boolean.TRUE);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8765d getItem(int i) {
        return this.f196462d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m213008I(List<C8765d> list) {
        this.f196462d.clear();
        this.f196462d.addAll(list);
        notifyDataSetChanged();
    }
}
