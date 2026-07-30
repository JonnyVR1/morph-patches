package p149l;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class txu0 extends tus0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uxu0 f172532a;

    public txu0(uxu0 uxu0Var) {
        this.f172532a = uxu0Var;
    }

    @Override // p149l.uus0
    /* JADX INFO: renamed from: W */
    public final void mo186026W(zzbb zzbbVar) {
        this.f172532a.f178760a.m157775c(zzbbVar.m12345F());
    }

    @Override // p149l.uus0
    /* JADX INFO: renamed from: a0 */
    public final void mo186027a0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f172532a.f178760a.m157774b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
