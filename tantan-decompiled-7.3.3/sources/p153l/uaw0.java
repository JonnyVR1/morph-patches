package p153l;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.C2233o1;

/* JADX INFO: loaded from: classes6.dex */
public final class uaw0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final C2233o1 f178243a;

    public uaw0(C2233o1 c2233o1) {
        this.f178243a = c2233o1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) throws Throwable {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        C2233o1.m13125c(this.f178243a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
