package p149l;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
class ujq0 implements tjq0, InvocationHandler {

    /* JADX INFO: renamed from: o */
    private static final String[][] f176789o = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* JADX INFO: renamed from: j */
    private Context f176799j;

    /* JADX INFO: renamed from: a */
    private Class f176790a = null;

    /* JADX INFO: renamed from: b */
    private Class f176791b = null;

    /* JADX INFO: renamed from: c */
    private Method f176792c = null;

    /* JADX INFO: renamed from: d */
    private Method f176793d = null;

    /* JADX INFO: renamed from: e */
    private Method f176794e = null;

    /* JADX INFO: renamed from: f */
    private Method f176795f = null;

    /* JADX INFO: renamed from: g */
    private Method f176796g = null;

    /* JADX INFO: renamed from: h */
    private Method f176797h = null;

    /* JADX INFO: renamed from: i */
    private Method f176798i = null;

    /* JADX INFO: renamed from: k */
    private final Object f176800k = new Object();

    /* JADX INFO: renamed from: l */
    private volatile int f176801l = 0;

    /* JADX INFO: renamed from: m */
    private volatile long f176802m = 0;

    /* JADX INFO: renamed from: n */
    private volatile C20446b f176803n = null;

    /* JADX INFO: renamed from: l.ujq0$b */
    public class C20446b {

        /* JADX INFO: renamed from: a */
        Boolean f176804a;

        /* JADX INFO: renamed from: b */
        String f176805b;

        /* JADX INFO: renamed from: c */
        String f176806c;

        /* JADX INFO: renamed from: d */
        String f176807d;

        /* JADX INFO: renamed from: e */
        String f176808e;

        private C20446b() {
            this.f176804a = null;
            this.f176805b = null;
            this.f176806c = null;
            this.f176807d = null;
            this.f176808e = null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m194027a() {
            if (!TextUtils.isEmpty(this.f176805b) || !TextUtils.isEmpty(this.f176806c) || !TextUtils.isEmpty(this.f176807d) || !TextUtils.isEmpty(this.f176808e)) {
                this.f176804a = Boolean.TRUE;
            }
            return this.f176804a != null;
        }
    }

    public ujq0(Context context) {
        this.f176799j = context.getApplicationContext();
        m194022e(context);
        m194025h(context);
    }

    /* JADX INFO: renamed from: b */
    private static <T> T m194019b(Method method, Object obj, Object... objArr) {
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
    private static Method m194020c(Class<?> cls, String str, Class<?>... clsArr) {
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
    private void m194021d() {
        synchronized (this.f176800k) {
            try {
                this.f176800k.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m194022e(Context context) {
        Class<?> clsM194018a = m194018a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f176789o;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> clsM194018a2 = m194018a(context, strArr2[0]);
            Class<?> clsM194018a3 = m194018a(context, strArr2[1]);
            if (clsM194018a2 != null && clsM194018a3 != null) {
                m194026i("found class in index " + i);
                cls2 = clsM194018a3;
                cls = clsM194018a2;
                break;
            }
            i++;
            cls2 = clsM194018a3;
            cls = clsM194018a2;
        }
        this.f176790a = clsM194018a;
        this.f176792c = m194020c(clsM194018a, "InitSdk", Context.class, cls);
        this.f176791b = cls;
        this.f176794e = m194020c(cls2, "getOAID", new Class[0]);
        this.f176797h = m194020c(cls2, "isSupported", new Class[0]);
        this.f176798i = m194020c(cls2, "shutDown", new Class[0]);
    }

    /* JADX INFO: renamed from: f */
    private void m194023f(String str) {
        if (this.f176803n != null) {
            return;
        }
        long j = this.f176802m;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.f176801l;
        if (jElapsedRealtime > 3000 && i < 3) {
            synchronized (this.f176800k) {
                try {
                    if (this.f176802m == j && this.f176801l == i) {
                        m194026i("retry, current count is " + i);
                        this.f176801l = this.f176801l + 1;
                        m194025h(this.f176799j);
                        j = this.f176802m;
                        jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f176803n != null || j < 0 || jElapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f176800k) {
            if (this.f176803n == null) {
                try {
                    m194026i(str + " wait...");
                    this.f176800k.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m194024g(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    /* JADX INFO: renamed from: h */
    private void m194025h(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = -jElapsedRealtime;
        Class cls = this.f176791b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                m194019b(this.f176792c, this.f176790a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f176791b}, this));
            } catch (Throwable th) {
                m194026i("call init sdk error:" + th);
                jElapsedRealtime = j;
            }
        } else {
            jElapsedRealtime = j;
        }
        this.f176802m = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: i */
    private static void m194026i(String str) {
        ilq0.m137040m("mdid:" + str);
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        m194023f("isSupported");
        return this.f176803n != null && Boolean.TRUE.equals(this.f176803n.f176804a);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f176802m = SystemClock.elapsedRealtime();
        if (objArr != null) {
            C20446b c20446b = new C20446b();
            for (Object obj2 : objArr) {
                if (obj2 != null && !m194024g(obj2)) {
                    c20446b.f176806c = (String) m194019b(this.f176794e, obj2, new Object[0]);
                    c20446b.f176804a = (Boolean) m194019b(this.f176797h, obj2, new Object[0]);
                    m194019b(this.f176798i, obj2, new Object[0]);
                    if (c20446b.m194027a()) {
                        StringBuilder sb = new StringBuilder("has get succ, check duplicate:");
                        sb.append(this.f176803n != null);
                        m194026i(sb.toString());
                        synchronized (ujq0.class) {
                            try {
                                if (this.f176803n == null) {
                                    this.f176803n = c20446b;
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
        m194021d();
        return null;
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        m194023f("getOAID");
        if (this.f176803n == null) {
            return null;
        }
        return this.f176803n.f176806c;
    }

    /* JADX INFO: renamed from: a */
    private static Class<?> m194018a(Context context, String str) {
        try {
            return nwq0.m161880c(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
