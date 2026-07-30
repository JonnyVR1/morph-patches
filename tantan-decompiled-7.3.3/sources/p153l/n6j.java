package p153l;

import com.immomo.molive.apm.fps.jankstats.StateInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/n6j;", "Ll/m6j;", "", "frameStartNanos", "frameDurationUiNanos", "frameDurationCpuNanos", "frameOverrunNanos", "", "isJank", "", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "states", "<init>", "(JJJJZLjava/util/List;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "f", "J", "getFrameOverrunNanos", "()J", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class n6j extends m6j {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long frameOverrunNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6j(long j, long j2, long j3, long j4, boolean z, @NotNull List<StateInfo> list) {
        super(j, j2, j3, z, list);
        list.getClass();
        this.frameOverrunNanos = j4;
    }

    @Override // p153l.m6j, p153l.l6j
    public boolean equals(@Nullable Object other) {
        if (other != null) {
            return super.equals(other) && this.frameOverrunNanos != ((n6j) other).frameOverrunNanos;
        }
        C0799b.m4641a("null cannot be cast to non-null type com.immomo.molive.apm.fps.jankstats.FrameDataApi31");
        return false;
    }

    @Override // p153l.m6j, p153l.l6j
    public int hashCode() {
        return (super.hashCode() * 31) + Long.valueOf(this.frameOverrunNanos).hashCode();
    }

    @Override // p153l.m6j, p153l.l6j
    @NotNull
    public String toString() {
        return "FrameData(frameStartNanos=" + getFrameStartNanos() + ", frameDurationUiNanos=" + getFrameDurationUiNanos() + ", frameDurationCpuNanos=" + getFrameDurationCpuNanos() + ", frameOverrunNanos=" + this.frameOverrunNanos + ", isJank=" + getIsJank() + ", states=" + m153066c() + ')';
    }
}
