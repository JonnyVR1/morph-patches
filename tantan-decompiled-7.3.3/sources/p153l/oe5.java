package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.CoinPurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class oe5 extends AbstractC15610a<C8928d> {

    /* JADX INFO: renamed from: c */
    public C8928d f146966c;

    /* JADX INFO: renamed from: d */
    public final List<C8928d> f146967d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f146968e;

    /* JADX INFO: renamed from: f */
    public final z20<C8928d, Boolean> f146969f;

    /* JADX INFO: renamed from: g */
    public final int f146970g;

    public oe5(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var, int i) {
        this.f146968e = act;
        this.f146970g = i;
        m167354y(list);
        this.f146969f = z20Var;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f146968e).inflate(rec0.f162550f3, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<C8928d> mo21403p() {
        return this.f146967d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, C8928d c8928d, int i, int i2) {
        if (c8928d.m54713l()) {
            this.f146966c = c8928d;
        }
        ((CoinPurchaseSheetItemView) view).m54282d(c8928d, i2, new y20() { // from class: l.ne5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141573a.m167353w((C8928d) obj);
            }
        });
        if (NullChecker.m82486a(this.f146966c)) {
            this.f146969f.call(this.f146966c, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m167353w(C8928d c8928d) {
        if (NullChecker.m82486a(this.f146966c)) {
            this.f146966c.m54723v(false);
        }
        this.f146966c = c8928d;
        c8928d.m54723v(true);
        this.f146969f.call(this.f146966c, Boolean.FALSE);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public void m167354y(List<C8928d> list) {
        this.f146967d.clear();
        this.f146967d.addAll(list);
        notifyDataSetChanged();
    }
}
