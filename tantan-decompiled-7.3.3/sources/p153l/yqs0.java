package p153l;

import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;

/* JADX INFO: loaded from: classes6.dex */
public final class yqs0 implements RemoteCall, utt0 {

    /* JADX INFO: renamed from: a */
    public final pps0 f201237a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public ListenerHolder f201238b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f201239c = true;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vrs0 f201240d;

    public yqs0(vrs0 vrs0Var, ListenerHolder listenerHolder, pps0 pps0Var) {
        this.f201240d = vrs0Var;
        this.f201238b = listenerHolder;
        this.f201237a = pps0Var;
    }

    @Override // p153l.utt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo176883a(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f201238b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f201238b = listenerHolder;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        f5u0 f5u0Var = (f5u0) obj;
        sni0 sni0Var = (sni0) obj2;
        synchronized (this) {
            listenerKey = this.f201238b.getListenerKey();
            z = this.f201239c;
            this.f201238b.clear();
        }
        if (listenerKey == null) {
            sni0Var.m186941c(Boolean.FALSE);
        } else {
            this.f201237a.mo171884a(f5u0Var, listenerKey, z, sni0Var);
        }
    }

    @Override // p153l.utt0
    public final synchronized ListenerHolder zza() {
        return this.f201238b;
    }

    @Override // p153l.utt0
    public final void zzb() {
        ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.f201239c = false;
            listenerKey = this.f201238b.getListenerKey();
        }
        if (listenerKey != null) {
            this.f201240d.doUnregisterEventListener(listenerKey, 2441);
        }
    }
}
