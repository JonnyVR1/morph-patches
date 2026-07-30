package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class fsu0 extends vcl0.AbstractC20809a {

    /* JADX INFO: renamed from: a */
    public final ulu0 f100688a;

    public fsu0(ulu0 ulu0Var) {
        this.f100688a = ulu0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static atu0 m127259f(ulu0 ulu0Var) {
        lpu0 lpu0VarM196587W = ulu0Var.m196587W();
        if (lpu0VarM196587W == null) {
            return null;
        }
        try {
            return lpu0VarM196587W.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p153l.vcl0.AbstractC20809a
    /* JADX INFO: renamed from: a */
    public final void mo127260a() {
        atu0 atu0VarM127259f = m127259f(this.f100688a);
        if (atu0VarM127259f == null) {
            return;
        }
        try {
            atu0VarM127259f.zze();
        } catch (RemoteException e) {
            dct0.m115299h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p153l.vcl0.AbstractC20809a
    /* JADX INFO: renamed from: c */
    public final void mo127261c() {
        atu0 atu0VarM127259f = m127259f(this.f100688a);
        if (atu0VarM127259f == null) {
            return;
        }
        try {
            atu0VarM127259f.zzg();
        } catch (RemoteException e) {
            dct0.m115299h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p153l.vcl0.AbstractC20809a
    /* JADX INFO: renamed from: e */
    public final void mo127262e() {
        atu0 atu0VarM127259f = m127259f(this.f100688a);
        if (atu0VarM127259f == null) {
            return;
        }
        try {
            atu0VarM127259f.zzi();
        } catch (RemoteException e) {
            dct0.m115299h("Unable to call onVideoEnd()", e);
        }
    }
}
