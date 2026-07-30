package p149l;

import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class uaj {

    /* JADX INFO: renamed from: a */
    public static final Ordering<Constructor<?>> f175605a = Ordering.natural().onResultOf(new C20396a()).reverse();

    /* JADX INFO: renamed from: l.uaj$a */
    public class C20396a implements gaj<Constructor<?>, Boolean> {
        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m192754a(Class<? extends Exception> cls) {
        sf80.m183889k(m192756c(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        sf80.m183889k(m192755b(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192755b(Class<? extends Exception> cls) {
        try {
            m192758e(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192756c(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: d */
    public static <X> X m192757d(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <X extends Exception> X m192758e(Class<X> cls, Throwable th) {
        Iterator it = m192759f(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) m192757d((Constructor) it.next(), th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(strValueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: f */
    public static <X extends Exception> List<Constructor<X>> m192759f(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f175605a.sortedCopy(list);
    }
}
