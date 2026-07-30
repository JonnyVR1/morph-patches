package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b*\u001e\b\u0002\u0010\u000e\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u000f"}, m87232d2 = {"", "timeMillis", Constants.INAPP_DATA_TAG, "(J)J", "timeNanos", "c", "Ll/yfh0;", "a", "Ll/yfh0;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", j6f.GPS_DIRECTION_TRUE, "Ll/fwv;", "Queue", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class u3f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f173605a = new yfh0("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final yfh0 f173606b = new yfh0("CLOSED_EMPTY");

    /* JADX INFO: renamed from: c */
    public static final long m191572c(long j) {
        return j / 1000000;
    }

    /* JADX INFO: renamed from: d */
    public static final long m191573d(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
