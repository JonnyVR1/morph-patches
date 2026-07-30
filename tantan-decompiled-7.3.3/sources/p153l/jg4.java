package p153l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, m88121d2 = {"Ll/jg4;", "Ll/to5;", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class jg4 extends to5 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f120669c = AtomicIntegerFieldUpdater.newUpdater(jg4.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public jg4(@NotNull Continuation<?> continuation, @Nullable Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m144751e() {
        return f120669c.compareAndSet(this, 0, 1);
    }
}
