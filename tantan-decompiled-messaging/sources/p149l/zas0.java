package p149l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zas0 extends tbs0 {

    /* JADX INFO: renamed from: a */
    public final Drawable f202396a;

    /* JADX INFO: renamed from: b */
    public final Uri f202397b;

    /* JADX INFO: renamed from: c */
    public final double f202398c;

    /* JADX INFO: renamed from: d */
    public final int f202399d;

    /* JADX INFO: renamed from: e */
    public final int f202400e;

    public zas0(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f202396a = drawable;
        this.f202397b = uri;
        this.f202398c = d;
        this.f202399d = i;
        this.f202400e = i2;
    }

    @Override // p149l.ubs0
    public final double zzb() {
        return this.f202398c;
    }

    @Override // p149l.ubs0
    public final int zzc() {
        return this.f202400e;
    }

    @Override // p149l.ubs0
    public final int zzd() {
        return this.f202399d;
    }

    @Override // p149l.ubs0
    public final Uri zze() throws RemoteException {
        return this.f202397b;
    }

    @Override // p149l.ubs0
    public final uyl zzf() throws RemoteException {
        return s050.m181848Y2(this.f202396a);
    }
}
