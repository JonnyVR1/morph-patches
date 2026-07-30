package p149l;

import com.google.android.gms.internal.play_billing.zzkn;

/* JADX INFO: loaded from: classes6.dex */
public final class wwx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public static final aix0 f188411a = new wwx0();

    @Override // p149l.aix0
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
