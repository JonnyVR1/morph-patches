package p149l;

import com.google.android.gms.internal.ads.zzecf;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes6.dex */
public final class euv0 implements yew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iuv0 f93278a;

    public euv0(iuv0 iuv0Var) {
        this.f93278a = iuv0Var;
    }

    @Override // p149l.yew0
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        x2t0.m206867e("", (zzecf) obj);
        xsu0.m210834k("Failed to get a cache key, reverting to legacy flow.");
        iuv0 iuv0Var = this.f93278a;
        iuv0Var.f115057d = new huv0(null, iuv0Var.m138497e(), null);
        return this.f93278a.f115057d;
    }
}
