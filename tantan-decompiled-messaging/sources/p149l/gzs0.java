package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class gzs0 extends u0d0 {

    /* JADX INFO: renamed from: a */
    public final String f105170a;

    /* JADX INFO: renamed from: b */
    public final fys0 f105171b;

    /* JADX INFO: renamed from: c */
    public final Context f105172c;

    /* JADX INFO: renamed from: d */
    public final ezs0 f105173d = new ezs0();

    public gzs0(Context context, String str) {
        this.f105170a = str;
        this.f105172c = context.getApplicationContext();
        this.f105171b = exr0.m118702a().m156448n(context, str, new kns0());
    }

    @Override // p149l.u0d0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final kxc0 mo128910a() {
        ncu0 ncu0VarZzc = null;
        try {
            fys0 fys0Var = this.f105171b;
            if (fys0Var != null) {
                ncu0VarZzc = fys0Var.zzc();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        return kxc0.m147730e(ncu0VarZzc);
    }

    @Override // p149l.u0d0
    /* JADX INFO: renamed from: c */
    public final void mo128911c(@NonNull Activity activity, @NonNull vg50 vg50Var) {
        this.f105173d.m119020p8(vg50Var);
        try {
            fys0 fys0Var = this.f105171b;
            if (fys0Var != null) {
                fys0Var.mo104377R0(this.f105173d);
                this.f105171b.mo104379g0(s050.m181848Y2(activity));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128912d(rou0 rou0Var, v0d0 v0d0Var) {
        try {
            fys0 fys0Var = this.f105171b;
            if (fys0Var != null) {
                fys0Var.mo104375M5(cfy0.f80684a.m106615a(this.f105172c, rou0Var), new fzs0(v0d0Var, this));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }
}
