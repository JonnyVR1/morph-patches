package com.p051p1.mobile.putong.feed.newui.camera.momosdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes13.dex */
public class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new C11324a();

    @Expose
    public String bucketId;

    @Expose
    public String bucketName;

    @Expose
    public long dateAdded;

    @Expose
    public long duration;

    @Expose
    public String editExtra;

    @Expose
    public String faceDetect;

    @Expose
    public int height;

    /* JADX INFO: renamed from: id */
    @Expose
    public long f40329id;

    @Expose
    public boolean isCheck;

    @Expose
    public boolean isLong;

    @Expose
    public boolean isOriginal;

    @Expose
    public boolean isTakePhoto;

    @Expose
    public String longThumbPath;

    @Expose
    public String mimeType;

    @Expose
    public String path;

    @Expose
    public int positionInAll;

    @Expose
    public int positionInSelect;

    @Expose
    public int rotate;

    @Expose
    public String shootExra;

    @Expose
    public long size;

    @Expose
    public String tempPath;

    @Expose
    public String thumbPath;

    @Expose
    public int type;

    @Expose
    public int width;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.momosdk.Photo$a */
    public class C11324a implements Parcelable.Creator<Photo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Photo[] newArray(int i) {
            return new Photo[i];
        }
    }

    public Photo(Parcel parcel) {
        this.positionInSelect = -1;
        this.shootExra = "";
        this.editExtra = "";
        this.f40329id = parcel.readLong();
        this.size = parcel.readLong();
        this.dateAdded = parcel.readLong();
        this.path = parcel.readString();
        this.mimeType = parcel.readString();
        this.bucketId = parcel.readString();
        this.bucketName = parcel.readString();
        this.type = parcel.readInt();
        this.isCheck = parcel.readInt() == 1;
        this.duration = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.rotate = parcel.readInt();
        this.isOriginal = parcel.readInt() == 1;
        this.isLong = parcel.readInt() == 1;
        this.isTakePhoto = parcel.readInt() == 1;
        this.longThumbPath = parcel.readString();
        this.longThumbPath = parcel.readString();
        this.tempPath = parcel.readString();
        this.positionInAll = parcel.readInt();
        this.positionInSelect = parcel.readInt();
        this.shootExra = parcel.readString();
        this.editExtra = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Photo) && !TextUtils.isEmpty(this.path) && TextUtils.equals(this.path, ((Photo) obj).path);
    }

    public String toString() {
        return "Photo[ id:" + this.f40329id + "  path:" + this.path + "  isOriginal:" + this.isOriginal + "  size:" + this.size + "   tempPath:" + this.tempPath + "   isCheck:" + this.isCheck + "   mimeType:" + this.mimeType + "] isLong longThumbPath";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f40329id);
        parcel.writeLong(this.size);
        parcel.writeLong(this.dateAdded);
        parcel.writeString(this.path);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.bucketId);
        parcel.writeString(this.bucketName);
        parcel.writeInt(this.type);
        parcel.writeInt(this.isCheck ? 1 : 0);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.isOriginal ? 1 : 0);
        parcel.writeInt(this.isLong ? 1 : 0);
        parcel.writeInt(this.isTakePhoto ? 1 : 0);
        parcel.writeString(this.longThumbPath);
        parcel.writeString(this.thumbPath);
        parcel.writeString(this.tempPath);
        parcel.writeInt(this.positionInAll);
        parcel.writeInt(this.positionInSelect);
        parcel.writeString(this.shootExra);
        parcel.writeString(this.editExtra);
    }

    public Photo(int i, String str) {
        this.positionInSelect = -1;
        this.shootExra = "";
        this.editExtra = "";
        this.f40329id = i;
        this.path = str;
    }

    public Photo() {
        this.positionInSelect = -1;
        this.shootExra = "";
        this.editExtra = "";
    }
}
