package p153l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, m88121d2 = {"Ll/to5;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public class to5 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f175358b = AtomicIntegerFieldUpdater.newUpdater(to5.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Throwable cause;

    public /* synthetic */ to5(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m192009a() {
        return f175358b.get(this) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m192010c() {
        return f175358b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return u9c.m195086a(this) + '[' + this.cause + ']';
    }

    public to5(@NotNull Throwable th, boolean z) {
        this.cause = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
