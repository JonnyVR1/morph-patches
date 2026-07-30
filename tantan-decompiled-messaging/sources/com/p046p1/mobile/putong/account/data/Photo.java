package com.p046p1.mobile.putong.account.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes9.dex */
public class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() { // from class: com.p1.mobile.putong.account.data.Photo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Photo[] newArray(int i) {
            return new Photo[i];
        }
    };

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
    public long f16345id;

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

    public Photo(Parcel parcel) {
        this.positionInSelect = -1;
        this.shootExra = "";
        this.editExtra = "";
        this.f16345id = parcel.readLong();
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

    public static boolean isGif(String str) {
        return TextUtils.equals(str, "image/gif");
    }

    public static boolean isImage(String str) {
        return TextUtils.equals(str, "image/jpg") || TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG) || TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG) || TextUtils.equals(str, "image/gif") || TextUtils.equals(str, "image/webp") || TextUtils.equals(str, "image/heif") || TextUtils.equals(str, "image/heic");
    }

    public static boolean isMp4(String str) {
        return TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4);
    }

    public static boolean isVideo(String str) {
        return TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4);
    }

    public void changeChecked(boolean z) {
        this.isCheck = z;
        if (z) {
            return;
        }
        this.isOriginal = false;
        this.rotate = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Photo) && !TextUtils.isEmpty(this.path) && TextUtils.equals(this.path, ((Photo) obj).path);
    }

    public long getId() {
        return this.f16345id;
    }

    public String getTempPath() {
        return this.tempPath;
    }

    public void setPhoto(Photo photo) {
        if (photo == null || photo == this) {
            return;
        }
        this.f16345id = photo.f16345id;
        this.size = photo.size;
        this.dateAdded = photo.dateAdded;
        this.path = photo.path;
        this.mimeType = photo.mimeType;
        this.bucketId = photo.bucketId;
        this.bucketName = photo.bucketName;
        this.type = photo.type;
        this.isCheck = photo.isCheck;
        this.duration = photo.duration;
        this.width = photo.width;
        this.height = photo.height;
        this.rotate = photo.rotate;
        this.isOriginal = photo.isOriginal;
        this.isTakePhoto = photo.isTakePhoto;
        this.longThumbPath = photo.longThumbPath;
        this.thumbPath = photo.thumbPath;
        this.tempPath = photo.tempPath;
        this.positionInAll = photo.positionInAll;
        this.positionInSelect = photo.positionInSelect;
        this.shootExra = photo.shootExra;
        this.editExtra = photo.editExtra;
    }

    public String toString() {
        return "Photo[ id:" + this.f16345id + "  path:" + this.path + "  isOriginal:" + this.isOriginal + "  size:" + this.size + "   tempPath:" + this.tempPath + "   isCheck:" + this.isCheck + "   mimeType:" + this.mimeType + "] isLong longThumbPath";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16345id);
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
        this.f16345id = i;
        this.path = str;
    }

    public Photo() {
        this.positionInSelect = -1;
        this.shootExra = "";
        this.editExtra = "";
    }
}
