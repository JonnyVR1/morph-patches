package p149l;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0012"}, m87232d2 = {"Ll/afi;", "", "", "windowMs", "Ll/n95;", "clock", "<init>", "(JLl/n95;)V", "", "c", "()Z", "", "a", "()V", "b", "J", "Ll/n95;", "lastFetchMs", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class afi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long windowMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile long lastFetchMs;

    public afi(long j, @NotNull n95 n95Var) {
        n95Var.getClass();
        this.windowMs = j;
        this.clock = n95Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m96223a() {
        this.lastFetchMs = this.clock.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m96224b() {
        this.lastFetchMs = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m96225c() {
        return this.clock.currentTimeMillis() - this.lastFetchMs < this.windowMs;
    }

    public /* synthetic */ afi(long j, n95 n95Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? n95.f137721a : n95Var);
    }
}
