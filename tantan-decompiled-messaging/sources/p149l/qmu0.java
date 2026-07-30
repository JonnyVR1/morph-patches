package p149l;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qmu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f155342a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f155343b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f155344c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f155345d;

    public qmu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f155342a = ehx0Var;
        this.f155343b = ehx0Var2;
        this.f155344c = ehx0Var3;
        this.f155345d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String str = (String) this.f155342a.zzb();
        Context contextM110876a = ((dct0) this.f155343b).m110876a();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        Map mapZzb = ((sgx0) this.f155345d).zzb();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132017O4)).booleanValue()) {
            z2s0 z2s0Var = new z2s0(new f3s0(contextM110876a));
            z2s0Var.m216993b(new y2s0() { // from class: l.rmu0
                @Override // p149l.y2s0
                /* JADX INFO: renamed from: a */
                public final void mo12818a(s4s0 s4s0Var) {
                    s4s0Var.m182313x(str);
                }
            });
            setSingleton = Collections.singleton(new s6u0(new tmu0(z2s0Var, mapZzb), rmw0Var));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
