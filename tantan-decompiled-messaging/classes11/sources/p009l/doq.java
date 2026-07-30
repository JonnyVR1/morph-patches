package p009l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ActionBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.HttpBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ImageBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.JumpBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.LocationBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ShareBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.SliderBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.StorageBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.TrackBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UserBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class doq {

    /* JADX INFO: renamed from: d */
    public static doq f11928d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, n620> f11929a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f11930b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<WebViewX, HashMap<Class<? extends ef2>, ef2>> f11931c = new WeakHashMap<>();

    public doq() {
        m13431h(UserBridgeImplementation.class);
        m13431h(DeviceBridgeImplementation.class);
        m13431h(ShareBridgeImplementation.class);
        m13431h(ThirdPartFuncBridgeImplementation.class);
        m13431h(TrackBridgeImplementation.class);
        m13431h(WebViewBridgeImplementation.class);
        m13431h(LocationBridgeImplementation.class);
        m13431h(UIBridgeImplementation.class);
        m13431h(StorageBridgeImplementation.class);
        m13431h(ActionBridgeImplementation.class);
        m13431h(ImageBridgeImplementation.class);
        m13431h(JumpBridgeImplementation.class);
        m13431h(FeedBackBridgeImplementation.class);
        m13431h(SliderBridgeImplementation.class);
        m13431h(ExportedBridgeImplementation.class);
        m13431h(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: e */
    public static doq m13424e() {
        if (f11928d == null) {
            synchronized (doq.class) {
                try {
                    if (f11928d == null) {
                        f11928d = new doq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11928d;
    }

    /* JADX INFO: renamed from: a */
    public void m13425a(@NonNull WebViewX webViewX, @NonNull Class<? extends ef2> cls, @NonNull ef2 ef2Var) {
        HashMap<Class<? extends ef2>, ef2> map = this.f11931c.get(webViewX);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, ef2Var);
        this.f11931c.put(webViewX, map);
    }

    /* JADX INFO: renamed from: b */
    public void m13426b(@NonNull WebViewX webViewX) {
        if (this.f11931c.containsKey(webViewX)) {
            HashMap<Class<? extends ef2>, ef2> map = this.f11931c.get(webViewX);
            if (NullChecker.a(map) && map.size() > 0) {
                Iterator<ef2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo10039a();
                }
                map.clear();
            }
            this.f11931c.remove(webViewX);
        }
    }

    /* JADX INFO: renamed from: c */
    public List<Class> m13427c() {
        return this.f11930b;
    }

    /* JADX INFO: renamed from: d */
    public ef2 m13428d(@NonNull WebViewX webViewX, @NonNull Class<? extends ef2> cls) {
        HashMap<Class<? extends ef2>, ef2> map = this.f11931c.get(webViewX);
        if (NullChecker.a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public n620 m13429f(String str) {
        return this.f11929a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public n620 m13430g(String str, Object[] objArr) {
        String str2 = str + "@@___@@" + objArr.length;
        n620 n620VarM13429f = m13429f(str2);
        if (n620VarM13429f == null) {
            for (Class<? extends ef2> cls : m13427c()) {
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
                                CrashHelper.g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 JsBridgeContext"));
                            }
                            if (objArr.length == method.getParameterTypes().length - 1) {
                                n620 n620Var = new n620();
                                n620Var.f17228a = method;
                                n620Var.f17229b = cls;
                                boolean zUiThread = liqVar.uiThread();
                                n620Var.f17230c = zUiThread;
                                if (zUiThread && n620Var.f17228a.getReturnType() != Void.TYPE) {
                                    CrashHelper.g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空"));
                                }
                                m13432i(str2, n620Var);
                                return n620Var;
                            }
                        }
                    }
                    i++;
                    c = 0;
                }
            }
        }
        return n620VarM13429f;
    }

    /* JADX INFO: renamed from: h */
    public void m13431h(Class cls) {
        if (!this.f11930b.contains(cls)) {
            this.f11930b.add(cls);
        }
        h400.m15394g().m15402j(cls);
    }

    /* JADX INFO: renamed from: i */
    public void m13432i(String str, n620 n620Var) {
        this.f11929a.put(str, n620Var);
    }
}
