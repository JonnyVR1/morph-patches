package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class m4i0 extends e400 {
    public m4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m153019D(Integer num) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m153022G(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m153028M(f400 f400Var, String str, PayMethod payMethod) {
        boolean zEquals = TEnum.equals(payMethod, "wechat");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("paymentMethods", String.valueOf(zEquals ? 1 : 0));
        } catch (JSONException unused) {
        }
        f400Var.mo102962d().mo127285b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: N */
    public final void m153029N(final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("paymentMethods", "0");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new wf60(this.f89239d, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m202975r(TextUtils.equals(strOptString2, "0") ? PayMethod.get("alipay") : PayMethod.get("wechat")).m202974q(new e30() { // from class: l.b4i0
            @Override // p149l.e30
            public final void call(Object obj) {
                m4i0.m153028M(f400Var, strOptString, (PayMethod) obj);
            }
        }).m202976s();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m153030O(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m114659x(strOptString);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m153031P(final JSONObject jSONObject, PurchaseType purchaseType) {
        e51.m114743H(this.f89239d, new Runnable() { // from class: l.c4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79274a.m153030O(jSONObject);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m153032Q(String str, Privilege privilege, final JSONObject jSONObject) {
        C8764c.m53424R0(this.f89239d, str, privilege, new e30() { // from class: l.f4i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94826a.m153031P(jSONObject, (PurchaseType) obj);
            }
        }, null, null, null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m153033R(PaymentResultWrapper paymentResultWrapper) {
        this.f89239d.m66873d2();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m153034S(Merchandise merchandise, String str, String str2) {
        if (NullChecker.m81303a(merchandise) && NullChecker.m81303a(this.f89239d) && !this.f89239d.isFinishing()) {
            final PurchaseType purchaseTypeM182884b = sab0.m182884b(merchandise.category);
            if (NullChecker.m81303a(purchaseTypeM182884b)) {
                rf60 rf60Var = new rf60(purchaseTypeM182884b, this.f89239d, "", "");
                if (TextUtils.isEmpty(str)) {
                    rf60Var.m179078C(ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o()));
                } else {
                    rf60Var.m179078C(str);
                }
                if (!vwb.m200296J(merchandise.localCoupons) && !vwb.m200298L(merchandise.localCoupons.get(0).couponID)) {
                    rf60Var.m179101r(merchandise.localCoupons.get(0).couponID);
                }
                rf60Var.m179084I(TextUtils.equals(str2, "1"), merchandise.defaultStockKeepUnit.f20507id, new e30() { // from class: l.g4i0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m4i0.m153019D((Integer) obj);
                    }
                });
                c4g0 c4g0Var = m6h0.m153221g().f131690c;
                if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
                    mkd0.m154992z(c4g0Var);
                    m6h0.m153221g().f131690c = this.f89239d.duringCreated(ah60.m96370E()).filter(new w9j() { // from class: l.h4i0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(purchaseTypeM182884b == ((PaymentResultWrapper) obj).purchaseType);
                        }
                    }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.i4i0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f111454a.m153033R((PaymentResultWrapper) obj);
                        }
                    }, new e30() { // from class: l.j4i0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            m4i0.m153022G((Throwable) obj);
                        }
                    }));
                    this.f89239d.lifecycle().filter(new w9j() { // from class: l.k4i0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            C4319c c4319c = (C4319c) obj;
                            return Boolean.valueOf(c4319c.equals(C4319c.f15554o) || c4319c.equals(C4319c.f15552m));
                        }
                    }).subscribe(mkd0.m154955G(new e30() { // from class: l.l4i0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            m6h0.m153221g().m153232c();
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m153035T(f400 f400Var, final JSONObject jSONObject) {
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
        e51.m114741F(this.f89239d, new Runnable() { // from class: l.d4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f84307a.m153032Q(strOptString, privilege, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m153036U(f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("paymentMethods", "0");
        String strOptString2 = jSONObject.optString("merchandiseId");
        final String strOptString3 = jSONObject.optString("purchaseId", "");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final Merchandise merchandiseM153229o = m6h0.m153229o(strOptString2);
        e51.m114741F(this.f89239d, new Runnable() { // from class: l.e4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89285a.m153034S(merchandiseM153229o, strOptString3, strOptString);
            }
        });
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getCurrencyType":
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("currencyType", qib0.f154686D0);
                    m114661z(jSONObject, jSONObject2.toString());
                    break;
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
                }
                return true;
            case "getInstantChatNumConfig":
                m114661z(jSONObject, String.valueOf(yx80.m216433a()));
                return true;
            case "showYouthVipPurchase":
                m153035T(f400Var, jSONObject);
                return true;
            case "hasYouthVipPrivilege":
                m114661z(jSONObject, xma.m210050O3() ? "1" : "0");
                return true;
            case "paymentMethodChanges":
                m153029N(f400Var, jSONObject);
                return true;
            case "jumpToPayment":
                m153036U(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
