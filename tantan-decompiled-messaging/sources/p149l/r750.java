package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cosmos.mdlog.MDLog;
import com.google.gson.Gson;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r750 extends re2 {

    /* JADX INFO: renamed from: a */
    private static r750 f158011a;

    private r750() {
    }

    /* JADX INFO: renamed from: d */
    public static r750 m178124d() {
        if (f158011a == null) {
            f158011a = new r750();
        }
        return f158011a;
    }

    /* JADX INFO: renamed from: c */
    public esj0 m178125c(String str, @Nullable String str2, long j, String str3) throws Exception {
        m400 m400Var = xtc0.f194366a;
        MDLog.m7395i("tantantest", "checkUpdate url: " + m400Var.m152986c());
        HashMap<String, String> map = new HashMap<>();
        map.put("bid", str);
        map.put(WBConstants.AUTH_PARAMS_VERSION, j + "");
        map.put("net", "0");
        if (!TextUtils.isEmpty(str2)) {
            map.put(RequestParameters.SUBRESOURCE_REFERER, str2);
            try {
                str3 = Uri.parse(str2).getQueryParameter("multi");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        map.put("multi", str3);
        if (m400Var.m152985b() != null) {
            map.putAll(m400Var.m152985b());
        }
        JSONObject jSONObjectM179023b = m179023b(m400Var.m152986c(), map, m400Var.m152984a());
        MDLog.m7395i("tantantest", "checkUpdate response: " + jSONObjectM179023b.toString());
        esj0 esj0VarM117908a = esj0.m117908a(jSONObjectM179023b.getJSONObject("data"));
        if (esj0VarM117908a != null) {
            esj0VarM117908a.m117913f(jSONObjectM179023b);
        }
        return esj0VarM117908a;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<esj0> m178126e(ArrayList<v750> arrayList) throws Exception {
        ArrayList<esj0> arrayList2 = new ArrayList<>();
        m400 m400Var = xtc0.f194367b;
        MDLog.m7395i("tantantest", "getUpdateList url: " + m400Var.m152986c());
        HashMap<String, String> map = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        for (v750 v750Var : arrayList) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(WBConstants.AUTH_PARAMS_VERSION, v750Var.m197340f());
            jSONObject2.put("visited", v750Var.m197335a());
            jSONObject2.put("multi", v750Var.m197336b());
            jSONObject.put(v750Var.f180301a, jSONObject2);
        }
        map.put("bids", jSONObject.toString());
        map.put("net", na20.m158577h() ? "1" : "0");
        if (m400Var.m152985b() != null) {
            map.putAll(m400Var.m152985b());
        }
        JSONObject jSONObject3 = m179023b(m400Var.m152986c(), map, m400Var.m152984a()).getJSONObject("data");
        MDLog.m7395i("tantantest", "getUpdateList response: " + new Gson().toJson(jSONObject3));
        Iterator<String> itKeys = jSONObject3.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                esj0 esj0Var = new esj0();
                esj0Var.f93017d = jSONObjectOptJSONObject.optString("zip_url");
                esj0Var.f93018e = jSONObjectOptJSONObject.optString("patch_url");
                esj0Var.f93016c = jSONObjectOptJSONObject.optLong("newest_version");
                esj0Var.f93020g = jSONObjectOptJSONObject.optInt("isSandbox");
                for (v750 v750Var2 : arrayList) {
                    if (TextUtils.equals(next, v750Var2.f180301a)) {
                        esj0Var.f93015b = v750Var2.m197340f();
                        break;
                    }
                }
                esj0Var.f93014a = next;
                arrayList2.add(esj0Var);
                mxv.m156926a("TEST", "tang-------添加检查更新结果 " + jSONObjectOptJSONObject.toString());
            }
        }
        return arrayList2;
    }
}
