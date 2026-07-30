package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.molive.apm.fps.jankstats.StateInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/l6j;", "", "", "frameStartNanos", "frameDurationUiNanos", "", "isJank", "", "Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "states", "<init>", "(JJZLjava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "c", "Z", Constants.INAPP_DATA_TAG, "()Z", "Ljava/util/List;", "()Ljava/util/List;", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class l6j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long frameStartNanos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long frameDurationUiNanos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isJank;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<StateInfo> states;

    public l6j(long j, long j2, boolean z, @NotNull List<StateInfo> list) {
        list.getClass();
        this.frameStartNanos = j;
        this.frameDurationUiNanos = j2;
        this.isJank = z;
        this.states = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFrameDurationUiNanos() {
        return this.frameDurationUiNanos;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFrameStartNanos() {
        return this.frameStartNanos;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<StateInfo> m153066c() {
        return this.states;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsJank() {
        return this.isJank;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            l6j l6jVar = (l6j) other;
            return this.frameStartNanos == l6jVar.frameStartNanos && this.frameDurationUiNanos == l6jVar.frameDurationUiNanos && this.isJank == l6jVar.isJank && Intrinsics.m88377d(this.states, l6jVar.states);
        }
        C0799b.m4641a("null cannot be cast to non-null type com.immomo.molive.apm.fps.jankstats.FrameData");
        return false;
    }

    public int hashCode() {
        return (((((Long.valueOf(this.frameStartNanos).hashCode() * 31) + Long.valueOf(this.frameDurationUiNanos).hashCode()) * 31) + Boolean.valueOf(this.isJank).hashCode()) * 31) + this.states.hashCode();
    }

    @NotNull
    public String toString() {
        return "FrameData(frameStartNanos=" + this.frameStartNanos + ", frameDurationUiNanos=" + this.frameDurationUiNanos + ", isJank=" + this.isJank + ", states=" + this.states + ')';
    }
}
