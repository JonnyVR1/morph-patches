package p153l;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class lkv0 implements dsx {

    /* JADX INFO: renamed from: a */
    public final xks0 f132499a;

    /* JADX INFO: renamed from: b */
    public final vcl0 f132500b = new vcl0();

    /* JADX INFO: renamed from: c */
    @Nullable
    public final bms0 f132501c;

    public lkv0(xks0 xks0Var, @Nullable bms0 bms0Var) {
        this.f132499a = xks0Var;
        this.f132501c = bms0Var;
    }

    @Override // p153l.dsx
    /* JADX INFO: renamed from: a */
    public final boolean mo117781a() {
        try {
            return this.f132499a.zzl();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return false;
        }
    }

    @Override // p153l.dsx
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Drawable mo117782b() {
        try {
            p1m p1mVarZzi = this.f132499a.zzi();
            if (p1mVarZzi != null) {
                return (Drawable) h950.m134037P2(p1mVarZzi);
            }
            return null;
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }

    @Override // p153l.dsx
    /* JADX INFO: renamed from: c */
    public final float mo117783c() {
        try {
            return this.f132499a.zze();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    public final xks0 m154657d() {
        return this.f132499a;
    }

    @Override // p153l.dsx
    @Nullable
    public final bms0 zza() {
        return this.f132501c;
    }

    @Override // p153l.dsx
    public final boolean zzb() {
        try {
            return this.f132499a.zzk();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return false;
        }
    }
}
