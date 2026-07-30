package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class lpr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenerHolder f133115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocationRequest f133116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f133115a = listenerHolder;
        this.f133116b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124242m(new uyr0(this.f133115a), this.f133116b, x0s0.m208892a(this));
    }
}
