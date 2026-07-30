package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class ppv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ r8u0 f150722e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f150723f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tpu0 f150724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppv0(tpu0 tpu0Var, r8u0 r8u0Var, int i) {
        super(tpu0Var);
        this.f150722e = r8u0Var;
        this.f150723f = i;
        this.f150724g = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f150724g.f171518i)).getTestFlag(this.f150722e, this.f150723f);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f150722e.zza(null);
    }
}
