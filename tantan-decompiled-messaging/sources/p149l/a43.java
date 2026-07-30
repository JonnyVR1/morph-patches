package p149l;

import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/a43;", "", "<init>", "()V", "", "a", "", "eventName", "", "b", "(Ljava/lang/String;)Z", "c", "Z", "enabled", "", "Ljava/util/Set;", "blocklist", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class a43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final a43 INSTANCE = new a43();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Set<String> blocklist = new HashSet();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m94765a() {
        if (lsb.m151554d(a43.class)) {
            return;
        }
        try {
            INSTANCE.m94767c();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, a43.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m94766b(@NotNull String eventName) {
        if (lsb.m151554d(a43.class)) {
            return false;
        }
        try {
            eventName.getClass();
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, a43.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94767c() {
        HashSet<String> hashSetM8848m;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null || (hashSetM8848m = C1657e.m8848m(c1656dM8693r.getBlocklistEvents())) == null) {
                return;
            }
            blocklist = hashSetM8848m;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
