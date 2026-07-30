package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C1897a();
    public final byte[] data;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public class C1897a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(Parcel parcel) {
        super((String) vck0.m197866j(parcel.readString()));
        this.data = (byte[]) vck0.m197866j(parcel.createByteArray());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f7931id.equals(binaryFrame.f7931id) && Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f7931id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7931id);
        parcel.writeByteArray(this.data);
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }
}
