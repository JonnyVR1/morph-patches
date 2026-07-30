package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ActionBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.HttpBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ImageBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.JumpBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.LocationBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ShareBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.SliderBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.StorageBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.TrackBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UserBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class cqq {

    /* JADX INFO: renamed from: d */
    public static cqq f83109d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, ve20> f83110a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f83111b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<WebViewX, HashMap<Class<? extends lf2>, lf2>> f83112c = new WeakHashMap<>();

    public cqq() {
        m111977h(UserBridgeImplementation.class);
        m111977h(DeviceBridgeImplementation.class);
        m111977h(ShareBridgeImplementation.class);
        m111977h(ThirdPartFuncBridgeImplementation.class);
        m111977h(TrackBridgeImplementation.class);
        m111977h(WebViewBridgeImplementation.class);
        m111977h(LocationBridgeImplementation.class);
        m111977h(UIBridgeImplementation.class);
        m111977h(StorageBridgeImplementation.class);
        m111977h(ActionBridgeImplementation.class);
        m111977h(ImageBridgeImplementation.class);
        m111977h(JumpBridgeImplementation.class);
        m111977h(FeedBackBridgeImplementation.class);
        m111977h(SliderBridgeImplementation.class);
        m111977h(ExportedBridgeImplementation.class);
        m111977h(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: e */
    public static cqq m111970e() {
        if (f83109d == null) {
            synchronized (cqq.class) {
                try {
                    if (f83109d == null) {
                        f83109d = new cqq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f83109d;
    }

    /* JADX INFO: renamed from: a */
    public void m111971a(@NonNull WebViewX webViewX, @NonNull Class<? extends lf2> cls, @NonNull lf2 lf2Var) {
        HashMap<Class<? extends lf2>, lf2> map = this.f83112c.get(webViewX);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, lf2Var);
        this.f83112c.put(webViewX, map);
    }

    /* JADX INFO: renamed from: b */
    public void m111972b(@NonNull WebViewX webViewX) {
        if (this.f83112c.containsKey(webViewX)) {
            HashMap<Class<? extends lf2>, lf2> map = this.f83112c.get(webViewX);
            if (NullChecker.m82486a(map) && map.size() > 0) {
                Iterator<lf2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo47711a();
                }
                map.clear();
            }
            this.f83112c.remove(webViewX);
        }
    }

    /* JADX INFO: renamed from: c */
    public List<Class> m111973c() {
        return this.f83111b;
    }

    /* JADX INFO: renamed from: d */
    public lf2 m111974d(@NonNull WebViewX webViewX, @NonNull Class<? extends lf2> cls) {
        HashMap<Class<? extends lf2>, lf2> map = this.f83112c.get(webViewX);
        if (NullChecker.m82486a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public ve20 m111975f(String str) {
        return this.f83110a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public ve20 m111976g(String str, Object[] objArr) {
        String str2 = str + "@@___@@" + objArr.length;
        ve20 ve20VarM111975f = m111975f(str2);
        if (ve20VarM111975f == null) {
            for (Class<? extends lf2> cls : m111973c()) {
                Method[] methods = cls.getMethods();
                int length = methods.length;
                char c = 0;
                int i = 0;
                while (i < length) {
                    Method method = methods[i];
                    if (method.isAnnotationPresent(lkq.class)) {
                        lkq lkqVar = (lkq) method.getAnnotation(lkq.class);
                        if (lkqVar.key().equals(str) && !lkqVar.isMkBridge()) {
                            if (method.getParameterTypes().length < 1 || method.getParameterTypes()[c] != aqq.class) {
                                CrashHelper.m82483g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 JsBridgeContext"));
                            }
                            if (objArr.length == method.getParameterTypes().length - 1) {
                                ve20 ve20Var = new ve20();
                                ve20Var.f183696a = method;
                                ve20Var.f183697b = cls;
                                boolean zUiThread = lkqVar.uiThread();
                                ve20Var.f183698c = zUiThread;
                                if (zUiThread && ve20Var.f183696a.getReturnType() != Void.TYPE) {
                                    CrashHelper.m82483g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空"));
                                }
                                m111978i(str2, ve20Var);
                                return ve20Var;
                            }
                        }
                    }
                    i++;
                    c = 0;
                }
            }
        }
        return ve20VarM111975f;
    }

    /* JADX INFO: renamed from: h */
    public void m111977h(Class cls) {
        if (!this.f83111b.contains(cls)) {
            this.f83111b.add(cls);
        }
        zc00.m219220g().m219228j(cls);
    }

    /* JADX INFO: renamed from: i */
    public void m111978i(String str, ve20 ve20Var) {
        this.f83110a.put(str, ve20Var);
    }
}
