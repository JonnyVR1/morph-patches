package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class ohr0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f144042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocationRequest f144043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohr0(rrr0 rrr0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f144042a = pendingIntent;
        this.f144043b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220480o(this.f144042a, this.f144043b, rrr0.m180569a(this));
    }
}
