package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p153l.adj;
import p153l.b7h0;
import p153l.k950;
import p153l.m350;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Suppliers {

    public static class ExpiringMemoizingSupplier<T> implements b7h0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final b7h0<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient T value;

        public ExpiringMemoizingSupplier(b7h0<T> b7h0Var, long j, TimeUnit timeUnit) {
            this.delegate = (b7h0) xn80.m212111p(b7h0Var);
            this.durationNanos = timeUnit.toNanos(j);
            xn80.m212105j(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // p153l.b7h0
        public T get() {
            long j = this.expirationNanos;
            long jM15500h = C2678b.m15500h();
            if (j == 0 || jM15500h - j >= 0) {
                synchronized (this) {
                    try {
                        if (j == this.expirationNanos) {
                            T t = this.delegate.get();
                            this.value = t;
                            long j2 = jM15500h + this.durationNanos;
                            if (j2 == 0) {
                                j2 = 1;
                            }
                            this.expirationNanos = j2;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) m350.m156920a(this.value);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            long j = this.durationNanos;
            StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(strValueOf);
            sb.append(", ");
            sb.append(j);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    public static class MemoizingSupplier<T> implements b7h0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final b7h0<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        public MemoizingSupplier(b7h0<T> b7h0Var) {
            this.delegate = (b7h0) xn80.m212111p(b7h0Var);
        }

        @Override // p153l.b7h0
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    try {
                        if (!this.initialized) {
                            T t = this.delegate.get();
                            this.value = t;
                            this.initialized = true;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) m350.m156920a(this.value);
        }

        public String toString() {
            Object string;
            if (this.initialized) {
                String strValueOf = String.valueOf(this.value);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.delegate;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class SupplierComposition<F, T> implements b7h0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final adj<? super F, T> function;
        final b7h0<F> supplier;

        public SupplierComposition(adj<? super F, T> adjVar, b7h0<F> b7h0Var) {
            this.function = (adj) xn80.m212111p(adjVar);
            this.supplier = (b7h0) xn80.m212111p(b7h0Var);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.b7h0
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return k950.m148864b(this.function, this.supplier);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.function);
            String strValueOf2 = String.valueOf(this.supplier);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
            sb.append("Suppliers.compose(");
            sb.append(strValueOf);
            sb.append(", ");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class SupplierOfInstance<T> implements b7h0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        public SupplierOfInstance(T t) {
            this.instance = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return k950.m148863a(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // p153l.b7h0
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return k950.m148864b(this.instance);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.instance);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ThreadSafeSupplier<T> implements b7h0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final b7h0<T> delegate;

        public ThreadSafeSupplier(b7h0<T> b7h0Var) {
            this.delegate = (b7h0) xn80.m212111p(b7h0Var);
        }

        @Override // p153l.b7h0
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Suppliers$a */
    public static class C2676a<T> implements b7h0<T> {

        /* JADX INFO: renamed from: a */
        public volatile b7h0<T> f10660a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f10661b;

        /* JADX INFO: renamed from: c */
        public T f10662c;

        public C2676a(b7h0<T> b7h0Var) {
            this.f10660a = (b7h0) xn80.m212111p(b7h0Var);
        }

        @Override // p153l.b7h0
        public T get() {
            if (!this.f10661b) {
                synchronized (this) {
                    try {
                        if (!this.f10661b) {
                            b7h0<T> b7h0Var = this.f10660a;
                            Objects.requireNonNull(b7h0Var);
                            T t = b7h0Var.get();
                            this.f10662c = t;
                            this.f10661b = true;
                            this.f10660a = null;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) m350.m156920a(this.f10662c);
        }

        public String toString() {
            Object string = this.f10660a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f10662c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> b7h0<T> m15478a(b7h0<T> b7h0Var) {
        if ((b7h0Var instanceof C2676a) || (b7h0Var instanceof MemoizingSupplier)) {
            return b7h0Var;
        }
        return b7h0Var instanceof Serializable ? new MemoizingSupplier(b7h0Var) : new C2676a(b7h0Var);
    }

    /* JADX INFO: renamed from: b */
    public static <T> b7h0<T> m15479b(T t) {
        return new SupplierOfInstance(t);
    }

    public enum SupplierFunctionImpl implements adj {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // p153l.adj
        public Object apply(b7h0<Object> b7h0Var) {
            return b7h0Var.get();
        }
    }
}
