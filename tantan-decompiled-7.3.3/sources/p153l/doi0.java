package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/doi0;", "Ll/kni0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "Ll/vni0;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLl/vni0;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class doi0 extends kni0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Runnable block;

    public doi0(@NotNull Runnable runnable, long j, @NotNull vni0 vni0Var) {
        super(j, vni0Var);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.mo201995a();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + u9c.m195086a(this.block) + '@' + u9c.m195087b(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
