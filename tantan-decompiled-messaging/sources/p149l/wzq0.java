package p149l;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class wzq0 extends Api.AbstractClientBuilder<uer0, sd1> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, sd1 sd1Var, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new uer0(context, looper, clientSettings, sd1Var, connectionCallbacks, onConnectionFailedListener);
    }
}
