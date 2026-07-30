package p153l;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wku0 extends wks0 {

    /* JADX INFO: renamed from: a */
    public final ulu0 f189593a;

    /* JADX INFO: renamed from: b */
    public p1m f189594b;

    public wku0(ulu0 ulu0Var) {
        this.f189593a = ulu0Var;
    }

    /* JADX INFO: renamed from: o8 */
    public static float m206857o8(p1m p1mVar) {
        Drawable drawable;
        if (p1mVar == null || (drawable = (Drawable) h950.m134037P2(p1mVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // p153l.xks0
    /* JADX INFO: renamed from: E */
    public final void mo206858E(p1m p1mVar) {
        this.f189594b = p1mVar;
    }

    @Override // p153l.xks0
    /* JADX INFO: renamed from: s2 */
    public final void mo206859s2(pms0 pms0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue() && (this.f189593a.m196587W() instanceof yjt0)) {
            ((yjt0) this.f189593a.m196587W()).m216434u8(pms0Var);
        }
    }

    @Override // p153l.xks0
    public final float zze() throws RemoteException {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168390m6)).booleanValue()) {
            return 0.0f;
        }
        float fM196579O = this.f189593a.m196579O();
        ulu0 ulu0Var = this.f189593a;
        if (fM196579O != 0.0f) {
            return ulu0Var.m196579O();
        }
        if (ulu0Var.m196587W() != null) {
            try {
                return this.f189593a.m196587W().zze();
            } catch (RemoteException e) {
                dct0.m115296e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        p1m p1mVar = this.f189594b;
        if (p1mVar != null) {
            return m206857o8(p1mVar);
        }
        als0 als0VarM196590Z = this.f189593a.m196590Z();
        if (als0VarM196590Z == null) {
            return 0.0f;
        }
        float fZzd = (als0VarM196590Z.zzd() == -1 || als0VarM196590Z.zzc() == -1) ? 0.0f : als0VarM196590Z.zzd() / als0VarM196590Z.zzc();
        return fZzd == 0.0f ? m206857o8(als0VarM196590Z.zzf()) : fZzd;
    }

    @Override // p153l.xks0
    public final float zzf() throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue() && this.f189593a.m196587W() != null) {
            return this.f189593a.m196587W().zzf();
        }
        return 0.0f;
    }

    @Override // p153l.xks0
    public final float zzg() throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue() && this.f189593a.m196587W() != null) {
            return this.f189593a.m196587W().zzg();
        }
        return 0.0f;
    }

    @Override // p153l.xks0
    @Nullable
    public final lpu0 zzh() throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue()) {
            return this.f189593a.m196587W();
        }
        return null;
    }

    @Override // p153l.xks0
    @Nullable
    public final p1m zzi() throws RemoteException {
        p1m p1mVar = this.f189594b;
        if (p1mVar != null) {
            return p1mVar;
        }
        als0 als0VarM196590Z = this.f189593a.m196590Z();
        if (als0VarM196590Z == null) {
            return null;
        }
        return als0VarM196590Z.zzf();
    }

    @Override // p153l.xks0
    public final boolean zzk() throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue()) {
            return this.f189593a.m196578G();
        }
        return false;
    }

    @Override // p153l.xks0
    public final boolean zzl() throws RemoteException {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168403n6)).booleanValue() && this.f189593a.m196587W() != null;
    }
}
