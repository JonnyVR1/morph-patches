package p149l;

import kotlin.Metadata;
import kotlinx.coroutines.AbstractC15482k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/x33;", "Lkotlinx/coroutines/k;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "g", "Ljava/lang/Thread;", "m0", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class x33 extends AbstractC15482k {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Thread thread;

    public x33(@NotNull Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.AbstractC15483l
    @NotNull
    /* JADX INFO: renamed from: m0, reason: from getter */
    public Thread getThread() {
        return this.thread;
    }
}
