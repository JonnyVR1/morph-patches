package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p149l.p11;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C1910a();
    public final List<Segment> segments;

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: l.bkf0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
                SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
                return zm5.m219305k().mo219307e(segment.startTimeMs, segment2.startTimeMs).mo219307e(segment.endTimeMs, segment2.endTimeMs).mo219306d(segment.speedDivisor, segment2.speedDivisor).mo219312j();
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new C1909a();
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$a */
        public class C1909a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            p11.m167007a(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public String toString() {
            return vck0.m197793D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$a */
    public class C1910a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        p11.m167007a(!m10586a(list));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10586a(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.segments;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }
}
