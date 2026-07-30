package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.play_billing.C2384f0;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
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
public class ohy0 implements fhv0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f144071d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f144072e = Logger.getLogger(ohy0.class.getName());

    /* JADX INFO: renamed from: f */
    public static final xov0 f144073f;

    /* JADX INFO: renamed from: g */
    public static final Object f144074g;

    /* JADX INFO: renamed from: a */
    @Nullable
    public volatile Object f144075a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public volatile bpx0 f144076b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public volatile mby0 f144077c;

    static {
        xov0 u7y0Var;
        try {
            u7y0Var = new kzx0(AtomicReferenceFieldUpdater.newUpdater(mby0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(mby0.class, mby0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ohy0.class, mby0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ohy0.class, bpx0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ohy0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            u7y0Var = new u7y0();
        }
        Throwable th2 = th;
        f144073f = u7y0Var;
        if (th2 != null) {
            f144072e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f144074g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m164487b(ohy0 ohy0Var) {
        mby0 mby0Var;
        bpx0 bpx0Var;
        do {
            mby0Var = ohy0Var.f144077c;
        } while (!f144073f.mo147962e(ohy0Var, mby0Var, mby0.f133068c));
        while (mby0Var != null) {
            Thread thread = mby0Var.f133069a;
            if (thread != null) {
                mby0Var.f133069a = null;
                LockSupport.unpark(thread);
            }
            mby0Var = mby0Var.f133070b;
        }
        do {
            bpx0Var = ohy0Var.f144076b;
        } while (!f144073f.mo147960c(ohy0Var, bpx0Var, bpx0.f76683d));
        bpx0 bpx0Var2 = null;
        while (bpx0Var != null) {
            bpx0 bpx0Var3 = bpx0Var.f76686c;
            bpx0Var.f76686c = bpx0Var2;
            bpx0Var2 = bpx0Var;
            bpx0Var = bpx0Var3;
        }
        while (bpx0Var2 != null) {
            Runnable runnable = bpx0Var2.f76684a;
            bpx0 bpx0Var4 = bpx0Var2.f76686c;
            if (runnable instanceof k4y0) {
                throw null;
            }
            m164488e(runnable, bpx0Var2.f76685b);
            bpx0Var2 = bpx0Var4;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m164488e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f144072e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Object m164489g(Object obj) throws ExecutionException {
        if (obj instanceof phw0) {
            Throwable th = ((phw0) obj).f149063a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2384f0) {
            throw new ExecutionException(((C2384f0) obj).f10321a);
        }
        if (obj == f144074g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo132030a() {
        if (this.f144075a instanceof k4y0) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: c */
    public boolean mo117967c(@Nullable Object obj) {
        if (obj == null) {
            obj = f144074g;
        }
        if (!f144073f.mo147961d(this, null, obj)) {
            return false;
        }
        m164487b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        phw0 phw0Var;
        Object obj = this.f144075a;
        if ((obj instanceof k4y0) | (obj == null)) {
            if (f144071d) {
                phw0Var = new phw0(z, new CancellationException("Future.cancel() was called."));
            } else {
                phw0Var = z ? phw0.f149061b : phw0.f149062c;
            }
            while (!f144073f.mo147961d(this, obj, phw0Var)) {
                obj = this.f144075a;
                if (!(obj instanceof k4y0)) {
                }
            }
            m164487b(this);
            if (obj instanceof k4y0) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m164490d(StringBuilder sb) {
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
    public final void m164491f(mby0 mby0Var) {
        mby0Var.f133069a = null;
        while (true) {
            mby0 mby0Var2 = this.f144077c;
            if (mby0Var2 != mby0.f133068c) {
                mby0 mby0Var3 = null;
                while (mby0Var2 != null) {
                    mby0 mby0Var4 = mby0Var2.f133070b;
                    if (mby0Var2.f133069a != null) {
                        mby0Var3 = mby0Var2;
                    } else if (mby0Var3 != null) {
                        mby0Var3.f133070b = mby0Var4;
                        if (mby0Var3.f133069a == null) {
                        }
                    } else if (!f144073f.mo147962e(this, mby0Var2, mby0Var4)) {
                    }
                    mby0Var2 = mby0Var4;
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
        Object obj = this.f144075a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof k4y0))) {
            return m164489g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            mby0 mby0Var = this.f144077c;
            if (mby0Var != mby0.f133068c) {
                mby0 mby0Var2 = new mby0();
                while (true) {
                    xov0 xov0Var = f144073f;
                    xov0Var.mo147958a(mby0Var2, mby0Var);
                    if (xov0Var.mo147962e(this, mby0Var, mby0Var2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m164491f(mby0Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f144075a;
                            if ((obj2 != null) && (!(obj2 instanceof k4y0))) {
                                return m164489g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m164491f(mby0Var2);
                        break;
                    }
                    mby0Var = this.f144077c;
                    if (mby0Var == mby0.f133068c) {
                    }
                }
            }
            return m164489g(this.f144075a);
        }
        while (nanos > 0) {
            Object obj3 = this.f144075a;
            if ((obj3 != null) && (!(obj3 instanceof k4y0))) {
                return m164489g(obj3);
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
        executor.getClass();
        bpx0 bpx0Var = this.f144076b;
        if (bpx0Var != bpx0.f76683d) {
            bpx0 bpx0Var2 = new bpx0(runnable, executor);
            do {
                bpx0Var2.f76686c = bpx0Var;
                if (f144073f.mo147960c(this, bpx0Var, bpx0Var2)) {
                    return;
                } else {
                    bpx0Var = this.f144076b;
                }
            } while (bpx0Var != bpx0.f76683d);
        }
        m164488e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f144075a instanceof phw0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f144075a;
        return (obj != null) & (!(obj instanceof k4y0));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f144075a instanceof phw0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m164490d(sb);
        } else {
            try {
                strConcat = mo132030a();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(Constants.AES_SUFFIX);
            } else if (isDone()) {
                m164490d(sb);
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
            Object obj2 = this.f144075a;
            if ((obj2 != null) & (!(obj2 instanceof k4y0))) {
                return m164489g(obj2);
            }
            mby0 mby0Var = this.f144077c;
            if (mby0Var != mby0.f133068c) {
                mby0 mby0Var2 = new mby0();
                do {
                    xov0 xov0Var = f144073f;
                    xov0Var.mo147958a(mby0Var2, mby0Var);
                    if (xov0Var.mo147962e(this, mby0Var, mby0Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f144075a;
                            } else {
                                m164491f(mby0Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k4y0))));
                        return m164489g(obj);
                    }
                    mby0Var = this.f144077c;
                } while (mby0Var != mby0.f133068c);
            }
            return m164489g(this.f144075a);
        }
        throw new InterruptedException();
    }
}
