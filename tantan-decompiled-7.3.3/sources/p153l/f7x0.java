package p153l;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class f7x0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x4x0 f97676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7x0(x4x0 x4x0Var, Handler handler) {
        super(null);
        this.f97676a = x4x0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f97676a.f192434a.set(true);
    }
}
