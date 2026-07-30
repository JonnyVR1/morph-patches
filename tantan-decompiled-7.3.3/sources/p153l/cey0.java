package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class cey0 extends lky0<Status> {
    public cey0(syx0 syx0Var, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // p153l.lky0
    /* JADX INFO: renamed from: a */
    public final void mo109502a(Context context, j3z0 j3z0Var) throws RemoteException {
        j3z0Var.mo143376C7(new yny0(this));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
