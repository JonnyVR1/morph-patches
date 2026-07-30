package p009l;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class rrv {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1180b f19956a;

    /* JADX INFO: renamed from: l.rrv$a */
    public static class C1179a implements InterfaceC1180b {
        /* JADX INFO: renamed from: b */
        public final Object m21786b(Context context) {
            try {
                Object obj = Reflect.on(context).get("mPackageInfo");
                if (obj != null) {
                    return Reflect.on(obj).get("mReceiverResource");
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public Object m21787c(Context context, String str) {
            return m21788d(m21786b(context), str);
        }

        /* JADX INFO: renamed from: d */
        public final Object m21788d(Object obj, String str) {
            if (obj == null) {
                return null;
            }
            try {
                return Reflect.on(obj).get(str);
            } catch (Throwable unused) {
                return null;
            }
        }

        public C1179a() {
        }
    }

    /* JADX INFO: renamed from: l.rrv$b */
    public interface InterfaceC1180b {
        /* JADX INFO: renamed from: a */
        void mo21789a(Context context, InterfaceC1181c interfaceC1181c) throws Throwable;
    }

    /* JADX INFO: renamed from: l.rrv$c */
    public interface InterfaceC1181c {
    }

    /* JADX INFO: renamed from: l.rrv$d */
    public static class C1182d extends C1179a {
        public C1182d() {
            super();
        }

        @Override // p009l.rrv.InterfaceC1180b
        /* JADX INFO: renamed from: a */
        public void mo21789a(Context context, InterfaceC1181c interfaceC1181c) throws Throwable {
            Object objM21787c = m21787c(context, "mWhiteList");
            if (objM21787c instanceof List) {
                ((List) objM21787c).add(context.getPackageName());
            }
        }
    }

    /* JADX INFO: renamed from: l.rrv$e */
    public static class C1183e extends C1179a {
        public C1183e() {
            super();
        }

        @Override // p009l.rrv.InterfaceC1180b
        /* JADX INFO: renamed from: a */
        public void mo21789a(Context context, InterfaceC1181c interfaceC1181c) throws Throwable {
            Object objM21787c = m21787c(context, "mWhiteListMap");
            if (objM21787c instanceof Map) {
                Map map = (Map) objM21787c;
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
    public static class C1184f extends C1183e {

        /* JADX INFO: renamed from: l.rrv$f$a */
        public static class a implements InvocationHandler {

            /* JADX INFO: renamed from: a */
            public Object f19957a;

            /* JADX INFO: renamed from: b */
            public volatile int f19958b;

            public a(Object obj, InterfaceC1181c interfaceC1181c) {
                this.f19957a = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                if (TextUtils.equals("registerReceiver", name)) {
                    if (this.f19958b >= 1000) {
                        return null;
                    }
                    this.f19958b++;
                } else if (TextUtils.equals("unregisterReceiver", name)) {
                    this.f19958b--;
                    this.f19958b = this.f19958b < 0 ? 0 : this.f19958b;
                }
                return method.invoke(this.f19957a, objArr);
            }
        }

        public C1184f() {
            super();
        }

        @Override // p009l.rrv.C1183e, p009l.rrv.InterfaceC1180b
        /* JADX INFO: renamed from: a */
        public void mo21789a(Context context, InterfaceC1181c interfaceC1181c) throws Throwable {
            super.mo21789a(context, interfaceC1181c);
            m21790e(context.getClassLoader(), interfaceC1181c);
        }

        /* JADX INFO: renamed from: e */
        public final void m21790e(ClassLoader classLoader, InterfaceC1181c interfaceC1181c) {
            Object obj;
            try {
                Object obj2 = Reflect.on(ActivityManager.class.getName()).get("IActivityManagerSingleton");
                if (obj2 == null || (obj = Reflect.on(obj2).get("mInstance")) == null) {
                    return;
                }
                Reflect.on(obj2).set("mInstance", Proxy.newProxyInstance(classLoader, new Class[]{Class.forName("android.app.IActivityManager")}, new a(obj, interfaceC1181c)));
            } catch (Throwable unused) {
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f19956a = new C1184f();
        } else if (i >= 26) {
            f19956a = new C1183e();
        } else {
            f19956a = new C1182d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21784a(Application application) {
        m21785b(application, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m21785b(Application application, InterfaceC1181c interfaceC1181c) {
        if (application != null) {
            try {
                f19956a.mo21789a(application.getBaseContext(), interfaceC1181c);
            } catch (Throwable unused) {
            }
        }
    }
}
