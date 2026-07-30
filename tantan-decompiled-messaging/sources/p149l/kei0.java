package p149l;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/kei0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Ll/vei0;", "taskContext", "<init>", "(JLl/vei0;)V", "()V", "a", "J", "b", "Ll/vei0;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
public abstract class kei0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public long submissionTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public vei0 taskContext;

    public kei0(long j, @NotNull vei0 vei0Var) {
        this.submissionTime = j;
        this.taskContext = vei0Var;
    }

    public kei0() {
        this(0L, ufi0.f176263g);
    }
}
