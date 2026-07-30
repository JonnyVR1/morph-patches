package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class MultiImageObject extends BaseMediaObject {
    public static final Parcelable.Creator<MultiImageObject> CREATOR = new Parcelable.Creator<MultiImageObject>() { // from class: com.sina.weibo.sdk.api.MultiImageObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiImageObject createFromParcel(Parcel parcel) {
            return new MultiImageObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiImageObject[] newArray(int i) {
            return new MultiImageObject[i];
        }
    };
    public ArrayList<Uri> imageList;

    public MultiImageObject(Parcel parcel) {
        super(parcel);
        this.imageList = parcel.createTypedArrayList(Uri.CREATOR);
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<Uri> getImageList() {
        return this.imageList;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public int getObjType() {
        return 0;
    }

    public void setImageList(ArrayList<Uri> arrayList) {
        this.imageList = arrayList;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public BaseMediaObject toExtraMediaObject(String str) {
        return null;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public String toExtraMediaString() {
        return null;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.imageList);
    }

    public MultiImageObject() {
    }
}
