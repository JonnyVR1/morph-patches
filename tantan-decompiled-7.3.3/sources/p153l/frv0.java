package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class frv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f100478a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f100479b;

    public frv0(xvw0 xvw0Var, o7w0 o7w0Var) {
        this.f100478a = xvw0Var;
        this.f100479b = o7w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ grv0 m126982a() throws Exception {
        return new grv0("requester_type_2".equals(qyv0.m178751b(this.f100479b.f145318d)));
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 21;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f100478a.mo155969R(new Callable() { // from class: l.erv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f95545a.m126982a();
            }
        });
    }
}
