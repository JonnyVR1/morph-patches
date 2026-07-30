package p149l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class mpx0 implements ytb {
    @Override // p149l.ytb
    /* JADX INFO: renamed from: a */
    public final PendingResult<Object> mo155840a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credentialRequest, "request must not be null");
        return googleApiClient.enqueue(new akx0(this, googleApiClient, credentialRequest));
    }

    @Override // p149l.ytb
    /* JADX INFO: renamed from: b */
    public final PendingResult<Status> mo155841b(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        return googleApiClient.execute(new w4y0(this, googleApiClient));
    }

    @Override // p149l.ytb
    /* JADX INFO: renamed from: c */
    public final PendingResult<Status> mo155842c(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new o7y0(this, googleApiClient, credential));
    }

    @Override // p149l.ytb
    /* JADX INFO: renamed from: d */
    public final PendingResult<Status> mo155843d(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new rux0(this, googleApiClient, credential));
    }
}
