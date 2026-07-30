package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.p070ui.ZhiMaAuthAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import java.net.UnknownHostException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.aqq;
import p153l.bb50;
import p153l.bqq;
import p153l.fhw;
import p153l.ft5;
import p153l.ipq0;
import p153l.irq;
import p153l.kcg0;
import p153l.lf2;
import p153l.lkq;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.x20;
import p153l.xc00;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class ThirdPartFuncBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public Dialog f55411c;

    /* JADX INFO: renamed from: a */
    public ft5 f55409a = new ft5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public kcg0 f55410b = null;

    /* JADX INFO: renamed from: d */
    @Nullable
    public kcg0 f55412d = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$a */
    public class C13282a implements bb50<AlipayAuthEnvelop> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aqq f55413a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55414b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55415c;

        public C13282a(aqq aqqVar, String str, String str2) {
            this.f55413a = aqqVar;
            this.f55414b = str;
            this.f55415c = str2;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m137019l(AlipayAuthEnvelop alipayAuthEnvelop) {
            int i = alipayAuthEnvelop.meta.code;
            if (i < 400 || i >= 500) {
                ThirdPartFuncBridgeImplementation.this.m81016u(this.f55413a, alipayAuthEnvelop.data.alipayCertificationRequest, this.f55415c, this.f55414b);
            } else {
                this.f55413a.mo99544d().mo97004b(this.f55414b, Integer.toString(alipayAuthEnvelop.meta.subCode));
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            boolean z = th instanceof TantanException.Client.CoreService;
            aqq aqqVar = this.f55413a;
            if (z) {
                aqqVar.mo99544d().mo97004b(this.f55414b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            } else {
                aqqVar.mo99544d().mo97004b(this.f55414b, "1000000");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$b */
    public class C13283b implements bb50<pf60<Integer, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z20 f55417a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55418b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y20 f55419c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55420d;

        public C13283b(z20 z20Var, String str, y20 y20Var, String str2) {
            this.f55417a = z20Var;
            this.f55418b = str;
            this.f55419c = y20Var;
            this.f55420d = str2;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m137019l(pf60<Integer, String> pf60Var) {
            if (NullChecker.m82486a(pf60Var.f152156a) && pf60Var.f152156a.intValue() == uqb0.f180397c0.mo105300a3()) {
                this.f55419c.call(this.f55420d);
            } else {
                this.f55417a.call(this.f55418b, pf60Var.f152157b);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (th instanceof UnknownHostException) {
                this.f55417a.call(this.f55418b, "1");
            } else if (th instanceof TantanException.Client.CoreService) {
                this.f55417a.call(this.f55418b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80998c(aqq aqqVar, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            aqqVar.mo99544d().mo97003a(str);
            fhw.m125605a("[putong-common][zhimaauth]", "zhiMaAuth success in jsBridge");
        } else {
            aqqVar.mo99544d().mo97004b(str2, new String[0]);
            fhw.m125605a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m81005j(ipq0.C17768b c17768b) {
        boolean z;
        if (c17768b.f116300c != null) {
            z = c17768b.f116299b == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m81006k(aqq aqqVar, String str, Throwable th) {
        fhw.m125605a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        if (!(th instanceof TantanException.Client.CoreService)) {
            aqqVar.mo99544d().mo97004b(str, new String[0]);
        } else {
            aqqVar.mo99544d().mo97004b(str, Integer.toString(((TantanException.Client.CoreService) th).subCode));
        }
    }

    @Override // p153l.lf2
    /* JADX INFO: renamed from: a */
    public synchronized void mo47711a() {
        try {
            if (NullChecker.m82486a(this.f55410b)) {
                this.f55410b.unsubscribe();
            }
            if (NullChecker.m82486a(this.f55411c)) {
                this.f55411c.dismiss();
            }
            this.f55409a.m127299c();
            super.mo47711a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @lkq(isMkBridge = true, key = "bindAlipay", nameSpace = "tantan_third_party")
    public void bindAlipay(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m81010o(xc00Var, jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optBoolean("skipLiveAlert"));
    }

    @lkq(key = "bindZhimaAuth")
    public void bindZhimaAuth(@NonNull aqq aqqVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        if (!irq.m141845f(aqqVar.mo99543c())) {
            aqqVar.mo99544d().mo97004b(str4, "1000001");
        } else {
            this.f55409a.m127297a(irq.m141847h(str, str2).subscribe(psd0.m173601L(new C13282a(aqqVar, str4, str3))));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m81010o(@NonNull final bqq bqqVar, final String str, final String str2, final boolean z) {
        if (NullChecker.m82486a(this.f55410b)) {
            this.f55410b.unsubscribe();
        }
        this.f55410b = irq.m141846g().subscribe(psd0.m173596G(new y20() { // from class: l.lvi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133709a.m81012q(bqqVar, z, str, str2, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m81014s(@NonNull final bqq bqqVar, boolean z, final String str, final String str2, final y20<String> y20Var, final z20<String, String> z20Var) {
        if (!irq.m141845f(bqqVar.mo99543c())) {
            z20Var.call(str2, "1000001");
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.vvi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185933a.m81013r(bqqVar, z20Var, str2, y20Var, str);
            }
        };
        if (z) {
            runnable.run();
        } else {
            this.f55411c = bqqVar.mo99543c().dialog().m21503F("绑定和开播认证身份姓名相同的支付宝账号才能成功提现").m21559v0("前往绑定", runnable).m21542m0("关闭").m21495B(true).m21567z0();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m81012q(final bqq bqqVar, boolean z, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            m81015t(bqqVar, z, str, str2, new y20() { // from class: l.rvi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bqqVar.mo99544d().mo97003a((String) obj);
                }
            }, new z20() { // from class: l.svi0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    bqqVar.mo99544d().mo97004b((String) obj, (String) obj2);
                }
            });
        } else {
            m81014s(bqqVar, z, str, str2, new y20() { // from class: l.tvi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bqqVar.mo99544d().mo97003a((String) obj);
                }
            }, new z20() { // from class: l.uvi0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    bqqVar.mo99544d().mo97004b((String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m81013r(bqq bqqVar, z20 z20Var, String str, y20 y20Var, String str2) {
        this.f55409a.m127297a(irq.m141842c(bqqVar.mo99543c()).subscribe(psd0.m173601L(new C13283b(z20Var, str, y20Var, str2))));
    }

    /* JADX INFO: renamed from: t */
    public final void m81015t(@NonNull final bqq bqqVar, final boolean z, final String str, final String str2, final y20<String> y20Var, final z20<String, String> z20Var) {
        uqb0.f180397c0.mo105303c2(bqqVar.mo99543c(), new x20() { // from class: l.mvi0
            @Override // p153l.x20
            public final void call() {
                this.f138896a.m81014s(bqqVar, z, str, str2, y20Var, z20Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m81016u(@NonNull final aqq aqqVar, String str, final String str2, final String str3) {
        psd0.m173633z(this.f55412d);
        fhw.m125605a("[putong-common][zhimaauth]", "start zhiMaAuth in jsBridge");
        this.f55412d = aqqVar.mo99543c().duringCreated((C22421c) ipq0.m141535a().filter(new qcj() { // from class: l.nvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ThirdPartFuncBridgeImplementation.m81005j((ipq0.C17768b) obj);
            }
        }).flatMap(new qcj() { // from class: l.ovi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ipq0.m141536b(((ipq0.C17768b) obj).f116300c.getEncodedQuery());
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.pvi0
            @Override // p153l.y20
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m80998c(aqqVar, str2, str3, (Boolean) obj);
            }
        }, new y20() { // from class: l.qvi0
            @Override // p153l.y20
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m81006k(aqqVar, str3, (Throwable) obj);
            }
        }));
        aqqVar.mo99543c().startActivity(ZhiMaAuthAct.m80596I1(aqqVar.mo99543c(), str, "from_h5"));
    }

    @lkq(key = "bindAlipay")
    public void bindAlipay(@NonNull aqq aqqVar, String str, String str2) {
        m81010o(aqqVar, str, str2, false);
    }

    @lkq(key = "bindAlipay")
    public void bindAlipay(@NonNull aqq aqqVar, String str, String str2, boolean z) {
        m81010o(aqqVar, str, str2, z);
    }
}
