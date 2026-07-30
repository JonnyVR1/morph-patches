package p153l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class cdw0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f81286e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xhu0 f81287f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zyu0.C21941d f81288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdw0(zyu0.C21941d c21941d, Activity activity, xhu0 xhu0Var) {
        super(zyu0.this);
        this.f81286e = activity;
        this.f81287f = xhu0Var;
        this.f81288g = c21941d;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(zyu0.this.f206644i)).onActivitySaveInstanceState(h950.m134038Y2(this.f81286e), this.f81287f, this.f206646b);
    }
}
