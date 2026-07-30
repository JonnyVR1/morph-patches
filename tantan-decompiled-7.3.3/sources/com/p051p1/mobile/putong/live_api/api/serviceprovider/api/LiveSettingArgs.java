package com.p051p1.mobile.putong.live_api.api.serviceprovider.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveSettingArgs implements Serializable, Parcelable {
    public static final Parcelable.Creator<LiveSettingArgs> CREATOR = new C13219a();

    @Nullable
    public final int subCode;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs$a */
    public class C13219a implements Parcelable.Creator<LiveSettingArgs> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LiveSettingArgs createFromParcel(Parcel parcel) {
            return new LiveSettingArgs(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LiveSettingArgs[] newArray(int i) {
            return new LiveSettingArgs[i];
        }
    }

    public LiveSettingArgs(Parcel parcel) {
        this.subCode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.subCode);
    }

    public LiveSettingArgs(int i) {
        this.subCode = i;
    }

    public LiveSettingArgs() {
        this.subCode = -1;
    }
}
