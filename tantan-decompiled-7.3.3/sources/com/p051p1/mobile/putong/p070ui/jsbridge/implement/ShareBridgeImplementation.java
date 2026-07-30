package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ShareBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.a30;
import p153l.aqq;
import p153l.bqq;
import p153l.dxd0;
import p153l.ecj;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.psd0;
import p153l.wzx;
import p153l.x20;
import p153l.xc00;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class ShareBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.ShareBridgeImplementation$a */
    public class C13281a implements z20<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f55406a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bqq f55407b;

        public C13281a(String str, bqq bqqVar) {
            this.f55406a = str;
            this.f55407b = bqqVar;
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            this.f55407b.mo99544d().mo97004b(TextUtils.isEmpty(this.f55406a) ? "adtp" : this.f55406a, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80962d(String str, bqq bqqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        bqqVar.mo99544d().mo97004b(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m80965g(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m80973o(String str, String str2, bqq bqqVar, String str3, String str4, Throwable th) {
        ShareHelper.m81144b0(ShareHelper.m81141Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        bqqVar.mo99544d().mo97004b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m80974p(String str, String str2, bqq bqqVar, String str3, String str4, Throwable th) {
        ShareHelper.m81144b0(ShareHelper.m81140X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        bqqVar.mo99544d().mo97004b(str2, str3, str4);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m80977B(final aqq aqqVar, final String str, String str2, String str3, String str4, String str5) {
        if (aqqVar.mo99542b()) {
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m81199t0(new z20() { // from class: l.r0f0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f160627a.m80976A(aqqVar, str, (String) obj, (String) obj2);
            }
        }).m81204y0(aqqVar.mo99543c(), str2, str3, ShareHelper.m81142Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: D */
    public void m80979D(@NonNull final bqq bqqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, final String str8) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m81199t0(new z20() { // from class: l.u0f0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                ShareBridgeImplementation.m80962d(str5, bqqVar, (String) obj, (String) obj2);
            }
        }).m81200u0(new a30() { // from class: l.v0f0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m80973o(str8, str6, bqqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m81201v0(bqqVar.mo99543c(), null, str2, str3, ShareHelper.m81141Y(str8), false, str4);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m80988x(@NonNull bqq bqqVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        bqqVar.mo99544d().mo97004b(str3, str, str2);
    }

    /* JADX INFO: renamed from: F */
    public final void m80981F(@NonNull final bqq bqqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m81199t0(new C13281a(str6, bqqVar)).m81200u0(new a30() { // from class: l.z0f0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                ShareBridgeImplementation.m80974p(str5, str7, bqqVar, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m81201v0(bqqVar.mo99543c(), null, str2, str3, ShareHelper.m81140X(str5), false, str4);
    }

    @lkq(key = "getShareChannel")
    public String getShareChannel(@NonNull aqq aqqVar) {
        return m80983s(aqqVar);
    }

    @lkq(key = "nativeShare", uiThread = true)
    public void nativeShare(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m80979D(aqqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m80978C(@NonNull final aqq aqqVar, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m81199t0(new z20() { // from class: l.n0f0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f139623a.m80984t(aqqVar, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m81204y0(aqqVar.mo99543c(), str4, str3, ShareHelper.m81142Z(str), true, str2);
    }

    /* JADX INFO: renamed from: s */
    public final String m80983s(@NonNull bqq bqqVar) {
        List<String> listM81134R = ShareHelper.m81134R(bqqVar.mo99543c());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<String> it = listM81134R.iterator();
        while (it.hasNext()) {
            sb.append("\"" + it.next() + "\",");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setLength(sb.length() - 1);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    @lkq(key = "share", uiThread = true)
    public void share(@NonNull final aqq aqqVar, String str, String str2, String str3, String str4, final String str5, final String str6) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m81199t0(new z20() { // from class: l.a1f0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f67808a.m80985u(aqqVar, str5, str6, (String) obj, (String) obj2);
            }
        }).m81201v0(aqqVar.mo99543c(), null, str2, str3, ShareHelper.m81140X(str5), false, str4);
    }

    @lkq(isMkBridge = true, key = "shareBase64ImageData", nameSpace = "tantan_share")
    public void shareBase64ImageData(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("platforms");
        final String strOptString2 = jSONObject.optString("base64Data");
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        final File fileM120381O = ecj.m120381O(".png");
        final String absolutePath = fileM120381O.getAbsolutePath();
        xc00Var.mo99543c().duringCreated(C22421c.fromCallable(new Callable() { // from class: l.m0f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dxd0.m118465a(strOptString2, fileM120381O));
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.s0f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165682a.m80989y(xc00Var, strOptString5, strOptString4, strOptString3, strOptString, absolutePath, (Boolean) obj);
            }
        }, new y20() { // from class: l.t0f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171500a.m80990z(xc00Var, strOptString5, (Throwable) obj);
            }
        }));
    }

    @lkq(key = "shareImage", uiThread = true)
    public void shareImage(@NonNull final aqq aqqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        if (wzx.m208784k()) {
            m80978C(aqqVar, str, str2, str3, str4, str5);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new x20() { // from class: l.w0f0
                @Override // p153l.x20
                public final void call() {
                    this.f186572a.m80978C(aqqVar, str, str2, str3, str4, str5);
                }
            }, new y20() { // from class: l.x0f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ShareBridgeImplementation.m80965g((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(aqqVar.mo99543c());
        }
    }

    @lkq(key = "systemShareDialog", uiThread = true)
    public void systemShareDialog(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5) {
        ShareHelper.m81132N(aqqVar.mo99543c(), str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m80985u(aqq aqqVar, String str, String str2, String str3, String str4) {
        m80988x(aqqVar, str, str4, str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m80986v(aqq aqqVar, String str) {
        if (aqqVar.mo99542b()) {
            return;
        }
        m80988x(aqqVar, null, "error", str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m80987w(String str, final aqq aqqVar, final String str2, final String str3, final String str4, final String str5) {
        File fileM120381O = ecj.m120381O(".png");
        final String absolutePath = fileM120381O.getAbsolutePath();
        if (dxd0.m118465a(str, fileM120381O)) {
            l51.m152893M(new Runnable() { // from class: l.o0f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144539a.m80977B(aqqVar, str2, str3, str4, str5, absolutePath);
                }
            });
        } else {
            l51.m152893M(new Runnable() { // from class: l.p0f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150045a.m80986v(aqqVar, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80989y(final xc00 xc00Var, final String str, String str2, String str3, String str4, String str5, Boolean bool) {
        if (xc00Var.mo99542b()) {
            return;
        }
        if (!bool.booleanValue()) {
            m80988x(xc00Var, null, "error", str);
            return;
        }
        Link link = new Link();
        link.href = "";
        new ShareHelper(link).m81199t0(new z20() { // from class: l.q0f0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f155048a.m80988x(xc00Var, str, (String) obj, (String) obj2);
            }
        }).m81204y0(xc00Var.mo99543c(), str2, str3, ShareHelper.m81142Z(str4), true, str5);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80990z(xc00 xc00Var, String str, Throwable th) {
        if (xc00Var.mo99542b()) {
            return;
        }
        m80988x(xc00Var, null, "error", str);
    }

    @lkq(key = "share", uiThread = true)
    public void share(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m80981F(aqqVar, str, str2, str3, str4, str5, str6, str7);
    }

    @lkq(key = "shareImage")
    public void shareImage(@NonNull aqq aqqVar, String str, String str2) {
        shareImage(aqqVar, str2, str, "", "", null);
    }

    @lkq(key = "shareBase64ImageData")
    public void shareBase64ImageData(@NonNull final aqq aqqVar, final String str, final String str2, final String str3, final String str4, final String str5) {
        l51.m152919y(new Runnable() { // from class: l.y0f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196963a.m80987w(str2, aqqVar, str5, str4, str3, str);
            }
        });
    }
}
