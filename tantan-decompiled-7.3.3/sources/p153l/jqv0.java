package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class jqv0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f122253f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f122254g;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ zyu0 f122257j;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f122252e = 5;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f122255h = null;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f122256i = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqv0(zyu0 zyu0Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f122253f = str;
        this.f122254g = obj;
        this.f122257j = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f122257j.f206644i)).logHealthData(this.f122252e, this.f122253f, h950.m134038Y2(this.f122254g), h950.m134038Y2(null), h950.m134038Y2(null));
    }
}
