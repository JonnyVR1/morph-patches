package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class nwv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f144048e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f144049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwv0(zyu0 zyu0Var, boolean z) {
        super(zyu0Var);
        this.f144048e = z;
        this.f144049f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f144049f.f206644i)).setDataCollectionEnabled(this.f144048e);
    }
}
