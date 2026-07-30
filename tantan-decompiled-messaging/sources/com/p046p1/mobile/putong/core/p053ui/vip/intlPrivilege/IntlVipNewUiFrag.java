package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege;

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
import p149l.amp;
import p149l.glp;

/* JADX INFO: loaded from: classes9.dex */
public class IntlVipNewUiFrag extends VipBaseFrag<glp, amp> {

    /* JADX INFO: renamed from: C */
    public String f37109C;

    /* JADX INFO: renamed from: O4 */
    public static IntlVipNewUiFrag m56349O4(int i, String str) {
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
    public static IntlVipNewUiFrag m56350P4(PurchaseType purchaseType, String str) {
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

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public glp mo29641M4() {
        return new glp(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public amp mo29642N4() {
        return new amp(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m56353S4(int i) {
        ((amp) this.f17174A).m97670v0(i);
    }

    /* JADX INFO: renamed from: T4 */
    public void m56354T4() {
        ((glp) this.f17175z).m126910t0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m56355U4() {
        ((amp) this.f17174A).m97634O0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m56356V4() {
        ((amp) this.f17174A).m97635P0();
    }

    /* JADX INFO: renamed from: W4 */
    public void m56357W4(PurchaseType purchaseType, C8765d c8765d) {
        C8765d.a aVarM53520b = c8765d.m53520b();
        if (aVarM53520b == null) {
            aVarM53520b = c8765d.m53522d();
        }
        ((amp) this.f17174A).m97638S0(purchaseType, aVarM53520b);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((amp) this.f17174A).m97667r0(bundle);
    }

    public String getFrom() {
        return this.f37109C;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((amp) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37109C = NullChecker.m81303a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m81303a(this.f37109C)) {
                jSONObject.put("showfrom", this.f37109C);
                jSONObject.put("privilege_showfrom", this.f37109C);
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
