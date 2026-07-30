package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ShareBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p1.mobile.putong.data.Link;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.g30;
import l.k9j;
import l.mkd0;
import org.json.JSONObject;
import p009l.boq;
import p009l.bpd0;
import p009l.coq;
import p009l.ef2;
import p009l.f400;
import p009l.liq;
import p009l.zqx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShareBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ShareBridgeImplementation$a */
    public class C0520a implements f30<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8164a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ coq f8165b;

        public C0520a(String str, coq coqVar) {
            this.f8164a = str;
            this.f8165b = coqVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            this.f8165b.mo12185d().mo15130b(TextUtils.isEmpty(this.f8164a) ? "adtp" : this.f8164a, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10102d(String str, coq coqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        coqVar.mo12185d().mo15130b(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10105g(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m10113o(String str, String str2, coq coqVar, String str3, String str4, Throwable th) {
        ShareHelper.m10290b0(ShareHelper.m10287Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo12185d().mo15130b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m10114p(String str, String str2, coq coqVar, String str3, String str4, Throwable th) {
        ShareHelper.m10290b0(ShareHelper.m10286X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        coqVar.mo12185d().mo15130b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m10117B(final boq boqVar, final String str, String str2, String str3, String str4, String str5) {
        if (boqVar.mo12183b()) {
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m10345t0(new f30() { // from class: l.kse0
            public final void call(Object obj, Object obj2) {
                this.f15836a.m10116A(boqVar, str, (String) obj, (String) obj2);
            }
        }).m10350y0(boqVar.mo12184c(), str2, str3, ShareHelper.m10288Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: D */
    public void m10119D(@NonNull final coq coqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, final String str8) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m10345t0(new f30() { // from class: l.nse0
            public final void call(Object obj, Object obj2) {
                ShareBridgeImplementation.m10102d(str5, coqVar, (String) obj, (String) obj2);
            }
        }).m10346u0(new g30() { // from class: l.ose0
            /* JADX INFO: renamed from: a */
            public final void m20025a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m10113o(str8, str6, coqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m10347v0(coqVar.mo12184c(), null, str2, str3, ShareHelper.m10287Y(str8), false, str4);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m10128x(@NonNull coq coqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        coqVar.mo12185d().mo15130b(str3, str, str2);
    }

    /* JADX INFO: renamed from: F */
    public final void m10121F(@NonNull final coq coqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m10345t0(new C0520a(str6, coqVar)).m10346u0(new g30() { // from class: l.sse0
            /* JADX INFO: renamed from: a */
            public final void m22363a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m10114p(str5, str7, coqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m10347v0(coqVar.mo12184c(), null, str2, str3, ShareHelper.m10286X(str5), false, str4);
    }

    @liq(key = "getShareChannel")
    public String getShareChannel(@NonNull boq boqVar) {
        return m10123s(boqVar);
    }

    @liq(key = "nativeShare", uiThread = true)
    public void nativeShare(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m10119D(boqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m10118C(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m10345t0(new f30() { // from class: l.gse0
                public final void call(Object obj, Object obj2) {
                    this.f13712a.m10124t(boqVar, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m10350y0(boqVar.mo12184c(), str4, str3, ShareHelper.m10288Z(str), true, str2);
    }

    /* JADX INFO: renamed from: s */
    public final String m10123s(@NonNull coq coqVar) {
        List<String> listM10280R = ShareHelper.m10280R(coqVar.mo12184c());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<String> it = listM10280R.iterator();
        while (it.hasNext()) {
            sb.append("\"" + it.next() + "\",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    @liq(key = "share", uiThread = true)
    public void share(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5, final String str6) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m10345t0(new f30() { // from class: l.tse0
            public final void call(Object obj, Object obj2) {
                this.f20851a.m10125u(boqVar, str5, str6, (String) obj, (String) obj2);
            }
        }).m10347v0(boqVar.mo12184c(), null, str2, str3, ShareHelper.m10286X(str5), false, str4);
    }

    @liq(isMkBridge = true, key = "shareBase64ImageData", nameSpace = "tantan_share")
    public void shareBase64ImageData(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("platforms");
        final String strOptString2 = jSONObject.optString("base64Data");
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        final File fileO = k9j.O(".png");
        final String absolutePath = fileO.getAbsolutePath();
        f400Var.mo12184c().duringCreated(c.fromCallable(new Callable() { // from class: l.fse0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(bpd0.m12187a(strOptString2, fileO));
            }
        }).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.lse0
            public final void call(Object obj) {
                this.f16392a.m10129y(f400Var, strOptString5, strOptString4, strOptString3, strOptString, absolutePath, (Boolean) obj);
            }
        }, new e30() { // from class: l.mse0
            public final void call(Object obj) {
                this.f17070a.m10130z(f400Var, strOptString5, (Throwable) obj);
            }
        }));
    }

    @liq(key = "shareImage", uiThread = true)
    public void shareImage(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        if (zqx.m25938k()) {
            m10118C(boqVar, str, str2, str3, str4, str5);
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new d30() { // from class: l.pse0
                public final void call() {
                    this.f18880a.m10118C(boqVar, str, str2, str3, str4, str5);
                }
            }, new e30() { // from class: l.qse0
                public final void call(Object obj) {
                    ShareBridgeImplementation.m10105g((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m10220i(boqVar.mo12184c());
        }
    }

    @liq(key = "systemShareDialog", uiThread = true)
    public void systemShareDialog(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        ShareHelper.m10278N(boqVar.mo12184c(), str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10125u(boq boqVar, String str, String str2, String str3, String str4) {
        m10128x(boqVar, str, str4, str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m10126v(boq boqVar, String str) {
        if (boqVar.mo12183b()) {
            return;
        }
        m10128x(boqVar, null, "error", str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m10127w(String str, final boq boqVar, final String str2, final String str3, final String str4, final String str5) {
        File fileO = k9j.O(".png");
        final String absolutePath = fileO.getAbsolutePath();
        if (bpd0.m12187a(str, fileO)) {
            e51.M(new Runnable() { // from class: l.hse0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14233a.m10117B(boqVar, str2, str3, str4, str5, absolutePath);
                }
            });
        } else {
            e51.M(new Runnable() { // from class: l.ise0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14785a.m10126v(boqVar, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m10129y(final f400 f400Var, final String str, String str2, String str3, String str4, String str5, Boolean bool) {
        if (f400Var.mo12183b()) {
            return;
        }
        if (!bool.booleanValue()) {
            m10128x(f400Var, null, "error", str);
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m10345t0(new f30() { // from class: l.jse0
            public final void call(Object obj, Object obj2) {
                this.f15272a.m10128x(f400Var, str, (String) obj, (String) obj2);
            }
        }).m10350y0(f400Var.mo12184c(), str2, str3, ShareHelper.m10288Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m10130z(f400 f400Var, String str, Throwable th) {
        if (f400Var.mo12183b()) {
            return;
        }
        m10128x(f400Var, null, "error", str);
    }

    @liq(key = "share", uiThread = true)
    public void share(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m10121F(boqVar, str, str2, str3, str4, str5, str6, str7);
    }

    @liq(key = "shareImage")
    public void shareImage(@NonNull boq boqVar, String str, String str2) {
        shareImage(boqVar, str2, str, "", "", null);
    }

    @liq(key = "shareBase64ImageData")
    public void shareBase64ImageData(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        e51.y(new Runnable() { // from class: l.rse0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19961a.m10127w(str2, boqVar, str5, str4, str3, str);
            }
        });
    }
}
