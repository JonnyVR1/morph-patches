package p153l;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class p6t0 extends Api.AbstractClientBuilder<fry0, vd1.C20811a> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, vd1.C20811a c20811a, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new fry0(context, looper, clientSettings, c20811a, connectionCallbacks, onConnectionFailedListener);
    }
}
