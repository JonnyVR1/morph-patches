package p149l;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class zqy0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static zqy0 f204444e;

    /* JADX INFO: renamed from: a */
    public final Context f204445a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f204446b;

    /* JADX INFO: renamed from: c */
    public hfy0 f204447c = new hfy0(this, null);

    /* JADX INFO: renamed from: d */
    public int f204448d = 1;

    @VisibleForTesting
    public zqy0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f204446b = scheduledExecutorService;
        this.f204445a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized zqy0 m219907b(Context context) {
        try {
            if (f204444e == null) {
                esu0.m117957a();
                f204444e = new zqy0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f204444e;
    }

    /* JADX INFO: renamed from: c */
    public final Task m219909c(int i, Bundle bundle) {
        return m219912g(new vjy0(m219911f(), i, bundle));
    }

    /* JADX INFO: renamed from: d */
    public final Task m219910d(int i, Bundle bundle) {
        return m219912g(new gpy0(m219911f(), i, bundle));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized int m219911f() {
        int i;
        i = this.f204448d;
        this.f204448d = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Task m219912g(kly0 kly0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(kly0Var.toString());
            }
            if (!this.f204447c.m130800g(kly0Var)) {
                hfy0 hfy0Var = new hfy0(this, null);
                this.f204447c = hfy0Var;
                hfy0Var.m130800g(kly0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kly0Var.f123724b.m183657a();
    }
}
