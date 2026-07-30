package com.hihonor.push.sdk.common.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class ApiException extends Exception implements Parcelable {
    public static final Parcelable.Creator<ApiException> CREATOR = new Parcelable.Creator<ApiException>() { // from class: com.hihonor.push.sdk.common.data.ApiException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApiException createFromParcel(Parcel parcel) {
            return new ApiException(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApiException[] newArray(int i) {
            return new ApiException[i];
        }
    };
    public int errorCode;
    public String message;

    public ApiException(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.message = parcel.readString();
    }

    private void initData(int i, String str) {
        this.errorCode = i;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.message);
    }

    public ApiException(int i, String str) {
        initData(i, str);
    }

    public ApiException(int i) {
        initData(i, null);
    }
}
