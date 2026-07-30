package p149l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kvs0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        Bundle bundleCreateBundle = null;
        zzcei zzceiVar = null;
        ApplicationInfo applicationInfo = null;
        String strCreateString = null;
        ArrayList<String> arrayListCreateStringList = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        zzfjc zzfjcVar = null;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 2:
                    zzceiVar = (zzcei) SafeParcelReader.createParcelable(parcel, header, zzcei.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    zzfjcVar = (zzfjc) SafeParcelReader.createParcelable(parcel, header, zzfjc.CREATOR);
                    break;
                case 11:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbze(bundleCreateBundle, zzceiVar, applicationInfo, strCreateString, arrayListCreateStringList, packageInfo, strCreateString2, strCreateString3, zzfjcVar, strCreateString4, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbze[i];
    }
}
