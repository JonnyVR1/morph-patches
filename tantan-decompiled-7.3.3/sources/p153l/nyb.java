package p153l;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nyb {
    /* JADX INFO: renamed from: a */
    public ImmutableList<myb> m165317a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return cj3.m110054d(myb.f139357J, (ArrayList) w11.m204369e(bundle.getParcelableArrayList("c")));
    }
}
