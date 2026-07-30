package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.CreditScoreTaskType;
import com.p000p1.mobile.putong.data.PayMethod;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.ah60;
import l.c4g0;
import l.d30;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.m6h0;
import l.mkd0;
import l.mqi0;
import l.ogw;
import l.qib0;
import l.rf60;
import l.sab0;
import l.vwb;
import l.w9j;
import l.wf60;
import l.xma;
import l.yx80;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m4i0 extends e400 {
    public m4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11786D(Integer num) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m11789G(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m11795M(f400 f400Var, String str, PayMethod payMethod) {
        boolean zEquals = TEnum.equals(payMethod, "wechat");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("paymentMethods", String.valueOf(zEquals ? 1 : 0));
        } catch (JSONException unused) {
        }
        f400Var.d().b(str, new String[]{jSONObject.toString().replace("\"", "\\\"")});
    }

    /* JADX INFO: renamed from: N */
    public final void m11796N(final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("callback");
        String strOptString2 = jSONObject.optString("paymentMethods", "0");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new wf60(((e400) this).d, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).r(TextUtils.equals(strOptString2, "0") ? PayMethod.get(PayMethod.alipay) : PayMethod.get("wechat")).q(new e30() { // from class: l.b4i0
            public final void call(Object obj) {
                m4i0.m11795M(f400Var, strOptString, (PayMethod) obj);
            }
        }).s();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m11797O(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        x(strOptString);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m11798P(final JSONObject jSONObject, PurchaseType purchaseType) {
        e51.H(((e400) this).d, new Runnable() { // from class: l.c4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6531a.m11797O(jSONObject);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11799Q(String str, Privilege privilege, final JSONObject jSONObject) {
        c.R0(((e400) this).d, str, privilege, new e30() { // from class: l.f4i0
            public final void call(Object obj) {
                this.f7979a.m11798P(jSONObject, (PurchaseType) obj);
            }
        }, (d30) null, (d30) null, (d30) null);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11800R(PaymentResultWrapper paymentResultWrapper) {
        ((e400) this).d.finish();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m11801S(Merchandise merchandise, String str, String str2) {
        if (NullChecker.a(merchandise) && NullChecker.a(((e400) this).d) && !((e400) this).d.isFinishing()) {
            final PurchaseType purchaseTypeB = sab0.b(merchandise.category);
            if (NullChecker.a(purchaseTypeB)) {
                rf60 rf60Var = new rf60(purchaseTypeB, ((e400) this).d, "", "");
                if (TextUtils.isEmpty(str)) {
                    rf60Var.C(ogw.e(CoreModule.H().userId() + mqi0.o()));
                } else {
                    rf60Var.C(str);
                }
                if (!vwb.J(merchandise.localCoupons) && !vwb.L(((Coupon) merchandise.localCoupons.get(0)).couponID)) {
                    rf60Var.r(((Coupon) merchandise.localCoupons.get(0)).couponID);
                }
                rf60Var.I(TextUtils.equals(str2, "1"), merchandise.defaultStockKeepUnit.id, new e30() { // from class: l.g4i0
                    public final void call(Object obj) {
                        m4i0.m11786D((Integer) obj);
                    }
                });
                c4g0 c4g0Var = m6h0.g().c;
                if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
                    mkd0.z(c4g0Var);
                    m6h0.g().c = ((e400) this).d.duringCreated(ah60.E()).filter(new w9j() { // from class: l.h4i0
                        public final Object call(Object obj) {
                            return Boolean.valueOf(purchaseTypeB == ((PaymentResultWrapper) obj).purchaseType);
                        }
                    }).take(1).subscribe(mkd0.H(new e30() { // from class: l.i4i0
                        public final void call(Object obj) {
                            this.f8898a.m11800R((PaymentResultWrapper) obj);
                        }
                    }, new e30() { // from class: l.j4i0
                        public final void call(Object obj) {
                            m4i0.m11789G((Throwable) obj);
                        }
                    }));
                    ((e400) this).d.lifecycle().filter(new w9j() { // from class: l.k4i0
                        public final Object call(Object obj) {
                            com.p1.mobile.android.app.c cVar = (com.p1.mobile.android.app.c) obj;
                            return Boolean.valueOf(cVar.equals(com.p1.mobile.android.app.c.o) || cVar.equals(com.p1.mobile.android.app.c.m));
                        }
                    }).subscribe(mkd0.G(new e30() { // from class: l.l4i0
                        public final void call(Object obj) {
                            m6h0.g().c();
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m11802T(f400 f400Var, final JSONObject jSONObject) {
        final Privilege privilege;
        final String strOptString = jSONObject.optString("from");
        String strOptString2 = jSONObject.optString(CreditScoreTaskType.privilege);
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
        e51.F(((e400) this).d, new Runnable() { // from class: l.d4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6812a.m11799Q(strOptString, privilege, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m11803U(f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("paymentMethods", "0");
        String strOptString2 = jSONObject.optString("merchandiseId");
        final String strOptString3 = jSONObject.optString("purchaseId", "");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        final Merchandise merchandiseO = m6h0.o(strOptString2);
        e51.F(((e400) this).d, new Runnable() { // from class: l.e4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7205a.m11801S(merchandiseO, strOptString3, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public boolean m11804n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getCurrencyType":
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("currencyType", qib0.D0);
                    z(jSONObject, jSONObject2.toString());
                    break;
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
                return true;
            case "getInstantChatNumConfig":
                z(jSONObject, String.valueOf(yx80.a()));
                return true;
            case "showYouthVipPurchase":
                m11802T(f400Var, jSONObject);
                return true;
            case "hasYouthVipPrivilege":
                z(jSONObject, xma.O3() ? "1" : "0");
                return true;
            case "paymentMethodChanges":
                m11796N(f400Var, jSONObject);
                return true;
            case "jumpToPayment":
                m11803U(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
