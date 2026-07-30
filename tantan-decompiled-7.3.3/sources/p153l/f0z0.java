package p153l;

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
public final class f0z0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static f0z0 f96747e;

    /* JADX INFO: renamed from: a */
    public final Context f96748a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f96749b;

    /* JADX INFO: renamed from: c */
    public noy0 f96750c = new noy0(this, null);

    /* JADX INFO: renamed from: d */
    public int f96751d = 1;

    @VisibleForTesting
    public f0z0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f96749b = scheduledExecutorService;
        this.f96748a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized f0z0 m123536b(Context context) {
        try {
            if (f96747e == null) {
                k1v0.m147926a();
                f96747e = new f0z0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f96747e;
    }

    /* JADX INFO: renamed from: c */
    public final Task m123538c(int i, Bundle bundle) {
        return m123541g(new bty0(m123540f(), i, bundle));
    }

    /* JADX INFO: renamed from: d */
    public final Task m123539d(int i, Bundle bundle) {
        return m123541g(new myy0(m123540f(), i, bundle));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized int m123540f() {
        int i;
        i = this.f96751d;
        this.f96751d = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Task m123541g(quy0 quy0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(quy0Var.toString());
            }
            if (!this.f96750c.m164213g(quy0Var)) {
                noy0 noy0Var = new noy0(this, null);
                this.f96750c = noy0Var;
                noy0Var.m164213g(quy0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return quy0Var.f159656b.m186939a();
    }
}
