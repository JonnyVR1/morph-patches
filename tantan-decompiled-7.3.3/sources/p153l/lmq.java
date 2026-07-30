package p153l;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mwc.sdk.C4072c;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.WebResourcePool;
import com.immomo.mwc.sdk.utils.thread.C4079b;
import com.quickjs.JSArray;
import com.quickjs.JSContext;
import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import com.quickjs.JSValue;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class lmq extends ef00 {

    /* JADX INFO: renamed from: c */
    private static b6g0 f132708c;

    /* JADX INFO: renamed from: d */
    private static yse0 f132709d;

    /* JADX INFO: renamed from: e */
    private static klw f132710e;

    /* JADX INFO: renamed from: f */
    private static String f132711f;

    /* JADX INFO: renamed from: b */
    private JSObject f132712b;

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ce */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, l.lmq] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m154878a(lmq lmqVar, String str, String str2, String str3, JSONObject jSONObject, JSFunction jSFunction, WebResourcePool.WebResourceLifecycle webResourceLifecycle, String str4, String str5) throws Throwable {
        kmq kmqVar;
        ?? r3;
        Object objValueOf;
        String str6 = str2;
        lmqVar.getClass();
        AtomicReference atomicReference = new AtomicReference();
        String strM20375z = MWCEngine.m20375z(str);
        try {
            WebResourcePool.AbstractC4069b abstractC4069bM20384d = WebResourcePool.m20384d(str, WebResourcePool.m20386f(str2, str3, jSONObject));
            if (abstractC4069bM20384d != null) {
                try {
                    if (abstractC4069bM20384d.m20400h() == 1) {
                        MWCEngine.m20341D("JavaScriptAPIModule", str, "[Web容器发起重复请求并命中容器已有缓存]web:request:start:reuse @url=%s, @ts=%d, @version=[%s] %s", str6, Long.valueOf(hrw.m136930a()), strM20375z, "[STYLE:6d117d,f6e6ff,f4b3ff]");
                        lmqVar.m154880c(jSFunction, atomicReference, String.valueOf(abstractC4069bM20384d.m20399g()), str6, str);
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    str6 = str2;
                }
            }
            try {
                iml imlVarM20365p = MWCEngine.m20365p();
                if (imlVarM20365p == null) {
                    return;
                }
                try {
                    kmq kmqVar2 = new kmq(lmqVar, str, str2, str3, jSONObject);
                    str6 = str2;
                    try {
                        kmqVar2.m20402j(webResourceLifecycle);
                        WebResourcePool.m20389i(kmqVar2);
                        jSONObject.put("__mwc__", strM20375z);
                        MWCEngine.m20341D("JavaScriptAPIModule", str, "[Web容器发起请求]web:request:start @url=%s, @ts=%d, @version=[%s] %s", str6, Long.valueOf(hrw.m136930a()), strM20375z, "[STYLE:9c27b0,f6e6ff,f4b3ff]");
                        try {
                            String strMo131890a = imlVarM20365p.mo131890a(str4, str6, str3, jSONObject, str5);
                            str6 = str6;
                            Integer numValueOf = Integer.valueOf(strMo131890a == null ? -1 : strMo131890a.hashCode());
                            objValueOf = Long.valueOf(hrw.m136930a());
                            MWCEngine.m20341D("JavaScriptAPIModule", str, "[Web容器请求成功]web:request:success @url=%s, @response=%s, @ts=%d, @version=[%s] %s", str6, numValueOf, objValueOf, strM20375z, "[STYLE:9c27b0,f6e6ff,f4b3ff]");
                            try {
                                synchronized (kmqVar2) {
                                    try {
                                        kmqVar2.m20403k(strMo131890a);
                                        kmqVar2.m20404l(1);
                                        kmqVar2.notifyAll();
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                                lmqVar.m154880c(jSFunction, atomicReference, strMo131890a, str6, str);
                                return;
                            } catch (Exception e2) {
                                e = e2;
                                kmqVar = kmqVar2;
                                r3 = objValueOf;
                                MWCEngine.m20362m("JavaScriptAPIModule", str, "[Web容器请求失败]web:request:error @url=%s, @version=[%s], @error=%s", str6, strM20375z, e);
                                r3.set(e);
                                if (kmqVar != null) {
                                    synchronized (kmqVar) {
                                        kmqVar.m20403k(null);
                                        kmqVar.m20404l(2);
                                        WebResourcePool.m20388h(kmqVar.m20398f(), str);
                                        kmqVar.notifyAll();
                                    }
                                }
                                lmqVar.m154880c(jSFunction, r3, null, str6, str);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str6 = str6;
                            objValueOf = atomicReference;
                            kmqVar = kmqVar2;
                            r3 = objValueOf;
                            MWCEngine.m20362m("JavaScriptAPIModule", str, "[Web容器请求失败]web:request:error @url=%s, @version=[%s], @error=%s", str6, strM20375z, e);
                            r3.set(e);
                            if (kmqVar != null) {
                                synchronized (kmqVar) {
                                    kmqVar.m20403k(null);
                                    kmqVar.m20404l(2);
                                    WebResourcePool.m20388h(kmqVar.m20398f(), str);
                                    kmqVar.notifyAll();
                                }
                            }
                            lmqVar.m154880c(jSFunction, r3, null, str6, str);
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str6 = str2;
                    atomicReference = atomicReference;
                    kmqVar = null;
                    r3 = atomicReference;
                }
            } catch (Exception e6) {
                e = e6;
                str6 = str2;
            }
            atomicReference = atomicReference;
        } catch (Exception e7) {
            e = e7;
        }
        kmqVar = null;
        r3 = atomicReference;
        MWCEngine.m20362m("JavaScriptAPIModule", str, "[Web容器请求失败]web:request:error @url=%s, @version=[%s], @error=%s", str6, strM20375z, e);
        r3.set(e);
        if (kmqVar != null) {
            synchronized (kmqVar) {
                kmqVar.m20403k(null);
                kmqVar.m20404l(2);
                WebResourcePool.m20388h(kmqVar.m20398f(), str);
                kmqVar.notifyAll();
            }
        }
        lmqVar.m154880c(jSFunction, r3, null, str6, str);
    }

    /* JADX INFO: renamed from: b */
    private void m154879b(final String str, final String str2, final WebResourcePool.WebResourceLifecycle webResourceLifecycle, final String str3, final String str4, final JSONObject jSONObject, final JSFunction jSFunction) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String strM20424g = rre0.m182760f(str2).m20424g();
        C4079b.m20450d(2, new Runnable() { // from class: l.jmq
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                lmq.m154878a(this.f121695a, str2, str3, str4, jSONObject, jSFunction, webResourceLifecycle, str, strM20424g);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m154880c(JSFunction jSFunction, AtomicReference<Throwable> atomicReference, String str, String str2, String str3) {
        if (jSFunction != null) {
            try {
                JSContext context = jSFunction.getContext();
                if (context != null && !context.isReleased()) {
                    if (!rre0.m182762h(str3)) {
                        MWCEngine.m20341D("JavaScriptAPIModule", str3, "[不会执行self.fetch的回调方法(Worker不存在)]web:request:skipped:js:callback:cause:no:worker @url=%s", str2);
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
                MWCEngine.m20362m("JavaScriptAPIModule", str3, "web:request:js:callback:exception @url=%s, @error=%s", str2, e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private HashMap<String, Object> m154881d(Object obj, Object obj2) {
        WebResourcePool.WebResourceLifecycle webResourceLifecycle = WebResourcePool.WebResourceLifecycle.ONCE;
        JSONObject jSONObject = new JSONObject();
        String string = null;
        JSFunction jSFunction = nnj0.m163870a(obj2) ? (JSFunction) obj2 : null;
        String str = "post";
        if (nnj0.m163871b(obj)) {
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
                if (nnj0.m163872c(obj3)) {
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
        MWCEngine.m20360k("JavaScriptAPIModule", string, "trigger:native @eventName=%s, @workerId=%s", str, string);
        if (eventTypeFromTypeName == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(string)) {
            MWCEngine.m20362m("JavaScriptAPIModule", string, "trigger:native:invalid:arguments @eventName=%s, @workerId=%s", str, string);
        } else if (eventTypeFromTypeName != EventType.MK_DESTROY) {
            MWCEngine.m20354Q("JavaScriptAPIModule", string, "trigger:native:unimplemented:event @eventName=%s, @workerId=%s", str, string);
        } else {
            WebResourcePool.m20387g(string);
            rre0.m182764j(string);
        }
    }

    @JavascriptInterface
    public void fetch(JSObject jSObject, Object obj, Object obj2) {
        String string = jSObject.getString("serviceId");
        String string2 = jSObject.getString("workerId");
        HashMap<String, Object> mapM154881d = m154881d(obj, obj2);
        m154879b(string, string2, (WebResourcePool.WebResourceLifecycle) mapM154881d.get("cacheLifecycle"), (String) mapM154881d.get("url"), (String) mapM154881d.get(FirebaseAnalytics.Param.METHOD), (JSONObject) mapM154881d.get("data"), (JSFunction) mapM154881d.get("callback"));
    }

    @JavascriptInterface
    public String getCookie(JSObject jSObject, String str) {
        C4072c c4072cM182760f;
        String string = jSObject.getString("serviceId");
        String string2 = jSObject.getString("workerId");
        if (!TextUtils.isEmpty(string2) && (c4072cM182760f = rre0.m182760f(string2)) != null && !TextUtils.isEmpty(c4072cM182760f.m20421d()) && f132709d != null) {
            if (Objects.equals(string, c4072cM182760f.m20422e()) && Objects.equals(string2, c4072cM182760f.m20426i())) {
                String str2 = f132709d.mo136968a(c4072cM182760f.m20421d()).get(str);
                return TextUtils.isEmpty(str2) ? "" : str2;
            }
            MWCEngine.m20361l("JavaScriptAPIModule", string2, "not match js serviceId or workerId in java worker");
        }
        return "";
    }

    @JavascriptInterface
    public String getItem(JSObject jSObject, String str) {
        return "";
    }

    @JavascriptInterface
    public String getUa() {
        if (f132711f == null) {
            f132711f = "" + f132710e.getUa();
        }
        return f132711f;
    }

    @JavascriptInterface
    public boolean setItem(JSObject jSObject, String str, String str2) {
        return false;
    }

    @Override // com.quickjs.Plugin
    public void setup(JSContext jSContext) {
        f132709d = MWCEngine.m20373x();
        f132708c = MWCEngine.m20374y();
        f132710e = MWCEngine.m20371v();
        this.f132712b = jSContext.addJavascriptInterface(this, "g_mwc_api");
    }

    @JavascriptInterface
    public void clear(JSObject jSObject) {
    }

    @Override // com.quickjs.Plugin
    public void close(JSContext jSContext) {
    }
}
