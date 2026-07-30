package com.p069ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new C13316a();
    public Rect mActiveSize;
    public Rect mCropSize;
    public int mMaxRegionsAE;
    public int mMaxRegionsAF;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TEFocusParameters$a */
    public static class C13316a implements Parcelable.Creator<TEFocusParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFocusParameters createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFocusParameters[] newArray(int i) {
            return new TEFocusParameters[i];
        }
    }

    public TEFocusParameters(Parcel parcel) {
        this.mActiveSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.mMaxRegionsAF = parcel.readInt();
        this.mMaxRegionsAE = parcel.readInt();
        this.mCropSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "active size is:" + this.mActiveSize.toString() + " crop size is: " + this.mCropSize.toString() + "  max AF regions is: " + this.mMaxRegionsAF + "  max AE regions is: " + this.mMaxRegionsAE;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mActiveSize, i);
        parcel.writeInt(this.mMaxRegionsAF);
        parcel.writeInt(this.mMaxRegionsAE);
        parcel.writeParcelable(this.mCropSize, i);
    }

    public TEFocusParameters() {
    }
}
