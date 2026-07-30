package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class y8w0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public static Task f198049a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public static fx0 f198050b;

    /* JADX INFO: renamed from: c */
    public static final Object f198051c = new Object();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Task m214780a(Context context) {
        Task task;
        m214781b(context, false);
        synchronized (f198051c) {
            task = f198049a;
        }
        return task;
    }

    /* JADX INFO: renamed from: b */
    public static void m214781b(Context context, boolean z) {
        synchronized (f198051c) {
            try {
                if (f198050b == null) {
                    f198050b = ex0.m122996a(context);
                }
                Task task = f198049a;
                if (task == null || ((task.mo15430o() && !f198049a.mo15431p()) || (z && f198049a.mo15430o()))) {
                    f198049a = ((fx0) Preconditions.checkNotNull(f198050b, "the appSetIdClient shouldn't be null")).mo13809a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
