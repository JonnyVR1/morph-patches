package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class vci0 extends wc00 {
    public vci0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m200809L(Integer num) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m200812O(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m200818U(xc00 xc00Var, String str, PayMethod payMethod) {
        boolean zEquals = TEnum.equals(payMethod, "wechat");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("paymentMethods", String.valueOf(zEquals ? 1 : 0));
        } catch (JSONException unused) {
        }
        xc00Var.mo99544d().mo97004b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: V */
    public final void m200819V(final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("paymentMethods", "0");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new bo60(this.f188308d, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m105668r(TextUtils.equals(strOptString2, "0") ? PayMethod.get("alipay") : PayMethod.get("wechat")).m105667q(new y20() { // from class: l.kci0
            @Override // p153l.y20
            public final void call(Object obj) {
                vci0.m200818U(xc00Var, strOptString, (PayMethod) obj);
            }
        }).m105669s();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m200820W(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m205738F(strOptString);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m200821X(final JSONObject jSONObject, PurchaseType purchaseType) {
        l51.m152888H(this.f188308d, new Runnable() { // from class: l.lci0
            @Override // java.lang.Runnable
            public final void run() {
                this.f131359a.m200820W(jSONObject);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m200822Y(String str, Privilege privilege, final JSONObject jSONObject) {
        C8927c.m54607R0(this.f188308d, str, privilege, new y20() { // from class: l.oci0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146712a.m200821X(jSONObject, (PurchaseType) obj);
            }
        }, null, null, null);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m200823Z(PaymentResultWrapper paymentResultWrapper) {
        this.f188308d.m68056e2();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m200824a0(Merchandise merchandise, String str, String str2) {
        if (NullChecker.m82486a(merchandise) && NullChecker.m82486a(this.f188308d) && !this.f188308d.isFinishing()) {
            final PurchaseType purchaseTypeM206558b = wib0.m206558b(merchandise.category);
            if (NullChecker.m82486a(purchaseTypeM206558b)) {
                wn60 wn60Var = new wn60(purchaseTypeM206558b, this.f188308d, "", "");
                if (TextUtils.isEmpty(str)) {
                    wn60Var.m207144C(niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o()));
                } else {
                    wn60Var.m207144C(str);
                }
                if (!jyb.m147479J(merchandise.localCoupons) && !jyb.m147481L(merchandise.localCoupons.get(0).couponID)) {
                    wn60Var.m207167r(merchandise.localCoupons.get(0).couponID);
                }
                wn60Var.m207150I(TextUtils.equals(str2, "1"), merchandise.defaultStockKeepUnit.f21249id, new y20() { // from class: l.pci0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vci0.m200809L((Integer) obj);
                    }
                });
                kcg0 kcg0Var = ueh0.m195753g().f178657c;
                if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
                    psd0.m173633z(kcg0Var);
                    ueh0.m195753g().f178657c = this.f188308d.duringCreated(fp60.m126543E()).filter(new qcj() { // from class: l.qci0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(purchaseTypeM206558b == ((PaymentResultWrapper) obj).purchaseType);
                        }
                    }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.rci0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f162215a.m200823Z((PaymentResultWrapper) obj);
                        }
                    }, new y20() { // from class: l.sci0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            vci0.m200812O((Throwable) obj);
                        }
                    }));
                    this.f188308d.lifecycle().filter(new qcj() { // from class: l.tci0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            C4470c c4470c = (C4470c) obj;
                            return Boolean.valueOf(c4470c.equals(C4470c.f16273o) || c4470c.equals(C4470c.f16271m));
                        }
                    }).subscribe(psd0.m173596G(new y20() { // from class: l.uci0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ueh0.m195753g().m195764c();
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m200825b0(xc00 xc00Var, final JSONObject jSONObject) {
        final Privilege privilege;
        final String strOptString = jSONObject.optString("from");
        String strOptString2 = jSONObject.optString("privilege");
        if (TextUtils.equals(strOptString2, "roamingLocation")) {
            privilege = Privilege.youth_roaming;
        } else if (TextUtils.equals(strOptString2, "findPartner")) {
            privilege = Privilege.youth_find_partner;
        } else if (TextUtils.equals(strOptString2, "blindBox")) {
            privilege = Privilege.youth_blind_box;
        } else if (TextUtils.equals(strOptString2, "superlike")) {
            privilege = Privilege.youth_superlike;
        } else {
            privilege = TextUtils.equals(strOptString2, "messageReadStatus") ? Privilege.youth_message_read : Privilege.youth_roaming;
        }
        l51.m152886F(this.f188308d, new Runnable() { // from class: l.mci0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135815a.m200822Y(strOptString, privilege, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m200826c0(xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("paymentMethods", "0");
        String strOptString2 = jSONObject.optString("merchandiseId");
        final String strOptString3 = jSONObject.optString("purchaseId", "");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final Merchandise merchandiseM195761o = ueh0.m195761o(strOptString2);
        l51.m152886F(this.f188308d, new Runnable() { // from class: l.nci0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141364a.m200824a0(merchandiseM195761o, strOptString3, strOptString);
            }
        });
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getCurrencyType":
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("currencyType", uqb0.f180369D0);
                    m205740H(jSONObject, jSONObject2.toString());
                    break;
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
                return true;
            case "getInstantChatNumConfig":
                m205740H(jSONObject, String.valueOf(c690.m108122a()));
                return true;
            case "showYouthVipPurchase":
                m200825b0(xc00Var, jSONObject);
                return true;
            case "hasYouthVipPrivilege":
                m205740H(jSONObject, joa.m146364P3() ? "1" : "0");
                return true;
            case "paymentMethodChanges":
                m200819V(xc00Var, jSONObject);
                return true;
            case "jumpToPayment":
                m200826c0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
