package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ActionBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.HttpBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ImageBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.JumpBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.LocationBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ShareBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.SliderBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.StorageBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.TrackBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UserBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class doq {

    /* JADX INFO: renamed from: d */
    public static doq f87185d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, n620> f87186a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f87187b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<WebViewX, HashMap<Class<? extends ef2>, ef2>> f87188c = new WeakHashMap<>();

    public doq() {
        m112817h(UserBridgeImplementation.class);
        m112817h(DeviceBridgeImplementation.class);
        m112817h(ShareBridgeImplementation.class);
        m112817h(ThirdPartFuncBridgeImplementation.class);
        m112817h(TrackBridgeImplementation.class);
        m112817h(WebViewBridgeImplementation.class);
        m112817h(LocationBridgeImplementation.class);
        m112817h(UIBridgeImplementation.class);
        m112817h(StorageBridgeImplementation.class);
        m112817h(ActionBridgeImplementation.class);
        m112817h(ImageBridgeImplementation.class);
        m112817h(JumpBridgeImplementation.class);
        m112817h(FeedBackBridgeImplementation.class);
        m112817h(SliderBridgeImplementation.class);
        m112817h(ExportedBridgeImplementation.class);
        m112817h(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: e */
    public static doq m112810e() {
        if (f87185d == null) {
            synchronized (doq.class) {
                try {
                    if (f87185d == null) {
                        f87185d = new doq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f87185d;
    }

    /* JADX INFO: renamed from: a */
    public void m112811a(@NonNull WebViewX webViewX, @NonNull Class<? extends ef2> cls, @NonNull ef2 ef2Var) {
        HashMap<Class<? extends ef2>, ef2> map = this.f87188c.get(webViewX);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, ef2Var);
        this.f87188c.put(webViewX, map);
    }

    /* JADX INFO: renamed from: b */
    public void m112812b(@NonNull WebViewX webViewX) {
        if (this.f87188c.containsKey(webViewX)) {
            HashMap<Class<? extends ef2>, ef2> map = this.f87188c.get(webViewX);
            if (NullChecker.m81303a(map) && map.size() > 0) {
                Iterator<ef2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo46528a();
                }
                map.clear();
            }
            this.f87188c.remove(webViewX);
        }
    }

    /* JADX INFO: renamed from: c */
    public List<Class> m112813c() {
        return this.f87187b;
    }

    /* JADX INFO: renamed from: d */
    public ef2 m112814d(@NonNull WebViewX webViewX, @NonNull Class<? extends ef2> cls) {
        HashMap<Class<? extends ef2>, ef2> map = this.f87188c.get(webViewX);
        if (NullChecker.m81303a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public n620 m112815f(String str) {
        return this.f87186a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public n620 m112816g(String str, Object[] objArr) {
        String str2 = str + "@@___@@" + objArr.length;
        n620 n620VarM112815f = m112815f(str2);
        if (n620VarM112815f == null) {
            for (Class<? extends ef2> cls : m112813c()) {
                Method[] methods = cls.getMethods();
                int length = methods.length;
                char c = 0;
                int i = 0;
                while (i < length) {
                    Method method = methods[i];
                    if (method.isAnnotationPresent(liq.class)) {
                        liq liqVar = (liq) method.getAnnotation(liq.class);
                        if (liqVar.key().equals(str) && !liqVar.isMkBridge()) {
                            if (method.getParameterTypes().length < 1 || method.getParameterTypes()[c] != boq.class) {
                                CrashHelper.m81300g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 JsBridgeContext"));
                            }
                            if (objArr.length == method.getParameterTypes().length - 1) {
                                n620 n620Var = new n620();
                                n620Var.f137263a = method;
                                n620Var.f137264b = cls;
                                boolean zUiThread = liqVar.uiThread();
                                n620Var.f137265c = zUiThread;
                                if (zUiThread && n620Var.f137263a.getReturnType() != Void.TYPE) {
                                    CrashHelper.m81300g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空"));
                                }
                                m112818i(str2, n620Var);
                                return n620Var;
                            }
                        }
                    }
                    i++;
                    c = 0;
                }
            }
        }
        return n620VarM112815f;
    }

    /* JADX INFO: renamed from: h */
    public void m112817h(Class cls) {
        if (!this.f87187b.contains(cls)) {
            this.f87187b.add(cls);
        }
        h400.m129208g().m129216j(cls);
    }

    /* JADX INFO: renamed from: i */
    public void m112818i(String str, n620 n620Var) {
        this.f87186a.put(str, n620Var);
    }
}
