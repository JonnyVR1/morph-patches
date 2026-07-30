package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p153l.hpr;
import p153l.t3d0;

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
    public static final class C0202a<T> {

        /* JADX INFO: renamed from: a */
        public Object f977a;

        /* JADX INFO: renamed from: b */
        public C0204c<T> f978b;

        /* JADX INFO: renamed from: c */
        public t3d0<Void> f979c = t3d0.m189082a();

        /* JADX INFO: renamed from: d */
        public boolean f980d;

        /* JADX INFO: renamed from: a */
        public void m866a(@NonNull Runnable runnable, @NonNull Executor executor) {
            t3d0<Void> t3d0Var = this.f979c;
            if (t3d0Var != null) {
                t3d0Var.addListener(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m867b() {
            this.f977a = null;
            this.f978b = null;
            this.f979c.set(null);
        }

        /* JADX INFO: renamed from: c */
        public boolean m868c(T t) {
            this.f980d = true;
            C0204c<T> c0204c = this.f978b;
            boolean z = c0204c != null && c0204c.m874b(t);
            if (z) {
                m870e();
            }
            return z;
        }

        /* JADX INFO: renamed from: d */
        public boolean m869d() {
            this.f980d = true;
            C0204c<T> c0204c = this.f978b;
            boolean z = c0204c != null && c0204c.m873a(true);
            if (z) {
                m870e();
            }
            return z;
        }

        /* JADX INFO: renamed from: e */
        public final void m870e() {
            this.f977a = null;
            this.f978b = null;
            this.f979c = null;
        }

        /* JADX INFO: renamed from: f */
        public boolean m871f(@NonNull Throwable th) {
            this.f980d = true;
            C0204c<T> c0204c = this.f978b;
            boolean z = c0204c != null && c0204c.m875c(th);
            if (z) {
                m870e();
            }
            return z;
        }

        public void finalize() {
            t3d0<Void> t3d0Var;
            C0204c<T> c0204c = this.f978b;
            if (c0204c != null && !c0204c.isDone()) {
                c0204c.m875c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f977a));
            }
            if (this.f980d || (t3d0Var = this.f979c) == null) {
                return;
            }
            t3d0Var.set(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$b */
    public interface InterfaceC0203b<T> {
        @Nullable
        /* JADX INFO: renamed from: a */
        Object mo872a(@NonNull C0202a<T> c0202a) throws Exception;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> hpr<T> m865a(@NonNull InterfaceC0203b<T> interfaceC0203b) {
        C0202a<T> c0202a = new C0202a<>();
        C0204c<T> c0204c = new C0204c<>(c0202a);
        c0202a.f978b = c0204c;
        c0202a.f977a = interfaceC0203b.getClass();
        try {
            Object objMo872a = interfaceC0203b.mo872a(c0202a);
            if (objMo872a == null) {
                return c0204c;
            }
            c0202a.f977a = objMo872a;
            return c0204c;
        } catch (Exception e) {
            c0204c.m875c(e);
            return c0204c;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c */
    public static final class C0204c<T> implements hpr<T> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<C0202a<T>> f981a;

        /* JADX INFO: renamed from: b */
        public final AbstractResolvableFuture<T> f982b = new a();

        /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c$a */
        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                C0202a<T> c0202a = C0204c.this.f981a.get();
                if (c0202a == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c0202a.f977a + Constants.AES_SUFFIX;
            }
        }

        public C0204c(C0202a<T> c0202a) {
            this.f981a = new WeakReference<>(c0202a);
        }

        /* JADX INFO: renamed from: a */
        public boolean m873a(boolean z) {
            return this.f982b.cancel(z);
        }

        @Override // p153l.hpr
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f982b.addListener(runnable, executor);
        }

        /* JADX INFO: renamed from: b */
        public boolean m874b(T t) {
            return this.f982b.set(t);
        }

        /* JADX INFO: renamed from: c */
        public boolean m875c(Throwable th) {
            return this.f982b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C0202a<T> c0202a = this.f981a.get();
            boolean zCancel = this.f982b.cancel(z);
            if (zCancel && c0202a != null) {
                c0202a.m867b();
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
