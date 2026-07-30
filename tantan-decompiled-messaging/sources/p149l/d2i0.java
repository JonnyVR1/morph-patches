package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.sign.TencentSignActivity;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p069ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;
import p147v.navigationbar.VNavigationBar;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class d2i0 extends e400 {

    /* JADX INFO: renamed from: l.d2i0$a */
    public class C16291a implements f30<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f83388a;

        public C16291a(String str) {
            this.f83388a = str;
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, String str2) {
            d2i0.this.m114660y(TextUtils.isEmpty(this.f83388a) ? "adtp" : this.f83388a, str, str2);
        }
    }

    /* JADX INFO: renamed from: l.d2i0$b */
    public class RunnableC16292b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f83390a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f83391b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f83392c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f83393d;

        /* JADX INFO: renamed from: l.d2i0$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(RunnableC16292b.this.f83393d)) {
                    return;
                }
                RunnableC16292b runnableC16292b = RunnableC16292b.this;
                d2i0.this.m114659x(runnableC16292b.f83393d);
            }
        }

        public RunnableC16292b(coq coqVar, VNavigationBar vNavigationBar, String str, String str2) {
            this.f83390a = coqVar;
            this.f83391b = vNavigationBar;
            this.f83392c = str;
            this.f83393d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f83390a.mo102960b()) {
                return;
            }
            this.f83391b.setVisibility(0);
            this.f83391b.setTitle(this.f83392c);
            this.f83391b.getTitleContainer().setOnClickListener(new a());
            this.f83390a.mo102959a().setTag(s4c0.f162302J0, new Object());
        }
    }

    /* JADX INFO: renamed from: l.d2i0$c */
    public class RunnableC16293c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f83396a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f83397b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f83398c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f83399d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f83400e;

        /* JADX INFO: renamed from: l.d2i0$c$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunnableC16293c runnableC16293c = RunnableC16293c.this;
                d2i0.this.m114659x(runnableC16293c.f83399d);
            }
        }

        /* JADX INFO: renamed from: l.d2i0$c$b */
        public class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f83403a;

            public b(String str) {
                this.f83403a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d2i0.this.m114659x(this.f83403a);
            }
        }

        public RunnableC16293c(coq coqVar, VNavigationBar vNavigationBar, String str, String str2, String str3) {
            this.f83396a = coqVar;
            this.f83397b = vNavigationBar;
            this.f83398c = str;
            this.f83399d = str2;
            this.f83400e = str3;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m109809d(String str, View view) {
            d2i0.this.m114659x(str);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m109810e(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar, String str) {
            if (!coqVar.mo102960b() && NullChecker.m81304b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                int i = t100.f167230E;
                vNavigationBar.m223587v(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)), new b(str));
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m109811f(final coq coqVar, final VNavigationBar vNavigationBar, final String str, final Bitmap bitmap) {
            e51.m114748M(new Runnable() { // from class: l.g2i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100266a.m109810e(coqVar, bitmap, vNavigationBar, str);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f83396a.mo102960b()) {
                return;
            }
            this.f83397b.setVisibility(0);
            this.f83397b.m223584B();
            if (!TextUtils.isEmpty(this.f83398c)) {
                TextView textView = (TextView) LayoutInflater.from(this.f83396a.mo102961c()).inflate(e6c0.f89519A, (ViewGroup) null);
                textView.setText(this.f83398c);
                textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                final String str = this.f83399d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: l.e2i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88923a.m109809d(str, view);
                    }
                });
                textView.setOnClickListener(new a());
                this.f83397b.m223589z(textView);
            }
            if (TextUtils.isEmpty(this.f83400e)) {
                return;
            }
            C22306c<Bitmap> c22306cM102316E = qib0.f154691G.m102316E(this.f83400e);
            final coq coqVar = this.f83396a;
            final VNavigationBar vNavigationBar = this.f83397b;
            final String str2 = this.f83399d;
            c22306cM102316E.subscribe(mkd0.m154955G(new e30() { // from class: l.f2i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94182a.m109811f(coqVar, vNavigationBar, str2, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.d2i0$d */
    public class RunnableC16294d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ coq f83405a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f83406b;

        public RunnableC16294d(coq coqVar, VNavigationBar vNavigationBar) {
            this.f83405a = coqVar;
            this.f83406b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f83405a.mo102960b()) {
                return;
            }
            this.f83406b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.d2i0$e */
    public class ViewOnClickListenerC16295e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f83408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f83409b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ coq f83410c;

        public ViewOnClickListenerC16295e(String str, boolean z, coq coqVar) {
            this.f83408a = str;
            this.f83409b = z;
            this.f83410c = coqVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f83408a)) {
                d2i0.this.m114659x(this.f83408a);
            }
            if (this.f83409b) {
                return;
            }
            this.f83410c.mo102961c().m66873d2();
        }
    }

    public d2i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m109753C(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("eid");
        String strOptString3 = jSONObject.optString("pageId");
        try {
            jSONObject2 = (JSONObject) jSONObject.opt("extras");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            jSONObject2 = null;
        }
        fkp0.m121885e(strOptString, strOptString2, strOptString3, jSONObject2);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109755E(coq coqVar, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!coqVar.mo102960b() && NullChecker.m81304b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.f167230E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m109756F(JSONObject jSONObject, f400 f400Var) {
        String queryParameter;
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        try {
            queryParameter = Uri.parse(strOptString).getQueryParameter("_bid");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            queryParameter = null;
        }
        Intent intentM80236a2 = NullChecker.m81303a(queryParameter) ? MkWebViewAct.m80236a2(f400Var.mo102961c(), "", strOptString) : WebViewAct.m80164Z1(f400Var.mo102961c(), "", strOptString);
        m109768R(intentM80236a2, strOptString);
        f400Var.mo102961c().startActivity(intentM80236a2);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m109763M(Act act, String str) {
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

    /* JADX INFO: renamed from: R */
    public static void m109768R(@NonNull Intent intent, @NonNull String str) {
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
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m109769A0(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("context");
        jSONObject.optInt(BLiveOperationTitleShowType.duration);
        lsi0.m151595y(strOptString);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m109770B0(final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.y1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m109753C(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m109771S(@NonNull f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        e51.m114748M(new Runnable() { // from class: l.p1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m109763M(putongActMo102961c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m109772T(@NonNull final f400 f400Var) {
        e51.m114748M(new Runnable() { // from class: l.z1i0
            @Override // java.lang.Runnable
            public final void run() {
                f400Var.mo102961c().m66873d2();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final VNavigationBar m109773U(@NonNull coq coqVar) {
        if (!(coqVar.mo102961c() instanceof MkWebViewAct) && !(coqVar.mo102961c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (coqVar.mo102961c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) coqVar.mo102961c().findViewById(s4c0.f162321Y);
        }
        if (coqVar.mo102961c() instanceof MkWebViewAct) {
            return (VNavigationBar) coqVar.mo102961c().findViewById(s4c0.f162321Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final String m109774V() {
        return "[" + ABManager.m29349i() + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: W */
    public final String m109775W(JSONObject jSONObject) {
        return ipq.m137568d(jSONObject.optString("url", null), jSONObject.optString("body", null));
    }

    /* JADX INFO: renamed from: X */
    public final String m109776X() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(mu5.m156378c(), "tantanapp")) {
                jSONObject.put("env", "online");
            } else {
                jSONObject.put("env", "staging");
            }
            jSONObject.put("pkgType", BuildConfig.BUILD_TYPE);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: Y */
    public final String m109777Y(@NonNull f400 f400Var) {
        return gd20.m125535b(f400Var.mo102961c());
    }

    /* JADX INFO: renamed from: Z */
    public final String m109778Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", qib0.f154744z.get());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a0 */
    public final String m109779a0(@NonNull f400 f400Var) {
        List<String> listM79951R = ShareHelper.m79951R(f400Var.mo102961c());
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

    /* JADX INFO: renamed from: b0 */
    public final String m109780b0(@NonNull f400 f400Var) {
        PhoneNumber phoneNumber;
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        User userQueryMe = qib0.f154714c0.queryMe();
        String str = userQueryMe.f56011id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.m60124fp() == null ? null : userQueryMe.m60124fp().url;
        Profile profile = userQueryMe.profile;
        ProfileZodiac profileZodiac = profile == null ? null : profile.zodiac;
        String strName2 = profileZodiac == null ? null : profileZodiac.name();
        String strM133869j0 = profileZodiac != null ? i0g0.m133869j0(profileZodiac) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", f400Var.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.KEY_KEY, strName2);
            jSONObject2.put("value", strM133869j0);
            jSONObject.put(ProfileLikeCategoryType.zodiac, jSONObject2);
            jSONObject.put(SeeTextDynamicParam.age, num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.m28108d(qib0.f154717f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m109781c0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.v1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179253a.m109782d0(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m109782d0(f400 f400Var, JSONObject jSONObject) {
        f400Var.mo102961c().m66873d2();
        m109794p0(f400Var, jSONObject.optString("url"), jSONObject.optString("title"));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m109783e0(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m114660y(str, str2, str3);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m109784f0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m79961b0(ShareHelper.m79958Y(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m114660y(str2, str3, str4);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m109785g0(JSONObject jSONObject, f400 f400Var) {
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
        new ShareHelper(link).m80016t0(new f30() { // from class: l.r1i0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f157279a.m109783e0(strOptString5, (String) obj, (String) obj2);
            }
        }).m80017u0(new g30() { // from class: l.s1i0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f161899a.m109784f0(strOptString7, strOptString6, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m80018v0(f400Var.mo102961c(), null, strOptString2, strOptString3, ShareHelper.m79958Y(strOptString7), false, strOptString4);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m109786h0(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("title");
        if ("tencentSign".equals(Uri.parse(strOptString).getQueryParameter("action"))) {
            f400Var.mo102961c().startActivity(TencentSignActivity.INSTANCE.m80039a(f400Var.mo102961c(), strOptString, strOptString2));
        } else {
            m109794p0(f400Var, strOptString, strOptString2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m109787i0(String str) {
        m114659x(str);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m109788j0(JSONObject jSONObject, f400 f400Var) {
        m109803y0(f400Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m109789k0(String str, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m79961b0(ShareHelper.m79957X(str), th);
        if (TextUtils.isEmpty(str2)) {
            str2 = "adtp";
        }
        m114660y(str2, str3, str4);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m109790l0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.a2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f67265a.m109785g0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m109791m0(@NonNull f400 f400Var, JSONObject jSONObject) {
        if (NullChecker.m81303a(Act.foreground_() == null ? null : Act.foreground_().f15343a.get())) {
            Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(f400Var.mo102961c(), "", jSONObject.optString("url"));
            intentM80228X1.putExtra("hideNavigationBar", true);
            intentM80228X1.putExtra("skipLoading", true);
            intentM80228X1.putExtra("transparent_status_bar", true);
            intentM80228X1.putExtra("webviewColor", "transparent");
            intentM80228X1.putExtra("hideNotch", true);
            f400Var.mo102961c().startActivity(intentM80228X1);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
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
                m114661z(jSONObject, m109775W(jSONObject));
                return true;
            case 1:
                m109798t0(f400Var, jSONObject);
                return true;
            case 2:
                m109781c0(f400Var, jSONObject);
                return true;
            case 3:
                m109769A0(jSONObject);
                return true;
            case 4:
                m114661z(jSONObject, m109778Z());
                return true;
            case 5:
                m109771S(f400Var, jSONObject);
                return true;
            case 6:
                m109792n0(f400Var, jSONObject);
                return true;
            case 7:
                m114661z(jSONObject, m109774V());
                return true;
            case 8:
                m114661z(jSONObject, m109776X());
                return true;
            case 9:
                m109791m0(f400Var, jSONObject);
                return true;
            case 10:
                m109796r0(f400Var, jSONObject);
                return true;
            case 11:
                m109772T(f400Var);
                return true;
            case 12:
                m109802x0(f400Var, jSONObject);
                return true;
            case 13:
                m109793o0(f400Var, jSONObject);
                return true;
            case 14:
                m109804z0(f400Var, jSONObject);
                return true;
            case 15:
                m109770B0(jSONObject);
                return true;
            case 16:
                m109799u0(f400Var, jSONObject);
                return true;
            case 17:
                m114661z(jSONObject, m109777Y(f400Var));
                return true;
            case 18:
                m109790l0(f400Var, jSONObject);
                return true;
            case 19:
                m114661z(jSONObject, m109780b0(f400Var));
                return true;
            case 20:
                m114661z(jSONObject, m109779a0(f400Var));
                return true;
            case 21:
                m109801w0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m109792n0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.u1i0
            @Override // java.lang.Runnable
            public final void run() {
                d2i0.m109756F(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final void m109793o0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.w1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184012a.m109786h0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m109794p0(@NonNull coq coqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            j2e0.m139446m(coqVar.mo102961c(), Uri.parse(str));
            return;
        }
        Intent intentM80164Z1 = WebViewAct.m80164Z1(coqVar.mo102961c(), str2, str);
        m109768R(intentM80164Z1, str);
        coqVar.mo102961c().startActivity(intentM80164Z1);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m109795q0(@NonNull final coq coqVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        final VNavigationBar vNavigationBarM109773U = m109773U(coqVar);
        if (vNavigationBarM109773U == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m114659x(str5);
            return;
        }
        e51.m114748M(new RunnableC16294d(coqVar, vNavigationBarM109773U));
        if (!TextUtils.isEmpty(str)) {
            qib0.f154691G.m102316E(str).subscribe(mkd0.m154955G(new e30() { // from class: l.o1i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e51.m114748M(new Runnable() { // from class: l.q1i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            d2i0.m109755E(coqVar, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM109773U.setLeftIconOnClick(new ViewOnClickListenerC16295e(str3, z, coqVar));
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        m114659x(str4);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m109796r0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m109797s0(f400Var, jSONObject.optString("imgUrl"), jSONObject.optString("text"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m109797s0(@NonNull coq coqVar, String str, String str2, String str3, String str4, String str5) {
        VNavigationBar vNavigationBarM109773U = m109773U(coqVar);
        if (vNavigationBarM109773U == null) {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            m114659x(str5);
        } else {
            e51.m114748M(new RunnableC16293c(coqVar, vNavigationBarM109773U, str2, str3, str));
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m114659x(str4);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m109798t0(@NonNull f400 f400Var, JSONObject jSONObject) {
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
        if (m109773U(f400Var) == null) {
            if (TextUtils.isEmpty(strOptString10)) {
                return;
            }
            m114659x(strOptString10);
        } else {
            m109800v0(f400Var, strOptString, strOptString2, "", "");
            m109795q0(f400Var, strOptString3, strOptString4, strOptString5, "", "", zOptBoolean);
            m109797s0(f400Var, strOptString6, strOptString7, strOptString8, "", "");
            if (TextUtils.isEmpty(strOptString9)) {
                return;
            }
            m114659x(strOptString9);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m109799u0(@NonNull f400 f400Var, JSONObject jSONObject) {
        m109800v0(f400Var, jSONObject.optString("title"), jSONObject.optString("handler"), jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m109800v0(@NonNull coq coqVar, String str, String str2, String str3, String str4) {
        VNavigationBar vNavigationBarM109773U = m109773U(coqVar);
        if (vNavigationBarM109773U == null) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            m114659x(str4);
        } else {
            e51.m114748M(new RunnableC16292b(coqVar, vNavigationBarM109773U, str, str2));
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            m114659x(str3);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m109801w0(@NonNull f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("handler");
        f400Var.mo102959a().setTag(WebViewBridgeImplementation.f54602a, TextUtils.isEmpty(strOptString) ? null : new Runnable() { // from class: l.x1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f189076a.m109787i0(strOptString);
            }
        });
        f400Var.mo102961c().setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m109802x0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.b2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72701a.m109788j0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m109803y0(@NonNull coq coqVar, String str, String str2, String str3, String str4, final String str5, String str6, final String str7) {
        Link link = new Link();
        link.href = str;
        new ShareHelper(link).m80016t0(new C16291a(str6)).m80017u0(new g30() { // from class: l.t1i0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f167347a.m109789k0(str5, str7, (String) obj, (String) obj2, (Throwable) obj3);
            }
        }).m80018v0(coqVar.mo102961c(), null, str2, str3, ShareHelper.m79957X(str5), false, str4);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m109804z0(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.c2i0
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                ShareHelper.m79949N(f400Var.mo102961c(), jSONObject2.optString("url"), jSONObject2.optString("title"), jSONObject2.optString("imgUrl"), jSONObject2.optString("description"), jSONObject2.optString("callback"));
            }
        });
    }
}
