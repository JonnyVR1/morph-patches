package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public class nvb extends GoogleApi<vd1.C20811a> {
    public nvb(@NonNull Context context, @NonNull vd1.C20811a c20811a) {
        super(context, vd1.f183514f, c20811a, new ApiExceptionMapper());
    }

    /* JADX INFO: renamed from: b */
    public Task<Void> m164864b(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(vd1.f183517i.mo160257c(asGoogleApiClient(), credential));
    }

    /* JADX INFO: renamed from: c */
    public Task<Void> m164865c() {
        return PendingResultUtil.toVoidTask(vd1.f183517i.mo160256b(asGoogleApiClient()));
    }

    /* JADX INFO: renamed from: d */
    public Task<kvb> m164866d(@NonNull CredentialRequest credentialRequest) {
        return PendingResultUtil.toResponseTask(vd1.f183517i.mo160255a(asGoogleApiClient(), credentialRequest), new kvb());
    }

    /* JADX INFO: renamed from: e */
    public Task<Void> m164867e(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(vd1.f183517i.mo160258d(asGoogleApiClient(), credential));
    }

    public nvb(@NonNull Activity activity, @NonNull vd1.C20811a c20811a) {
        super(activity, vd1.f183514f, c20811a, (StatusExceptionMapper) new ApiExceptionMapper());
    }
}
