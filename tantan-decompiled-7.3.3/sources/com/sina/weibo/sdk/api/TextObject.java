package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.utils.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class TextObject extends BaseMediaObject {
    public static final Parcelable.Creator<TextObject> CREATOR = new Parcelable.Creator<TextObject>() { // from class: com.sina.weibo.sdk.api.TextObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextObject createFromParcel(Parcel parcel) {
            return new TextObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextObject[] newArray(int i) {
            return new TextObject[i];
        }
    };
    public String text;

    public TextObject(Parcel parcel) {
        this.text = parcel.readString();
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public boolean checkArgs() {
        String str = this.text;
        if (str != null && str.length() != 0 && this.text.length() <= 1024) {
            return true;
        }
        LogUtil.m81662e("Weibo.TextObject", "checkArgs fail, text is invalid");
        return false;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public int getObjType() {
        return 1;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public BaseMediaObject toExtraMediaObject(String str) {
        return this;
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject
    public String toExtraMediaString() {
        return "";
    }

    @Override // com.sina.weibo.sdk.api.BaseMediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public TextObject() {
    }
}
