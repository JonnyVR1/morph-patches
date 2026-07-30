package p149l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class lau0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f127244a;

    public lau0(ehx0 ehx0Var) {
        this.f127244a = ehx0Var;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((iau0) this.f127244a).m135201a().m218106e() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
