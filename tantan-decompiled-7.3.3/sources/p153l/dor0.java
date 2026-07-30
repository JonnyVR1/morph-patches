package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class dor0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenerHolder f89996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocationRequest f89997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dor0(x0s0 x0s0Var, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f89996a = listenerHolder;
        this.f89997b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124243n(new uyr0(this.f89996a), this.f89997b, x0s0.m208892a(this));
    }
}
