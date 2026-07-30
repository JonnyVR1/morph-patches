package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lnp0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    private Context f129003a;

    /* JADX INFO: renamed from: b */
    private String f129004b = "";

    /* JADX INFO: renamed from: c */
    private String f129005c = "";

    /* JADX INFO: renamed from: d */
    private String f129006d = "";

    /* JADX INFO: renamed from: e */
    private String f129007e = "";

    /* JADX INFO: renamed from: f */
    private String f129008f = "";

    /* JADX INFO: renamed from: g */
    private String f129009g = "";

    /* JADX INFO: renamed from: h */
    private String f129010h = "";

    /* JADX INFO: renamed from: i */
    private HashMap<String, String> f129011i = new HashMap<>();

    /* JADX INFO: renamed from: p */
    private String m150692p(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m150693a(boolean z) {
        String str = this.f129004b;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: b */
    public Context m150694b() {
        return this.f129003a;
    }

    /* JADX INFO: renamed from: c */
    public String m150695c(boolean z) {
        if (this.f129011i.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f129011i.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                return "";
            }
        }
        return z ? m150692p(jSONObject.toString()) : jSONObject.toString();
    }

    public Object clone() {
        try {
            lnp0 lnp0Var = (lnp0) super.clone();
            HashMap<String, String> map = new HashMap<>();
            for (Map.Entry<String, String> entry : lnp0Var.f129011i.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            lnp0Var.f129011i = map;
            return lnp0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m150696d(boolean z) {
        String str = this.f129006d;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: e */
    public String m150697e(boolean z) {
        String str = this.f129008f;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: f */
    public String m150698f(boolean z) {
        String str = this.f129005c;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: j */
    public String m150699j(boolean z) {
        String str = this.f129009g;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: k */
    public String m150700k(boolean z) {
        String str = this.f129007e;
        return z ? m150692p(str) : str;
    }

    /* JADX INFO: renamed from: l */
    public void m150701l(String str) {
        this.f129004b = str;
    }

    /* JADX INFO: renamed from: m */
    public void m150702m(Context context) {
        this.f129003a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: n */
    public void m150703n(String str) {
        this.f129006d = str;
    }

    /* JADX INFO: renamed from: o */
    public void m150704o(String str) {
        this.f129007e = str;
    }

    /* JADX INFO: renamed from: q */
    public boolean m150705q() {
        return (this.f129003a == null || TextUtils.isEmpty(this.f129004b) || TextUtils.isEmpty(this.f129006d) || TextUtils.isEmpty(this.f129007e)) ? false : true;
    }
}
