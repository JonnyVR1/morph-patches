package p153l;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bjs0 implements s26 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f77021a;

    @Override // p153l.s26
    public final Object then(Task task) {
        sni0 sni0Var = this.f77021a;
        Api.ClientKey clientKey = vrs0.f185519a;
        if (task.mo15431p()) {
            sni0Var.m186943e((Location) task.mo15427l());
            return null;
        }
        Exception excMo15426k = task.mo15426k();
        excMo15426k.getClass();
        sni0Var.m186942d(excMo15426k);
        return null;
    }
}
