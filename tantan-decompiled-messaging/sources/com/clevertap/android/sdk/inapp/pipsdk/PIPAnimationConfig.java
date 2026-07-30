package com.clevertap.android.sdk.inapp.pipsdk;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci70;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0002'\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;", "type", "", "durationMs", "Landroid/animation/TimeInterpolator;", "interpolator", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;", "moveInDirection", "<init>", "(Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;JLandroid/animation/TimeInterpolator;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;)V", "b", "(Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;JLandroid/animation/TimeInterpolator;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;", "g", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimation;", "J", Constants.INAPP_DATA_TAG, "()J", "c", "Landroid/animation/TimeInterpolator;", "e", "()Landroid/animation/TimeInterpolator;", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;", "f", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;", "Companion", "MoveInDirection", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final /* data */ class PIPAnimationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    private static final TimeInterpolator f5169e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PIPAnimation type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long durationMs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TimeInterpolator interpolator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final MoveInDirection moveInDirection;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "TOP", "BOTTOM", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum MoveInDirection {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<MoveInDirection> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$a;", "", "<init>", "()V", "Landroid/animation/TimeInterpolator;", "DEFAULT_INTERPOLATOR", "Landroid/animation/TimeInterpolator;", "a", "()Landroid/animation/TimeInterpolator;", "", "DEFAULT_DURATION_MS", "J", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final TimeInterpolator m6531a() {
            return PIPAnimationConfig.f5169e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PIPAnimationConfig(PIPAnimation pIPAnimation, long j, TimeInterpolator timeInterpolator, MoveInDirection moveInDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PIPAnimation.DISSOLVE : pIPAnimation, (i & 2) != 0 ? 300L : j, (i & 4) != 0 ? f5169e : timeInterpolator, (i & 8) != 0 ? null : moveInDirection);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ PIPAnimationConfig m6525c(PIPAnimationConfig pIPAnimationConfig, PIPAnimation pIPAnimation, long j, TimeInterpolator timeInterpolator, MoveInDirection moveInDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            pIPAnimation = pIPAnimationConfig.type;
        }
        if ((i & 2) != 0) {
            j = pIPAnimationConfig.durationMs;
        }
        if ((i & 4) != 0) {
            timeInterpolator = pIPAnimationConfig.interpolator;
        }
        if ((i & 8) != 0) {
            moveInDirection = pIPAnimationConfig.moveInDirection;
        }
        return pIPAnimationConfig.m6526b(pIPAnimation, j, timeInterpolator, moveInDirection);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final PIPAnimationConfig m6526b(@NotNull PIPAnimation type, long durationMs, @NotNull TimeInterpolator interpolator, @Nullable MoveInDirection moveInDirection) {
        type.getClass();
        interpolator.getClass();
        return new PIPAnimationConfig(type, durationMs, interpolator, moveInDirection);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PIPAnimationConfig)) {
            return false;
        }
        PIPAnimationConfig pIPAnimationConfig = (PIPAnimationConfig) other;
        return this.type == pIPAnimationConfig.type && this.durationMs == pIPAnimationConfig.durationMs && Intrinsics.m87488d(this.interpolator, pIPAnimationConfig.interpolator) && this.moveInDirection == pIPAnimationConfig.moveInDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final MoveInDirection getMoveInDirection() {
        return this.moveInDirection;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final PIPAnimation getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + Long.hashCode(this.durationMs)) * 31) + this.interpolator.hashCode()) * 31;
        MoveInDirection moveInDirection = this.moveInDirection;
        return iHashCode + (moveInDirection == null ? 0 : moveInDirection.hashCode());
    }

    @NotNull
    public String toString() {
        return "PIPAnimationConfig(type=" + this.type + ", durationMs=" + this.durationMs + ", interpolator=" + this.interpolator + ", moveInDirection=" + this.moveInDirection + ')';
    }

    public PIPAnimationConfig(@NotNull PIPAnimation pIPAnimation, long j, @NotNull TimeInterpolator timeInterpolator, @Nullable MoveInDirection moveInDirection) {
        pIPAnimation.getClass();
        timeInterpolator.getClass();
        this.type = pIPAnimation;
        this.durationMs = j;
        this.interpolator = timeInterpolator;
        this.moveInDirection = moveInDirection;
        if (j >= 0) {
            return;
        }
        ci70.m107054a("durationMs must be non-negative, was ", j);
        throw null;
    }

    public PIPAnimationConfig() {
        this(null, 0L, null, null, 15, null);
    }
}
