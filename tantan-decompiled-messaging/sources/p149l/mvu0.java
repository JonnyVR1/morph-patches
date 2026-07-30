package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class mvu0 implements r0u0 {

    /* JADX INFO: renamed from: a */
    public final Context f135990a;

    /* JADX INFO: renamed from: b */
    public final m0t0 f135991b;

    public mvu0(Context context, m0t0 m0t0Var) {
        this.f135990a = context;
        this.f135991b = m0t0Var;
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
        if (TextUtils.isEmpty(vxv0Var.f183478b.f178773b.f141057d)) {
            return;
        }
        this.f135991b.m152534m(this.f135990a, vxv0Var.f183477a.f166831a.f115494d);
        this.f135991b.m152530i(this.f135990a, vxv0Var.f183478b.f178773b.f141057d);
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
    }
}
