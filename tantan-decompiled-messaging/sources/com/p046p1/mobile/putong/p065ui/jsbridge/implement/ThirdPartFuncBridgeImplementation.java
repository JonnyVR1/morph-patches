package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.p065ui.ZhiMaAuthAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import java.net.UnknownHostException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.boq;
import p149l.bs5;
import p149l.c4g0;
import p149l.coq;
import p149l.d30;
import p149l.dgq0;
import p149l.e30;
import p149l.ef2;
import p149l.f30;
import p149l.f400;
import p149l.hfw;
import p149l.ipq;
import p149l.j760;
import p149l.liq;
import p149l.m250;
import p149l.mkd0;
import p149l.qib0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class ThirdPartFuncBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public Dialog f54563c;

    /* JADX INFO: renamed from: a */
    public bs5 f54561a = new bs5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public c4g0 f54562b = null;

    /* JADX INFO: renamed from: d */
    @Nullable
    public c4g0 f54564d = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$a */
    public class C13119a implements m250<AlipayAuthEnvelop> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f54565a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54566b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54567c;

        public C13119a(boq boqVar, String str, String str2) {
            this.f54565a = boqVar;
            this.f54566b = str;
            this.f54567c = str2;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m132487l(AlipayAuthEnvelop alipayAuthEnvelop) {
            int i = alipayAuthEnvelop.meta.code;
            if (i < 400 || i >= 500) {
                ThirdPartFuncBridgeImplementation.this.m79833u(this.f54565a, alipayAuthEnvelop.data.alipayCertificationRequest, this.f54567c, this.f54566b);
            } else {
                this.f54565a.mo102962d().mo127285b(this.f54566b, Integer.toString(alipayAuthEnvelop.meta.subCode));
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            boolean z = th instanceof TantanException.Client.CoreService;
            boq boqVar = this.f54565a;
            if (z) {
                boqVar.mo102962d().mo127285b(this.f54566b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            } else {
                boqVar.mo102962d().mo127285b(this.f54566b, "1000000");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ThirdPartFuncBridgeImplementation$b */
    public class C13120b implements m250<j760<Integer, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f30 f54569a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f54570b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f54571c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f54572d;

        public C13120b(f30 f30Var, String str, e30 e30Var, String str2) {
            this.f54569a = f30Var;
            this.f54570b = str;
            this.f54571c = e30Var;
            this.f54572d = str2;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m132487l(j760<Integer, String> j760Var) {
            if (NullChecker.m81303a(j760Var.f116564a) && j760Var.f116564a.intValue() == qib0.f154714c0.mo97511a3()) {
                this.f54571c.call(this.f54572d);
            } else {
                this.f54569a.call(this.f54570b, j760Var.f116565b);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (th instanceof UnknownHostException) {
                this.f54569a.call(this.f54570b, "1");
            } else if (th instanceof TantanException.Client.CoreService) {
                this.f54569a.call(this.f54570b, Integer.toString(((TantanException.Client.CoreService) th).subCode));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79815c(boq boqVar, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            boqVar.mo102962d().mo127284a(str);
            hfw.m130790a("[putong-common][zhimaauth]", "zhiMaAuth success in jsBridge");
        } else {
            boqVar.mo102962d().mo127285b(str2, new String[0]);
            hfw.m130790a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m79822j(dgq0.C16368b c16368b) {
        boolean z;
        if (c16368b.f86160c != null) {
            z = c16368b.f86159b == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79823k(boq boqVar, String str, Throwable th) {
        hfw.m130790a("[putong-common][zhimaauth]", "zhiMaAuth fail in jsBridge");
        if (!(th instanceof TantanException.Client.CoreService)) {
            boqVar.mo102962d().mo127285b(str, new String[0]);
        } else {
            boqVar.mo102962d().mo127285b(str, Integer.toString(((TantanException.Client.CoreService) th).subCode));
        }
    }

    @Override // p149l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo46528a() {
        try {
            if (NullChecker.m81303a(this.f54562b)) {
                this.f54562b.unsubscribe();
            }
            if (NullChecker.m81303a(this.f54563c)) {
                this.f54563c.dismiss();
            }
            this.f54561a.m103657c();
            super.mo46528a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(isMkBridge = true, key = "bindAlipay", nameSpace = "tantan_third_party")
    public void bindAlipay(@NonNull f400 f400Var, JSONObject jSONObject) {
        m79827o(f400Var, jSONObject.optString("success"), jSONObject.optString("fail"), jSONObject.optBoolean("skipLiveAlert"));
    }

    @liq(key = "bindZhimaAuth")
    public void bindZhimaAuth(@NonNull boq boqVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        if (!ipq.m137570f(boqVar.mo102961c())) {
            boqVar.mo102962d().mo127285b(str4, "1000001");
        } else {
            this.f54561a.m103655a(ipq.m137572h(str, str2).subscribe(mkd0.m154960L(new C13119a(boqVar, str4, str3))));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m79827o(@NonNull final coq coqVar, final String str, final String str2, final boolean z) {
        if (NullChecker.m81303a(this.f54562b)) {
            this.f54562b.unsubscribe();
        }
        this.f54562b = ipq.m137571g().subscribe(mkd0.m154955G(new e30() { // from class: l.kmi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123796a.m79829q(coqVar, z, str, str2, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m79831s(@NonNull final coq coqVar, boolean z, final String str, final String str2, final e30<String> e30Var, final f30<String, String> f30Var) {
        if (!ipq.m137570f(coqVar.mo102961c())) {
            f30Var.call(str2, "1000001");
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.umi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f177253a.m79830r(coqVar, f30Var, str2, e30Var, str);
            }
        };
        if (z) {
            runnable.run();
        } else {
            this.f54563c = coqVar.mo102961c().dialog().m20504F("绑定和开播认证身份姓名相同的支付宝账号才能成功提现").m20560v0("前往绑定", runnable).m20543m0("关闭").m20496B(true).m20568z0();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m79829q(final coq coqVar, boolean z, String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            m79832t(coqVar, z, str, str2, new e30() { // from class: l.qmi0
                @Override // p149l.e30
                public final void call(Object obj) {
                    coqVar.mo102962d().mo127284a((String) obj);
                }
            }, new f30() { // from class: l.rmi0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    coqVar.mo102962d().mo127285b((String) obj, (String) obj2);
                }
            });
        } else {
            m79831s(coqVar, z, str, str2, new e30() { // from class: l.smi0
                @Override // p149l.e30
                public final void call(Object obj) {
                    coqVar.mo102962d().mo127284a((String) obj);
                }
            }, new f30() { // from class: l.tmi0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    coqVar.mo102962d().mo127285b((String) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m79830r(coq coqVar, f30 f30Var, String str, e30 e30Var, String str2) {
        this.f54561a.m103655a(ipq.m137567c(coqVar.mo102961c()).subscribe(mkd0.m154960L(new C13120b(f30Var, str, e30Var, str2))));
    }

    /* JADX INFO: renamed from: t */
    public final void m79832t(@NonNull final coq coqVar, final boolean z, final String str, final String str2, final e30<String> e30Var, final f30<String, String> f30Var) {
        qib0.f154714c0.mo97514c2(coqVar.mo102961c(), new d30() { // from class: l.lmi0
            @Override // p149l.d30
            public final void call() {
                this.f128797a.m79831s(coqVar, z, str, str2, e30Var, f30Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m79833u(@NonNull final boq boqVar, String str, final String str2, final String str3) {
        mkd0.m154992z(this.f54564d);
        hfw.m130790a("[putong-common][zhimaauth]", "start zhiMaAuth in jsBridge");
        this.f54564d = boqVar.mo102961c().duringCreated((C22306c) dgq0.m111730a().filter(new w9j() { // from class: l.mmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ThirdPartFuncBridgeImplementation.m79822j((dgq0.C16368b) obj);
            }
        }).flatMap(new w9j() { // from class: l.nmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dgq0.m111731b(((dgq0.C16368b) obj).f86160c.getEncodedQuery());
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.omi0
            @Override // p149l.e30
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m79815c(boqVar, str2, str3, (Boolean) obj);
            }
        }, new e30() { // from class: l.pmi0
            @Override // p149l.e30
            public final void call(Object obj) {
                ThirdPartFuncBridgeImplementation.m79823k(boqVar, str3, (Throwable) obj);
            }
        }));
        boqVar.mo102961c().startActivity(ZhiMaAuthAct.m79413H1(boqVar.mo102961c(), str, "from_h5"));
    }

    @liq(key = "bindAlipay")
    public void bindAlipay(@NonNull boq boqVar, String str, String str2) {
        m79827o(boqVar, str, str2, false);
    }

    @liq(key = "bindAlipay")
    public void bindAlipay(@NonNull boq boqVar, String str, String str2, boolean z) {
        m79827o(boqVar, str, str2, z);
    }
}
