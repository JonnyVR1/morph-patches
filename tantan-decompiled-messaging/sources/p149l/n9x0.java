package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class n9x0 extends GmsClient<yqy0> {

    /* JADX INFO: renamed from: a */
    public final GoogleSignInOptions f137843a;

    public n9x0(Context context, Looper looper, ClientSettings clientSettings, @Nullable GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.C2080a c2080a = googleSignInOptions != null ? new GoogleSignInOptions.C2080a(googleSignInOptions) : new GoogleSignInOptions.C2080a();
        c2080a.m12439g(dgr0.m111734a());
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            Iterator<Scope> it = clientSettings.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                c2080a.m12438f(it.next(), new Scope[0]);
            }
        }
        this.f137843a = c2080a.m12433a();
    }

    /* JADX INFO: renamed from: c */
    public final GoogleSignInOptions m158568c() {
        return this.f137843a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof yqy0 ? (yqy0) iInterfaceQueryLocalInterface : new fpy0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        return diw0.m111931b(getContext(), this.f137843a);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }
}
