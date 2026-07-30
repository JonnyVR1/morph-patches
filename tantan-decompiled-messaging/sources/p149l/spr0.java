package p149l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class spr0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f165877a = 0;

    static {
        spr0.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m185385a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m185386b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        vxq0.m200577a(iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m185387c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
