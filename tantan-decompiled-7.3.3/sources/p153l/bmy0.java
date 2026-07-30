package p153l;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class bmy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f77420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f77421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f77422c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vly0 f77423d;

    public bmy0(vly0 vly0Var, String str, String str2, Bundle bundle) {
        this.f77420a = str;
        this.f77421b = str2;
        this.f77422c = bundle;
        this.f77423d = vly0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77423d.f184652a.m15358r((zzbf) Preconditions.checkNotNull(this.f77423d.f184652a.m15362t0().m136322B(this.f77420a, this.f77421b, this.f77422c, "auto", this.f77423d.f184652a.zzb().currentTimeMillis(), false, true)), this.f77420a);
    }
}
