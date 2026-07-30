package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p153l.l01;
import p153l.t9l0;
import p153l.vtq0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a */
    public final l01<String, Method> f3190a;

    /* JADX INFO: renamed from: b */
    public final l01<String, Method> f3191b;

    /* JADX INFO: renamed from: c */
    public final l01<String, Class> f3192c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(l01<String, Method> l01Var, l01<String, Method> l01Var2, l01<String, Class> l01Var3) {
        this.f3190a = l01Var;
        this.f3191b = l01Var2;
        this.f3192c = l01Var3;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo4104A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m4105B(byte[] bArr, int i) {
        mo4140w(i);
        mo4104A(bArr);
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo4106C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m4107D(CharSequence charSequence, int i) {
        mo4140w(i);
        mo4106C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo4108E(int i);

    /* JADX INFO: renamed from: F */
    public void m4109F(int i, int i2) {
        mo4140w(i2);
        mo4108E(i);
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo4110G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m4111H(Parcelable parcelable, int i) {
        mo4140w(i);
        mo4110G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo4112I(String str);

    /* JADX INFO: renamed from: J */
    public void m4113J(String str, int i) {
        mo4140w(i);
        mo4112I(str);
    }

    /* JADX INFO: renamed from: K */
    public <T extends t9l0> void m4114K(T t, VersionedParcel versionedParcel) {
        try {
            m4122e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            vtq0.m202761a("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            vtq0.m202761a("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            vtq0.m202761a("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            vtq0.m202761a("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m4115L(t9l0 t9l0Var) {
        if (t9l0Var == null) {
            mo4112I(null);
            return;
        }
        m4117N(t9l0Var);
        VersionedParcel versionedParcelMo4119b = mo4119b();
        m4114K(t9l0Var, versionedParcelMo4119b);
        versionedParcelMo4119b.mo4118a();
    }

    /* JADX INFO: renamed from: M */
    public void m4116M(t9l0 t9l0Var, int i) {
        mo4140w(i);
        m4115L(t9l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m4117N(t9l0 t9l0Var) {
        try {
            mo4112I(m4120c(t9l0Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            vtq0.m202761a(t9l0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4118a();

    /* JADX INFO: renamed from: b */
    public abstract VersionedParcel mo4119b();

    /* JADX INFO: renamed from: c */
    public final Class m4120c(Class<? extends t9l0> cls) throws ClassNotFoundException {
        Class cls2 = this.f3192c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f3192c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    public final Method m4121d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3190a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f3190a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public final Method m4122e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3191b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM4120c = m4120c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM4120c.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f3191b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4123f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo4124g();

    /* JADX INFO: renamed from: h */
    public boolean m4125h(boolean z, int i) {
        return !mo4130m(i) ? z : mo4124g();
    }

    /* JADX INFO: renamed from: i */
    public abstract byte[] mo4126i();

    /* JADX INFO: renamed from: j */
    public byte[] m4127j(byte[] bArr, int i) {
        return !mo4130m(i) ? bArr : mo4126i();
    }

    /* JADX INFO: renamed from: k */
    public abstract CharSequence mo4128k();

    /* JADX INFO: renamed from: l */
    public CharSequence m4129l(CharSequence charSequence, int i) {
        return !mo4130m(i) ? charSequence : mo4128k();
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo4130m(int i);

    /* JADX INFO: renamed from: n */
    public <T extends t9l0> T m4131n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m4121d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            vtq0.m202761a("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            vtq0.m202761a("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vtq0.m202761a("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            vtq0.m202761a("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo4132o();

    /* JADX INFO: renamed from: p */
    public int m4133p(int i, int i2) {
        return !mo4130m(i2) ? i : mo4132o();
    }

    /* JADX INFO: renamed from: q */
    public abstract <T extends Parcelable> T mo4134q();

    /* JADX INFO: renamed from: r */
    public <T extends Parcelable> T m4135r(T t, int i) {
        return !mo4130m(i) ? t : (T) mo4134q();
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo4136s();

    /* JADX INFO: renamed from: t */
    public String m4137t(String str, int i) {
        return !mo4130m(i) ? str : mo4136s();
    }

    /* JADX INFO: renamed from: u */
    public <T extends t9l0> T m4138u() {
        String strMo4136s = mo4136s();
        if (strMo4136s == null) {
            return null;
        }
        return (T) m4131n(strMo4136s, mo4119b());
    }

    /* JADX INFO: renamed from: v */
    public <T extends t9l0> T m4139v(T t, int i) {
        return !mo4130m(i) ? t : (T) m4138u();
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo4140w(int i);

    /* JADX INFO: renamed from: x */
    public void m4141x(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo4142y(boolean z);

    /* JADX INFO: renamed from: z */
    public void m4143z(boolean z, int i) {
        mo4140w(i);
        mo4142y(z);
    }
}
