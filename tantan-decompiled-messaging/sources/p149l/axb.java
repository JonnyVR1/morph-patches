package p149l;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class axb {
    /* JADX INFO: renamed from: a */
    public byte[] m99397a(List<ywb> list) {
        ArrayList<Bundle> arrayListM164500i = oi3.m164500i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListM164500i);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
