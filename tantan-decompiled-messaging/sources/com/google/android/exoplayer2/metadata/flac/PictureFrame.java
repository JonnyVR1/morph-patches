package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p149l.d860;
import p149l.fs4;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C1892a();
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.PictureFrame$a */
    public class C1892a implements Parcelable.Creator<PictureFrame> {
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
        this.mimeType = (String) vck0.m197866j(parcel.readString());
        this.description = (String) vck0.m197866j(parcel.readString());
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = (byte[]) vck0.m197866j(parcel.createByteArray());
    }

    /* JADX INFO: renamed from: a */
    public static PictureFrame m10549a(d860 d860Var) {
        int iM110311q = d860Var.m110311q();
        String strM110277F = d860Var.m110277F(d860Var.m110311q(), fs4.f99034a);
        String strM110276E = d860Var.m110276E(d860Var.m110311q());
        int iM110311q2 = d860Var.m110311q();
        int iM110311q3 = d860Var.m110311q();
        int iM110311q4 = d860Var.m110311q();
        int iM110311q5 = d860Var.m110311q();
        int iM110311q6 = d860Var.m110311q();
        byte[] bArr = new byte[iM110311q6];
        d860Var.m110306l(bArr, 0, iM110311q6);
        return new PictureFrame(iM110311q, strM110277F, strM110276E, iM110311q2, iM110311q3, iM110311q4, iM110311q5, bArr);
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
    public void mo10535j(C1922o.b bVar) {
        bVar.m10756I(this.pictureData, this.pictureType);
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
