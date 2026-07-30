package p009l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ActionBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.FeedBackBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.HttpBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ImageBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.JumpBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.LocationBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ShareBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.StorageBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ThirdPartFuncBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.TrackBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UIBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.UserBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l.e51;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h400 {

    /* JADX INFO: renamed from: d */
    public static h400 f13858d;

    /* JADX INFO: renamed from: a */
    public HashMap<String, n620> f13859a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public List<Class> f13860b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public WeakHashMap<MKWebView, HashMap<Class<? extends ef2>, ef2>> f13861c = new WeakHashMap<>();

    public h400() {
        m15402j(UserBridgeImplementation.class);
        m15402j(DeviceBridgeImplementation.class);
        m15402j(ShareBridgeImplementation.class);
        m15402j(ThirdPartFuncBridgeImplementation.class);
        m15402j(TrackBridgeImplementation.class);
        m15402j(WebViewBridgeImplementation.class);
        m15402j(LocationBridgeImplementation.class);
        m15402j(UIBridgeImplementation.class);
        m15402j(StorageBridgeImplementation.class);
        m15402j(ActionBridgeImplementation.class);
        m15402j(ImageBridgeImplementation.class);
        m15402j(JumpBridgeImplementation.class);
        m15402j(FeedBackBridgeImplementation.class);
        m15402j(HttpBridgeImplementation.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15393a(Method method) {
        throw new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 中设置 uiThread 为 true 时方法返回值必须为空");
    }

    /* JADX INFO: renamed from: g */
    public static h400 m15394g() {
        if (f13858d == null) {
            synchronized (h400.class) {
                try {
                    if (f13858d == null) {
                        f13858d = new h400();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13858d;
    }

    /* JADX INFO: renamed from: b */
    public void m15395b(@NonNull MKWebView mKWebView, @NonNull Class<? extends ef2> cls, @NonNull ef2 ef2Var) {
        HashMap<Class<? extends ef2>, ef2> map = this.f13861c.get(mKWebView);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(cls, ef2Var);
        this.f13861c.put(mKWebView, map);
    }

    /* JADX INFO: renamed from: c */
    public void m15396c(@NonNull MKWebView mKWebView) {
        if (this.f13861c.containsKey(mKWebView)) {
            HashMap<Class<? extends ef2>, ef2> map = this.f13861c.get(mKWebView);
            if (NullChecker.a(map) && map.size() > 0) {
                Iterator<ef2> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().mo10039a();
                }
                map.clear();
            }
            this.f13861c.remove(mKWebView);
        }
    }

    /* JADX INFO: renamed from: d */
    public final n620 m15397d(final Method method, Class cls, boolean z, boolean z2) {
        n620 n620Var = new n620();
        n620Var.f17228a = method;
        n620Var.f17229b = cls;
        n620Var.f17230c = z;
        n620Var.f17231d = z2;
        if (z && method.getReturnType() != Void.TYPE) {
            e51.M(new Runnable() { // from class: l.g400
                @Override // java.lang.Runnable
                public final void run() {
                    h400.m15393a(method);
                }
            });
        }
        return n620Var;
    }

    /* JADX INFO: renamed from: e */
    public List<Class> m15398e() {
        return this.f13860b;
    }

    /* JADX INFO: renamed from: f */
    public ef2 m15399f(@NonNull MKWebView mKWebView, @NonNull Class<? extends ef2> cls) {
        HashMap<Class<? extends ef2>, ef2> map = this.f13861c.get(mKWebView);
        if (NullChecker.a(map)) {
            return map.get(cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public n620 m15400h(String str) {
        return this.f13859a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public n620 m15401i(String str) {
        n620 n620VarM15400h = m15400h(str);
        if (n620VarM15400h == null) {
            String str2 = str.split("@")[0];
            String str3 = str.split("@")[1];
            for (Class cls : m15398e()) {
                for (Method method : cls.getMethods()) {
                    if (method.isAnnotationPresent(liq.class)) {
                        liq liqVar = (liq) method.getAnnotation(liq.class);
                        String strNameSpace = liqVar.nameSpace();
                        String strKey = liqVar.key();
                        if (strNameSpace.equals(str2) && strKey.equals(str3) && liqVar.isMkBridge()) {
                            if (method.getParameterTypes().length < 1 || method.getParameterTypes()[0] != f400.class) {
                                CrashHelper.g(new RuntimeException("使用 @JSCallNativeMethod 注解的方法 " + method.getName() + " 第一个参数必须为 MkJsBridgeContext"));
                            }
                            if (method.getParameterTypes().length > 1 && method.getParameterTypes()[1] != JSONObject.class) {
                                CrashHelper.g(new RuntimeException("使用 @JSCallNativeMethod 注解且是mk的调用 " + method.getName() + "第二个参数必须为 JSONObject"));
                            }
                            n620 n620VarM15397d = m15397d(method, cls, liqVar.uiThread(), true);
                            m15403k(str, n620VarM15397d);
                            return n620VarM15397d;
                        }
                    }
                }
            }
        }
        return n620VarM15400h;
    }

    /* JADX INFO: renamed from: j */
    public void m15402j(Class cls) {
        if (this.f13860b.contains(cls)) {
            return;
        }
        this.f13860b.add(cls);
    }

    /* JADX INFO: renamed from: k */
    public void m15403k(String str, n620 n620Var) {
        this.f13859a.put(str, n620Var);
    }
}
