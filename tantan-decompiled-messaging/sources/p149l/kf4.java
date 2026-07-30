package p149l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m87232d2 = {"Ll/kf4;", "Ll/pn5;", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class kf4 extends pn5 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122895c = AtomicIntegerFieldUpdater.newUpdater(kf4.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public kf4(@NotNull Continuation<?> continuation, @Nullable Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m145823e() {
        return f122895c.compareAndSet(this, 0, 1);
    }
}
