package p149l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class sd60 {

    /* JADX INFO: renamed from: f */
    public static long f163807f;

    /* JADX INFO: renamed from: a */
    public final Act f163808a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f163809b;

    /* JADX INFO: renamed from: c */
    public c4g0 f163810c;

    /* JADX INFO: renamed from: d */
    public v9j<C22306c<PaymentApi.PaymentResultStatus>> f163811d;

    /* JADX INFO: renamed from: e */
    public v9j<C22306c<PaymentApi.SignResultStatus>> f163812e;

    public sd60(Act act, PurchaseType purchaseType) {
        this.f163808a = act;
        this.f163809b = purchaseType;
        m183474r();
    }

    /* JADX INFO: renamed from: B */
    public static void m183448B(PurchaseType purchaseType) {
        if (sab0.m182888f(purchaseType)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else {
            CoreModule.f17545c.f19654j0.m30591J5();
            CoreModule.f17545c.f19555C0.m210112u4();
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        }
        CoreModule.f17545c.f19591O0.m30075C3();
    }

    /* JADX INFO: renamed from: C */
    public static void m183449C(Act act, PayMethod payMethod, f5f0 f5f0Var, PurchaseType purchaseType) {
        if (f5f0Var.f95177a == null) {
            jfd0.m141176a("PaymentParam is null !!!");
            return;
        }
        if (ura.m195053e().m195057d().mo33848ib()) {
            osi0.m165783g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.INSTANCE.m130133g(f5f0Var.f95177a.getPurchaseTrackId(), f5f0Var.f95177a.itemId, "user block");
                return;
            } else {
                hab0.INSTANCE.m130127a(f5f0Var.f95177a.getPurchaseTrackId(), f5f0Var.f95177a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new sd60(act, purchaseType).m183469D(new ui0(act, f5f0Var.f95177a.getPurchaseTrackId()), f5f0Var);
        } else if (string.equals("wechat")) {
            new sd60(act, purchaseType).m183469D(new jfp0(act, f5f0Var.f95177a.getPurchaseTrackId()), f5f0Var);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m183450E(Act act, PayMethod payMethod, f5f0 f5f0Var, PurchaseType purchaseType) {
        if (f5f0Var.f95177a == null) {
            jfd0.m141176a("PaymentParam is null !!!");
            return;
        }
        if (ura.m195053e().m195057d().mo33848ib()) {
            osi0.m165783g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.INSTANCE.m130133g(f5f0Var.f95177a.getPurchaseTrackId(), f5f0Var.f95177a.itemId, "user block");
                return;
            } else {
                hab0.INSTANCE.m130127a(f5f0Var.f95177a.getPurchaseTrackId(), f5f0Var.f95177a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new sd60(act, purchaseType).m183473j(new ui0(act, f5f0Var.f95177a.getPurchaseTrackId()), f5f0Var);
        } else if (string.equals("wechat")) {
            new sd60(act, purchaseType).m183472H(new jfp0(act, f5f0Var.f95177a.getPurchaseTrackId()), f5f0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m183460k() {
        boolean zM162548a = o460.m162548a("com.eg.android.AlipayGphone");
        if (!zM162548a) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27298S9));
        }
        return zM162548a;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m183461l() {
        return o460.m162548a("com.eg.android.AlipayGphone");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m183462m() {
        boolean zM162548a = o460.m162548a("com.jingdong.app.mall");
        if (!zM162548a) {
            lsi0.m151595y("未安装京东");
        }
        return zM162548a;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m183463n() {
        return o460.m162548a("com.jingdong.app.mall");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m183464o() {
        return SystemClock.elapsedRealtime() - f163807f >= 3000;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m183465p() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f17544b, null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        if (iwxapiCreateWXAPI.isWXAppInstalled()) {
            return true;
        }
        lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27364Y9));
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m183466q() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f17544b, null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        return iwxapiCreateWXAPI.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: y */
    public static void m183467y(Act act, PayMethod payMethod, PurchaseType purchaseType, @NonNull l6b0 l6b0Var) {
        if (l6b0Var.f126250a == null) {
            jfd0.m141176a("PaymentParam is null !!!");
            return;
        }
        if (ura.m195053e().m195057d().mo33848ib()) {
            osi0.m165783g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                hab0.INSTANCE.m130133g(l6b0Var.f126250a.getPurchaseTrackId(), l6b0Var.f126250a.itemId, "user block");
            } else if (TEnum.equals(payMethod, "alipay")) {
                hab0.INSTANCE.m130127a(l6b0Var.f126250a.getPurchaseTrackId(), l6b0Var.f126250a.itemId, "user block");
                return;
            } else {
                hab0.INSTANCE.m130128b(l6b0Var.f126250a.getPurchaseTrackId(), l6b0Var.f126250a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        switch (string) {
            case "alipay":
                new sd60(act, purchaseType).m183481z(new ui0(act, l6b0Var.f126250a.getPurchaseTrackId()), l6b0Var);
                break;
            case "wechat":
                new sd60(act, purchaseType).m183481z(new jfp0(act, l6b0Var.f126250a.getPurchaseTrackId()), l6b0Var);
                break;
            case "jingdong":
                new sd60(act, purchaseType).m183481z(new kiq(act, l6b0Var.f126250a.getPurchaseTrackId()), l6b0Var);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m183468A(l6b0 l6b0Var) {
        if (this.f163811d == null) {
            jfd0.m141176a("retry is null !!!");
            return;
        }
        gh60 gh60Var = new gh60(this.f163808a, this.f163809b, new id60(this), l6b0Var);
        gh60Var.m126160n(l6b0Var.f126251b);
        this.f163810c = this.f163811d.call().subscribe((z3g0<? super PaymentApi.PaymentResultStatus>) gh60Var);
    }

    /* JADX INFO: renamed from: D */
    public void m183469D(gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f95177a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.m141176a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f163810c = gmlVar.mo127035b(signPaymentParam).map(new w9j() { // from class: l.nd60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f138266a.m183479w(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe((z3g0<? super R>) new l5f0(this.f163808a, this.f163809b, f5f0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m183470F(f5f0 f5f0Var) {
        if (this.f163812e == null) {
            jfd0.m141176a("retry is null !!!");
        } else {
            this.f163810c = this.f163812e.call().subscribe((z3g0<? super PaymentApi.SignResultStatus>) new l5f0(this.f163808a, this.f163809b, f5f0Var, true, new pd60(this)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m183471G() {
        if (NullChecker.m81303a(this.f163810c) && !this.f163810c.isUnsubscribed()) {
            this.f163810c.unsubscribe();
        }
        this.f163810c = null;
    }

    /* JADX INFO: renamed from: H */
    public void m183472H(gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f95177a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.m141176a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f163810c = gmlVar.mo127034a(signPaymentParam).map(new w9j() { // from class: l.od60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f143178a.m183480x(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe((z3g0<? super R>) new l5f0(this.f163808a, this.f163809b, f5f0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m183473j(final gml gmlVar, @NonNull final f5f0 f5f0Var) {
        final SignPaymentParam signPaymentParam = f5f0Var.f95177a;
        if (gmlVar == null || signPaymentParam == null) {
            jfd0.m141176a("Observable<IAgreement> or PaymentParam is null !!!");
            return;
        }
        l5f0 l5f0Var = new l5f0(this.f163808a, this.f163809b, f5f0Var, true, new pd60(this));
        v9j<C22306c<PaymentApi.SignResultStatus>> v9jVar = new v9j() { // from class: l.qd60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f153885a.m183476t(gmlVar, signPaymentParam, f5f0Var);
            }
        };
        this.f163812e = v9jVar;
        this.f163810c = v9jVar.call().subscribe((z3g0<? super PaymentApi.SignResultStatus>) l5f0Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m183474r() {
        this.f163808a.lifecycle().filter(new w9j() { // from class: l.kd60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ld60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127509a.m183477u((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ PaymentApi.SignResultStatus m183475s(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m96377L(this.f163809b, f5f0Var, "", true);
            if (b5g0.m100334a()) {
                ah60.m96375J(this.f163809b, signPaymentParam, f5f0Var.f95178b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C22306c m183476t(gml gmlVar, final SignPaymentParam signPaymentParam, final f5f0 f5f0Var) {
        return gmlVar.mo127034a(signPaymentParam).map(new w9j() { // from class: l.rd60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158873a.m183475s(f5f0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m183477u(C4319c c4319c) {
        m183471G();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C22306c m183478v(nzl nzlVar, l6b0 l6b0Var) {
        if (nzlVar instanceof ui0) {
            f163807f = SystemClock.elapsedRealtime();
        }
        PurchasePaymentParam purchasePaymentParam = l6b0Var.f126250a;
        Act act = this.f163808a;
        Objects.requireNonNull(act);
        return nzlVar.mo141208c(purchasePaymentParam, new md60(act));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ PaymentApi.SignResultStatus m183479w(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m96377L(this.f163809b, f5f0Var, "", false);
            if (b5g0.m100334a()) {
                ah60.m96375J(this.f163809b, signPaymentParam, f5f0Var.f95178b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentApi.SignResultStatus m183480x(f5f0 f5f0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            ah60.m96377L(this.f163809b, f5f0Var, "", false);
            if (b5g0.m100334a()) {
                ah60.m96375J(this.f163809b, signPaymentParam, f5f0Var.f95178b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: z */
    public void m183481z(final nzl nzlVar, final l6b0 l6b0Var) {
        gh60 gh60Var = new gh60(this.f163808a, this.f163809b, new id60(this), l6b0Var);
        gh60Var.m126160n(l6b0Var.f126251b);
        this.f163811d = new v9j() { // from class: l.jd60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f117368a.m183478v(nzlVar, l6b0Var);
            }
        };
        boolean z = l6b0Var.f126250a.useAutoDeduct;
        Act act = this.f163808a;
        if (z) {
            we60.m202856U(act);
        } else {
            act.progress(R$string.f27301T1);
        }
        this.f163811d.call().subscribe((z3g0<? super PaymentApi.PaymentResultStatus>) gh60Var);
    }
}
