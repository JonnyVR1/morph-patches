package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class w4y0 extends fby0<Status> {
    public w4y0(mpx0 mpx0Var, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // p149l.fby0
    /* JADX INFO: renamed from: a */
    public final void mo97221a(Context context, duy0 duy0Var) throws RemoteException {
        duy0Var.mo113754C7(new sey0(this));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
