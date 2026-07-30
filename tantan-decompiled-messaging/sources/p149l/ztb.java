package p149l;

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
public class ztb extends GoogleApi<od1.C18894a> {
    public ztb(@NonNull Context context, @NonNull od1.C18894a c18894a) {
        super(context, od1.f143146f, c18894a, new ApiExceptionMapper());
    }

    /* JADX INFO: renamed from: b */
    public Task<Void> m220118b(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(od1.f143149i.mo155842c(asGoogleApiClient(), credential));
    }

    /* JADX INFO: renamed from: c */
    public Task<Void> m220119c() {
        return PendingResultUtil.toVoidTask(od1.f143149i.mo155841b(asGoogleApiClient()));
    }

    /* JADX INFO: renamed from: d */
    public Task<wtb> m220120d(@NonNull CredentialRequest credentialRequest) {
        return PendingResultUtil.toResponseTask(od1.f143149i.mo155840a(asGoogleApiClient(), credentialRequest), new wtb());
    }

    /* JADX INFO: renamed from: e */
    public Task<Void> m220121e(@NonNull Credential credential) {
        return PendingResultUtil.toVoidTask(od1.f143149i.mo155843d(asGoogleApiClient(), credential));
    }

    public ztb(@NonNull Activity activity, @NonNull od1.C18894a c18894a) {
        super(activity, od1.f143146f, c18894a, (StatusExceptionMapper) new ApiExceptionMapper());
    }
}
