package p153l;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class m1u0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u2u0 f134466a;

    public m1u0(u2u0 u2u0Var) {
        this.f134466a = u2u0Var;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.f134466a.f177245a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
