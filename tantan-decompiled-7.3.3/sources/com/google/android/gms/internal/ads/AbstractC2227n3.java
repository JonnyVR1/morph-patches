package com.google.android.gms.internal.ads;

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
import p153l.epw0;
import p153l.fuw0;
import p153l.hpr;
import p153l.hww0;
import p153l.tow0;
import p153l.wvw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2227n3<V> extends hww0 implements hpr<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f10035d;

    /* JADX INFO: renamed from: e */
    public static final wvw0 f10036e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC2147d3 f10037f;

    /* JADX INFO: renamed from: g */
    public static final Object f10038g;

    /* JADX INFO: renamed from: a */
    public volatile Object f10039a;

    /* JADX INFO: renamed from: b */
    public volatile C2163f3 f10040b;

    /* JADX INFO: renamed from: c */
    public volatile C2219m3 f10041c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Throwable th;
        Throwable th2;
        AbstractC2147d3 c2187i3;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f10035d = z;
        f10036e = new wvw0(AbstractC2227n3.class);
        Object[] objArr = 0;
        try {
            c2187i3 = new C2211l3(null);
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = e;
                c2187i3 = new C2171g3(AtomicReferenceFieldUpdater.newUpdater(C2219m3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2219m3.class, C2219m3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2227n3.class, C2219m3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2227n3.class, C2163f3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2227n3.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e2) {
                th = e;
                th2 = e2;
                c2187i3 = new C2187i3(objArr == true ? 1 : 0);
            }
        }
        f10037f = c2187i3;
        if (th2 != null) {
            wvw0 wvw0Var = f10036e;
            Logger loggerM208109a = wvw0Var.m208109a();
            Level level = Level.SEVERE;
            loggerM208109a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            wvw0Var.m208109a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f10038g = new Object();
    }

    /* JADX INFO: renamed from: A */
    public static void m13057A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f10036e.m208109a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m13058b(Object obj) throws ExecutionException {
        if (obj instanceof C2155e3) {
            Throwable th = ((C2155e3) obj).f9922b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzgdb$zzc) {
            throw new ExecutionException(((zzgdb$zzc) obj).f10266a);
        }
        if (obj == f10038g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Object m13059g(hpr hprVar) {
        Throwable thMo13072a;
        if (hprVar instanceof InterfaceC2195j3) {
            Object c2155e3 = ((AbstractC2227n3) hprVar).f10039a;
            if (c2155e3 instanceof C2155e3) {
                C2155e3 c2155e4 = (C2155e3) c2155e3;
                if (c2155e4.f9921a) {
                    Throwable th = c2155e4.f9922b;
                    c2155e3 = th != null ? new C2155e3(false, th) : C2155e3.f9920d;
                }
            }
            Objects.requireNonNull(c2155e3);
            return c2155e3;
        }
        if ((hprVar instanceof hww0) && (thMo13072a = ((hww0) hprVar).mo13072a()) != null) {
            return new zzgdb$zzc(thMo13072a);
        }
        boolean zIsCancelled = hprVar.isCancelled();
        if ((!f10035d) && zIsCancelled) {
            C2155e3 c2155e5 = C2155e3.f9920d;
            Objects.requireNonNull(c2155e5);
            return c2155e5;
        }
        try {
            Object objM13060i = m13060i(hprVar);
            if (zIsCancelled) {
                return new C2155e3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(hprVar))));
            }
            return objM13060i == null ? f10038g : objM13060i;
        } catch (Error | Exception e) {
            return new zzgdb$zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzgdb$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(hprVar)), e2)) : new C2155e3(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new C2155e3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(hprVar)), e3)) : new zzgdb$zzc(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object m13060i(Future future) throws ExecutionException {
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
    public static void m13070z(AbstractC2227n3 abstractC2227n3, boolean z) {
        C2163f3 c2163f3 = null;
        while (true) {
            for (C2219m3 c2219m3Mo12696b = f10037f.mo12696b(abstractC2227n3, C2219m3.f10026c); c2219m3Mo12696b != null; c2219m3Mo12696b = c2219m3Mo12696b.f10028b) {
                Thread thread = c2219m3Mo12696b.f10027a;
                if (thread != null) {
                    c2219m3Mo12696b.f10027a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC2227n3.mo13077s();
            }
            abstractC2227n3.mo13074d();
            C2163f3 c2163f4 = c2163f3;
            C2163f3 c2163f3Mo12695a = f10037f.mo12695a(abstractC2227n3, C2163f3.f9924d);
            C2163f3 c2163f5 = c2163f4;
            while (c2163f3Mo12695a != null) {
                C2163f3 c2163f6 = c2163f3Mo12695a.f9927c;
                c2163f3Mo12695a.f9927c = c2163f5;
                c2163f5 = c2163f3Mo12695a;
                c2163f3Mo12695a = c2163f6;
            }
            while (c2163f5 != null) {
                c2163f3 = c2163f5.f9927c;
                Runnable runnable = c2163f5.f9925a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2179h3) {
                    RunnableC2179h3 runnableC2179h3 = (RunnableC2179h3) runnable2;
                    abstractC2227n3 = runnableC2179h3.f9952a;
                    if (abstractC2227n3.f10039a == runnableC2179h3) {
                        if (f10037f.mo12700f(abstractC2227n3, runnableC2179h3, m13059g(runnableC2179h3.f9953b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c2163f5.f9926b;
                    Objects.requireNonNull(executor);
                    m13057A(runnable2, executor);
                }
                c2163f5 = c2163f3;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13071B(C2219m3 c2219m3) {
        c2219m3.f10027a = null;
        while (true) {
            C2219m3 c2219m4 = this.f10041c;
            if (c2219m4 != C2219m3.f10026c) {
                C2219m3 c2219m5 = null;
                while (c2219m4 != null) {
                    C2219m3 c2219m6 = c2219m4.f10028b;
                    if (c2219m4.f10027a != null) {
                        c2219m5 = c2219m4;
                    } else if (c2219m5 != null) {
                        c2219m5.f10028b = c2219m6;
                        if (c2219m5.f10027a == null) {
                        }
                    } else if (!f10037f.mo12701g(this, c2219m4, c2219m6)) {
                    }
                    c2219m4 = c2219m6;
                }
                return;
            }
            return;
        }
    }

    @Override // p153l.hww0
    /* JADX INFO: renamed from: a */
    public final Throwable mo13072a() {
        if (!(this instanceof InterfaceC2195j3)) {
            return null;
        }
        Object obj = this.f10039a;
        if (obj instanceof zzgdb$zzc) {
            return ((zzgdb$zzc) obj).f10266a;
        }
        return null;
    }

    @Override // p153l.hpr
    public void addListener(Runnable runnable, Executor executor) {
        C2163f3 c2163f3;
        tow0.m192088c(runnable, "Runnable was null.");
        tow0.m192088c(executor, "Executor was null.");
        if (!isDone() && (c2163f3 = this.f10040b) != C2163f3.f9924d) {
            C2163f3 c2163f4 = new C2163f3(runnable, executor);
            do {
                c2163f4.f9927c = c2163f3;
                if (f10037f.mo12699e(this, c2163f3, c2163f4)) {
                    return;
                } else {
                    c2163f3 = this.f10040b;
                }
            } while (c2163f3 != C2163f3.f9924d);
        }
        m13057A(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo13073c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C2155e3 c2155e3;
        Object obj = this.f10039a;
        if (!(obj instanceof RunnableC2179h3) && !(obj == null)) {
            return false;
        }
        if (f10035d) {
            c2155e3 = new C2155e3(z, new CancellationException("Future.cancel() was called."));
        } else {
            c2155e3 = z ? C2155e3.f9919c : C2155e3.f9920d;
            Objects.requireNonNull(c2155e3);
        }
        boolean z2 = false;
        while (true) {
            if (f10037f.mo12700f(this, obj, c2155e3)) {
                m13070z(this, z);
                if (obj instanceof RunnableC2179h3) {
                    hpr<? extends V> hprVar = ((RunnableC2179h3) obj).f9953b;
                    if (hprVar instanceof InterfaceC2195j3) {
                        this = (AbstractC2227n3) hprVar;
                        obj = this.f10039a;
                        if (!(obj == null) && !(obj instanceof RunnableC2179h3)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        hprVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f10039a;
            if (!(obj instanceof RunnableC2179h3)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo13074d() {
    }

    /* JADX INFO: renamed from: e */
    public boolean mo13075e(Object obj) {
        if (obj == null) {
            obj = f10038g;
        }
        if (!f10037f.mo12700f(this, null, obj)) {
            return false;
        }
        m13070z(this, false);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo13076f(Throwable th) {
        th.getClass();
        if (!f10037f.mo12700f(this, null, new zzgdb$zzc(th))) {
            return false;
        }
        m13070z(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10039a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof RunnableC2179h3))) {
            return m13058b(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2219m3 c2219m3 = this.f10041c;
            if (c2219m3 != C2219m3.f10026c) {
                C2219m3 c2219m4 = new C2219m3();
                while (true) {
                    AbstractC2147d3 abstractC2147d3 = f10037f;
                    abstractC2147d3.mo12697c(c2219m4, c2219m3);
                    if (abstractC2147d3.mo12701g(this, c2219m3, c2219m4)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m13071B(c2219m4);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10039a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2179h3))) {
                                return m13058b(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m13071B(c2219m4);
                        break;
                    }
                    c2219m3 = this.f10041c;
                    if (c2219m3 == C2219m3.f10026c) {
                    }
                }
            }
            Object obj3 = this.f10039a;
            Objects.requireNonNull(obj3);
            return m13058b(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10039a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC2179h3))) {
                return m13058b(obj4);
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

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10039a instanceof C2155e3;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f10039a;
        return (obj != null) & (!(obj instanceof RunnableC2179h3));
    }

    /* JADX INFO: renamed from: s */
    public void mo13077s() {
    }

    /* JADX INFO: renamed from: t */
    public final void m13078t(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m13080v());
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
            m13081w(sb);
        } else {
            m13082x(sb);
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13079u(hpr hprVar) {
        zzgdb$zzc zzgdb_zzc;
        hprVar.getClass();
        Object obj = this.f10039a;
        if (obj == null) {
            if (hprVar.isDone()) {
                if (!f10037f.mo12700f(this, null, m13059g(hprVar))) {
                    return false;
                }
                m13070z(this, false);
                return true;
            }
            RunnableC2179h3 runnableC2179h3 = new RunnableC2179h3(this, hprVar);
            if (f10037f.mo12700f(this, null, runnableC2179h3)) {
                try {
                    hprVar.addListener(runnableC2179h3, zzgeb.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzgdb_zzc = new zzgdb$zzc(th);
                    } catch (Error | Exception unused) {
                        zzgdb_zzc = zzgdb$zzc.f10265b;
                    }
                    f10037f.mo12700f(this, runnableC2179h3, zzgdb_zzc);
                }
                return true;
            }
            obj = this.f10039a;
        }
        if (obj instanceof C2155e3) {
            hprVar.cancel(((C2155e3) obj).f9921a);
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13080v() {
        Object obj = this.f10039a;
        return (obj instanceof C2155e3) && ((C2155e3) obj).f9921a;
    }

    /* JADX INFO: renamed from: w */
    public final void m13081w(StringBuilder sb) {
        try {
            Object objM13060i = m13060i(this);
            sb.append("SUCCESS, result=[");
            if (objM13060i == null) {
                sb.append("null");
            } else if (objM13060i == this) {
                sb.append("this future");
            } else {
                sb.append(objM13060i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM13060i)));
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
    public final void m13082x(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append(H5PaymentOrderStatus.PENDING);
        Object obj = this.f10039a;
        if (obj instanceof RunnableC2179h3) {
            sb.append(", setFuture=[");
            m13083y(sb, ((RunnableC2179h3) obj).f9953b);
            sb.append(Constants.AES_SUFFIX);
        } else {
            try {
                strConcat = epw0.m121872a(mo13073c());
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
            m13081w(sb);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m13083y(StringBuilder sb, Object obj) {
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
            Object obj2 = this.f10039a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2179h3))) {
                return m13058b(obj2);
            }
            C2219m3 c2219m3 = this.f10041c;
            if (c2219m3 != C2219m3.f10026c) {
                C2219m3 c2219m4 = new C2219m3();
                do {
                    AbstractC2147d3 abstractC2147d3 = f10037f;
                    abstractC2147d3.mo12697c(c2219m4, c2219m3);
                    if (abstractC2147d3.mo12701g(this, c2219m3, c2219m4)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10039a;
                            } else {
                                m13071B(c2219m4);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2179h3))));
                        return m13058b(obj);
                    }
                    c2219m3 = this.f10041c;
                } while (c2219m3 != C2219m3.f10026c);
            }
            Object obj3 = this.f10039a;
            Objects.requireNonNull(obj3);
            return m13058b(obj3);
        }
        throw new InterruptedException();
    }
}
