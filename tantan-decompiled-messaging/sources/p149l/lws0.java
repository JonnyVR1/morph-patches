package p149l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class lws0 {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f130301a = lws0.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m152003a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m152004b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m152005c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
