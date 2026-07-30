package p153l;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g1t0 extends md20 {

    /* JADX INFO: renamed from: a */
    public final nns0 f101774a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final f1t0 f101776c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final md20.AbstractC18589a f101777d;

    /* JADX INFO: renamed from: b */
    public final List f101775b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List f101778e = new ArrayList();

    public g1t0(nns0 nns0Var) {
        f1t0 f1t0Var;
        this.f101774a = nns0Var;
        u0t0 u0t0Var = null;
        try {
            List listZzu = nns0Var.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    als0 als0VarM220161o8 = obj instanceof IBinder ? zks0.m220161o8((IBinder) obj) : null;
                    if (als0VarM220161o8 != null) {
                        this.f101775b.add(new f1t0(als0VarM220161o8));
                    }
                }
            }
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
        try {
            List listMo99775b = this.f101774a.mo99775b();
            if (listMo99775b != null) {
                for (Object obj2 : listMo99775b) {
                    czt0 czt0VarM174247o8 = obj2 instanceof IBinder ? pxt0.m174247o8((IBinder) obj2) : null;
                    if (czt0VarM174247o8 != null) {
                        this.f101778e.add(new j0u0(czt0VarM174247o8));
                    }
                }
            }
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
        try {
            als0 als0VarZzk = this.f101774a.zzk();
            f1t0Var = als0VarZzk != null ? new f1t0(als0VarZzk) : null;
        } catch (RemoteException e3) {
            dct0.m115296e("", e3);
        }
        this.f101776c = f1t0Var;
        try {
            if (this.f101774a.zzi() != null) {
                u0t0Var = new u0t0(this.f101774a.zzi());
            }
        } catch (RemoteException e4) {
            dct0.m115296e("", e4);
        }
        this.f101777d = u0t0Var;
    }

    @Override // p153l.md20
    /* JADX INFO: renamed from: a */
    public final void mo128555a() {
        try {
            this.f101774a.mo99776g();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo128556b() {
        try {
            return this.f101774a.zzo();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: c */
    public final String mo128557c() {
        try {
            return this.f101774a.zzp();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: d */
    public final String mo128558d() {
        try {
            return this.f101774a.mo99774a();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: e */
    public final md20.AbstractC18590b mo128559e() {
        return this.f101776c;
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: f */
    public final dsx mo128560f() {
        try {
            if (this.f101774a.zzj() != null) {
                return new lkv0(this.f101774a.zzj(), null);
            }
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
        return null;
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: g */
    public final n5d0 mo128561g() {
        tlu0 tlu0VarZzg;
        try {
            tlu0VarZzg = this.f101774a.zzg();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            tlu0VarZzg = null;
        }
        return n5d0.m161698d(tlu0VarZzg);
    }

    @Override // p153l.md20
    @Nullable
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo128562h() {
        try {
            return this.f101774a.zzm();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }
}
