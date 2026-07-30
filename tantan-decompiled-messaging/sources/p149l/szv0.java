package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class szv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public static Task f167081a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public static yw0 f167082b;

    /* JADX INFO: renamed from: c */
    public static final Object f167083c = new Object();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Task m186800a(Context context) {
        Task task;
        m186801b(context, false);
        synchronized (f167083c) {
            task = f167081a;
        }
        return task;
    }

    /* JADX INFO: renamed from: b */
    public static void m186801b(Context context, boolean z) {
        synchronized (f167083c) {
            try {
                if (f167082b == null) {
                    f167082b = xw0.m211309a(context);
                }
                Task task = f167081a;
                if (task == null || ((task.mo15376o() && !f167081a.mo15377p()) || (z && f167081a.mo15376o()))) {
                    f167081a = ((yw0) Preconditions.checkNotNull(f167082b, "the appSetIdClient shouldn't be null")).mo13755a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
