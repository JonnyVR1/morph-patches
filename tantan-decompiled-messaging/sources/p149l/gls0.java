package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class gls0 extends cps0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GeofencingRequest f103394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PendingIntent f103395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gls0(nqs0 nqs0Var, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f103394a = geofencingRequest;
        this.f103395b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220474i(this.f103394a, this.f103395b, nqs0.m160694a(this));
    }
}
