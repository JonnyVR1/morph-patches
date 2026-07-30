package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tencent.open.SocialOperation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ntc0 {
    /* JADX INFO: renamed from: a */
    public static void m161369a(JSONObject jSONObject, boolean z, String str) throws JSONException {
        jSONObject.put(str, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m161370b(JSONObject jSONObject, DefaultEnvironment defaultEnvironment, String str) throws JSONException {
        m161374f(jSONObject, defaultEnvironment.m81325d(str), str);
    }

    /* JADX INFO: renamed from: c */
    public static void m161371c(JSONObject jSONObject, double d, String str) throws JSONException {
        if (Math.abs(d) > 1.0E-5d) {
            jSONObject.put(str, d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m161372d(JSONObject jSONObject, l3f l3fVar) throws JSONException {
        m161373e(jSONObject, l3fVar.f125882a, "rt");
        m161369a(jSONObject, l3fVar.f125883b, "isauto");
        m161369a(jSONObject, l3fVar.f125884c, "atpid");
        m161374f(jSONObject, l3fVar.f125885d, "tt");
        m161371c(jSONObject, l3fVar.f125886e, BLiveOperationTitleShowType.duration);
        m161373e(jSONObject, l3fVar.f125887f, "cttm");
        m161373e(jSONObject, l3fVar.f125888g, "sttm");
        m161369a(jSONObject, l3fVar.f125889h, "ntpok");
        m161373e(jSONObject, l3fVar.f125890i, "sdtm");
        jSONObject.put("seq", l3fVar.f125891j);
        jSONObject.put("gseq", l3fVar.f125892k);
        jSONObject.put("state", l3fVar.f125893l);
        jSONObject.put("euuid", l3fVar.f125894m);
        m161374f(jSONObject, l3fVar.f125895n, "pid");
        m161374f(jSONObject, l3fVar.f125896o, "refpid");
        m161374f(jSONObject, l3fVar.f125897p, "clsnm");
        m161374f(jSONObject, l3fVar.f125898q, "reqid");
        m161374f(jSONObject, l3fVar.f125899r, "refreqid");
        m161374f(jSONObject, l3fVar.f125900s, "eid");
        m161374f(jSONObject, l3fVar.f125901t, "refereid");
        m161374f(jSONObject, l3fVar.f125902u, BaseSei.MID);
        m161374f(jSONObject, l3fVar.f125904w, "exts");
    }

    /* JADX INFO: renamed from: e */
    public static void m161373e(JSONObject jSONObject, long j, String str) throws JSONException {
        if (j == 0 || j == -2147483648L) {
            return;
        }
        jSONObject.put(str, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m161374f(JSONObject jSONObject, Object obj, String str) throws JSONException {
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
    public static JSONObject m161375g(l3f l3fVar) throws JSONException {
        DefaultEnvironment defaultEnvironmentM113873d = dwf0.m113869f().m113873d();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        m161370b(jSONObject2, defaultEnvironmentM113873d, "app");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "ch");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "intl");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "tch");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "lch");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "pushid");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "adtk");
        JSONObject jSONObject3 = new JSONObject();
        m161370b(jSONObject3, defaultEnvironmentM113873d, "utm_source");
        m161370b(jSONObject3, defaultEnvironmentM113873d, "utm_medium");
        m161370b(jSONObject3, defaultEnvironmentM113873d, "utm_term");
        m161370b(jSONObject3, defaultEnvironmentM113873d, "utm_content");
        m161370b(jSONObject3, defaultEnvironmentM113873d, "utm_campaign");
        m161374f(jSONObject2, jSONObject3, "utm");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "ls");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "mode");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "cuid");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "sunionid");
        m161370b(jSONObject2, defaultEnvironmentM113873d, "suid");
        JSONObject jSONObject4 = new JSONObject();
        m161370b(jSONObject4, defaultEnvironmentM113873d, "btry");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "chrg");
        m161370b(jSONObject4, defaultEnvironmentM113873d, SocialOperation.GAME_UNION_ID);
        m161370b(jSONObject4, defaultEnvironmentM113873d, "os");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "osv");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "brand");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "dm");
        m161370b(jSONObject4, defaultEnvironmentM113873d, Constants.INAPP_NOTIF_SHOW_CLOSE);
        m161370b(jSONObject4, defaultEnvironmentM113873d, "ct");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "aad");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "localid");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "puuid");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "net");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "mno");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "wfs");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "bts");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "gs");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "ps");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "vs");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "locale");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "lang");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "tz");
        m161370b(jSONObject4, defaultEnvironmentM113873d, "odevs");
        JSONObject jSONObject5 = new JSONObject();
        m161370b(jSONObject5, defaultEnvironmentM113873d, Oauth2AccessToken.KEY_UID);
        m161370b(jSONObject5, defaultEnvironmentM113873d, "lgtp");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.arg");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.locset");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.locuse");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.grg");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.sex");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.pvc");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.nt");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "sets.osets");
        m161370b(jSONObject5, defaultEnvironmentM113873d, "upf");
        JSONObject jSONObject6 = new JSONObject();
        m161370b(jSONObject6, defaultEnvironmentM113873d, "appv");
        m161370b(jSONObject6, defaultEnvironmentM113873d, "sdkv");
        m161370b(jSONObject6, defaultEnvironmentM113873d, "build");
        m161370b(jSONObject6, defaultEnvironmentM113873d, "pkg");
        jSONObject.put("source", jSONObject2);
        jSONObject.put(Device.TYPE, jSONObject4);
        jSONObject.put("sys_extras", defaultEnvironmentM113873d.m81325d("sysext"));
        jSONObject.put("versions", jSONObject6);
        jSONObject.put("tss", l3fVar.f125903v);
        jSONObject.put("user", jSONObject5);
        m161370b(jSONObject, defaultEnvironmentM113873d, "ab");
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m161376h(l3f l3fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m161372d(jSONObject, l3fVar);
        return jSONObject;
    }
}
