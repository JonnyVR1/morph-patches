package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C1929a();

    @Nullable
    public final String description;
    public final String url;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public class C1929a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) bmk0.m105144j(parcel.readString()));
        this.description = parcel.readString();
        this.url = (String) bmk0.m105144j(parcel.readString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f7968id.equals(urlLinkFrame.f7968id) && bmk0.m105123c(this.description, urlLinkFrame.description) && bmk0.m105123c(this.url, urlLinkFrame.url)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f7968id.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": url=" + this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7968id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }
}
