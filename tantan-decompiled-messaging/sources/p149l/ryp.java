package p149l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15485n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u000f"}, m87232d2 = {"Ll/ryp;", "Ll/xmq;", "Lkotlinx/coroutines/n;", "handler", "<init>", "(Lkotlinx/coroutines/n;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/n;", "Lkotlinx/atomicfu/AtomicInt;", "_invoked", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class ryp extends xmq {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f161575f = AtomicIntegerFieldUpdater.newUpdater(ryp.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15485n handler;

    public ryp(@NotNull InterfaceC15485n interfaceC15485n) {
        this.handler = interfaceC15485n;
    }

    @Override // kotlinx.coroutines.InterfaceC15485n
    /* JADX INFO: renamed from: a */
    public void mo93710a(@Nullable Throwable cause) {
        if (f161575f.compareAndSet(this, 0, 1)) {
            this.handler.mo93710a(cause);
        }
    }
}
