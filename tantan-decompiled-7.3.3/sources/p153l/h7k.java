package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public class h7k extends GoogleApi<GoogleSignInOptions> {

    /* JADX INFO: renamed from: a */
    public static final C17414a f108132a = new C17414a(null);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public static int f108133b = C17415b.f108134a;

    /* JADX INFO: renamed from: l.h7k$b */
    @VisibleForTesting
    public static final enum C17415b {

        /* JADX INFO: renamed from: a */
        public static final int f108134a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f108135b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f108136c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f108137d = 4;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f108138e = {1, 2, 3, 4};

        /* JADX INFO: renamed from: a */
        public static int[] m133803a() {
            return (int[]) f108138e.clone();
        }
    }

    public h7k(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, vd1.f183515g, googleSignInOptions, new ApiExceptionMapper());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Intent m133799b() {
        Context applicationContext = getApplicationContext();
        int i = l5t0.f130165a[m133802e() - 1];
        if (i != 1) {
            return i != 2 ? jrw0.m146829g(applicationContext, getApiOptions()) : jrw0.m146824b(applicationContext, getApiOptions());
        }
        return jrw0.m146827e(applicationContext, getApiOptions());
    }

    /* JADX INFO: renamed from: c */
    public Task<Void> m133800c() {
        return PendingResultUtil.toVoidTask(jrw0.m146828f(asGoogleApiClient(), getApplicationContext(), m133802e() == C17415b.f108136c));
    }

    /* JADX INFO: renamed from: d */
    public Task<Void> m133801d() {
        return PendingResultUtil.toVoidTask(jrw0.m146825c(asGoogleApiClient(), getApplicationContext(), m133802e() == C17415b.f108136c));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m133802e() {
        try {
            if (f108133b == C17415b.f108134a) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    f108133b = C17415b.f108137d;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.m12528a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    f108133b = C17415b.f108135b;
                } else {
                    f108133b = C17415b.f108136c;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f108133b;
    }

    /* JADX INFO: renamed from: l.h7k$a */
    public static class C17414a implements PendingResultUtil.ResultConverter<i7k, GoogleSignInAccount> {
        public C17414a() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        @Nullable
        public final /* synthetic */ GoogleSignInAccount convert(Result result) {
            return ((i7k) result).m138963a();
        }

        public /* synthetic */ C17414a(l5t0 l5t0Var) {
            this();
        }
    }
}
