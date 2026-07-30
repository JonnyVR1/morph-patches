package p149l;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class buc0<R> implements taj<R>, iuc0<R> {

    /* JADX INFO: renamed from: k */
    private static final C15975a f77295k = new C15975a();

    /* JADX INFO: renamed from: a */
    private final int f77296a;

    /* JADX INFO: renamed from: b */
    private final int f77297b;

    /* JADX INFO: renamed from: c */
    private final boolean f77298c;

    /* JADX INFO: renamed from: d */
    private final C15975a f77299d;

    /* JADX INFO: renamed from: e */
    @Nullable
    @GuardedBy("this")
    private R f77300e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @GuardedBy("this")
    private ttc0 f77301f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    private boolean f77302g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    private boolean f77303h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    private boolean f77304i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy("this")
    private GlideException f77305j;

    /* JADX INFO: renamed from: l.buc0$a */
    @VisibleForTesting
    public static class C15975a {
        /* JADX INFO: renamed from: a */
        public void m103917a(Object obj) {
            obj.notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m103918b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public buc0(int i, int i2, boolean z, C15975a c15975a) {
        this.f77296a = i;
        this.f77297b = i2;
        this.f77298c = z;
        this.f77299d = c15975a;
    }

    /* JADX INFO: renamed from: m */
    private synchronized R m103906m(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f77298c && !isDone()) {
                sck0.m183401a();
            }
            if (this.f77302g) {
                throw new CancellationException();
            }
            if (this.f77304i) {
                throw new ExecutionException(this.f77305j);
            }
            if (this.f77303h) {
                return this.f77300e;
            }
            if (l2 == null) {
                this.f77299d.m103918b(this, 0L);
            } else if (l2.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l2.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f77299d.m103918b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f77304i) {
                throw new ExecutionException(this.f77305j);
            }
            if (this.f77302g) {
                throw new CancellationException();
            }
            if (!this.f77303h) {
                throw new TimeoutException();
            }
            return this.f77300e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.iuc0
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo103908b(@Nullable GlideException glideException, Object obj, cci0<R> cci0Var, boolean z) {
        this.f77304i = true;
        this.f77305j = glideException;
        this.f77299d.m103917a(this);
        return false;
    }

    @Override // p149l.cci0
    @Nullable
    /* JADX INFO: renamed from: c */
    public synchronized ttc0 mo103909c() {
        return this.f77301f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f77302g = true;
                this.f77299d.m103917a(this);
                ttc0 ttc0Var = null;
                if (z) {
                    ttc0 ttc0Var2 = this.f77301f;
                    this.f77301f = null;
                    ttc0Var = ttc0Var2;
                }
                if (ttc0Var != null) {
                    ttc0Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.iuc0
    /* JADX INFO: renamed from: f */
    public synchronized boolean mo103911f(R r, Object obj, cci0<R> cci0Var, DataSource dataSource, boolean z) {
        this.f77303h = true;
        this.f77300e = r;
        this.f77299d.m103917a(this);
        return false;
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: g */
    public synchronized void mo103912g(@Nullable ttc0 ttc0Var) {
        this.f77301f = ttc0Var;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m103906m(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: i */
    public synchronized void mo103913i(@NonNull R r, @Nullable v7j0<? super R> v7j0Var) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f77302g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f77302g || this.f77303h || this.f77304i;
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: k */
    public void mo103915k(@NonNull yif0 yif0Var) {
        yif0Var.mo5641d(this.f77296a, this.f77297b);
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: l */
    public synchronized void mo103916l(@Nullable Drawable drawable) {
    }

    public buc0(int i, int i2) {
        this(i, i2, true, f77295k);
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return m103906m(null);
        } catch (TimeoutException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    @Override // p149l.hcr
    /* JADX INFO: renamed from: d */
    public void mo5559d() {
    }

    @Override // p149l.hcr
    public void onDestroy() {
    }

    @Override // p149l.hcr
    public void onStart() {
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: a */
    public void mo103907a(@NonNull yif0 yif0Var) {
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: e */
    public void mo103910e(@Nullable Drawable drawable) {
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: j */
    public void mo103914j(@Nullable Drawable drawable) {
    }
}
