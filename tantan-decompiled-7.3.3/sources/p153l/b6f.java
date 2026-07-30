package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/b6f;", "", "", "windowMs", "Ll/oa5;", "clock", "<init>", "(JLl/oa5;)V", "", Constants.KEY_KEY, "", "a", "(Ljava/lang/String;)Z", "J", "b", "Ll/oa5;", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "lastSeen", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b6f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long windowMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, Long> lastSeen;

    @JvmOverloads
    public b6f(long j, @NotNull oa5 oa5Var) {
        oa5Var.getClass();
        this.windowMs = j;
        this.clock = oa5Var;
        this.lastSeen = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102735a(@NotNull String key) {
        key.getClass();
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        Long lPut = this.lastSeen.put(key, Long.valueOf(jCurrentTimeMillis));
        return lPut != null && jCurrentTimeMillis - lPut.longValue() < this.windowMs;
    }

    @JvmOverloads
    public b6f(long j) {
        this(j, null, 2, null);
    }

    public /* synthetic */ b6f(long j, oa5 oa5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? oa5.f145660a : oa5Var);
    }
}
