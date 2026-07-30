package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C1926a();

    /* JADX INFO: renamed from: ID */
    public static final String f7970ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.MlltFrame$a */
    public class C1926a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(Parcel parcel) {
        super(f7970ID);
        this.mpegFramesBetweenReference = parcel.readInt();
        this.bytesBetweenReference = parcel.readInt();
        this.millisecondsBetweenReference = parcel.readInt();
        this.bytesDeviations = (int[]) bmk0.m105144j(parcel.createIntArray());
        this.millisecondsDeviations = (int[]) bmk0.m105144j(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.mpegFramesBetweenReference == mlltFrame.mpegFramesBetweenReference && this.bytesBetweenReference == mlltFrame.bytesBetweenReference && this.millisecondsBetweenReference == mlltFrame.millisecondsBetweenReference && Arrays.equals(this.bytesDeviations, mlltFrame.bytesDeviations) && Arrays.equals(this.millisecondsDeviations, mlltFrame.millisecondsDeviations)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.mpegFramesBetweenReference) * 31) + this.bytesBetweenReference) * 31) + this.millisecondsBetweenReference) * 31) + Arrays.hashCode(this.bytesDeviations)) * 31) + Arrays.hashCode(this.millisecondsDeviations);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mpegFramesBetweenReference);
        parcel.writeInt(this.bytesBetweenReference);
        parcel.writeInt(this.millisecondsBetweenReference);
        parcel.writeIntArray(this.bytesDeviations);
        parcel.writeIntArray(this.millisecondsDeviations);
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(f7970ID);
        this.mpegFramesBetweenReference = i;
        this.bytesBetweenReference = i2;
        this.millisecondsBetweenReference = i3;
        this.bytesDeviations = iArr;
        this.millisecondsDeviations = iArr2;
    }
}
