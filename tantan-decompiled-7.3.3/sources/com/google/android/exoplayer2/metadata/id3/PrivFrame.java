package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C1927a();

    /* JADX INFO: renamed from: ID */
    public static final String f7971ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public class C1927a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(Parcel parcel) {
        super(f7971ID);
        this.owner = (String) bmk0.m105144j(parcel.readString());
        this.privateData = (byte[]) bmk0.m105144j(parcel.createByteArray());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (bmk0.m105123c(this.owner, privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.owner;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.privateData);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": owner=" + this.owner;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }

    public PrivFrame(String str, byte[] bArr) {
        super(f7971ID);
        this.owner = str;
        this.privateData = bArr;
    }
}
