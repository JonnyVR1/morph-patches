package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, m87232d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "", MerchandiseTimeUnit.year, MerchandiseTimeUnit.month, "day", "hour", "minute", MerchandiseTimeUnit.second, "nanosecond", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "()I", "b", Constants.INAPP_DATA_TAG, "c", "e", "f", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@ExperimentalTime
public final class UnboundLocalDateTime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int hour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int minute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int second;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int nanosecond;

    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "Lkotlin/time/Instant;", "instant", "Lkotlin/time/UnboundLocalDateTime;", "a", "(Lkotlin/time/Instant;)Lkotlin/time/UnboundLocalDateTime;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final UnboundLocalDateTime m93592a(@NotNull Instant instant) {
            long j;
            instant.getClass();
            long epochSeconds = instant.getEpochSeconds();
            long j2 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j2 * 86400 != epochSeconds) {
                j2--;
            }
            long j3 = epochSeconds % 86400;
            int i = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
            long j4 = 719468 + j2;
            if (j4 < 0) {
                long j5 = ((j2 + 719469) / 146097) - 1;
                j = j5 * 400;
                j4 += (-j5) * 146097;
            } else {
                j = 0;
            }
            long j6 = ((400 * j4) + 591) / 146097;
            long j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            if (j7 < 0) {
                j6--;
                j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            }
            int i2 = (int) j7;
            int i3 = ((i2 * 5) + 2) / 153;
            int i4 = ((i3 + 2) % 12) + 1;
            int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
            int i6 = (int) (j6 + j + ((long) (i3 / 10)));
            int i7 = i / MMKV.ExpireInHour;
            int i8 = i - (i7 * MMKV.ExpireInHour);
            int i9 = i8 / 60;
            return new UnboundLocalDateTime(i6, i4, i5, i7, i9, i8 - (i9 * 60), instant.getNanosecondsOfSecond());
        }

        private Companion() {
        }
    }

    public UnboundLocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.hour = i4;
        this.minute = i5;
        this.second = i6;
        this.nanosecond = i7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNanosecond() {
        return this.nanosecond;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
    }
}
