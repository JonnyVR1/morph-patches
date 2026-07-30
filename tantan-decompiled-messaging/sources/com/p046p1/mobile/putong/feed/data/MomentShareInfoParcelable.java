package com.p046p1.mobile.putong.feed.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class MomentShareInfoParcelable extends MomentShareInfo implements Parcelable {
    public static final Parcelable.Creator<MomentShareInfoParcelable> CREATOR = new Parcelable.Creator<MomentShareInfoParcelable>() { // from class: com.p1.mobile.putong.feed.data.MomentShareInfoParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MomentShareInfoParcelable createFromParcel(Parcel parcel) {
            return new MomentShareInfoParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MomentShareInfoParcelable[] newArray(int i) {
            return new MomentShareInfoParcelable[i];
        }
    };

    public MomentShareInfoParcelable(Parcel parcel) {
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.url = parcel.readString();
        this.landingPage = parcel.readString();
        this.name = parcel.readString();
        this.shareFrom = parcel.readString();
        this.testId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        parcel.writeString(this.landingPage);
        parcel.writeString(this.name);
        parcel.writeString(this.shareFrom);
        parcel.writeString(this.testId);
    }

    public MomentShareInfoParcelable(MomentShareInfo momentShareInfo) {
        this.title = momentShareInfo.title;
        this.description = momentShareInfo.description;
        this.url = momentShareInfo.url;
        this.landingPage = momentShareInfo.landingPage;
        this.name = momentShareInfo.name;
        this.shareFrom = momentShareInfo.shareFrom;
        this.testId = momentShareInfo.testId;
    }

    public MomentShareInfoParcelable(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.landingPage = str4;
        this.name = str5;
        this.shareFrom = str6;
        this.testId = str7;
    }
}
