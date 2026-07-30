package p149l;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class seg0 extends ThreadPoolExecutor implements AutoCloseable {
    public seg0() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new djq0());
    }

    /* JADX INFO: renamed from: b */
    public final void m183633b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setCorePoolSize(3);
            setMaximumPoolSize(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                setCorePoolSize(4);
                setMaximumPoolSize(4);
                return;
            } else {
                setCorePoolSize(3);
                setMaximumPoolSize(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                setCorePoolSize(1);
                setMaximumPoolSize(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        setCorePoolSize(3);
                        setMaximumPoolSize(3);
                        break;
                    default:
                        setCorePoolSize(3);
                        setMaximumPoolSize(3);
                        break;
                }
                return;
        }
        setCorePoolSize(2);
        setMaximumPoolSize(2);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        leg0 leg0Var = new leg0((l6g0) runnable);
        execute(leg0Var);
        return leg0Var;
    }
}
