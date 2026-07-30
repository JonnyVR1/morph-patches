package p153l;

import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ActionBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.HttpBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ImageBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.JumpBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.LocationBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ShareBridgeImplementation;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class zc00 {

    /* JADX INFO: renamed from: d */
    public static zc00 f203718d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, ve20> f203719a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f203720b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<MKWebView, HashMap<Class<? extends lf2>, lf2>> f203721c = new WeakHashMap<>();

    public zc00() {
        m219228j(UserBridgeImplementation.class);
        m219228j(DeviceBridgeImplementation.class);
        m219228j(ShareBridgeImplementation.class);
        m219228j(ThirdPartFuncBridgeImplementation.class);
        m219228j(TrackBridgeImplementation.class);
        m219228j(WebViewBridgeImplementation.class);
        m219228j(LocationBridgeImplementation.class);
        m219228j(UIBridgeImplementation.class);
        m219228j(StorageBridgeImplementation.class);
        m219228j(ActionBridgeImplementation.class);
        m219228j(ImageBridgeImplementation.class);
        m219228j(JumpBridgeImplementation.class);
        m219228j(FeedBackBridgeImplementation.class);
        m219228j(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m219219a(Method method) {
        throw new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空");
    }

    /* JADX INFO: renamed from: g */
    public static zc00 m219220g() {
        if (f203718d == null) {
            synchronized (zc00.class) {
                try {
                    if (f203718d == null) {
                        f203718d = new zc00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203718d;
    }

    /* JADX INFO: renamed from: b */
    public void m219221b(@NonNull MKWebView mKWebView, @NonNull Class<? extends lf2> cls, @NonNull lf2 lf2Var) {
        HashMap<Class<? extends lf2>, lf2> map = this.f203721c.get(mKWebView);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, lf2Var);
        this.f203721c.put(mKWebView, map);
    }

    /* JADX INFO: renamed from: c */
    public void m219222c(@NonNull MKWebView mKWebView) {
        if (this.f203721c.containsKey(mKWebView)) {
            HashMap<Class<? extends lf2>, lf2> map = this.f203721c.get(mKWebView);
            if (NullChecker.m82486a(map) && map.size() > 0) {
                Iterator<lf2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo47711a();
                }
                map.clear();
            }
            this.f203721c.remove(mKWebView);
        }
    }

    /* JADX INFO: renamed from: d */
    public final ve20 m219223d(final Method method, Class cls, boolean z, boolean z2) {
        ve20 ve20Var = new ve20();
        ve20Var.f183696a = method;
        ve20Var.f183697b = cls;
        ve20Var.f183698c = z;
        ve20Var.f183699d = z2;
        if (z && method.getReturnType() != Void.TYPE) {
            l51.m152893M(new Runnable() { // from class: l.yc00
                @Override // java.lang.Runnable
                public final void run() {
                    zc00.m219219a(method);
                }
            });
        }
        return ve20Var;
    }

    /* JADX INFO: renamed from: e */
    public List<Class> m219224e() {
        return this.f203720b;
    }

    /* JADX INFO: renamed from: f */
    public lf2 m219225f(@NonNull MKWebView mKWebView, @NonNull Class<? extends lf2> cls) {
        HashMap<Class<? extends lf2>, lf2> map = this.f203721c.get(mKWebView);
        if (NullChecker.m82486a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public ve20 m219226h(String str) {
        return this.f203719a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public ve20 m219227i(String str) {
        ve20 ve20VarM219226h = m219226h(str);
        if (ve20VarM219226h == null) {
            String str2 = str.split("@")[0];
            String str3 = str.split("@")[1];
            for (Class cls : m219224e()) {
                for (Method method : cls.getMethods()) {
                    if (method.isAnnotationPresent(lkq.class)) {
                        lkq lkqVar = (lkq) method.getAnnotation(lkq.class);
                        String strNameSpace = lkqVar.nameSpace();
                        String strKey = lkqVar.key();
                        if (strNameSpace.equals(str2) && strKey.equals(str3) && lkqVar.isMkBridge()) {
                            if (method.getParameterTypes().length < 1 || method.getParameterTypes()[0] != xc00.class) {
                                CrashHelper.m82483g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 MkJsBridgeContext"));
                            }
                            if (method.getParameterTypes().length > 1 && method.getParameterTypes()[1] != JSONObject.class) {
                                CrashHelper.m82483g(new RuntimeException("使用 @JSCallNativeMethod 注解且是mk的调用 " + method.getName() + "第二个参数必须为 JSONObject"));
                            }
                            ve20 ve20VarM219223d = m219223d(method, cls, lkqVar.uiThread(), true);
                            m219229k(str, ve20VarM219223d);
                            return ve20VarM219223d;
                        }
                    }
                }
            }
        }
        return ve20VarM219226h;
    }

    /* JADX INFO: renamed from: j */
    public void m219228j(Class cls) {
        if (this.f203720b.contains(cls)) {
            return;
        }
        this.f203720b.add(cls);
    }

    /* JADX INFO: renamed from: k */
    public void m219229k(String str, ve20 ve20Var) {
        this.f203719a.put(str, ve20Var);
    }
}
