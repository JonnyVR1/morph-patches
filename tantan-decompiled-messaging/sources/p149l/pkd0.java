package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Device;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tencent.open.SocialOperation;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class pkd0 {
    /* JADX INFO: renamed from: a */
    public static void m170020a(JSONObject jSONObject, l3f l3fVar) throws JSONException {
        ntc0.m161373e(jSONObject, l3fVar.f125882a, "rt");
        ntc0.m161374f(jSONObject, l3fVar.f125885d, "tt");
        ntc0.m161373e(jSONObject, l3fVar.f125887f, "cttm");
        ntc0.m161373e(jSONObject, l3fVar.f125888g, "sttm");
        ntc0.m161369a(jSONObject, l3fVar.f125889h, "ntpok");
        ntc0.m161373e(jSONObject, l3fVar.f125890i, "sdtm");
        jSONObject.put("seq", l3fVar.f125891j);
        jSONObject.put("gseq", l3fVar.f125892k);
        jSONObject.put("state", l3fVar.f125893l);
        jSONObject.put("euuid", l3fVar.f125894m);
        ntc0.m161374f(jSONObject, l3fVar.f125895n, "pid");
        ntc0.m161374f(jSONObject, l3fVar.f125900s, "eid");
        ntc0.m161374f(jSONObject, l3fVar.f125904w, "exts");
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m170021b(l3f l3fVar) throws JSONException {
        DefaultEnvironment defaultEnvironmentM113873d = dwf0.m113869f().m113873d();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        ntc0.m161370b(jSONObject2, defaultEnvironmentM113873d, "app");
        ntc0.m161370b(jSONObject2, defaultEnvironmentM113873d, "ch");
        ntc0.m161370b(jSONObject2, defaultEnvironmentM113873d, "intl");
        ntc0.m161370b(jSONObject2, defaultEnvironmentM113873d, "adtk");
        ntc0.m161370b(jSONObject2, defaultEnvironmentM113873d, "mode");
        JSONObject jSONObject3 = new JSONObject();
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, SocialOperation.GAME_UNION_ID);
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "os");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "osv");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "brand");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "dm");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, Constants.INAPP_NOTIF_SHOW_CLOSE);
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "ct");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "aad");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "localid");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "net");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "mno");
        ntc0.m161370b(jSONObject3, defaultEnvironmentM113873d, "odevs");
        JSONObject jSONObject4 = new JSONObject();
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, Oauth2AccessToken.KEY_UID);
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "lgtp");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.arg");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.locset");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.locuse");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.grg");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.sex");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.pvc");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.nt");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "sets.osets");
        ntc0.m161370b(jSONObject4, defaultEnvironmentM113873d, "upf");
        JSONObject jSONObject5 = new JSONObject();
        ntc0.m161370b(jSONObject5, defaultEnvironmentM113873d, "appv");
        ntc0.m161370b(jSONObject5, defaultEnvironmentM113873d, "sdkv");
        ntc0.m161370b(jSONObject5, defaultEnvironmentM113873d, "build");
        ntc0.m161370b(jSONObject5, defaultEnvironmentM113873d, "pkg");
        jSONObject.put("source", jSONObject2);
        jSONObject.put(Device.TYPE, jSONObject3);
        jSONObject.put("sys_extras", defaultEnvironmentM113873d.m81325d("sysext"));
        jSONObject.put("versions", jSONObject5);
        jSONObject.put("tss", l3fVar.f125903v);
        jSONObject.put("user", jSONObject4);
        ntc0.m161370b(jSONObject, defaultEnvironmentM113873d, "ab");
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m170022c(l3f l3fVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m170020a(jSONObject, l3fVar);
        return jSONObject;
    }
}
