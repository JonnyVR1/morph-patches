package p153l;

import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class odj {

    /* JADX INFO: renamed from: a */
    public static final Ordering<Constructor<?>> f146912a = Ordering.natural().onResultOf(new C19110a()).reverse();

    /* JADX INFO: renamed from: l.odj$a */
    public class C19110a implements adj<Constructor<?>, Boolean> {
        @Override // p153l.adj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167311a(Class<? extends Exception> cls) {
        xn80.m212106k(m167313c(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        xn80.m212106k(m167312b(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m167312b(Class<? extends Exception> cls) {
        try {
            m167315e(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m167313c(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: d */
    public static <X> X m167314d(Constructor<X> constructor, Throwable th) {
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
    public static <X extends Exception> X m167315e(Class<X> cls, Throwable th) {
        Iterator it = m167316f(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) m167314d((Constructor) it.next(), th);
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
    public static <X extends Exception> List<Constructor<X>> m167316f(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f146912a.sortedCopy(list);
    }
}
