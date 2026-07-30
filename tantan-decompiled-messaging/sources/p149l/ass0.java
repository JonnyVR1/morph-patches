package p149l;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ass0 extends e520 {

    /* JADX INFO: renamed from: a */
    public final hes0 f71473a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final zrs0 f71475c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final e520.AbstractC16542a f71476d;

    /* JADX INFO: renamed from: b */
    public final List f71474b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List f71477e = new ArrayList();

    public ass0(hes0 hes0Var) {
        zrs0 zrs0Var;
        this.f71473a = hes0Var;
        ors0 ors0Var = null;
        try {
            List listZzu = hes0Var.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    ubs0 ubs0VarM187903o8 = obj instanceof IBinder ? tbs0.m187903o8((IBinder) obj) : null;
                    if (ubs0VarM187903o8 != null) {
                        this.f71474b.add(new zrs0(ubs0VarM187903o8));
                    }
                }
            }
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
        try {
            List listMo121067b = this.f71473a.mo121067b();
            if (listMo121067b != null) {
                for (Object obj2 : listMo121067b) {
                    wpt0 wpt0VarM142534o8 = obj2 instanceof IBinder ? jot0.m142534o8((IBinder) obj2) : null;
                    if (wpt0VarM142534o8 != null) {
                        this.f71477e.add(new drt0(wpt0VarM142534o8));
                    }
                }
            }
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
        try {
            ubs0 ubs0VarZzk = this.f71473a.zzk();
            zrs0Var = ubs0VarZzk != null ? new zrs0(ubs0VarZzk) : null;
        } catch (RemoteException e3) {
            x2t0.m206867e("", e3);
        }
        this.f71475c = zrs0Var;
        try {
            if (this.f71473a.zzi() != null) {
                ors0Var = new ors0(this.f71473a.zzi());
            }
        } catch (RemoteException e4) {
            x2t0.m206867e("", e4);
        }
        this.f71476d = ors0Var;
    }

    @Override // p149l.e520
    /* JADX INFO: renamed from: a */
    public final void mo98603a() {
        try {
            this.f71473a.mo121068g();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo98604b() {
        try {
            return this.f71473a.zzo();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: c */
    public final String mo98605c() {
        try {
            return this.f71473a.zzp();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: d */
    public final String mo98606d() {
        try {
            return this.f71473a.mo121066a();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: e */
    public final e520.AbstractC16543b mo98607e() {
        return this.f71475c;
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: f */
    public final gjx mo98608f() {
        try {
            if (this.f71473a.zzj() != null) {
                return new fbv0(this.f71473a.zzj(), null);
            }
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
        return null;
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: g */
    public final kxc0 mo98609g() {
        ncu0 ncu0VarZzg;
        try {
            ncu0VarZzg = this.f71473a.zzg();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            ncu0VarZzg = null;
        }
        return kxc0.m147729d(ncu0VarZzg);
    }

    @Override // p149l.e520
    @Nullable
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo98610h() {
        try {
            return this.f71473a.zzm();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }
}
