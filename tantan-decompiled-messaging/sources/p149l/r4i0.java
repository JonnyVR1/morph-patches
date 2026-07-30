package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.task.C3804c;
import com.immomo.mwc.sdk.MWCEngine;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class r4i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public static final pxb f157699h = new pxb();

    public r4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m177808D(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, String str2) {
        HashMap<String, String> map;
        if (jSONObject != null) {
            HashMap<String, String> map2 = new HashMap<>();
            o400.INSTANCE.m162510a(jSONObject, map2, null);
            map = map2;
        } else {
            map = null;
        }
        if (!"get".equalsIgnoreCase(str) && !"head".equalsIgnoreCase(str)) {
            HashMap<String, String> map3 = new HashMap<>();
            if (jSONObject3 != null) {
                o400.INSTANCE.m162510a(jSONObject3, map3, null);
            }
            return f157699h.m171827a(str2, str, map3, jSONObject2, map);
        }
        HashMap<String, String> map4 = new HashMap<>();
        if (jSONObject2 != null) {
            o400.INSTANCE.m162510a(jSONObject2, map4, null);
        }
        if (jSONObject3 != null) {
            o400.INSTANCE.m162510a(jSONObject3, map4, null);
        }
        return f157699h.m171827a(str2, str, map4, null, map);
    }

    /* JADX INFO: renamed from: F */
    public static String m177809F(final String str, final String str2, JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, long j) throws Exception {
        C22306c c22306cFromCallable = C22306c.fromCallable(new Callable() { // from class: l.q4i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r4i0.m177808D(jSONObject4, str2, jSONObject2, jSONObject3, str);
            }
        });
        if (j != -1 && j > 0) {
            c22306cFromCallable = c22306cFromCallable.compose(mkd0.m154965Q()).take(j, TimeUnit.MILLISECONDS);
        }
        String str3 = (String) c22306cFromCallable.toBlocking().m212771c("____exception time out____");
        if (!TextUtils.equals(str3, "____exception time out____")) {
            return str3;
        }
        throw new RuntimeException(str + " , " + str2 + ", request timeout :" + j);
    }

    /* JADX INFO: renamed from: E */
    public final String m177810E(String str, String str2, JSONObject jSONObject) {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView == null || mKWebView.m87089v0()) {
            return null;
        }
        return MWCEngine.m19358A(this.f98430a.getWorkerId(), str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m177811G(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, String str3) {
        String strM177810E = m177810E(str, str2, jSONObject);
        if (TextUtils.isEmpty(strM177810E)) {
            try {
                MKWebView mKWebView = this.f98430a;
                if (mKWebView != null) {
                    mKWebView.getBid();
                }
                strM177810E = m177809F(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j);
            } catch (Exception e) {
                CrashHelper.m81296c(new RuntimeException("TantanHttpBridge runHttpRequest error url=" + str + " ,method=" + str2, e));
                m177812H(str3, strM177810E, e);
                return;
            }
        }
        m122324c(str3, strM177810E);
    }

    /* JADX INFO: renamed from: H */
    public void m177812H(String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            m122324c(str, jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    public void m177813I(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        C3804c.m18444d(2, new Runnable() { // from class: l.p4i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147178a.m177811G(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, str3);
            }
        });
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        r4i0 r4i0Var;
        Throwable th;
        String strOptString;
        str2.getClass();
        if (!str2.equals(SocialConstants.TYPE_REQUEST)) {
            return false;
        }
        try {
            strOptString = jSONObject.optString("callback");
            try {
                String strOptString2 = jSONObject.optString("url");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (!NullChecker.m81303a(jSONObjectOptJSONObject)) {
                    return true;
                }
                r4i0Var = this;
                try {
                    r4i0Var.m177813I(strOptString2, jSONObjectOptJSONObject.optString(FirebaseAnalytics.Param.METHOD, "get"), jSONObjectOptJSONObject, jSONObjectOptJSONObject.optJSONObject("body"), jSONObjectOptJSONObject.optJSONObject(CommandMessage.PARAMS), jSONObjectOptJSONObject.optJSONObject("header"), jSONObjectOptJSONObject.optLong("timeout", -1L), strOptString);
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
        CrashHelper.m81296c(th);
        if (strOptString == null) {
            return true;
        }
        r4i0Var.m177812H(strOptString, null, th);
        return true;
    }
}
