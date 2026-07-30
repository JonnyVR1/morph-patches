package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b*\u001e\b\u0002\u0010\u000e\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u000f"}, m88121d2 = {"", "timeMillis", Constants.INAPP_DATA_TAG, "(J)J", "timeNanos", "c", "Ll/goh0;", "a", "Ll/goh0;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", p7f.GPS_DIRECTION_TRUE, "Ll/gyv;", "Queue", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class y4f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f197451a = new goh0("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final goh0 f197452b = new goh0("CLOSED_EMPTY");

    /* JADX INFO: renamed from: c */
    public static final long m214205c(long j) {
        return j / 1000000;
    }

    /* JADX INFO: renamed from: d */
    public static final long m214206d(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
