package p153l;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class sxt0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yyt0 f171193a;

    public sxt0(yyt0 yyt0Var) {
        this.f171193a = yyt0Var;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.f171193a.f202130a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
