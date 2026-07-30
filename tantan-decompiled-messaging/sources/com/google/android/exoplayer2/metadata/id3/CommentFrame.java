package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C1900a();

    /* JADX INFO: renamed from: ID */
    public static final String f7929ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public class C1900a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(Parcel parcel) {
        super(f7929ID);
        this.language = (String) vck0.m197866j(parcel.readString());
        this.description = (String) vck0.m197866j(parcel.readString());
        this.text = (String) vck0.m197866j(parcel.readString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (vck0.m197845c(this.description, commentFrame.description) && vck0.m197845c(this.language, commentFrame.language) && vck0.m197845c(this.text, commentFrame.text)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7931id + ": language=" + this.language + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7931id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }

    public CommentFrame(String str, String str2, String str3) {
        super(f7929ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }
}
