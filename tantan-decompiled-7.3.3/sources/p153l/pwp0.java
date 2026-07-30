package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class pwp0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    private Context f154423a;

    /* JADX INFO: renamed from: b */
    private String f154424b = "";

    /* JADX INFO: renamed from: c */
    private String f154425c = "";

    /* JADX INFO: renamed from: d */
    private String f154426d = "";

    /* JADX INFO: renamed from: e */
    private String f154427e = "";

    /* JADX INFO: renamed from: f */
    private String f154428f = "";

    /* JADX INFO: renamed from: g */
    private String f154429g = "";

    /* JADX INFO: renamed from: h */
    private String f154430h = "";

    /* JADX INFO: renamed from: i */
    private HashMap<String, String> f154431i = new HashMap<>();

    /* JADX INFO: renamed from: p */
    private String m174060p(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m174061a(boolean z) {
        String str = this.f154424b;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: b */
    public Context m174062b() {
        return this.f154423a;
    }

    /* JADX INFO: renamed from: c */
    public String m174063c(boolean z) {
        if (this.f154431i.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f154431i.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                return "";
            }
        }
        return z ? m174060p(jSONObject.toString()) : jSONObject.toString();
    }

    public Object clone() {
        try {
            pwp0 pwp0Var = (pwp0) super.clone();
            HashMap<String, String> map = new HashMap<>();
            for (Map.Entry<String, String> entry : pwp0Var.f154431i.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            pwp0Var.f154431i = map;
            return pwp0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m174064d(boolean z) {
        String str = this.f154426d;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: e */
    public String m174065e(boolean z) {
        String str = this.f154428f;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: f */
    public String m174066f(boolean z) {
        String str = this.f154425c;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: j */
    public String m174067j(boolean z) {
        String str = this.f154429g;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: k */
    public String m174068k(boolean z) {
        String str = this.f154427e;
        return z ? m174060p(str) : str;
    }

    /* JADX INFO: renamed from: l */
    public void m174069l(String str) {
        this.f154424b = str;
    }

    /* JADX INFO: renamed from: m */
    public void m174070m(Context context) {
        this.f154423a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: n */
    public void m174071n(String str) {
        this.f154426d = str;
    }

    /* JADX INFO: renamed from: o */
    public void m174072o(String str) {
        this.f154427e = str;
    }

    /* JADX INFO: renamed from: q */
    public boolean m174073q() {
        return (this.f154423a == null || TextUtils.isEmpty(this.f154424b) || TextUtils.isEmpty(this.f154426d) || TextUtils.isEmpty(this.f154427e)) ? false : true;
    }
}
