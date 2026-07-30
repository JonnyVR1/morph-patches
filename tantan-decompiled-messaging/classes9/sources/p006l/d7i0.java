package p006l;

import android.text.TextUtils;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.p2m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d7i0 implements p2m {

    /* JADX INFO: renamed from: a */
    public String f10054a;

    /* JADX INFO: renamed from: b */
    public String f10055b;

    /* JADX INFO: renamed from: c */
    public boolean f10056c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f10057d = new ArrayList<>();

    public d7i0() {
        this.f10054a = "[]";
        this.f10055b = "[]";
        this.f10056c = true;
        String strF = RemoteConfig.x().F("mk_config");
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strF).getJSONObject("safetyConfig");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("3rdPartyWhiteHostList");
            this.f10056c = jSONObject.optBoolean("enableForceCheckOfflinePackage", true);
            if (NullChecker.a(jSONArrayOptJSONArray)) {
                this.f10054a = jSONArrayOptJSONArray.toString();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("safeBrowsingWhitelist");
            if (NullChecker.a(jSONArrayOptJSONArray2)) {
                this.f10055b = jSONArrayOptJSONArray2.toString();
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("hostWhiteList");
            if (NullChecker.a(this.f10057d) && NullChecker.a(jSONArrayOptJSONArray3)) {
                int length = jSONArrayOptJSONArray3.length();
                for (int i = 0; i < length; i++) {
                    this.f10057d.add(jSONArrayOptJSONArray3.getString(i));
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m13815a() {
        return this.f10054a;
    }

    /* JADX INFO: renamed from: b */
    public void m13816b(Exception exc, String str) {
        CrashHelper.c(new RuntimeException("MK logShownSSLDialog url=" + str, exc));
    }

    /* JADX INFO: renamed from: c */
    public boolean m13817c() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m13819e() {
        return this.f10056c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m13820f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public String m13821g() {
        return this.f10055b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m13822h(String str) {
        return this.f10057d.contains(str);
    }

    /* JADX INFO: renamed from: i */
    public boolean m13823i() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m13818d(String str) {
    }
}
