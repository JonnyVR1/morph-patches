package p153l;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class oxr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Location f149680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f149680a = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124247r(this.f149680a, x0s0.m208892a(this));
    }
}
