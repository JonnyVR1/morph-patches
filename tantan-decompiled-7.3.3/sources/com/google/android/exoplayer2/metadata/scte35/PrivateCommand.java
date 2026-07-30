package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p153l.bmk0;
import p153l.ig60;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C1935a();
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public class C1935a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        this.commandBytes = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    /* JADX INFO: renamed from: a */
    public static PrivateCommand m10648a(ig60 ig60Var, int i, long j) {
        long jM139797J = ig60Var.m139797J();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        ig60Var.m139822l(bArr, 0, i2);
        return new PrivateCommand(jM139797J, bArr, j);
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.ptsAdjustment + ", identifier= " + this.identifier + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeByteArray(this.commandBytes);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C1935a c1935a) {
        this(parcel);
    }
}
