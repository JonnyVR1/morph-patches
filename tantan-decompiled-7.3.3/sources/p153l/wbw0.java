package p153l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class wbw0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f188292e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zyu0.C21941d f188293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbw0(zyu0.C21941d c21941d, Activity activity) {
        super(zyu0.this);
        this.f188292e = activity;
        this.f188293f = c21941d;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(zyu0.this.f206644i)).onActivityDestroyed(h950.m134038Y2(this.f188292e), this.f206646b);
    }
}
