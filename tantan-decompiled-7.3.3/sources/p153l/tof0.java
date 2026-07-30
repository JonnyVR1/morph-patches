package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.heytap.mcssdk.mode.Message;
import com.p051p1.mobile.putong.core.data.UserId;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class tof0 implements fqw.InterfaceC17037b {
    /* JADX INFO: renamed from: b */
    private static JSONObject m192022b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Message.APP_ID, gqw.f105963d);
            jSONObject.put("secret", gqw.f105964e);
            jSONObject.put("net", ui20.m196133a());
            jSONObject.put("carrier", dj2.m116020d());
            jSONObject.put("os", "Android");
            jSONObject.put("rom", dj2.m116019c());
            jSONObject.put("brand", dj2.m116017a());
            jSONObject.put("mobile_type", dj2.m116018b());
            return jSONObject;
        } catch (JSONException e) {
            gqw.m131497u(e);
            return new JSONObject();
        }
    }

    @Override // p153l.fqw.InterfaceC17037b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo126808a() {
        JSONObject jSONObjectM192022b = m192022b();
        try {
            jSONObjectM192022b.put("channel", m192023c());
            jSONObjectM192022b.put(UserId.TYPE, mo130070h());
            jSONObjectM192022b.put("lat", m192025e());
            jSONObjectM192022b.put("lng", m192026f());
            jSONObjectM192022b.put("i_v", m192024d());
            jSONObjectM192022b.put("o_v", m192027g());
            return jSONObjectM192022b;
        } catch (Exception e) {
            gqw.m131497u(e);
            return jSONObjectM192022b;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m192023c() {
        return "1";
    }

    /* JADX INFO: renamed from: d */
    public int m192024d() {
        return p0e.m170051a();
    }

    /* JADX INFO: renamed from: e */
    public double m192025e() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: f */
    public double m192026f() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public int m192027g() {
        return p0e.m170051a();
    }

    /* JADX INFO: renamed from: h */
    public String mo130070h() {
        return "277127198";
    }
}
