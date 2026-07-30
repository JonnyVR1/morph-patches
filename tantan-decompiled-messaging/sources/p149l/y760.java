package p149l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class y760 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static <T> Parcelable.Creator<T> m213309a(z760<T> z760Var) {
        return new C21331a(z760Var);
    }

    /* JADX INFO: renamed from: l.y760$a */
    public static class C21331a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a */
        public final z760<T> f196683a;

        public C21331a(z760<T> z760Var) {
            this.f196683a = z760Var;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f196683a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f196683a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f196683a.createFromParcel(parcel, classLoader);
        }
    }
}
