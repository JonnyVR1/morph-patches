package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.VipBaseFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.amp;
import p006l.glp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlVipNewUiFrag extends VipBaseFrag<glp, amp> {

    /* JADX INFO: renamed from: C */
    public String f6890C;

    /* JADX INFO: renamed from: O4 */
    public static IntlVipNewUiFrag m9786O4(int i, String str) {
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
    public static IntlVipNewUiFrag m9787P4(PurchaseType purchaseType, String str) {
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

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public glp mo1551M4() {
        return new glp(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public amp mo1552N4() {
        return new amp(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m9790S4(int i) {
        ((amp) this.f1163A).m12123v0(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m9791T4() {
        ((glp) this.f1164z).m15887t0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m9792U4() {
        ((amp) this.f1163A).m12086O0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m9793V4() {
        ((amp) this.f1163A).m12087P0();
    }

    /* JADX INFO: renamed from: W4 */
    public void m9794W4(PurchaseType purchaseType, d dVar) {
        d.a aVarB = dVar.b();
        if (aVarB == null) {
            aVarB = dVar.d();
        }
        ((amp) this.f1163A).m12090S0(purchaseType, aVarB);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m9795g4(Bundle bundle) {
        super.g4(bundle);
        ((amp) this.f1163A).m12120r0(bundle);
    }

    public String getFrom() {
        return this.f6890C;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((amp) this.f1163A).inflateView(layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6890C = NullChecker.a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.a(this.f6890C)) {
                jSONObject.put("showfrom", this.f6890C);
                jSONObject.put("privilege_showfrom", this.f6890C);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        if (NullChecker.a(this.pageHelper)) {
            this.pageHelper.o(jSONObject);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_privileges_view";
    }
}
