package p149l;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2457f;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class yjx0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f198693a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue<C2457f<?>> f198694b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("threadLifeCycleLock")
    public boolean f198695c = false;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kjx0 f198696d;

    public yjx0(kjx0 kjx0Var, String str, BlockingQueue<C2457f<?>> blockingQueue) {
        this.f198696d = kjx0Var;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f198693a = new Object();
        this.f198694b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m215099a() {
        synchronized (this.f198693a) {
            this.f198693a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m215100b(InterruptedException interruptedException) {
        this.f198696d.zzj().m211417F().m123937b(getName() + " was interrupted", interruptedException);
    }

    /* JADX INFO: renamed from: c */
    public final void m215101c() {
        synchronized (this.f198696d.f123514i) {
            try {
                if (!this.f198695c) {
                    this.f198696d.f123515j.release();
                    this.f198696d.f123514i.notifyAll();
                    yjx0 yjx0Var = this.f198696d.f123508c;
                    kjx0 kjx0Var = this.f198696d;
                    if (this == yjx0Var) {
                        kjx0Var.f123508c = null;
                    } else {
                        yjx0 yjx0Var2 = kjx0Var.f123509d;
                        kjx0 kjx0Var2 = this.f198696d;
                        if (this == yjx0Var2) {
                            kjx0Var2.f123509d = null;
                        } else {
                            kjx0Var2.zzj().m211412A().m123936a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f198695c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f198696d.f123515j.acquire();
                z = true;
            } catch (InterruptedException e) {
                m215100b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2457f<?> c2457fPoll = this.f198694b.poll();
                if (c2457fPoll != null) {
                    Process.setThreadPriority(c2457fPoll.f10484b ? threadPriority : 10);
                    c2457fPoll.run();
                } else {
                    synchronized (this.f198693a) {
                        if (this.f198694b.peek() == null && !this.f198696d.f123516k) {
                            try {
                                this.f198693a.wait(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
                            } catch (InterruptedException e2) {
                                m215100b(e2);
                            }
                        }
                    }
                    synchronized (this.f198696d.f123514i) {
                        if (this.f198694b.peek() == null) {
                            m215101c();
                            m215101c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m215101c();
            throw th;
        }
    }
}
