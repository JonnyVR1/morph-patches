package p153l;

import com.google.android.gms.internal.play_billing.zzkn;

/* JADX INFO: loaded from: classes6.dex */
public final class c6y0 implements grx0 {

    /* JADX INFO: renamed from: a */
    public static final grx0 f80014a = new c6y0();

    @Override // p153l.grx0
    public final boolean zza(int i) {
        zzkn zzknVar;
        if (i == 0) {
            zzknVar = zzkn.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i == 1) {
            zzknVar = zzkn.PURCHASES_UPDATED_ACTION;
        } else if (i != 2) {
            zzknVar = i != 3 ? null : zzkn.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzknVar = zzkn.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzknVar != null;
    }
}
