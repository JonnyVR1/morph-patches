package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzagc;

/* JADX INFO: loaded from: classes6.dex */
public final class far0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzagc(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzagc[i];
    }
}
