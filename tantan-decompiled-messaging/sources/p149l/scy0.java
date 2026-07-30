package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class scy0 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f163792a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2461j f163793b;

    public scy0(C2461j c2461j, zzo zzoVar) {
        this.f163792a = zzoVar;
        this.f163793b = c2461j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (!this.f163793b.m15267P((String) Preconditions.checkNotNull(this.f163792a.zza)).m15358z() || !zzje.m15342q(this.f163792a.zzt).m15358z()) {
            this.f163793b.zzj().m211416E().m123936a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        thw0 thw0VarM15292i = this.f163793b.m15292i(this.f163792a);
        if (thw0VarM15292i != null) {
            return thw0VarM15292i.m188995m();
        }
        this.f163793b.zzj().m211417F().m123936a("App info was null when attempting to get app instance id");
        return null;
    }
}
