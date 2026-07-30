package p009l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Objects;
import l.b5g0;
import l.c4g0;
import l.e30;
import l.hab0;
import l.jfd0;
import l.lsi0;
import l.mkd0;
import l.o460;
import l.osi0;
import l.sab0;
import l.ura;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sd60 {

    /* JADX INFO: renamed from: f */
    public static long f20180f;

    /* JADX INFO: renamed from: a */
    public final Act f20181a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f20182b;

    /* JADX INFO: renamed from: c */
    public c4g0 f20183c;

    /* JADX INFO: renamed from: d */
    public v9j<c<PaymentApi.PaymentResultStatus>> f20184d;

    /* JADX INFO: renamed from: e */
    public v9j<c<PaymentApi.SignResultStatus>> f20185e;

    public sd60(Act act, PurchaseType purchaseType) {
        this.f20181a = act;
        this.f20182b = purchaseType;
        m22094r();
    }

    /* JADX INFO: renamed from: B */
    public static void m22068B(PurchaseType purchaseType) {
        if (sab0.f(purchaseType)) {
            CoreModule.c.H0.k5();
        } else {
            CoreModule.c.j0.J5();
            CoreModule.c.C0.u4();
            CoreModule.c.e0.W9(CoreModule.H().userId());
        }
        CoreModule.c.O0.C3();
    }

    /* JADX INFO: renamed from: C */
    public static void m22069C(Act act, PayMethod payMethod, f5f0 f5f0Var, PurchaseType purchaseType) {
        if (f5f0Var.f12813a == null) {
            jfd0.a("PaymentParam is null !!!");
            return;
        }
        if (ura.e().d().ib()) {
            osi0.g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.Companion.g(f5f0Var.f12813a.getPurchaseTrackId(), ((PaymentParam) f5f0Var.f12813a).itemId, "user block");
                return;
            } else {
                hab0.Companion.a(f5f0Var.f12813a.getPurchaseTrackId(), ((PaymentParam) f5f0Var.f12813a).itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new sd60(act, purchaseType).m22089D(new ui0(act, f5f0Var.f12813a.getPurchaseTrackId()), f5f0Var);
        } else if (string.equals("wechat")) {
            new sd60(act, purchaseType).m22089D(new jfp0(act, f5f0Var.f12813a.getPurchaseTrackId()), f5f0Var);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m22070E(Act act, PayMethod payMethod, f5f0 f5f0Var, PurchaseType purchaseType) {
        if (f5f0Var.f12813a == null) {
            jfd0.a("PaymentParam is null !!!");
            return;
        }
        if (ura.e().d().ib()) {
            osi0.g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.Companion.g(f5f0Var.f12813a.getPurchaseTrackId(), ((PaymentParam) f5f0Var.f12813a).itemId, "user block");
                return;
            } else {
                hab0.Companion.a(f5f0Var.f12813a.getPurchaseTrackId(), ((PaymentParam) f5f0Var.f12813a).itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new sd60(act, purchaseType).m22093j(new ui0(act, f5f0Var.f12813a.getPurchaseTrackId()), f5f0Var);
        } else if (string.equals("wechat")) {
            new sd60(act, purchaseType).m22092H(new jfp0(act, f5f0Var.f12813a.getPurchaseTrackId()), f5f0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m22080k() {
        boolean zA = o460.a("com.eg.android.AlipayGphone");
        if (!zA) {
            lsi0.y(CoreModule.b.getString(R$string.f6076S9));
        }
        return zA;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m22081l() {
        return o460.a("com.eg.android.AlipayGphone");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m22082m() {
        boolean zA = o460.a("com.jingdong.app.mall");
        if (!zA) {
            lsi0.y("未安装京东");
        }
        return zA;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22083n() {
        return o460.a("com.jingdong.app.mall");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m22084o() {
        return SystemClock.elapsedRealtime() - f20180f >= 3000;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m22085p() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.b, (String) null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        if (iwxapiCreateWXAPI.isWXAppInstalled()) {
            return true;
        }
        lsi0.y(CoreModule.b.getString(R$string.f6142Y9));
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22086q() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.b, (String) null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        return iwxapiCreateWXAPI.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: y */
    public static void m22087y(Act act, PayMethod payMethod, PurchaseType purchaseType, @NonNull l6b0 l6b0Var) {
        if (l6b0Var.f15968a == null) {
            jfd0.a("PaymentParam is null !!!");
            return;
        }
        if (ura.e().d().ib()) {
            osi0.g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.Companion.g(l6b0Var.f15968a.getPurchaseTrackId(), ((PaymentParam) l6b0Var.f15968a).itemId, "user block");
            } else if (TEnum.equals(payMethod, "alipay")) {
                hab0.Companion.a(l6b0Var.f15968a.getPurchaseTrackId(), ((PaymentParam) l6b0Var.f15968a).itemId, "user block");
                return;
            } else {
                hab0.Companion.b(l6b0Var.f15968a.getPurchaseTrackId(), ((PaymentParam) l6b0Var.f15968a).itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        switch (string) {
            case "alipay":
                new sd60(act, purchaseType).m22101z(new ui0(act, l6b0Var.f15968a.getPurchaseTrackId()), l6b0Var);
                break;
            case "wechat":
                new sd60(act, purchaseType).m22101z(new jfp0(act, l6b0Var.f15968a.getPurchaseTrackId()), l6b0Var);
                break;
            case "jingdong":
                new sd60(act, purchaseType).m22101z(new kiq(act, l6b0Var.f15968a.getPurchaseTrackId()), l6b0Var);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m22088A(l6b0 l6b0Var) {
        if (this.f20184d == null) {
            jfd0.a("retry is null !!!");
            return;
        }
        gh60 gh60Var = new gh60(this.f20181a, this.f20182b, new id60(this), l6b0Var);
        gh60Var.m15045n(l6b0Var.f15969b);
        this.f20183c = ((c) this.f20184d.call()).subscribe(gh60Var);
    }

    /* JADX INFO: renamed from: D */
    public void m22089D(gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f12813a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f20183c = gmlVar.mo15111b(signPaymentParam).map(new w9j() { // from class: l.nd60
                public final Object call(Object obj) {
                    return this.f17413a.m22099w(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe(new l5f0(this.f20181a, this.f20182b, f5f0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m22090F(f5f0 f5f0Var) {
        if (this.f20185e == null) {
            jfd0.a("retry is null !!!");
        } else {
            this.f20183c = ((c) this.f20185e.call()).subscribe(new l5f0(this.f20181a, this.f20182b, f5f0Var, true, new pd60(this)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m22091G() {
        if (NullChecker.a(this.f20183c) && !this.f20183c.isUnsubscribed()) {
            this.f20183c.unsubscribe();
        }
        this.f20183c = null;
    }

    /* JADX INFO: renamed from: H */
    public void m22092H(gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f12813a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f20183c = gmlVar.mo15110a(signPaymentParam).map(new w9j() { // from class: l.od60
                public final Object call(Object obj) {
                    return this.f17924a.m22100x(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe(new l5f0(this.f20181a, this.f20182b, f5f0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m22093j(final gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f12813a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.a("Observable<IAgreement> or PaymentParam is null !!!");
            return;
        }
        l5f0 l5f0Var = new l5f0(this.f20181a, this.f20182b, f5f0Var, true, new pd60(this));
        v9j<c<PaymentApi.SignResultStatus>> v9jVar = new v9j() { // from class: l.qd60
            public final Object call() {
                return this.f19152a.m22096t(gmlVar, signPaymentParam, f5f0Var);
            }
        };
        this.f20185e = v9jVar;
        this.f20183c = ((c) v9jVar.call()).subscribe(l5f0Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m22094r() {
        this.f20181a.lifecycle().filter(new w9j() { // from class: l.kd60
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.m);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ld60
            public final void call(Object obj) {
                this.f16084a.m22097u((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ PaymentApi.SignResultStatus m22095s(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m11415L(this.f20182b, f5f0Var, "", true);
            if (b5g0.a()) {
                ah60.m11413J(this.f20182b, signPaymentParam, f5f0Var.f12814b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ c m22096t(gml gmlVar, final SignPaymentParam signPaymentParam, final f5f0 f5f0Var) {
        return gmlVar.mo15110a(signPaymentParam).map(new w9j() { // from class: l.rd60
            public final Object call(Object obj) {
                return this.f19743a.m22095s(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m22097u(com.p1.mobile.android.app.c cVar) {
        m22091G();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ c m22098v(nzl nzlVar, l6b0 l6b0Var) {
        if (nzlVar instanceof ui0) {
            f20180f = SystemClock.elapsedRealtime();
        }
        PurchasePaymentParam purchasePaymentParam = l6b0Var.f15968a;
        Act act = this.f20181a;
        Objects.requireNonNull(act);
        return nzlVar.mo16983c(purchasePaymentParam, new md60(act));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ PaymentApi.SignResultStatus m22099w(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m11415L(this.f20182b, f5f0Var, "", false);
            if (b5g0.a()) {
                ah60.m11413J(this.f20182b, signPaymentParam, f5f0Var.f12814b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentApi.SignResultStatus m22100x(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m11415L(this.f20182b, f5f0Var, "", false);
            if (b5g0.a()) {
                ah60.m11413J(this.f20182b, signPaymentParam, f5f0Var.f12814b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: z */
    public void m22101z(final nzl nzlVar, final l6b0 l6b0Var) {
        gh60 gh60Var = new gh60(this.f20181a, this.f20182b, new id60(this), l6b0Var);
        gh60Var.m15045n(l6b0Var.f15969b);
        this.f20184d = new v9j() { // from class: l.jd60
            public final Object call() {
                return this.f15059a.m22098v(nzlVar, l6b0Var);
            }
        };
        boolean z = ((PaymentParam) l6b0Var.f15968a).useAutoDeduct;
        Act act = this.f20181a;
        if (z) {
            we60.m24159U(act);
        } else {
            act.progress(R$string.f6079T1);
        }
        ((c) this.f20184d.call()).subscribe(gh60Var);
    }
}
