package p153l;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class z6v0 extends z3t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a7v0 f203195a;

    public z6v0(a7v0 a7v0Var) {
        this.f203195a = a7v0Var;
    }

    @Override // p153l.a4t0
    /* JADX INFO: renamed from: W */
    public final void mo95989W(zzbb zzbbVar) {
        this.f203195a.f68844a.m190495c(zzbbVar.m12399F());
    }

    @Override // p153l.a4t0
    /* JADX INFO: renamed from: a0 */
    public final void mo95990a0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f203195a.f68844a.m190494b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
