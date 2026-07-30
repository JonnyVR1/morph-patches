package p149l;

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
public final class mi3 extends Binder {

    /* JADX INFO: renamed from: b */
    public static final int f133933b;

    /* JADX INFO: renamed from: a */
    public final ImmutableList<Bundle> f133934a;

    static {
        f133933b = vck0.f180948a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public mi3(List<Bundle> list) {
        this.f133934a = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static ImmutableList<Bundle> m154658a(IBinder iBinder) {
        int i;
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
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
                            c2781aBuilder.mo15683a((Bundle) p11.m167011e(parcelObtain2.readBundle()));
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
        return c2781aBuilder.m15702m();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f133934a.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f133933b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f133934a.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
