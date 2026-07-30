package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class e7v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f92470e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f92471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7v0(zyu0 zyu0Var, String str) {
        super(zyu0Var);
        this.f92470e = str;
        this.f92471f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f92471f.f206644i)).setUserId(this.f92470e, this.f206645a);
    }
}
