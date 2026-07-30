package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p149l.e01;
import p149l.o0l0;
import p149l.pkq0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a */
    public final e01<String, Method> f3190a;

    /* JADX INFO: renamed from: b */
    public final e01<String, Method> f3191b;

    /* JADX INFO: renamed from: c */
    public final e01<String, Class> f3192c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(e01<String, Method> e01Var, e01<String, Method> e01Var2, e01<String, Class> e01Var3) {
        this.f3190a = e01Var;
        this.f3191b = e01Var2;
        this.f3192c = e01Var3;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo4102A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m4103B(byte[] bArr, int i) {
        mo4138w(i);
        mo4102A(bArr);
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo4104C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m4105D(CharSequence charSequence, int i) {
        mo4138w(i);
        mo4104C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo4106E(int i);

    /* JADX INFO: renamed from: F */
    public void m4107F(int i, int i2) {
        mo4138w(i2);
        mo4106E(i);
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo4108G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m4109H(Parcelable parcelable, int i) {
        mo4138w(i);
        mo4108G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo4110I(String str);

    /* JADX INFO: renamed from: J */
    public void m4111J(String str, int i) {
        mo4138w(i);
        mo4110I(str);
    }

    /* JADX INFO: renamed from: K */
    public <T extends o0l0> void m4112K(T t, VersionedParcel versionedParcel) {
        try {
            m4120e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            pkq0.m170054a("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            pkq0.m170054a("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            pkq0.m170054a("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            pkq0.m170054a("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m4113L(o0l0 o0l0Var) {
        if (o0l0Var == null) {
            mo4110I(null);
            return;
        }
        m4115N(o0l0Var);
        VersionedParcel versionedParcelMo4117b = mo4117b();
        m4112K(o0l0Var, versionedParcelMo4117b);
        versionedParcelMo4117b.mo4116a();
    }

    /* JADX INFO: renamed from: M */
    public void m4114M(o0l0 o0l0Var, int i) {
        mo4138w(i);
        m4113L(o0l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m4115N(o0l0 o0l0Var) {
        try {
            mo4110I(m4118c(o0l0Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            pkq0.m170054a(o0l0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4116a();

    /* JADX INFO: renamed from: b */
    public abstract VersionedParcel mo4117b();

    /* JADX INFO: renamed from: c */
    public final Class m4118c(Class<? extends o0l0> cls) throws ClassNotFoundException {
        Class cls2 = this.f3192c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f3192c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    public final Method m4119d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
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
    public final Method m4120e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3191b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM4118c = m4118c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM4118c.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f3191b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4121f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo4122g();

    /* JADX INFO: renamed from: h */
    public boolean m4123h(boolean z, int i) {
        return !mo4128m(i) ? z : mo4122g();
    }

    /* JADX INFO: renamed from: i */
    public abstract byte[] mo4124i();

    /* JADX INFO: renamed from: j */
    public byte[] m4125j(byte[] bArr, int i) {
        return !mo4128m(i) ? bArr : mo4124i();
    }

    /* JADX INFO: renamed from: k */
    public abstract CharSequence mo4126k();

    /* JADX INFO: renamed from: l */
    public CharSequence m4127l(CharSequence charSequence, int i) {
        return !mo4128m(i) ? charSequence : mo4126k();
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo4128m(int i);

    /* JADX INFO: renamed from: n */
    public <T extends o0l0> T m4129n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m4119d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            pkq0.m170054a("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            pkq0.m170054a("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            pkq0.m170054a("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            pkq0.m170054a("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo4130o();

    /* JADX INFO: renamed from: p */
    public int m4131p(int i, int i2) {
        return !mo4128m(i2) ? i : mo4130o();
    }

    /* JADX INFO: renamed from: q */
    public abstract <T extends Parcelable> T mo4132q();

    /* JADX INFO: renamed from: r */
    public <T extends Parcelable> T m4133r(T t, int i) {
        return !mo4128m(i) ? t : (T) mo4132q();
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo4134s();

    /* JADX INFO: renamed from: t */
    public String m4135t(String str, int i) {
        return !mo4128m(i) ? str : mo4134s();
    }

    /* JADX INFO: renamed from: u */
    public <T extends o0l0> T m4136u() {
        String strMo4134s = mo4134s();
        if (strMo4134s == null) {
            return null;
        }
        return (T) m4129n(strMo4134s, mo4117b());
    }

    /* JADX INFO: renamed from: v */
    public <T extends o0l0> T m4137v(T t, int i) {
        return !mo4128m(i) ? t : (T) m4136u();
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo4138w(int i);

    /* JADX INFO: renamed from: x */
    public void m4139x(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo4140y(boolean z);

    /* JADX INFO: renamed from: z */
    public void m4141z(boolean z, int i) {
        mo4138w(i);
        mo4140y(z);
    }
}
