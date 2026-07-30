package androidx.work;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gz5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b0\u0018\u0000 H2\u00020\u0001:\u0003!%IB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0016\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010\u001e¨\u0006J"}, m87232d2 = {"Landroidx/work/WorkInfo;", "", "Ljava/util/UUID;", "id", "Landroidx/work/WorkInfo$State;", "state", "", "", "tags", "Landroidx/work/Data;", "outputData", "progress", "", "runAttemptCount", "generation", "Ll/gz5;", "constraints", "", "initialDelayMillis", "Landroidx/work/WorkInfo$b;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILl/gz5;JLandroidx/work/WorkInfo$b;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "b", "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", Constants.INAPP_DATA_TAG, "Landroidx/work/Data;", "getOutputData", "()Landroidx/work/Data;", "e", "getProgress", "f", "I", "getRunAttemptCount", "g", "getGeneration", "h", "Ll/gz5;", "getConstraints", "()Ll/gz5;", RXScreenCaptureService.KEY_INDEX, "J", "getInitialDelayMillis", "()J", "j", "Landroidx/work/WorkInfo$b;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$b;", "k", "getNextScheduleTimeMillis", BLiveStormDanmakuGiftResourceType.f44444l, "getStopReason", "Companion", "State", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class WorkInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final State state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> tags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Data outputData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Data progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int runAttemptCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int generation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final gz5 constraints;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long initialDelayMillis;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final C0756b periodicityInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long nextScheduleTimeMillis;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final int stopReason;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m87232d2 = {"Landroidx/work/WorkInfo$State;", "", "(Ljava/lang/String;I)V", "isFinished", "", "()Z", "ENQUEUED", AbstractLifeCycle.RUNNING, "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX INFO: renamed from: androidx.work.WorkInfo$b */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Landroidx/work/WorkInfo$b;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getRepeatIntervalMillis", "()J", "b", "getFlexIntervalMillis", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0756b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long repeatIntervalMillis;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long flexIntervalMillis;

        public C0756b(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && Intrinsics.m87488d(C0756b.class, other.getClass())) {
                C0756b c0756b = (C0756b) other;
                if (c0756b.repeatIntervalMillis == this.repeatIntervalMillis && c0756b.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull gz5 gz5Var, long j, @Nullable C0756b c0756b, long j2, int i3) {
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        gz5Var.getClass();
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = gz5Var;
        this.initialDelayMillis = j;
        this.periodicityInfo = c0756b;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m87488d(WorkInfo.class, other.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) other;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.m87488d(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.m87488d(this.outputData, workInfo.outputData) && Intrinsics.m87488d(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.m87488d(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && Intrinsics.m87488d(this.tags, workInfo.tags)) {
            return Intrinsics.m87488d(this.progress, workInfo.progress);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + Long.hashCode(this.initialDelayMillis)) * 31;
        C0756b c0756b = this.periodicityInfo;
        return ((((iHashCode + (c0756b != null ? c0756b.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }
}
