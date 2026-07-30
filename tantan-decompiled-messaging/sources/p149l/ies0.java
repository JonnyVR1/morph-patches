package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ies0 extends joj0 {

    /* JADX INFO: renamed from: a */
    public final hes0 f112828a;

    /* JADX INFO: renamed from: c */
    public final vbs0 f112830c;

    /* JADX INFO: renamed from: e */
    public final f520 f112832e;

    /* JADX INFO: renamed from: b */
    public final List f112829b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final q3l0 f112831d = new q3l0();

    /* JADX INFO: renamed from: f */
    public final List f112833f = new ArrayList();

    public ies0(hes0 hes0Var) {
        vbs0 vbs0Var;
        ubs0 sbs0Var;
        this.f112828a = hes0Var;
        obs0 obs0Var = null;
        try {
            List listZzu = hes0Var.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        sbs0Var = iInterfaceQueryLocalInterface instanceof ubs0 ? (ubs0) iInterfaceQueryLocalInterface : new sbs0(iBinder);
                    } else {
                        sbs0Var = null;
                    }
                    if (sbs0Var != null) {
                        this.f112829b.add(new vbs0(sbs0Var));
                    }
                }
            }
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
        try {
            List listMo121067b = this.f112828a.mo121067b();
            if (listMo121067b != null) {
                for (Object obj2 : listMo121067b) {
                    wpt0 wpt0VarM142534o8 = obj2 instanceof IBinder ? jot0.m142534o8((IBinder) obj2) : null;
                    if (wpt0VarM142534o8 != null) {
                        this.f112833f.add(new drt0(wpt0VarM142534o8));
                    }
                }
            }
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
        try {
            ubs0 ubs0VarZzk = this.f112828a.zzk();
            vbs0Var = ubs0VarZzk != null ? new vbs0(ubs0VarZzk) : null;
        } catch (RemoteException e3) {
            x2t0.m206867e("", e3);
        }
        this.f112830c = vbs0Var;
        try {
            if (this.f112828a.zzi() != null) {
                obs0Var = new obs0(this.f112828a.zzi());
            }
        } catch (RemoteException e4) {
            x2t0.m206867e("", e4);
        }
        this.f112832e = obs0Var;
    }

    @Override // p149l.joj0
    /* JADX INFO: renamed from: a */
    public final q3l0 mo135717a() {
        try {
            if (this.f112828a.zzh() != null) {
                this.f112831d.m172884c(this.f112828a.zzh());
            }
        } catch (RemoteException e) {
            x2t0.m206867e("Exception occurred while getting video controller", e);
        }
        return this.f112831d;
    }

    @Override // p149l.joj0
    /* JADX INFO: renamed from: b */
    public final g520 mo135718b() {
        return this.f112830c;
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Double mo135719c() {
        try {
            double dZze = this.f112828a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object mo135720d() {
        try {
            uyl uylVarZzl = this.f112828a.zzl();
            if (uylVarZzl != null) {
                return s050.m181847P2(uylVarZzl);
            }
            return null;
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final String mo135721e() {
        try {
            return this.f112828a.zzn();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final String mo135722f() {
        try {
            return this.f112828a.zzo();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo135723g() {
        try {
            return this.f112828a.zzp();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final String mo135724h() {
        try {
            return this.f112828a.mo121066a();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: i */
    public final String mo135725i() {
        try {
            return this.f112828a.zzs();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    @Nullable
    /* JADX INFO: renamed from: j */
    public final String mo135726j() {
        try {
            return this.f112828a.zzt();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.joj0
    /* JADX INFO: renamed from: k */
    public final List mo135727k() {
        return this.f112829b;
    }
}
