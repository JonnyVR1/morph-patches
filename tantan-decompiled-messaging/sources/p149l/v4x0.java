package p149l;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class v4x0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e3x0 f179979a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4x0(e3x0 e3x0Var, Handler handler) {
        super(null);
        this.f179979a = e3x0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f179979a.m114640e();
    }
}
