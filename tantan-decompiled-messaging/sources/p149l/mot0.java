package p149l;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class mot0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt0 f134954a;

    public mot0(spt0 spt0Var) {
        this.f134954a = spt0Var;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.f134954a.f165880a.zzb();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
