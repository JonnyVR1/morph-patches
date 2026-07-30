package p149l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nhi0 extends m11 implements mhi0 {

    /* JADX INFO: renamed from: a */
    private String f138994a;

    public nhi0() {
        this.f138994a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m159408c(String str, Object obj) {
        m11.m152556c(str, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m159409e(String str) {
        m11.m152558e(str);
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: a */
    public void mo112097a(thi0 thi0Var) {
        thi0Var.m188917f(this);
    }

    @Override // p149l.mhi0
    /* JADX INFO: renamed from: b */
    public int mo112098b() {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public String m159410g() {
        return this.f138994a;
    }

    /* JADX INFO: renamed from: h */
    public void m159411h() throws Throwable {
        Throwable th;
        m159414k();
        try {
            mo159412i();
            try {
                m159415l();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                m159415l();
            } catch (Throwable unused) {
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo159412i() throws Throwable {
        Method method;
        m159408c("TestCase.fName cannot be null", this.f138994a);
        try {
            method = getClass().getMethod(this.f138994a, null);
        } catch (NoSuchMethodException unused) {
            m159409e("Method \"" + this.f138994a + "\" not found");
            method = null;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            m159409e("Method \"" + this.f138994a + "\" should be public");
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
    public void m159413j(String str) {
        this.f138994a = str;
    }

    public String toString() {
        return m159410g() + "(" + getClass().getName() + ")";
    }

    public nhi0(String str) {
        this.f138994a = str;
    }

    /* JADX INFO: renamed from: k */
    public void m159414k() throws Exception {
    }

    /* JADX INFO: renamed from: l */
    public void m159415l() throws Exception {
    }
}
