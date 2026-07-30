package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cxs0 extends iys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f84271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxs0(tzs0 tzs0Var, GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.f84271a = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124246q(this.f84271a, tzs0.m193735a(this));
    }
}
