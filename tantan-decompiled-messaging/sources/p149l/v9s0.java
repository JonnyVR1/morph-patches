package p149l;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v9s0 implements n16 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f180673a;

    @Override // p149l.n16
    public final Object then(Task task) {
        sei0 sei0Var = this.f180673a;
        Api.ClientKey clientKey = pis0.f149684a;
        if (task.mo15377p()) {
            sei0Var.m183661e((Location) task.mo15373l());
            return null;
        }
        Exception excMo15372k = task.mo15372k();
        excMo15372k.getClass();
        sei0Var.m183660d(excMo15372k);
        return null;
    }
}
