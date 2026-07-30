package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class pvv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f151510e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f151511f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f151512g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f151513h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f151514i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f151515j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ tpu0 f151516k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvv0(tpu0 tpu0Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(tpu0Var);
        this.f151510e = l2;
        this.f151511f = str;
        this.f151512g = str2;
        this.f151513h = bundle;
        this.f151514i = z;
        this.f151515j = z2;
        this.f151516k = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        Long l2 = this.f151510e;
        ((j7u0) Preconditions.checkNotNull(this.f151516k.f171518i)).logEvent(this.f151511f, this.f151512g, this.f151513h, this.f151514i, this.f151515j, l2 == null ? this.f171519a : l2.longValue());
    }
}
