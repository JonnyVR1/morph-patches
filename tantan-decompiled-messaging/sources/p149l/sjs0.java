package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class sjs0 extends l70 {

    /* JADX INFO: renamed from: a */
    public final Context f164904a;

    /* JADX INFO: renamed from: b */
    public final cfy0 f164905b;

    /* JADX INFO: renamed from: c */
    public final ips0 f164906c;

    /* JADX INFO: renamed from: d */
    public final String f164907d;

    /* JADX INFO: renamed from: e */
    public final kns0 f164908e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public m9j f164909f;

    public sjs0(Context context, String str) {
        kns0 kns0Var = new kns0();
        this.f164908e = kns0Var;
        this.f164904a = context;
        this.f164907d = str;
        this.f164905b = cfy0.f80684a;
        this.f164906c = exr0.m118702a().m156443e(context, new zzq(), str, kns0Var);
    }

    @Override // p149l.a0n
    @NonNull
    /* JADX INFO: renamed from: a */
    public final kxc0 mo94454a() {
        ncu0 ncu0VarZzk = null;
        try {
            ips0 ips0Var = this.f164906c;
            if (ips0Var != null) {
                ncu0VarZzk = ips0Var.zzk();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        return kxc0.m147730e(ncu0VarZzk);
    }

    @Override // p149l.a0n
    /* JADX INFO: renamed from: c */
    public final void mo94455c(@Nullable m9j m9jVar) {
        try {
            this.f164909f = m9jVar;
            ips0 ips0Var = this.f164906c;
            if (ips0Var != null) {
                ips0Var.mo137582I3(new k2s0(m9jVar));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.a0n
    /* JADX INFO: renamed from: d */
    public final void mo94456d(boolean z) {
        try {
            ips0 ips0Var = this.f164906c;
            if (ips0Var != null) {
                ips0Var.mo137589Y3(z);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.a0n
    /* JADX INFO: renamed from: e */
    public final void mo94457e(@NonNull Activity activity) {
        if (activity == null) {
            x2t0.m206869g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ips0 ips0Var = this.f164906c;
            if (ips0Var != null) {
                ips0Var.mo137585P7(s050.m181848Y2(activity));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m184558f(rou0 rou0Var, i70 i70Var) {
        try {
            ips0 ips0Var = this.f164906c;
            if (ips0Var != null) {
                ips0Var.mo137602w7(this.f164905b.m106615a(this.f164904a, rou0Var), new j9x0(i70Var, this));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            i70Var.mo9290a(new irv(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
