package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class dpv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zyu0.BinderC21940c f90090e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0 f90091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpv0(zyu0 zyu0Var, zyu0.BinderC21940c binderC21940c) {
        super(zyu0Var);
        this.f90090e = binderC21940c;
        this.f90091f = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f90091f.f206644i)).setEventInterceptor(this.f90090e);
    }
}
