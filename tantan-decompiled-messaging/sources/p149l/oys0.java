package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class oys0 extends s0d0 {

    /* JADX INFO: renamed from: a */
    public final String f146347a;

    /* JADX INFO: renamed from: b */
    public final fys0 f146348b;

    /* JADX INFO: renamed from: c */
    public final Context f146349c;

    /* JADX INFO: renamed from: d */
    public final ezs0 f146350d = new ezs0();

    /* JADX INFO: renamed from: e */
    @Nullable
    public m9j f146351e;

    public oys0(Context context, String str) {
        this.f146349c = context.getApplicationContext();
        this.f146347a = str;
        this.f146348b = exr0.m118702a().m156448n(context, str, new kns0());
    }

    @Override // p149l.s0d0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final kxc0 mo166695a() {
        ncu0 ncu0VarZzc = null;
        try {
            fys0 fys0Var = this.f146348b;
            if (fys0Var != null) {
                ncu0VarZzc = fys0Var.zzc();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        return kxc0.m147730e(ncu0VarZzc);
    }

    @Override // p149l.s0d0
    /* JADX INFO: renamed from: c */
    public final void mo166696c(@Nullable m9j m9jVar) {
        this.f146351e = m9jVar;
        this.f146350d.m119019o8(m9jVar);
    }

    @Override // p149l.s0d0
    /* JADX INFO: renamed from: d */
    public final void mo166697d(@NonNull Activity activity, @NonNull vg50 vg50Var) {
        this.f146350d.m119020p8(vg50Var);
        if (activity == null) {
            x2t0.m206869g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            fys0 fys0Var = this.f146348b;
            if (fys0Var != null) {
                fys0Var.mo104377R0(this.f146350d);
                this.f146348b.mo104379g0(s050.m181848Y2(activity));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m166698e(rou0 rou0Var, t0d0 t0d0Var) {
        try {
            fys0 fys0Var = this.f146348b;
            if (fys0Var != null) {
                fys0Var.mo104381s5(cfy0.f80684a.m106615a(this.f146349c, rou0Var), new bzs0(t0d0Var, this));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }
}
