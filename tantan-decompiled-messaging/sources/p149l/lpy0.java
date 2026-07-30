package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class lpy0 extends nqy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f129262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpy0(qsy0 qsy0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f129262a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((sov0) anyClient).m185304c(this.f129262a);
        setResult(Status.RESULT_SUCCESS);
    }
}
