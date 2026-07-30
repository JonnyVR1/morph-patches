package p149l;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m87232d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "", "a", "()V", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class tfp0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f170012a;

    static {
        String strM190978i = txv.m190978i("WakeLocks");
        strM190978i.getClass();
        f170012a = strM190978i;
    }

    /* JADX INFO: renamed from: a */
    public static final void m188750a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ufp0 ufp0Var = ufp0.INSTANCE;
        synchronized (ufp0Var) {
            linkedHashMap.putAll(ufp0Var.m193456a());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                txv.m190976e().mo190986k(f170012a, "WakeLock held for " + str);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PowerManager.WakeLock m188751b(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        ufp0 ufp0Var = ufp0.INSTANCE;
        synchronized (ufp0Var) {
            ufp0Var.m193456a().put(wakeLockNewWakeLock, str2);
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
