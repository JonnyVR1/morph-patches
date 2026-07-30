package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class s4v0 implements x9u0 {

    /* JADX INFO: renamed from: a */
    public final Context f166291a;

    /* JADX INFO: renamed from: b */
    public final s9t0 f166292b;

    public s4v0(Context context, s9t0 s9t0Var) {
        this.f166291a = context;
        this.f166292b = s9t0Var;
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(b7w0 b7w0Var) {
        if (TextUtils.isEmpty(b7w0Var.f75343b.f68854b.f172370d)) {
            return;
        }
        this.f166292b.m185238m(this.f166291a, b7w0Var.f75342a.f197721a.f145318d);
        this.f166292b.m185234i(this.f166291a, b7w0Var.f75343b.f68854b.f172370d);
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
    }
}
