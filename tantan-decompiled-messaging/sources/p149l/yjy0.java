package p149l;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.appset.C2305a;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class yjy0 implements yw0 {

    /* JADX INFO: renamed from: a */
    public final yw0 f198697a;

    /* JADX INFO: renamed from: b */
    public final yw0 f198698b;

    public yjy0(Context context) {
        this.f198697a = new kfy0(context, GoogleApiAvailabilityLight.getInstance());
        this.f198698b = C2305a.m13751d(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m215102b(yjy0 yjy0Var, Task task) {
        if (!task.mo15377p() && !task.mo15375n()) {
            Exception excMo15372k = task.mo15372k();
            if (excMo15372k instanceof ApiException) {
                int statusCode = ((ApiException) excMo15372k).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return yjy0Var.f198698b.mo13755a();
                }
                if (statusCode == 43000) {
                    return tfi0.m188733e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return tfi0.m188733e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // p149l.yw0
    /* JADX INFO: renamed from: a */
    public final Task<zw0> mo13755a() {
        return this.f198697a.mo13755a().mo15371j(new n16() { // from class: l.yhy0
            @Override // p149l.n16
            public final Object then(Task task) {
                return yjy0.m215102b(this.f198424a, task);
            }
        });
    }
}
