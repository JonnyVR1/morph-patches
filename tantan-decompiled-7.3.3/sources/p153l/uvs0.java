package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class uvs0 extends iys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f181167a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvs0(tzs0 tzs0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f181167a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124245p(this.f181167a, tzs0.m193735a(this));
    }
}
