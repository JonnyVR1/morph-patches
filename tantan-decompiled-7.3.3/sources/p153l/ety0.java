package p153l;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.appset.C2328a;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class ety0 implements fx0 {

    /* JADX INFO: renamed from: a */
    public final fx0 f95831a;

    /* JADX INFO: renamed from: b */
    public final fx0 f95832b;

    public ety0(Context context) {
        this.f95831a = new qoy0(context, GoogleApiAvailabilityLight.getInstance());
        this.f95832b = C2328a.m13805d(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m122515b(ety0 ety0Var, Task task) {
        if (!task.mo15431p() && !task.mo15429n()) {
            Exception excMo15426k = task.mo15426k();
            if (excMo15426k instanceof ApiException) {
                int statusCode = ((ApiException) excMo15426k).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return ety0Var.f95832b.mo13809a();
                }
                if (statusCode == 43000) {
                    return toi0.m192067e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return toi0.m192067e(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // p153l.fx0
    /* JADX INFO: renamed from: a */
    public final Task<gx0> mo13809a() {
        return this.f95831a.mo13809a().mo15425j(new s26() { // from class: l.ery0
            @Override // p153l.s26
            public final Object then(Task task) {
                return ety0.m122515b(this.f95548a, task);
            }
        });
    }
}
