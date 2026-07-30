package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
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
import p149l.dzv0;
import p149l.fhv0;
import p149l.luu0;
import p149l.m5s0;
import p149l.zfv0;
import p149l.zkw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2401o<V> extends dzv0 implements fhv0<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f10362d;

    /* JADX INFO: renamed from: e */
    public static final zfv0 f10363e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2381e f10364f;

    /* JADX INFO: renamed from: g */
    public static final Object f10365g;

    /* JADX INFO: renamed from: a */
    public volatile Object f10366a;

    /* JADX INFO: renamed from: b */
    public volatile C2385g f10367b;

    /* JADX INFO: renamed from: c */
    public volatile C2399n f10368c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        AbstractC2381e c2391j;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f10362d = z;
        f10363e = new zfv0(AbstractC2401o.class);
        luu0 luu0Var = null;
        try {
            c2391j = new C2397m(luu0Var);
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = e;
                c2391j = new C2387h(AtomicReferenceFieldUpdater.newUpdater(C2399n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2399n.class, C2399n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2401o.class, C2399n.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2401o.class, C2385g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2401o.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e2) {
                th = e;
                th2 = e2;
                c2391j = new C2391j(luu0Var);
            }
        }
        f10364f = c2391j;
        if (th2 != null) {
            zfv0 zfv0Var = f10363e;
            Logger loggerM218623a = zfv0Var.m218623a();
            Level level = Level.SEVERE;
            loggerM218623a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zfv0Var.m218623a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f10365g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static Object m14887r(fhv0 fhv0Var) {
        Throwable thMo14892a;
        if (fhv0Var instanceof InterfaceC2393k) {
            Object c2383f = ((AbstractC2401o) fhv0Var).f10366a;
            if (c2383f instanceof C2383f) {
                C2383f c2383f2 = (C2383f) c2383f;
                if (c2383f2.f10319a) {
                    Throwable th = c2383f2.f10320b;
                    c2383f = th != null ? new C2383f(false, th) : C2383f.f10318d;
                }
            }
            Objects.requireNonNull(c2383f);
            return c2383f;
        }
        if ((fhv0Var instanceof dzv0) && (thMo14892a = ((dzv0) fhv0Var).mo14892a()) != null) {
            return new zzdy$zzc(thMo14892a);
        }
        boolean zIsCancelled = fhv0Var.isCancelled();
        if ((!f10362d) && zIsCancelled) {
            C2383f c2383f3 = C2383f.f10318d;
            Objects.requireNonNull(c2383f3);
            return c2383f3;
        }
        try {
            Object objM14888s = m14888s(fhv0Var);
            if (zIsCancelled) {
                return new C2383f(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(fhv0Var))));
            }
            return objM14888s == null ? f10365g : objM14888s;
        } catch (Error | Exception e) {
            return new zzdy$zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzdy$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(fhv0Var)), e2)) : new C2383f(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new C2383f(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(fhv0Var)), e3)) : new zzdy$zzc(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: s */
    public static Object m14888s(Future future) throws ExecutionException {
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
    public static void m14889w(AbstractC2401o abstractC2401o, boolean z) {
        C2385g c2385g = null;
        while (true) {
            for (C2399n c2399nMo14779b = f10364f.mo14779b(abstractC2401o, C2399n.f10359c); c2399nMo14779b != null; c2399nMo14779b = c2399nMo14779b.f10361b) {
                Thread thread = c2399nMo14779b.f10360a;
                if (thread != null) {
                    c2399nMo14779b.f10360a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC2401o.mo14895m();
            C2385g c2385g2 = c2385g;
            C2385g c2385gMo14778a = f10364f.mo14778a(abstractC2401o, C2385g.f10322d);
            C2385g c2385g3 = c2385g2;
            while (c2385gMo14778a != null) {
                C2385g c2385g4 = c2385gMo14778a.f10325c;
                c2385gMo14778a.f10325c = c2385g3;
                c2385g3 = c2385gMo14778a;
                c2385gMo14778a = c2385g4;
            }
            while (c2385g3 != null) {
                Runnable runnable = c2385g3.f10323a;
                C2385g c2385g5 = c2385g3.f10325c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2389i) {
                    RunnableC2389i runnableC2389i = (RunnableC2389i) runnable2;
                    abstractC2401o = runnableC2389i.f10345a;
                    if (abstractC2401o.f10366a == runnableC2389i) {
                        if (f10364f.mo14783f(abstractC2401o, runnableC2389i, m14887r(runnableC2389i.f10346b))) {
                            c2385g = c2385g5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c2385g3.f10324b;
                    Objects.requireNonNull(executor);
                    m14890x(runnable2, executor);
                }
                c2385g3 = c2385g5;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m14890x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f10363e.m218623a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final Object m14891z(Object obj) throws ExecutionException {
        if (obj instanceof C2383f) {
            Throwable th = ((C2383f) obj).f10320b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzdy$zzc) {
            throw new ExecutionException(((zzdy$zzc) obj).f10379a);
        }
        if (obj == f10365g) {
            return null;
        }
        return obj;
    }

    @Override // p149l.dzv0
    /* JADX INFO: renamed from: a */
    public final Throwable mo14892a() {
        if (!(this instanceof InterfaceC2393k)) {
            return null;
        }
        Object obj = this.f10366a;
        if (obj instanceof zzdy$zzc) {
            return ((zzdy$zzc) obj).f10379a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C2383f c2383f;
        Object obj = this.f10366a;
        if (!(obj instanceof RunnableC2389i) && !(obj == null)) {
            return false;
        }
        if (f10362d) {
            c2383f = new C2383f(z, new CancellationException("Future.cancel() was called."));
        } else {
            c2383f = z ? C2383f.f10317c : C2383f.f10318d;
            Objects.requireNonNull(c2383f);
        }
        boolean z2 = false;
        while (true) {
            if (f10364f.mo14783f(this, obj, c2383f)) {
                m14889w(this, z);
                if (obj instanceof RunnableC2389i) {
                    fhv0<? extends V> fhv0Var = ((RunnableC2389i) obj).f10346b;
                    if (fhv0Var instanceof InterfaceC2393k) {
                        this = (AbstractC2401o) fhv0Var;
                        obj = this.f10366a;
                        if (!(obj == null) && !(obj instanceof RunnableC2389i)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        fhv0Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f10366a;
            if (!(obj instanceof RunnableC2389i)) {
                return z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public String mo14893g() {
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
        Object obj = this.f10366a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof RunnableC2389i))) {
            return m14891z(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2399n c2399n = this.f10368c;
            if (c2399n != C2399n.f10359c) {
                C2399n c2399n2 = new C2399n();
                while (true) {
                    AbstractC2381e abstractC2381e = f10364f;
                    abstractC2381e.mo14780c(c2399n2, c2399n);
                    if (abstractC2381e.mo14784g(this, c2399n, c2399n2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m14903y(c2399n2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10366a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2389i))) {
                                return m14891z(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m14903y(c2399n2);
                        break;
                    }
                    c2399n = this.f10368c;
                    if (c2399n == C2399n.f10359c) {
                    }
                }
            }
            Object obj3 = this.f10366a;
            Objects.requireNonNull(obj3);
            return m14891z(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10366a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC2389i))) {
                return m14891z(obj4);
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
        zkw0.m219208a(strConcat, string);
        return null;
    }

    @Override // p149l.fhv0
    /* JADX INFO: renamed from: h */
    public final void mo14894h(Runnable runnable, Executor executor) {
        C2385g c2385g;
        m5s0.m153144c(executor, "Executor was null.");
        if (!isDone() && (c2385g = this.f10367b) != C2385g.f10322d) {
            C2385g c2385g2 = new C2385g(runnable, executor);
            do {
                c2385g2.f10325c = c2385g;
                if (f10364f.mo14782e(this, c2385g, c2385g2)) {
                    return;
                } else {
                    c2385g = this.f10367b;
                }
            } while (c2385g != C2385g.f10322d);
        }
        m14890x(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10366a instanceof C2383f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f10366a;
        return (obj != null) & (!(obj instanceof RunnableC2389i));
    }

    /* JADX INFO: renamed from: m */
    public void mo14895m() {
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14896n(Object obj) {
        if (obj == null) {
            obj = f10365g;
        }
        if (!f10364f.mo14783f(this, null, obj)) {
            return false;
        }
        m14889w(this, false);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m14897o(Throwable th) {
        if (!f10364f.mo14783f(this, null, new zzdy$zzc(th))) {
            return false;
        }
        m14889w(this, false);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m14898p(fhv0 fhv0Var) {
        zzdy$zzc zzdy_zzc;
        Object obj = this.f10366a;
        if (obj == null) {
            if (fhv0Var.isDone()) {
                if (!f10364f.mo14783f(this, null, m14887r(fhv0Var))) {
                    return false;
                }
                m14889w(this, false);
                return true;
            }
            RunnableC2389i runnableC2389i = new RunnableC2389i(this, fhv0Var);
            if (f10364f.mo14783f(this, null, runnableC2389i)) {
                try {
                    fhv0Var.mo14894h(runnableC2389i, zzed.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzdy_zzc = new zzdy$zzc(th);
                    } catch (Error | Exception unused) {
                        zzdy_zzc = zzdy$zzc.f10378b;
                    }
                    f10364f.mo14783f(this, runnableC2389i, zzdy_zzc);
                }
                return true;
            }
            obj = this.f10366a;
        }
        if (obj instanceof C2383f) {
            fhv0Var.cancel(((C2383f) obj).f10319a);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m14899q() {
        Object obj = this.f10366a;
        return (obj instanceof C2383f) && ((C2383f) obj).f10319a;
    }

    /* JADX INFO: renamed from: t */
    public final void m14900t(StringBuilder sb) {
        try {
            Object objM14888s = m14888s(this);
            sb.append("SUCCESS, result=[");
            if (objM14888s == null) {
                sb.append("null");
            } else if (objM14888s == this) {
                sb.append("this future");
            } else {
                sb.append(objM14888s.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM14888s)));
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
        if (this.f10366a instanceof C2383f) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m14900t(sb);
        } else {
            m14901u(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m14901u(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f10366a;
        if (obj instanceof RunnableC2389i) {
            sb.append(", setFuture=[");
            m14902v(sb, ((RunnableC2389i) obj).f10346b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                strConcat = mo14893g();
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
            m14900t(sb);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14902v(StringBuilder sb, Object obj) {
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
    public final void m14903y(C2399n c2399n) {
        c2399n.f10360a = null;
        while (true) {
            C2399n c2399n2 = this.f10368c;
            if (c2399n2 != C2399n.f10359c) {
                C2399n c2399n3 = null;
                while (c2399n2 != null) {
                    C2399n c2399n4 = c2399n2.f10361b;
                    if (c2399n2.f10360a != null) {
                        c2399n3 = c2399n2;
                    } else if (c2399n3 != null) {
                        c2399n3.f10361b = c2399n4;
                        if (c2399n3.f10360a == null) {
                        }
                    } else if (!f10364f.mo14784g(this, c2399n2, c2399n4)) {
                    }
                    c2399n2 = c2399n4;
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
            Object obj2 = this.f10366a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2389i))) {
                return m14891z(obj2);
            }
            C2399n c2399n = this.f10368c;
            if (c2399n != C2399n.f10359c) {
                C2399n c2399n2 = new C2399n();
                do {
                    AbstractC2381e abstractC2381e = f10364f;
                    abstractC2381e.mo14780c(c2399n2, c2399n);
                    if (abstractC2381e.mo14784g(this, c2399n, c2399n2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10366a;
                            } else {
                                m14903y(c2399n2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2389i))));
                        return m14891z(obj);
                    }
                    c2399n = this.f10368c;
                } while (c2399n != C2399n.f10359c);
            }
            Object obj3 = this.f10366a;
            Objects.requireNonNull(obj3);
            return m14891z(obj3);
        }
        throw new InterruptedException();
    }
}
