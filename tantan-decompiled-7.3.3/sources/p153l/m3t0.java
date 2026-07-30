package p153l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m3t0 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static final zzbyf m156945a(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        zzl zzlVar = null;
        zzq zzqVar = null;
        String strCreateString = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        zzcei zzceiVar = null;
        Bundle bundleCreateBundle2 = null;
        ArrayList<String> arrayListCreateStringList = null;
        Bundle bundleCreateBundle3 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString7 = null;
        zzbjb zzbjbVar = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Bundle bundleCreateBundle4 = null;
        String strCreateString11 = null;
        zzdu zzduVar = null;
        Bundle bundleCreateBundle5 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        String strCreateString15 = null;
        ArrayList<String> arrayListCreateStringList4 = null;
        ArrayList<String> arrayListCreateStringList5 = null;
        String strCreateString16 = null;
        zzbpp zzbppVar = null;
        String strCreateString17 = null;
        Bundle bundleCreateBundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 3:
                    zzlVar = (zzl) SafeParcelReader.createParcelable(parcel, header, zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (zzq) SafeParcelReader.createParcelable(parcel, header, zzq.CREATOR);
                    break;
                case 5:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, header, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, header, PackageInfo.CREATOR);
                    break;
                case 8:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    zzceiVar = (zzcei) SafeParcelReader.createParcelable(parcel, header, zzcei.CREATOR);
                    break;
                case 12:
                    bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 16:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 19:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 21:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 26:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 28:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 29:
                    zzbjbVar = (zzbjb) SafeParcelReader.createParcelable(parcel, header, zzbjb.CREATOR);
                    break;
                case 30:
                    arrayListCreateStringList3 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 31:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 33:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 34:
                    f2 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 35:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 36:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 37:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 41:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 42:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 43:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 44:
                    bundleCreateBundle4 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 45:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 46:
                    zzduVar = (zzdu) SafeParcelReader.createParcelable(parcel, header, zzdu.CREATOR);
                    break;
                case 47:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 48:
                    bundleCreateBundle5 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 49:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 50:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 51:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 52:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 53:
                    arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 54:
                    strCreateString15 = SafeParcelReader.createString(parcel, header);
                    break;
                case 55:
                    arrayListCreateStringList4 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 56:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 57:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 58:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 59:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 60:
                    arrayListCreateStringList5 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 61:
                    strCreateString16 = SafeParcelReader.createString(parcel, header);
                    break;
                case 63:
                    zzbppVar = (zzbpp) SafeParcelReader.createParcelable(parcel, header, zzbpp.CREATOR);
                    break;
                case 64:
                    strCreateString17 = SafeParcelReader.createString(parcel, header);
                    break;
                case 65:
                    bundleCreateBundle6 = SafeParcelReader.createBundle(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbyf(i, bundleCreateBundle, zzlVar, zzqVar, strCreateString, applicationInfo, packageInfo, strCreateString2, strCreateString3, strCreateString4, zzceiVar, bundleCreateBundle2, i2, arrayListCreateStringList, bundleCreateBundle3, z, i3, i4, f, strCreateString5, j, strCreateString6, arrayListCreateStringList2, strCreateString7, zzbjbVar, arrayListCreateStringList3, j2, strCreateString8, f2, z2, i5, i6, z3, strCreateString9, strCreateString10, z4, i7, bundleCreateBundle4, strCreateString11, zzduVar, z5, bundleCreateBundle5, strCreateString12, strCreateString13, strCreateString14, z6, arrayListCreateIntegerList, strCreateString15, arrayListCreateStringList4, i8, z7, z8, z9, arrayListCreateStringList5, strCreateString16, zzbppVar, strCreateString17, bundleCreateBundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m156945a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbyf[i];
    }
}
