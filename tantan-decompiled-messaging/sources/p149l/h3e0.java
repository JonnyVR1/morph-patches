package p149l;

import com.immomo.motracing.GlobalTracer;
import com.immomo.motracing.Span;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/h3e0;", "Ljava/lang/AutoCloseable;", "Lcom/immomo/motracing/Span;", "previousSpan", "currentSpan", "", "_close", "<init>", "(Lcom/immomo/motracing/Span;Lcom/immomo/motracing/Span;Z)V", "", "close", "()V", "a", "Lcom/immomo/motracing/Span;", "b", "c", "Z", "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class h3e0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Span previousSpan;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Span currentSpan;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean _close;

    public h3e0(@Nullable Span span, @NotNull Span span2, boolean z) {
        span2.getClass();
        this.previousSpan = span;
        this.currentSpan = span2;
        this._close = z;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this._close) {
            return;
        }
        this._close = true;
        GlobalTracer.INSTANCE.m19344f(this.currentSpan.mo19332c(), this.previousSpan);
    }

    public /* synthetic */ h3e0(Span span, Span span2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(span, span2, (i & 4) != 0 ? false : z);
    }
}
