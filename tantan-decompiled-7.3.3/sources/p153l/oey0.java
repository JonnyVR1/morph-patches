package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class oey0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ way0 f147025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy0 f147026b;

    public oey0(hcy0 hcy0Var, way0 way0Var) {
        this.f147025a = way0Var;
        this.f147026b = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f147026b.f108759d;
        if (isw0Var == null) {
            this.f147026b.zzj().m114558A().m153300a("Failed to send current screen to service");
            return;
        }
        try {
            way0 way0Var = this.f147025a;
            if (way0Var == null) {
                isw0Var.mo112717j1(0L, null, null, this.f147026b.zza().getPackageName());
            } else {
                isw0Var.mo112717j1(way0Var.f188180c, way0Var.f188178a, way0Var.f188179b, this.f147026b.zza().getPackageName());
            }
            this.f147026b.m134527g0();
        } catch (RemoteException e) {
            this.f147026b.zzj().m114558A().m153301b("Failed to send current screen to the service", e);
        }
    }
}
