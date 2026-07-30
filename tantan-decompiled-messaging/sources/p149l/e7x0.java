package p149l;

import com.google.android.gms.internal.ads.zzgyl;

/* JADX INFO: loaded from: classes6.dex */
public final class e7x0 extends g7x0 {

    /* JADX INFO: renamed from: a */
    public int f89766a = 0;

    /* JADX INFO: renamed from: b */
    public final int f89767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzgyl f89768c;

    public e7x0(zzgyl zzgylVar) {
        this.f89768c = zzgylVar;
        this.f89767b = zzgylVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f89766a < this.f89767b;
    }

    @Override // p149l.h7x0
    public final byte zza() {
        int i = this.f89766a;
        if (i < this.f89767b) {
            this.f89766a = i + 1;
            return this.f89768c.zzb(i);
        }
        lmr.m150601a();
        return (byte) 0;
    }
}
