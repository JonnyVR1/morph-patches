package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class StoryMessage implements Parcelable {
    public static final Parcelable.Creator<StoryMessage> CREATOR = new Parcelable.Creator<StoryMessage>() { // from class: com.sina.weibo.sdk.api.StoryMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StoryMessage createFromParcel(Parcel parcel) {
            return new StoryMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StoryMessage[] newArray(int i) {
            return new StoryMessage[i];
        }
    };
    private Uri imageUri;
    private Uri videoUri;

    public StoryMessage(Parcel parcel) {
        this.imageUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.videoUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public boolean checkSource() {
        Uri uri = this.imageUri;
        if (uri == null || this.videoUri == null) {
            return (uri == null && this.videoUri == null) ? false : true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri getImageUri() {
        return this.imageUri;
    }

    public Uri getVideoUri() {
        return this.videoUri;
    }

    public void setImageUri(Uri uri) {
        this.imageUri = uri;
    }

    public void setVideoUri(Uri uri) {
        this.videoUri = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.imageUri, i);
        parcel.writeParcelable(this.videoUri, i);
    }

    public StoryMessage() {
    }
}
