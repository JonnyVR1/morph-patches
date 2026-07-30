package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wns0 extends cps0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f187344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wns0(nqs0 nqs0Var, GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.f187344a = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220482q(this.f187344a, nqs0.m160694a(this));
    }
}
