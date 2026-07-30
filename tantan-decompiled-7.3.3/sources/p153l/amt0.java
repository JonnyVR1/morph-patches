package p153l;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class amt0 extends boy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f72272a;

    public amt0(f5u0 f5u0Var, sni0 sni0Var) {
        this.f72272a = sni0Var;
    }

    @Override // p153l.rqy0
    /* JADX INFO: renamed from: K4 */
    public final void mo98857K4(Status status, Location location) {
        TaskUtil.setResultOrApiException(status, location, this.f72272a);
    }
}
