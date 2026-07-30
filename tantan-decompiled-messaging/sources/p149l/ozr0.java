package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zzd;

/* JADX INFO: loaded from: classes6.dex */
public final class ozr0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzd(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
