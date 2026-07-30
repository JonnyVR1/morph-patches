package p153l;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class jey0 {

    /* JADX INFO: renamed from: a */
    public final gey0 f120532a;

    /* JADX INFO: renamed from: b */
    public final hdy0 f120533b;

    /* JADX INFO: renamed from: c */
    public final mfv0 f120534c;

    /* JADX INFO: renamed from: d */
    public final d0u0 f120535d;

    /* JADX INFO: renamed from: e */
    public int f120536e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Object f120537f;

    /* JADX INFO: renamed from: g */
    public final Looper f120538g;

    /* JADX INFO: renamed from: h */
    public final int f120539h;

    /* JADX INFO: renamed from: i */
    public boolean f120540i;

    /* JADX INFO: renamed from: j */
    public boolean f120541j;

    /* JADX INFO: renamed from: k */
    public boolean f120542k;

    public jey0(hdy0 hdy0Var, gey0 gey0Var, d0u0 d0u0Var, int i, mfv0 mfv0Var, Looper looper) {
        this.f120533b = hdy0Var;
        this.f120532a = gey0Var;
        this.f120535d = d0u0Var;
        this.f120538g = looper;
        this.f120534c = mfv0Var;
        this.f120539h = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m144629a() {
        return this.f120536e;
    }

    /* JADX INFO: renamed from: b */
    public final Looper m144630b() {
        return this.f120538g;
    }

    /* JADX INFO: renamed from: c */
    public final gey0 m144631c() {
        return this.f120532a;
    }

    /* JADX INFO: renamed from: d */
    public final jey0 m144632d() {
        lev0.m153958f(!this.f120540i);
        this.f120540i = true;
        this.f120533b.mo12632b(this);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final jey0 m144633e(@Nullable Object obj) {
        lev0.m153958f(!this.f120540i);
        this.f120537f = obj;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final jey0 m144634f(int i) {
        lev0.m153958f(!this.f120540i);
        this.f120536e = i;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m144635g() {
        return this.f120537f;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m144636h(boolean z) {
        this.f120541j = z | this.f120541j;
        this.f120542k = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m144637i(long j) throws InterruptedException, TimeoutException {
        try {
            lev0.m153958f(this.f120540i);
            lev0.m153958f(this.f120538g.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
            while (!this.f120542k) {
                if (j <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j);
                j = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f120541j;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m144638j() {
        return false;
    }
}
