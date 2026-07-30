package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VideoSourceObject extends BaseMediaObject {
    public static final Parcelable.Creator<VideoSourceObject> CREATOR = new Parcelable.Creator<VideoSourceObject>() { // from class: com.sina.weibo.sdk.api.VideoSourceObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoSourceObject createFromParcel(Parcel parcel) {
            return new VideoSourceObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoSourceObject[] newArray(int i) {
            return new VideoSourceObject[i];
        }
    };
    public Uri coverPath;
    public long during;
    public Uri videoPath;

    public VideoSourceObject(Parcel parcel) {
        super(parcel);
        this.coverPath = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.videoPath = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.during = parcel.readLong();
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public int getObjType() {
        return 0;
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
        parcel.writeParcelable(this.coverPath, i);
        parcel.writeParcelable(this.videoPath, i);
        parcel.writeLong(this.during);
    }

    public VideoSourceObject() {
    }
}
