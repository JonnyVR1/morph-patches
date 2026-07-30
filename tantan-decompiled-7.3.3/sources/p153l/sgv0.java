package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class sgv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f168563e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f168564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgv0(zyu0 zyu0Var, String str) {
        super(zyu0Var);
        this.f168563e = str;
        this.f168564f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f168564f.f206644i)).beginAdUnitExposure(this.f168563e, this.f206646b);
    }
}
