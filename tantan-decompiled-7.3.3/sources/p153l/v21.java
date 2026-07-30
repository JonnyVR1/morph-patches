package p153l;

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
public abstract class v21<D> extends utv<D> {

    /* JADX INFO: renamed from: i */
    public final Executor f182056i;

    /* JADX INFO: renamed from: j */
    public volatile v21<D>.RunnableC20723a f182057j;

    /* JADX INFO: renamed from: k */
    public volatile v21<D>.RunnableC20723a f182058k;

    /* JADX INFO: renamed from: l */
    public long f182059l;

    /* JADX INFO: renamed from: m */
    public long f182060m;

    /* JADX INFO: renamed from: n */
    public Handler f182061n;

    /* JADX INFO: renamed from: l.v21$a */
    public final class RunnableC20723a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: k */
        public final CountDownLatch f182062k = new CountDownLatch(1);

        /* JADX INFO: renamed from: l */
        public boolean f182063l;

        public RunnableC20723a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: h */
        public void mo3119h(D d) {
            try {
                v21.this.m199109B(this, d);
            } finally {
                this.f182062k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: i */
        public void mo3120i(D d) {
            try {
                v21.this.m199110C(this, d);
            } finally {
                this.f182062k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo3114b(Void... voidArr) {
            try {
                return (D) v21.this.m199113H();
            } catch (OperationCanceledException e) {
                if (m3117f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f182063l = false;
            v21.this.m199111D();
        }
    }

    public v21(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.f182060m = -10000L;
        this.f182056i = executor;
    }

    /* JADX INFO: renamed from: B */
    public void m199109B(v21<D>.RunnableC20723a runnableC20723a, D d) {
        mo198674G(d);
        if (this.f182058k == runnableC20723a) {
            m198105v();
            this.f182060m = SystemClock.uptimeMillis();
            this.f182058k = null;
            m198089e();
            m199111D();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m199110C(v21<D>.RunnableC20723a runnableC20723a, D d) {
        if (this.f182057j != runnableC20723a) {
            m199109B(runnableC20723a, d);
            return;
        }
        if (m198094j()) {
            mo198674G(d);
            return;
        }
        m198087c();
        this.f182060m = SystemClock.uptimeMillis();
        this.f182057j = null;
        mo198090f(d);
    }

    /* JADX INFO: renamed from: D */
    public void m199111D() {
        if (this.f182058k != null || this.f182057j == null) {
            return;
        }
        if (this.f182057j.f182063l) {
            this.f182057j.f182063l = false;
            this.f182061n.removeCallbacks(this.f182057j);
        }
        if (this.f182059l <= 0 || SystemClock.uptimeMillis() >= this.f182060m + this.f182059l) {
            this.f182057j.m3115c(this.f182056i, null);
        } else {
            this.f182057j.f182063l = true;
            this.f182061n.postAtTime(this.f182057j, this.f182060m + this.f182059l);
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean m199112E() {
        return this.f182058k != null;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public abstract D mo188605F();

    @Nullable
    /* JADX INFO: renamed from: H */
    public D m199113H() {
        return mo188605F();
    }

    @Override // p153l.utv
    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo198091g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo198091g(str, fileDescriptor, printWriter, strArr);
        if (this.f182057j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f182057j);
            printWriter.print(" waiting=");
            printWriter.println(this.f182057j.f182063l);
        }
        if (this.f182058k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f182058k);
            printWriter.print(" waiting=");
            printWriter.println(this.f182058k.f182063l);
        }
        if (this.f182059l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            vzi0.m204104c(this.f182059l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            vzi0.m204103b(this.f182060m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: n */
    public boolean mo198098n() {
        if (this.f182057j == null) {
            return false;
        }
        if (!this.f181000d) {
            this.f181003g = true;
        }
        v21<D>.RunnableC20723a runnableC20723a = this.f182058k;
        v21<D>.RunnableC20723a runnableC20723a2 = this.f182057j;
        if (runnableC20723a != null) {
            if (runnableC20723a2.f182063l) {
                this.f182057j.f182063l = false;
                this.f182061n.removeCallbacks(this.f182057j);
            }
            this.f182057j = null;
            return false;
        }
        boolean z = runnableC20723a2.f182063l;
        v21<D>.RunnableC20723a runnableC20723a3 = this.f182057j;
        if (z) {
            runnableC20723a3.f182063l = false;
            this.f182061n.removeCallbacks(this.f182057j);
            this.f182057j = null;
            return false;
        }
        boolean zM3113a = runnableC20723a3.m3113a(false);
        if (zM3113a) {
            this.f182058k = this.f182057j;
            mo198673A();
        }
        this.f182057j = null;
        return zM3113a;
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: p */
    public void mo198100p() {
        super.mo198100p();
        m198086b();
        this.f182057j = new RunnableC20723a();
        m199111D();
    }

    public v21(@NonNull Context context) {
        this(context, ModernAsyncTask.f2366h);
    }

    /* JADX INFO: renamed from: A */
    public void mo198673A() {
    }

    /* JADX INFO: renamed from: G */
    public void mo198674G(@Nullable D d) {
    }
}
