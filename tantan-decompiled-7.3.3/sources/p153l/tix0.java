package p153l;

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
public final class tix0 extends GmsClient<e0z0> {

    /* JADX INFO: renamed from: a */
    public final GoogleSignInOptions f174516a;

    public tix0(Context context, Looper looper, ClientSettings clientSettings, @Nullable GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.C2103a c2103a = googleSignInOptions != null ? new GoogleSignInOptions.C2103a(googleSignInOptions) : new GoogleSignInOptions.C2103a();
        c2103a.m12493g(jpr0.m146518a());
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            Iterator<Scope> it = clientSettings.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                c2103a.m12492f(it.next(), new Scope[0]);
            }
        }
        this.f174516a = c2103a.m12487a();
    }

    /* JADX INFO: renamed from: c */
    public final GoogleSignInOptions m191353c() {
        return this.f174516a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e0z0 ? (e0z0) iInterfaceQueryLocalInterface : new lyy0(iBinder);
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
        return jrw0.m146824b(getContext(), this.f174516a);
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
