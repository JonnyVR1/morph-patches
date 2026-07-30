package p014rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import p003l.f5f;
import p003l.jjd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        /* JADX INFO: renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        public static final class C1104a {
            static final Set<Class<?>> INSTANCE = m9782a();

            /* JADX INFO: renamed from: a */
            public static Set<Class<?>> m9782a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            this.value = obj;
        }

        public static String renderValue(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (C1104a.INSTANCE.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strM3589b = jjd0.m5345c().m5348b().m3589b(obj);
            return strM3589b != null ? strM3589b : obj.getClass().getName().concat(".class");
        }

        public Object getValue() {
            return this.value;
        }
    }

    private OnErrorThrowable(Throwable th) {
        super(th);
        this.hasValue = false;
        this.value = null;
    }

    public static Throwable addValueAsLastCause(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thM3961b = f5f.m3961b(th);
        if ((thM3961b instanceof OnNextValue) && ((OnNextValue) thM3961b).getValue() == obj) {
            return th;
        }
        f5f.m3960a(th, new OnNextValue(obj));
        return th;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thM3961b = f5f.m3961b(th);
        return thM3961b instanceof OnNextValue ? new OnErrorThrowable(th, ((OnNextValue) thM3961b).getValue()) : new OnErrorThrowable(th);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    private OnErrorThrowable(Throwable th, Object obj) {
        super(th);
        this.hasValue = true;
        this.value = obj;
    }
}
