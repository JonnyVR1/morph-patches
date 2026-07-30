package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1945o;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C1919a();

    /* JADX INFO: renamed from: ID */
    public static final String f7963ID = "APIC";

    @Nullable
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public class C1919a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(Parcel parcel) {
        super(f7963ID);
        this.mimeType = (String) bmk0.m105144j(parcel.readString());
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.pictureType == apicFrame.pictureType && bmk0.m105123c(this.mimeType, apicFrame.mimeType) && bmk0.m105123c(this.description, apicFrame.description) && Arrays.equals(this.pictureData, apicFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (527 + this.pictureType) * 31;
        String str = this.mimeType;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.pictureData);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: j */
    public void mo10589j(C1945o.b bVar) {
        bVar.m10810I(this.pictureData, this.pictureType);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super(f7963ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }
}
