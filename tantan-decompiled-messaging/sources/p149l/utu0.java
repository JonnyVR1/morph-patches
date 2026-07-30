package p149l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class utu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f178292a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f178293b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f178294c;

    public utu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f178292a = ehx0Var;
        this.f178293b = ehx0Var2;
        this.f178294c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final ptr0 ptr0Var = (ptr0) this.f178292a.zzb();
        final Context contextM110876a = ((dct0) this.f178293b).m110876a();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        gnr gnrVarMo122102R = rmw0Var.mo122102R(new Callable() { // from class: l.rtu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ptr0Var.m171378c().mo136904a(contextM110876a);
            }
        });
        wgx0.m203089b(gnrVarMo122102R);
        return gnrVarMo122102R;
    }
}
