package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahi;

/* JADX INFO: loaded from: classes6.dex */
public final class mkr0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzahi(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahi[i];
    }
}
