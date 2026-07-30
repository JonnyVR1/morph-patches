package p153l;

import com.p051p1.mobile.android.app.App;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m88121d2 = {"Ll/c0e;", "", "<init>", "()V", "", "a", "()I", "I", "resultDeviceLevel", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class c0e {

    @NotNull
    public static final c0e INSTANCE = new c0e();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int resultDeviceLevel = -1;

    /* JADX INFO: renamed from: a */
    public final int m107408a() {
        int i = resultDeviceLevel;
        if (i != -1) {
            return i;
        }
        try {
            int iM101297k = b0e.m101297k(App.f16088e);
            int i2 = 0;
            if (iM101297k == -1 && cgw.m109764h(App.f16088e)) {
                iM101297k = 0;
            }
            if (iM101297k == -1 || iM101297k == 2) {
                int iM105592y0 = bnl0.m105592y0();
                if (iM105592y0 >= 1080) {
                    iM101297k = 2;
                } else {
                    iM101297k = iM105592y0 >= 720 ? 1 : 0;
                }
            }
            if (iM101297k != -1) {
                i2 = iM101297k;
            }
            resultDeviceLevel = i2;
        } catch (Exception unused) {
        }
        return resultDeviceLevel;
    }
}
