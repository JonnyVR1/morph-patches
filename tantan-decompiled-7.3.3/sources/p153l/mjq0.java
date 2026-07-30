package p153l;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u00039-3Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b#\u0010&B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0000¢\u0006\u0004\b#\u0010)J\u001d\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u0082\u0002\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010;R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010FR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010AR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010AR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010AR\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bB\u00106\"\u0004\bQ\u0010RR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010F\u001a\u0004\b=\u00106R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010A\u001a\u0004\b?\u0010.\"\u0004\bJ\u0010UR\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010F\u001a\u0004\b@\u00106\"\u0004\bK\u0010RR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010F\u001a\u0004\bC\u00106R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bD\u00102\"\u0004\bL\u0010YR\u0011\u0010Z\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bI\u00100R\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006]"}, m88121d2 = {"Ll/mjq0;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/Data;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Ll/l06;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/OutOfQuotaPolicy;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLl/l06;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Ll/mjq0;)V", "", "p", "(JJ)V", "b", "()J", "k", "()Z", "toString", "()Ljava/lang/String;", "c", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLl/l06;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)Ll/mjq0;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", Constants.INAPP_DATA_TAG, "e", "Landroidx/work/Data;", "f", "g", "J", "h", RXScreenCaptureService.KEY_INDEX, "j", "Ll/l06;", "I", BLiveStormDanmakuGiftResourceType.f45292l, "Landroidx/work/BackoffPolicy;", "m", "n", "o", "q", "Z", "r", "Landroidx/work/OutOfQuotaPolicy;", BLiveStormDanmakuGiftResourceType.f45294s, "setPeriodCount", "(I)V", Constants.KEY_T, "u", "(J)V", ResourceDirection.f39656v, "w", BaseSei.f14624X, "(Ljava/lang/String;)V", "isPeriodic", "isBackedOff", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final /* data */ class mjq0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final String f137113y;

    /* JADX INFO: renamed from: z */
    @JvmField
    @NotNull
    public static final cdj<List<C18627c>, List<WorkInfo>> f137114z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public WorkInfo.State state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public Data input;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public Data output;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public l06 constraints;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public BackoffPolicy backoffPolicy;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @JvmField
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @JvmField
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @JvmField
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @JvmField
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @JvmField
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public OutOfQuotaPolicy outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int periodCount;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int generation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public long nextScheduleTimeOverride;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int nextScheduleTimeOverrideGeneration;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int stopReason;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String traceTag;

    /* JADX INFO: renamed from: l.mjq0$b */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/mjq0$b;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroidx/work/WorkInfo$State;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C18626b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public WorkInfo.State state;

        public C18626b(@NotNull String str, @NotNull WorkInfo.State state) {
            str.getClass();
            state.getClass();
            this.id = str;
            this.state = state;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18626b)) {
                return false;
            }
            C18626b c18626b = (C18626b) other;
            return Intrinsics.m88377d(this.id, c18626b.id) && this.state == c18626b.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: renamed from: l.mjq0$c */
    @Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b9\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u0010!\"\u0004\bO\u0010LR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010(R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u0011\u0010a\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0011\u0010b\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010`¨\u0006c"}, m88121d2 = {"Ll/mjq0$c;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "Landroidx/work/Data;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Ll/l06;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLl/l06;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/WorkInfo$b;", "b", "()Landroidx/work/WorkInfo$b;", "a", "()J", "Landroidx/work/WorkInfo;", "e", "()Landroidx/work/WorkInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", "c", "Landroidx/work/Data;", "getOutput", "()Landroidx/work/Data;", Constants.INAPP_DATA_TAG, "J", "getInitialDelay", "getIntervalDuration", "f", "getFlexDuration", "g", "Ll/l06;", "getConstraints", "()Ll/l06;", "h", "I", "getRunAttemptCount", RXScreenCaptureService.KEY_INDEX, "Landroidx/work/BackoffPolicy;", "getBackoffPolicy", "()Landroidx/work/BackoffPolicy;", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", BLiveStormDanmakuGiftResourceType.f45292l, "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "q", "getProgress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C18627c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WorkInfo.State state;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Data output;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final long initialDelay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final long intervalDuration;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final long flexDuration;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final l06 constraints;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final int runAttemptCount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public BackoffPolicy backoffPolicy;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public long backoffDelayDuration;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public long lastEnqueueTime;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public int periodCount;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public final int generation;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public final long nextScheduleTimeOverride;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public final int stopReason;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final List<Data> progress;

        public C18627c(@NotNull String str, @NotNull WorkInfo.State state, @NotNull Data data, long j, long j2, long j3, @NotNull l06 l06Var, int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, @NotNull List<String> list, @NotNull List<Data> list2) {
            str.getClass();
            state.getClass();
            data.getClass();
            l06Var.getClass();
            backoffPolicy.getClass();
            list.getClass();
            list2.getClass();
            this.id = str;
            this.state = state;
            this.output = data;
            this.initialDelay = j;
            this.intervalDuration = j2;
            this.flexDuration = j3;
            this.constraints = l06Var;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j4;
            this.lastEnqueueTime = j5;
            this.periodCount = i2;
            this.generation = i3;
            this.nextScheduleTimeOverride = j6;
            this.stopReason = i4;
            this.tags = list;
            this.progress = list2;
        }

        /* JADX INFO: renamed from: a */
        public final long m158615a() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return mjq0.INSTANCE.m158614a(m158617c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, m158618d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        /* JADX INFO: renamed from: b */
        public final WorkInfo.C0758b m158616b() {
            long j = this.intervalDuration;
            if (j != 0) {
                return new WorkInfo.C0758b(j, this.flexDuration);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m158617c() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m158618d() {
            return this.intervalDuration != 0;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final WorkInfo m158619e() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.f3391b;
            UUID uuidFromString = UUID.fromString(this.id);
            uuidFromString.getClass();
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, m158616b(), m158615a(), this.stopReason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18627c)) {
                return false;
            }
            C18627c c18627c = (C18627c) other;
            return Intrinsics.m88377d(this.id, c18627c.id) && this.state == c18627c.state && Intrinsics.m88377d(this.output, c18627c.output) && this.initialDelay == c18627c.initialDelay && this.intervalDuration == c18627c.intervalDuration && this.flexDuration == c18627c.flexDuration && Intrinsics.m88377d(this.constraints, c18627c.constraints) && this.runAttemptCount == c18627c.runAttemptCount && this.backoffPolicy == c18627c.backoffPolicy && this.backoffDelayDuration == c18627c.backoffDelayDuration && this.lastEnqueueTime == c18627c.lastEnqueueTime && this.periodCount == c18627c.periodCount && this.generation == c18627c.generation && this.nextScheduleTimeOverride == c18627c.nextScheduleTimeOverride && this.stopReason == c18627c.stopReason && Intrinsics.m88377d(this.tags, c18627c.tags) && Intrinsics.m88377d(this.progress, c18627c.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }
    }

    static {
        String strM178831i = qzv.m178831i("WorkSpec");
        strM178831i.getClass();
        f137113y = strM178831i;
        f137114z = new cdj() { // from class: l.ljq0
            @Override // p153l.cdj
            public final Object apply(Object obj) {
                return mjq0.m158597a((List) obj);
            }
        };
    }

    public /* synthetic */ mjq0(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, l06 l06Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? WorkInfo.State.ENQUEUED : state, str2, (i6 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i6 & 16) != 0 ? Data.f3391b : data, (i6 & 32) != 0 ? Data.f3391b : data2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? l06.f129522j : l06Var, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i6 & 4096) != 0 ? HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (i6 & 8388608) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a */
    public static List m158597a(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C18627c) it.next()).m158619e());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ mjq0 m158598d(mjq0 mjq0Var, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, l06 l06Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, int i6, Object obj) {
        String str5;
        int i7;
        String str6 = (i6 & 1) != 0 ? mjq0Var.id : str;
        WorkInfo.State state2 = (i6 & 2) != 0 ? mjq0Var.state : state;
        String str7 = (i6 & 4) != 0 ? mjq0Var.workerClassName : str2;
        String str8 = (i6 & 8) != 0 ? mjq0Var.inputMergerClassName : str3;
        Data data3 = (i6 & 16) != 0 ? mjq0Var.input : data;
        Data data4 = (i6 & 32) != 0 ? mjq0Var.output : data2;
        long j9 = (i6 & 64) != 0 ? mjq0Var.initialDelay : j;
        long j10 = (i6 & 128) != 0 ? mjq0Var.intervalDuration : j2;
        long j11 = (i6 & 256) != 0 ? mjq0Var.flexDuration : j3;
        l06 l06Var2 = (i6 & 512) != 0 ? mjq0Var.constraints : l06Var;
        int i8 = (i6 & 1024) != 0 ? mjq0Var.runAttemptCount : i;
        String str9 = str6;
        BackoffPolicy backoffPolicy2 = (i6 & 2048) != 0 ? mjq0Var.backoffPolicy : backoffPolicy;
        WorkInfo.State state3 = state2;
        long j12 = (i6 & 4096) != 0 ? mjq0Var.backoffDelayDuration : j4;
        long j13 = (i6 & 8192) != 0 ? mjq0Var.lastEnqueueTime : j5;
        long j14 = (i6 & 16384) != 0 ? mjq0Var.minimumRetentionDuration : j6;
        long j15 = (i6 & 32768) != 0 ? mjq0Var.scheduleRequestedAt : j7;
        boolean z2 = (i6 & 65536) != 0 ? mjq0Var.expedited : z;
        long j16 = j15;
        OutOfQuotaPolicy outOfQuotaPolicy2 = (i6 & 131072) != 0 ? mjq0Var.outOfQuotaPolicy : outOfQuotaPolicy;
        int i9 = (i6 & 262144) != 0 ? mjq0Var.periodCount : i2;
        OutOfQuotaPolicy outOfQuotaPolicy3 = outOfQuotaPolicy2;
        int i10 = (i6 & 524288) != 0 ? mjq0Var.generation : i3;
        int i11 = i9;
        long j17 = (i6 & 1048576) != 0 ? mjq0Var.nextScheduleTimeOverride : j8;
        int i12 = (i6 & 2097152) != 0 ? mjq0Var.nextScheduleTimeOverrideGeneration : i4;
        int i13 = (i6 & 4194304) != 0 ? mjq0Var.stopReason : i5;
        if ((i6 & 8388608) != 0) {
            i7 = i12;
            str5 = mjq0Var.traceTag;
        } else {
            str5 = str4;
            i7 = i12;
        }
        return mjq0Var.m158600c(str9, state3, str7, str8, data3, data4, j9, j10, j11, l06Var2, i8, backoffPolicy2, j12, j13, j14, j16, z2, outOfQuotaPolicy3, i11, i10, j17, i7, i13, str5);
    }

    /* JADX INFO: renamed from: b */
    public final long m158599b() {
        return INSTANCE.m158614a(m158608l(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, m158609m(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final mjq0 m158600c(@NotNull String id, @NotNull WorkInfo.State state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull Data input, @NotNull Data output, long initialDelay, long intervalDuration, long flexDuration, @NotNull l06 constraints, @IntRange(from = 0) int runAttemptCount, @NotNull BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, @Nullable String traceTag) {
        id.getClass();
        state.getClass();
        workerClassName.getClass();
        inputMergerClassName.getClass();
        input.getClass();
        output.getClass();
        constraints.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        return new mjq0(id, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mjq0)) {
            return false;
        }
        mjq0 mjq0Var = (mjq0) other;
        return Intrinsics.m88377d(this.id, mjq0Var.id) && this.state == mjq0Var.state && Intrinsics.m88377d(this.workerClassName, mjq0Var.workerClassName) && Intrinsics.m88377d(this.inputMergerClassName, mjq0Var.inputMergerClassName) && Intrinsics.m88377d(this.input, mjq0Var.input) && Intrinsics.m88377d(this.output, mjq0Var.output) && this.initialDelay == mjq0Var.initialDelay && this.intervalDuration == mjq0Var.intervalDuration && this.flexDuration == mjq0Var.flexDuration && Intrinsics.m88377d(this.constraints, mjq0Var.constraints) && this.runAttemptCount == mjq0Var.runAttemptCount && this.backoffPolicy == mjq0Var.backoffPolicy && this.backoffDelayDuration == mjq0Var.backoffDelayDuration && this.lastEnqueueTime == mjq0Var.lastEnqueueTime && this.minimumRetentionDuration == mjq0Var.minimumRetentionDuration && this.scheduleRequestedAt == mjq0Var.scheduleRequestedAt && this.expedited == mjq0Var.expedited && this.outOfQuotaPolicy == mjq0Var.outOfQuotaPolicy && this.periodCount == mjq0Var.periodCount && this.generation == mjq0Var.generation && this.nextScheduleTimeOverride == mjq0Var.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == mjq0Var.nextScheduleTimeOverrideGeneration && this.stopReason == mjq0Var.stopReason && Intrinsics.m88377d(this.traceTag, mjq0Var.traceTag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m158607k() {
        return !Intrinsics.m88377d(l06.f129522j, this.constraints);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m158608l() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m158609m() {
        return this.intervalDuration != 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m158610n(long j) {
        this.nextScheduleTimeOverride = j;
    }

    /* JADX INFO: renamed from: o */
    public final void m158611o(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    /* JADX INFO: renamed from: p */
    public final void m158612p(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            qzv.m178829e().mo178839k(f137113y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = C15274a.m88487c(intervalDuration, 900000L);
        if (flexDuration < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            qzv.m178829e().mo178839k(f137113y, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            qzv.m178829e().mo178839k(f137113y, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = C15274a.m88493i(flexDuration, Constants.INBOX_V2_THROTTLE_WINDOW_MS, this.intervalDuration);
    }

    /* JADX INFO: renamed from: q */
    public final void m158613q(@Nullable String str) {
        this.traceTag = str;
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    /* JADX INFO: renamed from: l.mjq0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/mjq0$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILandroidx/work/BackoffPolicy;JJIZJJJJ)J", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Ll/cdj;", "", "Ll/mjq0$c;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Ll/cdj;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m158614a(boolean isBackedOff, int runAttemptCount, @NotNull BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            long jM88490f;
            backoffPolicy.getClass();
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : C15274a.m88487c(nextScheduleTimeOverride, lastEnqueueTime + 900000);
            }
            if (isBackedOff) {
                jM88490f = C15274a.m88490f(backoffPolicy == BackoffPolicy.LINEAR ? backoffDelayDuration * ((long) runAttemptCount) : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L);
            } else {
                if (!isPeriodic) {
                    if (lastEnqueueTime == -1) {
                        return Long.MAX_VALUE;
                    }
                    return lastEnqueueTime + initialDelay;
                }
                lastEnqueueTime = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                if (flexDuration == intervalDuration || periodCount != 0) {
                    return lastEnqueueTime;
                }
                jM88490f = intervalDuration - flexDuration;
            }
            return lastEnqueueTime + jM88490f;
        }

        public Companion() {
        }
    }

    public mjq0(@NotNull String str, @NotNull WorkInfo.State state, @NotNull String str2, @NotNull String str3, @NotNull Data data, @NotNull Data data2, long j, long j2, long j3, @NotNull l06 l06Var, @IntRange(from = 0) int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, @Nullable String str4) {
        str.getClass();
        state.getClass();
        str2.getClass();
        str3.getClass();
        data.getClass();
        data2.getClass();
        l06Var.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = l06Var;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i2;
        this.generation = i3;
        this.nextScheduleTimeOverride = j8;
        this.nextScheduleTimeOverrideGeneration = i4;
        this.stopReason = i5;
        this.traceTag = str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mjq0(@NotNull String str, @NotNull String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mjq0(@NotNull String str, @NotNull mjq0 mjq0Var) {
        this(str, mjq0Var.state, mjq0Var.workerClassName, mjq0Var.inputMergerClassName, new Data(mjq0Var.input), new Data(mjq0Var.output), mjq0Var.initialDelay, mjq0Var.intervalDuration, mjq0Var.flexDuration, new l06(mjq0Var.constraints), mjq0Var.runAttemptCount, mjq0Var.backoffPolicy, mjq0Var.backoffDelayDuration, mjq0Var.lastEnqueueTime, mjq0Var.minimumRetentionDuration, mjq0Var.scheduleRequestedAt, mjq0Var.expedited, mjq0Var.outOfQuotaPolicy, mjq0Var.periodCount, 0, mjq0Var.nextScheduleTimeOverride, mjq0Var.nextScheduleTimeOverrideGeneration, mjq0Var.stopReason, mjq0Var.traceTag, 524288, null);
        str.getClass();
        mjq0Var.getClass();
    }
}
