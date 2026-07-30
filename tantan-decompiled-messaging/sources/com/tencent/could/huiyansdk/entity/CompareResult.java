package com.tencent.could.huiyansdk.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class CompareResult implements Parcelable {
    public static final Parcelable.Creator<CompareResult> CREATOR = new Parcelable.Creator<CompareResult>() { // from class: com.tencent.could.huiyansdk.entity.CompareResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompareResult createFromParcel(Parcel parcel) {
            return new CompareResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompareResult[] newArray(int i) {
            return new CompareResult[i];
        }
    };
    public int errorCode;
    public String errorMsg;

    public CompareResult(Parcel parcel) {
        this.errorCode = -1;
        this.errorMsg = "";
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public String toString() {
        return "CompareResult{errorcode=" + this.errorCode + ", errormsg='" + this.errorMsg + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public CompareResult() {
        this.errorCode = -1;
        this.errorMsg = "";
    }
}
