package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.task.C3949c;
import com.immomo.mwc.sdk.MWCEngine;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class adi0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public static final dzb f70692h = new dzb();

    public adi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m97070L(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, String str2) {
        HashMap<String, String> map;
        if (jSONObject != null) {
            HashMap<String, String> map2 = new HashMap<>();
            dd00.INSTANCE.m115315a(jSONObject, map2, null);
            map = map2;
        } else {
            map = null;
        }
        if (!"get".equalsIgnoreCase(str) && !"head".equalsIgnoreCase(str)) {
            HashMap<String, String> map3 = new HashMap<>();
            if (jSONObject3 != null) {
                dd00.INSTANCE.m115315a(jSONObject3, map3, null);
            }
            return f70692h.m118734a(str2, str, map3, jSONObject2, map);
        }
        HashMap<String, String> map4 = new HashMap<>();
        if (jSONObject2 != null) {
            dd00.INSTANCE.m115315a(jSONObject2, map4, null);
        }
        if (jSONObject3 != null) {
            dd00.INSTANCE.m115315a(jSONObject3, map4, null);
        }
        return f70692h.m118734a(str2, str, map4, null, map);
    }

    /* JADX INFO: renamed from: N */
    public static String m97071N(final String str, final String str2, JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, long j) throws Exception {
        C22421c c22421cFromCallable = C22421c.fromCallable(new Callable() { // from class: l.zci0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return adi0.m97070L(jSONObject4, str2, jSONObject2, jSONObject3, str);
            }
        });
        if (j != -1 && j > 0) {
            c22421cFromCallable = c22421cFromCallable.compose(psd0.m173606Q()).take(j, TimeUnit.MILLISECONDS);
        }
        String str3 = (String) c22421cFromCallable.toBlocking().m165964c("____exception time out____");
        if (!TextUtils.equals(str3, "____exception time out____")) {
            return str3;
        }
        throw new RuntimeException(str + " , " + str2 + ", request timeout :" + j);
    }

    /* JADX INFO: renamed from: M */
    public final String m97072M(String str, String str2, JSONObject jSONObject) {
        hul hulVar = this.f158879a;
        if (hulVar == null || hulVar.mo17920e()) {
            return null;
        }
        hul hulVar2 = this.f158879a;
        if (hulVar2 instanceof MKWebView) {
            return MWCEngine.m20338A(((MKWebView) hulVar2).getWorkerId(), str, str2, jSONObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m97073O(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, String str3) {
        String strM97072M = m97072M(str, str2, jSONObject);
        if (TextUtils.isEmpty(strM97072M)) {
            try {
                hul hulVar = this.f158879a;
                if (hulVar != null) {
                    hulVar.getBid();
                }
                strM97072M = m97071N(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j);
            } catch (Exception e) {
                CrashHelper.m82479c(new RuntimeException("TantanHttpBridge runHttpRequest error url=" + str + " ,method=" + str2, e));
                m97074P(str3, strM97072M, e);
                return;
            }
        }
        m177463g(str3, strM97072M);
    }

    /* JADX INFO: renamed from: P */
    public void m97074P(String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            m177463g(str, jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m97075Q(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        C3949c.m19427d(2, new Runnable() { // from class: l.yci0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198511a.m97073O(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, str3);
            }
        });
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        adi0 adi0Var;
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
                if (!NullChecker.m82486a(jSONObjectOptJSONObject)) {
                    return true;
                }
                adi0Var = this;
                try {
                    adi0Var.m97075Q(strOptString2, jSONObjectOptJSONObject.optString(FirebaseAnalytics.Param.METHOD, "get"), jSONObjectOptJSONObject, jSONObjectOptJSONObject.optJSONObject("body"), jSONObjectOptJSONObject.optJSONObject(CommandMessage.PARAMS), jSONObjectOptJSONObject.optJSONObject("header"), jSONObjectOptJSONObject.optLong("timeout", -1L), strOptString);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                adi0Var = this;
            }
            th = th;
        } catch (Throwable th4) {
            adi0Var = this;
            th = th4;
            strOptString = null;
        }
        CrashHelper.m82479c(th);
        if (strOptString == null) {
            return true;
        }
        adi0Var.m97074P(strOptString, null, th);
        return true;
    }
}
