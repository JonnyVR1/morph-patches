package p149l;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class fbv0 implements gjx {

    /* JADX INFO: renamed from: a */
    public final rbs0 f96752a;

    /* JADX INFO: renamed from: b */
    public final q3l0 f96753b = new q3l0();

    /* JADX INFO: renamed from: c */
    @Nullable
    public final vcs0 f96754c;

    public fbv0(rbs0 rbs0Var, @Nullable vcs0 vcs0Var) {
        this.f96752a = rbs0Var;
        this.f96754c = vcs0Var;
    }

    @Override // p149l.gjx
    /* JADX INFO: renamed from: a */
    public final boolean mo120409a() {
        try {
            return this.f96752a.zzl();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return false;
        }
    }

    @Override // p149l.gjx
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Drawable mo120410b() {
        try {
            uyl uylVarZzi = this.f96752a.zzi();
            if (uylVarZzi != null) {
                return (Drawable) s050.m181847P2(uylVarZzi);
            }
            return null;
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }

    @Override // p149l.gjx
    /* JADX INFO: renamed from: c */
    public final float mo120411c() {
        try {
            return this.f96752a.zze();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    public final rbs0 m120412d() {
        return this.f96752a;
    }

    @Override // p149l.gjx
    @Nullable
    public final vcs0 zza() {
        return this.f96754c;
    }

    @Override // p149l.gjx
    public final boolean zzb() {
        try {
            return this.f96752a.zzk();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return false;
        }
    }
}
