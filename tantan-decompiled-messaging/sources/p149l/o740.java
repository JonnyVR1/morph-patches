package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o740 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f142456a;

    /* JADX INFO: renamed from: b */
    public Privilege f142457b;

    /* JADX INFO: renamed from: c */
    public boolean f142458c = false;

    /* JADX INFO: renamed from: d */
    public List<wx80> f142459d;

    /* JADX INFO: renamed from: e */
    public String f142460e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f142461f;

    /* JADX INFO: renamed from: g */
    public PurchaseView f142462g;

    /* JADX INFO: renamed from: h */
    public g30<PurchaseType, Act, String> f142463h;

    /* JADX INFO: renamed from: i */
    public e30<PurchaseType> f142464i;

    /* JADX INFO: renamed from: j */
    public f30<PurchaseType, View> f142465j;

    /* JADX INFO: renamed from: k */
    public e30<Boolean> f142466k;

    public o740(PurchaseView purchaseView) {
        this.f142462g = purchaseView;
    }

    /* JADX INFO: renamed from: a */
    public void m162963a(boolean z) {
        if (vwb.m200296J(this.f142459d)) {
            this.f142459d = fy80.m123718n(this.f142456a, this.f142457b, this.f142458c);
        }
        this.f142462g.setPrivilegeDescriptions(this.f142459d);
        this.f142462g.setFrom(this.f142460e);
        this.f142462g.setDialogStateAction(this.f142461f);
        this.f142462g.setDialogStateAction(this.f142461f);
        this.f142462g.setPurchaseType(this.f142456a);
        this.f142462g.setFirstPrivilege(this.f142457b);
        this.f142462g.setOnPaymentSuccess(this.f142463h);
        this.f142462g.setOnCloseClick(this.f142464i);
        this.f142462g.setAgreementViewAction(this.f142465j);
        this.f142462g.setAgreementCheckedCallback(this.f142466k);
        this.f142462g.m53184a0(z);
    }

    /* JADX INFO: renamed from: b */
    public o740 m162964b(e30<Boolean> e30Var) {
        this.f142466k = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public o740 m162965c(f30<PurchaseType, View> f30Var) {
        this.f142465j = f30Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public o740 m162966d(e30<Integer> e30Var) {
        this.f142461f = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public o740 m162967e(String str) {
        this.f142460e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public o740 m162968f(e30<PurchaseType> e30Var) {
        this.f142464i = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public o740 m162969g(g30<PurchaseType, Act, String> g30Var) {
        this.f142463h = g30Var;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public o740 m162970h(List<wx80> list) {
        this.f142459d = list;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public o740 m162971i(PurchaseType purchaseType, Privilege privilege) {
        return m162972j(purchaseType, privilege, false);
    }

    /* JADX INFO: renamed from: j */
    public o740 m162972j(PurchaseType purchaseType, Privilege privilege, boolean z) {
        this.f142456a = purchaseType;
        this.f142457b = privilege;
        this.f142458c = z;
        return this;
    }
}
