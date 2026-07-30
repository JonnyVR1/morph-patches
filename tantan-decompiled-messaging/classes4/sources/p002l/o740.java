package p002l;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import l.e30;
import l.f30;
import l.fy80;
import l.g30;
import l.vwb;
import l.wx80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o740 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f16402a;

    /* JADX INFO: renamed from: b */
    public Privilege f16403b;

    /* JADX INFO: renamed from: c */
    public boolean f16404c = false;

    /* JADX INFO: renamed from: d */
    public List<wx80> f16405d;

    /* JADX INFO: renamed from: e */
    public String f16406e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f16407f;

    /* JADX INFO: renamed from: g */
    public PurchaseView f16408g;

    /* JADX INFO: renamed from: h */
    public g30<PurchaseType, Act, String> f16409h;

    /* JADX INFO: renamed from: i */
    public e30<PurchaseType> f16410i;

    /* JADX INFO: renamed from: j */
    public f30<PurchaseType, View> f16411j;

    /* JADX INFO: renamed from: k */
    public e30<Boolean> f16412k;

    public o740(PurchaseView purchaseView) {
        this.f16408g = purchaseView;
    }

    /* JADX INFO: renamed from: a */
    public void m19259a(boolean z) {
        if (vwb.J(this.f16405d)) {
            this.f16405d = fy80.n(this.f16402a, this.f16403b, this.f16404c);
        }
        this.f16408g.setPrivilegeDescriptions(this.f16405d);
        this.f16408g.setFrom(this.f16406e);
        this.f16408g.setDialogStateAction(this.f16407f);
        this.f16408g.setDialogStateAction(this.f16407f);
        this.f16408g.setPurchaseType(this.f16402a);
        this.f16408g.setFirstPrivilege(this.f16403b);
        this.f16408g.setOnPaymentSuccess(this.f16409h);
        this.f16408g.setOnCloseClick(this.f16410i);
        this.f16408g.setAgreementViewAction(this.f16411j);
        this.f16408g.setAgreementCheckedCallback(this.f16412k);
        this.f16408g.m3750a0(z);
    }

    /* JADX INFO: renamed from: b */
    public o740 m19260b(e30<Boolean> e30Var) {
        this.f16412k = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public o740 m19261c(f30<PurchaseType, View> f30Var) {
        this.f16411j = f30Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public o740 m19262d(e30<Integer> e30Var) {
        this.f16407f = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public o740 m19263e(String str) {
        this.f16406e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public o740 m19264f(e30<PurchaseType> e30Var) {
        this.f16410i = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public o740 m19265g(g30<PurchaseType, Act, String> g30Var) {
        this.f16409h = g30Var;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public o740 m19266h(List<wx80> list) {
        this.f16405d = list;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public o740 m19267i(PurchaseType purchaseType, Privilege privilege) {
        return m19268j(purchaseType, privilege, false);
    }

    /* JADX INFO: renamed from: j */
    public o740 m19268j(PurchaseType purchaseType, Privilege privilege, boolean z) {
        this.f16402a = purchaseType;
        this.f16403b = privilege;
        this.f16404c = z;
        return this;
    }
}
