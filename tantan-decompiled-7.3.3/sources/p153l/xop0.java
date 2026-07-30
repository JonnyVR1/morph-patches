package p153l;

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
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m88121d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "", "a", "()V", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class xop0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f195592a;

    static {
        String strM178831i = qzv.m178831i("WakeLocks");
        strM178831i.getClass();
        f195592a = strM178831i;
    }

    /* JADX INFO: renamed from: a */
    public static final void m212477a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yop0 yop0Var = yop0.INSTANCE;
        synchronized (yop0Var) {
            linkedHashMap.putAll(yop0Var.m216989a());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                qzv.m178829e().mo178839k(f195592a, "WakeLock held for " + str);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PowerManager.WakeLock m212478b(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        yop0 yop0Var = yop0.INSTANCE;
        synchronized (yop0Var) {
            yop0Var.m216989a().put(wakeLockNewWakeLock, str2);
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
