package p153l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class dg60 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static <T> Parcelable.Creator<T> m115630a(eg60<T> eg60Var) {
        return new C16519a(eg60Var);
    }

    /* JADX INFO: renamed from: l.dg60$a */
    public static class C16519a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a */
        public final eg60<T> f88264a;

        public C16519a(eg60<T> eg60Var) {
            this.f88264a = eg60Var;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f88264a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f88264a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f88264a.createFromParcel(parcel, classLoader);
        }
    }
}
