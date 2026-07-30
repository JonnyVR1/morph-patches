package p153l;

import android.app.ActivityManager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class smd implements a7h0<npy> {

    /* JADX INFO: renamed from: b */
    public static final long f169553b = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

    /* JADX INFO: renamed from: a */
    public final ActivityManager f169554a;

    public smd(ActivityManager activityManager) {
        this.f169554a = activityManager;
    }

    @Override // p153l.a7h0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public npy get() {
        return new npy(m186803b(), 256, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, f169553b);
    }

    /* JADX INFO: renamed from: b */
    public final int m186803b() {
        int iMin = Math.min(this.f169554a.getMemoryClass() * 1048576, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }
}
