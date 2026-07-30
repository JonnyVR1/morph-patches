package p153l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class x5t0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f192526a = x5t0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static Parcelable m209430a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m209431b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        b7r0.m102871a(iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m209432c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m209433d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m209434e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
