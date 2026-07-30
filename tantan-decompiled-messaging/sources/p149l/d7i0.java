package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class d7i0 implements p2m {

    /* JADX INFO: renamed from: a */
    public String f84743a;

    /* JADX INFO: renamed from: b */
    public String f84744b;

    /* JADX INFO: renamed from: c */
    public boolean f84745c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f84746d = new ArrayList<>();

    public d7i0() {
        this.f84743a = WeJson.EMPTY_ARR;
        this.f84744b = WeJson.EMPTY_ARR;
        this.f84745c = true;
        String strM79302F = RemoteConfig.m79298x().m79302F("mk_config");
        if (TextUtils.isEmpty(strM79302F)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM79302F).getJSONObject("safetyConfig");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("3rdPartyWhiteHostList");
            this.f84745c = jSONObject.optBoolean("enableForceCheckOfflinePackage", true);
            if (NullChecker.m81303a(jSONArrayOptJSONArray)) {
                this.f84743a = jSONArrayOptJSONArray.toString();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("safeBrowsingWhitelist");
            if (NullChecker.m81303a(jSONArrayOptJSONArray2)) {
                this.f84744b = jSONArrayOptJSONArray2.toString();
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("hostWhiteList");
            if (NullChecker.m81303a(this.f84746d) && NullChecker.m81303a(jSONArrayOptJSONArray3)) {
                int length = jSONArrayOptJSONArray3.length();
                for (int i = 0; i < length; i++) {
                    this.f84746d.add(jSONArrayOptJSONArray3.getString(i));
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: a */
    public String mo110229a() {
        return this.f84743a;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: b */
    public void mo110230b(Exception exc, String str) {
        CrashHelper.m81296c(new RuntimeException("MK logShownSSLDialog url=" + str, exc));
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: c */
    public boolean mo110231c() {
        return false;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: e */
    public boolean mo110233e() {
        return this.f84745c;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: f */
    public boolean mo110234f() {
        return false;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: g */
    public String mo110235g() {
        return this.f84744b;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: h */
    public boolean mo110236h(String str) {
        return this.f84746d.contains(str);
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: i */
    public boolean mo110237i() {
        return false;
    }

    @Override // p149l.p2m
    /* JADX INFO: renamed from: d */
    public void mo110232d(String str) {
    }
}
