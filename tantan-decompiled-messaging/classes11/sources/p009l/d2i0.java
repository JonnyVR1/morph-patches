package p009l;

import android.app.Activity;
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
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.putong.p004ui.sign.TencentSignActivity;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkDlgWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.e51;
import l.e6c0;
import l.f30;
import l.g30;
import l.gd20;
import l.j2e0;
import l.lsi0;
import l.mkd0;
import l.mu5;
import l.qib0;
import l.s4c0;
import l.t100;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d2i0 extends e400 {

    /* JADX INFO: renamed from: l.d2i0$a */
    public class C0838a implements f30<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10877a;

        public C0838a(String str) {
            this.f10877a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            d2i0.this.m13719y(TextUtils.isEmpty(this.f10877a) ? "adtp" : this.f10877a, str, str2);
        }
    }

    /* JADX INFO: renamed from: l.d2i0$b */
    public class RunnableC0839b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f10879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f10880b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f10881c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f10882d;

        /* JADX INFO: renamed from: l.d2i0$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC0839b.this.f10882d)) {
                    return;
                }
                RunnableC0839b runnableC0839b = RunnableC0839b.this;
                d2i0.this.m13718x(runnableC0839b.f10882d);
            }
        }

        public RunnableC0839b(coq coqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f10879a = coqVar;
            this.f10880b = vNavigationBar;
            this.f10881c = str;
            this.f10882d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10879a.mo12183b()) {
                return;
            }
            this.f10880b.setVisibility(0);
            this.f10880b.setTitle(this.f10881c);
            this.f10880b.getTitleContainer().setOnClickListener(new a());
            this.f10879a.mo12182a().setTag(s4c0.J0, new Object());
        }
    }

    /* JADX INFO: renamed from: l.d2i0$c */
    public class RunnableC0840c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f10885a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f10886b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f10887c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f10888d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f10889e;

        /* JADX INFO: renamed from: l.d2i0$c$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC0840c runnableC0840c = RunnableC0840c.this;
                d2i0.this.m13718x(runnableC0840c.f10888d);
            }
        }

        /* JADX INFO: renamed from: l.d2i0$c$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f10892a;

            public b(String str) {
                this.f10892a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d2i0.this.m13718x(this.f10892a);
            }
        }

        public RunnableC0840c(coq coqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f10885a = coqVar;
            this.f10886b = vNavigationBar;
            this.f10887c = str;
            this.f10888d = str2;
            this.f10889e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m12987d(String str, View view) {
            d2i0.this.m13718x(str);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m12988e(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!coqVar.mo12183b() && NullChecker.b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = t100.E;
                vNavigationBar.v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(str));
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m12989f(final coq coqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            e51.M(new Runnable() { // from class: l.g2i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13271a.m12988e(coqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10885a.mo12183b()) {
                return;
            }
            this.f10886b.setVisibility(0);
            this.f10886b.B();
            if (!TextUtils.isEmpty(this.f10887c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f10885a.mo12184c()).inflate(e6c0.A, (ViewGroup) null);
                textView.setText(this.f10887c);
                textView.setTextColor(-16777216);
                final String str = this.f10888d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.e2i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f12164a.m12987d(str, view);
                    }
                });
                textView.setOnClickListener(new a());
                this.f10886b.z(new View[]{textView});
            }
            if (TextUtils.isEmpty(this.f10889e)) {
                return;
            }
            c cVarE = qib0.G.E(this.f10889e);
            final coq coqVar = this.f10885a;
            final VNavigationBar vNavigationBar = this.f10886b;
            final String str2 = this.f10888d;
            cVarE.subscribe(mkd0.G(new e30() { // from class: l.f2i0
                public final void call(Object obj) {
                    this.f12755a.m12989f(coqVar, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.d2i0$d */
    public class RunnableC0841d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f10894a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f10895b;

        public RunnableC0841d(coq coqVar, VNavigationBar vNavigationBar) {
            this.f10894a = coqVar;
            this.f10895b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10894a.mo12183b()) {
                return;
            }
            this.f10895b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.d2i0$e */
    public class ViewOnClickListenerC0842e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10897a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10898b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ coq f10899c;

        public ViewOnClickListenerC0842e(String str, boolean z, coq coqVar) {
            this.f10897a = str;
            this.f10898b = z;
            this.f10899c = coqVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f10897a)) {
                d2i0.this.m13718x(this.f10897a);
            }
            if (this.f10898b) {
                return;
            }
            this.f10899c.mo12184c().finish();
        }
    }

    public d2i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m12931C(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString(MiniWidgetProvider.KEY_TYPE);
        String strOptString2 = jSONObject.optString("eid");
        String strOptString3 = jSONObject.optString("pageId");
        try {
            jSONObject2 = (JSONObject) jSONObject.opt("extras");
        } catch (Exception e) {
            CrashHelper.c(e);
            jSONObject2 = null;
        }
        fkp0.m14496e(strOptString, strOptString2, strOptString3, jSONObject2);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m12933E(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!coqVar.mo12183b() && NullChecker.b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m12934F(JSONObject jSONObject, f400 f400Var) {
        String queryParameter;
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        try {
            queryParameter = Uri.parse(strOptString).getQueryParameter("_bid");
        } catch (Exception e) {
            CrashHelper.c(e);
            queryParameter = null;
        }
        Intent intentM10583a2 = NullChecker.a(queryParameter) ? MkWebViewAct.m10583a2(f400Var.mo12184c(), "", strOptString) : WebViewAct.m10498Z1(f400Var.mo12184c(), "", strOptString);
        m12946R(intentM10583a2, strOptString);
        f400Var.mo12184c().startActivity(intentM10583a2);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m12941M(Act act, String str) {
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

    /* JADX INFO: renamed from: R */
    public static void m12946R(@NonNull Intent intent, @NonNull String str) {
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
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m12947A0(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("context");
        jSONObject.optInt("duration");
        lsi0.y(strOptString);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m12948B0(final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.y1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m12931C(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m12949S(@NonNull f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActMo12184c = f400Var.mo12184c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        e51.M(new Runnable() { // from class: l.p1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m12941M(putongActMo12184c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m12950T(@NonNull final f400 f400Var) {
        e51.M(new Runnable() { // from class: l.z1i0
            @Override // java.lang.Runnable
            public final void run() {
                f400Var.mo12184c().finish();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final VNavigationBar m12951U(@NonNull coq coqVar) {
        if (!(coqVar.mo12184c() instanceof MkWebViewAct) && !(coqVar.mo12184c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (coqVar.mo12184c() instanceof AccessTokenMkWebViewAct) {
            return coqVar.mo12184c().findViewById(s4c0.Y);
        }
        if (coqVar.mo12184c() instanceof MkWebViewAct) {
            return coqVar.mo12184c().findViewById(s4c0.Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final String m12952V() {
        return "[" + ABManager.i() + "]";
    }

    /* JADX INFO: renamed from: W */
    public final String m12953W(JSONObject jSONObject) {
        return ipq.m16688d(jSONObject.optString("url", null), jSONObject.optString("body", null));
    }

    /* JADX INFO: renamed from: X */
    public final String m12954X() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(mu5.c(), "tantanapp")) {
                jSONObject.put("env", "online");
            } else {
                jSONObject.put("env", "staging");
            }
            jSONObject.put("pkgType", "debug");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: Y */
    public final String m12955Y(@NonNull f400 f400Var) {
        return gd20.b(f400Var.mo12184c());
    }

    /* JADX INFO: renamed from: Z */
    public final String m12956Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", qib0.z.get());
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a0 */
    public final String m12957a0(@NonNull f400 f400Var) {
        List<String> listM10280R = ShareHelper.m10280R(f400Var.mo12184c());
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

    /* JADX INFO: renamed from: b0 */
    public final String m12958b0(@NonNull f400 f400Var) {
        PhoneNumber phoneNumber;
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        User userQueryMe = qib0.c0.queryMe();
        String str = ((DbObject) userQueryMe).id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.fp() == null ? null : ((Media) userQueryMe.fp()).url;
        Profile profile = userQueryMe.profile;
        TEnum tEnum = profile == null ? null : profile.zodiac;
        String strName2 = tEnum == null ? null : tEnum.name();
        String strM16137j0 = tEnum != null ? i0g0.m16137j0(tEnum) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", f400Var.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", strName2);
            jSONObject2.put("value", strM16137j0);
            jSONObject.put("zodiac", jSONObject2);
            jSONObject.put("age", num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.d(qib0.f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12959c0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.v1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21414a.m12960d0(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m12960d0(f400 f400Var, JSONObject jSONObject) {
        f400Var.mo12184c().finish();
        m12972p0(f400Var, jSONObject.optString("url"), jSONObject.optString("title"));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m12961e0(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m13719y(str, str2, str3);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m12962f0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m10290b0(ShareHelper.m10287Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m13719y(str2, str3, str4);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m12963g0(JSONObject jSONObject, f400 f400Var) {
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
        new ShareHelper(link).m10345t0(new f30() { // from class: l.r1i0
            public final void call(Object obj, Object obj2) {
                this.f19610a.m12961e0(strOptString5, (String) obj, (String) obj2);
            }
        }).m10346u0(new g30() { // from class: l.s1i0
            /* JADX INFO: renamed from: a */
            public final void m21982a(Object obj, Object obj2, Object obj3) {
                this.f20074a.m12962f0(strOptString7, strOptString6, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m10347v0(f400Var.mo12184c(), null, strOptString2, strOptString3, ShareHelper.m10287Y(strOptString7), false, strOptString4);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m12964h0(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("title");
        if ("tencentSign".equals(Uri.parse(strOptString).getQueryParameter("action"))) {
            f400Var.mo12184c().startActivity(TencentSignActivity.INSTANCE.m10368a(f400Var.mo12184c(), strOptString, strOptString2));
        } else {
            m12972p0(f400Var, strOptString, strOptString2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m12965i0(String str) {
        m13718x(str);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m12966j0(JSONObject jSONObject, f400 f400Var) {
        m12981y0(f400Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m12967k0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m10290b0(ShareHelper.m10286X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m13719y(str2, str3, str4);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m12968l0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.a2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9190a.m12963g0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m12969m0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.a(Act.foreground_() == null ? null : (Activity) Act.foreground_().a.get())) {
            Intent intentM10570X1 = MkDlgWebViewAct.m10570X1(f400Var.mo12184c(), "", jSONObject.optString("url"));
            intentM10570X1.putExtra("hideNavigationBar", true);
            intentM10570X1.putExtra("skipLoading", true);
            intentM10570X1.putExtra("transparent_status_bar", true);
            intentM10570X1.putExtra("webviewColor", "transparent");
            intentM10570X1.putExtra("hideNotch", true);
            f400Var.mo12184c().startActivity(intentM10570X1);
        }
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getAuthorizationHeader":
                m13720z(jSONObject, m12953W(jSONObject));
                return true;
            case "setNavigation":
                m12976t0(f400Var, jSONObject);
                return true;
            case "jumpWebview":
                m12959c0(f400Var, jSONObject);
                return true;
            case "showToast":
                m12947A0(jSONObject);
                return true;
            case "getNetworkTantanDevEnv":
                m13720z(jSONObject, m12956Z());
                return true;
            case "changeNotchBackgroundColor":
                m12949S(f400Var, jSONObject);
                return true;
            case "openUrl":
                m12970n0(f400Var, jSONObject);
                return true;
            case "getABNames":
                m13720z(jSONObject, m12952V());
                return true;
            case "getNetworkEnv":
                m13720z(jSONObject, m12954X());
                return true;
            case "openMKDialogWebview":
                m12969m0(f400Var, jSONObject);
                return true;
            case "setNavRightButton":
                m12974r0(f400Var, jSONObject);
                return true;
            case "closeWebview":
                m12950T(f400Var);
                return true;
            case "share":
                m12980x0(f400Var, jSONObject);
                return true;
            case "openWebview":
                m12971o0(f400Var, jSONObject);
                return true;
            case "systemShareDialog":
                m12982z0(f400Var, jSONObject);
                return true;
            case "trackNew":
                m12948B0(jSONObject);
                return true;
            case "setNavigationTitle":
                m12977u0(f400Var, jSONObject);
                return true;
            case "getNetworkInfo":
                m13720z(jSONObject, m12955Y(f400Var));
                return true;
            case "nativeShare":
                m12968l0(f400Var, jSONObject);
                return true;
            case "getUserInfo":
                m13720z(jSONObject, m12958b0(f400Var));
                return true;
            case "getShareChannel":
                m13720z(jSONObject, m12957a0(f400Var));
                return true;
            case "setOnKeyBack":
                m12979w0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m12970n0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.u1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m12934F(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m12971o0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.w1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21842a.m12964h0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m12972p0(@NonNull coq coqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            j2e0.m(coqVar.mo12184c(), Uri.parse(str));
            return;
        }
        Intent intentM10498Z1 = WebViewAct.m10498Z1(coqVar.mo12184c(), str2, str);
        m12946R(intentM10498Z1, str);
        coqVar.mo12184c().startActivity(intentM10498Z1);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m12973q0(@NonNull final coq coqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM12951U = m12951U(coqVar);
        if (vNavigationBarM12951U == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m13718x(str5);
            return;
        }
        e51.M(new RunnableC0841d(coqVar, vNavigationBarM12951U));
        if (!TextUtils.isEmpty(str)) {
            qib0.G.E(str).subscribe(mkd0.G(new e30() { // from class: l.o1i0
                public final void call(Object obj) {
                    e51.M(new Runnable() { // from class: l.q1i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            d2i0.m12933E(coqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM12951U.setLeftIconOnClick(new ViewOnClickListenerC0842e(str3, z, coqVar));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        m13718x(str4);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12974r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m12975s0(f400Var, jSONObject.optString("imgUrl"), jSONObject.optString("text"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m12975s0(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM12951U = m12951U(coqVar);
        if (vNavigationBarM12951U == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m13718x(str5);
        } else {
            e51.M(new RunnableC0840c(coqVar, vNavigationBarM12951U, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m13718x(str4);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12976t0(@NonNull f400 f400Var, JSONObject jSONObject) {
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
        if (m12951U(f400Var) == null) {
            if (TextUtils.isEmpty(strOptString10)) {
                return;
            }
            m13718x(strOptString10);
        } else {
            m12978v0(f400Var, strOptString, strOptString2, "", "");
            m12973q0(f400Var, strOptString3, strOptString4, strOptString5, "", "", zOptBoolean);
            m12975s0(f400Var, strOptString6, strOptString7, strOptString8, "", "");
            if (TextUtils.isEmpty(strOptString9)) {
                return;
            }
            m13718x(strOptString9);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12977u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m12978v0(f400Var, jSONObject.optString("title"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m12978v0(@NonNull coq coqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM12951U = m12951U(coqVar);
        if (vNavigationBarM12951U == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m13718x(str4);
        } else {
            e51.M(new RunnableC0839b(coqVar, vNavigationBarM12951U, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            m13718x(str3);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m12979w0(@NonNull f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("handler");
        f400Var.mo12182a().setTag(WebViewBridgeImplementation.f8208a, TextUtils.isEmpty(strOptString) ? null : new Runnable() { // from class: l.x1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22400a.m12965i0(strOptString);
            }
        });
        f400Var.mo12184c().setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m12980x0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.b2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9884a.m12966j0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m12981y0(@NonNull coq coqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m10345t0(new C0838a(str6)).m10346u0(new g30() { // from class: l.t1i0
            /* JADX INFO: renamed from: a */
            public final void m22426a(Object obj, Object obj2, Object obj3) {
                this.f20518a.m12967k0(str5, str7, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m10347v0(coqVar.mo12184c(), null, str2, str3, ShareHelper.m10286X(str5), false, str4);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12982z0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.c2i0
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                ShareHelper.m10278N(f400Var.mo12184c(), jSONObject2.optString("url"), jSONObject2.optString("title"), jSONObject2.optString("imgUrl"), jSONObject2.optString("description"), jSONObject2.optString("callback"));
            }
        });
    }
}
