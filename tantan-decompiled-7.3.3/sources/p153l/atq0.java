package p153l;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
class atq0 implements zsq0, InvocationHandler {

    /* JADX INFO: renamed from: o */
    private static final String[][] f73375o = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* JADX INFO: renamed from: j */
    private Context f73385j;

    /* JADX INFO: renamed from: a */
    private Class f73376a = null;

    /* JADX INFO: renamed from: b */
    private Class f73377b = null;

    /* JADX INFO: renamed from: c */
    private Method f73378c = null;

    /* JADX INFO: renamed from: d */
    private Method f73379d = null;

    /* JADX INFO: renamed from: e */
    private Method f73380e = null;

    /* JADX INFO: renamed from: f */
    private Method f73381f = null;

    /* JADX INFO: renamed from: g */
    private Method f73382g = null;

    /* JADX INFO: renamed from: h */
    private Method f73383h = null;

    /* JADX INFO: renamed from: i */
    private Method f73384i = null;

    /* JADX INFO: renamed from: k */
    private final Object f73386k = new Object();

    /* JADX INFO: renamed from: l */
    private volatile int f73387l = 0;

    /* JADX INFO: renamed from: m */
    private volatile long f73388m = 0;

    /* JADX INFO: renamed from: n */
    private volatile C15838b f73389n = null;

    /* JADX INFO: renamed from: l.atq0$b */
    public class C15838b {

        /* JADX INFO: renamed from: a */
        Boolean f73390a;

        /* JADX INFO: renamed from: b */
        String f73391b;

        /* JADX INFO: renamed from: c */
        String f73392c;

        /* JADX INFO: renamed from: d */
        String f73393d;

        /* JADX INFO: renamed from: e */
        String f73394e;

        private C15838b() {
            this.f73390a = null;
            this.f73391b = null;
            this.f73392c = null;
            this.f73393d = null;
            this.f73394e = null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m100238a() {
            if (!TextUtils.isEmpty(this.f73391b) || !TextUtils.isEmpty(this.f73392c) || !TextUtils.isEmpty(this.f73393d) || !TextUtils.isEmpty(this.f73394e)) {
                this.f73390a = Boolean.TRUE;
            }
            return this.f73390a != null;
        }
    }

    public atq0(Context context) {
        this.f73385j = context.getApplicationContext();
        m100231e(context);
        m100234h(context);
    }

    /* JADX INFO: renamed from: b */
    private static <T> T m100228b(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t = (T) method.invoke(obj, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m100229c(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m100230d() {
        synchronized (this.f73386k) {
            try {
                this.f73386k.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m100231e(Context context) {
        Class<?> clsM100227a = m100227a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f73375o;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> clsM100227a2 = m100227a(context, strArr2[0]);
            Class<?> clsM100227a3 = m100227a(context, strArr2[1]);
            if (clsM100227a2 != null && clsM100227a3 != null) {
                m100235i("found class in index " + i);
                cls2 = clsM100227a3;
                cls = clsM100227a2;
                break;
            }
            i++;
            cls2 = clsM100227a3;
            cls = clsM100227a2;
        }
        this.f73376a = clsM100227a;
        this.f73378c = m100229c(clsM100227a, "InitSdk", Context.class, cls);
        this.f73377b = cls;
        this.f73380e = m100229c(cls2, "getOAID", new Class[0]);
        this.f73383h = m100229c(cls2, "isSupported", new Class[0]);
        this.f73384i = m100229c(cls2, "shutDown", new Class[0]);
    }

    /* JADX INFO: renamed from: f */
    private void m100232f(String str) {
        if (this.f73389n != null) {
            return;
        }
        long j = this.f73388m;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.f73387l;
        if (jElapsedRealtime > 3000 && i < 3) {
            synchronized (this.f73386k) {
                try {
                    if (this.f73388m == j && this.f73387l == i) {
                        m100235i("retry, current count is " + i);
                        this.f73387l = this.f73387l + 1;
                        m100234h(this.f73385j);
                        j = this.f73388m;
                        jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f73389n != null || j < 0 || jElapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f73386k) {
            if (this.f73389n == null) {
                try {
                    m100235i(str + " wait...");
                    this.f73386k.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m100233g(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    /* JADX INFO: renamed from: h */
    private void m100234h(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = -jElapsedRealtime;
        Class cls = this.f73377b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                m100228b(this.f73378c, this.f73376a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f73377b}, this));
            } catch (Throwable th) {
                m100235i("call init sdk error:" + th);
                jElapsedRealtime = j;
            }
        } else {
            jElapsedRealtime = j;
        }
        this.f73388m = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: i */
    private static void m100235i(String str) {
        ouq0.m169393m("mdid:" + str);
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        m100232f("isSupported");
        return this.f73389n != null && Boolean.TRUE.equals(this.f73389n.f73390a);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f73388m = SystemClock.elapsedRealtime();
        if (objArr != null) {
            C15838b c15838b = new C15838b();
            for (Object obj2 : objArr) {
                if (obj2 != null && !m100233g(obj2)) {
                    c15838b.f73392c = (String) m100228b(this.f73380e, obj2, new Object[0]);
                    c15838b.f73390a = (Boolean) m100228b(this.f73383h, obj2, new Object[0]);
                    m100228b(this.f73384i, obj2, new Object[0]);
                    if (c15838b.m100238a()) {
                        StringBuilder sb = new StringBuilder("has get succ, check duplicate:");
                        sb.append(this.f73389n != null);
                        m100235i(sb.toString());
                        synchronized (atq0.class) {
                            try {
                                if (this.f73389n == null) {
                                    this.f73389n = c15838b;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                }
            }
        }
        m100230d();
        return null;
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        m100232f("getOAID");
        if (this.f73389n == null) {
            return null;
        }
        return this.f73389n.f73392c;
    }

    /* JADX INFO: renamed from: a */
    private static Class<?> m100227a(Context context, String str) {
        try {
            return t5r0.m189419c(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
