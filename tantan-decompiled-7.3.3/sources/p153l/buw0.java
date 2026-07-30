package p153l;

import com.google.android.gms.internal.play_billing.zzgk;

/* JADX INFO: loaded from: classes6.dex */
public final class buw0 extends dvw0 {

    /* JADX INFO: renamed from: a */
    public int f78554a = 0;

    /* JADX INFO: renamed from: b */
    public final int f78555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzgk f78556c;

    public buw0(zzgk zzgkVar) {
        this.f78556c = zzgkVar;
        this.f78555b = zzgkVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f78554a < this.f78555b;
    }

    @Override // p153l.tww0
    public final byte zza() {
        int i = this.f78554a;
        if (i < this.f78555b) {
            this.f78554a = i + 1;
            return this.f78556c.zzb(i);
        }
        mor.m159308a();
        return (byte) 0;
    }
}
