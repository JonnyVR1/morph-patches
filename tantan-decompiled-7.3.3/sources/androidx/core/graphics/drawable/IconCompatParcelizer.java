package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1453a = versionedParcel.m4133p(iconCompat.f1453a, 1);
        iconCompat.f1455c = versionedParcel.m4127j(iconCompat.f1455c, 2);
        iconCompat.f1456d = versionedParcel.m4135r(iconCompat.f1456d, 3);
        iconCompat.f1457e = versionedParcel.m4133p(iconCompat.f1457e, 4);
        iconCompat.f1458f = versionedParcel.m4133p(iconCompat.f1458f, 5);
        iconCompat.f1459g = (ColorStateList) versionedParcel.m4135r(iconCompat.f1459g, 6);
        iconCompat.f1461i = versionedParcel.m4137t(iconCompat.f1461i, 7);
        iconCompat.f1462j = versionedParcel.m4137t(iconCompat.f1462j, 8);
        iconCompat.m1310u();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m4141x(true, true);
        iconCompat.m1311v(versionedParcel.m4123f());
        int i = iconCompat.f1453a;
        if (-1 != i) {
            versionedParcel.m4109F(i, 1);
        }
        byte[] bArr = iconCompat.f1455c;
        if (bArr != null) {
            versionedParcel.m4105B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1456d;
        if (parcelable != null) {
            versionedParcel.m4111H(parcelable, 3);
        }
        int i2 = iconCompat.f1457e;
        if (i2 != 0) {
            versionedParcel.m4109F(i2, 4);
        }
        int i3 = iconCompat.f1458f;
        if (i3 != 0) {
            versionedParcel.m4109F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1459g;
        if (colorStateList != null) {
            versionedParcel.m4111H(colorStateList, 6);
        }
        String str = iconCompat.f1461i;
        if (str != null) {
            versionedParcel.m4113J(str, 7);
        }
        String str2 = iconCompat.f1462j;
        if (str2 != null) {
            versionedParcel.m4113J(str2, 8);
        }
    }
}
