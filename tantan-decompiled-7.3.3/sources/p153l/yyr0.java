package p153l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class yyr0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f202126a = 0;

    static {
        yyr0.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m218003a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m218004b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        b7r0.m102871a(iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m218005c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
