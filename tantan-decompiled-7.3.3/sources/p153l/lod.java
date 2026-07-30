package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class lod implements a7h0<npy> {

    /* JADX INFO: renamed from: a */
    public static final long f132894a = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

    /* JADX INFO: renamed from: b */
    private int m155046b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // p153l.a7h0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public npy get() {
        int iM155046b = m155046b();
        return new npy(iM155046b, Api.BaseClientBuilder.API_PRIORITY_OTHER, iM155046b, Api.BaseClientBuilder.API_PRIORITY_OTHER, iM155046b / 8, f132894a);
    }
}
