package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.core.data.UserId;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mgf0 implements hnw.InterfaceC17357b {
    /* JADX INFO: renamed from: b */
    private static JSONObject m154538b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Message.APP_ID, inw.f114061d);
            jSONObject.put("secret", inw.f114062e);
            jSONObject.put("net", na20.m158570a());
            jSONObject.put("carrier", wi2.m203273d());
            jSONObject.put("os", "Android");
            jSONObject.put("rom", wi2.m203272c());
            jSONObject.put("brand", wi2.m203270a());
            jSONObject.put("mobile_type", wi2.m203271b());
            return jSONObject;
        } catch (JSONException e) {
            inw.m137183u(e);
            return new JSONObject();
        }
    }

    @Override // p149l.hnw.InterfaceC17357b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo132027a() {
        JSONObject jSONObjectM154538b = m154538b();
        try {
            jSONObjectM154538b.put("channel", m154539c());
            jSONObjectM154538b.put(UserId.TYPE, mo105191h());
            jSONObjectM154538b.put("lat", m154541e());
            jSONObjectM154538b.put("lng", m154542f());
            jSONObjectM154538b.put("i_v", m154540d());
            jSONObjectM154538b.put("o_v", m154543g());
            return jSONObjectM154538b;
        } catch (Exception e) {
            inw.m137183u(e);
            return jSONObjectM154538b;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m154539c() {
        return "1";
    }

    /* JADX INFO: renamed from: d */
    public int m154540d() {
        return czd.m109408a();
    }

    /* JADX INFO: renamed from: e */
    public double m154541e() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: f */
    public double m154542f() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public int m154543g() {
        return czd.m109408a();
    }

    /* JADX INFO: renamed from: h */
    public String mo105191h() {
        return "277127198";
    }
}
