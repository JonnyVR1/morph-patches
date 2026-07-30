package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1945o;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p153l.bmk0;
import p153l.et4;
import p153l.ig60;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C1915a();
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.PictureFrame$a */
    public class C1915a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        this.mimeType = (String) bmk0.m105144j(parcel.readString());
        this.description = (String) bmk0.m105144j(parcel.readString());
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    /* JADX INFO: renamed from: a */
    public static PictureFrame m10603a(ig60 ig60Var) {
        int iM139827q = ig60Var.m139827q();
        String strM139793F = ig60Var.m139793F(ig60Var.m139827q(), et4.f95687a);
        String strM139792E = ig60Var.m139792E(ig60Var.m139827q());
        int iM139827q2 = ig60Var.m139827q();
        int iM139827q3 = ig60Var.m139827q();
        int iM139827q4 = ig60Var.m139827q();
        int iM139827q5 = ig60Var.m139827q();
        int iM139827q6 = ig60Var.m139827q();
        byte[] bArr = new byte[iM139827q6];
        ig60Var.m139822l(bArr, 0, iM139827q6);
        return new PictureFrame(iM139827q, strM139793F, strM139792E, iM139827q2, iM139827q3, iM139827q4, iM139827q5, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.pictureType) * 31) + this.mimeType.hashCode()) * 31) + this.description.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31) + Arrays.hashCode(this.pictureData);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: j */
    public void mo10589j(C1945o.b bVar) {
        bVar.m10810I(this.pictureData, this.pictureType);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.pictureType = i;
        this.mimeType = str;
        this.description = str2;
        this.width = i2;
        this.height = i3;
        this.depth = i4;
        this.colors = i5;
        this.pictureData = bArr;
    }
}
