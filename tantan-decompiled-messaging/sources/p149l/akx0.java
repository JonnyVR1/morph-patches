package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class akx0 extends fby0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CredentialRequest f70350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx0(mpx0 mpx0Var, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.f70350a = credentialRequest;
    }

    @Override // p149l.fby0
    /* JADX INFO: renamed from: a */
    public final void mo97221a(Context context, duy0 duy0Var) throws RemoteException {
        duy0Var.mo113755S0(new uzx0(this), this.f70350a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return khw0.m146023a(status);
    }
}
