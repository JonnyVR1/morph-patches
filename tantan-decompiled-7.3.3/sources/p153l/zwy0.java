package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class zwy0 extends tzy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f206401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PendingIntent f206402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwy0(w1z0 w1z0Var, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f206401a = j;
        this.f206402b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        yxv0 yxv0Var = (yxv0) anyClient;
        long j = this.f206401a;
        PendingIntent pendingIntent = this.f206402b;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((oky0) yxv0Var.getService()).mo168065B5(j, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}
