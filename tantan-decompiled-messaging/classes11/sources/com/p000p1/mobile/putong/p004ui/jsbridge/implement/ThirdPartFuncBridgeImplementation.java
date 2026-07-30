package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.ZhiMaAuthAct;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.tantanapp.common.utils.NullChecker;
import java.net.UnknownHostException;
import l.bs5;
import l.c4g0;
import l.d30;
import l.e30;
import l.f30;
import l.hfw;
import l.j760;
import l.m250;
import l.mkd0;
import l.qib0;
import l.w9j;
import org.json.JSONObject;
import p009l.boq;
import p009l.coq;
import p009l.dgq0;
import p009l.ef2;
import p009l.f400;
import p009l.ipq;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ThirdPartFuncBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public Dialog f8169c;

    /* JADX INFO: renamed from: a */
    public bs5 f8167a = new bs5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public c4g0 f8168b = null;

    /* JADX INFO: renamed from: d */
    @Nullable
    public c4g0 f8170d = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$a */
    public class C0521a implements m250<AlipayAuthEnvelop> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f8171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8172b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8173c;

        public C0521a(boq boqVar, String str, String str2) {
            this.f8171a = boqVar;
            this.f8172b = str;
            this.f8173c = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(AlipayAuthEnvelop alipayAuthEnvelop) {
            int i = alipayAuthEnvelop.meta.code;
            if (i < 400 || i >= 500) {
                ThirdPartFuncBridgeImplementation.this.m10156u(this.f8171a, alipayAuthEnvelop.data.alipayCertificationRequest, this.f8173c, this.f8172b);
            } else {
                this.f8171a.mo12185d().mo15130b(this.f8172b, Integer.toString(alipayAuthEnvelop.meta.subCode));
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
            boolean z = th instanceof TantanException.Client.CoreService;
            boq boqVar = this.f8171a;
            if (z) {
                boqVar.mo12185d().mo15130b(this.f8172b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            } else {
                boqVar.mo12185d().mo15130b(this.f8172b, "1000000");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$b */
    public class C0522b implements m250<j760<Integer, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f30 f8175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8176b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f8177c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f8178d;

        public C0522b(f30 f30Var, String str, e30 e30Var, String str2) {
            this.f8175a = f30Var;
            this.f8176b = str;
            this.f8177c = e30Var;
            this.f8178d = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(j760<Integer, String> j760Var) {
            if (NullChecker.a(j760Var.a) && ((Integer) j760Var.a).intValue() == qib0.c0.a3()) {
                this.f8177c.call(this.f8178d);
            } else {
                this.f8175a.call(this.f8176b, (String) j760Var.b);
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
            if (th instanceof UnknownHostException) {
                this.f8175a.call(this.f8176b, "1");
            } else if (th instanceof TantanException.Client.CoreService) {
                this.f8175a.call(this.f8176b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10138c(boq boqVar, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            boqVar.mo12185d().mo15129a(str);
            hfw.a("[putong-common][zhimaauth]", "zhiMaAuth success in jsBridge");
        } else {
            boqVar.mo12185d().mo15130b(str2, new String[0]);
            hfw.a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m10145j(dgq0.C0850b c0850b) {
        boolean z;
        if (c0850b.f11837c != null) {
            z = c0850b.f11836b == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m10146k(boq boqVar, String str, Throwable th) {
        hfw.a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        if (!(th instanceof TantanException.Client.CoreService)) {
            boqVar.mo12185d().mo15130b(str, new String[0]);
        } else {
            boqVar.mo12185d().mo15130b(str, Integer.toString(((TantanException.Client.CoreService) th).subCode));
        }
    }

    @Override // p009l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo10039a() {
        try {
            if (NullChecker.a(this.f8168b)) {
                this.f8168b.unsubscribe();
            }
            if (NullChecker.a(this.f8169c)) {
                this.f8169c.dismiss();
            }
            this.f8167a.c();
            super.mo10039a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(isMkBridge = true, key = "bindAlipay", nameSpace = "tantan_third_party")
    public void bindAlipay(@NonNull f400 f400Var, JSONObject jSONObject) {
        m10150o(f400Var, jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optBoolean("skipLiveAlert"));
    }

    @liq(key = "bindZhimaAuth")
    public void bindZhimaAuth(@NonNull boq boqVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        if (!ipq.m16690f(boqVar.mo12184c())) {
            boqVar.mo12185d().mo15130b(str4, "1000001");
        } else {
            this.f8167a.a(ipq.m16692h(str, str2).subscribe(mkd0.L(new C0521a(boqVar, str4, str3))));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10150o(@NonNull final coq coqVar, final String str, final String str2, final boolean z) {
        if (NullChecker.a(this.f8168b)) {
            this.f8168b.unsubscribe();
        }
        this.f8168b = ipq.m16691g().subscribe(mkd0.G(new e30() { // from class: l.kmi0
            public final void call(Object obj) {
                this.f15763a.m10152q(coqVar, z, str, str2, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m10154s(@NonNull final coq coqVar, boolean z, final String str, final String str2, final e30<String> e30Var, final f30<String, String> f30Var) {
        if (!ipq.m16690f(coqVar.mo12184c())) {
            f30Var.call(str2, "1000001");
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.umi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21246a.m10153r(coqVar, f30Var, str2, e30Var, str);
            }
        };
        if (z) {
            runnable.run();
        } else {
            this.f8169c = coqVar.mo12184c().dialog().F("绑定和开播认证身份姓名相同的支付宝账号才能成功提现").v0("前往绑定", runnable).m0("关闭").B(true).z0();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10152q(final coq coqVar, boolean z, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            m10155t(coqVar, z, str, str2, new e30() { // from class: l.qmi0
                public final void call(Object obj) {
                    coqVar.mo12185d().mo15129a((String) obj);
                }
            }, new f30() { // from class: l.rmi0
                public final void call(Object obj, Object obj2) {
                    coqVar.mo12185d().mo15130b((String) obj, (String) obj2);
                }
            });
        } else {
            m10154s(coqVar, z, str, str2, new e30() { // from class: l.smi0
                public final void call(Object obj) {
                    coqVar.mo12185d().mo15129a((String) obj);
                }
            }, new f30() { // from class: l.tmi0
                public final void call(Object obj, Object obj2) {
                    coqVar.mo12185d().mo15130b((String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10153r(coq coqVar, f30 f30Var, String str, e30 e30Var, String str2) {
        this.f8167a.a(ipq.m16687c(coqVar.mo12184c()).subscribe(mkd0.L(new C0522b(f30Var, str, e30Var, str2))));
    }

    /* JADX INFO: renamed from: t */
    public final void m10155t(@NonNull final coq coqVar, final boolean z, final String str, final String str2, final e30<String> e30Var, final f30<String, String> f30Var) {
        qib0.c0.c2(coqVar.mo12184c(), new d30() { // from class: l.lmi0
            public final void call() {
                this.f16256a.m10154s(coqVar, z, str, str2, e30Var, f30Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m10156u(@NonNull final boq boqVar, String str, final String str2, final String str3) {
        mkd0.z(this.f8170d);
        hfw.a("[putong-common][zhimaauth]", "start zhiMaAuth in jsBridge");
        this.f8170d = boqVar.mo12184c().duringCreated(dgq0.m13343a().filter(new w9j() { // from class: l.mmi0
            public final Object call(Object obj) {
                return ThirdPartFuncBridgeImplementation.m10145j((dgq0.C0850b) obj);
            }
        }).flatMap(new w9j() { // from class: l.nmi0
            public final Object call(Object obj) {
                return dgq0.m13344b(((dgq0.C0850b) obj).f11837c.getEncodedQuery());
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.omi0
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m10138c(boqVar, str2, str3, (Boolean) obj);
            }
        }, new e30() { // from class: l.pmi0
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m10146k(boqVar, str3, (Throwable) obj);
            }
        }));
        boqVar.mo12184c().startActivity(ZhiMaAuthAct.m9734H1(boqVar.mo12184c(), str, "from_h5"));
    }

    @liq(key = "bindAlipay")
    public void bindAlipay(@NonNull boq boqVar, String str, String str2) {
        m10150o(boqVar, str, str2, false);
    }

    @liq(key = "bindAlipay")
    public void bindAlipay(@NonNull boq boqVar, String str, String str2, boolean z) {
        m10150o(boqVar, str, str2, z);
    }
}
