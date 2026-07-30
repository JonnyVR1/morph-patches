package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.H5PaymentOrderStatus;
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
import p153l.fpv0;
import p153l.fuw0;
import p153l.j8w0;
import p153l.lqv0;
import p153l.r3v0;
import p153l.ses0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2424o<V> extends j8w0 implements lqv0<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f10399d;

    /* JADX INFO: renamed from: e */
    public static final fpv0 f10400e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2404e f10401f;

    /* JADX INFO: renamed from: g */
    public static final Object f10402g;

    /* JADX INFO: renamed from: a */
    public volatile Object f10403a;

    /* JADX INFO: renamed from: b */
    public volatile C2408g f10404b;

    /* JADX INFO: renamed from: c */
    public volatile C2422n f10405c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        AbstractC2404e c2414j;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f10399d = z;
        f10400e = new fpv0(AbstractC2424o.class);
        r3v0 r3v0Var = null;
        try {
            c2414j = new C2420m(r3v0Var);
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = e;
                c2414j = new C2410h(AtomicReferenceFieldUpdater.newUpdater(C2422n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2422n.class, C2422n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2424o.class, C2422n.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2424o.class, C2408g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2424o.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e2) {
                th = e;
                th2 = e2;
                c2414j = new C2414j(r3v0Var);
            }
        }
        f10401f = c2414j;
        if (th2 != null) {
            fpv0 fpv0Var = f10400e;
            Logger loggerM126720a = fpv0Var.m126720a();
            Level level = Level.SEVERE;
            loggerM126720a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            fpv0Var.m126720a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f10402g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static Object m14941r(lqv0 lqv0Var) {
        Throwable thMo14946a;
        if (lqv0Var instanceof InterfaceC2416k) {
            Object c2406f = ((AbstractC2424o) lqv0Var).f10403a;
            if (c2406f instanceof C2406f) {
                C2406f c2406f2 = (C2406f) c2406f;
                if (c2406f2.f10356a) {
                    Throwable th = c2406f2.f10357b;
                    c2406f = th != null ? new C2406f(false, th) : C2406f.f10355d;
                }
            }
            Objects.requireNonNull(c2406f);
            return c2406f;
        }
        if ((lqv0Var instanceof j8w0) && (thMo14946a = ((j8w0) lqv0Var).mo14946a()) != null) {
            return new zzdy$zzc(thMo14946a);
        }
        boolean zIsCancelled = lqv0Var.isCancelled();
        if ((!f10399d) && zIsCancelled) {
            C2406f c2406f3 = C2406f.f10355d;
            Objects.requireNonNull(c2406f3);
            return c2406f3;
        }
        try {
            Object objM14942s = m14942s(lqv0Var);
            if (zIsCancelled) {
                return new C2406f(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(lqv0Var))));
            }
            return objM14942s == null ? f10402g : objM14942s;
        } catch (Error | Exception e) {
            return new zzdy$zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzdy$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(lqv0Var)), e2)) : new C2406f(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new C2406f(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(lqv0Var)), e3)) : new zzdy$zzc(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: s */
    public static Object m14942s(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public static void m14943w(AbstractC2424o abstractC2424o, boolean z) {
        C2408g c2408g = null;
        while (true) {
            for (C2422n c2422nMo14833b = f10401f.mo14833b(abstractC2424o, C2422n.f10396c); c2422nMo14833b != null; c2422nMo14833b = c2422nMo14833b.f10398b) {
                Thread thread = c2422nMo14833b.f10397a;
                if (thread != null) {
                    c2422nMo14833b.f10397a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC2424o.mo14949m();
            C2408g c2408g2 = c2408g;
            C2408g c2408gMo14832a = f10401f.mo14832a(abstractC2424o, C2408g.f10359d);
            C2408g c2408g3 = c2408g2;
            while (c2408gMo14832a != null) {
                C2408g c2408g4 = c2408gMo14832a.f10362c;
                c2408gMo14832a.f10362c = c2408g3;
                c2408g3 = c2408gMo14832a;
                c2408gMo14832a = c2408g4;
            }
            while (c2408g3 != null) {
                Runnable runnable = c2408g3.f10360a;
                C2408g c2408g5 = c2408g3.f10362c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2412i) {
                    RunnableC2412i runnableC2412i = (RunnableC2412i) runnable2;
                    abstractC2424o = runnableC2412i.f10382a;
                    if (abstractC2424o.f10403a == runnableC2412i) {
                        if (f10401f.mo14837f(abstractC2424o, runnableC2412i, m14941r(runnableC2412i.f10383b))) {
                            c2408g = c2408g5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c2408g3.f10361b;
                    Objects.requireNonNull(executor);
                    m14944x(runnable2, executor);
                }
                c2408g3 = c2408g5;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m14944x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f10400e.m126720a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final Object m14945z(Object obj) throws ExecutionException {
        if (obj instanceof C2406f) {
            Throwable th = ((C2406f) obj).f10357b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzdy$zzc) {
            throw new ExecutionException(((zzdy$zzc) obj).f10416a);
        }
        if (obj == f10402g) {
            return null;
        }
        return obj;
    }

    @Override // p153l.j8w0
    /* JADX INFO: renamed from: a */
    public final Throwable mo14946a() {
        if (!(this instanceof InterfaceC2416k)) {
            return null;
        }
        Object obj = this.f10403a;
        if (obj instanceof zzdy$zzc) {
            return ((zzdy$zzc) obj).f10416a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C2406f c2406f;
        Object obj = this.f10403a;
        if (!(obj instanceof RunnableC2412i) && !(obj == null)) {
            return false;
        }
        if (f10399d) {
            c2406f = new C2406f(z, new CancellationException("Future.cancel() was called."));
        } else {
            c2406f = z ? C2406f.f10354c : C2406f.f10355d;
            Objects.requireNonNull(c2406f);
        }
        boolean z2 = false;
        while (true) {
            if (f10401f.mo14837f(this, obj, c2406f)) {
                m14943w(this, z);
                if (obj instanceof RunnableC2412i) {
                    lqv0<? extends V> lqv0Var = ((RunnableC2412i) obj).f10383b;
                    if (lqv0Var instanceof InterfaceC2416k) {
                        this = (AbstractC2424o) lqv0Var;
                        obj = this.f10403a;
                        if (!(obj == null) && !(obj instanceof RunnableC2412i)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        lqv0Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f10403a;
            if (!(obj instanceof RunnableC2412i)) {
                return z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public String mo14947g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10403a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof RunnableC2412i))) {
            return m14945z(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2422n c2422n = this.f10405c;
            if (c2422n != C2422n.f10396c) {
                C2422n c2422n2 = new C2422n();
                while (true) {
                    AbstractC2404e abstractC2404e = f10401f;
                    abstractC2404e.mo14834c(c2422n2, c2422n);
                    if (abstractC2404e.mo14838g(this, c2422n, c2422n2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m14957y(c2422n2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10403a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2412i))) {
                                return m14945z(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m14957y(c2422n2);
                        break;
                    }
                    c2422n = this.f10405c;
                    if (c2422n == C2422n.f10396c) {
                    }
                }
            }
            Object obj3 = this.f10403a;
            Objects.requireNonNull(obj3);
            return m14945z(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10403a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC2412i))) {
                return m14945z(obj4);
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
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
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
        fuw0.m127549a(strConcat, string);
        return null;
    }

    @Override // p153l.lqv0
    /* JADX INFO: renamed from: h */
    public final void mo14948h(Runnable runnable, Executor executor) {
        C2408g c2408g;
        ses0.m185568c(executor, "Executor was null.");
        if (!isDone() && (c2408g = this.f10404b) != C2408g.f10359d) {
            C2408g c2408g2 = new C2408g(runnable, executor);
            do {
                c2408g2.f10362c = c2408g;
                if (f10401f.mo14836e(this, c2408g, c2408g2)) {
                    return;
                } else {
                    c2408g = this.f10404b;
                }
            } while (c2408g != C2408g.f10359d);
        }
        m14944x(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10403a instanceof C2406f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f10403a;
        return (obj != null) & (!(obj instanceof RunnableC2412i));
    }

    /* JADX INFO: renamed from: m */
    public void mo14949m() {
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14950n(Object obj) {
        if (obj == null) {
            obj = f10402g;
        }
        if (!f10401f.mo14837f(this, null, obj)) {
            return false;
        }
        m14943w(this, false);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m14951o(Throwable th) {
        if (!f10401f.mo14837f(this, null, new zzdy$zzc(th))) {
            return false;
        }
        m14943w(this, false);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m14952p(lqv0 lqv0Var) {
        zzdy$zzc zzdy_zzc;
        Object obj = this.f10403a;
        if (obj == null) {
            if (lqv0Var.isDone()) {
                if (!f10401f.mo14837f(this, null, m14941r(lqv0Var))) {
                    return false;
                }
                m14943w(this, false);
                return true;
            }
            RunnableC2412i runnableC2412i = new RunnableC2412i(this, lqv0Var);
            if (f10401f.mo14837f(this, null, runnableC2412i)) {
                try {
                    lqv0Var.mo14948h(runnableC2412i, zzed.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzdy_zzc = new zzdy$zzc(th);
                    } catch (Error | Exception unused) {
                        zzdy_zzc = zzdy$zzc.f10415b;
                    }
                    f10401f.mo14837f(this, runnableC2412i, zzdy_zzc);
                }
                return true;
            }
            obj = this.f10403a;
        }
        if (obj instanceof C2406f) {
            lqv0Var.cancel(((C2406f) obj).f10356a);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m14953q() {
        Object obj = this.f10403a;
        return (obj instanceof C2406f) && ((C2406f) obj).f10356a;
    }

    /* JADX INFO: renamed from: t */
    public final void m14954t(StringBuilder sb) {
        try {
            Object objM14942s = m14942s(this);
            sb.append("SUCCESS, result=[");
            if (objM14942s == null) {
                sb.append("null");
            } else if (objM14942s == this) {
                sb.append("this future");
            } else {
                sb.append(objM14942s.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM14942s)));
            }
            sb.append(Constants.AES_SUFFIX);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(Constants.AES_SUFFIX);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f10403a instanceof C2406f) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m14954t(sb);
        } else {
            m14955u(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m14955u(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f10403a;
        if (obj instanceof RunnableC2412i) {
            sb.append(", setFuture=[");
            m14956v(sb, ((RunnableC2412i) obj).f10383b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                strConcat = mo14947g();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Exception | StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append(Constants.AES_SUFFIX);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m14954t(sb);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14956v(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e) {
            e = e;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m14957y(C2422n c2422n) {
        c2422n.f10397a = null;
        while (true) {
            C2422n c2422n2 = this.f10405c;
            if (c2422n2 != C2422n.f10396c) {
                C2422n c2422n3 = null;
                while (c2422n2 != null) {
                    C2422n c2422n4 = c2422n2.f10398b;
                    if (c2422n2.f10397a != null) {
                        c2422n3 = c2422n2;
                    } else if (c2422n3 != null) {
                        c2422n3.f10398b = c2422n4;
                        if (c2422n3.f10397a == null) {
                        }
                    } else if (!f10401f.mo14838g(this, c2422n2, c2422n4)) {
                    }
                    c2422n2 = c2422n4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10403a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2412i))) {
                return m14945z(obj2);
            }
            C2422n c2422n = this.f10405c;
            if (c2422n != C2422n.f10396c) {
                C2422n c2422n2 = new C2422n();
                do {
                    AbstractC2404e abstractC2404e = f10401f;
                    abstractC2404e.mo14834c(c2422n2, c2422n);
                    if (abstractC2404e.mo14838g(this, c2422n, c2422n2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10403a;
                            } else {
                                m14957y(c2422n2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2412i))));
                        return m14945z(obj);
                    }
                    c2422n = this.f10405c;
                } while (c2422n != C2422n.f10396c);
            }
            Object obj3 = this.f10403a;
            Objects.requireNonNull(obj3);
            return m14945z(obj3);
        }
        throw new InterruptedException();
    }
}
