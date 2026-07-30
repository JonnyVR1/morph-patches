package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class yly0 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f200602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2484j f200603b;

    public yly0(C2484j c2484j, zzo zzoVar) {
        this.f200602a = zzoVar;
        this.f200603b = c2484j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (!this.f200603b.m15321P((String) Preconditions.checkNotNull(this.f200602a.zza)).m15412z() || !zzje.m15396q(this.f200602a.zzt).m15412z()) {
            this.f200603b.zzj().m114562E().m153300a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        zqw0 zqw0VarM15346i = this.f200603b.m15346i(this.f200602a);
        if (zqw0VarM15346i != null) {
            return zqw0VarM15346i.m221123m();
        }
        this.f200603b.zzj().m114563F().m153300a("App info was null when attempting to get app instance id");
        return null;
    }
}
