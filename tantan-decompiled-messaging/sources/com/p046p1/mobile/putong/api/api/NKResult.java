package com.p046p1.mobile.putong.api.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class NKResult implements Parcelable {
    public static final Parcelable.Creator<NKResult> CREATOR = new C4693a();

    /* JADX INFO: renamed from: iv */
    byte[] f17157iv;
    int ivLength;
    byte[] res;
    int resLength;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.NKResult$a */
    public class C4693a implements Parcelable.Creator<NKResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NKResult createFromParcel(Parcel parcel) {
            return new NKResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NKResult[] newArray(int i) {
            return new NKResult[i];
        }
    }

    public NKResult(Parcel parcel) {
        this.res = null;
        this.f17157iv = null;
        this.resLength = parcel.readInt();
        int i = parcel.readInt();
        this.ivLength = i;
        byte[] bArr = new byte[this.resLength];
        this.res = bArr;
        this.f17157iv = new byte[i];
        parcel.readByteArray(bArr);
        parcel.readByteArray(this.f17157iv);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resLength);
        parcel.writeInt(this.ivLength);
        parcel.writeByteArray(this.res);
        parcel.writeByteArray(this.f17157iv);
    }

    public NKResult(byte[] bArr, byte[] bArr2) {
        this.res = null;
        this.f17157iv = null;
        this.resLength = bArr.length;
        this.res = bArr;
        this.ivLength = bArr2.length;
        this.f17157iv = bArr2;
    }
}
