package p153l;

import com.google.android.gms.internal.ads.zzecf;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes6.dex */
public final class k3w0 implements eow0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o3w0 f123777a;

    public k3w0(o3w0 o3w0Var) {
        this.f123777a = o3w0Var;
    }

    @Override // p153l.eow0
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        dct0.m115296e("", (zzecf) obj);
        d2v0.m113737k("Failed to get a cache key, reverting to legacy flow.");
        o3w0 o3w0Var = this.f123777a;
        o3w0Var.f144863d = new n3w0(null, o3w0Var.m165891e(), null);
        return this.f123777a.f144863d;
    }
}
