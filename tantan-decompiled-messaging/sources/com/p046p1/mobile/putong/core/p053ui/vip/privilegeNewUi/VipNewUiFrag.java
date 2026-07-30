package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.all0;
import p149l.gkl0;

/* JADX INFO: loaded from: classes9.dex */
public class VipNewUiFrag extends VipBaseFrag<gkl0, all0> {

    /* JADX INFO: renamed from: C */
    public String f37868C;

    /* JADX INFO: renamed from: O4 */
    public static VipNewUiFrag m57496O4(int i, String str) {
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
    public static VipNewUiFrag m57497P4(PurchaseType purchaseType, String str) {
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

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public gkl0 mo29641M4() {
        return new gkl0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public all0 mo29642N4() {
        return new all0(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m57500S4() {
        ((gkl0) this.f17175z).m126664y0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m57501T4() {
        ((all0) this.f17174A).m97391D0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m57502U4(PurchaseType purchaseType, C8765d c8765d) {
        C8765d.a aVarM53520b = c8765d.m53520b();
        if (aVarM53520b == null) {
            aVarM53520b = c8765d.m53522d();
        }
        ((all0) this.f17174A).m97393H0(purchaseType, aVarM53520b);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((all0) this.f17174A).m97405h0(bundle);
    }

    public String getFrom() {
        return this.f37868C;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((all0) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public boolean m57503o() {
        return ((all0) this.f17174A).m97398Q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37868C = NullChecker.m81303a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m81303a(this.f37868C)) {
                jSONObject.put("showfrom", this.f37868C);
                jSONObject.put("privilege_showfrom", this.f37868C);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81303a(this.pageHelper)) {
            this.pageHelper.m109039o(jSONObject);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }
}
