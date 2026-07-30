package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kkr0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, zzahi.class.getClassLoader());
        return new zzahj(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahj[i];
    }
}
