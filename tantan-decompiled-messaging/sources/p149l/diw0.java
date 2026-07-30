package p149l;

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
public final class diw0 {

    /* JADX INFO: renamed from: a */
    public static Logger f86436a = new Logger("GoogleSignInCommon", new String[0]);

    @Nullable
    /* JADX INFO: renamed from: a */
    public static q4k m111930a(@Nullable Intent intent) {
        if (intent == null) {
            return new q4k(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new q4k(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new q4k(null, status);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m111931b(Context context, GoogleSignInOptions googleSignInOptions) {
        f86436a.m12467d("getSignInIntent()", new Object[0]);
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
    public static PendingResult<Status> m111932c(GoogleApiClient googleApiClient, Context context, boolean z) {
        f86436a.m12467d("Signing out", new Object[0]);
        m111933d(context);
        return z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new rzx0(googleApiClient));
    }

    /* JADX INFO: renamed from: d */
    public static void m111933d(Context context) {
        uby0.m192973c(context).m192975a();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }

    /* JADX INFO: renamed from: e */
    public static Intent m111934e(Context context, GoogleSignInOptions googleSignInOptions) {
        f86436a.m12467d("getFallbackSignInIntent()", new Object[0]);
        Intent intentM111931b = m111931b(context, googleSignInOptions);
        intentM111931b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentM111931b;
    }

    /* JADX INFO: renamed from: f */
    public static PendingResult<Status> m111935f(GoogleApiClient googleApiClient, Context context, boolean z) {
        f86436a.m12467d("Revoking access", new Object[0]);
        String strM143788e = jxf0.m143783b(context).m143788e();
        m111933d(context);
        return z ? gws0.m128511a(strM143788e) : googleApiClient.execute(new d8y0(googleApiClient));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m111936g(Context context, GoogleSignInOptions googleSignInOptions) {
        f86436a.m12467d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentM111931b = m111931b(context, googleSignInOptions);
        intentM111931b.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentM111931b;
    }
}
