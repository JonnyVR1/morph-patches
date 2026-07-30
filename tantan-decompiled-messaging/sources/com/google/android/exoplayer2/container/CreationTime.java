package com.google.android.exoplayer2.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes6.dex */
public final class CreationTime implements Metadata.Entry {
    public static final Parcelable.Creator<CreationTime> CREATOR = new C1835a();
    public final long timestampMs;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.container.CreationTime$a */
    public class C1835a implements Parcelable.Creator<CreationTime> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CreationTime createFromParcel(Parcel parcel) {
            return new CreationTime(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CreationTime[] newArray(int i) {
            return new CreationTime[i];
        }
    }

    public CreationTime(Parcel parcel) {
        this.timestampMs = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreationTime) && this.timestampMs == ((CreationTime) obj).timestampMs;
    }

    public int hashCode() {
        return Longs.m16474e(this.timestampMs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j = this.timestampMs;
        sb.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestampMs);
    }

    public CreationTime(long j) {
        this.timestampMs = j;
    }

    public /* synthetic */ CreationTime(Parcel parcel, C1835a c1835a) {
        this(parcel);
    }
}
