package p009l;

import com.p1.mobile.android.app.App;
import kotlin.Metadata;
import l.eew;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Ll/pyd;", "", "<init>", "()V", "", "a", "()I", "I", "resultDeviceLevel", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pyd {

    @NotNull
    public static final pyd INSTANCE = new pyd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int resultDeviceLevel = -1;

    /* JADX INFO: renamed from: a */
    public final int m20770a() {
        int i = resultDeviceLevel;
        if (i != -1) {
            return i;
        }
        try {
            int iM20058k = oyd.m20058k(App.e);
            int i2 = 0;
            if (iM20058k == -1 && eew.h(App.e)) {
                iM20058k = 0;
            }
            if (iM20058k == -1 || iM20058k == 2) {
                int iY0 = xdl0.y0();
                if (iY0 >= 1080) {
                    iM20058k = 2;
                } else {
                    iM20058k = iY0 >= 720 ? 1 : 0;
                }
            }
            if (iM20058k != -1) {
                i2 = iM20058k;
            }
            resultDeviceLevel = i2;
        } catch (Exception unused) {
        }
        return resultDeviceLevel;
    }
}
