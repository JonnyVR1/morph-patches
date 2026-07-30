package p153l;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class oyb {
    /* JADX INFO: renamed from: a */
    public byte[] m169836a(List<myb> list) {
        ArrayList<Bundle> arrayListM110059i = cj3.m110059i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListM110059i);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
