package p149l;

import com.google.android.gms.internal.play_billing.zzgk;

/* JADX INFO: loaded from: classes6.dex */
public final class vkw0 extends xlw0 {

    /* JADX INFO: renamed from: a */
    public int f181854a = 0;

    /* JADX INFO: renamed from: b */
    public final int f181855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzgk f181856c;

    public vkw0(zzgk zzgkVar) {
        this.f181856c = zzgkVar;
        this.f181855b = zzgkVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f181854a < this.f181855b;
    }

    @Override // p149l.nnw0
    public final byte zza() {
        int i = this.f181854a;
        if (i < this.f181855b) {
            this.f181854a = i + 1;
            return this.f181856c.zzb(i);
        }
        lmr.m150601a();
        return (byte) 0;
    }
}
