package p153l;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/kni0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Ll/vni0;", "taskContext", "<init>", "(JLl/vni0;)V", "()V", "a", "J", "b", "Ll/vni0;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
public abstract class kni0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public long submissionTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public vni0 taskContext;

    public kni0(long j, @NotNull vni0 vni0Var) {
        this.submissionTime = j;
        this.taskContext = vni0Var;
    }

    public kni0() {
        this(0L, uoi0.f180095g);
    }
}
