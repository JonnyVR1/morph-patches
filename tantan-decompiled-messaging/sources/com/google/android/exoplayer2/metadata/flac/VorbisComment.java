package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.metadata.Metadata;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C1893a();
    public final String key;
    public final String value;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.VorbisComment$a */
    public class C1893a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(Parcel parcel) {
        this.key = (String) vck0.m197866j(parcel.readString());
        this.value = (String) vck0.m197866j(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.key.hashCode()) * 31) + this.value.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: j */
    public void mo10535j(C1922o.b bVar) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "ALBUM":
                bVar.m10761N(this.value);
                break;
            case "TITLE":
                bVar.m10786m0(this.value);
                break;
            case "DESCRIPTION":
                bVar.m10768U(this.value);
                break;
            case "ALBUMARTIST":
                bVar.m10760M(this.value);
                break;
            case "ARTIST":
                bVar.m10762O(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public VorbisComment(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
