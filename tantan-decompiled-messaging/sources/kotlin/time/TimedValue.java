package kotlin.time;

import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Lkotlin/time/TimedValue;", j6f.GPS_DIRECTION_TRUE, "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/time/Duration;", "b", "J", "getDuration-UwyO8pc", "()J", BLiveOperationTitleShowType.duration, "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@WasExperimental
public final /* data */ class TimedValue<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long duration;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.m87488d(this.value, timedValue.value) && Duration.m93530p(this.duration, timedValue.duration);
    }

    public int hashCode() {
        T t = this.value;
        return ((t == null ? 0 : t.hashCode()) * 31) + Duration.m93509C(this.duration);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m93519P(this.duration)) + ')';
    }
}
