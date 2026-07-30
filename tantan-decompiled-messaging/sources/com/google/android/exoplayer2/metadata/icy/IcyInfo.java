package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p149l.p11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C1895a();
    public final byte[] rawMetadata;

    @Nullable
    public final String title;

    @Nullable
    public final String url;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.icy.IcyInfo$a */
    public class C1895a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(Parcel parcel) {
        this.rawMetadata = (byte[]) p11.m167011e(parcel.createByteArray());
        this.title = parcel.readString();
        this.url = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj).rawMetadata);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: j */
    public void mo10535j(C1922o.b bVar) {
        String str = this.title;
        if (str != null) {
            bVar.m10786m0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.title, this.url, Integer.valueOf(this.rawMetadata.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rawMetadata);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }
}
