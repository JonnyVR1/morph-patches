package p149l;

import android.app.ActivityManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class mld implements syg0<qgy> {

    /* JADX INFO: renamed from: b */
    public static final long f134421b = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

    /* JADX INFO: renamed from: a */
    public final ActivityManager f134422a;

    public mld(ActivityManager activityManager) {
        this.f134422a = activityManager;
    }

    @Override // p149l.syg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qgy get() {
        return new qgy(m155139b(), 256, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, f134421b);
    }

    /* JADX INFO: renamed from: b */
    public final int m155139b() {
        int iMin = Math.min(this.f134422a.getMemoryClass() * 1048576, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }
}
