package p153l;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class bex0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kcx0 f76423a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bex0(kcx0 kcx0Var, Handler handler) {
        super(null);
        this.f76423a = kcx0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f76423a.m149138e();
    }
}
