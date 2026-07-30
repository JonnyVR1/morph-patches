package p149l;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class uct0 extends vey0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f175863a;

    public uct0(zvt0 zvt0Var, sei0 sei0Var) {
        this.f175863a = sei0Var;
    }

    @Override // p149l.lhy0
    /* JADX INFO: renamed from: K4 */
    public final void mo149876K4(Status status, Location location) {
        TaskUtil.setResultOrApiException(status, location, this.f175863a);
    }
}
