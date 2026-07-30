package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci70;
import p149l.cn5;
import p149l.jck0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\fH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m87232d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "seconds", "", "nanoseconds", "", "(JI)V", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "time", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getNanoseconds", "()I", "getSeconds", "()J", "compareTo", "other", "describeContents", "equals", "", "", "hashCode", "toDate", "toInstant", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e*\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m87232d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "now", "validateRange", "", "seconds", "", "nanoseconds", "", "toPreciseTime", "Lkotlin/Pair;", "Ljava/util/Date;", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> toPreciseTime(Date date) {
            long time = date.getTime() / 1000;
            int time2 = (int) ((date.getTime() % 1000) * 1000000);
            return time2 < 0 ? TuplesKt.m87240a(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : TuplesKt.m87240a(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                jck0.m140980a("Timestamp nanoseconds out of range: ", nanoseconds);
            } else if (-62135596800L > seconds || seconds >= 253402300800L) {
                ci70.m107054a("Timestamp seconds out of range: ", seconds);
            }
        }

        @JvmStatic
        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(@NotNull Date date) {
        date.getClass();
        Companion companion = INSTANCE;
        Pair preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.component1()).longValue();
        int iIntValue = ((Number) preciseTime.component2()).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    @JvmStatic
    @NotNull
    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp other) {
        other.getClass();
        return cn5.m107734e(this, other, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * 1000) + ((long) (this.nanoseconds / PlaybackException.CUSTOM_ERROR_CODE_BASE)));
    }

    @RequiresApi(26)
    @NotNull
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        instantOfEpochSecond.getClass();
        return instantOfEpochSecond;
    }

    @NotNull
    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    public Timestamp(long j, int i) {
        INSTANCE.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public Timestamp(@NotNull Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        instant.getClass();
    }
}
