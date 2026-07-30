package p149l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes11.dex */
public final class rrv {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC19765b f160787a;

    /* JADX INFO: renamed from: l.rrv$a */
    public static class C19764a implements InterfaceC19765b {
        /* JADX INFO: renamed from: b */
        public final Object m180610b(Context context) {
            try {
                Object obj = Reflect.m221136on(context).get("mPackageInfo");
                if (obj != null) {
                    return Reflect.m221136on(obj).get("mReceiverResource");
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public Object m180611c(Context context, String str) {
            return m180612d(m180610b(context), str);
        }

        /* JADX INFO: renamed from: d */
        public final Object m180612d(Object obj, String str) {
            if (obj == null) {
                return null;
            }
            try {
                return Reflect.m221136on(obj).get(str);
            } catch (Throwable unused) {
                return null;
            }
        }

        public C19764a() {
        }
    }

    /* JADX INFO: renamed from: l.rrv$b */
    public interface InterfaceC19765b {
        /* JADX INFO: renamed from: a */
        void mo180613a(Context context, InterfaceC19766c interfaceC19766c) throws Throwable;
    }

    /* JADX INFO: renamed from: l.rrv$c */
    public interface InterfaceC19766c {
    }

    /* JADX INFO: renamed from: l.rrv$d */
    public static class C19767d extends C19764a {
        public C19767d() {
            super();
        }

        @Override // p149l.rrv.InterfaceC19765b
        /* JADX INFO: renamed from: a */
        public void mo180613a(Context context, InterfaceC19766c interfaceC19766c) throws Throwable {
            Object objM180611c = m180611c(context, "mWhiteList");
            if (objM180611c instanceof List) {
                ((List) objM180611c).add(context.getPackageName());
            }
        }
    }

    /* JADX INFO: renamed from: l.rrv$e */
    public static class C19768e extends C19764a {
        public C19768e() {
            super();
        }

        @Override // p149l.rrv.InterfaceC19765b
        /* JADX INFO: renamed from: a */
        public void mo180613a(Context context, InterfaceC19766c interfaceC19766c) throws Throwable {
            Object objM180611c = m180611c(context, "mWhiteListMap");
            if (objM180611c instanceof Map) {
                Map map = (Map) objM180611c;
                List arrayList = (List) map.get(0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(0, arrayList);
                }
                arrayList.add(context.getPackageName());
            }
        }
    }

    /* JADX INFO: renamed from: l.rrv$f */
    public static class C19769f extends C19768e {

        /* JADX INFO: renamed from: l.rrv$f$a */
        public static class a implements InvocationHandler {

            /* JADX INFO: renamed from: a */
            public Object f160788a;

            /* JADX INFO: renamed from: b */
            public volatile int f160789b;

            public a(Object obj, InterfaceC19766c interfaceC19766c) {
                this.f160788a = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                if (TextUtils.equals("registerReceiver", name)) {
                    if (this.f160789b >= 1000) {
                        return null;
                    }
                    this.f160789b++;
                } else if (TextUtils.equals("unregisterReceiver", name)) {
                    this.f160789b--;
                    this.f160789b = this.f160789b < 0 ? 0 : this.f160789b;
                }
                return method.invoke(this.f160788a, objArr);
            }
        }

        public C19769f() {
            super();
        }

        @Override // p149l.rrv.C19768e, p149l.rrv.InterfaceC19765b
        /* JADX INFO: renamed from: a */
        public void mo180613a(Context context, InterfaceC19766c interfaceC19766c) throws Throwable {
            super.mo180613a(context, interfaceC19766c);
            m180614e(context.getClassLoader(), interfaceC19766c);
        }

        /* JADX INFO: renamed from: e */
        public final void m180614e(ClassLoader classLoader, InterfaceC19766c interfaceC19766c) {
            Object obj;
            try {
                Object obj2 = Reflect.m221137on(ActivityManager.class.getName()).get("IActivityManagerSingleton");
                if (obj2 == null || (obj = Reflect.m221136on(obj2).get("mInstance")) == null) {
                    return;
                }
                Reflect.m221136on(obj2).set("mInstance", Proxy.newProxyInstance(classLoader, new Class[]{Class.forName("android.app.IActivityManager")}, new a(obj, interfaceC19766c)));
            } catch (Throwable unused) {
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f160787a = new C19769f();
        } else if (i >= 26) {
            f160787a = new C19768e();
        } else {
            f160787a = new C19767d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m180608a(Application application) {
        m180609b(application, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m180609b(Application application, InterfaceC19766c interfaceC19766c) {
        if (application != null) {
            try {
                f160787a.mo180613a(application.getBaseContext(), interfaceC19766c);
            } catch (Throwable unused) {
            }
        }
    }
}
