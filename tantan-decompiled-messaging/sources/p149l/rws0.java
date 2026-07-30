package p149l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class rws0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f161375a = rws0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static Parcelable m181446a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m181447b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        vxq0.m200577a(iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m181448c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m181449d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m181450e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
