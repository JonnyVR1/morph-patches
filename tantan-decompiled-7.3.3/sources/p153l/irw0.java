package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes6.dex */
public final class irw0 implements Parcelable.Creator<CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String[] strArrCreateStringArray = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        z = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 2:
                        strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, header, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, header, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 6:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 8:
                        z3 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CredentialRequest(i, z, strArrCreateStringArray, credentialPickerConfig, credentialPickerConfig2, z2, strCreateString, strCreateString2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
