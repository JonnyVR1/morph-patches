package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C1925a();

    /* JADX INFO: renamed from: ID */
    public static final String f7969ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$a */
    public class C1925a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(Parcel parcel) {
        super(f7969ID);
        this.domain = (String) bmk0.m105144j(parcel.readString());
        this.description = (String) bmk0.m105144j(parcel.readString());
        this.text = (String) bmk0.m105144j(parcel.readString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (bmk0.m105123c(this.description, internalFrame.description) && bmk0.m105123c(this.domain, internalFrame.domain) && bmk0.m105123c(this.text, internalFrame.text)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.domain;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": domain=" + this.domain + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7968id);
        parcel.writeString(this.domain);
        parcel.writeString(this.text);
    }

    public InternalFrame(String str, String str2, String str3) {
        super(f7969ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }
}
