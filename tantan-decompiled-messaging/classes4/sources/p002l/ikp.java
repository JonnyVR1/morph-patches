package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.m6c0;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ikp extends dac0<C0190d> {

    /* JADX INFO: renamed from: c */
    public C0190d f13286c;

    /* JADX INFO: renamed from: d */
    public final List<C0190d> f13287d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f13288e;

    /* JADX INFO: renamed from: f */
    public final f30<C0190d, Boolean> f13289f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f13290g;

    /* JADX INFO: renamed from: h */
    public boolean f13291h;

    public ikp(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var, PurchaseType purchaseType, boolean z) {
        m15233I(list);
        this.f13288e = act;
        this.f13289f = f30Var;
        this.f13290g = purchaseType;
        this.f13291h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m15227H(C0190d c0190d) {
        C0190d.a aVarM4088d = c0190d.m4088d() != null ? c0190d.m4088d() : c0190d.m4086b();
        o6j0.c("e_select_upgrade_duration_sku", "p_select_upgrade_duration_pop", new o6j0.a[]{o6j0.a.h("upgrade_sku_duration", aVarM4088d.m4171w() + aVarM4088d.m4172x()), o6j0.a.h("upgrade_sku_amount", aVarM4088d.m4147g())});
        if (NullChecker.a(this.f13286c)) {
            this.f13286c.m4106v(false);
        }
        this.f13286c = c0190d;
        c0190d.m4106v(true);
        notifyDataSetChanged();
        if (NullChecker.a(this.f13286c)) {
            this.f13289f.call(this.f13286c, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m15229C() {
        return this.f13287d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15230D(ViewGroup viewGroup, int i) {
        return this.f13288e.inflater().inflate(m6c0.i0, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m15228A(View view, C0190d c0190d, int i, int i2) {
        if (c0190d.m4096l()) {
            this.f13286c = c0190d;
        }
        ((IntlUpgradePurchaseSheetItemView) view).m4282c(c0190d, i2, new e30() { // from class: l.hkp
            public final void call(Object obj) {
                this.f12096a.m15227H((C0190d) obj);
            }
        }, this.f13290g, this.f13291h);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C0190d getItem(int i) {
        return this.f13287d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m15233I(List<C0190d> list) {
        this.f13287d.clear();
        this.f13287d.addAll(list);
        for (C0190d c0190d : this.f13287d) {
            if (c0190d.m4096l()) {
                this.f13286c = c0190d;
            }
        }
        notifyDataSetChanged();
    }
}
