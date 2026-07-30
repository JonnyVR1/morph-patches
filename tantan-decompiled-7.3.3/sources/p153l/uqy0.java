package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.play_billing.C2407f0;
import com.p051p1.mobile.putong.core.data.H5PaymentOrderStatus;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public class uqy0 implements lqv0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f180541d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f180542e = Logger.getLogger(uqy0.class.getName());

    /* JADX INFO: renamed from: f */
    public static final dyv0 f180543f;

    /* JADX INFO: renamed from: g */
    public static final Object f180544g;

    /* JADX INFO: renamed from: a */
    @Nullable
    public volatile Object f180545a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public volatile hyx0 f180546b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public volatile sky0 f180547c;

    static {
        dyv0 ahy0Var;
        try {
            ahy0Var = new q8y0(AtomicReferenceFieldUpdater.newUpdater(sky0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(sky0.class, sky0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(uqy0.class, sky0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(uqy0.class, hyx0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(uqy0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            ahy0Var = new ahy0();
        }
        Throwable th2 = th;
        f180543f = ahy0Var;
        if (th2 != null) {
            f180542e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f180544g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m197438b(uqy0 uqy0Var) {
        sky0 sky0Var;
        hyx0 hyx0Var;
        do {
            sky0Var = uqy0Var.f180547c;
        } while (!f180543f.mo97945e(uqy0Var, sky0Var, sky0.f169339c));
        while (sky0Var != null) {
            Thread thread = sky0Var.f169340a;
            if (thread != null) {
                sky0Var.f169340a = null;
                LockSupport.unpark(thread);
            }
            sky0Var = sky0Var.f169341b;
        }
        do {
            hyx0Var = uqy0Var.f180546b;
        } while (!f180543f.mo97943c(uqy0Var, hyx0Var, hyx0.f112175d));
        hyx0 hyx0Var2 = null;
        while (hyx0Var != null) {
            hyx0 hyx0Var3 = hyx0Var.f112178c;
            hyx0Var.f112178c = hyx0Var2;
            hyx0Var2 = hyx0Var;
            hyx0Var = hyx0Var3;
        }
        while (hyx0Var2 != null) {
            Runnable runnable = hyx0Var2.f112176a;
            hyx0 hyx0Var4 = hyx0Var2.f112178c;
            if (runnable instanceof qdy0) {
                throw null;
            }
            m197439e(runnable, hyx0Var2.f112177b);
            hyx0Var2 = hyx0Var4;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m197439e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f180542e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Object m197440g(Object obj) throws ExecutionException {
        if (obj instanceof vqw0) {
            Throwable th = ((vqw0) obj).f185407a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2407f0) {
            throw new ExecutionException(((C2407f0) obj).f10358a);
        }
        if (obj == f180544g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo165053a() {
        if (this.f180545a instanceof qdy0) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: c */
    public boolean mo147936c(@Nullable Object obj) {
        if (obj == null) {
            obj = f180544g;
        }
        if (!f180543f.mo97944d(this, null, obj)) {
            return false;
        }
        m197438b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        vqw0 vqw0Var;
        Object obj = this.f180545a;
        if ((obj instanceof qdy0) | (obj == null)) {
            if (f180541d) {
                vqw0Var = new vqw0(z, new CancellationException("Future.cancel() was called."));
            } else {
                vqw0Var = z ? vqw0.f185405b : vqw0.f185406c;
            }
            while (!f180543f.mo97944d(this, obj, vqw0Var)) {
                obj = this.f180545a;
                if (!(obj instanceof qdy0)) {
                }
            }
            m197438b(this);
            if (obj instanceof qdy0) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m197441d(StringBuilder sb) {
        V v2;
        boolean z = false;
        while (true) {
            try {
                try {
                    v2 = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append(Constants.AES_SUFFIX);
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v2 == this ? "this future" : String.valueOf(v2));
        sb.append(Constants.AES_SUFFIX);
    }

    /* JADX INFO: renamed from: f */
    public final void m197442f(sky0 sky0Var) {
        sky0Var.f169340a = null;
        while (true) {
            sky0 sky0Var2 = this.f180547c;
            if (sky0Var2 != sky0.f169339c) {
                sky0 sky0Var3 = null;
                while (sky0Var2 != null) {
                    sky0 sky0Var4 = sky0Var2.f169341b;
                    if (sky0Var2.f169340a != null) {
                        sky0Var3 = sky0Var2;
                    } else if (sky0Var3 != null) {
                        sky0Var3.f169341b = sky0Var4;
                        if (sky0Var3.f169340a == null) {
                        }
                    } else if (!f180543f.mo97945e(this, sky0Var2, sky0Var4)) {
                    }
                    sky0Var2 = sky0Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f180545a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof qdy0))) {
            return m197440g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            sky0 sky0Var = this.f180547c;
            if (sky0Var != sky0.f169339c) {
                sky0 sky0Var2 = new sky0();
                while (true) {
                    dyv0 dyv0Var = f180543f;
                    dyv0Var.mo97941a(sky0Var2, sky0Var);
                    if (dyv0Var.mo97945e(this, sky0Var, sky0Var2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m197442f(sky0Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f180545a;
                            if ((obj2 != null) && (!(obj2 instanceof qdy0))) {
                                return m197440g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m197442f(sky0Var2);
                        break;
                    }
                    sky0Var = this.f180547c;
                    if (sky0Var == sky0.f169339c) {
                    }
                }
            }
            return m197440g(this.f180545a);
        }
        while (nanos > 0) {
            Object obj3 = this.f180545a;
            if ((obj3 != null) && (!(obj3 instanceof qdy0))) {
                return m197440g(obj3);
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
        executor.getClass();
        hyx0 hyx0Var = this.f180546b;
        if (hyx0Var != hyx0.f112175d) {
            hyx0 hyx0Var2 = new hyx0(runnable, executor);
            do {
                hyx0Var2.f112178c = hyx0Var;
                if (f180543f.mo97943c(this, hyx0Var, hyx0Var2)) {
                    return;
                } else {
                    hyx0Var = this.f180546b;
                }
            } while (hyx0Var != hyx0.f112175d);
        }
        m197439e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f180545a instanceof vqw0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f180545a;
        return (obj != null) & (!(obj instanceof qdy0));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f180545a instanceof vqw0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m197441d(sb);
        } else {
            try {
                strConcat = mo165053a();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(Constants.AES_SUFFIX);
            } else if (isDone()) {
                m197441d(sb);
            } else {
                sb.append(H5PaymentOrderStatus.PENDING);
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f180545a;
            if ((obj2 != null) & (!(obj2 instanceof qdy0))) {
                return m197440g(obj2);
            }
            sky0 sky0Var = this.f180547c;
            if (sky0Var != sky0.f169339c) {
                sky0 sky0Var2 = new sky0();
                do {
                    dyv0 dyv0Var = f180543f;
                    dyv0Var.mo97941a(sky0Var2, sky0Var);
                    if (dyv0Var.mo97945e(this, sky0Var, sky0Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f180545a;
                            } else {
                                m197442f(sky0Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof qdy0))));
                        return m197440g(obj);
                    }
                    sky0Var = this.f180547c;
                } while (sky0Var != sky0.f169339c);
            }
            return m197440g(this.f180545a);
        }
        throw new InterruptedException();
    }
}
