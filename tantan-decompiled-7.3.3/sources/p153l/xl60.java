package p153l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.wxapi.WXPayEntryActivity;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class xl60 {

    /* JADX INFO: renamed from: f */
    public static long f194863f;

    /* JADX INFO: renamed from: a */
    public final Act f194864a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f194865b;

    /* JADX INFO: renamed from: c */
    public kcg0 f194866c;

    /* JADX INFO: renamed from: d */
    public pcj<C22421c<PaymentApi.PaymentResultStatus>> f194867d;

    /* JADX INFO: renamed from: e */
    public pcj<C22421c<PaymentApi.SignResultStatus>> f194868e;

    public xl60(Act act, PurchaseType purchaseType) {
        this.f194864a = act;
        this.f194865b = purchaseType;
        m211520r();
    }

    /* JADX INFO: renamed from: B */
    public static void m211494B(PurchaseType purchaseType) {
        if (wib0.m206562f(purchaseType)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else {
            CoreModule.f18264c.f20396j0.m31594J5();
            CoreModule.f18264c.f20297C0.m146425v4();
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        }
        CoreModule.f18264c.f20333O0.m31073C3();
    }

    /* JADX INFO: renamed from: C */
    public static void m211495C(Act act, PayMethod payMethod, mdf0 mdf0Var, PurchaseType purchaseType) {
        if (mdf0Var.f136376a == null) {
            mnd0.m159157a("PaymentParam is null !!!");
            return;
        }
        if (gta.m132210e().m132214d().mo34851ib()) {
            r1j0.m179420g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                lib0.INSTANCE.m154355g(mdf0Var.f136376a.getPurchaseTrackId(), mdf0Var.f136376a.itemId, "user block");
                return;
            } else {
                lib0.INSTANCE.m154349a(mdf0Var.f136376a.getPurchaseTrackId(), mdf0Var.f136376a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new xl60(act, purchaseType).m211515D(new qi0(act, mdf0Var.f136376a.getPurchaseTrackId()), mdf0Var);
        } else if (string.equals("wechat")) {
            new xl60(act, purchaseType).m211515D(new nop0(act, mdf0Var.f136376a.getPurchaseTrackId()), mdf0Var);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m211496E(Act act, PayMethod payMethod, mdf0 mdf0Var, PurchaseType purchaseType) {
        if (mdf0Var.f136376a == null) {
            mnd0.m159157a("PaymentParam is null !!!");
            return;
        }
        if (gta.m132210e().m132214d().mo34851ib()) {
            r1j0.m179420g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                lib0.INSTANCE.m154355g(mdf0Var.f136376a.getPurchaseTrackId(), mdf0Var.f136376a.itemId, "user block");
                return;
            } else {
                lib0.INSTANCE.m154349a(mdf0Var.f136376a.getPurchaseTrackId(), mdf0Var.f136376a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        if (string.equals("alipay")) {
            new xl60(act, purchaseType).m211519j(new qi0(act, mdf0Var.f136376a.getPurchaseTrackId()), mdf0Var);
        } else if (string.equals("wechat")) {
            new xl60(act, purchaseType).m211518H(new nop0(act, mdf0Var.f136376a.getPurchaseTrackId()), mdf0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m211506k() {
        boolean zM195378a = uc60.m195378a("com.eg.android.AlipayGphone");
        if (!zM195378a) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28146S9));
        }
        return zM195378a;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m211507l() {
        return uc60.m195378a("com.eg.android.AlipayGphone");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m211508m() {
        boolean zM195378a = uc60.m195378a("com.jingdong.app.mall");
        if (!zM195378a) {
            o1j0.m165651y("未安装京东");
        }
        return zM195378a;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m211509n() {
        return uc60.m195378a("com.jingdong.app.mall");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m211510o() {
        return SystemClock.elapsedRealtime() - f194863f >= 3000;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m211511p() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f18263b, null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        if (iwxapiCreateWXAPI.isWXAppInstalled()) {
            return true;
        }
        o1j0.m165651y(CoreModule.f18263b.getString(R$string.f28212Y9));
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m211512q() {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f18263b, null);
        iwxapiCreateWXAPI.registerApp(WXPayEntryActivity.APPID);
        return iwxapiCreateWXAPI.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: y */
    public static void m211513y(Act act, PayMethod payMethod, PurchaseType purchaseType, @NonNull peb0 peb0Var) {
        if (peb0Var.f151885a == null) {
            mnd0.m159157a("PaymentParam is null !!!");
            return;
        }
        if (gta.m132210e().m132214d().mo34851ib()) {
            r1j0.m179420g("账号已冻结，功能受限");
            if (TEnum.equals(payMethod, "wechat")) {
                lib0.INSTANCE.m154355g(peb0Var.f151885a.getPurchaseTrackId(), peb0Var.f151885a.itemId, "user block");
            } else if (TEnum.equals(payMethod, "alipay")) {
                lib0.INSTANCE.m154349a(peb0Var.f151885a.getPurchaseTrackId(), peb0Var.f151885a.itemId, "user block");
                return;
            } else {
                lib0.INSTANCE.m154350b(peb0Var.f151885a.getPurchaseTrackId(), peb0Var.f151885a.itemId, "user block");
                return;
            }
        }
        String string = payMethod.toString();
        string.getClass();
        switch (string) {
            case "alipay":
                new xl60(act, purchaseType).m211527z(new qi0(act, peb0Var.f151885a.getPurchaseTrackId()), peb0Var);
                break;
            case "wechat":
                new xl60(act, purchaseType).m211527z(new nop0(act, peb0Var.f151885a.getPurchaseTrackId()), peb0Var);
                break;
            case "jingdong":
                new xl60(act, purchaseType).m211527z(new kkq(act, peb0Var.f151885a.getPurchaseTrackId()), peb0Var);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m211514A(peb0 peb0Var) {
        if (this.f194867d == null) {
            mnd0.m159157a("retry is null !!!");
            return;
        }
        lp60 lp60Var = new lp60(this.f194864a, this.f194865b, new nl60(this), peb0Var);
        lp60Var.m155161n(peb0Var.f151886b);
        this.f194866c = this.f194867d.call().subscribe((gcg0<? super PaymentApi.PaymentResultStatus>) lp60Var);
    }

    /* JADX INFO: renamed from: D */
    public void m211515D(sol solVar, @NonNull final mdf0 mdf0Var) {
        final SignPaymentParam signPaymentParam = mdf0Var.f136376a;
        if (solVar == null || signPaymentParam == null) {
            mnd0.m159157a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f194866c = solVar.mo150323b(signPaymentParam).map(new qcj() { // from class: l.sl60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f169350a.m211525w(mdf0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe((gcg0<? super R>) new sdf0(this.f194864a, this.f194865b, mdf0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m211516F(mdf0 mdf0Var) {
        if (this.f194868e == null) {
            mnd0.m159157a("retry is null !!!");
        } else {
            this.f194866c = this.f194868e.call().subscribe((gcg0<? super PaymentApi.SignResultStatus>) new sdf0(this.f194864a, this.f194865b, mdf0Var, true, new ul60(this)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m211517G() {
        if (NullChecker.m82486a(this.f194866c) && !this.f194866c.isUnsubscribed()) {
            this.f194866c.unsubscribe();
        }
        this.f194866c = null;
    }

    /* JADX INFO: renamed from: H */
    public void m211518H(sol solVar, @NonNull final mdf0 mdf0Var) {
        final SignPaymentParam signPaymentParam = mdf0Var.f136376a;
        if (solVar == null || signPaymentParam == null) {
            mnd0.m159157a("Observable<IAgreement> or PaymentParam is null !!!");
        } else {
            this.f194866c = solVar.mo150322a(signPaymentParam).map(new qcj() { // from class: l.tl60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f174787a.m211526x(mdf0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
                }
            }).subscribe((gcg0<? super R>) new sdf0(this.f194864a, this.f194865b, mdf0Var, false, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m211519j(final sol solVar, @NonNull final mdf0 mdf0Var) {
        final SignPaymentParam signPaymentParam = mdf0Var.f136376a;
        if (solVar == null || signPaymentParam == null) {
            mnd0.m159157a("Observable<IAgreement> or PaymentParam is null !!!");
            return;
        }
        sdf0 sdf0Var = new sdf0(this.f194864a, this.f194865b, mdf0Var, true, new ul60(this));
        pcj<C22421c<PaymentApi.SignResultStatus>> pcjVar = new pcj() { // from class: l.vl60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184542a.m211522t(solVar, signPaymentParam, mdf0Var);
            }
        };
        this.f194868e = pcjVar;
        this.f194866c = pcjVar.call().subscribe((gcg0<? super PaymentApi.SignResultStatus>) sdf0Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m211520r() {
        this.f194864a.lifecycle().filter(new qcj() { // from class: l.pl60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ql60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158209a.m211523u((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ PaymentApi.SignResultStatus m211521s(mdf0 mdf0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            fp60.m126550L(this.f194865b, mdf0Var, "", true);
            if (jdg0.m144426a()) {
                fp60.m126548J(this.f194865b, signPaymentParam, mdf0Var.f136377b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C22421c m211522t(sol solVar, final SignPaymentParam signPaymentParam, final mdf0 mdf0Var) {
        return solVar.mo150322a(signPaymentParam).map(new qcj() { // from class: l.wl60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189655a.m211521s(mdf0Var, signPaymentParam, (PaymentApi.SignResultStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m211523u(C4470c c4470c) {
        m211517G();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C22421c m211524v(h2m h2mVar, peb0 peb0Var) {
        if (h2mVar instanceof qi0) {
            f194863f = SystemClock.elapsedRealtime();
        }
        PurchasePaymentParam purchasePaymentParam = peb0Var.f151885a;
        Act act = this.f194864a;
        Objects.requireNonNull(act);
        return h2mVar.mo133394c(purchasePaymentParam, new rl60(act));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ PaymentApi.SignResultStatus m211525w(mdf0 mdf0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            fp60.m126550L(this.f194865b, mdf0Var, "", false);
            if (jdg0.m144426a()) {
                fp60.m126548J(this.f194865b, signPaymentParam, mdf0Var.f136377b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentApi.SignResultStatus m211526x(mdf0 mdf0Var, SignPaymentParam signPaymentParam, PaymentApi.SignResultStatus signResultStatus) {
        if (signResultStatus != PaymentApi.SignResultStatus.failed) {
            fp60.m126550L(this.f194865b, mdf0Var, "", false);
            if (jdg0.m144426a()) {
                fp60.m126548J(this.f194865b, signPaymentParam, mdf0Var.f136377b, 5, "");
            }
        }
        return signResultStatus;
    }

    /* JADX INFO: renamed from: z */
    public void m211527z(final h2m h2mVar, final peb0 peb0Var) {
        lp60 lp60Var = new lp60(this.f194864a, this.f194865b, new nl60(this), peb0Var);
        lp60Var.m155161n(peb0Var.f151886b);
        this.f194867d = new pcj() { // from class: l.ol60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147812a.m211524v(h2mVar, peb0Var);
            }
        };
        boolean z = peb0Var.f151885a.useAutoDeduct;
        Act act = this.f194864a;
        if (z) {
            bn60.m105338U(act);
        } else {
            act.progress(R$string.f28149T1);
        }
        this.f194867d.call().subscribe((gcg0<? super PaymentApi.PaymentResultStatus>) lp60Var);
    }
}
