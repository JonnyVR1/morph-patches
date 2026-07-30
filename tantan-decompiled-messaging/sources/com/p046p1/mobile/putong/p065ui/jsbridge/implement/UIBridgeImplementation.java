package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.navigationbar.VNavigationBar;
import p149l.boq;
import p149l.c4g0;
import p149l.coq;
import p149l.e30;
import p149l.e51;
import p149l.e6c0;
import p149l.ef2;
import p149l.f16;
import p149l.jo0;
import p149l.liq;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.s4c0;
import p149l.t100;
import p149l.xdl0;
import p149l.zo40;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class UIBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public int f54574a = -1;

    /* JADX INFO: renamed from: b */
    public int f54575b = -1;

    /* JADX INFO: renamed from: c */
    public int f54576c = -1;

    /* JADX INFO: renamed from: d */
    public float f54577d = -1.0f;

    /* JADX INFO: renamed from: e */
    public c4g0 f54578e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a */
    public class RunnableC13121a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f54579a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f54580b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54581c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f54582d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC13121a.this.f54582d)) {
                    return;
                }
                RunnableC13121a.this.f54579a.mo102962d().mo127284a(RunnableC13121a.this.f54582d);
            }
        }

        public RunnableC13121a(coq coqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f54579a = coqVar;
            this.f54580b = vNavigationBar;
            this.f54581c = str;
            this.f54582d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54579a.mo102960b()) {
                return;
            }
            this.f54580b.setVisibility(0);
            this.f54580b.setTitle(this.f54581c);
            this.f54580b.getTitleContainer().setOnClickListener(new a());
            this.f54579a.mo102959a().setTag(s4c0.f162302J0, new Object());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$b */
    public class RunnableC13122b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f54585a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f54586b;

        public RunnableC13122b(coq coqVar, VNavigationBar vNavigationBar) {
            this.f54585a = coqVar;
            this.f54586b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54585a.mo102960b()) {
                return;
            }
            this.f54586b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$c */
    public class ViewOnClickListenerC13123c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f54588a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ coq f54589b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f54590c;

        public ViewOnClickListenerC13123c(String str, coq coqVar, boolean z) {
            this.f54588a = str;
            this.f54589b = coqVar;
            this.f54590c = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f54588a)) {
                this.f54589b.mo102962d().mo127284a(this.f54588a);
            }
            if (this.f54590c) {
                return;
            }
            this.f54589b.mo102961c().m66873d2();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d */
    public class RunnableC13124d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f54592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f54593b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54594c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f54595d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f54596e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC13124d.this.f54592a.mo102962d().mo127284a(RunnableC13124d.this.f54595d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ coq f54599a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f54600b;

            public b(coq coqVar, String str) {
                this.f54599a = coqVar;
                this.f54600b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f54599a.mo102962d().mo127284a(this.f54600b);
            }
        }

        public RunnableC13124d(coq coqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f54592a = coqVar;
            this.f54593b = vNavigationBar;
            this.f54594c = str;
            this.f54595d = str2;
            this.f54596e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m79861d(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!coqVar.mo102960b() && NullChecker.m81304b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = t100.f167230E;
                vNavigationBar.m223587v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(coqVar, str));
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m79862e(final coq coqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            e51.m114748M(new Runnable() { // from class: l.cgj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80774a.m79861d(coqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54592a.mo102960b()) {
                return;
            }
            this.f54593b.setVisibility(0);
            this.f54593b.m223584B();
            if (!TextUtils.isEmpty(this.f54594c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f54592a.mo102961c()).inflate(e6c0.f89519A, (ViewGroup) null);
                textView.setText(this.f54594c);
                textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                final coq coqVar = this.f54592a;
                final String str = this.f54595d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.agj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        coqVar.mo102962d().mo127284a(str);
                    }
                });
                textView.setOnClickListener(new a());
                this.f54593b.m223589z(textView);
            }
            if (TextUtils.isEmpty(this.f54596e)) {
                return;
            }
            C22306c<Bitmap> c22306cM102316E = qib0.f154691G.m102316E(this.f54596e);
            final coq coqVar2 = this.f54592a;
            final VNavigationBar vNavigationBar = this.f54593b;
            final String str2 = this.f54595d;
            c22306cM102316E.subscribe(mkd0.m154955G(new e30() { // from class: l.bgj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75461a.m79862e(coqVar2, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$e */
    public interface InterfaceC13125e {
        /* JADX INFO: renamed from: g0 */
        void mo47329g0(@Nullable String str, @Nullable String str2);

        /* JADX INFO: renamed from: x0 */
        void mo47331x0();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$f */
    @FunctionalInterface
    public interface InterfaceC13126f {
        /* JADX INFO: renamed from: R */
        C22306c<String> mo79863R(@Nullable String str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79838e(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!coqVar.mo102960b() && NullChecker.m81304b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.f167230E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m79841h(coq coqVar, VNavigationBar vNavigationBar) {
        if (coqVar.mo102960b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m79843j(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, xdl0.m208331F0()));
    }

    /* JADX INFO: renamed from: m */
    private VNavigationBar m79845m(@NonNull coq coqVar) {
        if (!(coqVar.mo102961c() instanceof WebViewAct) && !(coqVar.mo102961c() instanceof MkWebViewAct) && !(coqVar.mo102961c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (coqVar.mo102961c() instanceof WebViewAct) {
            return (VNavigationBar) ((WebViewAct) coqVar.mo102961c()).findViewById(s4c0.f162321Y);
        }
        if (coqVar.mo102961c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) ((AccessTokenMkWebViewAct) coqVar.mo102961c()).findViewById(s4c0.f162321Y);
        }
        if (coqVar.mo102961c() instanceof MkWebViewAct) {
            return (VNavigationBar) ((MkWebViewAct) coqVar.mo102961c()).findViewById(s4c0.f162321Y);
        }
        return null;
    }

    @liq(key = "changeNotchBackgroundColor")
    public void changeNotchBackgroundColor(@NonNull boq boqVar, String str) {
        m79846l(boqVar.mo102961c(), str);
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
            boqVar.mo102959a().setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @liq(key = "getDeviceNotchInfo")
    public String getDeviceNotchInfo(@NonNull boq boqVar) {
        boolean zM219551h = zo40.m219551h(boqVar.mo102961c());
        int iM219544a = zo40.m219544a(boqVar.mo102961c());
        float f = f16.m119092a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM219551h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM219544a / f);
            }
            jSONObject.put("statusBarHeight", xdl0.m208331F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    @liq(key = "hideNavigation")
    public void hideNavigation(@NonNull boq boqVar, String str, String str2) {
        m79847n(boqVar, str, str2);
    }

    @liq(key = "hideNotch")
    public void hideNotch(@NonNull boq boqVar) {
        m79848o(boqVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m79846l(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.equalsIgnoreCase("transparent") && !str.contains("#")) {
            str = "#".concat(str);
        }
        e51.m114748M(new Runnable() { // from class: l.ufj0
            @Override // java.lang.Runnable
            public final void run() {
                UIBridgeImplementation.m79843j(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m79847n(@NonNull final coq coqVar, String str, String str2) {
        final VNavigationBar vNavigationBarM79845m = m79845m(coqVar);
        if (vNavigationBarM79845m == null) {
            if (TextUtils.isEmpty(str2)) {
                coqVar.mo102962d().mo127284a(str2);
            }
        } else {
            e51.m114748M(new Runnable() { // from class: l.rfj0
                @Override // java.lang.Runnable
                public final void run() {
                    UIBridgeImplementation.m79841h(coqVar, vNavigationBarM79845m);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m79848o(@NonNull coq coqVar) {
        final PutongAct putongActMo102961c = coqVar.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.wfj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186087a.m79849p(putongActMo102961c);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m79849p(Act act) {
        if (act == null) {
            return;
        }
        this.f54574a = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.f54575b = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f54576c = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.m81303a(act.getSupportActionBar())) {
            this.f54577d = act.getSupportActionBar().mo134123j();
            act.getSupportActionBar().mo134111A(0.0f);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m79851r(Act act) {
        if (act == null || this.f54575b == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f54575b);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f54574a);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f54576c);
        if (NullChecker.m81303a(act.getSupportActionBar())) {
            act.getSupportActionBar().mo134111A(this.f54577d);
        }
    }

    @liq(key = "registerBarRight", uiThread = true)
    public void registerBarRight(@NonNull boq boqVar, @Nullable String str, @Nullable String str2) {
        if (boqVar.mo102961c() instanceof InterfaceC13125e) {
            ((InterfaceC13125e) boqVar.mo102961c()).mo47329g0(str, str2);
        }
    }

    @liq(key = "registerMenus", uiThread = true)
    public void registerMenus(@NonNull final boq boqVar, @Nullable String str, @Nullable final String str2) {
        if (boqVar.mo102961c() instanceof InterfaceC13126f) {
            InterfaceC13126f interfaceC13126f = (InterfaceC13126f) boqVar.mo102961c();
            mkd0.m154992z(this.f54578e);
            this.f54578e = interfaceC13126f.mo79863R(str).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.sfj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164297a.m79850q(boqVar, str2, (String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m79850q(@NonNull boq boqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtpOnClickMenu";
        }
        boqVar.mo102962d().mo127285b(str2, str);
    }

    @liq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        m79853t(boqVar, str, str2, str3, str4, str5, false);
    }

    @liq(key = "setNavRightButton")
    public void setNavRightButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5) {
        m79854u(boqVar, str, str2, str3, str4, str5);
    }

    @liq(key = "setNavigation")
    public void setNavigation(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        m79855v(boqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, false);
    }

    @liq(key = "setNavigationTitle")
    public void setNavigationTitle(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        m79856w(boqVar, str, str2, str3, str4);
    }

    @liq(key = "setTitle", uiThread = true)
    public void setTitle(@NonNull boq boqVar, String str) {
        VNavigationBar vNavigationBarM79845m = m79845m(boqVar);
        if (vNavigationBarM79845m != null) {
            vNavigationBarM79845m.setTitle(str);
        }
    }

    @liq(key = "showDialog", uiThread = true)
    public void showDialog(@NonNull final boq boqVar, String str, String str2, String str3, String str4, final String str5, final String str6, boolean z) {
        boqVar.mo102961c().dialog().m20507G0(str).m20504F(str2).m20560v0(str3, new Runnable() { // from class: l.xfj0
            @Override // java.lang.Runnable
            public final void run() {
                boqVar.mo102962d().mo127284a(str5);
            }
        }).m20544n0(str4, new Runnable() { // from class: l.yfj0
            @Override // java.lang.Runnable
            public final void run() {
                boqVar.mo102962d().mo127284a(str6);
            }
        }).m20496B(z).m20568z0();
    }

    @liq(key = "showNotch")
    public void showNotch(@NonNull boq boqVar) {
        final PutongAct putongActMo102961c = boqVar.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.vfj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181280a.m79851r(putongActMo102961c);
            }
        });
    }

    @liq(key = "showToast")
    public void showToast(@NonNull boq boqVar, String str, int i) {
        m79857x(boqVar, str, i);
    }

    /* JADX INFO: renamed from: t */
    public void m79853t(@NonNull final coq coqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM79845m = m79845m(coqVar);
        if (vNavigationBarM79845m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str5);
            return;
        }
        e51.m114748M(new RunnableC13122b(coqVar, vNavigationBarM79845m));
        if (!TextUtils.isEmpty(str)) {
            qib0.f154691G.m102316E(str).subscribe(mkd0.m154955G(new e30() { // from class: l.tfj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e51.m114748M(new Runnable() { // from class: l.zfj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UIBridgeImplementation.m79838e(coqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM79845m.setLeftIconOnClick(new ViewOnClickListenerC13123c(str3, coqVar, z));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        coqVar.mo102962d().mo127284a(str4);
    }

    /* JADX INFO: renamed from: u */
    public final void m79854u(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM79845m = m79845m(coqVar);
        if (vNavigationBarM79845m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str5);
        } else {
            e51.m114748M(new RunnableC13124d(coqVar, vNavigationBarM79845m, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str4);
        }
    }

    @liq(key = "unRegisterBarRight", uiThread = true)
    public void unRegisterBarRight(@NonNull boq boqVar) {
        if (boqVar.mo102961c() instanceof InterfaceC13125e) {
            ((InterfaceC13125e) boqVar.mo102961c()).mo47331x0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m79855v(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        if (m79845m(coqVar) == null) {
            if (TextUtils.isEmpty(str10)) {
                coqVar.mo102962d().mo127284a(str10);
            }
        } else {
            m79856w(coqVar, str, str2, "", "");
            m79853t(coqVar, str3, str4, str5, "", "", z);
            m79854u(coqVar, str6, str7, str8, "", "");
            if (TextUtils.isEmpty(str9)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str9);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79856w(@NonNull coq coqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM79845m = m79845m(coqVar);
        if (vNavigationBarM79845m == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str4);
        } else {
            e51.m114748M(new RunnableC13121a(coqVar, vNavigationBarM79845m, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            coqVar.mo102962d().mo127284a(str3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m79857x(@NonNull coq coqVar, String str, int i) {
        lsi0.m151595y(str);
    }

    @liq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        m79853t(boqVar, str, str2, str3, str4, str5, z);
    }

    @liq(key = "setNavigation")
    public void setNavigation(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        m79855v(boqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }
}
