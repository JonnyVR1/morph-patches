package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class v4w0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f182434e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f182435f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f182436g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f182437h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f182438i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f182439j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ zyu0 f182440k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4w0(zyu0 zyu0Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zyu0Var);
        this.f182434e = l2;
        this.f182435f = str;
        this.f182436g = str2;
        this.f182437h = bundle;
        this.f182438i = z;
        this.f182439j = z2;
        this.f182440k = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        Long l2 = this.f182434e;
        ((pgu0) Preconditions.checkNotNull(this.f182440k.f206644i)).logEvent(this.f182435f, this.f182436g, this.f182437h, this.f182438i, this.f182439j, l2 == null ? this.f206645a : l2.longValue());
    }
}
