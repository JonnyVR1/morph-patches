package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ons0 extends mxj0 {

    /* JADX INFO: renamed from: a */
    public final nns0 f148124a;

    /* JADX INFO: renamed from: c */
    public final bls0 f148126c;

    /* JADX INFO: renamed from: e */
    public final nd20 f148128e;

    /* JADX INFO: renamed from: b */
    public final List f148125b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final vcl0 f148127d = new vcl0();

    /* JADX INFO: renamed from: f */
    public final List f148129f = new ArrayList();

    public ons0(nns0 nns0Var) {
        bls0 bls0Var;
        als0 yks0Var;
        this.f148124a = nns0Var;
        uks0 uks0Var = null;
        try {
            List listZzu = nns0Var.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        yks0Var = iInterfaceQueryLocalInterface instanceof als0 ? (als0) iInterfaceQueryLocalInterface : new yks0(iBinder);
                    } else {
                        yks0Var = null;
                    }
                    if (yks0Var != null) {
                        this.f148125b.add(new bls0(yks0Var));
                    }
                }
            }
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
        try {
            List listMo99775b = this.f148124a.mo99775b();
            if (listMo99775b != null) {
                for (Object obj2 : listMo99775b) {
                    czt0 czt0VarM174247o8 = obj2 instanceof IBinder ? pxt0.m174247o8((IBinder) obj2) : null;
                    if (czt0VarM174247o8 != null) {
                        this.f148129f.add(new j0u0(czt0VarM174247o8));
                    }
                }
            }
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
        try {
            als0 als0VarZzk = this.f148124a.zzk();
            bls0Var = als0VarZzk != null ? new bls0(als0VarZzk) : null;
        } catch (RemoteException e3) {
            dct0.m115296e("", e3);
        }
        this.f148126c = bls0Var;
        try {
            if (this.f148124a.zzi() != null) {
                uks0Var = new uks0(this.f148124a.zzi());
            }
        } catch (RemoteException e4) {
            dct0.m115296e("", e4);
        }
        this.f148128e = uks0Var;
    }

    @Override // p153l.mxj0
    /* JADX INFO: renamed from: a */
    public final vcl0 mo160681a() {
        try {
            if (this.f148124a.zzh() != null) {
                this.f148127d.m200829c(this.f148124a.zzh());
            }
        } catch (RemoteException e) {
            dct0.m115296e("Exception occurred while getting video controller", e);
        }
        return this.f148127d;
    }

    @Override // p153l.mxj0
    /* JADX INFO: renamed from: b */
    public final od20 mo160682b() {
        return this.f148126c;
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Double mo160683c() {
        try {
            double dZze = this.f148124a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object mo160684d() {
        try {
            p1m p1mVarZzl = this.f148124a.zzl();
            if (p1mVarZzl != null) {
                return h950.m134037P2(p1mVarZzl);
            }
            return null;
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final String mo160685e() {
        try {
            return this.f148124a.zzn();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final String mo160686f() {
        try {
            return this.f148124a.zzo();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo160687g() {
        try {
            return this.f148124a.zzp();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final String mo160688h() {
        try {
            return this.f148124a.mo99774a();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: i */
    public final String mo160689i() {
        try {
            return this.f148124a.zzs();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    @Nullable
    /* JADX INFO: renamed from: j */
    public final String mo160690j() {
        try {
            return this.f148124a.zzt();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.mxj0
    /* JADX INFO: renamed from: k */
    public final List mo160691k() {
        return this.f148125b;
    }
}
