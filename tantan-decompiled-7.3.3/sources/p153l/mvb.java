package p153l;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface mvb {
    /* JADX INFO: renamed from: a */
    PendingResult<Object> mo160255a(GoogleApiClient googleApiClient, CredentialRequest credentialRequest);

    /* JADX INFO: renamed from: b */
    PendingResult<Status> mo160256b(GoogleApiClient googleApiClient);

    /* JADX INFO: renamed from: c */
    PendingResult<Status> mo160257c(GoogleApiClient googleApiClient, Credential credential);

    /* JADX INFO: renamed from: d */
    PendingResult<Status> mo160258d(GoogleApiClient googleApiClient, Credential credential);
}
