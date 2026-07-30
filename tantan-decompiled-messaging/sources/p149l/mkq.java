package p149l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mmutil.task.C3804c;
import com.immomo.mwc.sdk.C3929c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.WebResourcePool;
import com.quickjs.JSArray;
import com.quickjs.JSContext;
import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import com.quickjs.JSValue;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mkq extends v600 {

    /* JADX INFO: renamed from: c */
    private static txf0 f134369c;

    /* JADX INFO: renamed from: d */
    private static tke0 f134370d;

    /* JADX INFO: renamed from: e */
    private static piw f134371e;

    /* JADX INFO: renamed from: f */
    private static String f134372f;

    /* JADX INFO: renamed from: b */
    private JSObject f134373b;

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ce */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, l.mkq] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m155060a(p149l.mkq r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.quickjs.JSFunction r19, com.immomo.mwc.sdk.WebResourcePool.WebResourceLifecycle r20, java.lang.String r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.mkq.m155060a(l.mkq, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, com.quickjs.JSFunction, com.immomo.mwc.sdk.WebResourcePool$WebResourceLifecycle, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: b */
    private String m155061b(String str, String str2) {
        return "mwc:" + str + ":" + str2;
    }

    /* JADX INFO: renamed from: c */
    private void m155062c(final String str, final String str2, final WebResourcePool.WebResourceLifecycle webResourceLifecycle, final String str3, final String str4, final JSONObject jSONObject, final JSFunction jSFunction) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String strM19444g = mje0.m154794f(str2).m19444g();
        C3804c.m18444d(2, new Runnable() { // from class: l.kkq
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                mkq.m155060a(this.f123582a, str2, str3, str4, jSONObject, jSFunction, webResourceLifecycle, str, strM19444g);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private void m155063d(JSFunction jSFunction, AtomicReference<Throwable> atomicReference, String str, String str2, String str3) {
        if (jSFunction != null) {
            try {
                JSContext context = jSFunction.getContext();
                if (context != null && !context.isReleased()) {
                    if (!mje0.m154796h(str3)) {
                        MWCEngine.m19361D("JavaScriptAPIModule", str3, "[不会执行self.fetch的回调方法(Worker不存在)]web:request:skipped:js:callback:cause:no:worker @url=%s", str2);
                        return;
                    }
                    JSArray jSArray = new JSArray(context);
                    if (atomicReference.get() == null) {
                        jSArray.push(JSValue.NULL());
                        JSObject jSObject = new JSObject(context);
                        if (str == null) {
                            str = "null";
                        }
                        jSArray.push(jSObject.set("data", str));
                    } else {
                        jSArray.push(atomicReference.get().getMessage());
                        jSArray.push(JSValue.NULL());
                    }
                    jSFunction.call(null, jSArray);
                }
            } catch (Exception e) {
                MWCEngine.m19382m("JavaScriptAPIModule", str3, "web:request:js:callback:exception @url=%s, @error=%s", str2, e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private HashMap<String, Object> m155064e(Object obj, Object obj2) {
        WebResourcePool.WebResourceLifecycle webResourceLifecycle = WebResourcePool.WebResourceLifecycle.ONCE;
        JSONObject jSONObject = new JSONObject();
        String string = null;
        JSFunction jSFunction = jej0.m141146a(obj2) ? (JSFunction) obj2 : null;
        String str = "post";
        if (jej0.m141147b(obj)) {
            JSObject jSObject = (JSObject) obj;
            try {
                if ("worker".equalsIgnoreCase(jSObject.getString("cacheType"))) {
                    webResourceLifecycle = WebResourcePool.WebResourceLifecycle.WORKER;
                }
            } catch (Exception unused) {
            }
            try {
                str = "get".equalsIgnoreCase(jSObject.getString(FirebaseAnalytics.Param.METHOD)) ? "get" : "post";
            } catch (Exception unused2) {
            }
            try {
                string = jSObject.getString("url");
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Object obj3 = jSObject.get("data");
                if (jej0.m141148c(obj3)) {
                    jSONObject = ((JSObject) obj3).toJSONObject();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("cacheLifecycle", webResourceLifecycle);
        map.put("url", string);
        map.put(FirebaseAnalytics.Param.METHOD, str);
        map.put("data", jSONObject);
        map.put("callback", jSFunction);
        return map;
    }

    @JavascriptInterface
    public void _trigger(JSObject jSObject, String str, JSObject jSObject2) {
        String string = jSObject2.getString("workerId");
        EventType eventTypeFromTypeName = EventType.fromTypeName(str);
        MWCEngine.m19380k("JavaScriptAPIModule", string, "trigger:native @eventName=%s, @workerId=%s", str, string);
        if (eventTypeFromTypeName == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(string)) {
            MWCEngine.m19382m("JavaScriptAPIModule", string, "trigger:native:invalid:arguments @eventName=%s, @workerId=%s", str, string);
        } else if (eventTypeFromTypeName != EventType.MK_DESTROY) {
            MWCEngine.m19374Q("JavaScriptAPIModule", string, "trigger:native:unimplemented:event @eventName=%s, @workerId=%s", str, string);
        } else {
            WebResourcePool.m19407g(string);
            mje0.m154798j(string);
        }
    }

    @JavascriptInterface
    public void clear(JSObject jSObject) {
        txf0 txf0Var;
        jSObject.getString("serviceId");
        String string = jSObject.getString("workerId");
        if (TextUtils.isEmpty(string) || (txf0Var = f134369c) == null) {
            return;
        }
        try {
            txf0Var.clear();
        } catch (Throwable th) {
            MWCEngine.m19382m("JavaScriptAPIModule", string, "clear storage error @error=%s", th);
        }
    }

    @JavascriptInterface
    public void fetch(JSObject jSObject, Object obj, Object obj2) {
        String string = jSObject.getString("serviceId");
        String string2 = jSObject.getString("workerId");
        HashMap<String, Object> mapM155064e = m155064e(obj, obj2);
        m155062c(string, string2, (WebResourcePool.WebResourceLifecycle) mapM155064e.get("cacheLifecycle"), (String) mapM155064e.get("url"), (String) mapM155064e.get(FirebaseAnalytics.Param.METHOD), (JSONObject) mapM155064e.get("data"), (JSFunction) mapM155064e.get("callback"));
    }

    @JavascriptInterface
    public String getCookie(JSObject jSObject, String str) {
        C3929c c3929cM154794f;
        String string = jSObject.getString("serviceId");
        String string2 = jSObject.getString("workerId");
        if (!TextUtils.isEmpty(string2) && (c3929cM154794f = mje0.m154794f(string2)) != null && !TextUtils.isEmpty(c3929cM154794f.m19441d()) && f134370d != null) {
            if (Objects.equals(string, c3929cM154794f.m19442e()) && Objects.equals(string2, c3929cM154794f.m19446i())) {
                String str2 = f134370d.mo185588a(c3929cM154794f.m19441d()).get(str);
                return TextUtils.isEmpty(str2) ? "" : str2;
            }
            MWCEngine.m19381l("JavaScriptAPIModule", string2, "not match js serviceId or workerId in java worker");
        }
        return "";
    }

    @JavascriptInterface
    public String getItem(JSObject jSObject, String str) {
        String string = jSObject.getString("serviceId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string) || f134369c == null) {
            return "";
        }
        return "" + f134369c.mo190091a(m155061b(string, str));
    }

    @JavascriptInterface
    public String getUa() {
        if (f134372f == null) {
            f134372f = "" + f134371e.getUa();
        }
        return f134372f;
    }

    @JavascriptInterface
    public boolean setItem(JSObject jSObject, String str, String str2) {
        String string = jSObject.getString("serviceId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string) || f134369c == null || str2.getBytes(StandardCharsets.UTF_8).length > 2048) {
            return false;
        }
        return f134369c.mo190092b(m155061b(string, str), str2);
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        f134370d = MWCEngine.m19393x();
        f134369c = MWCEngine.m19394y();
        f134371e = MWCEngine.m19391v();
        this.f134373b = jSContext.addJavascriptInterface(this, "g_mwc_api");
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
    }
}
