package p153l;

import com.immomo.molive.apm.fps.jankstats.StateInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/m6j;", "Ll/l6j;", "", "frameStartNanos", "frameDurationUiNanos", "frameDurationCpuNanos", "", "isJank", "", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "states", "<init>", "(JJJZLjava/util/List;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "J", "()J", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class m6j extends l6j {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long frameDurationCpuNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6j(long j, long j2, long j3, boolean z, @NotNull List<StateInfo> list) {
        super(j, j2, z, list);
        list.getClass();
        this.frameDurationCpuNanos = j3;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getFrameDurationCpuNanos() {
        return this.frameDurationCpuNanos;
    }

    @Override // p153l.l6j
    public boolean equals(@Nullable Object other) {
        if (other != null) {
            return super.equals(other) && this.frameDurationCpuNanos != ((m6j) other).frameDurationCpuNanos;
        }
        C0799b.m4641a("null cannot be cast to non-null type com.immomo.molive.apm.fps.jankstats.FrameDataApi24");
        return false;
    }

    @Override // p153l.l6j
    public int hashCode() {
        return (super.hashCode() * 31) + Long.valueOf(this.frameDurationCpuNanos).hashCode();
    }

    @Override // p153l.l6j
    @NotNull
    public String toString() {
        return "FrameData(frameStartNanos=" + getFrameStartNanos() + ", frameDurationUiNanos=" + getFrameDurationUiNanos() + ", frameDurationCpuNanos=" + this.frameDurationCpuNanos + ", isJank=" + getIsJank() + ", states=" + m153066c() + ')';
    }
}
