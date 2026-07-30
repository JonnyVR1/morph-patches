package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.aop;
import p153l.gnp;

/* JADX INFO: loaded from: classes12.dex */
public class IntlVipNewUiFrag extends VipBaseFrag<gnp, aop> {

    /* JADX INFO: renamed from: C */
    public String f37957C;

    /* JADX INFO: renamed from: O4 */
    public static IntlVipNewUiFrag m57532O4(int i, String str) {
        IntlVipNewUiFrag intlVipNewUiFrag = new IntlVipNewUiFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("vip_selected_page", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("vip_selected_from", str);
        }
        intlVipNewUiFrag.setArguments(bundle);
        return intlVipNewUiFrag;
    }

    /* JADX INFO: renamed from: P4 */
    public static IntlVipNewUiFrag m57533P4(PurchaseType purchaseType, String str) {
        IntlVipNewUiFrag intlVipNewUiFrag = new IntlVipNewUiFrag();
        Bundle bundle = new Bundle();
        if (purchaseType != null) {
            bundle.putString("vip_selected_purchase_type", purchaseType.name());
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("vip_selected_from", str);
        }
        intlVipNewUiFrag.setArguments(bundle);
        return intlVipNewUiFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public gnp mo30639M4() {
        return new gnp(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public aop mo30640N4() {
        return new aop(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m57536S4(int i) {
        ((aop) this.f17893A).m99211v0(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m57537T4() {
        ((gnp) this.f17894z).m130959t0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m57538U4() {
        ((aop) this.f17893A).m99175O0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m57539V4() {
        ((aop) this.f17893A).m99176P0();
    }

    /* JADX INFO: renamed from: W4 */
    public void m57540W4(PurchaseType purchaseType, C8928d c8928d) {
        C8928d.a aVarM54703b = c8928d.m54703b();
        if (aVarM54703b == null) {
            aVarM54703b = c8928d.m54705d();
        }
        ((aop) this.f17893A).m99179S0(purchaseType, aVarM54703b);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((aop) this.f17893A).m99208r0(bundle);
    }

    public String getFrom() {
        return this.f37957C;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((aop) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37957C = NullChecker.m82486a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m82486a(this.f37957C)) {
                jSONObject.put("showfrom", this.f37957C);
                jSONObject.put("privilege_showfrom", this.f37957C);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82486a(this.pageHelper)) {
            this.pageHelper.m152780o(jSONObject);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }
}
