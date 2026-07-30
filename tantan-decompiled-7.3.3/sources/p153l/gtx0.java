package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class gtx0 extends lky0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CredentialRequest f106457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtx0(syx0 syx0Var, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.f106457a = credentialRequest;
    }

    @Override // p153l.lky0
    /* JADX INFO: renamed from: a */
    public final void mo109502a(Context context, j3z0 j3z0Var) throws RemoteException {
        j3z0Var.mo143377S0(new a9y0(this), this.f106457a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return qqw0.m177527a(status);
    }
}
