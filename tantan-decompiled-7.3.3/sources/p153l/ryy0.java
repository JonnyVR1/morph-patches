package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class ryy0 extends tzy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f165477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryy0(w1z0 w1z0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f165477a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((yxv0) anyClient).m217740c(this.f165477a);
        setResult(Status.RESULT_SUCCESS);
    }
}
