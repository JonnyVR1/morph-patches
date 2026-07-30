package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2423n0;
import com.google.android.gms.internal.play_billing.C2427p0;
import com.google.android.gms.internal.play_billing.C2445y0;
import com.google.android.gms.internal.play_billing.C2447z0;
import com.google.android.gms.internal.play_billing.zzcr;
import com.google.android.gms.internal.play_billing.zzkn;

/* JADX INFO: renamed from: com.android.billingclient.api.g0 */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC0882g0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4024a = 0;

    static {
        zzcr.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzkn.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzkn.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzkn.ALTERNATIVE_BILLING_ACTION);
    }

    /* JADX INFO: renamed from: a */
    void mo5050a(C2427p0 c2427p0);

    /* JADX INFO: renamed from: b */
    void mo5051b(C2445y0 c2445y0);

    /* JADX INFO: renamed from: c */
    void mo5052c(@Nullable C2447z0 c2447z0);

    /* JADX INFO: renamed from: d */
    void mo5053d(C2421m0 c2421m0);

    /* JADX INFO: renamed from: e */
    void mo5054e(@Nullable C2423n0 c2423n0, int i);

    /* JADX INFO: renamed from: f */
    void mo5055f(@Nullable C2421m0 c2421m0, int i);

    /* JADX INFO: renamed from: g */
    void mo5056g(@Nullable C2423n0 c2423n0);
}
