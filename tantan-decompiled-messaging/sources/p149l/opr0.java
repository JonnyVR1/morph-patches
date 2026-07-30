package p149l;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class opr0 implements okt0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public ListenerHolder f145046a;

    public opr0(ListenerHolder listenerHolder) {
        this.f145046a = listenerHolder;
    }

    @Override // p149l.okt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo145180a(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f145046a;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f145046a = listenerHolder;
        }
    }

    @Override // p149l.okt0
    public final synchronized ListenerHolder zza() {
        return this.f145046a;
    }

    @Override // p149l.okt0
    public final void zzb() {
    }
}
