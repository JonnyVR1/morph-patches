package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", Constants.INAPP_DATA_TAG, "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Ll/gud0;", "f", "Ll/gud0;", "schedulerTimeSource", "Ll/vei0;", "g", "Ll/vei0;", "NonBlockingContext", "h", "BlockingContext", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class ufi0 {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final String f176257a = uhh0.m193719e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final long f176258b = whh0.m203220f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final int f176259c = whh0.m203219e("kotlinx.coroutines.scheduler.core.pool.size", C15167a.m87596b(uhh0.m193715a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    @JvmField
    public static final int f176260d = whh0.m203219e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    @JvmField
    public static final long f176261e = TimeUnit.SECONDS.toNanos(whh0.m203220f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static gud0 f176262f = a420.INSTANCE;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final vei0 f176263g = new wei0(0);

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final vei0 f176264h = new wei0(1);
}
