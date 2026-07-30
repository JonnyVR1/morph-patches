package p149l;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class ior0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Location f114196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ior0(rrr0 rrr0Var, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f114196a = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220483r(this.f114196a, rrr0.m180569a(this));
    }
}
