package p009l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mwc.sdk.MWCEngine;
import com.p1.mobile.putong.app.PutongAct;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.fnl;
import l.mkd0;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r4i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public static final pxb f19634h = new pxb();

    public r4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m21403D(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, String str2) {
        HashMap<String, String> map;
        if (jSONObject != null) {
            HashMap<String, String> map2 = new HashMap<>();
            o400.INSTANCE.m19607a(jSONObject, map2, null);
            map = map2;
        } else {
            map = null;
        }
        if (!"get".equalsIgnoreCase(str) && !"head".equalsIgnoreCase(str)) {
            HashMap<String, String> map3 = new HashMap<>();
            if (jSONObject3 != null) {
                o400.INSTANCE.m19607a(jSONObject3, map3, null);
            }
            return f19634h.m20752a(str2, str, map3, jSONObject2, map);
        }
        HashMap<String, String> map4 = new HashMap<>();
        if (jSONObject2 != null) {
            o400.INSTANCE.m19607a(jSONObject2, map4, null);
        }
        if (jSONObject3 != null) {
            o400.INSTANCE.m19607a(jSONObject3, map4, null);
        }
        return f19634h.m20752a(str2, str, map4, null, map);
    }

    /* JADX INFO: renamed from: F */
    public static String m21404F(final String str, final String str2, JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, long j) throws Exception {
        c cVarFromCallable = c.fromCallable(new Callable() { // from class: l.q4i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r4i0.m21403D(jSONObject4, str2, jSONObject2, jSONObject3, str);
            }
        });
        if (j != -1 && j > 0) {
            cVarFromCallable = cVarFromCallable.compose(mkd0.Q()).take(j, TimeUnit.MILLISECONDS);
        }
        String str3 = (String) cVarFromCallable.toBlocking().c("____exception time out____");
        if (!TextUtils.equals(str3, "____exception time out____")) {
            return str3;
        }
        throw new RuntimeException(str + " , " + str2 + ", request timeout :" + j);
    }

    /* JADX INFO: renamed from: E */
    public final String m21405E(String str, String str2, JSONObject jSONObject) {
        MKWebView mKWebView = ((fnl) this).a;
        if (mKWebView == null || mKWebView.v0()) {
            return null;
        }
        return MWCEngine.A(((fnl) this).a.getWorkerId(), str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m21406G(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, String str3) {
        String strM21405E = m21405E(str, str2, jSONObject);
        if (TextUtils.isEmpty(strM21405E)) {
            try {
                MKWebView mKWebView = ((fnl) this).a;
                if (mKWebView != null) {
                    mKWebView.getBid();
                }
                strM21405E = m21404F(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j);
            } catch (Exception e) {
                CrashHelper.c(new RuntimeException("TantanHttpBridge runHttpRequest error url=" + str + " ,method=" + str2, e));
                m21407H(str3, strM21405E, e);
                return;
            }
        }
        c(str3, strM21405E);
    }

    /* JADX INFO: renamed from: H */
    public void m21407H(String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            c(str, jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    public void m21408I(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        com.immomo.mmutil.task.c.d(2, new Runnable() { // from class: l.p4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18381a.m21406G(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, str3);
            }
        });
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        r4i0 r4i0Var;
        Throwable th;
        String strOptString;
        str2.getClass();
        if (!str2.equals("request")) {
            return false;
        }
        try {
            strOptString = jSONObject.optString("callback");
            try {
                String strOptString2 = jSONObject.optString("url");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA);
                if (!NullChecker.a(jSONObjectOptJSONObject)) {
                    return true;
                }
                r4i0Var = this;
                try {
                    r4i0Var.m21408I(strOptString2, jSONObjectOptJSONObject.optString("method", "get"), jSONObjectOptJSONObject, jSONObjectOptJSONObject.optJSONObject("body"), jSONObjectOptJSONObject.optJSONObject("params"), jSONObjectOptJSONObject.optJSONObject("header"), jSONObjectOptJSONObject.optLong("timeout", -1L), strOptString);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                r4i0Var = this;
            }
            th = th;
        } catch (Throwable th4) {
            r4i0Var = this;
            th = th4;
            strOptString = null;
        }
        CrashHelper.c(th);
        if (strOptString == null) {
            return true;
        }
        r4i0Var.m21407H(strOptString, null, th);
        return true;
    }
}
