package p149l;

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
public class p4k extends GoogleApi<GoogleSignInOptions> {

    /* JADX INFO: renamed from: a */
    public static final C19129a f147187a = new C19129a(null);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public static int f147188b = C19130b.f147189a;

    /* JADX INFO: renamed from: l.p4k$b */
    @VisibleForTesting
    public static final enum C19130b {

        /* JADX INFO: renamed from: a */
        public static final int f147189a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f147190b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f147191c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f147192d = 4;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f147193e = {1, 2, 3, 4};

        /* JADX INFO: renamed from: a */
        public static int[] m167394a() {
            return (int[]) f147193e.clone();
        }
    }

    public p4k(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, od1.f143147g, googleSignInOptions, new ApiExceptionMapper());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Intent m167390b() {
        Context applicationContext = getApplicationContext();
        int i = fws0.f99683a[m167393e() - 1];
        if (i != 1) {
            return i != 2 ? diw0.m111936g(applicationContext, getApiOptions()) : diw0.m111931b(applicationContext, getApiOptions());
        }
        return diw0.m111934e(applicationContext, getApiOptions());
    }

    /* JADX INFO: renamed from: c */
    public Task<Void> m167391c() {
        return PendingResultUtil.toVoidTask(diw0.m111935f(asGoogleApiClient(), getApplicationContext(), m167393e() == C19130b.f147191c));
    }

    /* JADX INFO: renamed from: d */
    public Task<Void> m167392d() {
        return PendingResultUtil.toVoidTask(diw0.m111932c(asGoogleApiClient(), getApplicationContext(), m167393e() == C19130b.f147191c));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m167393e() {
        try {
            if (f147188b == C19130b.f147189a) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    f147188b = C19130b.f147192d;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.m12474a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    f147188b = C19130b.f147190b;
                } else {
                    f147188b = C19130b.f147191c;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f147188b;
    }

    /* JADX INFO: renamed from: l.p4k$a */
    public static class C19129a implements PendingResultUtil.ResultConverter<q4k, GoogleSignInAccount> {
        public C19129a() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        @Nullable
        public final /* synthetic */ GoogleSignInAccount convert(Result result) {
            return ((q4k) result).m172942a();
        }

        public /* synthetic */ C19129a(fws0 fws0Var) {
            this();
        }
    }
}
