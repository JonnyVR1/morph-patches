package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.gnr;
import p149l.qvc0;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a */
    public static final class C0201a<T> {

        /* JADX INFO: renamed from: a */
        public Object f977a;

        /* JADX INFO: renamed from: b */
        public C0203c<T> f978b;

        /* JADX INFO: renamed from: c */
        public qvc0<Void> f979c = qvc0.m176696a();

        /* JADX INFO: renamed from: d */
        public boolean f980d;

        /* JADX INFO: renamed from: a */
        public void m865a(@NonNull Runnable runnable, @NonNull Executor executor) {
            qvc0<Void> qvc0Var = this.f979c;
            if (qvc0Var != null) {
                qvc0Var.addListener(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m866b() {
            this.f977a = null;
            this.f978b = null;
            this.f979c.set(null);
        }

        /* JADX INFO: renamed from: c */
        public boolean m867c(T t) {
            this.f980d = true;
            C0203c<T> c0203c = this.f978b;
            boolean z = c0203c != null && c0203c.m873b(t);
            if (z) {
                m869e();
            }
            return z;
        }

        /* JADX INFO: renamed from: d */
        public boolean m868d() {
            this.f980d = true;
            C0203c<T> c0203c = this.f978b;
            boolean z = c0203c != null && c0203c.m872a(true);
            if (z) {
                m869e();
            }
            return z;
        }

        /* JADX INFO: renamed from: e */
        public final void m869e() {
            this.f977a = null;
            this.f978b = null;
            this.f979c = null;
        }

        /* JADX INFO: renamed from: f */
        public boolean m870f(@NonNull Throwable th) {
            this.f980d = true;
            C0203c<T> c0203c = this.f978b;
            boolean z = c0203c != null && c0203c.m874c(th);
            if (z) {
                m869e();
            }
            return z;
        }

        public void finalize() {
            qvc0<Void> qvc0Var;
            C0203c<T> c0203c = this.f978b;
            if (c0203c != null && !c0203c.isDone()) {
                c0203c.m874c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f977a));
            }
            if (this.f980d || (qvc0Var = this.f979c) == null) {
                return;
            }
            qvc0Var.set(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$b */
    public interface InterfaceC0202b<T> {
        @Nullable
        /* JADX INFO: renamed from: a */
        Object mo871a(@NonNull C0201a<T> c0201a) throws Exception;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> gnr<T> m864a(@NonNull InterfaceC0202b<T> interfaceC0202b) {
        C0201a<T> c0201a = new C0201a<>();
        C0203c<T> c0203c = new C0203c<>(c0201a);
        c0201a.f978b = c0203c;
        c0201a.f977a = interfaceC0202b.getClass();
        try {
            Object objMo871a = interfaceC0202b.mo871a(c0201a);
            if (objMo871a == null) {
                return c0203c;
            }
            c0201a.f977a = objMo871a;
            return c0203c;
        } catch (Exception e) {
            c0203c.m874c(e);
            return c0203c;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c */
    public static final class C0203c<T> implements gnr<T> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<C0201a<T>> f981a;

        /* JADX INFO: renamed from: b */
        public final AbstractResolvableFuture<T> f982b = new a();

        /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c$a */
        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                C0201a<T> c0201a = C0203c.this.f981a.get();
                if (c0201a == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c0201a.f977a + Constants.AES_SUFFIX;
            }
        }

        public C0203c(C0201a<T> c0201a) {
            this.f981a = new WeakReference<>(c0201a);
        }

        /* JADX INFO: renamed from: a */
        public boolean m872a(boolean z) {
            return this.f982b.cancel(z);
        }

        @Override // p149l.gnr
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f982b.addListener(runnable, executor);
        }

        /* JADX INFO: renamed from: b */
        public boolean m873b(T t) {
            return this.f982b.set(t);
        }

        /* JADX INFO: renamed from: c */
        public boolean m874c(Throwable th) {
            return this.f982b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C0201a<T> c0201a = this.f981a.get();
            boolean zCancel = this.f982b.cancel(z);
            if (zCancel && c0201a != null) {
                c0201a.m866b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f982b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f982b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f982b.isDone();
        }

        public String toString() {
            return this.f982b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f982b.get(j, timeUnit);
        }
    }
}
