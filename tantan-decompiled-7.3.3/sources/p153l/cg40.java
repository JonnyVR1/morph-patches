package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cg40 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f81620a;

    /* JADX INFO: renamed from: b */
    public Privilege f81621b;

    /* JADX INFO: renamed from: c */
    public boolean f81622c = false;

    /* JADX INFO: renamed from: d */
    public List<a690> f81623d;

    /* JADX INFO: renamed from: e */
    public String f81624e;

    /* JADX INFO: renamed from: f */
    public y20<Integer> f81625f;

    /* JADX INFO: renamed from: g */
    public PurchaseView f81626g;

    /* JADX INFO: renamed from: h */
    public a30<PurchaseType, Act, String> f81627h;

    /* JADX INFO: renamed from: i */
    public y20<PurchaseType> f81628i;

    /* JADX INFO: renamed from: j */
    public z20<PurchaseType, View> f81629j;

    /* JADX INFO: renamed from: k */
    public y20<Boolean> f81630k;

    public cg40(PurchaseView purchaseView) {
        this.f81626g = purchaseView;
    }

    /* JADX INFO: renamed from: a */
    public void m109666a(boolean z) {
        if (jyb.m147479J(this.f81623d)) {
            this.f81623d = j690.m143622n(this.f81620a, this.f81621b, this.f81622c);
        }
        this.f81626g.setPrivilegeDescriptions(this.f81623d);
        this.f81626g.setFrom(this.f81624e);
        this.f81626g.setDialogStateAction(this.f81625f);
        this.f81626g.setDialogStateAction(this.f81625f);
        this.f81626g.setPurchaseType(this.f81620a);
        this.f81626g.setFirstPrivilege(this.f81621b);
        this.f81626g.setOnPaymentSuccess(this.f81627h);
        this.f81626g.setOnCloseClick(this.f81628i);
        this.f81626g.setAgreementViewAction(this.f81629j);
        this.f81626g.setAgreementCheckedCallback(this.f81630k);
        this.f81626g.m54367a0(z);
    }

    /* JADX INFO: renamed from: b */
    public cg40 m109667b(y20<Boolean> y20Var) {
        this.f81630k = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public cg40 m109668c(z20<PurchaseType, View> z20Var) {
        this.f81629j = z20Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public cg40 m109669d(y20<Integer> y20Var) {
        this.f81625f = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public cg40 m109670e(String str) {
        this.f81624e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public cg40 m109671f(y20<PurchaseType> y20Var) {
        this.f81628i = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public cg40 m109672g(a30<PurchaseType, Act, String> a30Var) {
        this.f81627h = a30Var;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public cg40 m109673h(List<a690> list) {
        this.f81623d = list;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public cg40 m109674i(PurchaseType purchaseType, Privilege privilege) {
        return m109675j(purchaseType, privilege, false);
    }

    /* JADX INFO: renamed from: j */
    public cg40 m109675j(PurchaseType purchaseType, Privilege privilege, boolean z) {
        this.f81620a = purchaseType;
        this.f81621b = privilege;
        this.f81622c = z;
        return this;
    }
}
