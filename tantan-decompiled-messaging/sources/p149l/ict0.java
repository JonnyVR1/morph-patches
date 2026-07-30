package p149l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ict0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f112487a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f112488b;

    public ict0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f112487a = ehx0Var;
        this.f112488b = ehx0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        rzu0 rzu0Var = (rzu0) this.f112487a.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132146Z1)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
                setSingleton = Collections.singleton(new s6u0(rzu0Var, rmw0Var));
            } else {
                setSingleton = Collections.EMPTY_SET;
            }
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
