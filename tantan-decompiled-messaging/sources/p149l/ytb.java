package p149l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface ytb {
    /* JADX INFO: renamed from: a */
    PendingResult<Object> mo155840a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest);

    /* JADX INFO: renamed from: b */
    PendingResult<Status> mo155841b(GoogleApiClient googleApiClient);

    /* JADX INFO: renamed from: c */
    PendingResult<Status> mo155842c(GoogleApiClient googleApiClient, Credential credential);

    /* JADX INFO: renamed from: d */
    PendingResult<Status> mo155843d(GoogleApiClient googleApiClient, Credential credential);
}
