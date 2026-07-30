package p003l;

import D.Sudif;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l.asg0;
import l.bhg0;
import l.cbg0;
import l.dog0;
import l.g6g0;
import l.ghg0;
import l.gxc0;
import l.hig0;
import l.hyx;
import l.img0;
import l.j9g0;
import l.k850;
import l.l7g0;
import l.lmg0;
import l.mcg0;
import l.mlg0;
import l.o3f;
import l.qbg0;
import l.qfg0;
import l.qig0;
import l.stc0;
import l.sx3;
import l.ufg0;
import l.utc0;
import l.xcg0;
import l.xlg0;
import l.xqg0;
import l.ymg0;
import l.yog0;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mqg0 {

    /* JADX INFO: renamed from: p */
    public static final String f5721p = "SudGIP ".concat(mqg0.class.getSimpleName());

    /* JADX INFO: renamed from: q */
    public static final String[] f5722q = {"https://dev-fqs.sudden.ltd/", "https://dev-fqs.sud.ltd/", "https://dev-fqs-os.sudden.ltd/", "https://dev-fqs.sudcdn.ltd/", "https://dev-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: r */
    public static final String[] f5723r = {"https://fat-fqs.sudden.ltd/", "https://fat-fqs.sud.ltd/", "https://fat-fqs-os.sudden.ltd/", "https://fat-fqs.sudcdn.ltd/", "https://fat-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: s */
    public static final String[] f5724s = {"https://sim-fqs.sudden.ltd/", "https://sim-fqs.sud.ltd/", "https://sim-fqs-os.sudden.ltd/", "https://sim-fqs.sudcdn.ltd/", "https://sim-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: t */
    public static final String[] f5725t = {"https://fqs.sudden.ltd/", "https://fqs.sud.ltd/", "https://fqs-os.sudden.ltd/", "https://fqs.sudcdn.ltd/", "https://fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: k */
    public ArrayList f5736k;

    /* JADX INFO: renamed from: l */
    public tgg0 f5737l;

    /* JADX INFO: renamed from: m */
    public tgg0 f5738m;

    /* JADX INFO: renamed from: a */
    public boolean f5726a = false;

    /* JADX INFO: renamed from: b */
    public String f5727b = "";

    /* JADX INFO: renamed from: c */
    public String f5728c = "";

    /* JADX INFO: renamed from: d */
    public String f5729d = "";

    /* JADX INFO: renamed from: e */
    public String f5730e = "";

    /* JADX INFO: renamed from: f */
    public String f5731f = "";

    /* JADX INFO: renamed from: g */
    public String f5732g = "";

    /* JADX INFO: renamed from: h */
    public String f5733h = "";

    /* JADX INFO: renamed from: i */
    public String f5734i = "";

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f5735j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    public final ArrayList f5739n = new ArrayList(0);

    /* JADX INFO: renamed from: o */
    public final HashMap f5740o = new HashMap();

    public mqg0() {
        m6431z();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6421A(qbg0 qbg0Var, ndg0 ndg0Var, String str) {
        int i = qbg0Var.a;
        if (i == 0) {
            ndg0Var.onSuccess(str);
        } else {
            ndg0Var.onFailure(i, qbg0Var.b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Sudif m6422a(JSONObject jSONObject) throws JSONException {
        Sudif sudif = new Sudif();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sudif.Suddo.put(next, jSONObject.getString(next));
        }
        return sudif;
    }

    /* JADX INFO: renamed from: b */
    public static String m6423b(String str, String str2, String str3, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var) {
        sx3 sx3VarA = lkg0.f5323b.a(m6426e(str3, tog0Var, tgg0Var).q(str).l(utc0.create(hyx.c("application/json; charset=utf-8"), str2)).b());
        if (f6g0Var != null) {
            f6g0Var.f3457a = sx3VarA;
        }
        gxc0 gxc0VarK = sx3VarA.execute().k();
        Objects.requireNonNull(gxc0VarK);
        String strString = gxc0VarK.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str3);
        SudLogger.m10032d(f5721p, "url=" + str + " request-id=" + str3);
        return strString;
    }

    /* JADX INFO: renamed from: c */
    public static String m6424c(String str, String str2, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var) {
        sx3 sx3VarA = lkg0.f5323b.a(m6426e(str2, tog0Var, tgg0Var).q(str).f().b());
        if (f6g0Var != null) {
            f6g0Var.f3457a = sx3VarA;
        }
        gxc0 gxc0VarK = sx3VarA.execute().k();
        Objects.requireNonNull(gxc0VarK);
        String strString = gxc0VarK.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str2);
        SudLogger.m10032d(f5721p, "url=" + str + " request-id=" + str2);
        return strString;
    }

    /* JADX INFO: renamed from: d */
    public static String m6425d(String[] strArr, int i) {
        if (strArr != null && strArr.length != 0) {
            int i2 = i > 0 ? i - 1 : 0;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static stc0.a m6426e(String str, tog0 tog0Var, o3f o3fVar) {
        stc0.a aVarA = new stc0.a().a("sud-sdk-version", "1.6.7.1286").a("sud-sdk-version-alias", "v1.6.7.1286-static");
        String str2 = mlg0.a;
        stc0.a aVarA2 = aVarA.a("sud-sdk-platform", String.valueOf(2)).a("sud-sdk-app-id", mlg0.g).a("sud-sdk-bundle-id", mlg0.d()).a("sud-sdk-trace-id", mlg0.j).a("sud-sdk-request-id", str).a("sud-sdk-user-id", xlg0.a).a("sud-sdk-sud-is-dynamic", String.valueOf(false)).a("sud-sdk-et-is-dynamic", String.valueOf(false)).a(HttpHeaders.REFERER, dog0.b(str)).a("sud-device-brand", ghg0.a(hig0.a())).a("sud-os-version", hig0.d()).a("sud-device-id", hig0.c());
        aVarA2.o(tog0.class, tog0Var);
        if (o3fVar != null) {
            aVarA2.o(o3f.class, o3fVar);
        }
        return aVarA2;
    }

    /* JADX INFO: renamed from: h */
    public static void m6427h(int i, nkg0 nkg0Var, rdg0 rdg0Var, String str) {
        ymg0 ymg0Var;
        j9g0 j9g0Var;
        if (i != 0) {
            xcg0 xcg0Var = (xcg0) nkg0Var;
            SudLogger.m10032d(xcg0Var.a.a, "onFailure：" + str + "(" + i + ")");
            LogUtils.file("SudGIPWebSocket", "onFailure：" + str + "(" + i + ")");
            xcg0Var.a.b(3000L);
            return;
        }
        xcg0 xcg0Var2 = (xcg0) nkg0Var;
        if (rdg0Var != null) {
            xcg0Var2.getClass();
            if (!TextUtils.isEmpty(rdg0Var.f6890a)) {
                img0 img0Var = xcg0Var2.a;
                String str2 = rdg0Var.f6890a;
                SudLogger.m10032d(img0Var.a, "connectWebSocket curIsRunning:" + img0Var.f.get());
                LogUtils.file("SudGIPWebSocket", "connectWebSocket curIsRunning:" + img0Var.f.get());
                if (img0Var.f.get()) {
                    if (img0Var.h != null) {
                        SudLogger.m10032d(img0Var.a, "connectWebSocket 已存在WebSocket无需重复连接");
                        LogUtils.file("SudGIPWebSocket", "connectWebSocket 已存在WebSocket无需重复连接");
                        return;
                    }
                    asg0 asg0Var = mlg0.e;
                    String str3 = (asg0Var == null || (ymg0Var = asg0Var.c) == null || (j9g0Var = ymg0Var.d) == null) ? null : j9g0Var.f;
                    if (TextUtils.isEmpty(str3)) {
                        img0Var.b(3000L);
                        return;
                    }
                    String string = Uri.parse(str3).buildUpon().appendQueryParameter("mgid", img0Var.d + "").appendQueryParameter("roomid", img0Var.c + "").build().toString();
                    StringBuilder sb = new StringBuilder("connectWebSocket:");
                    sb.append(string);
                    LogUtils.file("SudGIPWebSocket", sb.toString());
                    stc0 stc0VarB = new stc0.a().q(string).a(HttpHeaders.AUTHORIZATION, "Bearer " + str2).b();
                    rmg0 rmg0Var = new rmg0();
                    rmg0Var.f7000c = 3;
                    rmg0Var.f6999b.f7980a = "SudGIPWsHttpLoggingInterceptor";
                    k850.b bVar = new k850.b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    img0Var.h = bVar.p(10L, timeUnit).a(rmg0Var).t(100L, timeUnit).x(100L, timeUnit).c().x(stc0VarB, new qig0(img0Var));
                    return;
                }
                return;
            }
        }
        xcg0Var2.a.b(3000L);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6428i(int i, qmg0 qmg0Var, String str) {
        if (i == 0) {
            qmg0Var.getClass();
        } else {
            qmg0Var.getClass();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m6429r(qbg0 qbg0Var, ndg0 ndg0Var, String str) {
        int i = qbg0Var.a;
        if (i == 0) {
            ndg0Var.onSuccess(str);
        } else {
            ndg0Var.onFailure(i, qbg0Var.b);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m6430w(JSONObject jSONObject, GameInfo gameInfo) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("mg_info");
        gameInfo.mgId = jSONObject3.getLong("mg_id");
        gameInfo.name = m6422a(jSONObject3.getJSONObject("name")).Suddo(mlg0.d);
        gameInfo.version = jSONObject3.getString("version");
        gameInfo.orientation = jSONObject3.getInt("orientation");
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
        gameInfo.require = jSONObject3.getString("require").split(";");
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("big_loading_pic");
        if (jSONObjectOptJSONObject != null) {
            gameInfo.bigLoadingPic = m6422a(jSONObjectOptJSONObject).Suddo(mlg0.d);
        }
        if (jSONObject3.has("dynamic_config")) {
            gameInfo.dynamicConfig = jSONObject3.getJSONObject("dynamic_config").toString();
        } else {
            gameInfo.dynamicConfig = "{}";
        }
        gameInfo.clientVersion = jSONObject3.getLong("client_version");
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("game_large_model_cfg");
        if (jSONObjectOptJSONObject2 != null) {
            pdg0 pdg0Var = new pdg0();
            gameInfo.gameLargeModelCfg = pdg0Var;
            pdg0Var.f6382a = jSONObjectOptJSONObject2.optBoolean("enable_asr");
            gameInfo.gameLargeModelCfg.f6383b = jSONObjectOptJSONObject2.optBoolean("enable_channel");
            gameInfo.gameLargeModelCfg.f6384c = jSONObjectOptJSONObject2.optBoolean("enable_tts");
        }
        lmg0.b(gameInfo.mgId, 0, jSONObject2.optString("log_id"));
        lmg0.a();
    }

    /* JADX INFO: renamed from: z */
    public static void m6431z() {
        lkg0.f5322a.f7000c = 4;
        int i = mlg0.f;
        if (i == 4 || i == 3) {
            rmg0.f6997d = true;
        } else {
            rmg0.f6997d = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m6432B(ISudListenerInitSDK iSudListenerInitSDK, Context context, String str, String str2, boolean z, tgg0 tgg0Var, tgg0 tgg0Var2) {
        int length;
        synchronized (this) {
            try {
                m6447x(iSudListenerInitSDK);
                if (this.f5735j.get()) {
                    return;
                }
                this.f5735j.set(true);
                int i = mlg0.f;
                if (i == 4) {
                    length = f5722q.length;
                } else if (i == 3) {
                    length = f5723r.length;
                } else {
                    length = i == 2 ? f5724s.length : f5725t.length;
                }
                int i2 = length;
                tgg0 tgg0Var3 = this.f5737l;
                if (tgg0Var3 != null && tgg0Var != null) {
                    tgg0Var3.m7742c(tgg0Var);
                    tgg0Var.m7741b(this.f5737l.f7463b);
                }
                tgg0 tgg0Var4 = this.f5738m;
                if (tgg0Var4 != null && tgg0Var2 != null) {
                    tgg0Var4.m7742c(tgg0Var2);
                    tgg0Var2.m7741b(this.f5738m.f7463b);
                }
                m6435j(str, 1, new sog0(this, context, str, str2, z, tgg0Var2, i2, 1, tgg0Var), tgg0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6433f() {
        this.f5726a = false;
        this.f5727b = "";
        this.f5728c = "";
        this.f5729d = "";
        this.f5730e = "";
        this.f5732g = "";
        this.f5733h = "";
        this.f5731f = "";
        this.f5734i = "";
        this.f5739n.clear();
        this.f5740o.clear();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6434g(int i, String str) {
        ArrayList arrayList = this.f5736k;
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
        this.f5736k = null;
        this.f5735j.set(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m6435j(String str, int i, final sog0 sog0Var, tgg0 tgg0Var) {
        String strM6425d;
        String str2 = this.f5727b;
        if (str2 == null || str2.isEmpty()) {
            int i2 = mlg0.f;
            if (i2 == 4) {
                strM6425d = m6425d(f5722q, i);
            } else if (i2 == 3) {
                strM6425d = m6425d(f5723r, i);
            } else {
                strM6425d = i2 == 2 ? m6425d(f5724s, i) : m6425d(f5725t, i);
            }
            LogUtils.file("HttpService", "getFQSInfo baseUrl:" + strM6425d);
            SudLogger.m10032d(f5721p, "getFQSInfo baseUrl:" + strM6425d);
            final String str3 = strM6425d + yog0.b(str);
            final mcg0 mcg0Var = new mcg0("getFQSInfo");
            final tog0 tog0Var = new tog0();
            mcg0Var.n = tog0Var;
            tgg0 tgg0Var2 = new tgg0();
            this.f5737l = tgg0Var2;
            tgg0Var2.m7742c(tgg0Var);
            this.f5737l.m7741b(str3);
            lkg0.f5324c.execute(new Runnable() { // from class: l.bqg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2472a.m6439n(str3, mcg0Var, tog0Var, sog0Var);
                }
            });
            return;
        }
        mqg0 mqg0Var = sog0Var.f7278i;
        Context context = sog0Var.f7270a;
        String str4 = sog0Var.f7271b;
        String str5 = sog0Var.f7272c;
        boolean z = sog0Var.f7273d;
        tgg0 tgg0Var3 = sog0Var.f7274e;
        if (!mqg0Var.f5726a) {
            bhg0.f.b(context);
            String str6 = mqg0Var.f5727b;
            String packageName = context.getPackageName();
            tgg0 tgg0Var4 = new tgg0();
            mqg0Var.f5738m = tgg0Var4;
            tgg0Var4.m7742c(tgg0Var3);
            mqg0Var.f5738m.m7741b(str6);
            lkg0.f5324c.execute(new pmg0(mqg0Var, str4, str5, packageName, z, str6));
            return;
        }
        synchronized (mqg0Var) {
            try {
                ArrayList arrayList = mqg0Var.f5736k;
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
                mqg0Var.f5736k = null;
                mqg0Var.f5735j.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6436k(String str, String str2, String str3, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var, final ndg0 ndg0Var) {
        final String strM6423b;
        final qbg0 qbg0Var = new qbg0();
        try {
            qbg0Var.a = 0;
            qbg0Var.b = "success";
            strM6423b = m6423b(str, str2, str3, tog0Var, tgg0Var, f6g0Var);
        } catch (Exception e) {
            String str4 = "commonPost error :" + LogUtils.getErrorInfo(e);
            SudLogger.m10034e(f5721p, str4);
            LogUtils.file("HttpService", str4);
            if (qbg0Var.a == 0) {
                qbg0Var.a = g6g0.a(e);
                qbg0Var.b = e.toString();
            }
            strM6423b = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.aqg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m6421A(qbg0Var, ndg0Var, strM6423b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m6437l(final String str, final String str2, final qfg0 qfg0Var, final ndg0 ndg0Var, final f6g0 f6g0Var) {
        final String strB = yog0.b(UUID.randomUUID().toString());
        final tog0 tog0Var = new tog0();
        lkg0.f5324c.execute(new Runnable() { // from class: l.vpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8367a.m6436k(str, str2, strB, tog0Var, qfg0Var, f6g0Var, ndg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m6438m(String str, String str2, tog0 tog0Var, tgg0 tgg0Var, f6g0 f6g0Var, final ndg0 ndg0Var) {
        final String strM6424c;
        final qbg0 qbg0Var = new qbg0();
        try {
            qbg0Var.a = 0;
            qbg0Var.b = "success";
            strM6424c = m6424c(str, str2, tog0Var, tgg0Var, f6g0Var);
        } catch (Exception e) {
            String str3 = "commonGet error :" + LogUtils.getErrorInfo(e);
            SudLogger.m10034e(f5721p, str3);
            LogUtils.file("HttpService", str3);
            if (qbg0Var.a == 0) {
                qbg0Var.a = g6g0.a(e);
                qbg0Var.b = e.toString();
            }
            strM6424c = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.upg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m6429r(qbg0Var, ndg0Var, strM6424c);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m6439n(String str, mcg0 mcg0Var, tog0 tog0Var, final sog0 sog0Var) {
        Exception exc;
        String strM6424c;
        String string;
        final qbg0 qbg0Var = new qbg0();
        String strOptString = "";
        try {
            qbg0Var.a = 0;
            qbg0Var.b = "success";
            strM6424c = m6424c(str, mcg0Var.c, tog0Var, this.f5737l, null);
            try {
                JSONObject jSONObject = new JSONObject(strM6424c);
                string = jSONObject.getString("url");
                try {
                    if (TextUtils.isEmpty(string)) {
                        qbg0Var.a = -1;
                        qbg0Var.b = "url is null or empty";
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("checker");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("url");
                    }
                } catch (Exception e) {
                    exc = e;
                    String str2 = "fqs error :" + LogUtils.getErrorInfo(exc);
                    SudLogger.m10034e(f5721p, str2);
                    LogUtils.file("HttpService", str2);
                    if (qbg0Var.a == 0) {
                        qbg0Var.a = g6g0.a(exc);
                        qbg0Var.b = exc.toString();
                    }
                    if (strM6424c != null) {
                        mcg0Var.d = strM6424c;
                    } else {
                        mcg0Var.getClass();
                    }
                    mcg0Var.e = qbg0Var.a;
                    String str3 = qbg0Var.b;
                    if (str3 != null) {
                        mcg0Var.f = str3;
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                string = "";
            }
        } catch (Exception e3) {
            exc = e3;
            strM6424c = "";
            string = strM6424c;
        }
        final String str4 = strOptString;
        final String str5 = string;
        xlg0.b(mcg0Var);
        ThreadUtils.postUITask(new Runnable() { // from class: l.dqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3059a.m6442q(qbg0Var, str5, sog0Var, str4);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m6440o(final String str, final qfg0 qfg0Var, final xqg0 xqg0Var, final f6g0 f6g0Var) {
        final String strB = yog0.b(UUID.randomUUID().toString());
        final tog0 tog0Var = new tog0();
        lkg0.f5324c.execute(new Runnable() { // from class: l.cqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2756a.m6438m(str, strB, tog0Var, qfg0Var, f6g0Var, xqg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m6441p(String str, boolean z) {
        cbg0.a("reportEvent.sp").c(yog0.b(UUID.randomUUID().toString()), str, z);
        String str2 = this.f5733h;
        if (str2 != null && !str2.isEmpty()) {
            lkg0.f5325d.execute(new ang0(this));
        } else {
            LogUtils.file("HttpService", "还未初始化sdk成功，等待上报的数据为：" + str);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6442q(qbg0 qbg0Var, String str, sog0 sog0Var, String str2) {
        int i;
        this.f5728c = str2;
        if (sog0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("getFQSInfo fail appId=" + mlg0.g);
            sb.append(" isTestEnv=" + mlg0.c);
            sb.append(" ");
            sb.append(" ret_code=" + qbg0Var.a);
            sb.append(" null == getSDKTokenUrl || getSDKTokenUrl.isEmpty(), Please contact SUD, Open production environment service");
            String str3 = qbg0Var.b;
            if (str3 != null) {
                sb.append(str3);
            }
            int i2 = qbg0Var.a;
            String string = sb.toString();
            int i3 = sog0Var.f7275f;
            if (i3 <= 0 || (i = sog0Var.f7276g) >= i3) {
                sog0Var.f7278i.m6434g(i2, string);
            } else {
                mqg0 mqg0Var = sog0Var.f7278i;
                Context context = sog0Var.f7270a;
                String str4 = sog0Var.f7271b;
                String str5 = sog0Var.f7272c;
                boolean z = sog0Var.f7273d;
                int i4 = i + 1;
                tgg0 tgg0Var = sog0Var.f7277h;
                tgg0 tgg0Var2 = sog0Var.f7274e;
                tgg0 tgg0Var3 = mqg0Var.f5737l;
                if (tgg0Var3 != null && tgg0Var != null) {
                    tgg0Var3.m7742c(tgg0Var);
                    tgg0Var.m7741b(mqg0Var.f5737l.f7463b);
                }
                tgg0 tgg0Var4 = mqg0Var.f5738m;
                if (tgg0Var4 != null && tgg0Var2 != null) {
                    tgg0Var4.m7742c(tgg0Var2);
                    tgg0Var2.m7741b(mqg0Var.f5738m.f7463b);
                }
                mqg0Var.m6435j(str4, i4, new sog0(mqg0Var, context, str4, str5, z, tgg0Var2, i3, i4, tgg0Var), tgg0Var);
            }
        } else {
            this.f5727b = str;
            mqg0 mqg0Var2 = sog0Var.f7278i;
            Context context2 = sog0Var.f7270a;
            String str6 = sog0Var.f7271b;
            String str7 = sog0Var.f7272c;
            boolean z2 = sog0Var.f7273d;
            tgg0 tgg0Var5 = sog0Var.f7274e;
            if (mqg0Var2.f5726a) {
                synchronized (mqg0Var2) {
                    try {
                        ArrayList arrayList = mqg0Var2.f5736k;
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
                            mqg0Var2.f5736k = null;
                            mqg0Var2.f5735j.set(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                bhg0.f.b(context2);
                String str8 = mqg0Var2.f5727b;
                String packageName = context2.getPackageName();
                tgg0 tgg0Var6 = new tgg0();
                mqg0Var2.f5738m = tgg0Var6;
                tgg0Var6.m7742c(tgg0Var5);
                mqg0Var2.f5738m.m7741b(str8);
                lkg0.f5324c.execute(new pmg0(mqg0Var2, str6, str7, packageName, z2, str8));
            }
        }
        this.f5737l = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m6443s(qdg0 qdg0Var, mcg0 mcg0Var, tog0 tog0Var, final nkg0 nkg0Var) {
        final rdg0 rdg0Var = new rdg0();
        String str = "";
        final String string = "success";
        final int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", qdg0Var.f6627a);
            jSONObject.put("uid", qdg0Var.f6627a);
            String string2 = jSONObject.toString();
            String str2 = this.f5731f;
            String str3 = mcg0Var.c;
            stc0.a aVarL = m6426e(str3, tog0Var, null).q(str2).l(utc0.create(hyx.c("application/json; charset=utf-8"), string2));
            lkg0.m6040a(aVarL);
            gxc0 gxc0VarK = lkg0.f5323b.a(aVarL.b()).execute().k();
            Objects.requireNonNull(gxc0VarK);
            String strString = gxc0VarK.string();
            LogUtils.file("HttpService", "url=" + str2 + " request-id=" + str3);
            SudLogger.m10032d(f5721p, "url=" + str2 + " request-id=" + str3);
            try {
                JSONObject jSONObject2 = new JSONObject(strString);
                i = jSONObject2.getInt("ret_code");
                string = jSONObject2.optString("ret_msg");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    rdg0Var.f6890a = jSONObjectOptJSONObject.optString("access_token");
                    jSONObjectOptJSONObject.optInt("expires_in");
                }
            } catch (Exception e) {
                e = e;
                str = strString;
                String str4 = "fqs error :" + LogUtils.getErrorInfo(e);
                SudLogger.m10034e(f5721p, str4);
                LogUtils.file("HttpService", str4);
                if (i == 0) {
                    int iA = g6g0.a(e);
                    string = e.toString();
                    i = iA;
                }
                if (str != null) {
                    mcg0Var.d = str;
                } else {
                    mcg0Var.getClass();
                }
                mcg0Var.e = i;
                if (string != null) {
                    mcg0Var.f = string;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.zpg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m6427h(i, nkg0Var, rdg0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m6444t(final qdg0 qdg0Var, final xcg0 xcg0Var) {
        final mcg0 mcg0Var = new mcg0("getGateToken");
        final tog0 tog0Var = new tog0();
        mcg0Var.n = tog0Var;
        lkg0.f5324c.execute(new Runnable() { // from class: l.tpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7576a.m6443s(qdg0Var, mcg0Var, tog0Var, xcg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m6445u(final vgg0 vgg0Var, final ufg0 ufg0Var) {
        lkg0.f5324c.execute(new Runnable() { // from class: l.xpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8813a.m6446v(vgg0Var, ufg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m6446v(vgg0 vgg0Var, final qmg0 qmg0Var) {
        final String string;
        ymg0 ymg0Var;
        l7g0 l7g0Var;
        final int iA = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message_id", yog0.b(UUID.randomUUID().toString()));
            jSONObject.put("mg_id", vgg0Var.f8331a);
            jSONObject.put("room_id", vgg0Var.f8332b);
            jSONObject.put("message_type", 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", vgg0Var.f8333c);
            jSONObject2.put("nickname", vgg0Var.f8334d);
            jSONObject.put("sender", jSONObject2);
            jSONObject.put("content", vgg0Var.f8335e);
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (vgg0Var.f8336f != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("asr_duration", vgg0Var.f8336f.f6444a);
                jSONObject3.put("end_time", vgg0Var.f8336f.f6445b);
                jSONObject3.put("log_id", vgg0Var.f8336f.f6446c);
                jSONObject3.put("start_time", vgg0Var.f8336f.f6447d);
                jSONObject3.put("audio_start_time", vgg0Var.f8336f.f6448e);
                jSONObject3.put("audio_end_time", vgg0Var.f8336f.f6449f);
                jSONObject.put("metrics", jSONObject3);
            }
            String string2 = jSONObject.toString();
            asg0 asg0Var = mlg0.e;
            String str = (asg0Var == null || (ymg0Var = asg0Var.c) == null || (l7g0Var = ymg0Var.m) == null) ? null : l7g0Var.d;
            String strB = yog0.b(UUID.randomUUID().toString());
            stc0.a aVarL = m6426e(strB, new tog0(), null).q(str).l(utc0.create(hyx.c("application/json; charset=utf-8"), string2));
            lkg0.m6040a(aVarL);
            gxc0 gxc0VarK = lkg0.f5323b.a(aVarL.b()).execute().k();
            Objects.requireNonNull(gxc0VarK);
            String strString = gxc0VarK.string();
            LogUtils.file("HttpService", "url=" + str + " request-id=" + strB);
            SudLogger.m10032d(f5721p, "url=" + str + " request-id=" + strB);
            JSONObject jSONObject4 = new JSONObject(strString);
            iA = jSONObject4.getInt("ret_code");
            string = jSONObject4.optString("ret_msg");
        } catch (Exception e) {
            String str2 = "fqs error :" + LogUtils.getErrorInfo(e);
            SudLogger.m10034e(f5721p, str2);
            LogUtils.file("HttpService", str2);
            if (iA == 0) {
                iA = g6g0.a(e);
                string = e.toString();
            } else {
                string = "success";
            }
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.ypg0
            @Override // java.lang.Runnable
            public final void run() {
                mqg0.m6428i(iA, qmg0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m6447x(ISudListenerInitSDK iSudListenerInitSDK) {
        if (iSudListenerInitSDK == null) {
            return;
        }
        try {
            if (this.f5736k == null) {
                this.f5736k = new ArrayList();
            }
            this.f5736k.add(iSudListenerInitSDK);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m6448y(final ISudListenerInitSDK iSudListenerInitSDK, final Context context, final String str, final String str2, final boolean z, final tgg0 tgg0Var, final tgg0 tgg0Var2) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.wpg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8590a.m6432B(iSudListenerInitSDK, context, str, str2, z, tgg0Var, tgg0Var2);
            }
        });
    }
}
