package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class StoryObject implements Parcelable {
    public static final Parcelable.Creator<StoryObject> CREATOR = new Parcelable.Creator<StoryObject>() { // from class: com.sina.weibo.sdk.api.StoryObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StoryObject createFromParcel(Parcel parcel) {
            return new StoryObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StoryObject[] newArray(int i) {
            return new StoryObject[i];
        }
    };
    public String appId;
    public String appPackage;
    public String callbackAction;
    public String sourcePath;
    public int sourceType;

    public StoryObject(Parcel parcel) {
        this.callbackAction = "com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY";
        this.sourcePath = parcel.readString();
        this.sourceType = parcel.readInt();
        this.appId = parcel.readString();
        this.appPackage = parcel.readString();
        this.callbackAction = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sourcePath);
        parcel.writeInt(this.sourceType);
        parcel.writeString(this.appId);
        parcel.writeString(this.appPackage);
        parcel.writeString(this.callbackAction);
    }

    public StoryObject() {
        this.callbackAction = "com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY";
    }
}
