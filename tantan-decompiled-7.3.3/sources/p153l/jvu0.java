package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
public final class jvu0 implements Parcelable.Creator<zzdw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdw createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        Bundle bundleCreateBundle = null;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 8:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdw(j, j2, z, strCreateString, strCreateString2, strCreateString3, bundleCreateBundle, strCreateString4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdw[] newArray(int i) {
        return new zzdw[i];
    }
}
