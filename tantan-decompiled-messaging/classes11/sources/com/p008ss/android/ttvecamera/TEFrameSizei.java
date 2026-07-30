package com.p008ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new C0723a();
    public int height;
    public int width;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFrameSizei$a */
    public static class C0723a implements Parcelable.Creator<TEFrameSizei> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFrameSizei createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFrameSizei[] newArray(int i) {
            return new TEFrameSizei[i];
        }
    }

    public TEFrameSizei(Parcel parcel) {
        this.width = 720;
        this.height = 1280;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public boolean m10891a() {
        return this.width > 0 && this.height > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        return this.width == tEFrameSizei.width && this.height == tEFrameSizei.height;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public TEFrameSizei(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public TEFrameSizei() {
        this.width = 720;
        this.height = 1280;
    }
}
