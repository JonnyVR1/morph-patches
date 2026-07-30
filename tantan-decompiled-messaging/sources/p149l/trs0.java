package p149l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class trs0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f171844a = trs0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m190428a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m190429b(Parcel parcel) {
        return parcel.readHashMap(f171844a);
    }

    /* JADX INFO: renamed from: c */
    public static void m190430c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m190431d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m190432e(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m190433f(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        vxq0.m200577a(iDataAvail);
    }

    /* JADX INFO: renamed from: g */
    public static void m190434g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m190435h(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
