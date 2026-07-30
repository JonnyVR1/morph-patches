package p153l;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0012"}, m88121d2 = {"Ll/whi;", "", "", "windowMs", "Ll/oa5;", "clock", "<init>", "(JLl/oa5;)V", "", "c", "()Z", "", "a", "()V", "b", "J", "Ll/oa5;", "lastFetchMs", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class whi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long windowMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile long lastFetchMs;

    public whi(long j, @NotNull oa5 oa5Var) {
        oa5Var.getClass();
        this.windowMs = j;
        this.clock = oa5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m206353a() {
        this.lastFetchMs = this.clock.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m206354b() {
        this.lastFetchMs = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m206355c() {
        return this.clock.currentTimeMillis() - this.lastFetchMs < this.windowMs;
    }

    public /* synthetic */ whi(long j, oa5 oa5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? oa5.f145660a : oa5Var);
    }
}
