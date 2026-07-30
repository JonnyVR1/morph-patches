package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class imp extends jic0<C8928d> {

    /* JADX INFO: renamed from: c */
    public C8928d f115816c;

    /* JADX INFO: renamed from: d */
    public final List<C8928d> f115817d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f115818e;

    /* JADX INFO: renamed from: f */
    public final z20<C8928d, Boolean> f115819f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f115820g;

    /* JADX INFO: renamed from: h */
    public boolean f115821h;

    public imp(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var, PurchaseType purchaseType, boolean z) {
        m140985I(list);
        this.f115818e = act;
        this.f115819f = z20Var;
        this.f115820g = purchaseType;
        this.f115821h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m140982H(C8928d c8928d) {
        C8928d.a aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        sfj0.m185596c("e_select_upgrade_duration_sku", "p_select_upgrade_duration_pop", sfj0.C20032a.m185615h("upgrade_sku_duration", aVarM54705d.m54788w() + aVarM54705d.m54789x()), sfj0.C20032a.m185615h("upgrade_sku_amount", aVarM54705d.m54764g()));
        if (NullChecker.m82486a(this.f115816c)) {
            this.f115816c.m54723v(false);
        }
        this.f115816c = c8928d;
        c8928d.m54723v(true);
        notifyDataSetChanged();
        if (NullChecker.m82486a(this.f115816c)) {
            this.f115819f.call(this.f115816c, Boolean.TRUE);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f115817d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f115818e.inflater().inflate(rec0.f162562i0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, C8928d c8928d, int i, int i2) {
        if (c8928d.m54713l()) {
            this.f115816c = c8928d;
        }
        ((IntlUpgradePurchaseSheetItemView) view).m54899c(c8928d, i2, new y20() { // from class: l.hmp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110650a.m140982H((C8928d) obj);
            }
        }, this.f115820g, this.f115821h);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8928d getItem(int i) {
        return this.f115817d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m140985I(List<C8928d> list) {
        this.f115817d.clear();
        this.f115817d.addAll(list);
        for (C8928d c8928d : this.f115817d) {
            if (c8928d.m54713l()) {
                this.f115816c = c8928d;
            }
        }
        notifyDataSetChanged();
    }
}
