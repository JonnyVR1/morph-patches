package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Device;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tencent.open.SocialOperation;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ssd0 {
    /* JADX INFO: renamed from: a */
    public static void m187698a(JSONObject jSONObject, q4f q4fVar) throws JSONException {
        s1d0.m184030e(jSONObject, q4fVar.f155563a, "rt");
        s1d0.m184031f(jSONObject, q4fVar.f155566d, "tt");
        s1d0.m184030e(jSONObject, q4fVar.f155568f, "cttm");
        s1d0.m184030e(jSONObject, q4fVar.f155569g, "sttm");
        s1d0.m184026a(jSONObject, q4fVar.f155570h, "ntpok");
        s1d0.m184030e(jSONObject, q4fVar.f155571i, "sdtm");
        jSONObject.put("seq", q4fVar.f155572j);
        jSONObject.put("gseq", q4fVar.f155573k);
        jSONObject.put("state", q4fVar.f155574l);
        jSONObject.put("euuid", q4fVar.f155575m);
        s1d0.m184031f(jSONObject, q4fVar.f155576n, "pid");
        s1d0.m184031f(jSONObject, q4fVar.f155581s, "eid");
        s1d0.m184031f(jSONObject, q4fVar.f155585w, "exts");
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m187699b(q4f q4fVar) throws JSONException {
        DefaultEnvironment defaultEnvironmentM157018d = m4g0.m157014f().m157018d();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        s1d0.m184027b(jSONObject2, defaultEnvironmentM157018d, "app");
        s1d0.m184027b(jSONObject2, defaultEnvironmentM157018d, "ch");
        s1d0.m184027b(jSONObject2, defaultEnvironmentM157018d, "intl");
        s1d0.m184027b(jSONObject2, defaultEnvironmentM157018d, "adtk");
        s1d0.m184027b(jSONObject2, defaultEnvironmentM157018d, "mode");
        JSONObject jSONObject3 = new JSONObject();
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, SocialOperation.GAME_UNION_ID);
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "os");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "osv");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "brand");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "dm");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, Constants.INAPP_NOTIF_SHOW_CLOSE);
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "ct");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "aad");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "localid");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "net");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "mno");
        s1d0.m184027b(jSONObject3, defaultEnvironmentM157018d, "odevs");
        JSONObject jSONObject4 = new JSONObject();
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, Oauth2AccessToken.KEY_UID);
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "lgtp");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.arg");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.locset");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.locuse");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.grg");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.sex");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.pvc");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.nt");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "sets.osets");
        s1d0.m184027b(jSONObject4, defaultEnvironmentM157018d, "upf");
        JSONObject jSONObject5 = new JSONObject();
        s1d0.m184027b(jSONObject5, defaultEnvironmentM157018d, "appv");
        s1d0.m184027b(jSONObject5, defaultEnvironmentM157018d, "sdkv");
        s1d0.m184027b(jSONObject5, defaultEnvironmentM157018d, "build");
        s1d0.m184027b(jSONObject5, defaultEnvironmentM157018d, "pkg");
        jSONObject.put("source", jSONObject2);
        jSONObject.put(Device.TYPE, jSONObject3);
        jSONObject.put("sys_extras", defaultEnvironmentM157018d.m82508d("sysext"));
        jSONObject.put("versions", jSONObject5);
        jSONObject.put("tss", q4fVar.f155584v);
        jSONObject.put("user", jSONObject4);
        s1d0.m184027b(jSONObject, defaultEnvironmentM157018d, "ab");
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m187700c(q4f q4fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m187698a(jSONObject, q4fVar);
        return jSONObject;
    }
}
