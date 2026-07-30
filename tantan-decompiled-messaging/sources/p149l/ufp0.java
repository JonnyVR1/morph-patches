package p149l;

import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/ufp0;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "a", "Ljava/util/WeakHashMap;", "()Ljava/util/WeakHashMap;", "wakeLocks", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ufp0 {

    @NotNull
    public static final ufp0 INSTANCE = new ufp0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final WeakHashMap<PowerManager.WakeLock, String> m193456a() {
        return wakeLocks;
    }
}
