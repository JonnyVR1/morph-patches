package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class gnd implements syg0<qgy> {

    /* JADX INFO: renamed from: a */
    public static final long f103585a = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

    /* JADX INFO: renamed from: b */
    private int m127127b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // p149l.syg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qgy get() {
        int iM127127b = m127127b();
        return new qgy(iM127127b, Api.BaseClientBuilder.API_PRIORITY_OTHER, iM127127b, Api.BaseClientBuilder.API_PRIORITY_OTHER, iM127127b / 8, f103585a);
    }
}
