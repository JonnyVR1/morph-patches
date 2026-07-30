package p153l;

import com.facebook.C1600c;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/q43;", "", "<init>", "()V", "", "a", "", "eventName", "", "b", "(Ljava/lang/String;)Z", "c", "Z", "enabled", "", "Ljava/util/Set;", "blocklist", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class q43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final q43 INSTANCE = new q43();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Set<String> blocklist = new HashSet();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m175192a() {
        if (ztb.m221490d(q43.class)) {
            return;
        }
        try {
            INSTANCE.m175194c();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, q43.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m175193b(@NotNull String eventName) {
        if (ztb.m221490d(q43.class)) {
            return false;
        }
        try {
            eventName.getClass();
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (Throwable th) {
            ztb.m221488b(th, q43.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m175194c() {
        HashSet<String> hashSetM8902m;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1679d c1679dM8747r = FetchedAppSettingsManager.m8747r(C1600c.m8102m(), false);
            if (c1679dM8747r == null || (hashSetM8902m = C1680e.m8902m(c1679dM8747r.getBlocklistEvents())) == null) {
                return;
            }
            blocklist = hashSetM8902m;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
