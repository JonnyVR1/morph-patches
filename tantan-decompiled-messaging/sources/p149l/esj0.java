package p149l;

import android.text.TextUtils;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class esj0 {

    /* JADX INFO: renamed from: a */
    public String f93014a;

    /* JADX INFO: renamed from: b */
    public long f93015b;

    /* JADX INFO: renamed from: c */
    public long f93016c;

    /* JADX INFO: renamed from: d */
    public String f93017d;

    /* JADX INFO: renamed from: e */
    public String f93018e;

    /* JADX INFO: renamed from: f */
    public int f93019f;

    /* JADX INFO: renamed from: g */
    public int f93020g;

    /* JADX INFO: renamed from: h */
    public JSONObject f93021h;

    /* JADX INFO: renamed from: i */
    private Map<String, Object> f93022i;

    /* JADX INFO: renamed from: a */
    public static esj0 m117908a(JSONObject jSONObject) throws JSONException {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        esj0 esj0Var = new esj0();
        mxv.m156926a("TEST", "解析update结果  " + jSONObject.toString());
        esj0Var.f93016c = (long) jSONObject.optInt("newest_version");
        esj0Var.f93015b = (long) jSONObject.optInt(WBConstants.AUTH_PARAMS_VERSION);
        esj0Var.f93019f = jSONObject.optInt("asymEncrypt");
        esj0Var.f93020g = jSONObject.optInt("isSandbox");
        String strOptString = jSONObject.optString("zip_url", null);
        String strOptString2 = jSONObject.optString("patch_url", null);
        if (TextUtils.isEmpty(strOptString) || (!strOptString.startsWith("http://") && !strOptString.startsWith("https://"))) {
            strOptString = null;
        }
        if (!TextUtils.isEmpty(strOptString2) && (strOptString2.startsWith("http://") || strOptString2.startsWith("https://"))) {
            str = strOptString2;
        }
        esj0Var.f93017d = strOptString;
        esj0Var.f93018e = str;
        esj0Var.f93014a = jSONObject.optString("bid");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mk_config");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            if (esj0Var.f93022i == null) {
                esj0Var.f93022i = new HashMap();
            }
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectOptJSONObject.opt(next);
                gow.m127294j(esj0Var.f93014a, next, objOpt);
                esj0Var.f93022i.put(next, objOpt);
            }
        }
        StringBuilder sb = new StringBuilder("tang-----解析patch_url ");
        sb.append(esj0Var.f93018e);
        sb.append("    ");
        sb.append(esj0Var.f93018e == null);
        sb.append("   ");
        sb.append(Objects.nonNull(esj0Var.f93018e));
        mxv.m156926a("TEST", sb.toString());
        return esj0Var;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m117909b() {
        return this.f93022i;
    }

    /* JADX INFO: renamed from: c */
    public String m117910c() {
        return this.f93018e;
    }

    /* JADX INFO: renamed from: d */
    public String m117911d() {
        return this.f93017d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m117912e() {
        return this.f93015b != this.f93016c;
    }

    /* JADX INFO: renamed from: f */
    public void m117913f(JSONObject jSONObject) {
        this.f93021h = jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m117914g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("newest_version", this.f93016c);
        jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.f93015b);
        jSONObject.put("patch_url", this.f93018e);
        jSONObject.put("zip_url", this.f93017d);
        jSONObject.put("asymEncrypt", this.f93019f);
        jSONObject.put("isSandbox", this.f93020g);
        jSONObject.put("mk_config", this.f93022i);
        return jSONObject;
    }
}
