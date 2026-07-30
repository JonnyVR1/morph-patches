package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class nfv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f141763e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f141764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfv0(zyu0 zyu0Var, String str) {
        super(zyu0Var);
        this.f141763e = str;
        this.f141764f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f141764f.f206644i)).endAdUnitExposure(this.f141763e, this.f206646b);
    }
}
