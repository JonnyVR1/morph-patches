package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes6.dex */
public final class ccr0 implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String strCreateString = null;
        LatLng latLng = null;
        Integer integerObject = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.createParcelable(parcel, header, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 5:
                    integerObject = SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 6:
                    b = SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b2 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b3 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b4 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b5 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.createParcelable(parcel, header, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, strCreateString, latLng, integerObject, b, b2, b3, b4, b5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
