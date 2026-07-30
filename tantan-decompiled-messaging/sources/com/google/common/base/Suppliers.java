package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p149l.gaj;
import p149l.sf80;
import p149l.tyg0;
import p149l.v050;
import p149l.xu40;

/* JADX INFO: loaded from: classes7.dex */
public final class Suppliers {

    public static class ExpiringMemoizingSupplier<T> implements tyg0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final tyg0<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient T value;

        public ExpiringMemoizingSupplier(tyg0<T> tyg0Var, long j, TimeUnit timeUnit) {
            this.delegate = (tyg0) sf80.m183894p(tyg0Var);
            this.durationNanos = timeUnit.toNanos(j);
            sf80.m183888j(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // p149l.tyg0
        public T get() {
            long j = this.expirationNanos;
            long jM15446h = C2655b.m15446h();
            if (j == 0 || jM15446h - j >= 0) {
                synchronized (this) {
                    try {
                        if (j == this.expirationNanos) {
                            T t = this.delegate.get();
                            this.value = t;
                            long j2 = jM15446h + this.durationNanos;
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
            return (T) xu40.m211079a(this.value);
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

    public static class MemoizingSupplier<T> implements tyg0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final tyg0<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        public MemoizingSupplier(tyg0<T> tyg0Var) {
            this.delegate = (tyg0) sf80.m183894p(tyg0Var);
        }

        @Override // p149l.tyg0
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
            return (T) xu40.m211079a(this.value);
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

    public static class SupplierComposition<F, T> implements tyg0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final gaj<? super F, T> function;
        final tyg0<F> supplier;

        public SupplierComposition(gaj<? super F, T> gajVar, tyg0<F> tyg0Var) {
            this.function = (gaj) sf80.m183894p(gajVar);
            this.supplier = (tyg0) sf80.m183894p(tyg0Var);
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

        @Override // p149l.tyg0
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return v050.m196471b(this.function, this.supplier);
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

    public static class SupplierOfInstance<T> implements tyg0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        public SupplierOfInstance(T t) {
            this.instance = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return v050.m196470a(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // p149l.tyg0
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return v050.m196471b(this.instance);
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

    public static class ThreadSafeSupplier<T> implements tyg0<T>, Serializable {
        private static final long serialVersionUID = 0;
        final tyg0<T> delegate;

        public ThreadSafeSupplier(tyg0<T> tyg0Var) {
            this.delegate = (tyg0) sf80.m183894p(tyg0Var);
        }

        @Override // p149l.tyg0
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
    public static class C2653a<T> implements tyg0<T> {

        /* JADX INFO: renamed from: a */
        public volatile tyg0<T> f10623a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f10624b;

        /* JADX INFO: renamed from: c */
        public T f10625c;

        public C2653a(tyg0<T> tyg0Var) {
            this.f10623a = (tyg0) sf80.m183894p(tyg0Var);
        }

        @Override // p149l.tyg0
        public T get() {
            if (!this.f10624b) {
                synchronized (this) {
                    try {
                        if (!this.f10624b) {
                            tyg0<T> tyg0Var = this.f10623a;
                            Objects.requireNonNull(tyg0Var);
                            T t = tyg0Var.get();
                            this.f10625c = t;
                            this.f10624b = true;
                            this.f10623a = null;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (T) xu40.m211079a(this.f10625c);
        }

        public String toString() {
            Object string = this.f10623a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f10625c);
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
    public static <T> tyg0<T> m15424a(tyg0<T> tyg0Var) {
        if ((tyg0Var instanceof C2653a) || (tyg0Var instanceof MemoizingSupplier)) {
            return tyg0Var;
        }
        return tyg0Var instanceof Serializable ? new MemoizingSupplier(tyg0Var) : new C2653a(tyg0Var);
    }

    /* JADX INFO: renamed from: b */
    public static <T> tyg0<T> m15425b(T t) {
        return new SupplierOfInstance(t);
    }

    public enum SupplierFunctionImpl implements gaj {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // p149l.gaj
        public Object apply(tyg0<Object> tyg0Var) {
            return tyg0Var.get();
        }
    }
}
