package com.p008ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TEFrameRateRange implements Parcelable {
    public static final Parcelable.Creator<TEFrameRateRange> CREATOR = new C0722a();
    public int fpsUnitFactor;
    public int max;
    public int min;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFrameRateRange$a */
    public static class C0722a implements Parcelable.Creator<TEFrameRateRange> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFrameRateRange createFromParcel(Parcel parcel) {
            return new TEFrameRateRange(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFrameRateRange[] newArray(int i) {
            return new TEFrameRateRange[i];
        }
    }

    public TEFrameRateRange(Parcel parcel) {
        this.fpsUnitFactor = 1;
        this.min = parcel.readInt();
        this.max = parcel.readInt();
        this.fpsUnitFactor = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static int m10886a(List<int[]> list) {
        return (list.size() > 0 && list.get(0)[1] > 1000) ? 1000 : 1;
    }

    /* JADX INFO: renamed from: b */
    public int[] m10887b() {
        int i = this.min;
        int i2 = this.fpsUnitFactor;
        return new int[]{i / i2, this.max / i2};
    }

    /* JADX INFO: renamed from: c */
    public int[] m10888c(int i) {
        int i2 = this.min;
        int i3 = this.fpsUnitFactor;
        return new int[]{(i2 / i3) * i, (this.max / i3) * i};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameRateRange)) {
            return false;
        }
        TEFrameRateRange tEFrameRateRange = (TEFrameRateRange) obj;
        return this.min == tEFrameRateRange.min && this.max == tEFrameRateRange.max;
    }

    public int hashCode() {
        return (this.min * 65537) + 1 + this.max;
    }

    @NonNull
    public String toString() {
        return "[" + (this.min / this.fpsUnitFactor) + ", " + (this.max / this.fpsUnitFactor) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        parcel.writeInt(this.fpsUnitFactor);
    }

    public TEFrameRateRange(int i, int i2) {
        this.fpsUnitFactor = 1;
        this.min = i;
        this.max = i2;
        this.fpsUnitFactor = i2 > 1000 ? 1000 : 1;
    }
}
