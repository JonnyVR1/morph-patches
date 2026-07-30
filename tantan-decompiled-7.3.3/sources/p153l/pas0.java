package p153l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class pas0 extends bx0 {

    /* JADX INFO: renamed from: a */
    public final tas0 f151324a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f151325b;

    /* JADX INFO: renamed from: c */
    public final qas0 f151326c = new qas0();

    public pas0(tas0 tas0Var, String str) {
        this.f151324a = tas0Var;
        this.f151325b = str;
    }

    @Override // p153l.bx0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final n5d0 mo106822a() {
        tlu0 tlu0VarZzf;
        try {
            tlu0VarZzf = this.f151324a.zzf();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            tlu0VarZzf = null;
        }
        return n5d0.m161699e(tlu0VarZzf);
    }

    @Override // p153l.bx0
    /* JADX INFO: renamed from: c */
    public final void mo106823c(@NonNull Activity activity) {
        try {
            this.f151324a.mo174093n5(h950.m134038Y2(activity), this.f151326c);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }
}
