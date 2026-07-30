package p149l;

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
public class d3f0 extends GmsClient<nyq0> implements iyq0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f84213e = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f84214a;

    /* JADX INFO: renamed from: b */
    public final ClientSettings f84215b;

    /* JADX INFO: renamed from: c */
    public final Bundle f84216c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Integer f84217d;

    public d3f0(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull ClientSettings clientSettings, @NonNull Bundle bundle, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f84214a = true;
        this.f84215b = clientSettings;
        this.f84216c = bundle;
        this.f84217d = clientSettings.zab();
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public static Bundle m109906c(@NonNull ClientSettings clientSettings) {
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
    @Override // p149l.iyq0
    /* JADX INFO: renamed from: a */
    public final void mo109907a(@NonNull IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((nyq0) getService()).m162029P2(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f84217d)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.iyq0
    /* JADX INFO: renamed from: b */
    public final void mo109908b(jyq0 jyq0Var) {
        Preconditions.checkNotNull(jyq0Var, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f84215b.getAccountOrDefault();
            ((nyq0) getService()).m162030Y2(new zai(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f84217d)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? jxf0.m143783b(getContext()).m143786c() : null)), jyq0Var);
        } catch (RemoteException e) {
            try {
                jyq0Var.zab(new zak(1, new ConnectionResult(8, null), null));
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
        return iInterfaceQueryLocalInterface instanceof nyq0 ? (nyq0) iInterfaceQueryLocalInterface : new nyq0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f84215b.getRealClientPackageName())) {
            this.f84216c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f84215b.getRealClientPackageName());
        }
        return this.f84216c;
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
        return this.f84214a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.iyq0
    public final void zaa() {
        try {
            ((nyq0) getService()).m162028O(((Integer) Preconditions.checkNotNull(this.f84217d)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // p149l.iyq0
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
