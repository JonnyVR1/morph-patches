package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m88121d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", Constants.INAPP_DATA_TAG, "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Ll/k2e0;", "f", "Ll/k2e0;", "schedulerTimeSource", "Ll/vni0;", "g", "Ll/vni0;", "NonBlockingContext", "h", "BlockingContext", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class uoi0 {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final String f180089a = bqh0.m105938e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final long f180090b = dqh0.m117527f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final int f180091c = dqh0.m117526e("kotlinx.coroutines.scheduler.core.pool.size", C15274a.m88486b(bqh0.m105934a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    @JvmField
    public static final int f180092d = dqh0.m117526e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    @JvmField
    public static final long f180093e = TimeUnit.SECONDS.toNanos(dqh0.m117527f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static k2e0 f180094f = ic20.INSTANCE;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final vni0 f180095g = new wni0(0);

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final vni0 f180096h = new wni0(1);
}
