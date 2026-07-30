package p149l;

import com.p046p1.mobile.android.app.App;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m87232d2 = {"Ll/pyd;", "", "<init>", "()V", "", "a", "()I", "I", "resultDeviceLevel", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pyd {

    @NotNull
    public static final pyd INSTANCE = new pyd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int resultDeviceLevel = -1;

    /* JADX INFO: renamed from: a */
    public final int m172109a() {
        int i = resultDeviceLevel;
        if (i != -1) {
            return i;
        }
        try {
            int iM166658k = oyd.m166658k(App.f15369e);
            int i2 = 0;
            if (iM166658k == -1 && eew.m116012h(App.f15369e)) {
                iM166658k = 0;
            }
            if (iM166658k == -1 || iM166658k == 2) {
                int iM208412y0 = xdl0.m208412y0();
                if (iM208412y0 >= 1080) {
                    iM166658k = 2;
                } else {
                    iM166658k = iM208412y0 >= 720 ? 1 : 0;
                }
            }
            if (iM166658k != -1) {
                i2 = iM166658k;
            }
            resultDeviceLevel = i2;
        } catch (Exception unused) {
        }
        return resultDeviceLevel;
    }
}
