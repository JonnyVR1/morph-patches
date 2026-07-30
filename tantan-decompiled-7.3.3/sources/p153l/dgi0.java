package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class dgi0 implements i5m {

    /* JADX INFO: renamed from: a */
    public String f88305a;

    /* JADX INFO: renamed from: b */
    public String f88306b;

    /* JADX INFO: renamed from: c */
    public boolean f88307c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f88308d = new ArrayList<>();

    public dgi0() {
        this.f88305a = WeJson.EMPTY_ARR;
        this.f88306b = WeJson.EMPTY_ARR;
        this.f88307c = true;
        String strM80485F = RemoteConfig.m80481x().m80485F("mk_config");
        if (TextUtils.isEmpty(strM80485F)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM80485F).getJSONObject("safetyConfig");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("3rdPartyWhiteHostList");
            this.f88307c = jSONObject.optBoolean("enableForceCheckOfflinePackage", true);
            if (NullChecker.m82486a(jSONArrayOptJSONArray)) {
                this.f88305a = jSONArrayOptJSONArray.toString();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("safeBrowsingWhitelist");
            if (NullChecker.m82486a(jSONArrayOptJSONArray2)) {
                this.f88306b = jSONArrayOptJSONArray2.toString();
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("hostWhiteList");
            if (NullChecker.m82486a(this.f88308d) && NullChecker.m82486a(jSONArrayOptJSONArray3)) {
                int length = jSONArrayOptJSONArray3.length();
                for (int i = 0; i < length; i++) {
                    this.f88308d.add(jSONArrayOptJSONArray3.getString(i));
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: a */
    public String mo115646a() {
        return this.f88305a;
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: b */
    public boolean mo115647b() {
        return false;
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: d */
    public boolean mo115649d() {
        return false;
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: e */
    public String mo115650e() {
        return this.f88306b;
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: f */
    public boolean mo115651f(String str) {
        return this.f88308d.contains(str);
    }

    @Override // p153l.i5m
    /* JADX INFO: renamed from: c */
    public void mo115648c(String str) {
    }
}
