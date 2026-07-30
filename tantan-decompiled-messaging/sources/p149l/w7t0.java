package p149l;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: loaded from: classes6.dex */
public final class w7t0 extends gzx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f185097a;

    public w7t0(sei0 sei0Var) {
        this.f185097a = sei0Var;
    }

    @Override // p149l.h4y0
    /* JADX INFO: renamed from: M1 */
    public final void mo129341M1(int i, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f185097a);
    }

    @Override // p149l.h4y0
    /* JADX INFO: renamed from: V4 */
    public final void mo129342V4(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f185097a);
    }

    @Override // p149l.h4y0
    /* JADX INFO: renamed from: m8 */
    public final void mo129343m8(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f185097a);
    }
}
