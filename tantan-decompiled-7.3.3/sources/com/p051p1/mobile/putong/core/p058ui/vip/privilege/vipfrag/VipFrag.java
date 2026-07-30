package com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8940b;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegePaymentView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.subjects.C22507a;
import p153l.eql0;
import p153l.jyb;
import p153l.lib0;
import p153l.mql0;
import p153l.ndb0;
import p153l.rj90;

/* JADX INFO: loaded from: classes12.dex */
public class VipFrag extends VipBaseFrag<eql0, mql0> {

    /* JADX INFO: renamed from: C */
    public C22507a<PurchaseType> f38660C = C22507a.m222758b();

    /* JADX INFO: renamed from: D */
    public String f38661D;

    /* JADX INFO: renamed from: E */
    public int f38662E;

    /* JADX INFO: renamed from: F */
    public C8940b f38663F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.VipFrag$a */
    public static /* synthetic */ class C9172a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38664a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f38664a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38664a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38664a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38664a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38664a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38664a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m58606O4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((mql0) this.f17893A).m159542q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: P4 */
    public PrivilegePaymentView m58607P4(PurchaseType purchaseType) {
        switch (C9172a.f38664a[purchaseType.ordinal()]) {
            case 1:
                return ((mql0) this.f17893A).f138090k;
            case 2:
                return ((mql0) this.f17893A).f138091l;
            case 3:
                return ((mql0) this.f17893A).f138092m;
            case 4:
                return ((mql0) this.f17893A).f138093n;
            case 5:
                return ((mql0) this.f17893A).f138094o;
            case 6:
                return ((mql0) this.f17893A).f138095p;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public ndb0 m58608Q4(PurchaseType purchaseType) {
        if (NullChecker.m82487b(this.f38663F)) {
            return this.f38663F.m55231c(purchaseType);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public lib0 m58609R4() {
        return ((mql0) this.f17893A).m159545v();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public eql0 mo30639M4() {
        return new eql0(this);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m58611T4() {
        C8940b c8940b = new C8940b(act(), eql0.m121938q0(), pageId());
        this.f38663F = c8940b;
        c8940b.m55230b();
        this.f38663F.m55232d();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public mql0 mo30640N4() {
        return new mql0(this);
    }

    /* JADX INFO: renamed from: V4 */
    public void m58613V4() {
        ((mql0) this.f17893A).m159534J();
    }

    /* JADX INFO: renamed from: W4 */
    public void m58614W4() {
        ((mql0) this.f17893A).m159535K();
    }

    /* JADX INFO: renamed from: X4 */
    public void m58615X4(PurchaseType purchaseType, Privilege privilege, String str) {
        ((mql0) this.f17893A).m159536L(purchaseType, privilege, str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((mql0) this.f17893A).m159548y(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((mql0) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38661D = NullChecker.m82486a(getArguments()) ? getArguments().getString("vip_selected_from", null) : null;
        this.f38662E = NullChecker.m82486a(getArguments()) ? getArguments().getInt("vip_selected_page", 0) : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m82486a(this.f38661D)) {
                jSONObject.put("showfrom", this.f38661D);
                jSONObject.put("privilege_showfrom", this.f38661D);
            }
            ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
            String strM181693c = "vip";
            if (!jyb.m147479J(arrayListM121938q0)) {
                int size = arrayListM121938q0.size();
                int i = this.f38662E;
                if (size > i) {
                    strM181693c = rj90.m181693c(arrayListM121938q0.get(i));
                }
            }
            jSONObject.put("privilege_type", strM181693c);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.pageHelper.m152780o(jSONObject);
        m58611T4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }
}
