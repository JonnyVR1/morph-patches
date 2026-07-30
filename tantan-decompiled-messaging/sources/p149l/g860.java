package p149l;

import android.util.Log;
import com.core.glcore.util.Log4Cam;

/* JADX INFO: loaded from: classes6.dex */
public class g860 {
    /* JADX INFO: renamed from: a */
    public static int m124745a(int i, int i2) {
        Log4Cam.m7322e("parseErrorCode what：" + i + "；extra：" + i2);
        if (i == 4352 || i == 4353 || i == 8448 || i == 8449) {
            return i2;
        }
        if ((i & 257) == 257) {
            if (i == 12545) {
                if (i2 == 1) {
                    return 11;
                }
                int i3 = 12;
                if (i2 != 12 && i2 != 13) {
                    i3 = 14;
                    if (i2 == 14) {
                    }
                }
                return i3;
            }
            return 1;
        }
        if (16640 == i) {
            return 2;
        }
        if (37120 == i) {
            return 3;
        }
        if (20736 == i) {
            return i2 == 0 ? 5 : 4;
        }
        if (4517 != i || i2 <= 4000) {
            return 0;
        }
        Log.e("quicsdk", "parseErrorCode: quic error:extra=" + i2);
        return i2;
    }
}
