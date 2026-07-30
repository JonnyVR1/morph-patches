package p153l;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ang0 extends ThreadPoolExecutor implements AutoCloseable {
    public ang0() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new isq0());
    }

    /* JADX INFO: renamed from: b */
    public final void m98963b(NetworkInfo networkInfo) {
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
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        tmg0 tmg0Var = new tmg0((teg0) runnable);
        execute(tmg0Var);
        return tmg0Var;
    }
}
