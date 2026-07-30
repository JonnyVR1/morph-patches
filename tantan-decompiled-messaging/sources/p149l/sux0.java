package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes6.dex */
public final class sux0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzj(z, z2, strCreateString, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
