package p149l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j1s0 extends uw0 {

    /* JADX INFO: renamed from: a */
    public final n1s0 f115838a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f115839b;

    /* JADX INFO: renamed from: c */
    public final k1s0 f115840c = new k1s0();

    public j1s0(n1s0 n1s0Var, String str) {
        this.f115838a = n1s0Var;
        this.f115839b = str;
    }

    @Override // p149l.uw0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final kxc0 mo139377a() {
        ncu0 ncu0VarZzf;
        try {
            ncu0VarZzf = this.f115838a.zzf();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            ncu0VarZzf = null;
        }
        return kxc0.m147730e(ncu0VarZzf);
    }

    @Override // p149l.uw0
    /* JADX INFO: renamed from: c */
    public final void mo139378c(@NonNull Activity activity) {
        try {
            this.f115838a.mo142392n5(s050.m181848Y2(activity), this.f115840c);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }
}
