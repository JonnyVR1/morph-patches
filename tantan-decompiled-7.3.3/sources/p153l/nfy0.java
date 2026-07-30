package p153l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class nfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f141773a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f141774b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f141775c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzae f141776d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzae f141777e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hcy0 f141778f;

    public nfy0(hcy0 hcy0Var, boolean z, zzo zzoVar, boolean z2, zzae zzaeVar, zzae zzaeVar2) {
        this.f141774b = zzoVar;
        this.f141775c = z2;
        this.f141776d = zzaeVar;
        this.f141777e = zzaeVar2;
        this.f141778f = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f141778f.f108759d;
        if (isw0Var == null) {
            this.f141778f.zzj().m114558A().m153300a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f141773a) {
            Preconditions.checkNotNull(this.f141774b);
            this.f141778f.m134542K(isw0Var, this.f141775c ? null : this.f141776d, this.f141774b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f141777e.zza)) {
                    Preconditions.checkNotNull(this.f141774b);
                    isw0Var.mo112716g3(this.f141776d, this.f141774b);
                } else {
                    isw0Var.mo112720n7(this.f141776d);
                }
            } catch (RemoteException e) {
                this.f141778f.zzj().m114558A().m153301b("Failed to send conditional user property to the service", e);
            }
        }
        this.f141778f.m134527g0();
    }
}
