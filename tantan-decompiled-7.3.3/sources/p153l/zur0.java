package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class zur0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationCallback f206151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zur0(x0s0 x0s0Var, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f206151a = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124233d(ListenerHolders.createListenerKey(this.f206151a, LocationCallback.class.getSimpleName()), true, x0s0.m208892a(this));
    }
}
