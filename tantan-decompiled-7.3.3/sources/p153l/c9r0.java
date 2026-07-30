package p153l;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class c9r0 extends Api.AbstractClientBuilder<aor0, zd1> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, zd1 zd1Var, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new aor0(context, looper, clientSettings, zd1Var, connectionCallbacks, onConnectionFailedListener);
    }
}
