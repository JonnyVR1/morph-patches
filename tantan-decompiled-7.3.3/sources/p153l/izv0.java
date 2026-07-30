package p153l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class izv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f117762a;

    /* JADX INFO: renamed from: b */
    public final List f117763b;

    /* JADX INFO: renamed from: c */
    public final wfs0 f117764c;

    public izv0(wfs0 wfs0Var, xvw0 xvw0Var, List list) {
        this.f117764c = wfs0Var;
        this.f117762a = xvw0Var;
        this.f117763b = list;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 48;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f117762a.mo155969R(new Callable() { // from class: l.hzv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new jzv0(this.f112306a.f117763b);
            }
        });
    }
}
