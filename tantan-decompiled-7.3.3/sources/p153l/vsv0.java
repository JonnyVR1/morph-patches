package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class vsv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f185668e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xhu0 f185669f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zyu0 f185670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsv0(zyu0 zyu0Var, Bundle bundle, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f185668e = bundle;
        this.f185669f = xhu0Var;
        this.f185670g = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f185670g.f206644i)).performAction(this.f185668e, this.f185669f, this.f206645a);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f185669f.zza(null);
    }
}
