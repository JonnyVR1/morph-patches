package androidx.core.app;

import androidx.annotation.RestrictTo;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class SafeJobIntentService extends JobIntentService {
    @Override // androidx.core.app.JobIntentService
    public JobIntentService.InterfaceC0239e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (Exception e) {
            if (e instanceof SecurityException) {
                return null;
            }
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
