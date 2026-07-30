package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi;

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
import p153l.eul0;
import p153l.ktl0;

/* JADX INFO: loaded from: classes12.dex */
public class VipNewUiFrag extends VipBaseFrag<ktl0, eul0> {

    /* JADX INFO: renamed from: C */
    public String f38716C;

    /* JADX INFO: renamed from: O4 */
    public static VipNewUiFrag m58679O4(int i, String str) {
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
    public static VipNewUiFrag m58680P4(PurchaseType purchaseType, String str) {
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

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public ktl0 mo30639M4() {
        return new ktl0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public eul0 mo30640N4() {
        return new eul0(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m58683S4() {
        ((ktl0) this.f17894z).m151389y0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m58684T4() {
        ((eul0) this.f17893A).m122655D0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m58685U4(PurchaseType purchaseType, C8928d c8928d) {
        C8928d.a aVarM54703b = c8928d.m54703b();
        if (aVarM54703b == null) {
            aVarM54703b = c8928d.m54705d();
        }
        ((eul0) this.f17893A).m122657H0(purchaseType, aVarM54703b);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((eul0) this.f17893A).m122669h0(bundle);
    }

    public String getFrom() {
        return this.f38716C;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((eul0) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m58686o() {
        return ((eul0) this.f17893A).m122662Q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38716C = NullChecker.m82486a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m82486a(this.f38716C)) {
                jSONObject.put("showfrom", this.f38716C);
                jSONObject.put("privilege_showfrom", this.f38716C);
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
