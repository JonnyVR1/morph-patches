package p149l;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public final class dvu0 extends wus0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ evu0 f88103a;

    public dvu0(evu0 evu0Var) {
        this.f88103a = evu0Var;
    }

    @Override // p149l.hvs0
    /* JADX INFO: renamed from: W */
    public final void mo113818W(zzbb zzbbVar) {
        this.f88103a.f93384a.m157775c(zzbbVar.m12345F());
    }

    @Override // p149l.hvs0
    /* JADX INFO: renamed from: a0 */
    public final void mo113819a0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f88103a.f93384a.m157774b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
