package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi;

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
import p006l.all0;
import p006l.gkl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipNewUiFrag extends VipBaseFrag<gkl0, all0> {

    /* JADX INFO: renamed from: C */
    public String f7649C;

    /* JADX INFO: renamed from: O4 */
    public static VipNewUiFrag m10987O4(int i, String str) {
        VipNewUiFrag vipNewUiFrag = new VipNewUiFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("vip_selected_page", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("vip_selected_from", str);
        }
        vipNewUiFrag.setArguments(bundle);
        return vipNewUiFrag;
    }

    /* JADX INFO: renamed from: P4 */
    public static VipNewUiFrag m10988P4(PurchaseType purchaseType, String str) {
        VipNewUiFrag vipNewUiFrag = new VipNewUiFrag();
        Bundle bundle = new Bundle();
        if (purchaseType != null) {
            bundle.putString("vip_selected_purchase_type", purchaseType.name());
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("vip_selected_from", str);
        }
        vipNewUiFrag.setArguments(bundle);
        return vipNewUiFrag;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public gkl0 mo1551M4() {
        return new gkl0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public all0 mo1552N4() {
        return new all0(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m10991S4() {
        ((gkl0) this.f1164z).m15846y0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m10992T4() {
        ((all0) this.f1163A).m11963D0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m10993U4(PurchaseType purchaseType, d dVar) {
        d.a aVarB = dVar.b();
        if (aVarB == null) {
            aVarB = dVar.d();
        }
        ((all0) this.f1163A).m11965H0(purchaseType, aVarB);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m10994g4(Bundle bundle) {
        super.g4(bundle);
        ((all0) this.f1163A).m11977h0(bundle);
    }

    public String getFrom() {
        return this.f7649C;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((all0) this.f1163A).inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m10995o() {
        return ((all0) this.f1163A).m11970Q0();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7649C = NullChecker.a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.a(this.f7649C)) {
                jSONObject.put("showfrom", this.f7649C);
                jSONObject.put("privilege_showfrom", this.f7649C);
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
