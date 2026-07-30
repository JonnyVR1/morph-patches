package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlUpgrade.IntlUpgradePurchaseSheetItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ikp extends dac0<C8765d> {

    /* JADX INFO: renamed from: c */
    public C8765d f113711c;

    /* JADX INFO: renamed from: d */
    public final List<C8765d> f113712d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Act f113713e;

    /* JADX INFO: renamed from: f */
    public final f30<C8765d, Boolean> f113714f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f113715g;

    /* JADX INFO: renamed from: h */
    public boolean f113716h;

    public ikp(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var, PurchaseType purchaseType, boolean z) {
        m136877I(list);
        this.f113713e = act;
        this.f113714f = f30Var;
        this.f113715g = purchaseType;
        this.f113716h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m136874H(C8765d c8765d) {
        C8765d.a aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        o6j0.m162859c("e_select_upgrade_duration_sku", "p_select_upgrade_duration_pop", o6j0.C18854a.m162878h("upgrade_sku_duration", aVarM53522d.m53605w() + aVarM53522d.m53606x()), o6j0.C18854a.m162878h("upgrade_sku_amount", aVarM53522d.m53581g()));
        if (NullChecker.m81303a(this.f113711c)) {
            this.f113711c.m53540v(false);
        }
        this.f113711c = c8765d;
        c8765d.m53540v(true);
        notifyDataSetChanged();
        if (NullChecker.m81303a(this.f113711c)) {
            this.f113714f.call(this.f113711c, Boolean.TRUE);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f113712d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f113713e.inflater().inflate(m6c0.f131602i0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, C8765d c8765d, int i, int i2) {
        if (c8765d.m53530l()) {
            this.f113711c = c8765d;
        }
        ((IntlUpgradePurchaseSheetItemView) view).m53716c(c8765d, i2, new e30() { // from class: l.hkp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108259a.m136874H((C8765d) obj);
            }
        }, this.f113715g, this.f113716h);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C8765d getItem(int i) {
        return this.f113712d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m136877I(List<C8765d> list) {
        this.f113712d.clear();
        this.f113712d.addAll(list);
        for (C8765d c8765d : this.f113712d) {
            if (c8765d.m53530l()) {
                this.f113711c = c8765d;
            }
        }
        notifyDataSetChanged();
    }
}
