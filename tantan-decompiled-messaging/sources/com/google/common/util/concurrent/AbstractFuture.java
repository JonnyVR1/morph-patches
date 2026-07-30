package com.google.common.util.concurrent;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
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
import p149l.C21643z7;
import p149l.aag0;
import p149l.clw0;
import p149l.fz50;
import p149l.gnr;
import p149l.k0g0;
import p149l.nxm;
import p149l.oxm;
import p149l.pkq0;
import p149l.rpi0;
import p149l.sf80;
import p149l.wu40;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractFuture<V> extends nxm implements gnr<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f11318d;

    /* JADX INFO: renamed from: e */
    public static final Logger f11319e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC3048b f11320f;

    /* JADX INFO: renamed from: g */
    public static final Object f11321g;

    /* JADX INFO: renamed from: a */
    public volatile Object f11322a;

    /* JADX INFO: renamed from: b */
    public volatile C3050d f11323b;

    /* JADX INFO: renamed from: c */
    public volatile C3057k f11324c;

    public static final class Failure {

        /* JADX INFO: renamed from: b */
        public static final Failure f11325b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a */
        public final Throwable f11326a;

        public Failure(Throwable th) {
            this.f11326a = (Throwable) sf80.m183894p(th);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$b */
    public static abstract class AbstractC3048b {
        public AbstractC3048b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo16611a(AbstractFuture<?> abstractFuture, C3050d c3050d, C3050d c3050d2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo16612b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo16613c(AbstractFuture<?> abstractFuture, C3057k c3057k, C3057k c3057k2);

        /* JADX INFO: renamed from: d */
        public abstract C3050d mo16614d(AbstractFuture<?> abstractFuture, C3050d c3050d);

        /* JADX INFO: renamed from: e */
        public abstract C3057k mo16615e(AbstractFuture<?> abstractFuture, C3057k c3057k);

        /* JADX INFO: renamed from: f */
        public abstract void mo16616f(C3057k c3057k, C3057k c3057k2);

        /* JADX INFO: renamed from: g */
        public abstract void mo16617g(C3057k c3057k, Thread thread);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$c */
    public static final class C3049c {

        /* JADX INFO: renamed from: c */
        public static final C3049c f11327c;

        /* JADX INFO: renamed from: d */
        public static final C3049c f11328d;

        /* JADX INFO: renamed from: a */
        public final boolean f11329a;

        /* JADX INFO: renamed from: b */
        public final Throwable f11330b;

        static {
            if (AbstractFuture.f11318d) {
                f11328d = null;
                f11327c = null;
            } else {
                f11328d = new C3049c(false, null);
                f11327c = new C3049c(true, null);
            }
        }

        public C3049c(boolean z, Throwable th) {
            this.f11329a = z;
            this.f11330b = th;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$e */
    public static final class C3051e extends AbstractC3048b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<C3057k, Thread> f11335a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<C3057k, C3057k> f11336b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3057k> f11337c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3050d> f11338d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f11339e;

        public C3051e(AtomicReferenceFieldUpdater<C3057k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3057k, C3057k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C3057k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C3050d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11335a = atomicReferenceFieldUpdater;
            this.f11336b = atomicReferenceFieldUpdater2;
            this.f11337c = atomicReferenceFieldUpdater3;
            this.f11338d = atomicReferenceFieldUpdater4;
            this.f11339e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: a */
        public boolean mo16611a(AbstractFuture<?> abstractFuture, C3050d c3050d, C3050d c3050d2) {
            return C21643z7.m217426a(this.f11338d, abstractFuture, c3050d, c3050d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: b */
        public boolean mo16612b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C21643z7.m217426a(this.f11339e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: c */
        public boolean mo16613c(AbstractFuture<?> abstractFuture, C3057k c3057k, C3057k c3057k2) {
            return C21643z7.m217426a(this.f11337c, abstractFuture, c3057k, c3057k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: d */
        public C3050d mo16614d(AbstractFuture<?> abstractFuture, C3050d c3050d) {
            return this.f11338d.getAndSet(abstractFuture, c3050d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: e */
        public C3057k mo16615e(AbstractFuture<?> abstractFuture, C3057k c3057k) {
            return this.f11337c.getAndSet(abstractFuture, c3057k);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: f */
        public void mo16616f(C3057k c3057k, C3057k c3057k2) {
            this.f11336b.lazySet(c3057k, c3057k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: g */
        public void mo16617g(C3057k c3057k, Thread thread) {
            this.f11335a.lazySet(c3057k, thread);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$f */
    public static final class RunnableC3052f<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractFuture<V> f11340a;

        /* JADX INFO: renamed from: b */
        public final gnr<? extends V> f11341b;

        public RunnableC3052f(AbstractFuture<V> abstractFuture, gnr<? extends V> gnrVar) {
            this.f11340a = abstractFuture;
            this.f11341b = gnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11340a.f11322a != this) {
                return;
            }
            if (AbstractFuture.f11320f.mo16612b(this.f11340a, this, AbstractFuture.m16592v(this.f11341b))) {
                AbstractFuture.m16590s(this.f11340a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$g */
    public static final class C3053g extends AbstractC3048b {
        public C3053g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: a */
        public boolean mo16611a(AbstractFuture<?> abstractFuture, C3050d c3050d, C3050d c3050d2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11323b != c3050d) {
                        return false;
                    }
                    abstractFuture.f11323b = c3050d2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: b */
        public boolean mo16612b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11322a != obj) {
                        return false;
                    }
                    abstractFuture.f11322a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: c */
        public boolean mo16613c(AbstractFuture<?> abstractFuture, C3057k c3057k, C3057k c3057k2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f11324c != c3057k) {
                        return false;
                    }
                    abstractFuture.f11324c = c3057k2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: d */
        public C3050d mo16614d(AbstractFuture<?> abstractFuture, C3050d c3050d) {
            C3050d c3050d2;
            synchronized (abstractFuture) {
                try {
                    c3050d2 = abstractFuture.f11323b;
                    if (c3050d2 != c3050d) {
                        abstractFuture.f11323b = c3050d;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3050d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: e */
        public C3057k mo16615e(AbstractFuture<?> abstractFuture, C3057k c3057k) {
            C3057k c3057k2;
            synchronized (abstractFuture) {
                try {
                    c3057k2 = abstractFuture.f11324c;
                    if (c3057k2 != c3057k) {
                        abstractFuture.f11324c = c3057k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c3057k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: f */
        public void mo16616f(C3057k c3057k, C3057k c3057k2) {
            c3057k.f11350b = c3057k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: g */
        public void mo16617g(C3057k c3057k, Thread thread) {
            c3057k.f11349a = thread;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$h */
    public interface InterfaceC3054h<V> extends gnr<V> {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$j */
    public static final class C3056j extends AbstractC3048b {

        /* JADX INFO: renamed from: a */
        public static final Unsafe f11342a;

        /* JADX INFO: renamed from: b */
        public static final long f11343b;

        /* JADX INFO: renamed from: c */
        public static final long f11344c;

        /* JADX INFO: renamed from: d */
        public static final long f11345d;

        /* JADX INFO: renamed from: e */
        public static final long f11346e;

        /* JADX INFO: renamed from: f */
        public static final long f11347f;

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
                    f11344c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                    f11343b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                    f11345d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("a"));
                    f11346e = unsafe.objectFieldOffset(C3057k.class.getDeclaredField("a"));
                    f11347f = unsafe.objectFieldOffset(C3057k.class.getDeclaredField("b"));
                    f11342a = unsafe;
                } catch (Exception e) {
                    rpi0.m180338i(e);
                    aag0.m95543a(e);
                }
            } catch (PrivilegedActionException e2) {
                pkq0.m170054a("Could not initialize intrinsics", e2.getCause());
            }
        }

        public C3056j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: a */
        public boolean mo16611a(AbstractFuture<?> abstractFuture, C3050d c3050d, C3050d c3050d2) {
            return clw0.m107580a(f11342a, abstractFuture, f11343b, c3050d, c3050d2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: b */
        public boolean mo16612b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return clw0.m107580a(f11342a, abstractFuture, f11345d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: c */
        public boolean mo16613c(AbstractFuture<?> abstractFuture, C3057k c3057k, C3057k c3057k2) {
            return clw0.m107580a(f11342a, abstractFuture, f11344c, c3057k, c3057k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: d */
        public C3050d mo16614d(AbstractFuture<?> abstractFuture, C3050d c3050d) {
            C3050d c3050d2;
            do {
                c3050d2 = abstractFuture.f11323b;
                if (c3050d == c3050d2) {
                    break;
                }
            } while (!mo16611a(abstractFuture, c3050d2, c3050d));
            return c3050d2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: e */
        public C3057k mo16615e(AbstractFuture<?> abstractFuture, C3057k c3057k) {
            C3057k c3057k2;
            do {
                c3057k2 = abstractFuture.f11324c;
                if (c3057k == c3057k2) {
                    break;
                }
            } while (!mo16613c(abstractFuture, c3057k2, c3057k));
            return c3057k2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: f */
        public void mo16616f(C3057k c3057k, C3057k c3057k2) {
            f11342a.putObject(c3057k, f11347f, c3057k2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AbstractC3048b
        /* JADX INFO: renamed from: g */
        public void mo16617g(C3057k c3057k, Thread thread) {
            f11342a.putObject(c3057k, f11346e, thread);
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
        AbstractC3048b c3051e;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f11318d = z;
        f11319e = Logger.getLogger(AbstractFuture.class.getName());
        ?? r5 = 0;
        r5 = 0;
        try {
            c3051e = new C3056j();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c3051e = new C3051e(AtomicReferenceFieldUpdater.newUpdater(C3057k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3057k.class, C3057k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C3057k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C3050d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            } catch (Throwable th3) {
                C3053g c3053g = new C3053g();
                r5 = th3;
                c3051e = c3053g;
            }
        }
        f11320f = c3051e;
        if (r5 != 0) {
            ?? r0 = f11319e;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", th);
            r0.log(level, "SafeAtomicHelper is broken!", r5);
        }
        f11321g = new Object();
    }

    /* JADX INFO: renamed from: q */
    public static CancellationException m16589q(String str, Throwable th) {
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
    public static void m16590s(AbstractFuture<?> abstractFuture) {
        C3050d c3050d = null;
        while (true) {
            abstractFuture.m16594A();
            abstractFuture.mo16603n();
            C3050d c3050dM16606r = abstractFuture.m16606r(c3050d);
            while (c3050dM16606r != null) {
                c3050d = c3050dM16606r.f11334c;
                Runnable runnable = c3050dM16606r.f11332a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC3052f) {
                    RunnableC3052f runnableC3052f = (RunnableC3052f) runnable2;
                    abstractFuture = runnableC3052f.f11340a;
                    if (abstractFuture.f11322a == runnableC3052f) {
                        if (f11320f.mo16612b(abstractFuture, runnableC3052f, m16592v(runnableC3052f.f11341b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3050dM16606r.f11333b;
                    Objects.requireNonNull(executor);
                    m16591t(runnable2, executor);
                }
                c3050dM16606r = c3050d;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m16591t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f11319e;
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
    public static Object m16592v(gnr<?> gnrVar) {
        Throwable thM166571a;
        if (gnrVar instanceof InterfaceC3054h) {
            Object c3049c = ((AbstractFuture) gnrVar).f11322a;
            if (c3049c instanceof C3049c) {
                C3049c c3049c2 = (C3049c) c3049c;
                if (c3049c2.f11329a) {
                    c3049c = c3049c2.f11330b != null ? new C3049c(false, c3049c2.f11330b) : C3049c.f11328d;
                }
            }
            Objects.requireNonNull(c3049c);
            return c3049c;
        }
        if ((gnrVar instanceof nxm) && (thM166571a = oxm.m166571a((nxm) gnrVar)) != null) {
            return new Failure(thM166571a);
        }
        boolean zIsCancelled = gnrVar.isCancelled();
        if ((!f11318d) && zIsCancelled) {
            C3049c c3049c3 = C3049c.f11328d;
            Objects.requireNonNull(c3049c3);
            return c3049c3;
        }
        try {
            Object objM16593w = m16593w(gnrVar);
            if (!zIsCancelled) {
                return objM16593w == null ? f11321g : objM16593w;
            }
            String strValueOf = String.valueOf(gnrVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new C3049c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C3049c(false, e);
            }
            String strValueOf2 = String.valueOf(gnrVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new Failure(new IllegalArgumentException(sb2.toString(), e));
        } catch (ExecutionException e2) {
            if (!zIsCancelled) {
                return new Failure(e2.getCause());
            }
            String strValueOf3 = String.valueOf(gnrVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new C3049c(false, new IllegalArgumentException(sb3.toString(), e2));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* JADX INFO: renamed from: w */
    private static <V> V m16593w(Future<V> future) throws ExecutionException {
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
    public final void m16594A() {
        for (C3057k c3057kMo16615e = f11320f.mo16615e(this, C3057k.f11348c); c3057kMo16615e != null; c3057kMo16615e = c3057kMo16615e.f11350b) {
            c3057kMo16615e.m16620b();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m16595B(C3057k c3057k) {
        c3057k.f11349a = null;
        while (true) {
            C3057k c3057k2 = this.f11324c;
            if (c3057k2 == C3057k.f11348c) {
                return;
            }
            C3057k c3057k3 = null;
            while (c3057k2 != null) {
                C3057k c3057k4 = c3057k2.f11350b;
                if (c3057k2.f11349a != null) {
                    c3057k3 = c3057k2;
                } else if (c3057k3 != null) {
                    c3057k3.f11350b = c3057k4;
                    if (c3057k3.f11349a == null) {
                    }
                } else if (!f11320f.mo16613c(this, c3057k2, c3057k4)) {
                }
                c3057k2 = c3057k4;
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
    public boolean mo16596C(V v2) {
        if (v2 == null) {
            v2 = (V) f11321g;
        }
        if (!f11320f.mo16612b(this, null, v2)) {
            return false;
        }
        m16590s(this);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo16597D(Throwable th) {
        if (!f11320f.mo16612b(this, null, new Failure((Throwable) sf80.m183894p(th)))) {
            return false;
        }
        m16590s(this);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m16598E(gnr<? extends V> gnrVar) {
        Failure failure;
        sf80.m183894p(gnrVar);
        Object obj = this.f11322a;
        if (obj == null) {
            if (gnrVar.isDone()) {
                if (!f11320f.mo16612b(this, null, m16592v(gnrVar))) {
                    return false;
                }
                m16590s(this);
                return true;
            }
            RunnableC3052f runnableC3052f = new RunnableC3052f(this, gnrVar);
            if (f11320f.mo16612b(this, null, runnableC3052f)) {
                try {
                    gnrVar.addListener(runnableC3052f, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f11325b;
                    }
                    f11320f.mo16612b(this, runnableC3052f, failure);
                }
                return true;
            }
            obj = this.f11322a;
        }
        if (obj instanceof C3049c) {
            gnrVar.cancel(((C3049c) obj).f11329a);
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m16599F() {
        Object obj = this.f11322a;
        return (obj instanceof C3049c) && ((C3049c) obj).f11329a;
    }

    @Override // p149l.nxm
    /* JADX INFO: renamed from: a */
    public final Throwable mo16600a() {
        if (!(this instanceof InterfaceC3054h)) {
            return null;
        }
        Object obj = this.f11322a;
        if (obj instanceof Failure) {
            return ((Failure) obj).f11326a;
        }
        return null;
    }

    @Override // p149l.gnr
    public void addListener(Runnable runnable, Executor executor) {
        C3050d c3050d;
        sf80.m183895q(runnable, "Runnable was null.");
        sf80.m183895q(executor, "Executor was null.");
        if (!isDone() && (c3050d = this.f11323b) != C3050d.f11331d) {
            C3050d c3050d2 = new C3050d(runnable, executor);
            do {
                c3050d2.f11334c = c3050d;
                if (f11320f.mo16611a(this, c3050d, c3050d2)) {
                    return;
                } else {
                    c3050d = this.f11323b;
                }
            } while (c3050d != C3050d.f11331d);
        }
        m16591t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C3049c c3049c;
        Object obj = this.f11322a;
        if (!(obj == null) && !(obj instanceof RunnableC3052f)) {
            return false;
        }
        if (f11318d) {
            c3049c = new C3049c(z, new CancellationException("Future.cancel() was called."));
        } else {
            c3049c = z ? C3049c.f11327c : C3049c.f11328d;
            Objects.requireNonNull(c3049c);
        }
        boolean z2 = false;
        while (true) {
            if (f11320f.mo16612b(this, obj, c3049c)) {
                if (z) {
                    this.m16608x();
                }
                m16590s(this);
                if (obj instanceof RunnableC3052f) {
                    gnr<? extends V> gnrVar = ((RunnableC3052f) obj).f11341b;
                    if (gnrVar instanceof InterfaceC3054h) {
                        this = (AbstractFuture) gnrVar;
                        obj = this.f11322a;
                        if ((obj == null) | (obj instanceof RunnableC3052f)) {
                            z2 = true;
                        }
                    } else {
                        gnrVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f11322a;
            if (!(obj instanceof RunnableC3052f)) {
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
        Object obj = this.f11322a;
        if ((obj != null) && (!(obj instanceof RunnableC3052f))) {
            return m16607u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3057k c3057k = this.f11324c;
            if (c3057k != C3057k.f11348c) {
                C3057k c3057k2 = new C3057k();
                while (true) {
                    c3057k2.m16619a(c3057k);
                    if (f11320f.mo16613c(this, c3057k, c3057k2)) {
                        do {
                            fz50.m123817a(this, nanos);
                            if (Thread.interrupted()) {
                                m16595B(c3057k2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11322a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC3052f))) {
                                return m16607u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m16595B(c3057k2);
                        break;
                    }
                    c3057k = this.f11324c;
                    if (c3057k == C3057k.f11348c) {
                    }
                }
            }
            Object obj3 = this.f11322a;
            Objects.requireNonNull(obj3);
            return m16607u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f11322a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC3052f))) {
                return m16607u(obj4);
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
        return this.f11322a instanceof C3049c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f11322a;
        return (!(obj instanceof RunnableC3052f)) & (obj != null);
    }

    /* JADX INFO: renamed from: l */
    public final void m16601l(StringBuilder sb) {
        try {
            Object objM16593w = m16593w(this);
            sb.append("SUCCESS, result=[");
            m16604o(sb, objM16593w);
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
    public final void m16602m(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f11322a;
        if (obj instanceof RunnableC3052f) {
            sb.append(", setFuture=[");
            m16605p(sb, ((RunnableC3052f) obj).f11341b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                string = k0g0.m144047a(mo16610z());
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
            m16601l(sb);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo16603n() {
    }

    /* JADX INFO: renamed from: o */
    public final void m16604o(StringBuilder sb, Object obj) {
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
    public final void m16605p(StringBuilder sb, Object obj) {
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
    public final C3050d m16606r(C3050d c3050d) {
        C3050d c3050dMo16614d = f11320f.mo16614d(this, C3050d.f11331d);
        C3050d c3050d2 = c3050d;
        while (c3050dMo16614d != null) {
            C3050d c3050d3 = c3050dMo16614d.f11334c;
            c3050dMo16614d.f11334c = c3050d2;
            c3050d2 = c3050dMo16614d;
            c3050dMo16614d = c3050d3;
        }
        return c3050d2;
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
            m16601l(sb);
        } else {
            m16602m(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final V m16607u(Object obj) throws ExecutionException {
        if (obj instanceof C3049c) {
            throw m16589q("Task was cancelled.", ((C3049c) obj).f11330b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f11326a);
        }
        return obj == f11321g ? (V) wu40.m205596b() : obj;
    }

    /* JADX INFO: renamed from: x */
    public void m16608x() {
    }

    /* JADX INFO: renamed from: y */
    public final void m16609y(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m16599F());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public String mo16610z() {
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
    public static abstract class AbstractC3055i<V> extends AbstractFuture<V> implements InterfaceC3054h<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, p149l.gnr
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
    public static final class C3050d {

        /* JADX INFO: renamed from: d */
        public static final C3050d f11331d = new C3050d();

        /* JADX INFO: renamed from: a */
        public final Runnable f11332a;

        /* JADX INFO: renamed from: b */
        public final Executor f11333b;

        /* JADX INFO: renamed from: c */
        public C3050d f11334c;

        public C3050d() {
            this.f11332a = null;
            this.f11333b = null;
        }

        public C3050d(Runnable runnable, Executor executor) {
            this.f11332a = runnable;
            this.f11333b = executor;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$k */
    public static final class C3057k {

        /* JADX INFO: renamed from: c */
        public static final C3057k f11348c = new C3057k(false);

        /* JADX INFO: renamed from: a */
        public volatile Thread f11349a;

        /* JADX INFO: renamed from: b */
        public volatile C3057k f11350b;

        public C3057k() {
            AbstractFuture.f11320f.mo16617g(this, Thread.currentThread());
        }

        /* JADX INFO: renamed from: a */
        public void m16619a(C3057k c3057k) {
            AbstractFuture.f11320f.mo16616f(this, c3057k);
        }

        /* JADX INFO: renamed from: b */
        public void m16620b() {
            Thread thread = this.f11349a;
            if (thread != null) {
                this.f11349a = null;
                LockSupport.unpark(thread);
            }
        }

        public C3057k(boolean z) {
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11322a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3052f))) {
                return m16607u(obj2);
            }
            C3057k c3057k = this.f11324c;
            if (c3057k != C3057k.f11348c) {
                C3057k c3057k2 = new C3057k();
                do {
                    c3057k2.m16619a(c3057k);
                    if (f11320f.mo16613c(this, c3057k, c3057k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11322a;
                            } else {
                                m16595B(c3057k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3052f))));
                        return m16607u(obj);
                    }
                    c3057k = this.f11324c;
                } while (c3057k != C3057k.f11348c);
            }
            Object obj3 = this.f11322a;
            Objects.requireNonNull(obj3);
            return m16607u(obj3);
        }
        throw new InterruptedException();
    }
}
