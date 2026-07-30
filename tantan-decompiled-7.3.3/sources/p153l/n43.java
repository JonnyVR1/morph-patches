package p153l;

import kotlin.Metadata;
import kotlinx.coroutines.AbstractC15589k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/n43;", "Lkotlinx/coroutines/k;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "g", "Ljava/lang/Thread;", "n0", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class n43 extends AbstractC15589k {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Thread thread;

    public n43(@NotNull Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.AbstractC15590l
    @NotNull
    /* JADX INFO: renamed from: n0, reason: from getter */
    public Thread getThread() {
        return this.thread;
    }
}
