package p153l;

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
public class uqi0 implements mqi0 {

    /* JADX INFO: renamed from: a */
    private String f180475a;

    /* JADX INFO: renamed from: b */
    private Vector<mqi0> f180476b = new Vector<>(10);

    /* JADX INFO: renamed from: l.uqi0$a */
    public static class C20633a extends nqi0 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f180477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20633a(String str, String str2) {
            super(str);
            this.f180477b = str2;
        }

        @Override // p153l.nqi0
        /* JADX INFO: renamed from: i */
        public void mo164316i() {
            nqi0.m164313e(this.f180477b);
        }
    }

    public uqi0(Class<?> cls) {
        m197349e(cls);
    }

    /* JADX INFO: renamed from: d */
    private void m197348d(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (m197353j(method)) {
            list.add(name);
            m197356c(m197350f(cls, name));
        } else if (m197354k(method)) {
            m197356c(m197355p("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m197349e(Class<?> cls) {
        this.f180475a = cls.getName();
        try {
            m197352i(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                m197356c(m197355p("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; mqi0.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
                for (Method method : MethodSorter.getDeclaredMethods(superclass)) {
                    m197348d(method, arrayList, cls);
                }
            }
            if (this.f180476b.size() == 0) {
                m197356c(m197355p("No tests found in ".concat(cls.getName())));
            }
        } catch (NoSuchMethodException unused) {
            m197356c(m197355p("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static mqi0 m197350f(Class<?> cls, String str) {
        Object objNewInstance;
        try {
            Constructor<?> constructorM197352i = m197352i(cls);
            try {
                if (constructorM197352i.getParameterTypes().length == 0) {
                    objNewInstance = constructorM197352i.newInstance(null);
                    if (objNewInstance instanceof nqi0) {
                        ((nqi0) objNewInstance).m164317j(str);
                    }
                } else {
                    objNewInstance = constructorM197352i.newInstance(str);
                }
                return (mqi0) objNewInstance;
            } catch (IllegalAccessException e) {
                return m197355p("Cannot access test case: " + str + " (" + m197351g(e) + ")");
            } catch (InstantiationException e2) {
                return m197355p("Cannot instantiate test case: " + str + " (" + m197351g(e2) + ")");
            } catch (InvocationTargetException e3) {
                return m197355p("Exception in constructor: " + str + " (" + m197351g(e3.getTargetException()) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return m197355p("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m197351g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i */
    public static Constructor<?> m197352i(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(null);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m197353j(Method method) {
        return m197354k(method) && Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: renamed from: k */
    private boolean m197354k(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    /* JADX INFO: renamed from: p */
    public static mqi0 m197355p(String str) {
        return new C20633a("warning", str);
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: a */
    public void mo110696a(tqi0 tqi0Var) {
        for (mqi0 mqi0Var : this.f180476b) {
            if (tqi0Var.m192314h()) {
                return;
            } else {
                m197358l(mqi0Var, tqi0Var);
            }
        }
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: b */
    public int mo110697b() {
        Iterator<mqi0> it = this.f180476b.iterator();
        int iMo110697b = 0;
        while (it.hasNext()) {
            iMo110697b += it.next().mo110697b();
        }
        return iMo110697b;
    }

    /* JADX INFO: renamed from: c */
    public void m197356c(mqi0 mqi0Var) {
        this.f180476b.add(mqi0Var);
    }

    /* JADX INFO: renamed from: h */
    public String m197357h() {
        return this.f180475a;
    }

    /* JADX INFO: renamed from: l */
    public void m197358l(mqi0 mqi0Var, tqi0 tqi0Var) {
        mqi0Var.mo110696a(tqi0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m197359m(String str) {
        this.f180475a = str;
    }

    /* JADX INFO: renamed from: n */
    public mqi0 m197360n(int i) {
        return this.f180476b.get(i);
    }

    /* JADX INFO: renamed from: o */
    public int m197361o() {
        return this.f180476b.size();
    }

    public String toString() {
        return m197357h() != null ? m197357h() : super.toString();
    }

    public uqi0() {
    }

    public uqi0(String str) {
        m197359m(str);
    }
}
