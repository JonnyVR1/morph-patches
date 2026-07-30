package com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8777b;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegePaymentView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.subjects.C22392a;
import p149l.ahl0;
import p149l.hab0;
import p149l.ihl0;
import p149l.j5b0;
import p149l.nb90;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class VipFrag extends VipBaseFrag<ahl0, ihl0> {

    /* JADX INFO: renamed from: C */
    public C22392a<PurchaseType> f37812C = C22392a.m221512b();

    /* JADX INFO: renamed from: D */
    public String f37813D;

    /* JADX INFO: renamed from: E */
    public int f37814E;

    /* JADX INFO: renamed from: F */
    public C8777b f37815F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.VipFrag$a */
    public static /* synthetic */ class C9009a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37816a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37816a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37816a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37816a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37816a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37816a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37816a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m57423O4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((ihl0) this.f17174A).m136235q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: P4 */
    public PrivilegePaymentView m57424P4(PurchaseType purchaseType) {
        switch (C9009a.f37816a[purchaseType.ordinal()]) {
            case 1:
                return ((ihl0) this.f17174A).f113277k;
            case 2:
                return ((ihl0) this.f17174A).f113278l;
            case 3:
                return ((ihl0) this.f17174A).f113279m;
            case 4:
                return ((ihl0) this.f17174A).f113280n;
            case 5:
                return ((ihl0) this.f17174A).f113281o;
            case 6:
                return ((ihl0) this.f17174A).f113282p;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public j5b0 m57425Q4(PurchaseType purchaseType) {
        if (NullChecker.m81304b(this.f37815F)) {
            return this.f37815F.m54048c(purchaseType);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public hab0 m57426R4() {
        return ((ihl0) this.f17174A).m136238v();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public ahl0 mo29641M4() {
        return new ahl0(this);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m57428T4() {
        C8777b c8777b = new C8777b(act(), ahl0.m96502q0(), pageId());
        this.f37815F = c8777b;
        c8777b.m54047b();
        this.f37815F.m54049d();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public ihl0 mo29642N4() {
        return new ihl0(this);
    }

    /* JADX INFO: renamed from: V4 */
    public void m57430V4() {
        ((ihl0) this.f17174A).m136227J();
    }

    /* JADX INFO: renamed from: W4 */
    public void m57431W4() {
        ((ihl0) this.f17174A).m136228K();
    }

    /* JADX INFO: renamed from: X4 */
    public void m57432X4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((ihl0) this.f17174A).m136229L(purchaseType, privilege, str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((ihl0) this.f17174A).m136241y(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((ihl0) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37813D = NullChecker.m81303a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        this.f37814E = NullChecker.m81303a(getArguments()) ? getArguments().getInt("vip_selected_page", 0) : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m81303a(this.f37813D)) {
                jSONObject.put("showfrom", this.f37813D);
                jSONObject.put("privilege_showfrom", this.f37813D);
            }
            ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
            String strM158765c = "vip";
            if (!vwb.m200296J(arrayListM96502q0)) {
                int size = arrayListM96502q0.size();
                int i = this.f37814E;
                if (size > i) {
                    strM158765c = nb90.m158765c(arrayListM96502q0.get(i));
                }
            }
            jSONObject.put("privilege_type", strM158765c);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.pageHelper.m109039o(jSONObject);
        m57428T4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }
}
