package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzcbp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ozs0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList<String> arrayListCreateStringList = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzcbp(strCreateString, strCreateString2, z, z2, arrayListCreateStringList, z3, z4, arrayListCreateStringList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbp[i];
    }
}
