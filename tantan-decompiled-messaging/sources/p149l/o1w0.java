package p149l;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.C2210o1;

/* JADX INFO: loaded from: classes6.dex */
public final class o1w0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final C2210o1 f141484a;

    public o1w0(C2210o1 c2210o1) {
        this.f141484a = c2210o1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) throws Throwable {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        C2210o1.m13071c(this.f141484a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
