package p149l;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/b1;", "", "<init>", "()V", "Landroid/app/ActivityManager;", "am", "", "b", "(Landroid/app/ActivityManager;)V", "c", "", "a", "I", "myUid", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "Ljava/lang/String;", "previousStackTrace", "Ljava/lang/Runnable;", Constants.INAPP_DATA_TAG, "Ljava/lang/Runnable;", "anrDetectorRunnable", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C15770b1 {

    @NotNull
    public static final C15770b1 INSTANCE = new C15770b1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final int myUid = Process.myUid();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String previousStackTrace = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Runnable anrDetectorRunnable = new Runnable() { // from class: l.a1
        @Override // java.lang.Runnable
        public final void run() {
            C15770b1.m99797a();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m99797a() {
        if (lsb.m151554d(C15770b1.class)) {
            return;
        }
        try {
            Object systemService = C1577c.m8047l().getSystemService("activity");
            systemService.getClass();
            m99798b((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, C15770b1.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final void m99798b(@Nullable ActivityManager am) {
        if (lsb.m151554d(C15770b1.class) || am == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = am.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                        Thread thread = Looper.getMainLooper().getThread();
                        thread.getClass();
                        String strM123536g = fwm.m123536g(thread);
                        if (!Intrinsics.m87488d(strM123536g, previousStackTrace) && fwm.m123540k(thread)) {
                            previousStackTrace = strM123536g;
                            InstrumentData.C1659a.m8897a(processErrorStateInfo.shortMsg, strM123536g).m8896g();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C15770b1.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final void m99799c() {
        if (lsb.m151554d(C15770b1.class)) {
            return;
        }
        try {
            scheduledExecutorService.scheduleWithFixedDelay(anrDetectorRunnable, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            lsb.m151552b(th, C15770b1.class);
        }
    }
}
