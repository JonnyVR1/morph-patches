package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p152authapi.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class ugy0 extends lky0<Status> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Credential f178971a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugy0(syx0 syx0Var, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f178971a = credential;
    }

    @Override // p153l.lky0
    /* JADX INFO: renamed from: a */
    public final void mo109502a(Context context, j3z0 j3z0Var) throws RemoteException {
        j3z0Var.mo143378W7(new yny0(this), new zzt(this.f178971a));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
