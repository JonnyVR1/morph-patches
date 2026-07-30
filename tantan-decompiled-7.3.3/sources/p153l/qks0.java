package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbjb;

/* JADX INFO: loaded from: classes6.dex */
public final class qks0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        zzfk zzfkVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    zzfkVar = (zzfk) SafeParcelReader.createParcelable(parcel, header, zzfk.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbjb(i, z, i2, z2, i3, zzfkVar, z3, i4, i5, z4, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbjb[i];
    }
}
