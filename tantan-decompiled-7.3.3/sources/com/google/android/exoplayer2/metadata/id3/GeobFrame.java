package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C1924a();

    /* JADX INFO: renamed from: ID */
    public static final String f7967ID = "GEOB";
    public final byte[] data;
    public final String description;
    public final String filename;
    public final String mimeType;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public class C1924a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(Parcel parcel) {
        super(f7967ID);
        this.mimeType = (String) bmk0.m105144j(parcel.readString());
        this.filename = (String) bmk0.m105144j(parcel.readString());
        this.description = (String) bmk0.m105144j(parcel.readString());
        this.data = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (bmk0.m105123c(this.mimeType, geobFrame.mimeType) && bmk0.m105123c(this.filename, geobFrame.filename) && bmk0.m105123c(this.description, geobFrame.description) && Arrays.equals(this.data, geobFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mimeType;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.filename;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.data);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": mimeType=" + this.mimeType + ", filename=" + this.filename + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(f7967ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }
}
