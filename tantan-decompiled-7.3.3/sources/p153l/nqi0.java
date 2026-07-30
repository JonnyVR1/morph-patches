package p153l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nqi0 extends t11 implements mqi0 {

    /* JADX INFO: renamed from: a */
    private String f143233a;

    public nqi0() {
        this.f143233a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m164312c(String str, Object obj) {
        t11.m188829c(str, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m164313e(String str) {
        t11.m188831e(str);
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: a */
    public void mo110696a(tqi0 tqi0Var) {
        tqi0Var.m192312f(this);
    }

    @Override // p153l.mqi0
    /* JADX INFO: renamed from: b */
    public int mo110697b() {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public String m164314g() {
        return this.f143233a;
    }

    /* JADX INFO: renamed from: h */
    public void m164315h() throws Throwable {
        Throwable th;
        m164318k();
        try {
            mo164316i();
            try {
                m164319l();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                m164319l();
            } catch (Throwable unused) {
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo164316i() throws Throwable {
        Method method;
        m164312c("TestCase.fName cannot be null", this.f143233a);
        try {
            method = getClass().getMethod(this.f143233a, null);
        } catch (NoSuchMethodException unused) {
            m164313e("Method \"" + this.f143233a + "\" not found");
            method = null;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            m164313e("Method \"" + this.f143233a + "\" should be public");
        }
        try {
            method.invoke(this, null);
        } catch (IllegalAccessException e) {
            e.fillInStackTrace();
            throw e;
        } catch (InvocationTargetException e2) {
            e2.fillInStackTrace();
            throw e2.getTargetException();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m164317j(String str) {
        this.f143233a = str;
    }

    public String toString() {
        return m164314g() + "(" + getClass().getName() + ")";
    }

    public nqi0(String str) {
        this.f143233a = str;
    }

    /* JADX INFO: renamed from: k */
    public void m164318k() throws Exception {
    }

    /* JADX INFO: renamed from: l */
    public void m164319l() throws Exception {
    }
}
