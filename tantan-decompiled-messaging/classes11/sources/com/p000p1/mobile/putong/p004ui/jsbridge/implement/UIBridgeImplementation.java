package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.e51;
import l.e6c0;
import l.f16;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s4c0;
import l.t100;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.boq;
import p009l.coq;
import p009l.ef2;
import p009l.liq;
import p009l.zo40;
import rx.c;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UIBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public int f8180a = -1;

    /* JADX INFO: renamed from: b */
    public int f8181b = -1;

    /* JADX INFO: renamed from: c */
    public int f8182c = -1;

    /* JADX INFO: renamed from: d */
    public float f8183d = -1.0f;

    /* JADX INFO: renamed from: e */
    public c4g0 f8184e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a */
    public class RunnableC0523a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f8185a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f8186b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8187c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f8188d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC0523a.this.f8188d)) {
                    return;
                }
                RunnableC0523a.this.f8185a.mo12185d().mo15129a(RunnableC0523a.this.f8188d);
            }
        }

        public RunnableC0523a(coq coqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f8185a = coqVar;
            this.f8186b = vNavigationBar;
            this.f8187c = str;
            this.f8188d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8185a.mo12183b()) {
                return;
            }
            this.f8186b.setVisibility(0);
            this.f8186b.setTitle(this.f8187c);
            this.f8186b.getTitleContainer().setOnClickListener(new a());
            this.f8185a.mo12182a().setTag(s4c0.J0, new Object());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$b */
    public class RunnableC0524b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f8191a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f8192b;

        public RunnableC0524b(coq coqVar, VNavigationBar vNavigationBar) {
            this.f8191a = coqVar;
            this.f8192b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8191a.mo12183b()) {
                return;
            }
            this.f8192b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$c */
    public class ViewOnClickListenerC0525c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ coq f8195b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f8196c;

        public ViewOnClickListenerC0525c(String str, coq coqVar, boolean z) {
            this.f8194a = str;
            this.f8195b = coqVar;
            this.f8196c = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f8194a)) {
                this.f8195b.mo12185d().mo15129a(this.f8194a);
            }
            if (this.f8196c) {
                return;
            }
            this.f8195b.mo12184c().finish();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d */
    public class RunnableC0526d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f8198a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f8199b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8200c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f8201d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f8202e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC0526d.this.f8198a.mo12185d().mo15129a(RunnableC0526d.this.f8201d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ coq f8205a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f8206b;

            public b(coq coqVar, String str) {
                this.f8205a = coqVar;
                this.f8206b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f8205a.mo12185d().mo15129a(this.f8206b);
            }
        }

        public RunnableC0526d(coq coqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f8198a = coqVar;
            this.f8199b = vNavigationBar;
            this.f8200c = str;
            this.f8201d = str2;
            this.f8202e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m10184d(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!coqVar.mo12183b() && NullChecker.b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = t100.E;
                vNavigationBar.v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(coqVar, str));
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m10185e(final coq coqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            e51.M(new Runnable() { // from class: l.cgj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10578a.m10184d(coqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8198a.mo12183b()) {
                return;
            }
            this.f8199b.setVisibility(0);
            this.f8199b.B();
            if (!TextUtils.isEmpty(this.f8200c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f8198a.mo12184c()).inflate(e6c0.A, (ViewGroup) null);
                textView.setText(this.f8200c);
                textView.setTextColor(-16777216);
                final coq coqVar = this.f8198a;
                final String str = this.f8201d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.agj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        coqVar.mo12185d().mo15129a(str);
                    }
                });
                textView.setOnClickListener(new a());
                this.f8199b.z(new View[]{textView});
            }
            if (TextUtils.isEmpty(this.f8202e)) {
                return;
            }
            c cVarE = qib0.G.E(this.f8202e);
            final coq coqVar2 = this.f8198a;
            final VNavigationBar vNavigationBar = this.f8199b;
            final String str2 = this.f8201d;
            cVarE.subscribe(mkd0.G(new e30() { // from class: l.bgj0
                public final void call(Object obj) {
                    this.f10066a.m10185e(coqVar2, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$e */
    public interface InterfaceC0527e {
        /* JADX INFO: renamed from: g0 */
        void m10186g0(@Nullable String str, @Nullable String str2);

        /* JADX INFO: renamed from: x0 */
        void m10187x0();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$f */
    @FunctionalInterface
    public interface InterfaceC0528f {
        /* JADX INFO: renamed from: R */
        c<String> mo10188R(@Nullable String str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10161e(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!coqVar.mo12183b() && NullChecker.b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10164h(coq coqVar, VNavigationBar vNavigationBar) {
        if (coqVar.mo12183b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10166j(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, xdl0.F0()));
    }

    /* JADX INFO: renamed from: m */
    private VNavigationBar m10168m(@NonNull coq coqVar) {
        if (!(coqVar.mo12184c() instanceof WebViewAct) && !(coqVar.mo12184c() instanceof MkWebViewAct) && !(coqVar.mo12184c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (coqVar.mo12184c() instanceof WebViewAct) {
            return ((WebViewAct) coqVar.mo12184c()).findViewById(s4c0.Y);
        }
        if (coqVar.mo12184c() instanceof AccessTokenMkWebViewAct) {
            return ((AccessTokenMkWebViewAct) coqVar.mo12184c()).findViewById(s4c0.Y);
        }
        if (coqVar.mo12184c() instanceof MkWebViewAct) {
            return ((MkWebViewAct) coqVar.mo12184c()).findViewById(s4c0.Y);
        }
        return null;
    }

    @liq(key = "changeNotchBackgroundColor")
    public void changeNotchBackgroundColor(@NonNull boq boqVar, String str) {
        m10169l(boqVar.mo12184c(), str);
    }

    @liq(key = "changeWebviewBackgroundColor", uiThread = true)
    public void changeWebviewBackgroundColor(@NonNull boq boqVar, String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("transparent")) {
            return;
        }
        if (!str.contains("#")) {
            str = "#".concat(str);
        }
        try {
            boqVar.mo12182a().setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @liq(key = "getDeviceNotchInfo")
    public String getDeviceNotchInfo(@NonNull boq boqVar) {
        boolean zM25895h = zo40.m25895h(boqVar.mo12184c());
        int iM25888a = zo40.m25888a(boqVar.mo12184c());
        float f = f16.a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM25895h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM25888a / f);
            }
            jSONObject.put("statusBarHeight", xdl0.F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    @liq(key = "hideNavigation")
    public void hideNavigation(@NonNull boq boqVar, String str, String str2) {
        m10170n(boqVar, str, str2);
    }

    @liq(key = "hideNotch")
    public void hideNotch(@NonNull boq boqVar) {
        m10171o(boqVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m10169l(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.equalsIgnoreCase("transparent") && !str.contains("#")) {
            str = "#".concat(str);
        }
        e51.M(new Runnable() { // from class: l.ufj0
            @Override // java.lang.Runnable
            public final void run() {
                UIBridgeImplementation.m10166j(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m10170n(@NonNull final coq coqVar, String str, String str2) {
        final VNavigationBar vNavigationBarM10168m = m10168m(coqVar);
        if (vNavigationBarM10168m == null) {
            if (TextUtils.isEmpty(str2)) {
                coqVar.mo12185d().mo15129a(str2);
            }
        } else {
            e51.M(new Runnable() { // from class: l.rfj0
                @Override // java.lang.Runnable
                public final void run() {
                    UIBridgeImplementation.m10164h(coqVar, vNavigationBarM10168m);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10171o(@NonNull coq coqVar) {
        final PutongAct putongActMo12184c = coqVar.mo12184c();
        e51.M(new Runnable() { // from class: l.wfj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22090a.m10172p(putongActMo12184c);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10172p(Act act) {
        if (act == null) {
            return;
        }
        this.f8180a = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(67108864);
        this.f8181b = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f8182c = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.a(act.getSupportActionBar())) {
            this.f8183d = act.getSupportActionBar().j();
            act.getSupportActionBar().A(0.0f);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10174r(Act act) {
        if (act == null || this.f8181b == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f8181b);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f8180a);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f8182c);
        if (NullChecker.a(act.getSupportActionBar())) {
            act.getSupportActionBar().A(this.f8183d);
        }
    }

    @liq(key = "registerBarRight", uiThread = true)
    public void registerBarRight(@NonNull boq boqVar, @Nullable String str, @Nullable String str2) {
        if (boqVar.mo12184c() instanceof InterfaceC0527e) {
            boqVar.mo12184c().m10186g0(str, str2);
        }
    }

    @liq(key = "registerMenus", uiThread = true)
    public void registerMenus(@NonNull final boq boqVar, @Nullable String str, @Nullable final String str2) {
        if (boqVar.mo12184c() instanceof InterfaceC0528f) {
            InterfaceC0528f interfaceC0528fMo12184c = boqVar.mo12184c();
            mkd0.z(this.f8184e);
            this.f8184e = interfaceC0528fMo12184c.mo10188R(str).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.sfj0
                public final void call(Object obj) {
                    this.f20224a.m10173q(boqVar, str2, (String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m10173q(@NonNull boq boqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtpOnClickMenu";
        }
        boqVar.mo12185d().mo15130b(str2, str);
    }

    @liq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        m10176t(boqVar, str, str2, str3, str4, str5, false);
    }

    @liq(key = "setNavRightButton")
    public void setNavRightButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        m10177u(boqVar, str, str2, str3, str4, str5);
    }

    @liq(key = "setNavigation")
    public void setNavigation(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        m10178v(boqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, false);
    }

    @liq(key = "setNavigationTitle")
    public void setNavigationTitle(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        m10179w(boqVar, str, str2, str3, str4);
    }

    @liq(key = "setTitle", uiThread = true)
    public void setTitle(@NonNull boq boqVar, String str) {
        VNavigationBar vNavigationBarM10168m = m10168m(boqVar);
        if (vNavigationBarM10168m != null) {
            vNavigationBarM10168m.setTitle(str);
        }
    }

    @liq(key = "showDialog", uiThread = true)
    public void showDialog(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5, final String str6, boolean z) {
        boqVar.mo12184c().dialog().G0(str).F(str2).v0(str3, new Runnable() { // from class: l.xfj0
            @Override // java.lang.Runnable
            public final void run() {
                boqVar.mo12185d().mo15129a(str5);
            }
        }).n0(str4, new Runnable() { // from class: l.yfj0
            @Override // java.lang.Runnable
            public final void run() {
                boqVar.mo12185d().mo15129a(str6);
            }
        }).B(z).z0();
    }

    @liq(key = "showNotch")
    public void showNotch(@NonNull boq boqVar) {
        final PutongAct putongActMo12184c = boqVar.mo12184c();
        e51.M(new Runnable() { // from class: l.vfj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21562a.m10174r(putongActMo12184c);
            }
        });
    }

    @liq(key = "showToast")
    public void showToast(@NonNull boq boqVar, String str, int i) {
        m10180x(boqVar, str, i);
    }

    /* JADX INFO: renamed from: t */
    public void m10176t(@NonNull final coq coqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM10168m = m10168m(coqVar);
        if (vNavigationBarM10168m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str5);
            return;
        }
        e51.M(new RunnableC0524b(coqVar, vNavigationBarM10168m));
        if (!TextUtils.isEmpty(str)) {
            qib0.G.E(str).subscribe(mkd0.G(new e30() { // from class: l.tfj0
                public final void call(Object obj) {
                    e51.M(new Runnable() { // from class: l.zfj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UIBridgeImplementation.m10161e(coqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM10168m.setLeftIconOnClick(new ViewOnClickListenerC0525c(str3, coqVar, z));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        coqVar.mo12185d().mo15129a(str4);
    }

    /* JADX INFO: renamed from: u */
    public final void m10177u(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM10168m = m10168m(coqVar);
        if (vNavigationBarM10168m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str5);
        } else {
            e51.M(new RunnableC0526d(coqVar, vNavigationBarM10168m, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str4);
        }
    }

    @liq(key = "unRegisterBarRight", uiThread = true)
    public void unRegisterBarRight(@NonNull boq boqVar) {
        if (boqVar.mo12184c() instanceof InterfaceC0527e) {
            boqVar.mo12184c().m10187x0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10178v(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        if (m10168m(coqVar) == null) {
            if (TextUtils.isEmpty(str10)) {
                coqVar.mo12185d().mo15129a(str10);
            }
        } else {
            m10179w(coqVar, str, str2, "", "");
            m10176t(coqVar, str3, str4, str5, "", "", z);
            m10177u(coqVar, str6, str7, str8, "", "");
            if (TextUtils.isEmpty(str9)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str9);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10179w(@NonNull coq coqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM10168m = m10168m(coqVar);
        if (vNavigationBarM10168m == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str4);
        } else {
            e51.M(new RunnableC0523a(coqVar, vNavigationBarM10168m, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            coqVar.mo12185d().mo15129a(str3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m10180x(@NonNull coq coqVar, String str, int i) {
        lsi0.y(str);
    }

    @liq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        m10176t(boqVar, str, str2, str3, str4, str5, z);
    }

    @liq(key = "setNavigation")
    public void setNavigation(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        m10178v(boqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }
}
