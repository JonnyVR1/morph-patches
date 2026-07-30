package p149l;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zwb {
    /* JADX INFO: renamed from: a */
    public ImmutableList<ywb> m220581a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return oi3.m164495d(ywb.f200421J, (ArrayList) p11.m167011e(bundle.getParcelableArrayList("c")));
    }
}
