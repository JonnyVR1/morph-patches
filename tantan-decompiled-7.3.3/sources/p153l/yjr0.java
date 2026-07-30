package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzgaa;

/* JADX INFO: loaded from: classes6.dex */
public final class yjr0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        return new zzagz(string, string2, zzgaa.zzk(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzagz[i];
    }
}
