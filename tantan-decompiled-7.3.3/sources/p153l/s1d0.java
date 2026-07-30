package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tencent.open.SocialOperation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class s1d0 {
    /* JADX INFO: renamed from: a */
    public static void m184026a(JSONObject jSONObject, boolean z, String str) throws JSONException {
        jSONObject.put(str, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m184027b(JSONObject jSONObject, DefaultEnvironment defaultEnvironment, String str) throws JSONException {
        m184031f(jSONObject, defaultEnvironment.m82508d(str), str);
    }

    /* JADX INFO: renamed from: c */
    public static void m184028c(JSONObject jSONObject, double d, String str) throws JSONException {
        if (Math.abs(d) > 1.0E-5d) {
            jSONObject.put(str, d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m184029d(JSONObject jSONObject, q4f q4fVar) throws JSONException {
        m184030e(jSONObject, q4fVar.f155563a, "rt");
        m184026a(jSONObject, q4fVar.f155564b, "isauto");
        m184026a(jSONObject, q4fVar.f155565c, "atpid");
        m184031f(jSONObject, q4fVar.f155566d, "tt");
        m184028c(jSONObject, q4fVar.f155567e, BLiveOperationTitleShowType.duration);
        m184030e(jSONObject, q4fVar.f155568f, "cttm");
        m184030e(jSONObject, q4fVar.f155569g, "sttm");
        m184026a(jSONObject, q4fVar.f155570h, "ntpok");
        m184030e(jSONObject, q4fVar.f155571i, "sdtm");
        jSONObject.put("seq", q4fVar.f155572j);
        jSONObject.put("gseq", q4fVar.f155573k);
        jSONObject.put("state", q4fVar.f155574l);
        jSONObject.put("euuid", q4fVar.f155575m);
        m184031f(jSONObject, q4fVar.f155576n, "pid");
        m184031f(jSONObject, q4fVar.f155577o, "refpid");
        m184031f(jSONObject, q4fVar.f155578p, "clsnm");
        m184031f(jSONObject, q4fVar.f155579q, "reqid");
        m184031f(jSONObject, q4fVar.f155580r, "refreqid");
        m184031f(jSONObject, q4fVar.f155581s, "eid");
        m184031f(jSONObject, q4fVar.f155582t, "refereid");
        m184031f(jSONObject, q4fVar.f155583u, BaseSei.MID);
        m184031f(jSONObject, q4fVar.f155585w, "exts");
    }

    /* JADX INFO: renamed from: e */
    public static void m184030e(JSONObject jSONObject, long j, String str) throws JSONException {
        if (j == 0 || j == -2147483648L) {
            return;
        }
        jSONObject.put(str, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m184031f(JSONObject jSONObject, Object obj, String str) throws JSONException {
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return;
            }
            jSONObject.put(str, obj);
        } else if (obj instanceof JSONObject) {
            if (((JSONObject) obj).keys().hasNext()) {
                jSONObject.put(str, obj);
            }
        } else if (obj instanceof JSONArray) {
            if (((JSONArray) obj).length() > 0) {
                jSONObject.put(str, obj);
            }
        } else if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m184032g(q4f q4fVar) throws JSONException {
        DefaultEnvironment defaultEnvironmentM157018d = m4g0.m157014f().m157018d();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        m184027b(jSONObject2, defaultEnvironmentM157018d, "app");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "ch");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "intl");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "tch");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "lch");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "pushid");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "adtk");
        JSONObject jSONObject3 = new JSONObject();
        m184027b(jSONObject3, defaultEnvironmentM157018d, "utm_source");
        m184027b(jSONObject3, defaultEnvironmentM157018d, "utm_medium");
        m184027b(jSONObject3, defaultEnvironmentM157018d, "utm_term");
        m184027b(jSONObject3, defaultEnvironmentM157018d, "utm_content");
        m184027b(jSONObject3, defaultEnvironmentM157018d, "utm_campaign");
        m184031f(jSONObject2, jSONObject3, "utm");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "ls");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "mode");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "cuid");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "sunionid");
        m184027b(jSONObject2, defaultEnvironmentM157018d, "suid");
        JSONObject jSONObject4 = new JSONObject();
        m184027b(jSONObject4, defaultEnvironmentM157018d, "btry");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "chrg");
        m184027b(jSONObject4, defaultEnvironmentM157018d, SocialOperation.GAME_UNION_ID);
        m184027b(jSONObject4, defaultEnvironmentM157018d, "os");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "osv");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "brand");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "dm");
        m184027b(jSONObject4, defaultEnvironmentM157018d, Constants.INAPP_NOTIF_SHOW_CLOSE);
        m184027b(jSONObject4, defaultEnvironmentM157018d, "ct");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "aad");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "localid");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "puuid");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "net");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "mno");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "wfs");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "bts");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "gs");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "ps");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "vs");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "locale");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "lang");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "tz");
        m184027b(jSONObject4, defaultEnvironmentM157018d, "odevs");
        JSONObject jSONObject5 = new JSONObject();
        m184027b(jSONObject5, defaultEnvironmentM157018d, Oauth2AccessToken.KEY_UID);
        m184027b(jSONObject5, defaultEnvironmentM157018d, "lgtp");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.arg");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.locset");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.locuse");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.grg");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.sex");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.pvc");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.nt");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "sets.osets");
        m184027b(jSONObject5, defaultEnvironmentM157018d, "upf");
        JSONObject jSONObject6 = new JSONObject();
        m184027b(jSONObject6, defaultEnvironmentM157018d, "appv");
        m184027b(jSONObject6, defaultEnvironmentM157018d, "sdkv");
        m184027b(jSONObject6, defaultEnvironmentM157018d, "build");
        m184027b(jSONObject6, defaultEnvironmentM157018d, "pkg");
        jSONObject.put("source", jSONObject2);
        jSONObject.put(Device.TYPE, jSONObject4);
        jSONObject.put("sys_extras", defaultEnvironmentM157018d.m82508d("sysext"));
        jSONObject.put("versions", jSONObject6);
        jSONObject.put("tss", q4fVar.f155584v);
        jSONObject.put("user", jSONObject5);
        m184027b(jSONObject, defaultEnvironmentM157018d, "ab");
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m184033h(q4f q4fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m184029d(jSONObject, q4fVar);
        return jSONObject;
    }
}
