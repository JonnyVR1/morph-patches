package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class uqr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f180502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocationRequest f180503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f180502a = pendingIntent;
        this.f180503b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124244o(this.f180502a, this.f180503b, x0s0.m208892a(this));
    }
}
