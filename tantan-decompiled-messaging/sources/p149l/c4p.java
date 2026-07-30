package p149l;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/c4p;", "", "<init>", "()V", "", "a", "()I", "", "b", "()Z", "c", Constants.INAPP_DATA_TAG, "e", "I", "resultDeviceLevel", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c4p {

    @NotNull
    public static final c4p INSTANCE = new c4p();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int resultDeviceLevel = -1;

    /* JADX INFO: renamed from: a */
    public final int m105234a() {
        int i = resultDeviceLevel;
        if (i != -1) {
            return i;
        }
        int iM172109a = pyd.INSTANCE.m172109a();
        resultDeviceLevel = iM172109a;
        return iM172109a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m105235b() {
        return m105234a() < 2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m105236c() {
        return m105234a() < 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m105237d() {
        if (m105234a() != 0) {
            return m105234a() < 2 && Build.VERSION.SDK_INT <= 28;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m105238e() {
        return m105234a() < 2;
    }
}
