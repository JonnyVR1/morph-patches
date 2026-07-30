package p153l;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m88121d2 = {"", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "Ll/xqb;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yqb {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Collection<xqb> f201162a = SequencesKt___SequencesKt.m94193V(SequencesKt__SequencesKt.m94158g(ServiceLoader.load(xqb.class, xqb.class.getClassLoader()).iterator()));

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Collection<xqb> m217075a() {
        return f201162a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m217076b(@NotNull Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
