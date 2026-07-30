package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a1u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString = null;
        String strCreateString2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header, LocationRequest.CREATOR);
            } else if (fieldId != 5) {
                switch (fieldId) {
                    case 8:
                        z = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 9:
                        z2 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 10:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 11:
                        z3 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 12:
                        z4 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 13:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 14:
                        j = SafeParcelReader.readLong(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdd(locationRequest, arrayListCreateTypedList, z, z2, strCreateString, z3, z4, strCreateString2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
