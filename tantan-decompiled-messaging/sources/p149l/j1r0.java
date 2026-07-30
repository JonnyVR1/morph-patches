package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes6.dex */
public final class j1r0 implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i = 0;
        CameraPosition cameraPosition = null;
        Float floatObject = null;
        Float floatObject2 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    b = SafeParcelReader.readByte(parcel, header);
                    break;
                case 3:
                    b2 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel, header, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b4 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b5 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b6 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b7 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    b8 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 12:
                    b9 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 13:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    b10 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 15:
                    b11 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 16:
                    floatObject = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 17:
                    floatObject2 = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.readByte(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, floatObject, floatObject2, latLngBounds, b12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
