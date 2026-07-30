package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.Shows;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;
import p001D.Sudif;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class mqg0 {

    /* JADX INFO: renamed from: p */
    public static final String f135219p = "SudGIP ".concat(mqg0.class.getSimpleName());

    /* JADX INFO: renamed from: q */
    public static final String[] f135220q = {"https://dev-fqs.sudden.ltd/", "https://dev-fqs.sud.ltd/", "https://dev-fqs-os.sudden.ltd/", "https://dev-fqs.sudcdn.ltd/", "https://dev-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: r */
    public static final String[] f135221r = {"https://fat-fqs.sudden.ltd/", "https://fat-fqs.sud.ltd/", "https://fat-fqs-os.sudden.ltd/", "https://fat-fqs.sudcdn.ltd/", "https://fat-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: s */
    public static final String[] f135222s = {"https://sim-fqs.sudden.ltd/", "https://sim-fqs.sud.ltd/", "https://sim-fqs-os.sudden.ltd/", "https://sim-fqs.sudcdn.ltd/", "https://sim-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: t */
    public static final String[] f135223t = {"https://fqs.sudden.ltd/", "https://fqs.sud.ltd/", "https://fqs-os.sudden.ltd/", "https://fqs.sudcdn.ltd/", "https://fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: k */
    public ArrayList f135234k;

    /* JADX INFO: renamed from: l */
    public tgg0 f135235l;

    /* JADX INFO: renamed from: m */
    public tgg0 f135236m;

    /* JADX INFO: renamed from: a */
    public boolean f135224a = false;

    /* JADX INFO: renamed from: b */
    public String f135225b = "";

    /* JADX INFO: renamed from: c */
    public String f135226c = "";

    /* JADX INFO: renamed from: d */
    public String f135227d = "";

    /* JADX INFO: renamed from: e */
    public String f135228e = "";

    /* JADX INFO: renamed from: f */
    public String f135229f = "";

    /* JADX INFO: renamed from: g */
    public String f135230g = "";

    /* JADX INFO: renamed from: h */
    public String f135231h = "";

    /* JADX INFO: renamed from: i */
    public String f135232i = "";

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f135233j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    public final ArrayList f135237n = new ArrayList(0);

    /* JADX INFO: renamed from: o */
    public final HashMap f135238o = new HashMap();

    public mqg0() {
        m155902z();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m155892A(qbg0 qbg0Var, ndg0 ndg0Var, String str) {
        int i = qbg0Var.f153647a;
        if (i == 0) {
            ndg0Var.onSuccess(str);
        } else {
            ndg0Var.onFailure(i, qbg0Var.f153648b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Sudif m155893a(JSONObject jSONObject) throws JSONException {
        Sudif sudif = new Sudif();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sudif.f210102Suddo.put(next, jSONObject.getString(next));
        }
        return sudif;
    }

    /* JADX INFO: renamed from: b */
    public static String m155894b(String str, String str2, String str3, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var) throws IOException {
        sx3 sx3VarMo144849a = lkg0.f128531b.mo144849a(m155897e(str3, tog0Var, tgg0Var).m185898q(str).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), str2)).m185883b());
        if (f6g0Var != null) {
            f6g0Var.f96123a = sx3VarMo144849a;
        }
        gxc0 gxc0VarM118606k = sx3VarMo144849a.execute().m118606k();
        Objects.requireNonNull(gxc0VarM118606k);
        String strString = gxc0VarM118606k.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str3);
        SudLogger.m221565d(f135219p, "url=" + str + " request-id=" + str3);
        return strString;
    }

    /* JADX INFO: renamed from: c */
    public static String m155895c(String str, String str2, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var) throws IOException {
        sx3 sx3VarMo144849a = lkg0.f128531b.mo144849a(m155897e(str2, tog0Var, tgg0Var).m185898q(str).m185887f().m185883b());
        if (f6g0Var != null) {
            f6g0Var.f96123a = sx3VarMo144849a;
        }
        gxc0 gxc0VarM118606k = sx3VarMo144849a.execute().m118606k();
        Objects.requireNonNull(gxc0VarM118606k);
        String strString = gxc0VarM118606k.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str2);
        SudLogger.m221565d(f135219p, "url=" + str + " request-id=" + str2);
        return strString;
    }

    /* JADX INFO: renamed from: d */
    public static String m155896d(String[] strArr, int i) {
        if (strArr != null && strArr.length != 0) {
            int i2 = i > 0 ? i - 1 : 0;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static stc0.C20027a m155897e(String str, tog0 tog0Var, o3f o3fVar) {
        stc0.C20027a c20027aM185882a = new stc0.C20027a().m185882a("sud-sdk-version", "1.6.7.1286").m185882a("sud-sdk-version-alias", "v1.6.7.1286-static");
        String str2 = mlg0.f134426a;
        stc0.C20027a c20027aM185882a2 = c20027aM185882a.m185882a("sud-sdk-platform", String.valueOf(2)).m185882a("sud-sdk-app-id", mlg0.f134432g).m185882a("sud-sdk-bundle-id", mlg0.m155145d()).m185882a("sud-sdk-trace-id", mlg0.f134435j).m185882a("sud-sdk-request-id", str).m185882a("sud-sdk-user-id", xlg0.f193417a).m185882a("sud-sdk-sud-is-dynamic", String.valueOf(false)).m185882a("sud-sdk-et-is-dynamic", String.valueOf(false)).m185882a(HttpHeaders.REFERER, dog0.m112806b(str)).m185882a("sud-device-brand", ghg0.m126182a(hig0.m131254a())).m185882a("sud-os-version", hig0.m131257d()).m185882a("sud-device-id", hig0.m131256c());
        c20027aM185882a2.m185896o(tog0.class, tog0Var);
        if (o3fVar != null) {
            c20027aM185882a2.m185896o(o3f.class, o3fVar);
        }
        return c20027aM185882a2;
    }

    /* JADX INFO: renamed from: h */
    public static void m155898h(int i, nkg0 nkg0Var, rdg0 rdg0Var, String str) {
        ymg0 ymg0Var;
        j9g0 j9g0Var;
        if (i != 0) {
            xcg0 xcg0Var = (xcg0) nkg0Var;
            SudLogger.m221565d(xcg0Var.f192232a.f113927a, "onFailure：" + str + "(" + i + ")");
            LogUtils.file("SudGIPWebSocket", "onFailure：" + str + "(" + i + ")");
            xcg0Var.f192232a.m137077b(3000L);
            return;
        }
        xcg0 xcg0Var2 = (xcg0) nkg0Var;
        if (rdg0Var != null) {
            xcg0Var2.getClass();
            if (!TextUtils.isEmpty(rdg0Var.f158912a)) {
                img0 img0Var = xcg0Var2.f192232a;
                String str2 = rdg0Var.f158912a;
                SudLogger.m221565d(img0Var.f113927a, "connectWebSocket curIsRunning:" + img0Var.f113932f.get());
                LogUtils.file("SudGIPWebSocket", "connectWebSocket curIsRunning:" + img0Var.f113932f.get());
                if (img0Var.f113932f.get()) {
                    if (img0Var.f113934h != null) {
                        SudLogger.m221565d(img0Var.f113927a, "connectWebSocket 已存在WebSocket无需重复连接");
                        LogUtils.file("SudGIPWebSocket", "connectWebSocket 已存在WebSocket无需重复连接");
                        return;
                    }
                    asg0 asg0Var = mlg0.f134430e;
                    String str3 = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (j9g0Var = ymg0Var.f199002d) == null) ? null : j9g0Var.f116903f;
                    if (TextUtils.isEmpty(str3)) {
                        img0Var.m137077b(3000L);
                        return;
                    }
                    String string = Uri.parse(str3).buildUpon().appendQueryParameter("mgid", img0Var.f113930d + "").appendQueryParameter("roomid", img0Var.f113929c + "").build().toString();
                    StringBuilder sb = new StringBuilder("connectWebSocket:");
                    sb.append(string);
                    LogUtils.file("SudGIPWebSocket", sb.toString());
                    stc0 stc0VarM185883b = new stc0.C20027a().m185898q(string).m185882a("Authorization", "Bearer " + str2).m185883b();
                    rmg0 rmg0Var = new rmg0();
                    rmg0Var.f160096c = 3;
                    rmg0Var.f160095b.f176392a = "SudGIPWsHttpLoggingInterceptor";
                    k850.C17954b c17954b = new k850.C17954b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    img0Var.f113934h = c17954b.m144895p(10L, timeUnit).m144880a(rmg0Var).m144899t(100L, timeUnit).m144903x(100L, timeUnit).m144882c().m144868x(stc0VarM185883b, new qig0(img0Var));
                    return;
                }
                return;
            }
        }
        xcg0Var2.f192232a.m137077b(3000L);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m155899i(int i, qmg0 qmg0Var, String str) {
        if (i == 0) {
            qmg0Var.getClass();
        } else {
            qmg0Var.getClass();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m155900r(qbg0 qbg0Var, ndg0 ndg0Var, String str) {
        int i = qbg0Var.f153647a;
        if (i == 0) {
            ndg0Var.onSuccess(str);
        } else {
            ndg0Var.onFailure(i, qbg0Var.f153648b);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m155901w(JSONObject jSONObject, GameInfo gameInfo) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("mg_info");
        gameInfo.mgId = jSONObject3.getLong("mg_id");
        gameInfo.name = m155893a(jSONObject3.getJSONObject(AuthenticationTokenClaims.JSON_KEY_NAME)).Suddo(mlg0.f134429d);
        gameInfo.version = jSONObject3.getString(WBConstants.AUTH_PARAMS_VERSION);
        gameInfo.orientation = jSONObject3.getInt(Constants.KEY_ORIENTATION);
        gameInfo.screenMode = jSONObject3.getInt("screen_mode");
        gameInfo.url = jSONObject3.getString("url");
        gameInfo.eUrl = jSONObject3.getString("eurl");
        if (jSONObject3.has("auturl")) {
            gameInfo.autUrl = jSONObject3.getString("auturl");
        }
        gameInfo.appID = jSONObject3.getString("game_app_id");
        gameInfo.hash = jSONObject3.getString("hash");
        gameInfo.engine = jSONObject3.getInt("engine");
        if (jSONObject3.has("unity_framework_type")) {
            gameInfo.unityFrameworkType = jSONObject3.getInt("unity_framework_type");
        }
        gameInfo.require = jSONObject3.getString("require").split(com.meituan.robust.Constants.PACKNAME_END);
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("big_loading_pic");
        if (jSONObjectOptJSONObject != null) {
            gameInfo.bigLoadingPic = m155893a(jSONObjectOptJSONObject).Suddo(mlg0.f134429d);
        }
        if (jSONObject3.has("dynamic_config")) {
            gameInfo.dynamicConfig = jSONObject3.getJSONObject("dynamic_config").toString();
        } else {
            gameInfo.dynamicConfig = WeJson.EMPTY_MAP;
        }
        gameInfo.clientVersion = jSONObject3.getLong("client_version");
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("game_large_model_cfg");
        if (jSONObjectOptJSONObject2 != null) {
            pdg0 pdg0Var = new pdg0();
            gameInfo.gameLargeModelCfg = pdg0Var;
            pdg0Var.f148301a = jSONObjectOptJSONObject2.optBoolean("enable_asr");
            gameInfo.gameLargeModelCfg.f148302b = jSONObjectOptJSONObject2.optBoolean("enable_channel");
            gameInfo.gameLargeModelCfg.f148303c = jSONObjectOptJSONObject2.optBoolean("enable_tts");
        }
        lmg0.m150589b(gameInfo.mgId, 0, jSONObject2.optString("log_id"));
        lmg0.m150588a();
    }

    /* JADX INFO: renamed from: z */
    public static void m155902z() {
        lkg0.f128530a.f160096c = 4;
        int i = mlg0.f134431f;
        if (i == 4 || i == 3) {
            rmg0.f160093d = true;
        } else {
            rmg0.f160093d = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m155903B(ISudListenerInitSDK iSudListenerInitSDK, Context context, String str, String str2, boolean z, tgg0 tgg0Var, tgg0 tgg0Var2) {
        int length;
        synchronized (this) {
            try {
                m155918x(iSudListenerInitSDK);
                if (this.f135233j.get()) {
                    return;
                }
                this.f135233j.set(true);
                int i = mlg0.f134431f;
                if (i == 4) {
                    length = f135220q.length;
                } else if (i == 3) {
                    length = f135221r.length;
                } else {
                    length = i == 2 ? f135222s.length : f135223t.length;
                }
                int i2 = length;
                tgg0 tgg0Var3 = this.f135235l;
                if (tgg0Var3 != null && tgg0Var != null) {
                    tgg0Var3.m188813c(tgg0Var);
                    tgg0Var.m188812b(this.f135235l.f170096b);
                }
                tgg0 tgg0Var4 = this.f135236m;
                if (tgg0Var4 != null && tgg0Var2 != null) {
                    tgg0Var4.m188813c(tgg0Var2);
                    tgg0Var2.m188812b(this.f135236m.f170096b);
                }
                m155906j(str, 1, new sog0(this, context, str, str2, z, tgg0Var2, i2, 1, tgg0Var), tgg0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m155904f() {
        this.f135224a = false;
        this.f135225b = "";
        this.f135226c = "";
        this.f135227d = "";
        this.f135228e = "";
        this.f135230g = "";
        this.f135231h = "";
        this.f135229f = "";
        this.f135232i = "";
        this.f135237n.clear();
        this.f135238o.clear();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m155905g(int i, String str) {
        ArrayList arrayList = this.f135234k;
        if (arrayList == null) {
            LogUtils.file("HttpService", "error notifyInitSdkFailure but listenerList is null");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ISudListenerInitSDK) obj).onFailure(i, str);
        }
        this.f135234k = null;
        this.f135233j.set(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m155906j(String str, int i, final sog0 sog0Var, tgg0 tgg0Var) {
        String strM155896d;
        String str2 = this.f135225b;
        if (str2 == null || str2.isEmpty()) {
            int i2 = mlg0.f134431f;
            if (i2 == 4) {
                strM155896d = m155896d(f135220q, i);
            } else if (i2 == 3) {
                strM155896d = m155896d(f135221r, i);
            } else {
                strM155896d = i2 == 2 ? m155896d(f135222s, i) : m155896d(f135223t, i);
            }
            LogUtils.file("HttpService", "getFQSInfo baseUrl:" + strM155896d);
            SudLogger.m221565d(f135219p, "getFQSInfo baseUrl:" + strM155896d);
            final String str3 = strM155896d + yog0.m215499b(str);
            final mcg0 mcg0Var = new mcg0("getFQSInfo");
            final tog0 tog0Var = new tog0();
            mcg0Var.f133124n = tog0Var;
            tgg0 tgg0Var2 = new tgg0();
            this.f135235l = tgg0Var2;
            tgg0Var2.m188813c(tgg0Var);
            this.f135235l.m188812b(str3);
            lkg0.f128532c.execute(new Runnable() { // from class: l.bqg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76778a.m155910n(str3, mcg0Var, tog0Var, sog0Var);
                }
            });
            return;
        }
        mqg0 mqg0Var = sog0Var.f165683i;
        Context context = sog0Var.f165675a;
        String str4 = sog0Var.f165676b;
        String str5 = sog0Var.f165677c;
        boolean z = sog0Var.f165678d;
        tgg0 tgg0Var3 = sog0Var.f165679e;
        if (!mqg0Var.f135224a) {
            bhg0.f75610f.m101835b(context);
            String str6 = mqg0Var.f135225b;
            String packageName = context.getPackageName();
            tgg0 tgg0Var4 = new tgg0();
            mqg0Var.f135236m = tgg0Var4;
            tgg0Var4.m188813c(tgg0Var3);
            mqg0Var.f135236m.m188812b(str6);
            lkg0.f128532c.execute(new pmg0(mqg0Var, str4, str5, packageName, z, str6));
            return;
        }
        synchronized (mqg0Var) {
            try {
                ArrayList arrayList = mqg0Var.f135234k;
                if (arrayList == null) {
                    LogUtils.file("HttpService", "error notifyInitSdkSuccess but listenerList is null");
                    return;
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ISudListenerInitSDK) obj).onSuccess();
                }
                mqg0Var.f135234k = null;
                mqg0Var.f135233j.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m155907k(String str, String str2, String str3, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var, final ndg0 ndg0Var) {
        final String strM155894b;
        final qbg0 qbg0Var = new qbg0();
        try {
            qbg0Var.f153647a = 0;
            qbg0Var.f153648b = "success";
            strM155894b = m155894b(str, str2, str3, tog0Var, tgg0Var, f6g0Var);
        } catch (Exception e) {
            String str4 = "commonPost error :" + LogUtils.getErrorInfo(e);
            SudLogger.m221567e(f135219p, str4);
            LogUtils.file("HttpService", str4);
            if (qbg0Var.f153647a == 0) {
                qbg0Var.f153647a = g6g0.m124589a(e);
                qbg0Var.f153648b = e.toString();
            }
            strM155894b = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.aqg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m155892A(qbg0Var, ndg0Var, strM155894b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m155908l(final String str, final String str2, final qfg0 qfg0Var, final ndg0 ndg0Var, final f6g0 f6g0Var) {
        final String strM215499b = yog0.m215499b(UUID.randomUUID().toString());
        final tog0 tog0Var = new tog0();
        lkg0.f128532c.execute(new Runnable() { // from class: l.vpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182473a.m155907k(str, str2, strM215499b, tog0Var, qfg0Var, f6g0Var, ndg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m155909m(String str, String str2, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var, final ndg0 ndg0Var) {
        final String strM155895c;
        final qbg0 qbg0Var = new qbg0();
        try {
            qbg0Var.f153647a = 0;
            qbg0Var.f153648b = "success";
            strM155895c = m155895c(str, str2, tog0Var, tgg0Var, f6g0Var);
        } catch (Exception e) {
            String str3 = "commonGet error :" + LogUtils.getErrorInfo(e);
            SudLogger.m221567e(f135219p, str3);
            LogUtils.file("HttpService", str3);
            if (qbg0Var.f153647a == 0) {
                qbg0Var.f153647a = g6g0.m124589a(e);
                qbg0Var.f153648b = e.toString();
            }
            strM155895c = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.upg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m155900r(qbg0Var, ndg0Var, strM155895c);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m155910n(String str, mcg0 mcg0Var, tog0 tog0Var, final sog0 sog0Var) {
        Exception exc;
        String strM155895c;
        String string;
        final qbg0 qbg0Var = new qbg0();
        String strOptString = "";
        try {
            qbg0Var.f153647a = 0;
            qbg0Var.f153648b = "success";
            strM155895c = m155895c(str, mcg0Var.f133113c, tog0Var, this.f135235l, null);
            try {
                JSONObject jSONObject = new JSONObject(strM155895c);
                string = jSONObject.getString("url");
                try {
                    if (TextUtils.isEmpty(string)) {
                        qbg0Var.f153647a = -1;
                        qbg0Var.f153648b = "url is null or empty";
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("checker");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("url");
                    }
                } catch (Exception e) {
                    exc = e;
                    String str2 = "fqs error :" + LogUtils.getErrorInfo(exc);
                    SudLogger.m221567e(f135219p, str2);
                    LogUtils.file("HttpService", str2);
                    if (qbg0Var.f153647a == 0) {
                        qbg0Var.f153647a = g6g0.m124589a(exc);
                        qbg0Var.f153648b = exc.toString();
                    }
                    if (strM155895c != null) {
                        mcg0Var.f133114d = strM155895c;
                    } else {
                        mcg0Var.getClass();
                    }
                    mcg0Var.f133115e = qbg0Var.f153647a;
                    String str3 = qbg0Var.f153648b;
                    if (str3 != null) {
                        mcg0Var.f133116f = str3;
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                string = "";
            }
        } catch (Exception e3) {
            exc = e3;
            strM155895c = "";
            string = strM155895c;
        }
        final String str4 = strOptString;
        final String str5 = string;
        xlg0.m209889b(mcg0Var);
        ThreadUtils.postUITask(new Runnable() { // from class: l.dqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87419a.m155913q(qbg0Var, str5, sog0Var, str4);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m155911o(final String str, final qfg0 qfg0Var, final xqg0 xqg0Var, final f6g0 f6g0Var) {
        final String strM215499b = yog0.m215499b(UUID.randomUUID().toString());
        final tog0 tog0Var = new tog0();
        lkg0.f128532c.execute(new Runnable() { // from class: l.cqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f82073a.m155909m(str, strM215499b, tog0Var, qfg0Var, f6g0Var, xqg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m155912p(String str, boolean z) {
        cbg0.m105995a("reportEvent.sp").m105997c(yog0.m215499b(UUID.randomUUID().toString()), str, z);
        String str2 = this.f135231h;
        if (str2 != null && !str2.isEmpty()) {
            lkg0.f128533d.execute(new ang0(this));
        } else {
            LogUtils.file("HttpService", "还未初始化sdk成功，等待上报的数据为：" + str);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m155913q(qbg0 qbg0Var, String str, sog0 sog0Var, String str2) {
        int i;
        this.f135226c = str2;
        if (sog0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("getFQSInfo fail appId=" + mlg0.f134432g);
            sb.append(" isTestEnv=" + mlg0.f134428c);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(" ret_code=" + qbg0Var.f153647a);
            sb.append(" null == getSDKTokenUrl || getSDKTokenUrl.isEmpty(), Please contact SUD, Open production environment service");
            String str3 = qbg0Var.f153648b;
            if (str3 != null) {
                sb.append(str3);
            }
            int i2 = qbg0Var.f153647a;
            String string = sb.toString();
            int i3 = sog0Var.f165680f;
            if (i3 <= 0 || (i = sog0Var.f165681g) >= i3) {
                sog0Var.f165683i.m155905g(i2, string);
            } else {
                mqg0 mqg0Var = sog0Var.f165683i;
                Context context = sog0Var.f165675a;
                String str4 = sog0Var.f165676b;
                String str5 = sog0Var.f165677c;
                boolean z = sog0Var.f165678d;
                int i4 = i + 1;
                tgg0 tgg0Var = sog0Var.f165682h;
                tgg0 tgg0Var2 = sog0Var.f165679e;
                tgg0 tgg0Var3 = mqg0Var.f135235l;
                if (tgg0Var3 != null && tgg0Var != null) {
                    tgg0Var3.m188813c(tgg0Var);
                    tgg0Var.m188812b(mqg0Var.f135235l.f170096b);
                }
                tgg0 tgg0Var4 = mqg0Var.f135236m;
                if (tgg0Var4 != null && tgg0Var2 != null) {
                    tgg0Var4.m188813c(tgg0Var2);
                    tgg0Var2.m188812b(mqg0Var.f135236m.f170096b);
                }
                mqg0Var.m155906j(str4, i4, new sog0(mqg0Var, context, str4, str5, z, tgg0Var2, i3, i4, tgg0Var), tgg0Var);
            }
        } else {
            this.f135225b = str;
            mqg0 mqg0Var2 = sog0Var.f165683i;
            Context context2 = sog0Var.f165675a;
            String str6 = sog0Var.f165676b;
            String str7 = sog0Var.f165677c;
            boolean z2 = sog0Var.f165678d;
            tgg0 tgg0Var5 = sog0Var.f165679e;
            if (mqg0Var2.f135224a) {
                synchronized (mqg0Var2) {
                    try {
                        ArrayList arrayList = mqg0Var2.f135234k;
                        if (arrayList == null) {
                            LogUtils.file("HttpService", "error notifyInitSdkSuccess but listenerList is null");
                        } else {
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayList.get(i5);
                                i5++;
                                ((ISudListenerInitSDK) obj).onSuccess();
                            }
                            mqg0Var2.f135234k = null;
                            mqg0Var2.f135233j.set(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                bhg0.f75610f.m101835b(context2);
                String str8 = mqg0Var2.f135225b;
                String packageName = context2.getPackageName();
                tgg0 tgg0Var6 = new tgg0();
                mqg0Var2.f135236m = tgg0Var6;
                tgg0Var6.m188813c(tgg0Var5);
                mqg0Var2.f135236m.m188812b(str8);
                lkg0.f128532c.execute(new pmg0(mqg0Var2, str6, str7, packageName, z2, str8));
            }
        }
        this.f135235l = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m155914s(qdg0 qdg0Var, mcg0 mcg0Var, tog0 tog0Var, final nkg0 nkg0Var) {
        final rdg0 rdg0Var = new rdg0();
        String str = "";
        final String string = "success";
        final int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, qdg0Var.f153930a);
            jSONObject.put(Oauth2AccessToken.KEY_UID, qdg0Var.f153930a);
            String string2 = jSONObject.toString();
            String str2 = this.f135229f;
            String str3 = mcg0Var.f133113c;
            stc0.C20027a c20027aM185893l = m155897e(str3, tog0Var, null).m185898q(str2).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), string2));
            lkg0.m150267a(c20027aM185893l);
            gxc0 gxc0VarM118606k = lkg0.f128531b.mo144849a(c20027aM185893l.m185883b()).execute().m118606k();
            Objects.requireNonNull(gxc0VarM118606k);
            String strString = gxc0VarM118606k.string();
            LogUtils.file("HttpService", "url=" + str2 + " request-id=" + str3);
            SudLogger.m221565d(f135219p, "url=" + str2 + " request-id=" + str3);
            try {
                JSONObject jSONObject2 = new JSONObject(strString);
                i = jSONObject2.getInt("ret_code");
                string = jSONObject2.optString("ret_msg");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    rdg0Var.f158912a = jSONObjectOptJSONObject.optString("access_token");
                    jSONObjectOptJSONObject.optInt("expires_in");
                }
            } catch (Exception e) {
                e = e;
                str = strString;
                String str4 = "fqs error :" + LogUtils.getErrorInfo(e);
                SudLogger.m221567e(f135219p, str4);
                LogUtils.file("HttpService", str4);
                if (i == 0) {
                    int iM124589a = g6g0.m124589a(e);
                    string = e.toString();
                    i = iM124589a;
                }
                if (str != null) {
                    mcg0Var.f133114d = str;
                } else {
                    mcg0Var.getClass();
                }
                mcg0Var.f133115e = i;
                if (string != null) {
                    mcg0Var.f133116f = string;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.zpg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m155898h(i, nkg0Var, rdg0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m155915t(final qdg0 qdg0Var, final xcg0 xcg0Var) {
        final mcg0 mcg0Var = new mcg0("getGateToken");
        final tog0 tog0Var = new tog0();
        mcg0Var.f133124n = tog0Var;
        lkg0.f128532c.execute(new Runnable() { // from class: l.tpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171473a.m155914s(qdg0Var, mcg0Var, tog0Var, xcg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m155916u(final vgg0 vgg0Var, final ufg0 ufg0Var) {
        lkg0.f128532c.execute(new Runnable() { // from class: l.xpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193916a.m155917v(vgg0Var, ufg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m155917v(vgg0 vgg0Var, final qmg0 qmg0Var) {
        final String string;
        ymg0 ymg0Var;
        l7g0 l7g0Var;
        final int iM124589a = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, yog0.m215499b(UUID.randomUUID().toString()));
            jSONObject.put("mg_id", vgg0Var.f181366a);
            jSONObject.put("room_id", vgg0Var.f181367b);
            jSONObject.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Oauth2AccessToken.KEY_UID, vgg0Var.f181368c);
            jSONObject2.put("nickname", vgg0Var.f181369d);
            jSONObject.put(Shows.sender, jSONObject2);
            jSONObject.put("content", vgg0Var.f181370e);
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (vgg0Var.f181371f != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("asr_duration", vgg0Var.f181371f.f149989a);
                jSONObject3.put("end_time", vgg0Var.f181371f.f149990b);
                jSONObject3.put("log_id", vgg0Var.f181371f.f149991c);
                jSONObject3.put("start_time", vgg0Var.f181371f.f149992d);
                jSONObject3.put("audio_start_time", vgg0Var.f181371f.f149993e);
                jSONObject3.put("audio_end_time", vgg0Var.f181371f.f149994f);
                jSONObject.put("metrics", jSONObject3);
            }
            String string2 = jSONObject.toString();
            asg0 asg0Var = mlg0.f134430e;
            String str = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (l7g0Var = ymg0Var.f199011m) == null) ? null : l7g0Var.f126722d;
            String strM215499b = yog0.m215499b(UUID.randomUUID().toString());
            stc0.C20027a c20027aM185893l = m155897e(strM215499b, new tog0(), null).m185898q(str).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), string2));
            lkg0.m150267a(c20027aM185893l);
            gxc0 gxc0VarM118606k = lkg0.f128531b.mo144849a(c20027aM185893l.m185883b()).execute().m118606k();
            Objects.requireNonNull(gxc0VarM118606k);
            String strString = gxc0VarM118606k.string();
            LogUtils.file("HttpService", "url=" + str + " request-id=" + strM215499b);
            SudLogger.m221565d(f135219p, "url=" + str + " request-id=" + strM215499b);
            JSONObject jSONObject4 = new JSONObject(strString);
            iM124589a = jSONObject4.getInt("ret_code");
            string = jSONObject4.optString("ret_msg");
        } catch (Exception e) {
            String str2 = "fqs error :" + LogUtils.getErrorInfo(e);
            SudLogger.m221567e(f135219p, str2);
            LogUtils.file("HttpService", str2);
            if (iM124589a == 0) {
                iM124589a = g6g0.m124589a(e);
                string = e.toString();
            } else {
                string = "success";
            }
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.ypg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m155899i(iM124589a, qmg0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m155918x(ISudListenerInitSDK iSudListenerInitSDK) {
        if (iSudListenerInitSDK == null) {
            return;
        }
        try {
            if (this.f135234k == null) {
                this.f135234k = new ArrayList();
            }
            this.f135234k.add(iSudListenerInitSDK);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m155919y(final ISudListenerInitSDK iSudListenerInitSDK, final Context context, final String str, final String str2, final boolean z, final tgg0 tgg0Var, final tgg0 tgg0Var2) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.wpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187506a.m155903B(iSudListenerInitSDK, context, str, str2, z, tgg0Var, tgg0Var2);
            }
        });
    }
}
