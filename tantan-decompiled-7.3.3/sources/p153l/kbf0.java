package p153l;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class kbf0 extends GmsClient<t7r0> implements o7r0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f124939e = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f124940a;

    /* JADX INFO: renamed from: b */
    public final ClientSettings f124941b;

    /* JADX INFO: renamed from: c */
    public final Bundle f124942c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Integer f124943d;

    public kbf0(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull ClientSettings clientSettings, @NonNull Bundle bundle, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f124940a = true;
        this.f124941b = clientSettings;
        this.f124942c = bundle;
        this.f124943d = clientSettings.zab();
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public static Bundle m149031c(@NonNull ClientSettings clientSettings) {
        clientSettings.zaa();
        Integer numZab = clientSettings.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (numZab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numZab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.o7r0
    /* JADX INFO: renamed from: a */
    public final void mo149032a(@NonNull IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((t7r0) getService()).m189631P2(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f124943d)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.o7r0
    /* JADX INFO: renamed from: b */
    public final void mo149033b(p7r0 p7r0Var) {
        Preconditions.checkNotNull(p7r0Var, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f124941b.getAccountOrDefault();
            ((t7r0) getService()).m189632Y2(new zai(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f124943d)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? t5g0.m189389b(getContext()).m189392c() : null)), p7r0Var);
        } catch (RemoteException e) {
            try {
                p7r0Var.zab(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final /* synthetic */ IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof t7r0 ? (t7r0) iInterfaceQueryLocalInterface : new t7r0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f124941b.getRealClientPackageName())) {
            this.f124942c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f124941b.getRealClientPackageName());
        }
        return this.f124942c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f124940a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.o7r0
    public final void zaa() {
        try {
            ((t7r0) getService()).m189630O(((Integer) Preconditions.checkNotNull(this.f124943d)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // p153l.o7r0
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
