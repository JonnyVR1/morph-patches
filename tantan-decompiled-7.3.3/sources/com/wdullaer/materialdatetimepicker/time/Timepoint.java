package com.wdullaer.materialdatetimepicker.time;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class Timepoint implements Parcelable, Comparable<Timepoint> {
    public static final Parcelable.Creator<Timepoint> CREATOR = new C14837a();
    private int hour;
    private int minute;
    private int second;

    public enum TYPE {
        HOUR,
        MINUTE,
        SECOND
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.Timepoint$a */
    public class C14837a implements Parcelable.Creator<Timepoint> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timepoint createFromParcel(Parcel parcel) {
            return new Timepoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timepoint[] newArray(int i) {
            return new Timepoint[i];
        }
    }

    public Timepoint(Parcel parcel) {
        this.hour = parcel.readInt();
        this.minute = parcel.readInt();
        this.second = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Timepoint timepoint) {
        return ((this.hour - timepoint.hour) * MMKV.ExpireInHour) + ((this.minute - timepoint.minute) * 60) + (this.second - timepoint.second);
    }

    @IntRange(from = 0, to = 23)
    /* JADX INFO: renamed from: b */
    public int m86408b() {
        return this.hour;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        try {
            Timepoint timepoint = (Timepoint) obj;
            return timepoint.m86408b() == this.hour && timepoint.m86409f() == this.minute && timepoint.m86410g() == this.second;
        } catch (ClassCastException unused) {
        }
    }

    @IntRange(from = 0, to = 59)
    /* JADX INFO: renamed from: f */
    public int m86409f() {
        return this.minute;
    }

    @IntRange(from = 0, to = 59)
    /* JADX INFO: renamed from: g */
    public int m86410g() {
        return this.second;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86411h() {
        return this.hour < 12;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86412i() {
        int i = this.hour;
        return i >= 12 && i < 24;
    }

    /* JADX INFO: renamed from: m */
    public void m86413m() {
        int i = this.hour;
        if (i >= 12) {
            this.hour = i % 12;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m86414n() {
        int i = this.hour;
        if (i < 12) {
            this.hour = (i + 12) % 24;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.second);
    }

    public Timepoint(@IntRange(from = 0, to = 23) int i, @IntRange(from = 0, to = 59) int i2, @IntRange(from = 0, to = 59) int i3) {
        this.hour = i % 24;
        this.minute = i2 % 60;
        this.second = i3 % 60;
    }

    public Timepoint(@IntRange(from = 0, to = 23) int i, @IntRange(from = 0, to = 59) int i2) {
        this(i, i2, 0);
    }

    public Timepoint(@IntRange(from = 0, to = 23) int i) {
        this(i, 0);
    }

    public Timepoint(Timepoint timepoint) {
        this(timepoint.hour, timepoint.minute, timepoint.second);
    }
}
