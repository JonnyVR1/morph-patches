package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class o21<D> extends trv<D> {

    /* JADX INFO: renamed from: i */
    public final Executor f141494i;

    /* JADX INFO: renamed from: j */
    public volatile o21<D>.RunnableC18819a f141495j;

    /* JADX INFO: renamed from: k */
    public volatile o21<D>.RunnableC18819a f141496k;

    /* JADX INFO: renamed from: l */
    public long f141497l;

    /* JADX INFO: renamed from: m */
    public long f141498m;

    /* JADX INFO: renamed from: n */
    public Handler f141499n;

    /* JADX INFO: renamed from: l.o21$a */
    public final class RunnableC18819a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: k */
        public final CountDownLatch f141500k = new CountDownLatch(1);

        /* JADX INFO: renamed from: l */
        public boolean f141501l;

        public RunnableC18819a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: h */
        public void mo3118h(D d) {
            try {
                o21.this.m162276B(this, d);
            } finally {
                this.f141500k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: i */
        public void mo3119i(D d) {
            try {
                o21.this.m162277C(this, d);
            } finally {
                this.f141500k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo3113b(Void... voidArr) {
            try {
                return (D) o21.this.m162280H();
            } catch (OperationCanceledException e) {
                if (m3116f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141501l = false;
            o21.this.m162278D();
        }
    }

    public o21(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.f141498m = -10000L;
        this.f141494i = executor;
    }

    /* JADX INFO: renamed from: B */
    public void m162276B(o21<D>.RunnableC18819a runnableC18819a, D d) {
        mo138796G(d);
        if (this.f141496k == runnableC18819a) {
            m190462v();
            this.f141498m = SystemClock.uptimeMillis();
            this.f141496k = null;
            m190452e();
            m162278D();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m162277C(o21<D>.RunnableC18819a runnableC18819a, D d) {
        if (this.f141495j != runnableC18819a) {
            m162276B(runnableC18819a, d);
            return;
        }
        if (m190455j()) {
            mo138796G(d);
            return;
        }
        m190450c();
        this.f141498m = SystemClock.uptimeMillis();
        this.f141495j = null;
        mo138800f(d);
    }

    /* JADX INFO: renamed from: D */
    public void m162278D() {
        if (this.f141496k != null || this.f141495j == null) {
            return;
        }
        if (this.f141495j.f141501l) {
            this.f141495j.f141501l = false;
            this.f141499n.removeCallbacks(this.f141495j);
        }
        if (this.f141497l <= 0 || SystemClock.uptimeMillis() >= this.f141498m + this.f141497l) {
            this.f141495j.m3114c(this.f141494i, null);
        } else {
            this.f141495j.f141501l = true;
            this.f141499n.postAtTime(this.f141495j, this.f141498m + this.f141497l);
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean m162279E() {
        return this.f141496k != null;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public abstract D mo138795F();

    @Nullable
    /* JADX INFO: renamed from: H */
    public D m162280H() {
        return mo138795F();
    }

    @Override // p149l.trv
    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo138801g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo138801g(str, fileDescriptor, printWriter, strArr);
        if (this.f141495j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f141495j);
            printWriter.print(" waiting=");
            printWriter.println(this.f141495j.f141501l);
        }
        if (this.f141496k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f141496k);
            printWriter.print(" waiting=");
            printWriter.println(this.f141496k.f141501l);
        }
        if (this.f141497l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            sqi0.m185593c(this.f141497l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            sqi0.m185592b(this.f141498m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: n */
    public boolean mo162281n() {
        if (this.f141495j == null) {
            return false;
        }
        if (!this.f171867d) {
            this.f171870g = true;
        }
        o21<D>.RunnableC18819a runnableC18819a = this.f141496k;
        o21<D>.RunnableC18819a runnableC18819a2 = this.f141495j;
        if (runnableC18819a != null) {
            if (runnableC18819a2.f141501l) {
                this.f141495j.f141501l = false;
                this.f141499n.removeCallbacks(this.f141495j);
            }
            this.f141495j = null;
            return false;
        }
        boolean z = runnableC18819a2.f141501l;
        o21<D>.RunnableC18819a runnableC18819a3 = this.f141495j;
        if (z) {
            runnableC18819a3.f141501l = false;
            this.f141499n.removeCallbacks(this.f141495j);
            this.f141495j = null;
            return false;
        }
        boolean zM3112a = runnableC18819a3.m3112a(false);
        if (zM3112a) {
            this.f141496k = this.f141495j;
            mo138794A();
        }
        this.f141495j = null;
        return zM3112a;
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: p */
    public void mo162282p() {
        super.mo162282p();
        m190449b();
        this.f141495j = new RunnableC18819a();
        m162278D();
    }

    public o21(@NonNull Context context) {
        this(context, ModernAsyncTask.f2366h);
    }

    /* JADX INFO: renamed from: A */
    public void mo138794A() {
    }

    /* JADX INFO: renamed from: G */
    public void mo138796G(@Nullable D d) {
    }
}
