package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class mur0 {

    /* JADX INFO: renamed from: a */
    public final jux0 f135835a;

    /* JADX INFO: renamed from: b */
    public final jkx0 f135836b;

    /* JADX INFO: renamed from: c */
    public final lcv0 f135837c;

    /* JADX INFO: renamed from: d */
    public final jes0 f135838d;

    /* JADX INFO: renamed from: e */
    public final rys0 f135839e;

    /* JADX INFO: renamed from: f */
    public final iss0 f135840f;

    /* JADX INFO: renamed from: g */
    public final kes0 f135841g;

    /* JADX INFO: renamed from: h */
    public sts0 f135842h;

    public mur0(jux0 jux0Var, jkx0 jkx0Var, lcv0 lcv0Var, jes0 jes0Var, rys0 rys0Var, iss0 iss0Var, kes0 kes0Var) {
        this.f135835a = jux0Var;
        this.f135836b = jkx0Var;
        this.f135837c = lcv0Var;
        this.f135838d = jes0Var;
        this.f135839e = rys0Var;
        this.f135840f = iss0Var;
        this.f135841g = kes0Var;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m156440q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        exr0.m118703b().m134108p(context, exr0.m118704c().zza, "gmob-apps", bundle, true);
    }

    /* JADX INFO: renamed from: c */
    public final ujs0 m156441c(Context context, String str, ons0 ons0Var) {
        return (ujs0) new pkr0(this, context, str, ons0Var).m190780d(context, false);
    }

    /* JADX INFO: renamed from: d */
    public final ips0 m156442d(Context context, zzq zzqVar, String str, ons0 ons0Var) {
        return (ips0) new afr0(this, context, zzqVar, str, ons0Var).m190780d(context, false);
    }

    /* JADX INFO: renamed from: e */
    public final ips0 m156443e(Context context, zzq zzqVar, String str, ons0 ons0Var) {
        return (ips0) new thr0(this, context, zzqVar, str, ons0Var).m190780d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final n7u0 m156444f(Context context, ons0 ons0Var) {
        return (n7u0) new o4r0(this, context, ons0Var).m190780d(context, false);
    }

    /* JADX INFO: renamed from: h */
    public final ybs0 m156445h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (ybs0) new upr0(this, frameLayout, frameLayout2, context).m190780d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final ess0 m156446j(Context context, ons0 ons0Var) {
        return (ess0) new ear0(this, context, ons0Var).m190780d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final lss0 m156447l(Activity activity) {
        u1r0 u1r0Var = new u1r0(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            x2t0.m206866d("useClientJar flag not found in activity intent extras.");
        }
        return (lss0) u1r0Var.m190780d(activity, booleanExtra);
    }

    /* JADX INFO: renamed from: n */
    public final fys0 m156448n(Context context, String str, ons0 ons0Var) {
        return (fys0) new gtr0(this, context, str, ons0Var).m190780d(context, false);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final y0t0 m156449o(Context context, ons0 ons0Var) {
        return (y0t0) new l7r0(this, context, ons0Var).m190780d(context, false);
    }
}
