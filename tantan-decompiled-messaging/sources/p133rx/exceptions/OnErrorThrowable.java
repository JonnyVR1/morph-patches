package p133rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import p149l.f5f;
import p149l.jjd0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        /* JADX INFO: renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        public static final class C22311a {
            static final Set<Class<?>> INSTANCE = m221325a();

            /* JADX INFO: renamed from: a */
            public static Set<Class<?>> m221325a() {
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
            if (C22311a.INSTANCE.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strM112024b = jjd0.m141790c().m141793b().m112024b(obj);
            return strM112024b != null ? strM112024b : obj.getClass().getName().concat(".class");
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
        Throwable thM119488b = f5f.m119488b(th);
        if ((thM119488b instanceof OnNextValue) && ((OnNextValue) thM119488b).getValue() == obj) {
            return th;
        }
        f5f.m119487a(th, new OnNextValue(obj));
        return th;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thM119488b = f5f.m119488b(th);
        return thM119488b instanceof OnNextValue ? new OnErrorThrowable(th, ((OnNextValue) thM119488b).getValue()) : new OnErrorThrowable(th);
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
