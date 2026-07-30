package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.navigationbar.VNavigationBar;
import p153l.aqq;
import p153l.bnl0;
import p153l.bqq;
import p153l.fo0;
import p153l.jec0;
import p153l.k26;
import p153l.kcg0;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.nx40;
import p153l.o1j0;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.ycc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
public class UIBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public int f55422a = -1;

    /* JADX INFO: renamed from: b */
    public int f55423b = -1;

    /* JADX INFO: renamed from: c */
    public int f55424c = -1;

    /* JADX INFO: renamed from: d */
    public float f55425d = -1.0f;

    /* JADX INFO: renamed from: e */
    public kcg0 f55426e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a */
    public class RunnableC13284a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f55427a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f55428b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55429c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55430d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC13284a.this.f55430d)) {
                    return;
                }
                RunnableC13284a.this.f55427a.mo99544d().mo97003a(RunnableC13284a.this.f55430d);
            }
        }

        public RunnableC13284a(bqq bqqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f55427a = bqqVar;
            this.f55428b = vNavigationBar;
            this.f55429c = str;
            this.f55430d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55427a.mo99542b()) {
                return;
            }
            this.f55428b.setVisibility(0);
            this.f55428b.setTitle(this.f55429c);
            this.f55428b.getTitleContainer().setOnClickListener(new a());
            this.f55427a.mo99541a().setTag(ycc0.f198423J0, new Object());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$b */
    public class RunnableC13285b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f55433a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f55434b;

        public RunnableC13285b(bqq bqqVar, VNavigationBar vNavigationBar) {
            this.f55433a = bqqVar;
            this.f55434b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55433a.mo99542b()) {
                return;
            }
            this.f55434b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$c */
    public class ViewOnClickListenerC13286c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f55436a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bqq f55437b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f55438c;

        public ViewOnClickListenerC13286c(String str, bqq bqqVar, boolean z) {
            this.f55436a = str;
            this.f55437b = bqqVar;
            this.f55438c = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f55436a)) {
                this.f55437b.mo99544d().mo97003a(this.f55436a);
            }
            if (this.f55438c) {
                return;
            }
            this.f55437b.mo99543c().m68056e2();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d */
    public class RunnableC13287d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f55440a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f55441b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55442c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55443d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f55444e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC13287d.this.f55440a.mo99544d().mo97003a(RunnableC13287d.this.f55443d);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$d$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ bqq f55447a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f55448b;

            public b(bqq bqqVar, String str) {
                this.f55447a = bqqVar;
                this.f55448b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f55447a.mo99544d().mo97003a(this.f55448b);
            }
        }

        public RunnableC13287d(bqq bqqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f55440a = bqqVar;
            this.f55441b = vNavigationBar;
            this.f55442c = str;
            this.f55443d = str2;
            this.f55444e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m81044d(bqq bqqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!bqqVar.mo99542b() && NullChecker.m82487b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = qa00.f156292E;
                vNavigationBar.m224833v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(bqqVar, str));
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m81045e(final bqq bqqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            l51.m152893M(new Runnable() { // from class: l.fpj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100195a.m81044d(bqqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55440a.mo99542b()) {
                return;
            }
            this.f55441b.setVisibility(0);
            this.f55441b.m224830B();
            if (!TextUtils.isEmpty(this.f55442c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f55440a.mo99543c()).inflate(jec0.f120432A, (ViewGroup) null);
                textView.setText(this.f55442c);
                textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                final bqq bqqVar = this.f55440a;
                final String str = this.f55443d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.dpj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bqqVar.mo99544d().mo97003a(str);
                    }
                });
                textView.setOnClickListener(new a());
                this.f55441b.m224835z(textView);
            }
            if (TextUtils.isEmpty(this.f55444e)) {
                return;
            }
            C22421c<Bitmap> c22421cM127100E = uqb0.f180374G.m127100E(this.f55444e);
            final bqq bqqVar2 = this.f55440a;
            final VNavigationBar vNavigationBar = this.f55441b;
            final String str2 = this.f55443d;
            c22421cM127100E.subscribe(psd0.m173596G(new y20() { // from class: l.epj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f95253a.m81045e(bqqVar2, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$e */
    public interface InterfaceC13288e {
        /* JADX INFO: renamed from: h0 */
        void mo48512h0(@Nullable String str, @Nullable String str2);

        /* JADX INFO: renamed from: y0 */
        void mo48514y0();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation$f */
    @FunctionalInterface
    public interface InterfaceC13289f {
        /* JADX INFO: renamed from: S */
        C22421c<String> mo81046S(@Nullable String str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m81021e(bqq bqqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!bqqVar.mo99542b() && NullChecker.m82487b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = qa00.f156292E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m81024h(bqq bqqVar, VNavigationBar vNavigationBar) {
        if (bqqVar.mo99542b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m81026j(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, bnl0.m105511F0()));
    }

    /* JADX INFO: renamed from: m */
    private VNavigationBar m81028m(@NonNull bqq bqqVar) {
        if (!(bqqVar.mo99543c() instanceof WebViewAct) && !(bqqVar.mo99543c() instanceof MkWebViewAct) && !(bqqVar.mo99543c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (bqqVar.mo99543c() instanceof WebViewAct) {
            return (VNavigationBar) ((WebViewAct) bqqVar.mo99543c()).findViewById(ycc0.f198442Y);
        }
        if (bqqVar.mo99543c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) ((AccessTokenMkWebViewAct) bqqVar.mo99543c()).findViewById(ycc0.f198442Y);
        }
        if (bqqVar.mo99543c() instanceof MkWebViewAct) {
            return (VNavigationBar) ((MkWebViewAct) bqqVar.mo99543c()).findViewById(ycc0.f198442Y);
        }
        return null;
    }

    @lkq(key = "changeNotchBackgroundColor")
    public void changeNotchBackgroundColor(@NonNull aqq aqqVar, String str) {
        m81029l(aqqVar.mo99543c(), str);
    }

    @lkq(key = "changeWebviewBackgroundColor", uiThread = true)
    public void changeWebviewBackgroundColor(@NonNull aqq aqqVar, String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("transparent")) {
            return;
        }
        if (!str.contains("#")) {
            str = "#".concat(str);
        }
        try {
            aqqVar.mo99541a().setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
        }
    }

    @lkq(key = "getDeviceNotchInfo")
    public String getDeviceNotchInfo(@NonNull aqq aqqVar) {
        boolean zM165092h = nx40.m165092h(aqqVar.mo99543c());
        int iM165085a = nx40.m165085a(aqqVar.mo99543c());
        float f = k26.m147943a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM165092h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM165085a / f);
            }
            jSONObject.put("statusBarHeight", bnl0.m105511F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    @lkq(key = "hideNavigation")
    public void hideNavigation(@NonNull aqq aqqVar, String str, String str2) {
        m81030n(aqqVar, str, str2);
    }

    @lkq(key = "hideNotch")
    public void hideNotch(@NonNull aqq aqqVar) {
        m81031o(aqqVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m81029l(final Act act, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.equalsIgnoreCase("transparent") && !str.contains("#")) {
            str = "#".concat(str);
        }
        l51.m152893M(new Runnable() { // from class: l.xoj0
            @Override // java.lang.Runnable
            public final void run() {
                UIBridgeImplementation.m81026j(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m81030n(@NonNull final bqq bqqVar, String str, String str2) {
        final VNavigationBar vNavigationBarM81028m = m81028m(bqqVar);
        if (vNavigationBarM81028m == null) {
            if (TextUtils.isEmpty(str2)) {
                bqqVar.mo99544d().mo97003a(str2);
            }
        } else {
            l51.m152893M(new Runnable() { // from class: l.uoj0
                @Override // java.lang.Runnable
                public final void run() {
                    UIBridgeImplementation.m81024h(bqqVar, vNavigationBarM81028m);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m81031o(@NonNull bqq bqqVar) {
        final PutongAct putongActMo99543c = bqqVar.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.zoj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f205355a.m81032p(putongActMo99543c);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m81032p(Act act) {
        if (act == null) {
            return;
        }
        this.f55422a = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.f55423b = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f55424c = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.m82486a(act.getSupportActionBar())) {
            this.f55425d = act.getSupportActionBar().mo102183j();
            act.getSupportActionBar().mo102168A(0.0f);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m81034r(Act act) {
        if (act == null || this.f55423b == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f55423b);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f55422a);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f55424c);
        if (NullChecker.m82486a(act.getSupportActionBar())) {
            act.getSupportActionBar().mo102168A(this.f55425d);
        }
    }

    @lkq(key = "registerBarRight", uiThread = true)
    public void registerBarRight(@NonNull aqq aqqVar, @Nullable String str, @Nullable String str2) {
        if (aqqVar.mo99543c() instanceof InterfaceC13288e) {
            ((InterfaceC13288e) aqqVar.mo99543c()).mo48512h0(str, str2);
        }
    }

    @lkq(key = "registerMenus", uiThread = true)
    public void registerMenus(@NonNull final aqq aqqVar, @Nullable String str, @Nullable final String str2) {
        if (aqqVar.mo99543c() instanceof InterfaceC13289f) {
            InterfaceC13289f interfaceC13289f = (InterfaceC13289f) aqqVar.mo99543c();
            psd0.m173633z(this.f55426e);
            this.f55426e = interfaceC13289f.mo81046S(str).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.voj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185054a.m81033q(aqqVar, str2, (String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m81033q(@NonNull aqq aqqVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtpOnClickMenu";
        }
        aqqVar.mo99544d().mo97004b(str2, str);
    }

    @lkq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5) {
        m81036t(aqqVar, str, str2, str3, str4, str5, false);
    }

    @lkq(key = "setNavRightButton")
    public void setNavRightButton(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5) {
        m81037u(aqqVar, str, str2, str3, str4, str5);
    }

    @lkq(key = "setNavigation")
    public void setNavigation(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        m81038v(aqqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, false);
    }

    @lkq(key = "setNavigationTitle")
    public void setNavigationTitle(@NonNull aqq aqqVar, String str, String str2, String str3, String str4) {
        m81039w(aqqVar, str, str2, str3, str4);
    }

    @lkq(key = "setTitle", uiThread = true)
    public void setTitle(@NonNull aqq aqqVar, String str) {
        VNavigationBar vNavigationBarM81028m = m81028m(aqqVar);
        if (vNavigationBarM81028m != null) {
            vNavigationBarM81028m.setTitle(str);
        }
    }

    @lkq(key = "showDialog", uiThread = true)
    public void showDialog(@NonNull final aqq aqqVar, String str, String str2, String str3, String str4, final String str5, final String str6, boolean z) {
        aqqVar.mo99543c().dialog().m21506G0(str).m21503F(str2).m21559v0(str3, new Runnable() { // from class: l.apj0
            @Override // java.lang.Runnable
            public final void run() {
                aqqVar.mo99544d().mo97003a(str5);
            }
        }).m21543n0(str4, new Runnable() { // from class: l.bpj0
            @Override // java.lang.Runnable
            public final void run() {
                aqqVar.mo99544d().mo97003a(str6);
            }
        }).m21495B(z).m21567z0();
    }

    @lkq(key = "showNotch")
    public void showNotch(@NonNull aqq aqqVar) {
        final PutongAct putongActMo99543c = aqqVar.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.yoj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200986a.m81034r(putongActMo99543c);
            }
        });
    }

    @lkq(key = "showToast")
    public void showToast(@NonNull aqq aqqVar, String str, int i) {
        m81040x(aqqVar, str, i);
    }

    /* JADX INFO: renamed from: t */
    public void m81036t(@NonNull final bqq bqqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM81028m = m81028m(bqqVar);
        if (vNavigationBarM81028m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str5);
            return;
        }
        l51.m152893M(new RunnableC13285b(bqqVar, vNavigationBarM81028m));
        if (!TextUtils.isEmpty(str)) {
            uqb0.f180374G.m127100E(str).subscribe(psd0.m173596G(new y20() { // from class: l.woj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    l51.m152893M(new Runnable() { // from class: l.cpj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            UIBridgeImplementation.m81021e(bqqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM81028m.setLeftIconOnClick(new ViewOnClickListenerC13286c(str3, bqqVar, z));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        bqqVar.mo99544d().mo97003a(str4);
    }

    /* JADX INFO: renamed from: u */
    public final void m81037u(@NonNull bqq bqqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM81028m = m81028m(bqqVar);
        if (vNavigationBarM81028m == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str5);
        } else {
            l51.m152893M(new RunnableC13287d(bqqVar, vNavigationBarM81028m, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str4);
        }
    }

    @lkq(key = "unRegisterBarRight", uiThread = true)
    public void unRegisterBarRight(@NonNull aqq aqqVar) {
        if (aqqVar.mo99543c() instanceof InterfaceC13288e) {
            ((InterfaceC13288e) aqqVar.mo99543c()).mo48514y0();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m81038v(@NonNull bqq bqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        if (m81028m(bqqVar) == null) {
            if (TextUtils.isEmpty(str10)) {
                bqqVar.mo99544d().mo97003a(str10);
            }
        } else {
            m81039w(bqqVar, str, str2, "", "");
            m81036t(bqqVar, str3, str4, str5, "", "", z);
            m81037u(bqqVar, str6, str7, str8, "", "");
            if (TextUtils.isEmpty(str9)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str9);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m81039w(@NonNull bqq bqqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM81028m = m81028m(bqqVar);
        if (vNavigationBarM81028m == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str4);
        } else {
            l51.m152893M(new RunnableC13284a(bqqVar, vNavigationBarM81028m, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            bqqVar.mo99544d().mo97003a(str3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m81040x(@NonNull bqq bqqVar, String str, int i) {
        o1j0.m165651y(str);
    }

    @lkq(key = "setNavLeftButton")
    public void setNavLeftButton(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        m81036t(aqqVar, str, str2, str3, str4, str5, z);
    }

    @lkq(key = "setNavigation")
    public void setNavigation(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        m81038v(aqqVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }
}
