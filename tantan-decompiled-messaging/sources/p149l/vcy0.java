package p149l;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class vcy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f181002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f181003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f181004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pcy0 f181005d;

    public vcy0(pcy0 pcy0Var, String str, String str2, Bundle bundle) {
        this.f181002a = str;
        this.f181003b = str2;
        this.f181004c = bundle;
        this.f181005d = pcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f181005d.f148243a.m15304r((zzbf) Preconditions.checkNotNull(this.f181005d.f148243a.m15308t0().m101455B(this.f181002a, this.f181003b, this.f181004c, "auto", this.f181005d.f148243a.zzb().currentTimeMillis(), false, true)), this.f181002a);
    }
}
