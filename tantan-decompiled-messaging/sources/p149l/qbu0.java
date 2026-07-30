package p149l;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class qbu0 extends qbs0 {

    /* JADX INFO: renamed from: a */
    public final ocu0 f153698a;

    /* JADX INFO: renamed from: b */
    public uyl f153699b;

    public qbu0(ocu0 ocu0Var) {
        this.f153698a = ocu0Var;
    }

    /* JADX INFO: renamed from: o8 */
    public static float m173844o8(uyl uylVar) {
        Drawable drawable;
        if (uylVar == null || (drawable = (Drawable) s050.m181847P2(uylVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // p149l.rbs0
    /* JADX INFO: renamed from: E */
    public final void mo173845E(uyl uylVar) {
        this.f153699b = uylVar;
    }

    @Override // p149l.rbs0
    /* JADX INFO: renamed from: s2 */
    public final void mo173846s2(jds0 jds0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue() && (this.f153698a.m163580W() instanceof sat0)) {
            ((sat0) this.f153698a.m163580W()).m183096u8(jds0Var);
        }
    }

    @Override // p149l.rbs0
    public final float zze() throws RemoteException {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132319m6)).booleanValue()) {
            return 0.0f;
        }
        float fM163572O = this.f153698a.m163572O();
        ocu0 ocu0Var = this.f153698a;
        if (fM163572O != 0.0f) {
            return ocu0Var.m163572O();
        }
        if (ocu0Var.m163580W() != null) {
            try {
                return this.f153698a.m163580W().zze();
            } catch (RemoteException e) {
                x2t0.m206867e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        uyl uylVar = this.f153699b;
        if (uylVar != null) {
            return m173844o8(uylVar);
        }
        ubs0 ubs0VarM163583Z = this.f153698a.m163583Z();
        if (ubs0VarM163583Z == null) {
            return 0.0f;
        }
        float fZzd = (ubs0VarM163583Z.zzd() == -1 || ubs0VarM163583Z.zzc() == -1) ? 0.0f : ubs0VarM163583Z.zzd() / ubs0VarM163583Z.zzc();
        return fZzd == 0.0f ? m173844o8(ubs0VarM163583Z.zzf()) : fZzd;
    }

    @Override // p149l.rbs0
    public final float zzf() throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue() && this.f153698a.m163580W() != null) {
            return this.f153698a.m163580W().zzf();
        }
        return 0.0f;
    }

    @Override // p149l.rbs0
    public final float zzg() throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue() && this.f153698a.m163580W() != null) {
            return this.f153698a.m163580W().zzg();
        }
        return 0.0f;
    }

    @Override // p149l.rbs0
    @Nullable
    public final fgu0 zzh() throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue()) {
            return this.f153698a.m163580W();
        }
        return null;
    }

    @Override // p149l.rbs0
    @Nullable
    public final uyl zzi() throws RemoteException {
        uyl uylVar = this.f153699b;
        if (uylVar != null) {
            return uylVar;
        }
        ubs0 ubs0VarM163583Z = this.f153698a.m163583Z();
        if (ubs0VarM163583Z == null) {
            return null;
        }
        return ubs0VarM163583Z.zzf();
    }

    @Override // p149l.rbs0
    public final boolean zzk() throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue()) {
            return this.f153698a.m163571G();
        }
        return false;
    }

    @Override // p149l.rbs0
    public final boolean zzl() throws RemoteException {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132332n6)).booleanValue() && this.f153698a.m163580W() != null;
    }
}
