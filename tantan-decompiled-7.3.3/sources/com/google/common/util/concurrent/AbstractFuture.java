package com.google.common.util.concurrent;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.H5PaymentOrderStatus;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.C20511u7;
import p153l.hpr;
import p153l.iig0;
import p153l.iuw0;
import p153l.k760;
import p153l.l350;
import p153l.nzm;
import p153l.ozm;
import p153l.r8g0;
import p153l.uyi0;
import p153l.vtq0;
import p153l.xn80;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractFuture<V> extends nzm implements hpr<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f11355d;

    /* JADX INFO: renamed from: e */
    public static final Logger f11356e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC3071b f11357f;

    /* JADX INFO: renamed from: g */
    public static final Object f11358g;

    /* JADX INFO: renamed from: a */
    public volatile Object f11359a;

    /* JADX INFO: renamed from: b */
    public volatile C3073d f11360b;

    /* JADX INFO: renamed from: c */
    public volatile C3080k f11361c;

    public static final class Failure {

        /* JADX INFO: renamed from: b */
        public static final Failure f11362b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a */
        public final Throwable f11363a;

        public Failure(Throwable th) {
            this.f11363a = (Throwable) xn80.m212111p(th);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$b */
    public static abstract class AbstractC3071b {
        public AbstractC3071b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo16666a(AbstractFuture<?> abstractFuture, C3073d c3073d, C3073d c3073d2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo16667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo16668c(AbstractFuture<?> abstractFuture, C3080k c3080k, C3080k c3080k2);

        /* JADX INFO: renamed from: d */
        public abstract C3073d mo16669d(AbstractFuture<?> abstractFuture, C3073d c3073d);

        /* JADX INFO: renamed from: e */
        public abstract C3080k mo16670e(AbstractFuture<?> abstractFuture, C3080k c3080k);

        /* JADX INFO: renamed from: f */
        public abstract void mo16671f(C3080k c3080k, C3080k c3080k2);

        /* JADX INFO: renamed from: g */
        public abstract void mo16672g(C3080k c3080k, Thread thread);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$c */
    public static final class C3072c {

        /* JADX INFO: renamed from: c */
        public static final C3072c f11364c;

        /* JADX INFO: renamed from: d */
        public static final C3072c f11365d;

        /* JADX INFO: renamed from: a */
        public final boolean f11366a;

        /* JADX INFO: renamed from: b */
        public final Throwable f11367b;

        static {
            if (AbstractFuture.f11355d) {
                f11365d = null;
                f11364c = null;
            } else {
                f11365d = new C3072c(false, null);
                f11364c = new C3072c(true, null);
            }
        }

        public C3072c(boolean z, Throwable th) {
            this.f11366a = z;
            this.f11367b = th;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$e */
    public static final class C3074e extends AbstractC3071b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<C3080k, Thread> f11372a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<C3080k, C3080k> f11373b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3080k> f11374c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3073d> f11375d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f11376e;

        public C3074e(AtomicReferenceFieldUpdater<C3080k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3080k, C3080k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C3080k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C3073d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11372a = atomicReferenceFieldUpdater;
            this.f11373b = atomicReferenceFieldUpdater2;
            this.f11374c = atomicReferenceFieldUpdater3;
            this.f11375d = atomicReferenceFieldUpdater4;
            this.f11376e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: a */
        public boolean mo16666a(AbstractFuture<?> abstractFuture, C3073d c3073d, C3073d c3073d2) {
            return C20511u7.m194801a(this.f11375d, abstractFuture, c3073d, c3073d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: b */
        public boolean mo16667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C20511u7.m194801a(this.f11376e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: c */
        public boolean mo16668c(AbstractFuture<?> abstractFuture, C3080k c3080k, C3080k c3080k2) {
            return C20511u7.m194801a(this.f11374c, abstractFuture, c3080k, c3080k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: d */
        public C3073d mo16669d(AbstractFuture<?> abstractFuture, C3073d c3073d) {
            return this.f11375d.getAndSet(abstractFuture, c3073d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: e */
        public C3080k mo16670e(AbstractFuture<?> abstractFuture, C3080k c3080k) {
            return this.f11374c.getAndSet(abstractFuture, c3080k);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: f */
        public void mo16671f(C3080k c3080k, C3080k c3080k2) {
            this.f11373b.lazySet(c3080k, c3080k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: g */
        public void mo16672g(C3080k c3080k, Thread thread) {
            this.f11372a.lazySet(c3080k, thread);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$f */
    public static final class RunnableC3075f<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractFuture<V> f11377a;

        /* JADX INFO: renamed from: b */
        public final hpr<? extends V> f11378b;

        public RunnableC3075f(AbstractFuture<V> abstractFuture, hpr<? extends V> hprVar) {
            this.f11377a = abstractFuture;
            this.f11378b = hprVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11377a.f11359a != this) {
                return;
            }
            if (AbstractFuture.f11357f.mo16667b(this.f11377a, this, AbstractFuture.m16647v(this.f11378b))) {
                AbstractFuture.m16645s(this.f11377a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$g */
    public static final class C3076g extends AbstractC3071b {
        public C3076g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: a */
        public boolean mo16666a(AbstractFuture<?> abstractFuture, C3073d c3073d, C3073d c3073d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11360b != c3073d) {
                        return false;
                    }
                    abstractFuture.f11360b = c3073d2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: b */
        public boolean mo16667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11359a != obj) {
                        return false;
                    }
                    abstractFuture.f11359a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: c */
        public boolean mo16668c(AbstractFuture<?> abstractFuture, C3080k c3080k, C3080k c3080k2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11361c != c3080k) {
                        return false;
                    }
                    abstractFuture.f11361c = c3080k2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: d */
        public C3073d mo16669d(AbstractFuture<?> abstractFuture, C3073d c3073d) {
            C3073d c3073d2;
            synchronized (abstractFuture) {
                try {
                    c3073d2 = abstractFuture.f11360b;
                    if (c3073d2 != c3073d) {
                        abstractFuture.f11360b = c3073d;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3073d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: e */
        public C3080k mo16670e(AbstractFuture<?> abstractFuture, C3080k c3080k) {
            C3080k c3080k2;
            synchronized (abstractFuture) {
                try {
                    c3080k2 = abstractFuture.f11361c;
                    if (c3080k2 != c3080k) {
                        abstractFuture.f11361c = c3080k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3080k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: f */
        public void mo16671f(C3080k c3080k, C3080k c3080k2) {
            c3080k.f11387b = c3080k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: g */
        public void mo16672g(C3080k c3080k, Thread thread) {
            c3080k.f11386a = thread;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$h */
    public interface InterfaceC3077h<V> extends hpr<V> {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$j */
    public static final class C3079j extends AbstractC3071b {

        /* JADX INFO: renamed from: a */
        public static final Unsafe f11379a;

        /* JADX INFO: renamed from: b */
        public static final long f11380b;

        /* JADX INFO: renamed from: c */
        public static final long f11381c;

        /* JADX INFO: renamed from: d */
        public static final long f11382d;

        /* JADX INFO: renamed from: e */
        public static final long f11383e;

        /* JADX INFO: renamed from: f */
        public static final long f11384f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$j$a */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f11381c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                    f11380b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                    f11382d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("a"));
                    f11383e = unsafe.objectFieldOffset(C3080k.class.getDeclaredField("a"));
                    f11384f = unsafe.objectFieldOffset(C3080k.class.getDeclaredField("b"));
                    f11379a = unsafe;
                } catch (Exception e) {
                    uyi0.m198661i(e);
                    iig0.m140070a(e);
                }
            } catch (PrivilegedActionException e2) {
                vtq0.m202761a("Could not initialize intrinsics", e2.getCause());
            }
        }

        public C3079j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: a */
        public boolean mo16666a(AbstractFuture<?> abstractFuture, C3073d c3073d, C3073d c3073d2) {
            return iuw0.m142236a(f11379a, abstractFuture, f11380b, c3073d, c3073d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: b */
        public boolean mo16667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return iuw0.m142236a(f11379a, abstractFuture, f11382d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: c */
        public boolean mo16668c(AbstractFuture<?> abstractFuture, C3080k c3080k, C3080k c3080k2) {
            return iuw0.m142236a(f11379a, abstractFuture, f11381c, c3080k, c3080k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: d */
        public C3073d mo16669d(AbstractFuture<?> abstractFuture, C3073d c3073d) {
            C3073d c3073d2;
            do {
                c3073d2 = abstractFuture.f11360b;
                if (c3073d == c3073d2) {
                    break;
                }
            } while (!mo16666a(abstractFuture, c3073d2, c3073d));
            return c3073d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: e */
        public C3080k mo16670e(AbstractFuture<?> abstractFuture, C3080k c3080k) {
            C3080k c3080k2;
            do {
                c3080k2 = abstractFuture.f11361c;
                if (c3080k == c3080k2) {
                    break;
                }
            } while (!mo16668c(abstractFuture, c3080k2, c3080k));
            return c3080k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: f */
        public void mo16671f(C3080k c3080k, C3080k c3080k2) {
            f11379a.putObject(c3080k, f11384f, c3080k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3071b
        /* JADX INFO: renamed from: g */
        public void mo16672g(C3080k c3080k, Thread thread) {
            f11379a.putObject(c3080k, f11383e, thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.common.util.concurrent.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z;
        Throwable th;
        AbstractC3071b c3074e;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f11355d = z;
        f11356e = Logger.getLogger(AbstractFuture.class.getName());
        ?? r5 = 0;
        r5 = 0;
        try {
            c3074e = new C3079j();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c3074e = new C3074e(AtomicReferenceFieldUpdater.newUpdater(C3080k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3080k.class, C3080k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C3080k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C3073d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            } catch (Throwable th3) {
                C3076g c3076g = new C3076g();
                r5 = th3;
                c3074e = c3076g;
            }
        }
        f11357f = c3074e;
        if (r5 != 0) {
            ?? r0 = f11356e;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", th);
            r0.log(level, "SafeAtomicHelper is broken!", r5);
        }
        f11358g = new Object();
    }

    /* JADX INFO: renamed from: q */
    public static CancellationException m16644q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public static void m16645s(AbstractFuture<?> abstractFuture) {
        C3073d c3073d = null;
        while (true) {
            abstractFuture.m16649A();
            abstractFuture.mo16658n();
            C3073d c3073dM16661r = abstractFuture.m16661r(c3073d);
            while (c3073dM16661r != null) {
                c3073d = c3073dM16661r.f11371c;
                Runnable runnable = c3073dM16661r.f11369a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC3075f) {
                    RunnableC3075f runnableC3075f = (RunnableC3075f) runnable2;
                    abstractFuture = runnableC3075f.f11377a;
                    if (abstractFuture.f11359a == runnableC3075f) {
                        if (f11357f.mo16667b(abstractFuture, runnableC3075f, m16647v(runnableC3075f.f11378b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3073dM16661r.f11370b;
                    Objects.requireNonNull(executor);
                    m16646t(runnable2, executor);
                }
                c3073dM16661r = c3073d;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m16646t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f11356e;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static Object m16647v(hpr<?> hprVar) {
        Throwable thM169985a;
        if (hprVar instanceof InterfaceC3077h) {
            Object c3072c = ((AbstractFuture) hprVar).f11359a;
            if (c3072c instanceof C3072c) {
                C3072c c3072c2 = (C3072c) c3072c;
                if (c3072c2.f11366a) {
                    c3072c = c3072c2.f11367b != null ? new C3072c(false, c3072c2.f11367b) : C3072c.f11365d;
                }
            }
            Objects.requireNonNull(c3072c);
            return c3072c;
        }
        if ((hprVar instanceof nzm) && (thM169985a = ozm.m169985a((nzm) hprVar)) != null) {
            return new Failure(thM169985a);
        }
        boolean zIsCancelled = hprVar.isCancelled();
        if ((!f11355d) && zIsCancelled) {
            C3072c c3072c3 = C3072c.f11365d;
            Objects.requireNonNull(c3072c3);
            return c3072c3;
        }
        try {
            Object objM16648w = m16648w(hprVar);
            if (!zIsCancelled) {
                return objM16648w == null ? f11358g : objM16648w;
            }
            String strValueOf = String.valueOf(hprVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new C3072c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C3072c(false, e);
            }
            String strValueOf2 = String.valueOf(hprVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new Failure(new IllegalArgumentException(sb2.toString(), e));
        } catch (ExecutionException e2) {
            if (!zIsCancelled) {
                return new Failure(e2.getCause());
            }
            String strValueOf3 = String.valueOf(hprVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new C3072c(false, new IllegalArgumentException(sb3.toString(), e2));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* JADX INFO: renamed from: w */
    private static <V> V m16648w(Future<V> future) throws ExecutionException {
        V v2;
        boolean z = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    /* JADX INFO: renamed from: A */
    public final void m16649A() {
        for (C3080k c3080kMo16670e = f11357f.mo16670e(this, C3080k.f11385c); c3080kMo16670e != null; c3080kMo16670e = c3080kMo16670e.f11387b) {
            c3080kMo16670e.m16675b();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m16650B(C3080k c3080k) {
        c3080k.f11386a = null;
        while (true) {
            C3080k c3080k2 = this.f11361c;
            if (c3080k2 == C3080k.f11385c) {
                return;
            }
            C3080k c3080k3 = null;
            while (c3080k2 != null) {
                C3080k c3080k4 = c3080k2.f11387b;
                if (c3080k2.f11386a != null) {
                    c3080k3 = c3080k2;
                } else if (c3080k3 != null) {
                    c3080k3.f11387b = c3080k4;
                    if (c3080k3.f11386a == null) {
                    }
                } else if (!f11357f.mo16668c(this, c3080k2, c3080k4)) {
                }
                c3080k2 = c3080k4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: C */
    public boolean mo16651C(V v2) {
        if (v2 == null) {
            v2 = (V) f11358g;
        }
        if (!f11357f.mo16667b(this, null, v2)) {
            return false;
        }
        m16645s(this);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo16652D(Throwable th) {
        if (!f11357f.mo16667b(this, null, new Failure((Throwable) xn80.m212111p(th)))) {
            return false;
        }
        m16645s(this);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m16653E(hpr<? extends V> hprVar) {
        Failure failure;
        xn80.m212111p(hprVar);
        Object obj = this.f11359a;
        if (obj == null) {
            if (hprVar.isDone()) {
                if (!f11357f.mo16667b(this, null, m16647v(hprVar))) {
                    return false;
                }
                m16645s(this);
                return true;
            }
            RunnableC3075f runnableC3075f = new RunnableC3075f(this, hprVar);
            if (f11357f.mo16667b(this, null, runnableC3075f)) {
                try {
                    hprVar.addListener(runnableC3075f, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f11362b;
                    }
                    f11357f.mo16667b(this, runnableC3075f, failure);
                }
                return true;
            }
            obj = this.f11359a;
        }
        if (obj instanceof C3072c) {
            hprVar.cancel(((C3072c) obj).f11366a);
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m16654F() {
        Object obj = this.f11359a;
        return (obj instanceof C3072c) && ((C3072c) obj).f11366a;
    }

    @Override // p153l.nzm
    /* JADX INFO: renamed from: a */
    public final Throwable mo16655a() {
        if (!(this instanceof InterfaceC3077h)) {
            return null;
        }
        Object obj = this.f11359a;
        if (obj instanceof Failure) {
            return ((Failure) obj).f11363a;
        }
        return null;
    }

    @Override // p153l.hpr
    public void addListener(Runnable runnable, Executor executor) {
        C3073d c3073d;
        xn80.m212112q(runnable, "Runnable was null.");
        xn80.m212112q(executor, "Executor was null.");
        if (!isDone() && (c3073d = this.f11360b) != C3073d.f11368d) {
            C3073d c3073d2 = new C3073d(runnable, executor);
            do {
                c3073d2.f11371c = c3073d;
                if (f11357f.mo16666a(this, c3073d, c3073d2)) {
                    return;
                } else {
                    c3073d = this.f11360b;
                }
            } while (c3073d != C3073d.f11368d);
        }
        m16646t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C3072c c3072c;
        Object obj = this.f11359a;
        if (!(obj == null) && !(obj instanceof RunnableC3075f)) {
            return false;
        }
        if (f11355d) {
            c3072c = new C3072c(z, new CancellationException("Future.cancel() was called."));
        } else {
            c3072c = z ? C3072c.f11364c : C3072c.f11365d;
            Objects.requireNonNull(c3072c);
        }
        boolean z2 = false;
        while (true) {
            if (f11357f.mo16667b(this, obj, c3072c)) {
                if (z) {
                    this.m16663x();
                }
                m16645s(this);
                if (obj instanceof RunnableC3075f) {
                    hpr<? extends V> hprVar = ((RunnableC3075f) obj).f11378b;
                    if (hprVar instanceof InterfaceC3077h) {
                        this = (AbstractFuture) hprVar;
                        obj = this.f11359a;
                        if ((obj == null) | (obj instanceof RunnableC3075f)) {
                            z2 = true;
                        }
                    } else {
                        hprVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f11359a;
            if (!(obj instanceof RunnableC3075f)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11359a;
        if ((obj != null) && (!(obj instanceof RunnableC3075f))) {
            return m16662u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3080k c3080k = this.f11361c;
            if (c3080k != C3080k.f11385c) {
                C3080k c3080k2 = new C3080k();
                while (true) {
                    c3080k2.m16674a(c3080k);
                    if (f11357f.mo16668c(this, c3080k, c3080k2)) {
                        do {
                            k760.m148592a(this, nanos);
                            if (Thread.interrupted()) {
                                m16650B(c3080k2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11359a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC3075f))) {
                                return m16662u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m16650B(c3080k2);
                        break;
                    }
                    c3080k = this.f11361c;
                    if (c3080k == C3080k.f11385c) {
                    }
                }
            }
            Object obj3 = this.f11359a;
            Objects.requireNonNull(obj3);
            return m16662u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f11359a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC3075f))) {
                return m16662u(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(strConcat.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = string4.concat(Constants.SEPARATOR_COMMA);
                }
                strConcat = string4.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            if (z) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + 33);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11359a instanceof C3072c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f11359a;
        return (!(obj instanceof RunnableC3075f)) & (obj != null);
    }

    /* JADX INFO: renamed from: l */
    public final void m16656l(StringBuilder sb) {
        try {
            Object objM16648w = m16648w(this);
            sb.append("SUCCESS, result=[");
            m16659o(sb, objM16648w);
            sb.append(Constants.AES_SUFFIX);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(Constants.AES_SUFFIX);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16657m(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f11359a;
        if (obj instanceof RunnableC3075f) {
            sb.append(", setFuture=[");
            m16660p(sb, ((RunnableC3075f) obj).f11378b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                string = r8g0.m180202a(mo16665z());
            } catch (RuntimeException | StackOverflowError e) {
                String strValueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append(Constants.AES_SUFFIX);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m16656l(sb);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo16658n() {
    }

    /* JADX INFO: renamed from: o */
    public final void m16659o(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m16660p(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e) {
            e = e;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: renamed from: r */
    public final C3073d m16661r(C3073d c3073d) {
        C3073d c3073dMo16669d = f11357f.mo16669d(this, C3073d.f11368d);
        C3073d c3073d2 = c3073d;
        while (c3073dMo16669d != null) {
            C3073d c3073d3 = c3073dMo16669d.f11371c;
            c3073dMo16669d.f11371c = c3073d2;
            c3073d2 = c3073dMo16669d;
            c3073dMo16669d = c3073d3;
        }
        return c3073d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m16656l(sb);
        } else {
            m16657m(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final V m16662u(Object obj) throws ExecutionException {
        if (obj instanceof C3072c) {
            throw m16644q("Task was cancelled.", ((C3072c) obj).f11367b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f11363a);
        }
        return obj == f11358g ? (V) l350.m152682b() : obj;
    }

    /* JADX INFO: renamed from: x */
    public void m16663x() {
    }

    /* JADX INFO: renamed from: y */
    public final void m16664y(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m16654F());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public String mo16665z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$i */
    public static abstract class AbstractC3078i<V> extends AbstractFuture<V> implements InterfaceC3077h<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, p153l.hpr
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$d */
    public static final class C3073d {

        /* JADX INFO: renamed from: d */
        public static final C3073d f11368d = new C3073d();

        /* JADX INFO: renamed from: a */
        public final Runnable f11369a;

        /* JADX INFO: renamed from: b */
        public final Executor f11370b;

        /* JADX INFO: renamed from: c */
        public C3073d f11371c;

        public C3073d() {
            this.f11369a = null;
            this.f11370b = null;
        }

        public C3073d(Runnable runnable, Executor executor) {
            this.f11369a = runnable;
            this.f11370b = executor;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$k */
    public static final class C3080k {

        /* JADX INFO: renamed from: c */
        public static final C3080k f11385c = new C3080k(false);

        /* JADX INFO: renamed from: a */
        public volatile Thread f11386a;

        /* JADX INFO: renamed from: b */
        public volatile C3080k f11387b;

        public C3080k() {
            AbstractFuture.f11357f.mo16672g(this, Thread.currentThread());
        }

        /* JADX INFO: renamed from: a */
        public void m16674a(C3080k c3080k) {
            AbstractFuture.f11357f.mo16671f(this, c3080k);
        }

        /* JADX INFO: renamed from: b */
        public void m16675b() {
            Thread thread = this.f11386a;
            if (thread != null) {
                this.f11386a = null;
                LockSupport.unpark(thread);
            }
        }

        public C3080k(boolean z) {
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11359a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3075f))) {
                return m16662u(obj2);
            }
            C3080k c3080k = this.f11361c;
            if (c3080k != C3080k.f11385c) {
                C3080k c3080k2 = new C3080k();
                do {
                    c3080k2.m16674a(c3080k);
                    if (f11357f.mo16668c(this, c3080k, c3080k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11359a;
                            } else {
                                m16650B(c3080k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3075f))));
                        return m16662u(obj);
                    }
                    c3080k = this.f11361c;
                } while (c3080k != C3080k.f11385c);
            }
            Object obj3 = this.f11359a;
            Objects.requireNonNull(obj3);
            return m16662u(obj3);
        }
        throw new InterruptedException();
    }
}
