package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C1930a();
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_STRING = 1;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$a */
    public class C1930a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.key = (String) bmk0.m105144j(parcel.readString());
        this.value = (byte[]) bmk0.m105144j(parcel.createByteArray());
        this.localeIndicator = parcel.readInt();
        this.typeIndicator = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.key.hashCode()) * 31) + Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public String toString() {
        String strM105073E;
        int i = this.typeIndicator;
        if (i == 1) {
            strM105073E = bmk0.m105073E(this.value);
        } else if (i != 23) {
            byte[] bArr = this.value;
            strM105073E = i != 67 ? bmk0.m105140h1(bArr) : String.valueOf(bmk0.m105143i1(bArr));
        } else {
            strM105073E = String.valueOf(bmk0.m105137g1(this.value));
        }
        return "mdta: key=" + this.key + ", value=" + strM105073E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeByteArray(this.value);
        parcel.writeInt(this.localeIndicator);
        parcel.writeInt(this.typeIndicator);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C1930a c1930a) {
        this(parcel);
    }
}
