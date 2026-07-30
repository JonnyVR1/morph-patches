package p153l;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class j4v0 extends c4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k4v0 f118330a;

    public j4v0(k4v0 k4v0Var) {
        this.f118330a = k4v0Var;
    }

    @Override // p153l.n4t0
    /* JADX INFO: renamed from: W */
    public final void mo102537W(zzbb zzbbVar) {
        this.f118330a.f123931a.m190495c(zzbbVar.m12399F());
    }

    @Override // p153l.n4t0
    /* JADX INFO: renamed from: a0 */
    public final void mo102538a0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f118330a.f123931a.m190494b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
