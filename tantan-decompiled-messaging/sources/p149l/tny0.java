package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class tny0 extends nqy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f171300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PendingIntent f171301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tny0(qsy0 qsy0Var, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f171300a = j;
        this.f171301b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        sov0 sov0Var = (sov0) anyClient;
        long j = this.f171300a;
        PendingIntent pendingIntent = this.f171301b;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((iby0) sov0Var.getService()).mo135276B5(j, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}
