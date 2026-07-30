package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.data.Portrait;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\n¨\u0006\u001a"}, m88121d2 = {"Ll/ul8;", "Ll/qpl;", "Ll/hul;", "webView", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", "dataJson", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lorg/json/JSONObject;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "Lorg/json/JSONArray;", Constants.KEY_T, "(Lorg/json/JSONObject;)Lorg/json/JSONArray;", "r", "()Lorg/json/JSONObject;", "q", "Companion", "a", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class ul8 extends qpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul8(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final void m196538s(JSONObject dataJson) {
        try {
            if (this.f158879a == null) {
                return;
            }
            String strOptString = dataJson != null ? dataJson.optString("callback") : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("systemName", "Android");
            jSONObject.put("systemVersion", sjw.m186333w());
            jSONObject.put("model", ej2.m120960e());
            jSONObject.put("modelVersion", ej2.m120961f());
            jSONObject.put(Oauth2AccessToken.KEY_UID, sjw.m186313b());
            jSONObject.put("macid", ej2.m120957b());
            String strM120959d = ej2.m120959d();
            if (i8g0.m139001c(strM120959d)) {
                jSONObject.put("imsi", "unknown");
            } else {
                jSONObject.put("imsi", i8g0.m139006h(strM120959d));
            }
            jSONObject.put("android_id", sjw.m186312a());
            long jM120962g = ej2.m120962g() * 1024;
            long jM120956a = ej2.m120956a() * 1024;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("total", jM120962g);
            jSONObject2.put("free", jM120956a);
            jSONObject.put("ram", jSONObject2);
            jSONObject.put("boottime", SystemClock.elapsedRealtime());
            jSONObject.put("wifissids", m196541t(dataJson));
            jSONObject.put("brand", ej2.m120958c());
            jSONObject.put("idfa", -1);
            jSONObject.put(Device.OAID, sjw.m186329r());
            m177463g(strOptString, jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        String strOptString;
        String string;
        if (m177460c() != null && Intrinsics.m88377d(Device.TYPE, namespace) && method != null) {
            switch (method.hashCode()) {
                case -715441360:
                    if (method.equals("getScreenInfo")) {
                        JSONObject jSONObjectM196540r = m196540r();
                        strOptString = params != null ? params.optString("callback") : null;
                        if (jSONObjectM196540r == null || (string = jSONObjectM196540r.toString()) == null) {
                            string = "";
                        }
                        m177463g(strOptString, string);
                        return true;
                    }
                    break;
                case 344806259:
                    if (method.equals("getSystemInfo")) {
                        m196538s(params);
                        return true;
                    }
                    break;
                case 804366095:
                    if (method.equals("getClientInfo")) {
                        m196539q(params);
                        return true;
                    }
                    break;
                case 1714085202:
                    if (method.equals("getNetworkType")) {
                        strOptString = params != null ? params.optString("callback") : null;
                        String strM206538b = wi20.m206538b();
                        if (TextUtils.isEmpty(strM206538b)) {
                            strM206538b = "none";
                        }
                        m177463g(strOptString, qpl.m177459a(new String[]{"network_type"}, new String[]{strM206538b}).toString());
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m196539q(@Nullable JSONObject params) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, sjw.m186333w());
            jSONObject.put("build", sjw.m186332v());
            m177463g(params != null ? params.optString("callback") : null, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final JSONObject m196540r() {
        try {
            Context contextM155971a = lv0.m155971a();
            contextM155971a.getClass();
            Resources resources = contextM155971a.getResources();
            resources.getClass();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceWidth", displayMetrics.widthPixels);
            jSONObject.put("deviceHeight", displayMetrics.heightPixels);
            jSONObject.put("width", displayMetrics.widthPixels);
            jSONObject.put("height", displayMetrics.heightPixels);
            Context contextM155971a2 = lv0.m155971a();
            contextM155971a2.getClass();
            Resources resources2 = contextM155971a2.getResources();
            resources2.getClass();
            jSONObject.put(Constants.KEY_ORIENTATION, resources2.getConfiguration().orientation == 1 ? Portrait.TYPE : "landscape");
            jSONObject.put("density", Float.valueOf(displayMetrics.density));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final JSONArray m196541t(@Nullable JSONObject dataJson) {
        List<ScanResult> scanResults;
        Context applicationContext;
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= 2) {
                try {
                    Context context = lv0.f133670a;
                    Object systemService = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getSystemService("wifi");
                    if (systemService instanceof WifiManager) {
                        obj = systemService;
                    }
                    WifiManager wifiManager = (WifiManager) obj;
                    if (wifiManager == null || (scanResults = wifiManager.getScanResults()) == null) {
                        return new JSONArray();
                    }
                    JSONArray jSONArray = new JSONArray();
                    if (!scanResults.isEmpty()) {
                        int size = scanResults.size();
                        int i3 = 0;
                        while (i < size) {
                            int i4 = i3 + 1;
                            jSONArray.put(i3, scanResults.get(i).SSID);
                            if (i4 == 10) {
                                break;
                            }
                            i++;
                            i3 = i4;
                        }
                    }
                    return jSONArray;
                } catch (Throwable unused) {
                    return new JSONArray();
                }
            }
            if (j26.m143188a(m177460c(), strArr[i2]) != 0) {
                if (dataJson == null || dataJson.optInt("shield_dialog", 0) != 1) {
                    Context contextM177460c = m177460c();
                    Activity activity = (Activity) (contextM177460c instanceof Activity ? contextM177460c : null);
                    if (activity != null) {
                        v40.m199644u(activity, strArr, 1001);
                    }
                }
                return new JSONArray();
            }
            i2++;
        }
    }
}
