package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ziu0 extends q3l0.AbstractC19424a {

    /* JADX INFO: renamed from: a */
    public final ocu0 f203354a;

    public ziu0(ocu0 ocu0Var) {
        this.f203354a = ocu0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static uju0 m219073f(ocu0 ocu0Var) {
        fgu0 fgu0VarM163580W = ocu0Var.m163580W();
        if (fgu0VarM163580W == null) {
            return null;
        }
        try {
            return fgu0VarM163580W.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p149l.q3l0.AbstractC19424a
    /* JADX INFO: renamed from: a */
    public final void mo172885a() {
        uju0 uju0VarM219073f = m219073f(this.f203354a);
        if (uju0VarM219073f == null) {
            return;
        }
        try {
            uju0VarM219073f.zze();
        } catch (RemoteException e) {
            x2t0.m206870h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p149l.q3l0.AbstractC19424a
    /* JADX INFO: renamed from: c */
    public final void mo172887c() {
        uju0 uju0VarM219073f = m219073f(this.f203354a);
        if (uju0VarM219073f == null) {
            return;
        }
        try {
            uju0VarM219073f.zzg();
        } catch (RemoteException e) {
            x2t0.m206870h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p149l.q3l0.AbstractC19424a
    /* JADX INFO: renamed from: e */
    public final void mo172889e() {
        uju0 uju0VarM219073f = m219073f(this.f203354a);
        if (uju0VarM219073f == null) {
            return;
        }
        try {
            uju0VarM219073f.zzi();
        } catch (RemoteException e) {
            x2t0.m206870h("Unable to call onVideoEnd()", e);
        }
    }
}
