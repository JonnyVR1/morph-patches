package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class u6t0 extends c8t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationSettingsRequest f177804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6t0(g9t0 g9t0Var, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        this.f177804a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        f5u0 f5u0Var = (f5u0) anyClient;
        LocationSettingsRequest locationSettingsRequest = this.f177804a;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((oky0) f5u0Var.getService()).mo168075X2(locationSettingsRequest, new nst0(this), null);
    }
}
