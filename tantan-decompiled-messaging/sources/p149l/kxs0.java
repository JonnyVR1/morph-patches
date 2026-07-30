package p149l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kxs0 implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Uri uri = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 4:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, IdToken.CREATOR);
                    break;
                case 5:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Credential(strCreateString, strCreateString2, uri, arrayListCreateTypedList, strCreateString3, strCreateString4, strCreateString5, strCreateString6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }
}
