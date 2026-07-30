package p149l;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes2.dex */
public class uhi0 implements mhi0 {

    /* JADX INFO: renamed from: a */
    private String f176554a;

    /* JADX INFO: renamed from: b */
    private Vector<mhi0> f176555b = new Vector<>(10);

    /* JADX INFO: renamed from: l.uhi0$a */
    public static class C20429a extends nhi0 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f176556b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20429a(String str, String str2) {
            super(str);
            this.f176556b = str2;
        }

        @Override // p149l.nhi0
        /* JADX INFO: renamed from: i */
        public void mo159412i() {
            nhi0.m159409e(this.f176556b);
        }
    }

    public uhi0(Class<?> cls) {
        m193726e(cls);
    }

    /* JADX INFO: renamed from: d */
    private void m193725d(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (m193730j(method)) {
            list.add(name);
            m193733c(m193727f(cls, name));
        } else if (m193731k(method)) {
            m193733c(m193732p("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m193726e(Class<?> cls) {
        this.f176554a = cls.getName();
        try {
            m193729i(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                m193733c(m193732p("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; mhi0.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
                for (Method method : MethodSorter.getDeclaredMethods(superclass)) {
                    m193725d(method, arrayList, cls);
                }
            }
            if (this.f176555b.size() == 0) {
                m193733c(m193732p("No tests found in ".concat(cls.getName())));
            }
        } catch (NoSuchMethodException unused) {
            m193733c(m193732p("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static mhi0 m193727f(Class<?> cls, String str) {
        Object objNewInstance;
        try {
            Constructor<?> constructorM193729i = m193729i(cls);
            try {
                if (constructorM193729i.getParameterTypes().length == 0) {
                    objNewInstance = constructorM193729i.newInstance(null);
                    if (objNewInstance instanceof nhi0) {
                        ((nhi0) objNewInstance).m159413j(str);
                    }
                } else {
                    objNewInstance = constructorM193729i.newInstance(str);
                }
                return (mhi0) objNewInstance;
            } catch (IllegalAccessException e) {
                return m193732p("Cannot access test case: " + str + " (" + m193728g(e) + ")");
            } catch (InstantiationException e2) {
                return m193732p("Cannot instantiate test case: " + str + " (" + m193728g(e2) + ")");
            } catch (InvocationTargetException e3) {
                return m193732p("Exception in constructor: " + str + " (" + m193728g(e3.getTargetException()) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return m193732p("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m193728g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i */
    public static Constructor<?> m193729i(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(null);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m193730j(Method method) {
        return m193731k(method) && Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: renamed from: k */
    private boolean m193731k(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    /* JADX INFO: renamed from: p */
    public static mhi0 m193732p(String str) {
        return new C20429a("warning", str);
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: a */
    public void mo112097a(thi0 thi0Var) {
        for (mhi0 mhi0Var : this.f176555b) {
            if (thi0Var.m188919h()) {
                return;
            } else {
                m193735l(mhi0Var, thi0Var);
            }
        }
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: b */
    public int mo112098b() {
        Iterator<mhi0> it = this.f176555b.iterator();
        int iMo112098b = 0;
        while (it.hasNext()) {
            iMo112098b += it.next().mo112098b();
        }
        return iMo112098b;
    }

    /* JADX INFO: renamed from: c */
    public void m193733c(mhi0 mhi0Var) {
        this.f176555b.add(mhi0Var);
    }

    /* JADX INFO: renamed from: h */
    public String m193734h() {
        return this.f176554a;
    }

    /* JADX INFO: renamed from: l */
    public void m193735l(mhi0 mhi0Var, thi0 thi0Var) {
        mhi0Var.mo112097a(thi0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m193736m(String str) {
        this.f176554a = str;
    }

    /* JADX INFO: renamed from: n */
    public mhi0 m193737n(int i) {
        return this.f176555b.get(i);
    }

    /* JADX INFO: renamed from: o */
    public int m193738o() {
        return this.f176555b.size();
    }

    public String toString() {
        return m193734h() != null ? m193734h() : super.toString();
    }

    public uhi0() {
    }

    public uhi0(String str) {
        m193736m(str);
    }
}
