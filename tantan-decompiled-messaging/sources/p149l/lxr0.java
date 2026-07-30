package p149l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class lxr0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f130430a = lxr0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static Parcelable m152084a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m152085b(Parcel parcel) {
        return parcel.readArrayList(f130430a);
    }

    /* JADX INFO: renamed from: c */
    public static void m152086c(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        vxq0.m200577a(iDataAvail);
    }

    /* JADX INFO: renamed from: d */
    public static void m152087d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m152088e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m152089f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m152090g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
