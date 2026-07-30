package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BaseWebViewRequestData implements Parcelable, Serializable {
    public static final Parcelable.Creator<BaseWebViewRequestData> CREATOR = new Parcelable.Creator<BaseWebViewRequestData>() { // from class: com.sina.weibo.sdk.web.BaseWebViewRequestData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseWebViewRequestData createFromParcel(Parcel parcel) {
            return new BaseWebViewRequestData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BaseWebViewRequestData[] newArray(int i) {
            return new BaseWebViewRequestData[i];
        }
    };
    private AuthInfo authInfo;
    private String callback;
    private int callbackType;
    private String specifyTitle;
    private WebRequestType type;
    private String url;

    public BaseWebViewRequestData(Parcel parcel) {
        this.callbackType = 0;
        this.url = parcel.readString();
        this.authInfo = (AuthInfo) parcel.readParcelable(AuthInfo.class.getClassLoader());
        int i = parcel.readInt();
        this.type = i == -1 ? null : WebRequestType.values()[i];
        this.callback = parcel.readString();
        this.specifyTitle = parcel.readString();
        this.callbackType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public String getCallback() {
        return this.callback;
    }

    public int getCallbackType() {
        return this.callbackType;
    }

    public String getSpecifyTitle() {
        return this.specifyTitle;
    }

    public WebRequestType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public void setCallback(String str) {
        this.callback = str;
    }

    public void setCallbackType(int i) {
        this.callbackType = i;
    }

    public void setSpecifyTitle(String str) {
        this.specifyTitle = str;
    }

    public void setType(WebRequestType webRequestType) {
        this.type = webRequestType;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeParcelable(this.authInfo, i);
        WebRequestType webRequestType = this.type;
        parcel.writeInt(webRequestType == null ? -1 : webRequestType.ordinal());
        parcel.writeString(this.callback);
        parcel.writeString(this.specifyTitle);
        parcel.writeInt(this.callbackType);
    }

    public BaseWebViewRequestData(AuthInfo authInfo, WebRequestType webRequestType, String str, int i, String str2, String str3) {
        this.callback = str;
        this.authInfo = authInfo;
        this.type = webRequestType;
        this.specifyTitle = str2;
        this.url = str3;
        this.callbackType = i;
    }

    public BaseWebViewRequestData(AuthInfo authInfo, WebRequestType webRequestType, String str, String str2, String str3) {
        this(authInfo, webRequestType, str, 0, str2, str3);
    }
}
