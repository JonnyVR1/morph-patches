package com.google.android.gms.internal.ads;

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
import p149l.bnw0;
import p149l.gnr;
import p149l.nfw0;
import p149l.qmw0;
import p149l.yfw0;
import p149l.zkw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2204n3<V> extends bnw0 implements gnr<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f9998d;

    /* JADX INFO: renamed from: e */
    public static final qmw0 f9999e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2124d3 f10000f;

    /* JADX INFO: renamed from: g */
    public static final Object f10001g;

    /* JADX INFO: renamed from: a */
    public volatile Object f10002a;

    /* JADX INFO: renamed from: b */
    public volatile C2140f3 f10003b;

    /* JADX INFO: renamed from: c */
    public volatile C2196m3 f10004c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Throwable th;
        Throwable th2;
        AbstractC2124d3 c2164i3;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f9998d = z;
        f9999e = new qmw0(AbstractC2204n3.class);
        Object[] objArr = 0;
        try {
            c2164i3 = new C2188l3(null);
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = e;
                c2164i3 = new C2148g3(AtomicReferenceFieldUpdater.newUpdater(C2196m3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2196m3.class, C2196m3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2204n3.class, C2196m3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2204n3.class, C2140f3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2204n3.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e2) {
                th = e;
                th2 = e2;
                c2164i3 = new C2164i3(objArr == true ? 1 : 0);
            }
        }
        f10000f = c2164i3;
        if (th2 != null) {
            qmw0 qmw0Var = f9999e;
            Logger loggerM175582a = qmw0Var.m175582a();
            Level level = Level.SEVERE;
            loggerM175582a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            qmw0Var.m175582a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f10001g = new Object();
    }

    /* JADX INFO: renamed from: A */
    public static void m13003A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f9999e.m175582a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m13004b(Object obj) throws ExecutionException {
        if (obj instanceof C2132e3) {
            Throwable th = ((C2132e3) obj).f9885b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzgdb$zzc) {
            throw new ExecutionException(((zzgdb$zzc) obj).f10229a);
        }
        if (obj == f10001g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Object m13005g(gnr gnrVar) {
        Throwable thMo13018a;
        if (gnrVar instanceof InterfaceC2172j3) {
            Object c2132e3 = ((AbstractC2204n3) gnrVar).f10002a;
            if (c2132e3 instanceof C2132e3) {
                C2132e3 c2132e4 = (C2132e3) c2132e3;
                if (c2132e4.f9884a) {
                    Throwable th = c2132e4.f9885b;
                    c2132e3 = th != null ? new C2132e3(false, th) : C2132e3.f9883d;
                }
            }
            Objects.requireNonNull(c2132e3);
            return c2132e3;
        }
        if ((gnrVar instanceof bnw0) && (thMo13018a = ((bnw0) gnrVar).mo13018a()) != null) {
            return new zzgdb$zzc(thMo13018a);
        }
        boolean zIsCancelled = gnrVar.isCancelled();
        if ((!f9998d) && zIsCancelled) {
            C2132e3 c2132e5 = C2132e3.f9883d;
            Objects.requireNonNull(c2132e5);
            return c2132e5;
        }
        try {
            Object objM13006i = m13006i(gnrVar);
            if (zIsCancelled) {
                return new C2132e3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(gnrVar))));
            }
            return objM13006i == null ? f10001g : objM13006i;
        } catch (Error | Exception e) {
            return new zzgdb$zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzgdb$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(gnrVar)), e2)) : new C2132e3(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new C2132e3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(gnrVar)), e3)) : new zzgdb$zzc(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object m13006i(Future future) throws ExecutionException {
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

    /* JADX INFO: renamed from: z */
    public static void m13016z(AbstractC2204n3 abstractC2204n3, boolean z) {
        C2140f3 c2140f3 = null;
        while (true) {
            for (C2196m3 c2196m3Mo12642b = f10000f.mo12642b(abstractC2204n3, C2196m3.f9989c); c2196m3Mo12642b != null; c2196m3Mo12642b = c2196m3Mo12642b.f9991b) {
                Thread thread = c2196m3Mo12642b.f9990a;
                if (thread != null) {
                    c2196m3Mo12642b.f9990a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC2204n3.mo13023s();
            }
            abstractC2204n3.mo13020d();
            C2140f3 c2140f4 = c2140f3;
            C2140f3 c2140f3Mo12641a = f10000f.mo12641a(abstractC2204n3, C2140f3.f9887d);
            C2140f3 c2140f5 = c2140f4;
            while (c2140f3Mo12641a != null) {
                C2140f3 c2140f6 = c2140f3Mo12641a.f9890c;
                c2140f3Mo12641a.f9890c = c2140f5;
                c2140f5 = c2140f3Mo12641a;
                c2140f3Mo12641a = c2140f6;
            }
            while (c2140f5 != null) {
                c2140f3 = c2140f5.f9890c;
                Runnable runnable = c2140f5.f9888a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2156h3) {
                    RunnableC2156h3 runnableC2156h3 = (RunnableC2156h3) runnable2;
                    abstractC2204n3 = runnableC2156h3.f9915a;
                    if (abstractC2204n3.f10002a == runnableC2156h3) {
                        if (f10000f.mo12646f(abstractC2204n3, runnableC2156h3, m13005g(runnableC2156h3.f9916b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c2140f5.f9889b;
                    Objects.requireNonNull(executor);
                    m13003A(runnable2, executor);
                }
                c2140f5 = c2140f3;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13017B(C2196m3 c2196m3) {
        c2196m3.f9990a = null;
        while (true) {
            C2196m3 c2196m4 = this.f10004c;
            if (c2196m4 != C2196m3.f9989c) {
                C2196m3 c2196m5 = null;
                while (c2196m4 != null) {
                    C2196m3 c2196m6 = c2196m4.f9991b;
                    if (c2196m4.f9990a != null) {
                        c2196m5 = c2196m4;
                    } else if (c2196m5 != null) {
                        c2196m5.f9991b = c2196m6;
                        if (c2196m5.f9990a == null) {
                        }
                    } else if (!f10000f.mo12647g(this, c2196m4, c2196m6)) {
                    }
                    c2196m4 = c2196m6;
                }
                return;
            }
            return;
        }
    }

    @Override // p149l.bnw0
    /* JADX INFO: renamed from: a */
    public final Throwable mo13018a() {
        if (!(this instanceof InterfaceC2172j3)) {
            return null;
        }
        Object obj = this.f10002a;
        if (obj instanceof zzgdb$zzc) {
            return ((zzgdb$zzc) obj).f10229a;
        }
        return null;
    }

    @Override // p149l.gnr
    public void addListener(Runnable runnable, Executor executor) {
        C2140f3 c2140f3;
        nfw0.m159281c(runnable, "Runnable was null.");
        nfw0.m159281c(executor, "Executor was null.");
        if (!isDone() && (c2140f3 = this.f10003b) != C2140f3.f9887d) {
            C2140f3 c2140f4 = new C2140f3(runnable, executor);
            do {
                c2140f4.f9890c = c2140f3;
                if (f10000f.mo12645e(this, c2140f3, c2140f4)) {
                    return;
                } else {
                    c2140f3 = this.f10003b;
                }
            } while (c2140f3 != C2140f3.f9887d);
        }
        m13003A(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo13019c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C2132e3 c2132e3;
        Object obj = this.f10002a;
        if (!(obj instanceof RunnableC2156h3) && !(obj == null)) {
            return false;
        }
        if (f9998d) {
            c2132e3 = new C2132e3(z, new CancellationException("Future.cancel() was called."));
        } else {
            c2132e3 = z ? C2132e3.f9882c : C2132e3.f9883d;
            Objects.requireNonNull(c2132e3);
        }
        boolean z2 = false;
        while (true) {
            if (f10000f.mo12646f(this, obj, c2132e3)) {
                m13016z(this, z);
                if (obj instanceof RunnableC2156h3) {
                    gnr<? extends V> gnrVar = ((RunnableC2156h3) obj).f9916b;
                    if (gnrVar instanceof InterfaceC2172j3) {
                        this = (AbstractC2204n3) gnrVar;
                        obj = this.f10002a;
                        if (!(obj == null) && !(obj instanceof RunnableC2156h3)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        gnrVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f10002a;
            if (!(obj instanceof RunnableC2156h3)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo13020d() {
    }

    /* JADX INFO: renamed from: e */
    public boolean mo13021e(Object obj) {
        if (obj == null) {
            obj = f10001g;
        }
        if (!f10000f.mo12646f(this, null, obj)) {
            return false;
        }
        m13016z(this, false);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo13022f(Throwable th) {
        th.getClass();
        if (!f10000f.mo12646f(this, null, new zzgdb$zzc(th))) {
            return false;
        }
        m13016z(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10002a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof RunnableC2156h3))) {
            return m13004b(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2196m3 c2196m3 = this.f10004c;
            if (c2196m3 != C2196m3.f9989c) {
                C2196m3 c2196m4 = new C2196m3();
                while (true) {
                    AbstractC2124d3 abstractC2124d3 = f10000f;
                    abstractC2124d3.mo12643c(c2196m4, c2196m3);
                    if (abstractC2124d3.mo12647g(this, c2196m3, c2196m4)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m13017B(c2196m4);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10002a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2156h3))) {
                                return m13004b(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m13017B(c2196m4);
                        break;
                    }
                    c2196m3 = this.f10004c;
                    if (c2196m3 == C2196m3.f9989c) {
                    }
                }
            }
            Object obj3 = this.f10002a;
            Objects.requireNonNull(obj3);
            return m13004b(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10002a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC2156h3))) {
                return m13004b(obj4);
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

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10002a instanceof C2132e3;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f10002a;
        return (obj != null) & (!(obj instanceof RunnableC2156h3));
    }

    /* JADX INFO: renamed from: s */
    public void mo13023s() {
    }

    /* JADX INFO: renamed from: t */
    public final void m13024t(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m13026v());
        }
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
            m13027w(sb);
        } else {
            m13028x(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13025u(gnr gnrVar) {
        zzgdb$zzc zzgdb_zzc;
        gnrVar.getClass();
        Object obj = this.f10002a;
        if (obj == null) {
            if (gnrVar.isDone()) {
                if (!f10000f.mo12646f(this, null, m13005g(gnrVar))) {
                    return false;
                }
                m13016z(this, false);
                return true;
            }
            RunnableC2156h3 runnableC2156h3 = new RunnableC2156h3(this, gnrVar);
            if (f10000f.mo12646f(this, null, runnableC2156h3)) {
                try {
                    gnrVar.addListener(runnableC2156h3, zzgeb.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzgdb_zzc = new zzgdb$zzc(th);
                    } catch (Error | Exception unused) {
                        zzgdb_zzc = zzgdb$zzc.f10228b;
                    }
                    f10000f.mo12646f(this, runnableC2156h3, zzgdb_zzc);
                }
                return true;
            }
            obj = this.f10002a;
        }
        if (obj instanceof C2132e3) {
            gnrVar.cancel(((C2132e3) obj).f9884a);
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13026v() {
        Object obj = this.f10002a;
        return (obj instanceof C2132e3) && ((C2132e3) obj).f9884a;
    }

    /* JADX INFO: renamed from: w */
    public final void m13027w(StringBuilder sb) {
        try {
            Object objM13006i = m13006i(this);
            sb.append("SUCCESS, result=[");
            if (objM13006i == null) {
                sb.append("null");
            } else if (objM13006i == this) {
                sb.append("this future");
            } else {
                sb.append(objM13006i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM13006i)));
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

    /* JADX INFO: renamed from: x */
    public final void m13028x(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f10002a;
        if (obj instanceof RunnableC2156h3) {
            sb.append(", setFuture=[");
            m13029y(sb, ((RunnableC2156h3) obj).f9916b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                strConcat = yfw0.m214593a(mo13019c());
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
            m13027w(sb);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m13029y(StringBuilder sb, Object obj) {
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

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10002a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2156h3))) {
                return m13004b(obj2);
            }
            C2196m3 c2196m3 = this.f10004c;
            if (c2196m3 != C2196m3.f9989c) {
                C2196m3 c2196m4 = new C2196m3();
                do {
                    AbstractC2124d3 abstractC2124d3 = f10000f;
                    abstractC2124d3.mo12643c(c2196m4, c2196m3);
                    if (abstractC2124d3.mo12647g(this, c2196m3, c2196m4)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10002a;
                            } else {
                                m13017B(c2196m4);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2156h3))));
                        return m13004b(obj);
                    }
                    c2196m3 = this.f10004c;
                } while (c2196m3 != C2196m3.f9989c);
            }
            Object obj3 = this.f10002a;
            Objects.requireNonNull(obj3);
            return m13004b(obj3);
        }
        throw new InterruptedException();
    }
}
