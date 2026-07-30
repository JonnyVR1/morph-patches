package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class jrw0 {

    /* JADX INFO: renamed from: a */
    public static Logger f122416a = new Logger("GoogleSignInCommon", new String[0]);

    @Nullable
    /* JADX INFO: renamed from: a */
    public static i7k m146823a(@Nullable Intent intent) {
        if (intent == null) {
            return new i7k(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new i7k(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new i7k(null, status);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m146824b(Context context, GoogleSignInOptions googleSignInOptions) {
        f122416a.m12521d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.KEY_CONFIG, signInConfiguration);
        intent.putExtra(Constants.KEY_CONFIG, bundle);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static PendingResult<Status> m146825c(GoogleApiClient googleApiClient, Context context, boolean z) {
        f122416a.m12521d("Signing out", new Object[0]);
        m146826d(context);
        return z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new x8y0(googleApiClient));
    }

    /* JADX INFO: renamed from: d */
    public static void m146826d(Context context) {
        aly0.m98768c(context).m98770a();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }

    /* JADX INFO: renamed from: e */
    public static Intent m146827e(Context context, GoogleSignInOptions googleSignInOptions) {
        f122416a.m12521d("getFallbackSignInIntent()", new Object[0]);
        Intent intentM146824b = m146824b(context, googleSignInOptions);
        intentM146824b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentM146824b;
    }

    /* JADX INFO: renamed from: f */
    public static PendingResult<Status> m146828f(GoogleApiClient googleApiClient, Context context, boolean z) {
        f122416a.m12521d("Revoking access", new Object[0]);
        String strM189394e = t5g0.m189389b(context).m189394e();
        m146826d(context);
        return z ? m5t0.m157123a(strM189394e) : googleApiClient.execute(new jhy0(googleApiClient));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m146829g(Context context, GoogleSignInOptions googleSignInOptions) {
        f122416a.m12521d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentM146824b = m146824b(context, googleSignInOptions);
        intentM146824b.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentM146824b;
    }
}
