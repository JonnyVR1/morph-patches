package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ShareBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.boq;
import p149l.bpd0;
import p149l.coq;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.f30;
import p149l.f400;
import p149l.g30;
import p149l.k9j;
import p149l.liq;
import p149l.mkd0;
import p149l.zqx;

/* JADX INFO: loaded from: classes11.dex */
public class ShareBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ShareBridgeImplementation$a */
    public class C13118a implements f30<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f54558a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ coq f54559b;

        public C13118a(String str, coq coqVar) {
            this.f54558a = str;
            this.f54559b = coqVar;
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            this.f54559b.mo102962d().mo127285b(TextUtils.isEmpty(this.f54558a) ? "adtp" : this.f54558a, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79779d(String str, coq coqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        coqVar.mo102962d().mo127285b(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m79782g(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m79790o(String str, String str2, coq coqVar, String str3, String str4, Throwable th) {
        ShareHelper.m79961b0(ShareHelper.m79958Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo102962d().mo127285b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m79791p(String str, String str2, coq coqVar, String str3, String str4, Throwable th) {
        ShareHelper.m79961b0(ShareHelper.m79957X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo102962d().mo127285b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m79794B(final boq boqVar, final String str, String str2, String str3, String str4, String str5) {
        if (boqVar.mo102960b()) {
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m80016t0(new f30() { // from class: l.kse0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f124445a.m79793A(boqVar, str, (String) obj, (String) obj2);
            }
        }).m80021y0(boqVar.mo102961c(), str2, str3, ShareHelper.m79959Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: D */
    public void m79796D(@NonNull final coq coqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, final String str8) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m80016t0(new f30() { // from class: l.nse0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                ShareBridgeImplementation.m79779d(str5, coqVar, (String) obj, (String) obj2);
            }
        }).m80017u0(new g30() { // from class: l.ose0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m79790o(str8, str6, coqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m80018v0(coqVar.mo102961c(), null, str2, str3, ShareHelper.m79958Y(str8), false, str4);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m79805x(@NonNull coq coqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        coqVar.mo102962d().mo127285b(str3, str, str2);
    }

    /* JADX INFO: renamed from: F */
    public final void m79798F(@NonNull final coq coqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m80016t0(new C13118a(str6, coqVar)).m80017u0(new g30() { // from class: l.sse0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m79791p(str5, str7, coqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m80018v0(coqVar.mo102961c(), null, str2, str3, ShareHelper.m79957X(str5), false, str4);
    }

    @liq(key = "getShareChannel")
    public String getShareChannel(@NonNull boq boqVar) {
        return m79800s(boqVar);
    }

    @liq(key = "nativeShare", uiThread = true)
    public void nativeShare(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m79796D(boqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m79795C(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m80016t0(new f30() { // from class: l.gse0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f104172a.m79801t(boqVar, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m80021y0(boqVar.mo102961c(), str4, str3, ShareHelper.m79959Z(str), true, str2);
    }

    /* JADX INFO: renamed from: s */
    public final String m79800s(@NonNull coq coqVar) {
        List<String> listM79951R = ShareHelper.m79951R(coqVar.mo102961c());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<String> it = listM79951R.iterator();
        while (it.hasNext()) {
            sb.append("\"" + it.next() + "\",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    @liq(key = "share", uiThread = true)
    public void share(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5, final String str6) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m80016t0(new f30() { // from class: l.tse0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f171934a.m79802u(boqVar, str5, str6, (String) obj, (String) obj2);
            }
        }).m80018v0(boqVar.mo102961c(), null, str2, str3, ShareHelper.m79957X(str5), false, str4);
    }

    @liq(isMkBridge = true, key = "shareBase64ImageData", nameSpace = "tantan_share")
    public void shareBase64ImageData(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("platforms");
        final String strOptString2 = jSONObject.optString("base64Data");
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        final File fileM145083O = k9j.m145083O(".png");
        final String absolutePath = fileM145083O.getAbsolutePath();
        f400Var.mo102961c().duringCreated(C22306c.fromCallable(new Callable() { // from class: l.fse0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(bpd0.m103053a(strOptString2, fileM145083O));
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.lse0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129853a.m79806y(f400Var, strOptString5, strOptString4, strOptString3, strOptString, absolutePath, (Boolean) obj);
            }
        }, new e30() { // from class: l.mse0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135477a.m79807z(f400Var, strOptString5, (Throwable) obj);
            }
        }));
    }

    @liq(key = "shareImage", uiThread = true)
    public void shareImage(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        if (zqx.m219898k()) {
            m79795C(boqVar, str, str2, str3, str4, str5);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new d30() { // from class: l.pse0
                @Override // p149l.d30
                public final void call() {
                    this.f150996a.m79795C(boqVar, str, str2, str3, str4, str5);
                }
            }, new e30() { // from class: l.qse0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ShareBridgeImplementation.m79782g((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(boqVar.mo102961c());
        }
    }

    @liq(key = "systemShareDialog", uiThread = true)
    public void systemShareDialog(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        ShareHelper.m79949N(boqVar.mo102961c(), str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m79802u(boq boqVar, String str, String str2, String str3, String str4) {
        m79805x(boqVar, str, str4, str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m79803v(boq boqVar, String str) {
        if (boqVar.mo102960b()) {
            return;
        }
        m79805x(boqVar, null, "error", str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m79804w(String str, final boq boqVar, final String str2, final String str3, final String str4, final String str5) {
        File fileM145083O = k9j.m145083O(".png");
        final String absolutePath = fileM145083O.getAbsolutePath();
        if (bpd0.m103053a(str, fileM145083O)) {
            e51.m114748M(new Runnable() { // from class: l.hse0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109315a.m79794B(boqVar, str2, str3, str4, str5, absolutePath);
                }
            });
        } else {
            e51.m114748M(new Runnable() { // from class: l.ise0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114753a.m79803v(boqVar, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m79806y(final f400 f400Var, final String str, String str2, String str3, String str4, String str5, Boolean bool) {
        if (f400Var.mo102960b()) {
            return;
        }
        if (!bool.booleanValue()) {
            m79805x(f400Var, null, "error", str);
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m80016t0(new f30() { // from class: l.jse0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f119496a.m79805x(f400Var, str, (String) obj, (String) obj2);
            }
        }).m80021y0(f400Var.mo102961c(), str2, str3, ShareHelper.m79959Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m79807z(f400 f400Var, String str, Throwable th) {
        if (f400Var.mo102960b()) {
            return;
        }
        m79805x(f400Var, null, "error", str);
    }

    @liq(key = "share", uiThread = true)
    public void share(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m79798F(boqVar, str, str2, str3, str4, str5, str6, str7);
    }

    @liq(key = "shareImage")
    public void shareImage(@NonNull boq boqVar, String str, String str2) {
        shareImage(boqVar, str2, str, "", "", null);
    }

    @liq(key = "shareBase64ImageData")
    public void shareBase64ImageData(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        e51.m114774y(new Runnable() { // from class: l.rse0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160843a.m79804w(str2, boqVar, str5, str4, str3, str);
            }
        });
    }
}
