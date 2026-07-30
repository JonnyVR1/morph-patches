package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class oxs0 extends wys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationSettingsRequest f146248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxs0(a0t0 a0t0Var, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        this.f146248a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zvt0 zvt0Var = (zvt0) anyClient;
        LocationSettingsRequest locationSettingsRequest = this.f146248a;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((iby0) zvt0Var.getService()).mo135286X2(locationSettingsRequest, new hjt0(this), null);
    }
}
