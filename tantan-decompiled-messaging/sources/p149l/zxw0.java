package p149l;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class zxw0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rvw0 f205565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxw0(rvw0 rvw0Var, Handler handler) {
        super(null);
        this.f205565a = rvw0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f205565a.f161275a.set(true);
    }
}
