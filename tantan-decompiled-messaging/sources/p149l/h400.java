package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ActionBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.HttpBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ImageBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.JumpBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.LocationBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ShareBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.StorageBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.TrackBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UserBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class h400 {

    /* JADX INFO: renamed from: d */
    public static h400 f105789d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, n620> f105790a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f105791b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<MKWebView, HashMap<Class<? extends ef2>, ef2>> f105792c = new WeakHashMap<>();

    public h400() {
        m129216j(UserBridgeImplementation.class);
        m129216j(DeviceBridgeImplementation.class);
        m129216j(ShareBridgeImplementation.class);
        m129216j(ThirdPartFuncBridgeImplementation.class);
        m129216j(TrackBridgeImplementation.class);
        m129216j(WebViewBridgeImplementation.class);
        m129216j(LocationBridgeImplementation.class);
        m129216j(UIBridgeImplementation.class);
        m129216j(StorageBridgeImplementation.class);
        m129216j(ActionBridgeImplementation.class);
        m129216j(ImageBridgeImplementation.class);
        m129216j(JumpBridgeImplementation.class);
        m129216j(FeedBackBridgeImplementation.class);
        m129216j(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m129207a(Method method) {
        throw new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空");
    }

    /* JADX INFO: renamed from: g */
    public static h400 m129208g() {
        if (f105789d == null) {
            synchronized (h400.class) {
                try {
                    if (f105789d == null) {
                        f105789d = new h400();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f105789d;
    }

    /* JADX INFO: renamed from: b */
    public void m129209b(@NonNull MKWebView mKWebView, @NonNull Class<? extends ef2> cls, @NonNull ef2 ef2Var) {
        HashMap<Class<? extends ef2>, ef2> map = this.f105792c.get(mKWebView);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, ef2Var);
        this.f105792c.put(mKWebView, map);
    }

    /* JADX INFO: renamed from: c */
    public void m129210c(@NonNull MKWebView mKWebView) {
        if (this.f105792c.containsKey(mKWebView)) {
            HashMap<Class<? extends ef2>, ef2> map = this.f105792c.get(mKWebView);
            if (NullChecker.m81303a(map) && map.size() > 0) {
                Iterator<ef2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo46528a();
                }
                map.clear();
            }
            this.f105792c.remove(mKWebView);
        }
    }

    /* JADX INFO: renamed from: d */
    public final n620 m129211d(final Method method, Class cls, boolean z, boolean z2) {
        n620 n620Var = new n620();
        n620Var.f137263a = method;
        n620Var.f137264b = cls;
        n620Var.f137265c = z;
        n620Var.f137266d = z2;
        if (z && method.getReturnType() != Void.TYPE) {
            e51.m114748M(new Runnable() { // from class: l.g400
                @Override // java.lang.Runnable
                public final void run() {
                    h400.m129207a(method);
                }
            });
        }
        return n620Var;
    }

    /* JADX INFO: renamed from: e */
    public List<Class> m129212e() {
        return this.f105791b;
    }

    /* JADX INFO: renamed from: f */
    public ef2 m129213f(@NonNull MKWebView mKWebView, @NonNull Class<? extends ef2> cls) {
        HashMap<Class<? extends ef2>, ef2> map = this.f105792c.get(mKWebView);
        if (NullChecker.m81303a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public n620 m129214h(String str) {
        return this.f105790a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public n620 m129215i(String str) {
        n620 n620VarM129214h = m129214h(str);
        if (n620VarM129214h == null) {
            String str2 = str.split("@")[0];
            String str3 = str.split("@")[1];
            for (Class cls : m129212e()) {
                for (Method method : cls.getMethods()) {
                    if (method.isAnnotationPresent(liq.class)) {
                        liq liqVar = (liq) method.getAnnotation(liq.class);
                        String strNameSpace = liqVar.nameSpace();
                        String strKey = liqVar.key();
                        if (strNameSpace.equals(str2) && strKey.equals(str3) && liqVar.isMkBridge()) {
                            if (method.getParameterTypes().length < 1 || method.getParameterTypes()[0] != f400.class) {
                                CrashHelper.m81300g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 MkJsBridgeContext"));
                            }
                            if (method.getParameterTypes().length > 1 && method.getParameterTypes()[1] != JSONObject.class) {
                                CrashHelper.m81300g(new RuntimeException("使用 @JSCallNativeMethod 注解且是mk的调用 " + method.getName() + "第二个参数必须为 JSONObject"));
                            }
                            n620 n620VarM129211d = m129211d(method, cls, liqVar.uiThread(), true);
                            m129217k(str, n620VarM129211d);
                            return n620VarM129211d;
                        }
                    }
                }
            }
        }
        return n620VarM129214h;
    }

    /* JADX INFO: renamed from: j */
    public void m129216j(Class cls) {
        if (this.f105791b.contains(cls)) {
            return;
        }
        this.f105791b.add(cls);
    }

    /* JADX INFO: renamed from: k */
    public void m129217k(String str, n620 n620Var) {
        this.f105790a.put(str, n620Var);
    }
}
