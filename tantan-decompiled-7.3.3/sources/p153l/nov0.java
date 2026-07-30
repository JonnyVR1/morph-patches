package p153l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class nov0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f143048a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f143049b;

    /* JADX INFO: renamed from: c */
    public final zzcei f143050c;

    /* JADX INFO: renamed from: d */
    public final ibt0 f143051d;

    public nov0(xvw0 xvw0Var, o7w0 o7w0Var, zzcei zzceiVar, ibt0 ibt0Var) {
        this.f143048a = xvw0Var;
        this.f143049b = o7w0Var;
        this.f143050c = zzceiVar;
        this.f143051d = ibt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oov0 m164205a() throws Exception {
        return new oov0(this.f143049b.f145324j, this.f143050c, this.f143051d.m139412m());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 9;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f143048a.mo155969R(new Callable() { // from class: l.mov0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f137856a.m164205a();
            }
        });
    }
}
