package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class tmv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f175194e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f175195f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f175196g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xhu0 f175197h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zyu0 f175198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmv0(zyu0 zyu0Var, String str, String str2, boolean z, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f175194e = str;
        this.f175195f = str2;
        this.f175196g = z;
        this.f175197h = xhu0Var;
        this.f175198i = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f175198i.f206644i)).getUserProperties(this.f175194e, this.f175195f, this.f175196g, this.f175197h);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f175197h.zza(null);
    }
}
