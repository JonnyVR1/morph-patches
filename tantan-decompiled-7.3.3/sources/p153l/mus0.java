package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class mus0 extends iys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GeofencingRequest f138837a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PendingIntent f138838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mus0(tzs0 tzs0Var, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f138837a = geofencingRequest;
        this.f138838b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124238i(this.f138837a, this.f138838b, tzs0.m193735a(this));
    }
}
