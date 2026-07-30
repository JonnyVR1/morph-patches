package p153l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class fks0 extends zks0 {

    /* JADX INFO: renamed from: a */
    public final Drawable f99560a;

    /* JADX INFO: renamed from: b */
    public final Uri f99561b;

    /* JADX INFO: renamed from: c */
    public final double f99562c;

    /* JADX INFO: renamed from: d */
    public final int f99563d;

    /* JADX INFO: renamed from: e */
    public final int f99564e;

    public fks0(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f99560a = drawable;
        this.f99561b = uri;
        this.f99562c = d;
        this.f99563d = i;
        this.f99564e = i2;
    }

    @Override // p153l.als0
    public final double zzb() {
        return this.f99562c;
    }

    @Override // p153l.als0
    public final int zzc() {
        return this.f99564e;
    }

    @Override // p153l.als0
    public final int zzd() {
        return this.f99563d;
    }

    @Override // p153l.als0
    public final Uri zze() throws RemoteException {
        return this.f99561b;
    }

    @Override // p153l.als0
    public final p1m zzf() throws RemoteException {
        return h950.m134038Y2(this.f99560a);
    }
}
