package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C1934a();
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$a */
    public class C1934a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C1934a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.captureFrameRate = parcel.readFloat();
        this.svcTemporalLayerCount = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Floats.m16466c(this.captureFrameRate)) * 31) + this.svcTemporalLayerCount;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.captureFrameRate + ", svcTemporalLayerCount=" + this.svcTemporalLayerCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.captureFrameRate);
        parcel.writeInt(this.svcTemporalLayerCount);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.captureFrameRate = f;
        this.svcTemporalLayerCount = i;
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C1934a c1934a) {
        this(parcel);
    }
}
