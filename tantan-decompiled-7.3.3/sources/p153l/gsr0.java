package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

/* JADX INFO: loaded from: classes6.dex */
public final class gsr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationListener f106326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f106326a = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124234e(ListenerHolders.createListenerKey(this.f106326a, LocationListener.class.getSimpleName()), true, x0s0.m208892a(this));
    }
}
