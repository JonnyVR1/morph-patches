package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class jiv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f118139e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ r8u0 f118140f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tpu0 f118141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiv0(tpu0 tpu0Var, String str, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f118139e = str;
        this.f118140f = r8u0Var;
        this.f118141g = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f118141g.f171518i)).getMaxUserProperties(this.f118139e, this.f118140f);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f118140f.zza(null);
    }
}
