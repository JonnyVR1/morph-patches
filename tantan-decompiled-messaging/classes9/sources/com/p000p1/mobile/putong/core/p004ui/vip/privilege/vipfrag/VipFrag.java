package com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.C0213b;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.VipBaseFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegePaymentView;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.vwb;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ahl0;
import p006l.hab0;
import p006l.ihl0;
import p006l.j5b0;
import p006l.nb90;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipFrag extends VipBaseFrag<ahl0, ihl0> {

    /* JADX INFO: renamed from: C */
    public a<PurchaseType> f7593C = a.b();

    /* JADX INFO: renamed from: D */
    public String f7594D;

    /* JADX INFO: renamed from: E */
    public int f7595E;

    /* JADX INFO: renamed from: F */
    public C0213b f7596F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.VipFrag$a */
    public static /* synthetic */ class C0445a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7597a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f7597a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7597a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7597a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7597a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7597a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7597a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m10909O4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((ihl0) this.f1163A).m16684q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: P4 */
    public PrivilegePaymentView m10910P4(PurchaseType purchaseType) {
        switch (C0445a.f7597a[purchaseType.ordinal()]) {
            case 1:
                return ((ihl0) this.f1163A).f14463k;
            case 2:
                return ((ihl0) this.f1163A).f14464l;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return ((ihl0) this.f1163A).f14465m;
            case CameraSticker.STATE_ERROR /* 4 */:
                return ((ihl0) this.f1163A).f14466n;
            case 5:
                return ((ihl0) this.f1163A).f14467o;
            case 6:
                return ((ihl0) this.f1163A).f14468p;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public j5b0 m10911Q4(PurchaseType purchaseType) {
        if (NullChecker.b(this.f7596F)) {
            return this.f7596F.m7383c(purchaseType);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public hab0 m10912R4() {
        return ((ihl0) this.f1163A).m16687v();
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public ahl0 mo1551M4() {
        return new ahl0(this);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m10914T4() {
        C0213b c0213b = new C0213b(act(), ahl0.m11840q0(), pageId());
        this.f7596F = c0213b;
        c0213b.m7382b();
        this.f7596F.m7384d();
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public ihl0 mo1552N4() {
        return new ihl0(this);
    }

    /* JADX INFO: renamed from: V4 */
    public void m10916V4() {
        ((ihl0) this.f1163A).m16675J();
    }

    /* JADX INFO: renamed from: W4 */
    public void m10917W4() {
        ((ihl0) this.f1163A).m16676K();
    }

    /* JADX INFO: renamed from: X4 */
    public void m10918X4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((ihl0) this.f1163A).m16677L(purchaseType, privilege, str);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m10919g4(Bundle bundle) {
        super.g4(bundle);
        ((ihl0) this.f1163A).m16690y(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((ihl0) this.f1163A).inflateView(layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7594D = NullChecker.a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        this.f7595E = NullChecker.a(getArguments()) ? getArguments().getInt("vip_selected_page", 0) : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.a(this.f7594D)) {
                jSONObject.put("showfrom", this.f7594D);
                jSONObject.put("privilege_showfrom", this.f7594D);
            }
            ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
            String strM19999c = "vip";
            if (!vwb.J(arrayListM11840q0)) {
                int size = arrayListM11840q0.size();
                int i = this.f7595E;
                if (size > i) {
                    strM19999c = nb90.m19999c(arrayListM11840q0.get(i));
                }
            }
            jSONObject.put("privilege_type", strM19999c);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.pageHelper.o(jSONObject);
        m10914T4();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_privileges_view";
    }
}
