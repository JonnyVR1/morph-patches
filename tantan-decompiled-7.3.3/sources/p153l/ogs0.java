package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzbe;

/* JADX INFO: loaded from: classes6.dex */
public final class ogs0 implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbe(bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbe[] newArray(int i) {
        return new zzbe[i];
    }
}
