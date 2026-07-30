package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class wqy0 implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        long j8 = -2147483648L;
        String strCreateString11 = "";
        String strCreateString12 = strCreateString11;
        String strCreateString13 = strCreateString12;
        String strCreateString14 = strCreateString13;
        int i3 = 100;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 14:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 24:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzo(strCreateString, strCreateString2, strCreateString3, strCreateString4, j, j2, strCreateString5, z, z3, j8, strCreateString6, j3, j4, i, z2, z4, strCreateString7, booleanObject, j5, arrayListCreateStringList, strCreateString8, strCreateString11, strCreateString12, strCreateString9, z5, j6, i3, strCreateString13, i2, j7, strCreateString10, strCreateString14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
