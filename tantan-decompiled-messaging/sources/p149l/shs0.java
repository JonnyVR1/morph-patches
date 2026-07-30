package p149l;

import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;

/* JADX INFO: loaded from: classes6.dex */
public final class shs0 implements RemoteCall, okt0 {

    /* JADX INFO: renamed from: a */
    public final jgs0 f164627a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public ListenerHolder f164628b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f164629c = true;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pis0 f164630d;

    public shs0(pis0 pis0Var, ListenerHolder listenerHolder, jgs0 jgs0Var) {
        this.f164630d = pis0Var;
        this.f164628b = listenerHolder;
        this.f164627a = jgs0Var;
    }

    @Override // p149l.okt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo145180a(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f164628b;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f164628b = listenerHolder;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        zvt0 zvt0Var = (zvt0) obj;
        sei0 sei0Var = (sei0) obj2;
        synchronized (this) {
            listenerKey = this.f164628b.getListenerKey();
            z = this.f164629c;
            this.f164628b.clear();
        }
        if (listenerKey == null) {
            sei0Var.m183659c(Boolean.FALSE);
        } else {
            this.f164627a.mo139777a(zvt0Var, listenerKey, z, sei0Var);
        }
    }

    @Override // p149l.okt0
    public final synchronized ListenerHolder zza() {
        return this.f164628b;
    }

    @Override // p149l.okt0
    public final void zzb() {
        ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.f164629c = false;
            listenerKey = this.f164628b.getListenerKey();
        }
        if (listenerKey != null) {
            this.f164630d.doUnregisterEventListener(listenerKey, 2441);
        }
    }
}
