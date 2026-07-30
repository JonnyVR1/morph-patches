package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p148authapi.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class o7y0 extends fby0<Status> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Credential f142555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7y0(mpx0 mpx0Var, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f142555a = credential;
    }

    @Override // p149l.fby0
    /* JADX INFO: renamed from: a */
    public final void mo97221a(Context context, duy0 duy0Var) throws RemoteException {
        duy0Var.mo113756W7(new sey0(this), new zzt(this.f142555a));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
