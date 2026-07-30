package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class s3s0 {

    /* JADX INFO: renamed from: a */
    public final p3y0 f166028a;

    /* JADX INFO: renamed from: b */
    public final ptx0 f166029b;

    /* JADX INFO: renamed from: c */
    public final rlv0 f166030c;

    /* JADX INFO: renamed from: d */
    public final pns0 f166031d;

    /* JADX INFO: renamed from: e */
    public final x7t0 f166032e;

    /* JADX INFO: renamed from: f */
    public final o1t0 f166033f;

    /* JADX INFO: renamed from: g */
    public final qns0 f166034g;

    /* JADX INFO: renamed from: h */
    public y2t0 f166035h;

    public s3s0(p3y0 p3y0Var, ptx0 ptx0Var, rlv0 rlv0Var, pns0 pns0Var, x7t0 x7t0Var, o1t0 o1t0Var, qns0 qns0Var) {
        this.f166028a = p3y0Var;
        this.f166029b = ptx0Var;
        this.f166030c = rlv0Var;
        this.f166031d = pns0Var;
        this.f166032e = x7t0Var;
        this.f166033f = o1t0Var;
        this.f166034g = qns0Var;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m184296q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        k6s0.m148569b().m167061p(context, k6s0.m148570c().zza, "gmob-apps", bundle, true);
    }

    /* JADX INFO: renamed from: c */
    public final ats0 m184297c(Context context, String str, uws0 uws0Var) {
        return (ats0) new vtr0(this, context, str, uws0Var).m218609d(context, false);
    }

    /* JADX INFO: renamed from: d */
    public final oys0 m184298d(Context context, zzq zzqVar, String str, uws0 uws0Var) {
        return (oys0) new gor0(this, context, zzqVar, str, uws0Var).m218609d(context, false);
    }

    /* JADX INFO: renamed from: e */
    public final oys0 m184299e(Context context, zzq zzqVar, String str, uws0 uws0Var) {
        return (oys0) new zqr0(this, context, zzqVar, str, uws0Var).m218609d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final tgu0 m184300f(Context context, uws0 uws0Var) {
        return (tgu0) new udr0(this, context, uws0Var).m218609d(context, false);
    }

    /* JADX INFO: renamed from: h */
    public final els0 m184301h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (els0) new azr0(this, frameLayout, frameLayout2, context).m218609d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final k1t0 m184302j(Context context, uws0 uws0Var) {
        return (k1t0) new kjr0(this, context, uws0Var).m218609d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final r1t0 m184303l(Activity activity) {
        abr0 abr0Var = new abr0(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            dct0.m115295d("useClientJar flag not found in activity intent extras.");
        }
        return (r1t0) abr0Var.m218609d(activity, booleanExtra);
    }

    /* JADX INFO: renamed from: n */
    public final l7t0 m184304n(Context context, String str, uws0 uws0Var) {
        return (l7t0) new m2s0(this, context, str, uws0Var).m218609d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final eat0 m184305o(Context context, uws0 uws0Var) {
        return (eat0) new rgr0(this, context, uws0Var).m218609d(context, false);
    }
}
