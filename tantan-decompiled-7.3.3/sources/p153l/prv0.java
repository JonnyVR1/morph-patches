package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class prv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f153852e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xhu0 f153853f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zyu0 f153854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prv0(zyu0 zyu0Var, String str, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f153852e = str;
        this.f153853f = xhu0Var;
        this.f153854g = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f153854g.f206644i)).getMaxUserProperties(this.f153852e, this.f153853f);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f153853f.zza(null);
    }
}
