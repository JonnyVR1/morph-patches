package p006l;

import android.os.Build;
import kotlin.Metadata;
import l.pyd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Ll/c4p;", "", "<init>", "()V", "", "a", "()I", "", "b", "()Z", "c", "d", "e", "I", "resultDeviceLevel", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c4p {

    @NotNull
    public static final c4p INSTANCE = new c4p();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int resultDeviceLevel = -1;

    /* JADX INFO: renamed from: a */
    public final int m13145a() {
        int i = resultDeviceLevel;
        if (i != -1) {
            return i;
        }
        int iA = pyd.INSTANCE.a();
        resultDeviceLevel = iA;
        return iA;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13146b() {
        return m13145a() < 2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13147c() {
        return m13145a() < 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13148d() {
        if (m13145a() != 0) {
            return m13145a() < 2 && Build.VERSION.SDK_INT <= 28;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13149e() {
        return m13145a() < 2;
    }
}
