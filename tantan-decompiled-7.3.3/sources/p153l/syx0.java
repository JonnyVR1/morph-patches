package p153l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class syx0 implements mvb {
    @Override // p153l.mvb
    /* JADX INFO: renamed from: a */
    public final PendingResult<Object> mo160255a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credentialRequest, "request must not be null");
        return googleApiClient.enqueue(new gtx0(this, googleApiClient, credentialRequest));
    }

    @Override // p153l.mvb
    /* JADX INFO: renamed from: b */
    public final PendingResult<Status> mo160256b(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        return googleApiClient.execute(new cey0(this, googleApiClient));
    }

    @Override // p153l.mvb
    /* JADX INFO: renamed from: c */
    public final PendingResult<Status> mo160257c(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new ugy0(this, googleApiClient, credential));
    }

    @Override // p153l.mvb
    /* JADX INFO: renamed from: d */
    public final PendingResult<Status> mo160258d(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new x3y0(this, googleApiClient, credential));
    }
}
