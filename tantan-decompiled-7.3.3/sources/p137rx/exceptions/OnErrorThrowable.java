package p137rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import p153l.j6f;
import p153l.mrd0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        /* JADX INFO: renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        public static final class C22426a {
            static final Set<Class<?>> INSTANCE = m222571a();

            /* JADX INFO: renamed from: a */
            public static Set<Class<?>> m222571a() {
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
            if (C22426a.INSTANCE.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strM131784b = mrd0.m159674c().m159677b().m131784b(obj);
            return strM131784b != null ? strM131784b : obj.getClass().getName().concat(".class");
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
        Throwable thM143660b = j6f.m143660b(th);
        if ((thM143660b instanceof OnNextValue) && ((OnNextValue) thM143660b).getValue() == obj) {
            return th;
        }
        j6f.m143659a(th, new OnNextValue(obj));
        return th;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thM143660b = j6f.m143660b(th);
        return thM143660b instanceof OnNextValue ? new OnErrorThrowable(th, ((OnNextValue) thM143660b).getValue()) : new OnErrorThrowable(th);
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
