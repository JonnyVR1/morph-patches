package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.Shows;
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
import p002D.Sudif;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class uyg0 {

    /* JADX INFO: renamed from: p */
    public static final String f181596p = "SudGIP ".concat(uyg0.class.getSimpleName());

    /* JADX INFO: renamed from: q */
    public static final String[] f181597q = {"https://dev-fqs.sudden.ltd/", "https://dev-fqs.sud.ltd/", "https://dev-fqs-os.sudden.ltd/", "https://dev-fqs.sudcdn.ltd/", "https://dev-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: r */
    public static final String[] f181598r = {"https://fat-fqs.sudden.ltd/", "https://fat-fqs.sud.ltd/", "https://fat-fqs-os.sudden.ltd/", "https://fat-fqs.sudcdn.ltd/", "https://fat-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: s */
    public static final String[] f181599s = {"https://sim-fqs.sudden.ltd/", "https://sim-fqs.sud.ltd/", "https://sim-fqs-os.sudden.ltd/", "https://sim-fqs.sudcdn.ltd/", "https://sim-fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: t */
    public static final String[] f181600t = {"https://fqs.sudden.ltd/", "https://fqs.sud.ltd/", "https://fqs-os.sudden.ltd/", "https://fqs.sudcdn.ltd/", "https://fqs.sudcdn.cloud/"};

    /* JADX INFO: renamed from: k */
    public ArrayList f181611k;

    /* JADX INFO: renamed from: l */
    public bpg0 f181612l;

    /* JADX INFO: renamed from: m */
    public bpg0 f181613m;

    /* JADX INFO: renamed from: a */
    public boolean f181601a = false;

    /* JADX INFO: renamed from: b */
    public String f181602b = "";

    /* JADX INFO: renamed from: c */
    public String f181603c = "";

    /* JADX INFO: renamed from: d */
    public String f181604d = "";

    /* JADX INFO: renamed from: e */
    public String f181605e = "";

    /* JADX INFO: renamed from: f */
    public String f181606f = "";

    /* JADX INFO: renamed from: g */
    public String f181607g = "";

    /* JADX INFO: renamed from: h */
    public String f181608h = "";

    /* JADX INFO: renamed from: i */
    public String f181609i = "";

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f181610j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    public final ArrayList f181614n = new ArrayList(0);

    /* JADX INFO: renamed from: o */
    public final HashMap f181615o = new HashMap();

    public uyg0() {
        m198635z();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m198625A(yjg0 yjg0Var, vlg0 vlg0Var, String str) {
        int i = yjg0Var.f200299a;
        if (i == 0) {
            vlg0Var.onSuccess(str);
        } else {
            vlg0Var.onFailure(i, yjg0Var.f200300b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Sudif m198626a(JSONObject jSONObject) throws JSONException {
        Sudif sudif = new Sudif();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sudif.f211024Suddo.put(next, jSONObject.getString(next));
        }
        return sudif;
    }

    /* JADX INFO: renamed from: b */
    public static String m198627b(String str, String str2, String str3, bxg0 bxg0Var, bpg0 bpg0Var, neg0 neg0Var) throws IOException {
        ry3 ry3VarMo181341a = tsg0.f175996b.mo181341a(m198630e(str3, bxg0Var, bpg0Var).m209043q(str).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), str2)).m209028b());
        if (neg0Var != null) {
            neg0Var.f141647a = ry3VarMo181341a;
        }
        k5d0 k5d0VarM138670k = ry3VarMo181341a.execute().m138670k();
        Objects.requireNonNull(k5d0VarM138670k);
        String strString = k5d0VarM138670k.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str3);
        SudLogger.m222811d(f181596p, "url=" + str + " request-id=" + str3);
        return strString;
    }

    /* JADX INFO: renamed from: c */
    public static String m198628c(String str, String str2, bxg0 bxg0Var, bpg0 bpg0Var, neg0 neg0Var) throws IOException {
        ry3 ry3VarMo181341a = tsg0.f175996b.mo181341a(m198630e(str2, bxg0Var, bpg0Var).m209043q(str).m209032f().m209028b());
        if (neg0Var != null) {
            neg0Var.f141647a = ry3VarMo181341a;
        }
        k5d0 k5d0VarM138670k = ry3VarMo181341a.execute().m138670k();
        Objects.requireNonNull(k5d0VarM138670k);
        String strString = k5d0VarM138670k.string();
        LogUtils.file("HttpService", "url=" + str + " request-id=" + str2);
        SudLogger.m222811d(f181596p, "url=" + str + " request-id=" + str2);
        return strString;
    }

    /* JADX INFO: renamed from: d */
    public static String m198629d(String[] strArr, int i) {
        if (strArr != null && strArr.length != 0) {
            int i2 = i > 0 ? i - 1 : 0;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static x1d0.C21228a m198630e(String str, bxg0 bxg0Var, t4f t4fVar) {
        x1d0.C21228a c21228aM209027a = new x1d0.C21228a().m209027a("sud-sdk-version", "1.6.7.1286").m209027a("sud-sdk-version-alias", "v1.6.7.1286-static");
        String str2 = utg0.f180946a;
        x1d0.C21228a c21228aM209027a2 = c21228aM209027a.m209027a("sud-sdk-platform", String.valueOf(2)).m209027a("sud-sdk-app-id", utg0.f180952g).m209027a("sud-sdk-bundle-id", utg0.m198036d()).m209027a("sud-sdk-trace-id", utg0.f180955j).m209027a("sud-sdk-request-id", str).m209027a("sud-sdk-user-id", fug0.f100911a).m209027a("sud-sdk-sud-is-dynamic", String.valueOf(false)).m209027a("sud-sdk-et-is-dynamic", String.valueOf(false)).m209027a(HttpHeaders.REFERER, lwg0.m156044b(str)).m209027a("sud-device-brand", opg0.m168673a(pqg0.m173348a())).m209027a("sud-os-version", pqg0.m173351d()).m209027a("sud-device-id", pqg0.m173350c());
        c21228aM209027a2.m209041o(bxg0.class, bxg0Var);
        if (t4fVar != null) {
            c21228aM209027a2.m209041o(t4f.class, t4fVar);
        }
        return c21228aM209027a2;
    }

    /* JADX INFO: renamed from: h */
    public static void m198631h(int i, vsg0 vsg0Var, zlg0 zlg0Var, String str) {
        gvg0 gvg0Var;
        rhg0 rhg0Var;
        if (i != 0) {
            flg0 flg0Var = (flg0) vsg0Var;
            SudLogger.m222811d(flg0Var.f99655a.f159573a, "onFailure：" + str + "(" + i + ")");
            LogUtils.file("SudGIPWebSocket", "onFailure：" + str + "(" + i + ")");
            flg0Var.f99655a.m178150b(3000L);
            return;
        }
        flg0 flg0Var2 = (flg0) vsg0Var;
        if (zlg0Var != null) {
            flg0Var2.getClass();
            if (!TextUtils.isEmpty(zlg0Var.f204924a)) {
                qug0 qug0Var = flg0Var2.f99655a;
                String str2 = zlg0Var.f204924a;
                SudLogger.m222811d(qug0Var.f159573a, "connectWebSocket curIsRunning:" + qug0Var.f159578f.get());
                LogUtils.file("SudGIPWebSocket", "connectWebSocket curIsRunning:" + qug0Var.f159578f.get());
                if (qug0Var.f159578f.get()) {
                    if (qug0Var.f159580h != null) {
                        SudLogger.m222811d(qug0Var.f159573a, "connectWebSocket 已存在WebSocket无需重复连接");
                        LogUtils.file("SudGIPWebSocket", "connectWebSocket 已存在WebSocket无需重复连接");
                        return;
                    }
                    i0h0 i0h0Var = utg0.f180950e;
                    String str3 = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (rhg0Var = gvg0Var.f106633d) == null) ? null : rhg0Var.f163168f;
                    if (TextUtils.isEmpty(str3)) {
                        qug0Var.m178150b(3000L);
                        return;
                    }
                    String string = Uri.parse(str3).buildUpon().appendQueryParameter("mgid", qug0Var.f159576d + "").appendQueryParameter("roomid", qug0Var.f159575c + "").build().toString();
                    StringBuilder sb = new StringBuilder("connectWebSocket:");
                    sb.append(string);
                    LogUtils.file("SudGIPWebSocket", sb.toString());
                    x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q(string).m209027a("Authorization", "Bearer " + str2).m209028b();
                    zug0 zug0Var = new zug0();
                    zug0Var.f206126c = 3;
                    zug0Var.f206125b.f82998a = "SudGIPWsHttpLoggingInterceptor";
                    rg50.C19837b c19837b = new rg50.C19837b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    qug0Var.f159580h = c19837b.m181379q(10L, timeUnit).m181363a(zug0Var).m181383u(100L, timeUnit).m181387y(100L, timeUnit).m181365c().m181360x(x1d0VarM209028b, new yqg0(qug0Var));
                    return;
                }
                return;
            }
        }
        flg0Var2.f99655a.m178150b(3000L);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m198632i(int i, yug0 yug0Var, String str) {
        if (i == 0) {
            yug0Var.getClass();
        } else {
            yug0Var.getClass();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m198633r(yjg0 yjg0Var, vlg0 vlg0Var, String str) {
        int i = yjg0Var.f200299a;
        if (i == 0) {
            vlg0Var.onSuccess(str);
        } else {
            vlg0Var.onFailure(i, yjg0Var.f200300b);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m198634w(JSONObject jSONObject, GameInfo gameInfo) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("mg_info");
        gameInfo.mgId = jSONObject3.getLong("mg_id");
        gameInfo.name = m198626a(jSONObject3.getJSONObject(AuthenticationTokenClaims.JSON_KEY_NAME)).Suddo(utg0.f180949d);
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
            gameInfo.bigLoadingPic = m198626a(jSONObjectOptJSONObject).Suddo(utg0.f180949d);
        }
        if (jSONObject3.has("dynamic_config")) {
            gameInfo.dynamicConfig = jSONObject3.getJSONObject("dynamic_config").toString();
        } else {
            gameInfo.dynamicConfig = WeJson.EMPTY_MAP;
        }
        gameInfo.clientVersion = jSONObject3.getLong("client_version");
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("game_large_model_cfg");
        if (jSONObjectOptJSONObject2 != null) {
            xlg0 xlg0Var = new xlg0();
            gameInfo.gameLargeModelCfg = xlg0Var;
            xlg0Var.f194967a = jSONObjectOptJSONObject2.optBoolean("enable_asr");
            gameInfo.gameLargeModelCfg.f194968b = jSONObjectOptJSONObject2.optBoolean("enable_channel");
            gameInfo.gameLargeModelCfg.f194969c = jSONObjectOptJSONObject2.optBoolean("enable_tts");
        }
        tug0.m192750b(gameInfo.mgId, 0, jSONObject2.optString("log_id"));
        tug0.m192749a();
    }

    /* JADX INFO: renamed from: z */
    public static void m198635z() {
        tsg0.f175995a.f206126c = 4;
        int i = utg0.f180951f;
        if (i == 4 || i == 3) {
            zug0.f206123d = true;
        } else {
            zug0.f206123d = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m198636B(ISudListenerInitSDK iSudListenerInitSDK, Context context, String str, String str2, boolean z, bpg0 bpg0Var, bpg0 bpg0Var2) {
        int length;
        synchronized (this) {
            try {
                m198651x(iSudListenerInitSDK);
                if (this.f181610j.get()) {
                    return;
                }
                this.f181610j.set(true);
                int i = utg0.f180951f;
                if (i == 4) {
                    length = f181597q.length;
                } else if (i == 3) {
                    length = f181598r.length;
                } else {
                    length = i == 2 ? f181599s.length : f181600t.length;
                }
                int i2 = length;
                bpg0 bpg0Var3 = this.f181612l;
                if (bpg0Var3 != null && bpg0Var != null) {
                    bpg0Var3.m105842c(bpg0Var);
                    bpg0Var.m105841b(this.f181612l.f77780b);
                }
                bpg0 bpg0Var4 = this.f181613m;
                if (bpg0Var4 != null && bpg0Var2 != null) {
                    bpg0Var4.m105842c(bpg0Var2);
                    bpg0Var2.m105841b(this.f181613m.f77780b);
                }
                m198639j(str, 1, new axg0(this, context, str, str2, z, bpg0Var2, i2, 1, bpg0Var), bpg0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m198637f() {
        this.f181601a = false;
        this.f181602b = "";
        this.f181603c = "";
        this.f181604d = "";
        this.f181605e = "";
        this.f181607g = "";
        this.f181608h = "";
        this.f181606f = "";
        this.f181609i = "";
        this.f181614n.clear();
        this.f181615o.clear();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m198638g(int i, String str) {
        ArrayList arrayList = this.f181611k;
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
        this.f181611k = null;
        this.f181610j.set(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m198639j(String str, int i, final axg0 axg0Var, bpg0 bpg0Var) {
        String strM198629d;
        String str2 = this.f181602b;
        if (str2 == null || str2.isEmpty()) {
            int i2 = utg0.f180951f;
            if (i2 == 4) {
                strM198629d = m198629d(f181597q, i);
            } else if (i2 == 3) {
                strM198629d = m198629d(f181598r, i);
            } else {
                strM198629d = i2 == 2 ? m198629d(f181599s, i) : m198629d(f181600t, i);
            }
            LogUtils.file("HttpService", "getFQSInfo baseUrl:" + strM198629d);
            SudLogger.m222811d(f181596p, "getFQSInfo baseUrl:" + strM198629d);
            final String str3 = strM198629d + gxg0.m132863b(str);
            final ukg0 ukg0Var = new ukg0("getFQSInfo");
            final bxg0 bxg0Var = new bxg0();
            ukg0Var.f179405n = bxg0Var;
            bpg0 bpg0Var2 = new bpg0();
            this.f181612l = bpg0Var2;
            bpg0Var2.m105842c(bpg0Var);
            this.f181612l.m105841b(str3);
            tsg0.f175997c.execute(new Runnable() { // from class: l.jyg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123139a.m198643n(str3, ukg0Var, bxg0Var, axg0Var);
                }
            });
            return;
        }
        uyg0 uyg0Var = axg0Var.f73855i;
        Context context = axg0Var.f73847a;
        String str4 = axg0Var.f73848b;
        String str5 = axg0Var.f73849c;
        boolean z = axg0Var.f73850d;
        bpg0 bpg0Var3 = axg0Var.f73851e;
        if (!uyg0Var.f181601a) {
            jpg0.f122099f.m146498b(context);
            String str6 = uyg0Var.f181602b;
            String packageName = context.getPackageName();
            bpg0 bpg0Var4 = new bpg0();
            uyg0Var.f181613m = bpg0Var4;
            bpg0Var4.m105842c(bpg0Var3);
            uyg0Var.f181613m.m105841b(str6);
            tsg0.f175997c.execute(new xug0(uyg0Var, str4, str5, packageName, z, str6));
            return;
        }
        synchronized (uyg0Var) {
            try {
                ArrayList arrayList = uyg0Var.f181611k;
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
                uyg0Var.f181611k = null;
                uyg0Var.f181610j.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m198640k(String str, String str2, String str3, bxg0 bxg0Var, bpg0 bpg0Var, neg0 neg0Var, final vlg0 vlg0Var) {
        final String strM198627b;
        final yjg0 yjg0Var = new yjg0();
        try {
            yjg0Var.f200299a = 0;
            yjg0Var.f200300b = "success";
            strM198627b = m198627b(str, str2, str3, bxg0Var, bpg0Var, neg0Var);
        } catch (Exception e) {
            String str4 = "commonPost error :" + LogUtils.getErrorInfo(e);
            SudLogger.m222813e(f181596p, str4);
            LogUtils.file("HttpService", str4);
            if (yjg0Var.f200299a == 0) {
                yjg0Var.f200299a = oeg0.m167366a(e);
                yjg0Var.f200300b = e.toString();
            }
            strM198627b = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.iyg0
            @Override // java.lang.Runnable
            public final void run() {
                uyg0.m198625A(yjg0Var, vlg0Var, strM198627b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m198641l(final String str, final String str2, final yng0 yng0Var, final vlg0 vlg0Var, final neg0 neg0Var) {
        final String strM132863b = gxg0.m132863b(UUID.randomUUID().toString());
        final bxg0 bxg0Var = new bxg0();
        tsg0.f175997c.execute(new Runnable() { // from class: l.dyg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91224a.m198640k(str, str2, strM132863b, bxg0Var, yng0Var, neg0Var, vlg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m198642m(String str, String str2, bxg0 bxg0Var, bpg0 bpg0Var, neg0 neg0Var, final vlg0 vlg0Var) {
        final String strM198628c;
        final yjg0 yjg0Var = new yjg0();
        try {
            yjg0Var.f200299a = 0;
            yjg0Var.f200300b = "success";
            strM198628c = m198628c(str, str2, bxg0Var, bpg0Var, neg0Var);
        } catch (Exception e) {
            String str3 = "commonGet error :" + LogUtils.getErrorInfo(e);
            SudLogger.m222813e(f181596p, str3);
            LogUtils.file("HttpService", str3);
            if (yjg0Var.f200299a == 0) {
                yjg0Var.f200299a = oeg0.m167366a(e);
                yjg0Var.f200300b = e.toString();
            }
            strM198628c = "";
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.cyg0
            @Override // java.lang.Runnable
            public final void run() {
                uyg0.m198633r(yjg0Var, vlg0Var, strM198628c);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m198643n(String str, ukg0 ukg0Var, bxg0 bxg0Var, final axg0 axg0Var) {
        Exception exc;
        String strM198628c;
        String string;
        final yjg0 yjg0Var = new yjg0();
        String strOptString = "";
        try {
            yjg0Var.f200299a = 0;
            yjg0Var.f200300b = "success";
            strM198628c = m198628c(str, ukg0Var.f179394c, bxg0Var, this.f181612l, null);
            try {
                JSONObject jSONObject = new JSONObject(strM198628c);
                string = jSONObject.getString("url");
                try {
                    if (TextUtils.isEmpty(string)) {
                        yjg0Var.f200299a = -1;
                        yjg0Var.f200300b = "url is null or empty";
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("checker");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("url");
                    }
                } catch (Exception e) {
                    exc = e;
                    String str2 = "fqs error :" + LogUtils.getErrorInfo(exc);
                    SudLogger.m222813e(f181596p, str2);
                    LogUtils.file("HttpService", str2);
                    if (yjg0Var.f200299a == 0) {
                        yjg0Var.f200299a = oeg0.m167366a(exc);
                        yjg0Var.f200300b = exc.toString();
                    }
                    if (strM198628c != null) {
                        ukg0Var.f179395d = strM198628c;
                    } else {
                        ukg0Var.getClass();
                    }
                    ukg0Var.f179396e = yjg0Var.f200299a;
                    String str3 = yjg0Var.f200300b;
                    if (str3 != null) {
                        ukg0Var.f179397f = str3;
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                string = "";
            }
        } catch (Exception e3) {
            exc = e3;
            strM198628c = "";
            string = strM198628c;
        }
        final String str4 = strOptString;
        final String str5 = string;
        fug0.m127463b(ukg0Var);
        ThreadUtils.postUITask(new Runnable() { // from class: l.lyg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134056a.m198646q(yjg0Var, str5, axg0Var, str4);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m198644o(final String str, final yng0 yng0Var, final fzg0 fzg0Var, final neg0 neg0Var) {
        final String strM132863b = gxg0.m132863b(UUID.randomUUID().toString());
        final bxg0 bxg0Var = new bxg0();
        tsg0.f175997c.execute(new Runnable() { // from class: l.kyg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129308a.m198642m(str, strM132863b, bxg0Var, yng0Var, neg0Var, fzg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m198645p(String str, boolean z) {
        kjg0.m150043a("reportEvent.sp").m150045c(gxg0.m132863b(UUID.randomUUID().toString()), str, z);
        String str2 = this.f181608h;
        if (str2 != null && !str2.isEmpty()) {
            tsg0.f175998d.execute(new ivg0(this));
        } else {
            LogUtils.file("HttpService", "还未初始化sdk成功，等待上报的数据为：" + str);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m198646q(yjg0 yjg0Var, String str, axg0 axg0Var, String str2) {
        int i;
        this.f181603c = str2;
        if (axg0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("getFQSInfo fail appId=" + utg0.f180952g);
            sb.append(" isTestEnv=" + utg0.f180948c);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(" ret_code=" + yjg0Var.f200299a);
            sb.append(" null == getSDKTokenUrl || getSDKTokenUrl.isEmpty(), Please contact SUD, Open production environment service");
            String str3 = yjg0Var.f200300b;
            if (str3 != null) {
                sb.append(str3);
            }
            int i2 = yjg0Var.f200299a;
            String string = sb.toString();
            int i3 = axg0Var.f73852f;
            if (i3 <= 0 || (i = axg0Var.f73853g) >= i3) {
                axg0Var.f73855i.m198638g(i2, string);
            } else {
                uyg0 uyg0Var = axg0Var.f73855i;
                Context context = axg0Var.f73847a;
                String str4 = axg0Var.f73848b;
                String str5 = axg0Var.f73849c;
                boolean z = axg0Var.f73850d;
                int i4 = i + 1;
                bpg0 bpg0Var = axg0Var.f73854h;
                bpg0 bpg0Var2 = axg0Var.f73851e;
                bpg0 bpg0Var3 = uyg0Var.f181612l;
                if (bpg0Var3 != null && bpg0Var != null) {
                    bpg0Var3.m105842c(bpg0Var);
                    bpg0Var.m105841b(uyg0Var.f181612l.f77780b);
                }
                bpg0 bpg0Var4 = uyg0Var.f181613m;
                if (bpg0Var4 != null && bpg0Var2 != null) {
                    bpg0Var4.m105842c(bpg0Var2);
                    bpg0Var2.m105841b(uyg0Var.f181613m.f77780b);
                }
                uyg0Var.m198639j(str4, i4, new axg0(uyg0Var, context, str4, str5, z, bpg0Var2, i3, i4, bpg0Var), bpg0Var);
            }
        } else {
            this.f181602b = str;
            uyg0 uyg0Var2 = axg0Var.f73855i;
            Context context2 = axg0Var.f73847a;
            String str6 = axg0Var.f73848b;
            String str7 = axg0Var.f73849c;
            boolean z2 = axg0Var.f73850d;
            bpg0 bpg0Var5 = axg0Var.f73851e;
            if (uyg0Var2.f181601a) {
                synchronized (uyg0Var2) {
                    try {
                        ArrayList arrayList = uyg0Var2.f181611k;
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
                            uyg0Var2.f181611k = null;
                            uyg0Var2.f181610j.set(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                jpg0.f122099f.m146498b(context2);
                String str8 = uyg0Var2.f181602b;
                String packageName = context2.getPackageName();
                bpg0 bpg0Var6 = new bpg0();
                uyg0Var2.f181613m = bpg0Var6;
                bpg0Var6.m105842c(bpg0Var5);
                uyg0Var2.f181613m.m105841b(str8);
                tsg0.f175997c.execute(new xug0(uyg0Var2, str6, str7, packageName, z2, str8));
            }
        }
        this.f181612l = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m198647s(ylg0 ylg0Var, ukg0 ukg0Var, bxg0 bxg0Var, final vsg0 vsg0Var) {
        final zlg0 zlg0Var = new zlg0();
        String str = "";
        final String string = "success";
        final int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, ylg0Var.f200552a);
            jSONObject.put(Oauth2AccessToken.KEY_UID, ylg0Var.f200552a);
            String string2 = jSONObject.toString();
            String str2 = this.f181606f;
            String str3 = ukg0Var.f179394c;
            x1d0.C21228a c21228aM209038l = m198630e(str3, bxg0Var, null).m209043q(str2).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), string2));
            tsg0.m192607a(c21228aM209038l);
            k5d0 k5d0VarM138670k = tsg0.f175996b.mo181341a(c21228aM209038l.m209028b()).execute().m138670k();
            Objects.requireNonNull(k5d0VarM138670k);
            String strString = k5d0VarM138670k.string();
            LogUtils.file("HttpService", "url=" + str2 + " request-id=" + str3);
            SudLogger.m222811d(f181596p, "url=" + str2 + " request-id=" + str3);
            try {
                JSONObject jSONObject2 = new JSONObject(strString);
                i = jSONObject2.getInt("ret_code");
                string = jSONObject2.optString("ret_msg");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    zlg0Var.f204924a = jSONObjectOptJSONObject.optString("access_token");
                    jSONObjectOptJSONObject.optInt("expires_in");
                }
            } catch (Exception e) {
                e = e;
                str = strString;
                String str4 = "fqs error :" + LogUtils.getErrorInfo(e);
                SudLogger.m222813e(f181596p, str4);
                LogUtils.file("HttpService", str4);
                if (i == 0) {
                    int iM167366a = oeg0.m167366a(e);
                    string = e.toString();
                    i = iM167366a;
                }
                if (str != null) {
                    ukg0Var.f179395d = str;
                } else {
                    ukg0Var.getClass();
                }
                ukg0Var.f179396e = i;
                if (string != null) {
                    ukg0Var.f179397f = string;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.hyg0
            @Override // java.lang.Runnable
            public final void run() {
                uyg0.m198631h(i, vsg0Var, zlg0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m198648t(final ylg0 ylg0Var, final flg0 flg0Var) {
        final ukg0 ukg0Var = new ukg0("getGateToken");
        final bxg0 bxg0Var = new bxg0();
        ukg0Var.f179405n = bxg0Var;
        tsg0.f175997c.execute(new Runnable() { // from class: l.byg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79014a.m198647s(ylg0Var, ukg0Var, bxg0Var, flg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m198649u(final dpg0 dpg0Var, final cog0 cog0Var) {
        tsg0.f175997c.execute(new Runnable() { // from class: l.fyg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101371a.m198650v(dpg0Var, cog0Var);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m198650v(dpg0 dpg0Var, final yug0 yug0Var) {
        final String string;
        gvg0 gvg0Var;
        tfg0 tfg0Var;
        final int iM167366a = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, gxg0.m132863b(UUID.randomUUID().toString()));
            jSONObject.put("mg_id", dpg0Var.f90051a);
            jSONObject.put("room_id", dpg0Var.f90052b);
            jSONObject.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Oauth2AccessToken.KEY_UID, dpg0Var.f90053c);
            jSONObject2.put("nickname", dpg0Var.f90054d);
            jSONObject.put(Shows.sender, jSONObject2);
            jSONObject.put("content", dpg0Var.f90055e);
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (dpg0Var.f90056f != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("asr_duration", dpg0Var.f90056f.f196100a);
                jSONObject3.put("end_time", dpg0Var.f90056f.f196101b);
                jSONObject3.put("log_id", dpg0Var.f90056f.f196102c);
                jSONObject3.put("start_time", dpg0Var.f90056f.f196103d);
                jSONObject3.put("audio_start_time", dpg0Var.f90056f.f196104e);
                jSONObject3.put("audio_end_time", dpg0Var.f90056f.f196105f);
                jSONObject.put("metrics", jSONObject3);
            }
            String string2 = jSONObject.toString();
            i0h0 i0h0Var = utg0.f180950e;
            String str = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (tfg0Var = gvg0Var.f106642m) == null) ? null : tfg0Var.f173961d;
            String strM132863b = gxg0.m132863b(UUID.randomUUID().toString());
            x1d0.C21228a c21228aM209038l = m198630e(strM132863b, new bxg0(), null).m209043q(str).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), string2));
            tsg0.m192607a(c21228aM209038l);
            k5d0 k5d0VarM138670k = tsg0.f175996b.mo181341a(c21228aM209038l.m209028b()).execute().m138670k();
            Objects.requireNonNull(k5d0VarM138670k);
            String strString = k5d0VarM138670k.string();
            LogUtils.file("HttpService", "url=" + str + " request-id=" + strM132863b);
            SudLogger.m222811d(f181596p, "url=" + str + " request-id=" + strM132863b);
            JSONObject jSONObject4 = new JSONObject(strString);
            iM167366a = jSONObject4.getInt("ret_code");
            string = jSONObject4.optString("ret_msg");
        } catch (Exception e) {
            String str2 = "fqs error :" + LogUtils.getErrorInfo(e);
            SudLogger.m222813e(f181596p, str2);
            LogUtils.file("HttpService", str2);
            if (iM167366a == 0) {
                iM167366a = oeg0.m167366a(e);
                string = e.toString();
            } else {
                string = "success";
            }
        }
        ThreadUtils.postUITask(new Runnable() { // from class: l.gyg0
            @Override // java.lang.Runnable
            public final void run() {
                uyg0.m198632i(iM167366a, yug0Var, string);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m198651x(ISudListenerInitSDK iSudListenerInitSDK) {
        if (iSudListenerInitSDK == null) {
            return;
        }
        try {
            if (this.f181611k == null) {
                this.f181611k = new ArrayList();
            }
            this.f181611k.add(iSudListenerInitSDK);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m198652y(final ISudListenerInitSDK iSudListenerInitSDK, final Context context, final String str, final String str2, final boolean z, final bpg0 bpg0Var, final bpg0 bpg0Var2) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.eyg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96426a.m198636B(iSudListenerInitSDK, context, str, str2, z, bpg0Var, bpg0Var2);
            }
        });
    }
}
