package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
import java.util.Locale;
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
import p149l.gnr;
import p149l.zkw0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractResolvableFuture<V> implements gnr<V> {
    static final AbstractC0194b ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;

    @Nullable
    volatile C0196d listeners;

    @Nullable
    volatile Object value;

    @Nullable
    volatile C0200h waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractResolvableFuture.class.getName());

    public static final class Failure {

        /* JADX INFO: renamed from: b */
        public static final Failure f957b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a */
        public final Throwable f958a;

        public Failure(Throwable th) {
            this.f958a = (Throwable) AbstractResolvableFuture.checkNotNull(th);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    public static abstract class AbstractC0194b {
        public AbstractC0194b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo857a(AbstractResolvableFuture<?> abstractResolvableFuture, C0196d c0196d, C0196d c0196d2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo858b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo859c(AbstractResolvableFuture<?> abstractResolvableFuture, C0200h c0200h, C0200h c0200h2);

        /* JADX INFO: renamed from: d */
        public abstract void mo860d(C0200h c0200h, C0200h c0200h2);

        /* JADX INFO: renamed from: e */
        public abstract void mo861e(C0200h c0200h, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    public static final class C0195c {

        /* JADX INFO: renamed from: c */
        public static final C0195c f959c;

        /* JADX INFO: renamed from: d */
        public static final C0195c f960d;

        /* JADX INFO: renamed from: a */
        public final boolean f961a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Throwable f962b;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                f960d = null;
                f959c = null;
            } else {
                f960d = new C0195c(false, null);
                f959c = new C0195c(true, null);
            }
        }

        public C0195c(boolean z, @Nullable Throwable th) {
            this.f961a = z;
            this.f962b = th;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    public static final class C0196d {

        /* JADX INFO: renamed from: d */
        public static final C0196d f963d = new C0196d(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f964a;

        /* JADX INFO: renamed from: b */
        public final Executor f965b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public C0196d f966c;

        public C0196d(Runnable runnable, Executor executor) {
            this.f964a = runnable;
            this.f965b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    public static final class C0197e extends AbstractC0194b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<C0200h, Thread> f967a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<C0200h, C0200h> f968b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0200h> f969c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0196d> f970d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f971e;

        public C0197e(AtomicReferenceFieldUpdater<C0200h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0200h, C0200h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0200h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0196d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f967a = atomicReferenceFieldUpdater;
            this.f968b = atomicReferenceFieldUpdater2;
            this.f969c = atomicReferenceFieldUpdater3;
            this.f970d = atomicReferenceFieldUpdater4;
            this.f971e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: a */
        public boolean mo857a(AbstractResolvableFuture<?> abstractResolvableFuture, C0196d c0196d, C0196d c0196d2) {
            return C21643z7.m217426a(this.f970d, abstractResolvableFuture, c0196d, c0196d2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: b */
        public boolean mo858b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            return C21643z7.m217426a(this.f971e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: c */
        public boolean mo859c(AbstractResolvableFuture<?> abstractResolvableFuture, C0200h c0200h, C0200h c0200h2) {
            return C21643z7.m217426a(this.f969c, abstractResolvableFuture, c0200h, c0200h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: d */
        public void mo860d(C0200h c0200h, C0200h c0200h2) {
            this.f968b.lazySet(c0200h, c0200h2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: e */
        public void mo861e(C0200h c0200h, Thread thread) {
            this.f967a.lazySet(c0200h, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    public static final class RunnableC0198f<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractResolvableFuture<V> f972a;

        /* JADX INFO: renamed from: b */
        public final gnr<? extends V> f973b;

        public RunnableC0198f(AbstractResolvableFuture<V> abstractResolvableFuture, gnr<? extends V> gnrVar) {
            this.f972a = abstractResolvableFuture;
            this.f973b = gnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f972a.value != this) {
                return;
            }
            if (AbstractResolvableFuture.ATOMIC_HELPER.mo858b(this.f972a, this, AbstractResolvableFuture.getFutureValue(this.f973b))) {
                AbstractResolvableFuture.complete(this.f972a);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    public static final class C0199g extends AbstractC0194b {
        public C0199g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: a */
        public boolean mo857a(AbstractResolvableFuture<?> abstractResolvableFuture, C0196d c0196d, C0196d c0196d2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.listeners != c0196d) {
                        return false;
                    }
                    abstractResolvableFuture.listeners = c0196d2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: b */
        public boolean mo858b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.value != obj) {
                        return false;
                    }
                    abstractResolvableFuture.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: c */
        public boolean mo859c(AbstractResolvableFuture<?> abstractResolvableFuture, C0200h c0200h, C0200h c0200h2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.waiters != c0200h) {
                        return false;
                    }
                    abstractResolvableFuture.waiters = c0200h2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: d */
        public void mo860d(C0200h c0200h, C0200h c0200h2) {
            c0200h.f976b = c0200h2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0194b
        /* JADX INFO: renamed from: e */
        public void mo861e(C0200h c0200h, Thread thread) {
            c0200h.f975a = thread;
        }
    }

    static {
        AbstractC0194b c0199g;
        try {
            c0199g = new C0197e(AtomicReferenceFieldUpdater.newUpdater(C0200h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0200h.class, C0200h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C0200h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C0196d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0199g = new C0199g();
        }
        ATOMIC_HELPER = c0199g;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
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

    private static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    private C0196d clearListeners(C0196d c0196d) {
        C0196d c0196d2;
        do {
            c0196d2 = this.listeners;
        } while (!ATOMIC_HELPER.mo857a(this, c0196d2, C0196d.f963d));
        while (true) {
            C0196d c0196d3 = c0196d;
            c0196d = c0196d2;
            if (c0196d == null) {
                return c0196d3;
            }
            c0196d2 = c0196d.f966c;
            c0196d.f966c = c0196d3;
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
    public static void complete(AbstractResolvableFuture<?> abstractResolvableFuture) {
        C0196d c0196d = null;
        while (true) {
            abstractResolvableFuture.releaseWaiters();
            abstractResolvableFuture.afterDone();
            C0196d c0196dClearListeners = abstractResolvableFuture.clearListeners(c0196d);
            while (c0196dClearListeners != null) {
                c0196d = c0196dClearListeners.f966c;
                Runnable runnable = c0196dClearListeners.f964a;
                if (runnable instanceof RunnableC0198f) {
                    RunnableC0198f runnableC0198f = (RunnableC0198f) runnable;
                    abstractResolvableFuture = runnableC0198f.f972a;
                    if (abstractResolvableFuture.value == runnableC0198f) {
                        if (ATOMIC_HELPER.mo858b(abstractResolvableFuture, runnableC0198f, getFutureValue(runnableC0198f.f973b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, c0196dClearListeners.f965b);
                }
                c0196dClearListeners = c0196d;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof C0195c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((C0195c) obj).f962b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f958a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(gnr<?> gnrVar) {
        if (gnrVar instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) gnrVar).value;
            if (!(obj instanceof C0195c)) {
                return obj;
            }
            C0195c c0195c = (C0195c) obj;
            if (c0195c.f961a) {
                return c0195c.f962b != null ? new C0195c(false, c0195c.f962b) : C0195c.f960d;
            }
            return obj;
        }
        boolean zIsCancelled = gnrVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return C0195c.f960d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(gnrVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C0195c(false, e);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + gnrVar, e));
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
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

    private void releaseWaiters() {
        C0200h c0200h;
        do {
            c0200h = this.waiters;
        } while (!ATOMIC_HELPER.mo859c(this, c0200h, C0200h.f974c));
        while (c0200h != null) {
            c0200h.m863b();
            c0200h = c0200h.f976b;
        }
    }

    private void removeWaiter(C0200h c0200h) {
        c0200h.f975a = null;
        while (true) {
            C0200h c0200h2 = this.waiters;
            if (c0200h2 == C0200h.f974c) {
                return;
            }
            C0200h c0200h3 = null;
            while (c0200h2 != null) {
                C0200h c0200h4 = c0200h2.f976b;
                if (c0200h2.f975a != null) {
                    c0200h3 = c0200h2;
                } else if (c0200h3 != null) {
                    c0200h3.f976b = c0200h4;
                    if (c0200h3.f975a == null) {
                    }
                } else if (!ATOMIC_HELPER.mo859c(this, c0200h2, c0200h4)) {
                }
                c0200h2 = c0200h4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        C0196d c0196d = this.listeners;
        if (c0196d != C0196d.f963d) {
            C0196d c0196d2 = new C0196d(runnable, executor);
            do {
                c0196d2.f966c = c0196d;
                if (ATOMIC_HELPER.mo857a(this, c0196d, c0196d2)) {
                    return;
                } else {
                    c0196d = this.listeners;
                }
            } while (c0196d != C0196d.f963d);
        }
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0195c c0195c;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof RunnableC0198f)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            c0195c = new C0195c(z, new CancellationException("Future.cancel() was called."));
        } else {
            c0195c = z ? C0195c.f959c : C0195c.f960d;
        }
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.mo858b(this, obj, c0195c)) {
                if (z) {
                    this.interruptTask();
                }
                complete(this);
                if (obj instanceof RunnableC0198f) {
                    gnr<? extends V> gnrVar = ((RunnableC0198f) obj).f973b;
                    if (gnrVar instanceof AbstractResolvableFuture) {
                        this = (AbstractResolvableFuture) gnrVar;
                        obj = this.value;
                        if ((obj == null) | (obj instanceof RunnableC0198f)) {
                            z2 = true;
                        }
                    } else {
                        gnrVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.value;
            if (!(obj instanceof RunnableC0198f)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof RunnableC0198f))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0200h c0200h = this.waiters;
            if (c0200h != C0200h.f974c) {
                C0200h c0200h2 = new C0200h();
                while (true) {
                    c0200h2.m862a(c0200h);
                    if (ATOMIC_HELPER.mo859c(this, c0200h, c0200h2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(c0200h2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0198f))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(c0200h2);
                        break;
                    }
                    c0200h = this.waiters;
                    if (c0200h == C0200h.f974c) {
                    }
                }
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC0198f))) {
                return getDoneValue(obj3);
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
        String strConcat = "Waited " + j + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(Constants.SEPARATOR_COMMA);
                }
                strConcat2 = strConcat3.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        zkw0.m219208a(strConcat, string);
        return null;
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C0195c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof RunnableC0198f)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof RunnableC0198f) {
            return "setFuture=[" + userObjectToString(((RunnableC0198f) obj).f973b) + Constants.AES_SUFFIX;
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
    public boolean set(@Nullable V v2) {
        if (v2 == null) {
            v2 = (V) NULL;
        }
        if (!ATOMIC_HELPER.mo858b(this, null, v2)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.mo858b(this, null, new Failure((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(gnr<? extends V> gnrVar) {
        Failure failure;
        checkNotNull(gnrVar);
        Object obj = this.value;
        if (obj == null) {
            if (gnrVar.isDone()) {
                if (!ATOMIC_HELPER.mo858b(this, null, getFutureValue(gnrVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            RunnableC0198f runnableC0198f = new RunnableC0198f(this, gnrVar);
            if (ATOMIC_HELPER.mo858b(this, null, runnableC0198f)) {
                try {
                    gnrVar.addListener(runnableC0198f, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f957b;
                    }
                    ATOMIC_HELPER.mo858b(this, runnableC0198f, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof C0195c) {
            gnrVar.cancel(((C0195c) obj).f961a);
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append(Constants.AES_SUFFIX);
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append(H5PaymentOrderStatus.PENDING);
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof C0195c) && ((C0195c) obj).f961a;
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$h */
    public static final class C0200h {

        /* JADX INFO: renamed from: c */
        public static final C0200h f974c = new C0200h(false);

        /* JADX INFO: renamed from: a */
        @Nullable
        public volatile Thread f975a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public volatile C0200h f976b;

        public C0200h() {
            AbstractResolvableFuture.ATOMIC_HELPER.mo861e(this, Thread.currentThread());
        }

        /* JADX INFO: renamed from: a */
        public void m862a(C0200h c0200h) {
            AbstractResolvableFuture.ATOMIC_HELPER.mo860d(this, c0200h);
        }

        /* JADX INFO: renamed from: b */
        public void m863b() {
            Thread thread = this.f975a;
            if (thread != null) {
                this.f975a = null;
                LockSupport.unpark(thread);
            }
        }

        public C0200h(boolean z) {
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0198f))) {
                return getDoneValue(obj2);
            }
            C0200h c0200h = this.waiters;
            if (c0200h != C0200h.f974c) {
                C0200h c0200h2 = new C0200h();
                do {
                    c0200h2.m862a(c0200h);
                    if (ATOMIC_HELPER.mo859c(this, c0200h, c0200h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(c0200h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0198f))));
                        return getDoneValue(obj);
                    }
                    c0200h = this.waiters;
                } while (c0200h != C0200h.f974c);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }
}
