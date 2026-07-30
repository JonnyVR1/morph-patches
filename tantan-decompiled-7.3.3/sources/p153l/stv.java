package p153l;

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

/* JADX INFO: loaded from: classes10.dex */
public final class stv {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC20149b f170612a;

    /* JADX INFO: renamed from: l.stv$a */
    public static class C20148a implements InterfaceC20149b {
        /* JADX INFO: renamed from: b */
        public final Object m187935b(Context context) {
            try {
                Object obj = Reflect.m222382on(context).get("mPackageInfo");
                if (obj != null) {
                    return Reflect.m222382on(obj).get("mReceiverResource");
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public Object m187936c(Context context, String str) {
            return m187937d(m187935b(context), str);
        }

        /* JADX INFO: renamed from: d */
        public final Object m187937d(Object obj, String str) {
            if (obj == null) {
                return null;
            }
            try {
                return Reflect.m222382on(obj).get(str);
            } catch (Throwable unused) {
                return null;
            }
        }

        public C20148a() {
        }
    }

    /* JADX INFO: renamed from: l.stv$b */
    public interface InterfaceC20149b {
        /* JADX INFO: renamed from: a */
        void mo187938a(Context context, InterfaceC20150c interfaceC20150c) throws Throwable;
    }

    /* JADX INFO: renamed from: l.stv$c */
    public interface InterfaceC20150c {
    }

    /* JADX INFO: renamed from: l.stv$d */
    public static class C20151d extends C20148a {
        public C20151d() {
            super();
        }

        @Override // p153l.stv.InterfaceC20149b
        /* JADX INFO: renamed from: a */
        public void mo187938a(Context context, InterfaceC20150c interfaceC20150c) throws Throwable {
            Object objM187936c = m187936c(context, "mWhiteList");
            if (objM187936c instanceof List) {
                ((List) objM187936c).add(context.getPackageName());
            }
        }
    }

    /* JADX INFO: renamed from: l.stv$e */
    public static class C20152e extends C20148a {
        public C20152e() {
            super();
        }

        @Override // p153l.stv.InterfaceC20149b
        /* JADX INFO: renamed from: a */
        public void mo187938a(Context context, InterfaceC20150c interfaceC20150c) throws Throwable {
            Object objM187936c = m187936c(context, "mWhiteListMap");
            if (objM187936c instanceof Map) {
                Map map = (Map) objM187936c;
                List arrayList = (List) map.get(0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(0, arrayList);
                }
                arrayList.add(context.getPackageName());
            }
        }
    }

    /* JADX INFO: renamed from: l.stv$f */
    public static class C20153f extends C20152e {

        /* JADX INFO: renamed from: l.stv$f$a */
        public static class a implements InvocationHandler {

            /* JADX INFO: renamed from: a */
            public Object f170613a;

            /* JADX INFO: renamed from: b */
            public volatile int f170614b;

            public a(Object obj, InterfaceC20150c interfaceC20150c) {
                this.f170613a = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                if (TextUtils.equals("registerReceiver", name)) {
                    if (this.f170614b >= 1000) {
                        return null;
                    }
                    this.f170614b++;
                } else if (TextUtils.equals("unregisterReceiver", name)) {
                    this.f170614b--;
                    this.f170614b = this.f170614b < 0 ? 0 : this.f170614b;
                }
                return method.invoke(this.f170613a, objArr);
            }
        }

        public C20153f() {
            super();
        }

        @Override // p153l.stv.C20152e, p153l.stv.InterfaceC20149b
        /* JADX INFO: renamed from: a */
        public void mo187938a(Context context, InterfaceC20150c interfaceC20150c) throws Throwable {
            super.mo187938a(context, interfaceC20150c);
            m187939e(context.getClassLoader(), interfaceC20150c);
        }

        /* JADX INFO: renamed from: e */
        public final void m187939e(ClassLoader classLoader, InterfaceC20150c interfaceC20150c) {
            Object obj;
            try {
                Object obj2 = Reflect.m222383on(ActivityManager.class.getName()).get("IActivityManagerSingleton");
                if (obj2 == null || (obj = Reflect.m222382on(obj2).get("mInstance")) == null) {
                    return;
                }
                Reflect.m222382on(obj2).set("mInstance", Proxy.newProxyInstance(classLoader, new Class[]{Class.forName("android.app.IActivityManager")}, new a(obj, interfaceC20150c)));
            } catch (Throwable unused) {
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f170612a = new C20153f();
        } else if (i >= 26) {
            f170612a = new C20152e();
        } else {
            f170612a = new C20151d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m187933a(Application application) {
        m187934b(application, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m187934b(Application application, InterfaceC20150c interfaceC20150c) {
        if (application != null) {
            try {
                f170612a.mo187938a(application.getBaseContext(), interfaceC20150c);
            } catch (Throwable unused) {
            }
        }
    }
}
