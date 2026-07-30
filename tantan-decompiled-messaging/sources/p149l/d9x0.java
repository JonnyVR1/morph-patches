package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class d9x0 implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f2 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 14:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f5 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MarkerOptions(latLng, strCreateString, strCreateString2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
