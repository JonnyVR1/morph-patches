package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class v4v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f182430e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f182431f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f182432g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zyu0 f182433h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4v0(zyu0 zyu0Var, String str, String str2, Bundle bundle) {
        super(zyu0Var);
        this.f182430e = str;
        this.f182431f = str2;
        this.f182432g = bundle;
        this.f182433h = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f182433h.f206644i)).clearConditionalUserProperty(this.f182430e, this.f182431f, this.f182432g);
    }
}
