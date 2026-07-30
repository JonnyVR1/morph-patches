package p153l;

import com.google.android.gms.internal.ads.zzgyl;

/* JADX INFO: loaded from: classes6.dex */
public final class kgx0 extends mgx0 {

    /* JADX INFO: renamed from: a */
    public int f126664a = 0;

    /* JADX INFO: renamed from: b */
    public final int f126665b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzgyl f126666c;

    public kgx0(zzgyl zzgylVar) {
        this.f126666c = zzgylVar;
        this.f126665b = zzgylVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126664a < this.f126665b;
    }

    @Override // p153l.ngx0
    public final byte zza() {
        int i = this.f126664a;
        if (i < this.f126665b) {
            this.f126664a = i + 1;
            return this.f126666c.zzb(i);
        }
        mor.m159308a();
        return (byte) 0;
    }
}
