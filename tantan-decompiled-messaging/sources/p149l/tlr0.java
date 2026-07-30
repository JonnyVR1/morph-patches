package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class tlr0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationCallback f171042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlr0(rrr0 rrr0Var, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f171042a = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220469d(ListenerHolders.createListenerKey(this.f171042a, LocationCallback.class.getSimpleName()), true, rrr0.m180569a(this));
    }
}
