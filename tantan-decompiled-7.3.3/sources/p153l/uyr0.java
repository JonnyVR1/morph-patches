package p153l;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class uyr0 implements utt0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public ListenerHolder f181660a;

    public uyr0(ListenerHolder listenerHolder) {
        this.f181660a = listenerHolder;
    }

    @Override // p153l.utt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo176883a(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f181660a;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f181660a = listenerHolder;
        }
    }

    @Override // p153l.utt0
    public final synchronized ListenerHolder zza() {
        return this.f181660a;
    }

    @Override // p153l.utt0
    public final void zzb() {
    }
}
