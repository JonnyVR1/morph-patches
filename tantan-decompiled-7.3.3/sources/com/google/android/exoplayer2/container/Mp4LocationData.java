package com.google.android.exoplayer2.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Floats;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new C1859a();
    public final float latitude;
    public final float longitude;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.container.Mp4LocationData$a */
    public class C1859a implements Parcelable.Creator<Mp4LocationData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel, (C1859a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mp4LocationData[] newArray(int i) {
            return new Mp4LocationData[i];
        }
    }

    public Mp4LocationData(@FloatRange(from = -90.0d, to = 90.0d) float f, @FloatRange(from = -180.0d, to = 180.0d) float f2) {
        w11.m204366b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f;
        this.longitude = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Floats.m16466c(this.latitude)) * 31) + Floats.m16466c(this.longitude);
    }

    public String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
    }

    public /* synthetic */ Mp4LocationData(Parcel parcel, C1859a c1859a) {
        this(parcel);
    }

    public Mp4LocationData(Parcel parcel) {
        this.latitude = parcel.readFloat();
        this.longitude = parcel.readFloat();
    }
}
