package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class dhv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f86332f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f86333g;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ tpu0 f86336j;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f86331e = 5;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f86334h = null;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f86335i = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhv0(tpu0 tpu0Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f86332f = str;
        this.f86333g = obj;
        this.f86336j = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f86336j.f171518i)).logHealthData(this.f86331e, this.f86332f, s050.m181848Y2(this.f86333g), s050.m181848Y2(null), s050.m181848Y2(null));
    }
}
