package p153l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.sign.TencentSignActivity;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p074ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;
import p151v.navigationbar.VNavigationBar;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
public class mai0 extends wc00 {

    /* JADX INFO: renamed from: l.mai0$a */
    public class C18578a implements z20<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f135530a;

        public C18578a(String str) {
            this.f135530a = str;
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            mai0.this.m205739G(TextUtils.isEmpty(this.f135530a) ? "adtp" : this.f135530a, str, str2);
        }
    }

    /* JADX INFO: renamed from: l.mai0$b */
    public class RunnableC18579b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f135532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f135533b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f135534c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f135535d;

        /* JADX INFO: renamed from: l.mai0$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC18579b.this.f135535d)) {
                    return;
                }
                RunnableC18579b runnableC18579b = RunnableC18579b.this;
                mai0.this.m205738F(runnableC18579b.f135535d);
            }
        }

        public RunnableC18579b(bqq bqqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f135532a = bqqVar;
            this.f135533b = vNavigationBar;
            this.f135534c = str;
            this.f135535d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f135532a.mo99542b()) {
                return;
            }
            this.f135533b.setVisibility(0);
            this.f135533b.setTitle(this.f135534c);
            this.f135533b.getTitleContainer().setOnClickListener(new a());
            this.f135532a.mo99541a().setTag(ycc0.f198423J0, new Object());
        }
    }

    /* JADX INFO: renamed from: l.mai0$c */
    public class RunnableC18580c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f135538a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f135539b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f135540c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f135541d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f135542e;

        /* JADX INFO: renamed from: l.mai0$c$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC18580c runnableC18580c = RunnableC18580c.this;
                mai0.this.m205738F(runnableC18580c.f135541d);
            }
        }

        /* JADX INFO: renamed from: l.mai0$c$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f135545a;

            public b(String str) {
                this.f135545a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                mai0.this.m205738F(this.f135545a);
            }
        }

        public RunnableC18580c(bqq bqqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f135538a = bqqVar;
            this.f135539b = vNavigationBar;
            this.f135540c = str;
            this.f135541d = str2;
            this.f135542e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m157728d(String str, View view) {
            mai0.this.m205738F(str);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m157729e(bqq bqqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!bqqVar.mo99542b() && NullChecker.m82487b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = qa00.f156292E;
                vNavigationBar.m224833v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(str));
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m157730f(final bqq bqqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            l51.m152893M(new Runnable() { // from class: l.pai0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151282a.m157729e(bqqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f135538a.mo99542b()) {
                return;
            }
            this.f135539b.setVisibility(0);
            this.f135539b.m224830B();
            if (!TextUtils.isEmpty(this.f135540c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f135538a.mo99543c()).inflate(jec0.f120432A, (ViewGroup) null);
                textView.setText(this.f135540c);
                textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                final String str = this.f135541d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.nai0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f141016a.m157728d(str, view);
                    }
                });
                textView.setOnClickListener(new a());
                this.f135539b.m224835z(textView);
            }
            if (TextUtils.isEmpty(this.f135542e)) {
                return;
            }
            C22421c<Bitmap> c22421cM127100E = uqb0.f180374G.m127100E(this.f135542e);
            final bqq bqqVar = this.f135538a;
            final VNavigationBar vNavigationBar = this.f135539b;
            final String str2 = this.f135541d;
            c22421cM127100E.subscribe(psd0.m173596G(new y20() { // from class: l.oai0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145738a.m157730f(bqqVar, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.mai0$d */
    public class RunnableC18581d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqq f135547a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f135548b;

        public RunnableC18581d(bqq bqqVar, VNavigationBar vNavigationBar) {
            this.f135547a = bqqVar;
            this.f135548b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f135547a.mo99542b()) {
                return;
            }
            this.f135548b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.mai0$e */
    public class ViewOnClickListenerC18582e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f135550a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f135551b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bqq f135552c;

        public ViewOnClickListenerC18582e(String str, boolean z, bqq bqqVar) {
            this.f135550a = str;
            this.f135551b = z;
            this.f135552c = bqqVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f135550a)) {
                mai0.this.m205738F(this.f135550a);
            }
            if (this.f135551b) {
                return;
            }
            this.f135552c.mo99543c().m68056e2();
        }
    }

    public mai0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m157675P(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("eid");
        String strOptString3 = jSONObject.optString("pageId");
        try {
            jSONObject2 = (JSONObject) jSONObject.opt("extras");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            jSONObject2 = null;
        }
        jtp0.m146915e(strOptString, strOptString2, strOptString3, jSONObject2);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m157682W(bqq bqqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!bqqVar.mo99542b() && NullChecker.m82487b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = qa00.f156292E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m157684Y(Act act, String str) {
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

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m157685Z(JSONObject jSONObject, xc00 xc00Var) {
        String queryParameter;
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        try {
            queryParameter = Uri.parse(strOptString).getQueryParameter("_bid");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            queryParameter = null;
        }
        Intent intentM81419b2 = NullChecker.m82486a(queryParameter) ? MkWebViewAct.m81419b2(xc00Var.mo99543c(), "", strOptString) : WebViewAct.m81347a2(xc00Var.mo99543c(), "", strOptString);
        m157686a0(intentM81419b2, strOptString);
        xc00Var.mo99543c().startActivity(intentM81419b2);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m157686a0(@NonNull Intent intent, @NonNull String str) {
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "1".equals(uri.getQueryParameter("hideNavigationBar"));
            boolean zEquals2 = "1".equals(uri.getQueryParameter("skipLoading"));
            String queryParameter = uri.getQueryParameter("webviewColor");
            String queryParameter2 = uri.getQueryParameter("notchColor");
            boolean zEquals3 = "1".equals(uri.getQueryParameter("hideNotch"));
            String queryParameter3 = uri.getQueryParameter("selectFileType");
            intent.putExtra("hideNavigationBar", zEquals);
            intent.putExtra("skipLoading", zEquals2);
            intent.putExtra("webviewColor", queryParameter);
            intent.putExtra("notchColor", queryParameter2);
            intent.putExtra("hideNotch", zEquals3);
            intent.putExtra("selectFileType", queryParameter3);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m157687A0(@NonNull final bqq bqqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM157701d0 = m157701d0(bqqVar);
        if (vNavigationBarM157701d0 == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m205738F(str5);
            return;
        }
        l51.m152893M(new RunnableC18581d(bqqVar, vNavigationBarM157701d0));
        if (!TextUtils.isEmpty(str)) {
            uqb0.f180374G.m127100E(str).subscribe(psd0.m173596G(new y20() { // from class: l.dai0
                @Override // p153l.y20
                public final void call(Object obj) {
                    l51.m152893M(new Runnable() { // from class: l.z9i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mai0.m157682W(bqqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM157701d0.setLeftIconOnClick(new ViewOnClickListenerC18582e(str3, z, bqqVar));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        m205738F(str4);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m157688B0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m157689C0(xc00Var, jSONObject.optString("imgUrl"), jSONObject.optString("text"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m157689C0(@NonNull bqq bqqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM157701d0 = m157701d0(bqqVar);
        if (vNavigationBarM157701d0 == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m205738F(str5);
        } else {
            l51.m152893M(new RunnableC18580c(bqqVar, vNavigationBarM157701d0, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m205738F(str4);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m157690D0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title");
        String strOptString2 = jSONObject.optString("handler");
        String strOptString3 = jSONObject.optString("leftImgUrl");
        String strOptString4 = jSONObject.optString("leftText");
        String strOptString5 = jSONObject.optString("leftHandler");
        String strOptString6 = jSONObject.optString("rightImgUrl");
        String strOptString7 = jSONObject.optString("rightText");
        String strOptString8 = jSONObject.optString("rightHandler");
        String strOptString9 = jSONObject.optString("sucessHandler");
        String strOptString10 = jSONObject.optString("errorHandler");
        boolean zOptBoolean = jSONObject.optBoolean("skipBack");
        if (m157701d0(xc00Var) == null) {
            if (TextUtils.isEmpty(strOptString10)) {
                return;
            }
            m205738F(strOptString10);
        } else {
            m157692F0(xc00Var, strOptString, strOptString2, "", "");
            m157687A0(xc00Var, strOptString3, strOptString4, strOptString5, "", "", zOptBoolean);
            m157689C0(xc00Var, strOptString6, strOptString7, strOptString8, "", "");
            if (TextUtils.isEmpty(strOptString9)) {
                return;
            }
            m205738F(strOptString9);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m157691E0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m157692F0(xc00Var, jSONObject.optString("title"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m157692F0(@NonNull bqq bqqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM157701d0 = m157701d0(bqqVar);
        if (vNavigationBarM157701d0 == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m205738F(str4);
        } else {
            l51.m152893M(new RunnableC18579b(bqqVar, vNavigationBarM157701d0, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            m205738F(str3);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m157693G0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("handler");
        xc00Var.mo99541a().setTag(WebViewBridgeImplementation.f55450a, TextUtils.isEmpty(strOptString) ? null : new Runnable() { // from class: l.hai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108502a.m157716s0(strOptString);
            }
        });
        xc00Var.mo99543c().setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m157694H0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.lai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f130699a.m157717t0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final void m157695I0(@NonNull bqq bqqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m81199t0(new C18578a(str6)).m81200u0(new a30() { // from class: l.cai0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f80600a.m157718u0(str5, str7, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m81201v0(bqqVar.mo99543c(), null, str2, str3, ShareHelper.m81140X(str5), false, str4);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m157696J0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.x9i0
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                ShareHelper.m81132N(xc00Var.mo99543c(), jSONObject2.optString("url"), jSONObject2.optString("title"), jSONObject2.optString("imgUrl"), jSONObject2.optString("description"), jSONObject2.optString("callback"));
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final void m157697K0(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("context");
        jSONObject.optInt(BLiveOperationTitleShowType.duration);
        o1j0.m165651y(strOptString);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m157698L0(final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.iai0
            @Override // java.lang.Runnable
            public final void run() {
                mai0.m157675P(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final void m157699b0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        l51.m152893M(new Runnable() { // from class: l.y9i0
            @Override // java.lang.Runnable
            public final void run() {
                mai0.m157684Y(putongActMo99543c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m157700c0(@NonNull final xc00 xc00Var) {
        l51.m152893M(new Runnable() { // from class: l.jai0
            @Override // java.lang.Runnable
            public final void run() {
                xc00Var.mo99543c().m68056e2();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final VNavigationBar m157701d0(@NonNull bqq bqqVar) {
        if (!(bqqVar.mo99543c() instanceof MkWebViewAct) && !(bqqVar.mo99543c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (bqqVar.mo99543c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) bqqVar.mo99543c().findViewById(ycc0.f198442Y);
        }
        if (bqqVar.mo99543c() instanceof MkWebViewAct) {
            return (VNavigationBar) bqqVar.mo99543c().findViewById(ycc0.f198442Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m157702e0() {
        return "[" + ABManager.m30347i() + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m157703f0(JSONObject jSONObject) {
        return irq.m141843d(jSONObject.optString("url", null), jSONObject.optString("body", null));
    }

    /* JADX INFO: renamed from: g0 */
    public final String m157704g0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(qv5.m178249c(), "tantanapp")) {
                jSONObject.put("env", "online");
            } else {
                jSONObject.put("env", "staging");
            }
            jSONObject.put("pkgType", BuildConfig.BUILD_TYPE);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: h0 */
    public final String m157705h0(@NonNull xc00 xc00Var) {
        return ql20.m176980b(xc00Var.mo99543c());
    }

    /* JADX INFO: renamed from: i0 */
    public final String m157706i0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", uqb0.f180427z.get());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: j0 */
    public final String m157707j0(@NonNull xc00 xc00Var) {
        List<String> listM81134R = ShareHelper.m81134R(xc00Var.mo99543c());
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

    /* JADX INFO: renamed from: k0 */
    public final String m157708k0(@NonNull xc00 xc00Var) {
        PhoneNumber phoneNumber;
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        User userQueryMe = uqb0.f180397c0.queryMe();
        String str = userQueryMe.f56859id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.m61308fp() == null ? null : userQueryMe.m61308fp().url;
        Profile profile = userQueryMe.profile;
        ProfileZodiac profileZodiac = profile == null ? null : profile.zodiac;
        String strName2 = profileZodiac == null ? null : profileZodiac.name();
        String strM175804j0 = profileZodiac != null ? q8g0.m175804j0(profileZodiac) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", xc00Var.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.KEY_KEY, strName2);
            jSONObject2.put("value", strM175804j0);
            jSONObject.put(ProfileLikeCategoryType.zodiac, jSONObject2);
            jSONObject.put(SeeTextDynamicParam.age, num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.m29107d(uqb0.f180400f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m157709l0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.fai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97984a.m157711n0(xc00Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m157710m0(JSONObject jSONObject, xc00 xc00Var) {
        m205740H(jSONObject, m157708k0(xc00Var));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m157711n0(xc00 xc00Var, JSONObject jSONObject) {
        xc00Var.mo99543c().m68056e2();
        m157723z0(xc00Var, jSONObject.optString("url"), jSONObject.optString("title"));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m157712o0(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m205739G(str, str2, str3);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m157713p0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m81144b0(ShareHelper.m81141Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m205739G(str2, str3, str4);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m157714q0(JSONObject jSONObject, xc00 xc00Var) {
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("title");
        String strOptString3 = jSONObject.optString("description");
        String strOptString4 = jSONObject.optString("imgUrl");
        jSONObject.optString("modalTitle");
        final String strOptString5 = jSONObject.optString("successHandler");
        final String strOptString6 = jSONObject.optString("errorHandler");
        final String strOptString7 = jSONObject.optString("channels");
        Link link = new Link();
        link.href = strOptString;
        new ShareHelper(link).m81199t0(new z20() { // from class: l.aai0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f69146a.m157712o0(strOptString5, (String) obj, (String) obj2);
            }
        }).m81200u0(new a30() { // from class: l.bai0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f75697a.m157713p0(strOptString7, strOptString6, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m81201v0(xc00Var.mo99543c(), null, strOptString2, strOptString3, ShareHelper.m81141Y(strOptString7), false, strOptString4);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m157715r0(JSONObject jSONObject, xc00 xc00Var) {
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("title");
        if ("tencentSign".equals(Uri.parse(strOptString).getQueryParameter("action"))) {
            xc00Var.mo99543c().startActivity(TencentSignActivity.INSTANCE.m81222a(xc00Var.mo99543c(), strOptString, strOptString2));
        } else {
            m157723z0(xc00Var, strOptString, strOptString2);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m157716s0(String str) {
        m205738F(str);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m157717t0(JSONObject jSONObject, xc00 xc00Var) {
        m157695I0(xc00Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m157718u0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m81144b0(ShareHelper.m81140X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m205739G(str2, str3, str4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull final xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -2011329232:
                if (str2.equals("getAuthorizationHeader")) {
                    b = 0;
                }
                break;
            case -1955917802:
                if (str2.equals("setNavigation")) {
                    b = 1;
                }
                break;
            case -1944227861:
                if (str2.equals("jumpWebview")) {
                    b = 2;
                }
                break;
            case -1913642710:
                if (str2.equals("showToast")) {
                    b = 3;
                }
                break;
            case -1862843600:
                if (str2.equals("getNetworkTantanDevEnv")) {
                    b = 4;
                }
                break;
            case -1723846387:
                if (str2.equals("changeNotchBackgroundColor")) {
                    b = 5;
                }
                break;
            case -1263203643:
                if (str2.equals("openUrl")) {
                    b = 6;
                }
                break;
            case -1105039471:
                if (str2.equals("getABNames")) {
                    b = 7;
                }
                break;
            case -776005675:
                if (str2.equals("getNetworkEnv")) {
                    b = 8;
                }
                break;
            case -584759031:
                if (str2.equals("openMKDialogWebview")) {
                    b = 9;
                }
                break;
            case -580911027:
                if (str2.equals("setNavRightButton")) {
                    b = 10;
                }
                break;
            case -120664351:
                if (str2.equals("closeWebview")) {
                    b = 11;
                }
                break;
            case 109400031:
                if (str2.equals("share")) {
                    b = 12;
                }
                break;
            case 1027597903:
                if (str2.equals("openWebview")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1034545240:
                if (str2.equals("systemShareDialog")) {
                    b = 14;
                }
                break;
            case 1270462549:
                if (str2.equals("trackNew")) {
                    b = 15;
                }
                break;
            case 1465565154:
                if (str2.equals("setNavigationTitle")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1713746630:
                if (str2.equals("getNetworkInfo")) {
                    b = 17;
                }
                break;
            case 1739687432:
                if (str2.equals("nativeShare")) {
                    b = 18;
                }
                break;
            case 1811096719:
                if (str2.equals("getUserInfo")) {
                    b = 19;
                }
                break;
            case 1947242138:
                if (str2.equals("getShareChannel")) {
                    b = 20;
                }
                break;
            case 2059666117:
                if (str2.equals("setOnKeyBack")) {
                    b = 21;
                }
                break;
        }
        switch (b) {
            case 0:
                m205740H(jSONObject, m157703f0(jSONObject));
                return true;
            case 1:
                m157690D0(xc00Var, jSONObject);
                return true;
            case 2:
                m157709l0(xc00Var, jSONObject);
                return true;
            case 3:
                m157697K0(jSONObject);
                return true;
            case 4:
                m205740H(jSONObject, m157706i0());
                return true;
            case 5:
                m157699b0(xc00Var, jSONObject);
                return true;
            case 6:
                m157721x0(xc00Var, jSONObject);
                return true;
            case 7:
                m205740H(jSONObject, m157702e0());
                return true;
            case 8:
                m205740H(jSONObject, m157704g0());
                return true;
            case 9:
                m157720w0(xc00Var, jSONObject);
                return true;
            case 10:
                m157688B0(xc00Var, jSONObject);
                return true;
            case 11:
                m157700c0(xc00Var);
                return true;
            case 12:
                m157694H0(xc00Var, jSONObject);
                return true;
            case 13:
                m157722y0(xc00Var, jSONObject);
                return true;
            case 14:
                m157696J0(xc00Var, jSONObject);
                return true;
            case 15:
                m157698L0(jSONObject);
                return true;
            case 16:
                m157691E0(xc00Var, jSONObject);
                return true;
            case 17:
                m205740H(jSONObject, m157705h0(xc00Var));
                return true;
            case 18:
                m157719v0(xc00Var, jSONObject);
                return true;
            case 19:
                l51.m152919y(new Runnable() { // from class: l.w9i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f188013a.m157710m0(jSONObject, xc00Var);
                    }
                });
                return true;
            case 20:
                m205740H(jSONObject, m157707j0(xc00Var));
                return true;
            case 21:
                m157693G0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m157719v0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.kai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f124693a.m157714q0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m157720w0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        if (NullChecker.m82486a(Act.foreground_() == null ? null : Act.foreground_().f16062a.get())) {
            Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(xc00Var.mo99543c(), "", jSONObject.optString("url"));
            intentM81411Y1.putExtra("hideNavigationBar", true);
            intentM81411Y1.putExtra("skipLoading", true);
            intentM81411Y1.putExtra("transparent_status_bar", true);
            intentM81411Y1.putExtra("webviewColor", "transparent");
            intentM81411Y1.putExtra("hideNotch", true);
            xc00Var.mo99543c().startActivity(intentM81411Y1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m157721x0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.eai0
            @Override // java.lang.Runnable
            public final void run() {
                mai0.m157685Z(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m157722y0(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.gai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103001a.m157715r0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m157723z0(@NonNull bqq bqqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            nae0.m162083m(bqqVar.mo99543c(), Uri.parse(str));
            return;
        }
        Intent intentM81347a2 = WebViewAct.m81347a2(bqqVar.mo99543c(), str2, str);
        m157686a0(intentM81347a2, str);
        bqqVar.mo99543c().startActivity(intentM81347a2);
    }
}
