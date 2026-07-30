package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qpl {

    /* JADX INFO: renamed from: b */
    public static final String f158878b = "qpl";

    /* JADX INFO: renamed from: a */
    protected hul f158879a;

    public qpl(hul hulVar) {
        this.f158879a = hulVar;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m177459a(String[] strArr, Object[] objArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArr.length; i++) {
            try {
                jSONObject.put(strArr[i], objArr[i]);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public Context m177460c() {
        hul hulVar = this.f158879a;
        if (hulVar == null) {
            return null;
        }
        Context webContext = hulVar.getWebContext();
        if (webContext instanceof Activity) {
            return webContext;
        }
        if (webContext instanceof ContextThemeWrapper) {
            return ((ContextThemeWrapper) webContext).getBaseContext();
        }
        if (webContext instanceof r26) {
            return ((r26) webContext).getBaseContext();
        }
        return webContext instanceof MutableContextWrapper ? ((MutableContextWrapper) webContext).getBaseContext() : webContext;
    }

    /* JADX INFO: renamed from: d */
    public String m177461d() {
        hul hulVar = this.f158879a;
        return hulVar != null ? hulVar.getOriginURL() : "";
    }

    /* JADX INFO: renamed from: e */
    public zgi m177462e(String str, String str2, String str3, CheckPolicy checkPolicy) {
        hul hulVar = this.f158879a;
        if (hulVar != null) {
            return hulVar.getWebViewPkgInfoCache().m18489c(str, str2, str3, checkPolicy);
        }
        if (i8g0.m139002d(str)) {
            return FepManager.m17582z().m17591l(str, checkPolicy);
        }
        if (i8g0.m139002d(str2)) {
            return FepManager.m17582z().m17592n(str2, str3, str, checkPolicy);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo18017f(int i, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m177463g(String str, String str2) {
        hul hulVar = this.f158879a;
        if (hulVar != null) {
            hulVar.mo17918d(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m177464h(String str, String str2, String str3, String str4) {
        m177463g(str, m177459a(new String[]{"data", NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{str2, str4, str3}).toString());
    }

    /* JADX INFO: renamed from: i */
    public void m177465i(String str, JSONArray jSONArray, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            jSONObject.put("message", str2);
            m177463g(str, jSONObject.toString());
        } catch (Exception e) {
            Log.e(f158878b, "", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m177466j(String str, JSONObject jSONObject, String str2, int i) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put(NotificationCompat.CATEGORY_STATUS, i);
            jSONObject2.put("message", str2);
            m177463g(str, jSONObject2.toString());
        } catch (Exception e) {
            Log.e(f158878b, "", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m177467k(String str, String str2, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (!TextUtils.isEmpty(strOptString)) {
            m177463g(strOptString, "empty method");
        }
        jzv.m147734g(f158878b, "runCommand: empty method, namespace: " + str + ", method: " + str2 + ",params:" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo18018p(String str, String str2, JSONObject jSONObject) throws Exception;

    /* JADX INFO: renamed from: l */
    public void mo121328l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo177468m() {
    }

    /* JADX INFO: renamed from: n */
    public void mo177469n() {
    }

    /* JADX INFO: renamed from: o */
    public void mo98811o(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
