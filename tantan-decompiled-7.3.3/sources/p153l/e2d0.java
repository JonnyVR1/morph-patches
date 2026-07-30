package p153l;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.H5PaymentOrderStatus;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class e2d0<R> implements ndj<R>, l2d0<R> {

    /* JADX INFO: renamed from: k */
    private static final C16689a f91736k = new C16689a();

    /* JADX INFO: renamed from: a */
    private final int f91737a;

    /* JADX INFO: renamed from: b */
    private final int f91738b;

    /* JADX INFO: renamed from: c */
    private final boolean f91739c;

    /* JADX INFO: renamed from: d */
    private final C16689a f91740d;

    /* JADX INFO: renamed from: e */
    @Nullable
    @GuardedBy("this")
    private R f91741e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @GuardedBy("this")
    private y1d0 f91742f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    private boolean f91743g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    private boolean f91744h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    private boolean f91745i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy("this")
    private GlideException f91746j;

    /* JADX INFO: renamed from: l.e2d0$a */
    @VisibleForTesting
    public static class C16689a {
        /* JADX INFO: renamed from: a */
        public void m119083a(Object obj) {
            obj.notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m119084b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public e2d0(int i, int i2, boolean z, C16689a c16689a) {
        this.f91737a = i;
        this.f91738b = i2;
        this.f91739c = z;
        this.f91740d = c16689a;
    }

    /* JADX INFO: renamed from: m */
    private synchronized R m119080m(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f91739c && !isDone()) {
                ylk0.m216577a();
            }
            if (this.f91743g) {
                throw new CancellationException();
            }
            if (this.f91745i) {
                throw new ExecutionException(this.f91746j);
            }
            if (this.f91744h) {
                return this.f91741e;
            }
            if (l2 == null) {
                this.f91740d.m119084b(this, 0L);
            } else if (l2.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l2.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f91740d.m119084b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f91745i) {
                throw new ExecutionException(this.f91746j);
            }
            if (this.f91743g) {
                throw new CancellationException();
            }
            if (!this.f91744h) {
                throw new TimeoutException();
            }
            return this.f91741e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.l2d0
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo119081b(@Nullable GlideException glideException, Object obj, cli0<R> cli0Var, boolean z) {
        this.f91745i = true;
        this.f91746j = glideException;
        this.f91740d.m119083a(this);
        return false;
    }

    @Override // p153l.cli0
    @Nullable
    /* JADX INFO: renamed from: c */
    public synchronized y1d0 mo95327c() {
        return this.f91742f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f91743g = true;
                this.f91740d.m119083a(this);
                y1d0 y1d0Var = null;
                if (z) {
                    y1d0 y1d0Var2 = this.f91742f;
                    this.f91742f = null;
                    y1d0Var = y1d0Var2;
                }
                if (y1d0Var != null) {
                    y1d0Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.l2d0
    /* JADX INFO: renamed from: f */
    public synchronized boolean mo119082f(R r, Object obj, cli0<R> cli0Var, DataSource dataSource, boolean z) {
        this.f91744h = true;
        this.f91741e = r;
        this.f91740d.m119083a(this);
        return false;
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: g */
    public synchronized void mo95328g(@Nullable y1d0 y1d0Var) {
        this.f91742f = y1d0Var;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m119080m(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: i */
    public synchronized void mo104924i(@NonNull R r, @Nullable zgj0<? super R> zgj0Var) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f91743g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f91743g || this.f91744h || this.f91745i;
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: k */
    public void mo95330k(@NonNull hrf0 hrf0Var) {
        hrf0Var.mo5695d(this.f91737a, this.f91738b);
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: l */
    public synchronized void mo95331l(@Nullable Drawable drawable) {
    }

    public String toString() {
        y1d0 y1d0Var;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                y1d0Var = null;
                if (this.f91743g) {
                    str = "CANCELLED";
                } else if (this.f91745i) {
                    str = "FAILURE";
                } else if (this.f91744h) {
                    str = "SUCCESS";
                } else {
                    str = H5PaymentOrderStatus.PENDING;
                    y1d0Var = this.f91742f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (y1d0Var == null) {
            return str2 + str + Constants.AES_SUFFIX;
        }
        return str2 + str + ", request=[" + y1d0Var + "]]";
    }

    public e2d0(int i, int i2) {
        this(i, i2, true, f91736k);
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return m119080m(null);
        } catch (TimeoutException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    @Override // p153l.ier
    /* JADX INFO: renamed from: d */
    public void mo5633d() {
    }

    @Override // p153l.ier
    public void onDestroy() {
    }

    @Override // p153l.ier
    public void onStart() {
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: a */
    public void mo95326a(@NonNull hrf0 hrf0Var) {
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: e */
    public void mo104923e(@Nullable Drawable drawable) {
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: j */
    public void mo95329j(@Nullable Drawable drawable) {
    }
}
