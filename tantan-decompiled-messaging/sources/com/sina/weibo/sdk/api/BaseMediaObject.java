package com.sina.weibo.sdk.api;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseMediaObject implements Parcelable {
    public static final int MEDIA_TYPE_IMAGE = 2;
    public static final int MEDIA_TYPE_MULITI_IMAGE = 6;
    public static final int MEDIA_TYPE_SOURCE_VIDEO = 7;
    public static final int MEDIA_TYPE_TEXT = 1;
    public static final int MEDIA_TYPE_WEBPAGE = 5;
    public String actionUrl;
    public String description;
    public String identify;
    public String schema;
    public byte[] thumbData;
    public String title;

    public BaseMediaObject(Parcel parcel) {
        this.actionUrl = parcel.readString();
        this.schema = parcel.readString();
        this.identify = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.thumbData = parcel.createByteArray();
    }

    public boolean checkArgs() {
        String str = this.actionUrl;
        if (str == null || str.length() > 512) {
            LogUtil.m80479e("Weibo.BaseMediaObject", "checkArgs fail, actionUrl is invalid");
            return false;
        }
        String str2 = this.identify;
        if (str2 == null || str2.length() > 512) {
            LogUtil.m80479e("Weibo.BaseMediaObject", "checkArgs fail, identify is invalid");
            return false;
        }
        byte[] bArr = this.thumbData;
        if (bArr == null || bArr.length > 32768) {
            StringBuilder sb = new StringBuilder("checkArgs fail, thumbData is invalid,size is ");
            byte[] bArr2 = this.thumbData;
            sb.append(bArr2 != null ? bArr2.length : -1);
            sb.append("! more then 32768.");
            LogUtil.m80479e("Weibo.BaseMediaObject", sb.toString());
            return false;
        }
        String str3 = this.title;
        if (str3 == null || str3.length() > 512) {
            LogUtil.m80479e("Weibo.BaseMediaObject", "checkArgs fail, title is invalid");
            return false;
        }
        String str4 = this.description;
        if (str4 != null && str4.length() <= 1024) {
            return true;
        }
        LogUtil.m80479e("Weibo.BaseMediaObject", "checkArgs fail, description is invalid");
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract int getObjType();

    public final void setThumbImage(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream2);
                        this.thumbData = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        e.printStackTrace();
                        LogUtil.m80479e("Weibo.BaseMediaObject", "put thumb failed");
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public abstract BaseMediaObject toExtraMediaObject(String str);

    public abstract String toExtraMediaString();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.schema);
        parcel.writeString(this.identify);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.thumbData);
    }

    public BaseMediaObject() {
    }
}
