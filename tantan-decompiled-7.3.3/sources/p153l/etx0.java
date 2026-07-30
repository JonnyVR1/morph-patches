package p153l;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2480f;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class etx0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f95826a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue<C2480f<?>> f95827b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("threadLifeCycleLock")
    public boolean f95828c = false;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qsx0 f95829d;

    public etx0(qsx0 qsx0Var, String str, BlockingQueue<C2480f<?>> blockingQueue) {
        this.f95829d = qsx0Var;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f95826a = new Object();
        this.f95827b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m122512a() {
        synchronized (this.f95826a) {
            this.f95826a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m122513b(InterruptedException interruptedException) {
        this.f95829d.zzj().m114563F().m153301b(getName() + " was interrupted", interruptedException);
    }

    /* JADX INFO: renamed from: c */
    public final void m122514c() {
        synchronized (this.f95829d.f159364i) {
            try {
                if (!this.f95828c) {
                    this.f95829d.f159365j.release();
                    this.f95829d.f159364i.notifyAll();
                    etx0 etx0Var = this.f95829d.f159358c;
                    qsx0 qsx0Var = this.f95829d;
                    if (this == etx0Var) {
                        qsx0Var.f159358c = null;
                    } else {
                        etx0 etx0Var2 = qsx0Var.f159359d;
                        qsx0 qsx0Var2 = this.f95829d;
                        if (this == etx0Var2) {
                            qsx0Var2.f159359d = null;
                        } else {
                            qsx0Var2.zzj().m114558A().m153300a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f95828c = true;
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
                this.f95829d.f159365j.acquire();
                z = true;
            } catch (InterruptedException e) {
                m122513b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2480f<?> c2480fPoll = this.f95827b.poll();
                if (c2480fPoll != null) {
                    Process.setThreadPriority(c2480fPoll.f10521b ? threadPriority : 10);
                    c2480fPoll.run();
                } else {
                    synchronized (this.f95826a) {
                        if (this.f95827b.peek() == null && !this.f95829d.f159366k) {
                            try {
                                this.f95826a.wait(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
                            } catch (InterruptedException e2) {
                                m122513b(e2);
                            }
                        }
                    }
                    synchronized (this.f95829d.f159364i) {
                        if (this.f95827b.peek() == null) {
                            m122514c();
                            m122514c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m122514c();
            throw th;
        }
    }
}
