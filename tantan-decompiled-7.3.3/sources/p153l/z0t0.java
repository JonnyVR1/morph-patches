package p153l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class z0t0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f202381a = z0t0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m218152a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m218153b(Parcel parcel) {
        return parcel.readHashMap(f202381a);
    }

    /* JADX INFO: renamed from: c */
    public static void m218154c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m218155d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m218156e(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m218157f(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        b7r0.m102871a(iDataAvail);
    }

    /* JADX INFO: renamed from: g */
    public static void m218158g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m218159h(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
