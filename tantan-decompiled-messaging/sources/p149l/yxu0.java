package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class yxu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f200665e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0 f200666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxu0(tpu0 tpu0Var, String str) {
        super(tpu0Var);
        this.f200665e = str;
        this.f200666f = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f200666f.f171518i)).setUserId(this.f200665e, this.f171519a);
    }
}
