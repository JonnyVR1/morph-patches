package p153l;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: loaded from: classes6.dex */
public final class cht0 extends m8y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f81862a;

    public cht0(sni0 sni0Var) {
        this.f81862a = sni0Var;
    }

    @Override // p153l.ndy0
    /* JADX INFO: renamed from: M1 */
    public final void mo109844M1(int i, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f81862a);
    }

    @Override // p153l.ndy0
    /* JADX INFO: renamed from: V4 */
    public final void mo109845V4(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f81862a);
    }

    @Override // p153l.ndy0
    /* JADX INFO: renamed from: m8 */
    public final void mo109846m8(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i)), this.f81862a);
    }
}
