package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.meituan.robust.Constants;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14358b {

    /* JADX INFO: renamed from: a */
    protected HashMap<String, b> f60192a = new HashMap<>();

    /* JADX INFO: renamed from: com.tencent.open.b$b */
    public static class b {
        public void call(String str, List<String> list, a aVar) {
            Method method;
            Object objInvoke;
            Method[] declaredMethods = getClass().getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                    break;
                } else {
                    i++;
                }
            }
            if (method == null) {
                if (aVar != null) {
                    aVar.mo84243a();
                    return;
                }
                return;
            }
            try {
                int size = list.size();
                if (size == 0) {
                    objInvoke = method.invoke(this, null);
                } else if (size == 1) {
                    objInvoke = method.invoke(this, list.get(0));
                } else if (size == 2) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1));
                } else if (size == 3) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2));
                } else if (size != 4) {
                    objInvoke = size != 5 ? method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                } else {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3));
                }
                Class<?> returnType = method.getReturnType();
                SLog.m84305d("openSDK_LOG.JsBridge", "-->call, result: " + objInvoke + " | ReturnType: " + returnType.getName());
                if (!Constants.VOID.equals(returnType.getName()) && returnType != Void.class) {
                    if (aVar == null || !customCallback()) {
                        return;
                    }
                    aVar.mo84245a(objInvoke != null ? objInvoke.toString() : null);
                    return;
                }
                if (aVar != null) {
                    aVar.mo84244a((Object) null);
                }
            } catch (Exception e) {
                SLog.m84308e("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e);
                if (aVar != null) {
                    aVar.mo84243a();
                }
            }
        }

        public boolean customCallback() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo84242a(WebView webView, String str) {
        SLog.m84313v("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        mo84241a((String) arrayList.get(2), (String) arrayList.get(3), arrayList.subList(4, arrayList.size() - 1), new a(webView, 4L, str));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo84241a(String str, String str2, List<String> list, a aVar) {
        SLog.m84313v("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        b bVar = this.f60192a.get(str);
        if (bVar != null) {
            SLog.m84305d("openSDK_LOG.JsBridge", "call----");
            bVar.call(str2, list, aVar);
        } else {
            SLog.m84305d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
            if (aVar != null) {
                aVar.mo84243a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84240a(b bVar, String str) {
        this.f60192a.put(str, bVar);
    }

    /* JADX INFO: renamed from: com.tencent.open.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        protected WeakReference<WebView> f60193a;

        /* JADX INFO: renamed from: b */
        protected long f60194b;

        /* JADX INFO: renamed from: c */
        protected String f60195c;

        public a(WebView webView, long j, String str) {
            this.f60193a = new WeakReference<>(webView);
            this.f60194b = j;
            this.f60195c = str;
        }

        /* JADX INFO: renamed from: a */
        public void mo84244a(Object obj) {
            String string;
            WebView webView = this.f60193a.get();
            if (webView == null) {
                return;
            }
            if (obj instanceof String) {
                string = "'" + ((Object) ((String) obj).replace("\\", "\\\\").replace("'", "\\'")) + "'";
            } else {
                string = ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) ? obj.toString() : "'undefined'";
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f60194b + ",{'r':0,'result':" + string + "});");
        }

        /* JADX INFO: renamed from: a */
        public void mo84243a() {
            WebView webView = this.f60193a.get();
            if (webView == null) {
                return;
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f60194b + ",{'r':1,'result':'no such method'})");
        }

        /* JADX INFO: renamed from: a */
        public void mo84245a(String str) {
            WebView webView = this.f60193a.get();
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }
    }
}
