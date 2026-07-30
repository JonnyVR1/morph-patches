package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aj3 extends Binder {

    /* JADX INFO: renamed from: b */
    public static final int f71787b;

    /* JADX INFO: renamed from: a */
    public final ImmutableList<Bundle> f71788a;

    static {
        f71787b = bmk0.f77313a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public aj3(List<Bundle> list) {
        this.f71788a = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static ImmutableList<Bundle> m98348a(IBinder iBinder) {
        int i;
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            c2804aBuilder.mo15737a((Bundle) w11.m204369e(parcelObtain2.readBundle()));
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c2804aBuilder.m15756m();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f71788a.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f71787b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f71788a.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
